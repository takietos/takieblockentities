package net.takie.takieterra.block.entity.backup;

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
import net.takie.takieterra.block.entity.ImplementedInventory;
import net.takie.takieterra.block.entity.TakieTerraBlockEntities;
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

    public static final int alloyForgeProgressBarWidth = 24;
    public static final int alloyForgeProgressBarHeight = 17;
    public static final int alloyForgeFuelGaugeWidth = 14;
    public static final int alloyForgeFuelGaugeHeight = 43;
    public static final int alloyForgeInventorySize = 4;
    public static final int alloyForgePropertyDelegateSize = 4;

    private final Object2IntOpenHashMap<Identifier> recipesUsed = new Object2IntOpenHashMap<Identifier>();
    protected final PropertyDelegate propertyDelegate;
    private int progress = 0;
    int maxProgress = 200;
    private int Fuel = 0;
    private int MaxFuel = 100000;
    private static int AddFuelAmount = 20000;

    private static final String progressPropertyNBTKey = "alloy_forge.progress";
    private static final String fuelPropertyNBTKey = "alloy_forge.fuel";
    private static final String recipesUsedNBTKey = "alloy_forge.RecipesUsed";

    public AlloyForgeBlockEntity(BlockPos pos, BlockState state) {
        super(TakieTerraBlockEntities.ALLOY_FORGE_BLOCK_ENTITY, pos, state);

        this.propertyDelegate = new PropertyDelegate() {
            public int get(int index) {
                return switch (index) {
                    case 0 -> AlloyForgeBlockEntity.this.progress;
                    case 1 -> AlloyForgeBlockEntity.this.maxProgress;
                    case 2 -> AlloyForgeBlockEntity.this.Fuel;
                    case 3 -> AlloyForgeBlockEntity.this.MaxFuel;
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
                        AlloyForgeBlockEntity.this.Fuel = value;
                    case 3:
                        AlloyForgeBlockEntity.this.MaxFuel = value;
                }
            }

            @Override
            public int size() {
                return alloyForgePropertyDelegateSize;
            }
        };
    }

    private void resetProgress() {
        progress = 0;
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return this.inventory;
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

        nbt.putInt(progressPropertyNBTKey, progress);
        nbt.putInt(fuelPropertyNBTKey, Fuel);
        Inventories.writeNbt(nbt, inventory);

        NbtCompound nbtCompound = new NbtCompound();
        this.recipesUsed.forEach((identifier, count) -> nbtCompound.putInt(identifier.toString(), (int) count));
        nbt.put(recipesUsedNBTKey, nbtCompound);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);

        Inventories.readNbt(nbt, inventory);

        progress = nbt.getInt(progressPropertyNBTKey);
        Fuel = nbt.getInt(fuelPropertyNBTKey);

        NbtCompound nbtCompound = nbt.getCompound(recipesUsedNBTKey);
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
        blockState = blockState.with(AlloyForgeBlock.LIT, entity.Fuel > 0 || entity.progress > 0);
        world.setBlockState(blockPos, blockState, Block.NOTIFY_ALL);

        checkBucketSlot(entity);

        if (entity.Fuel > 0) {
            // decrement fuel counter
            entity.Fuel--;
            // handle overflow
        }

        if (hasRecipe(entity) && entity.Fuel > 0) {
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
        ItemStack fuelStack = entity.inventory.get(2);

        if (!fuelStack.isEmpty()) {
            if (fuelStack.isOf(Items.LAVA_BUCKET)) {
                fuelStack.decrement(1);
                entity.inventory.set(2, new ItemStack(Items.BUCKET));

                entity.Fuel = Math.min(entity.Fuel + AddFuelAmount, entity.MaxFuel);
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
            entity.removeStack(0, 1);
            entity.removeStack(1, 1);

            entity.setStack(
                    3,
                    new ItemStack(
                            recipeFromInventory.get().getOutput(null).getItem(),
                            entity.getStack(3).getCount() + 1
                    )
            );

            entity.setLastRecipe(recipeFromInventory.get());

            entity.resetProgress();
        }
    }
    private static boolean canInsertItemIntoOutputSlot(SimpleInventory inventory, Item output) {
        return inventory.getStack(3).getItem() == output ||
                inventory.getStack(3).isEmpty();
    }

    private static boolean canInsertAmountIntoOutputSlot(SimpleInventory inventory) {
        return inventory.getStack(3).getMaxCount() >
                (inventory.getStack(3).getCount());
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
