package net.takie.takieterra.block.entity.backup;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
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
import net.takie.takieterra.block.entity.ImplementedInventory;
import net.takie.takieterra.block.entity.TakieTerraBlockEntities;
import net.takie.takieterra.item.TakieTerraItems;
import net.takie.takieterra.recipe.WoodworkerBlockRecipe;
import net.takie.takieterra.screen.WoodworkerBlockScreenHandler;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class WoodworkerBlockEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(4, ItemStack.EMPTY);

    private static final int INPUT_SLOT1 = 0;
    private static final int INPUT_SLOT2 = 1;
    private static final int PAINT_SLOT = 2;
    private static final int OUTPUT_SLOT = 3;

    public static final int WoodworkerBlockProgressBarWidth = 28;
    public static final int WoodworkerBlockProgressBarHeight = 21;
    public static final int WoodworkerBlockFuelGaugeWidth = 8;
    public static final int WoodworkerBlockFuelGaugeHeight = 41;
    public static final int WoodworkerBlockInventorySize = 4;
    public static final int WoodworkerBlockPropertyDelegateSize = 4;

    private final DefaultedList<ItemStack> Inventory = DefaultedList.ofSize(WoodworkerBlockInventorySize, ItemStack.EMPTY);

    private final Object2IntOpenHashMap<Identifier> recipesUsed = new Object2IntOpenHashMap<Identifier>();
    protected final PropertyDelegate propertyDelegate;
    private int progress = 0;
    int maxProgress = 200;
    private int Fuel = 0;
    private int MaxFuel = 100000;
    private static int AddFuelAmount = 20000;

    private static final String ProgressPropertyNBTKey = "woodworker_block.progress";
    private static final String FuelPropertyNBTKey = "woodworker_block.fuel";
    private static final String RecipesUsedNBTKey = "woodworker_block.recipesused";

    public WoodworkerBlockEntity(BlockPos pos, BlockState state) {
        super(TakieTerraBlockEntities.WOODWORKER_BLOCK_ENTITY, pos, state);

        this.propertyDelegate = new PropertyDelegate() {
            public int get(int index) {
                return switch (index) {
                    case 0 -> WoodworkerBlockEntity.this.progress;
                    case 1 -> WoodworkerBlockEntity.this.maxProgress;
                    case 2 -> WoodworkerBlockEntity.this.Fuel;
                    case 3 -> WoodworkerBlockEntity.this.MaxFuel;
                    default -> 0;
                };
            }

            @Override
            public void set(int index, int value) {
                switch (index) {
                    case 0:
                        WoodworkerBlockEntity.this.progress = value;
                    case 1:
                        WoodworkerBlockEntity.this.maxProgress = value;
                    case 2:
                        WoodworkerBlockEntity.this.Fuel = value;
                    case 3:
                        WoodworkerBlockEntity.this.MaxFuel = value;
                }
            }

            @Override
            public int size() {
                return WoodworkerBlockPropertyDelegateSize;
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
        return Text.translatable("container." + TakieTerraMod.MOD_ID + "woodworking_bench");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        return new WoodworkerBlockScreenHandler(syncId, playerInventory, this, propertyDelegate);
    }


    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);

        nbt.putInt(ProgressPropertyNBTKey, progress);
        nbt.putInt(FuelPropertyNBTKey, Fuel);
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
        Fuel = nbt.getInt(FuelPropertyNBTKey);

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

    public static <E extends BlockEntity> void tick(World world, BlockPos blockPos, BlockState blockState, WoodworkerBlockEntity entity) {
        if (world.isClient()) return;

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

    private static void checkBucketSlot(WoodworkerBlockEntity entity) {
        ItemStack fuelStack = entity.Inventory.get(2);

        if (!fuelStack.isEmpty()) {
            if (fuelStack.isOf(TakieTerraItems.PAINT_BUCKET)) {
                fuelStack.decrement(1);
                entity.Inventory.set(2, new ItemStack(Items.BUCKET));

                entity.Fuel = Math.min(entity.Fuel + AddFuelAmount, entity.MaxFuel);
            }
        }
    }

    private static boolean hasRecipe(WoodworkerBlockEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());

        for (int i = 0; i < entity.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        Optional<WoodworkerBlockRecipe> recipeFromInventory = Objects.requireNonNull(entity.getWorld())
                .getRecipeManager()
                .getFirstMatch(WoodworkerBlockRecipe.Type.INSTANCE, inventory, entity.getWorld());

        recipeFromInventory.ifPresent(woodworkerBlockRecipe -> entity.maxProgress = woodworkerBlockRecipe.getCookingTime());

        return recipeFromInventory.isPresent() &&
                canInsertAmountIntoOutputSlot(inventory) &&
                canInsertItemIntoOutputSlot(inventory, recipeFromInventory.get().getOutput(null).getItem());
    }


    private static void craftItem(WoodworkerBlockEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());

        for (int i = 0; i < entity.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        Optional<WoodworkerBlockRecipe> recipeFromInventory = Objects.requireNonNull(entity.getWorld())
                .getRecipeManager()
                .getFirstMatch(WoodworkerBlockRecipe.Type.INSTANCE, inventory, entity.getWorld());

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
                WoodworkerBlockEntity.dropExperience(world, pos, entry.getIntValue(), ((WoodworkerBlockRecipe)recipe).getExperience());
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