package net.takie.takieterra.screen;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.ArrayPropertyDelegate;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.slot.Slot;
import net.takie.takieterra.block.TTComplexBlocks;
import net.takie.takieterra.block.TakieTerraBlocks;
import net.takie.takieterra.block.entity.CookingPotBlockEntity;
import net.takie.takieterra.block.entity.inventory.slot.CookingPotBowlSlot;
import net.takie.takieterra.block.entity.inventory.slot.CookingPotMealSlot;
import net.takie.takieterra.block.entity.inventory.slot.CookingPotResultSlot;

import java.util.Objects;

public class CookingPotScreenHandler extends ScreenHandler {

    private static final int INV_INDEX_MEAL_DISPLAY = 6;
    private static final int INV_INDEX_CONTAINER_INPUT = INV_INDEX_MEAL_DISPLAY + 1;
    private static final int INV_INDEX_OUTPUT = INV_INDEX_CONTAINER_INPUT + 1;
    private static final int INV_INDEX_START_PLAYER_INV = INV_INDEX_OUTPUT + 1;
    private static final int INV_INDEX_END_PLAYER_INV = INV_INDEX_START_PLAYER_INV + 36;

    public final CookingPotBlockEntity tileEntity;
    private final PropertyDelegate cookingPotData;
    private final ScreenHandlerContext canInteractWithCallable;

    public CookingPotScreenHandler(final int windowId, final PlayerInventory playerInventory, final CookingPotBlockEntity blockEntity, PropertyDelegate cookingPotDataIn) {
        super(TTScreenType.COOKING_POT.get(), windowId);
        this.tileEntity = blockEntity;
        this.cookingPotData = cookingPotDataIn;
        this.canInteractWithCallable = ScreenHandlerContext.create(blockEntity.getWorld(), blockEntity.getPos());

        // Ingredient Slots - 2 Rows x 3 Columns
        int startX = 8;
        int startY = 18;
        int inputStartX = 30;
        int inputStartY = 17;
        int borderSlotSize = 18;
        for (int row = 0; row < 2; ++row) {
            for (int column = 0; column < 3; ++column) {
                addSlot(new Slot(tileEntity, (row * 3) + column,
                        inputStartX + (column * borderSlotSize),
                        inputStartY + (row * borderSlotSize)));
            }
        }

        // Meal Display
        addSlot(new CookingPotMealSlot(tileEntity, 6, 124, 26));

        // Bowl Input
        addSlot(new CookingPotBowlSlot(tileEntity, 7, 92, 55));

        // Bowl Output
        addSlot(new CookingPotResultSlot(playerInventory.player, blockEntity, 8, 124, 55));

        // Main Player Inventory
        int startPlayerInvY = startY * 4 + 12;
        for (int row = 0; row < 3; ++row) {
            for (int column = 0; column < 9; ++column) {
                addSlot(new Slot(playerInventory, 9 + (row * 9) + column, startX + (column * borderSlotSize),
                        startPlayerInvY + (row * borderSlotSize)));
            }
        }

        // Hot-bar
        for (int column = 0; column < 9; ++column) {
            addSlot(new Slot(playerInventory, column, startX + (column * borderSlotSize), 142));
        }

        addProperties(cookingPotDataIn);
    }

    public CookingPotScreenHandler(final int windowId, final PlayerInventory playerInventory, final PacketByteBuf data) {
        this(windowId, playerInventory, getBlockEntity(playerInventory, data), new ArrayPropertyDelegate(4));
    }

    private static CookingPotBlockEntity getBlockEntity(final PlayerInventory playerInventory, final PacketByteBuf data) {
        Objects.requireNonNull(playerInventory, "playerInventory cannot be null");
        Objects.requireNonNull(data, "data cannot be null");
        final BlockEntity tileAtPos = playerInventory.player.getWorld().getBlockEntity(data.readBlockPos());

        if (tileAtPos instanceof CookingPotBlockEntity cookingPotBlockEntity) {
            return cookingPotBlockEntity;
        }

        throw new IllegalStateException("Tile entity is not correct! " + tileAtPos);
    }

    @Override
    public boolean canUse(PlayerEntity playerIn) {
        return canUse(canInteractWithCallable, playerIn, TTComplexBlocks.COOKING_POT.get());
    }

    @Override
    public ItemStack quickMove(PlayerEntity playerIn, int index) {
        if (index > slots.size() - 1) {
            return ItemStack.EMPTY;
        }

        ItemStack itemStack = ItemStack.EMPTY;
        Slot slot = slots.get(index);
        if (slot.hasStack()) {
            ItemStack slotItemStack = slot.getStack();
            itemStack = slotItemStack.copy();
            if (index == INV_INDEX_OUTPUT) {
                if (!insertItem(slotItemStack, INV_INDEX_START_PLAYER_INV, INV_INDEX_END_PLAYER_INV, true)) {
                    return ItemStack.EMPTY;
                }
            } else if (index > INV_INDEX_OUTPUT) {
                if ((slotItemStack.getItem() == Items.BOWL && !insertItem(slotItemStack, INV_INDEX_CONTAINER_INPUT, INV_INDEX_OUTPUT, false))
                        || !insertItem(slotItemStack, 0, INV_INDEX_MEAL_DISPLAY, false)
                        || !insertItem(slotItemStack, INV_INDEX_CONTAINER_INPUT, INV_INDEX_OUTPUT, false)) {
                    return ItemStack.EMPTY;
                }
            } else if (!insertItem(slotItemStack, INV_INDEX_START_PLAYER_INV, INV_INDEX_END_PLAYER_INV, false)) {
                return ItemStack.EMPTY;
            }

            if (slotItemStack.isEmpty()) {
                slot.setStack(ItemStack.EMPTY);
            } else {
                slot.markDirty();
            }

            if (slotItemStack.getCount() == itemStack.getCount()) {
                return ItemStack.EMPTY;
            }

            slot.onTakeItem(playerIn, slotItemStack);
        }

        return itemStack;
    }

    @Environment(value= EnvType.CLIENT)
    public int getCookProgressionScaled() {
        int i = cookingPotData.get(0);
        int j = cookingPotData.get(1);
        return j != 0 && i != 0 ? i * 24 / j : 0;
    }

    @Environment(value= EnvType.CLIENT)
    public boolean isHeated() {
        return tileEntity.isHeated();
    }

}