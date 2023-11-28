package net.takie.takieterra.block.entity;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.recipe.Recipe;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.takie.takieterra.TakieTerraMod;
import net.takie.takieterra.block.custom.AlloyForgeBlock;
import net.takie.takieterra.recipe.AlloyForgeRecipe;
import net.takie.takieterra.screen.AlloyForgeScreenHandler;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class AlloyForgeBlockEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(4, ItemStack.EMPTY);

    private static final int INPUT_SLOT1 = 0;
    private static final int INPUT_SLOT2 = 1;
    private static final int FLUID_ITEM_SLOT = 2;
    private static final int OUTPUT_SLOT = 3;

    public static final int AlloyForgeProgressBarWidth = 24;
    public static final int AlloyForgeProgressBarHeight = 17;
    public static final int AlloyForgeFuelGaugeWidth = 14;
    public static final int AlloyForgeFuelGaugeHeight = 43;
    public static final int AlloyForgeInventorySize = 4;
    public static final int AlloyForgePropertyDelegateSize = 4;

    private final DefaultedList<ItemStack> Inventory = DefaultedList.ofSize(AlloyForgeInventorySize, ItemStack.EMPTY);

    private final Object2IntOpenHashMap<Identifier> recipesUsed = new Object2IntOpenHashMap<Identifier>();
    protected final PropertyDelegate propertyDelegate;
    private int progress = 0;
    int maxProgress = 200;
    private int fuel = 0;
    private int maxFuel = 100000;
    private static int addFuelAmount = 20000;

    private static final String ProgressPropertyNBTKey = "alloy_forge.progress";
    private static final String FuelPropertyNBTKey = "alloy_forge.fuel";
    private static final String RecipesUsedNBTKey = "alloy_forge.recipesused";

    public static enum AlloyForgeInventorySlots {
        FIRST(0),  // Input slot A
        SECOND(1), // Input slot B
        THIRD(2),  // Output slot
        FOURTH(3); // Fuel slot

        private final int value;

        private AlloyForgeInventorySlots(int value) {
            this.value = value;
        }
    }

    public AlloyForgeBlockEntity(BlockPos pos, BlockState state) {
        super(TakieTerraBlockEntities.ALLOY_FORGE_BLOCK_ENTITY, pos, state);

        this.propertyDelegate = new PropertyDelegate() {
            public int get(int index) {
                return switch (index) {
                    case 0 -> AlloyForgeBlockEntity.this.progress;
                    case 1 -> AlloyForgeBlockEntity.this.maxProgress;
                    case 2 -> AlloyForgeBlockEntity.this.fuel;
                    case 3 -> AlloyForgeBlockEntity.this.maxFuel;
                    default -> 0;
                };
            }

            @Override
            public void set(int index, int value) {
                switch (index) {
                    case 0:
                        AlloyForgeBlockEntity.this.progress = value;
                    case 1:
                        AlloyForgeBlockEntity.this.maxProgress = value;
                    case 2:
                        AlloyForgeBlockEntity.this.fuel = value;
                    case 3:
                        AlloyForgeBlockEntity.this.maxFuel = value;
                }
            }

            @Override
            public int size() {
                return AlloyForgePropertyDelegateSize;
            }
        };
    }

    private void resetProgress() {
        progress = 0;
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return this.Inventory;
    }

    @Override
    public Text getDisplayName() {
        return Text.translatable("container." + TakieTerraMod.MOD_ID + "alloy_forge");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        return new AlloyForgeScreenHandler(syncId, playerInventory, this, propertyDelegate);
    }


    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);

        nbt.putInt(ProgressPropertyNBTKey, progress);
        nbt.putInt(FuelPropertyNBTKey, fuel);
        Inventories.writeNbt(nbt, Inventory);

        NbtCompound nbtCompound = new NbtCompound();
        this.recipesUsed.forEach((identifier, count) -> nbtCompound.putInt(identifier.toString(), (int) count));
        nbt.put(RecipesUsedNBTKey, nbtCompound);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);

        Inventories.readNbt(nbt, Inventory);

        progress = nbt.getInt(ProgressPropertyNBTKey);
        fuel = nbt.getInt(FuelPropertyNBTKey);

        NbtCompound nbtCompound = nbt.getCompound(RecipesUsedNBTKey);
        for (String string : nbtCompound.getKeys()) {
            this.recipesUsed.put(new Identifier(string), nbtCompound.getInt(string));
        }
    }

    public void setLastRecipe(@Nullable Recipe<?> recipe) {
        if (recipe != null) {
            Identifier identifier = recipe.getId();
            this.recipesUsed.addTo(identifier, 1);
        }
    }

    public static <E extends BlockEntity> void tick(World world, BlockPos blockPos, BlockState blockState, AlloyForgeBlockEntity entity) {
        if (world.isClient()) return;

        // If progress is ticking then the block is LIT
        blockState = blockState.with(AlloyForgeBlock.LIT, entity.fuel > 0 || entity.progress > 0);
        world.setBlockState(blockPos, blockState, Block.NOTIFY_ALL);

        checkBucketSlot(entity);

        if (entity.fuel > 0) {
            // decrement fuel counter
            entity.fuel--;
            // handle overflow
        }

        if (hasRecipe(entity) && entity.fuel > 0) {
            entity.progress++;
            markDirty(world, blockPos, blockState);

            if (entity.progress >= entity.maxProgress) {
                craftItem(entity);
            }
        } else {
            entity.resetProgress();
            markDirty(world, blockPos, blockState);
        }
    }

    private static void checkBucketSlot(AlloyForgeBlockEntity entity) {
        ItemStack fuelStack = entity.Inventory.get(AlloyForgeInventorySlots.FOURTH.value);

        if (!fuelStack.isEmpty()) {
            if (fuelStack.isOf(Items.LAVA_BUCKET)) {
                fuelStack.decrement(1);
                entity.Inventory.set(AlloyForgeInventorySlots.FOURTH.value, new ItemStack(Items.BUCKET));

                entity.fuel = Math.min(entity.fuel + addFuelAmount, entity.maxFuel);
            }
        }
    }

    private static boolean hasRecipe(AlloyForgeBlockEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());

        for (int i = 0; i < entity.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        Optional<AlloyForgeRecipe> recipeFromInventory = Objects.requireNonNull(entity.getWorld())
                .getRecipeManager()
                .getFirstMatch(AlloyForgeRecipe.Type.INSTANCE, inventory, entity.getWorld());

        recipeFromInventory.ifPresent(alloyForgeRecipe -> entity.maxProgress = alloyForgeRecipe.getCookingTime());

        return recipeFromInventory.isPresent() &&
                canInsertAmountIntoOutputSlot(inventory) &&
                canInsertItemIntoOutputSlot(inventory, recipeFromInventory.get().getOutput(null).getItem());
    }


    private static void craftItem(AlloyForgeBlockEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());

        for (int i = 0; i < entity.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        Optional<AlloyForgeRecipe> recipeFromInventory = Objects.requireNonNull(entity.getWorld())
                .getRecipeManager()
                .getFirstMatch(AlloyForgeRecipe.Type.INSTANCE, inventory, entity.getWorld());

        if (hasRecipe(entity)) {
            entity.removeStack(AlloyForgeInventorySlots.FIRST.value, 1);
            entity.removeStack(AlloyForgeInventorySlots.SECOND.value, 1);

            entity.setStack(
                    AlloyForgeInventorySlots.THIRD.value,
                    new ItemStack(
                            recipeFromInventory.get().getOutput(null).getItem(),
                            entity.getStack(AlloyForgeInventorySlots.THIRD.value).getCount() + 1
                    )
            );

            entity.setLastRecipe(recipeFromInventory.get());

            entity.resetProgress();
        }
    }
    private static boolean canInsertItemIntoOutputSlot(SimpleInventory inventory, Item output) {
        return inventory.getStack(AlloyForgeInventorySlots.THIRD.value).getItem() == output ||
                inventory.getStack(AlloyForgeInventorySlots.THIRD.value).isEmpty();
    }

    private static boolean canInsertAmountIntoOutputSlot(SimpleInventory inventory) {
        return inventory.getStack(AlloyForgeInventorySlots.THIRD.value).getMaxCount() >
                (inventory.getStack(AlloyForgeInventorySlots.THIRD.value).getCount());
    }

    public void dropExperienceForRecipesUsed(ServerPlayerEntity player) {
        List<Recipe<?>> list = this.getRecipesUsedAndDropExperience(player.getServerWorld(), player.getPos());
        player.unlockRecipes(list);
        this.recipesUsed.clear();
    }

    public List<Recipe<?>> getRecipesUsedAndDropExperience(ServerWorld world, Vec3d pos) {
        ArrayList<Recipe<?>> list = Lists.newArrayList();
        for (Object2IntMap.Entry<Identifier> entry : this.recipesUsed.object2IntEntrySet()) {
            world.getRecipeManager().get((Identifier)entry.getKey()).ifPresent(recipe -> {
                list.add((Recipe<?>)recipe);
                AlloyForgeBlockEntity.dropExperience(world, pos, entry.getIntValue(), ((AlloyForgeRecipe)recipe).getExperience());
            });
        }
        return list;
    }

    private static void dropExperience(ServerWorld world, Vec3d pos, int multiplier, float experience) {
        int amount = MathHelper.floor((float)multiplier * experience);
        float f = MathHelper.fractionalPart((float)multiplier * experience);
        if (f != 0.0f && Math.random() < (double)f) {
            ++amount;
        }
        ExperienceOrbEntity.spawn(world, pos, amount);
    }

}
