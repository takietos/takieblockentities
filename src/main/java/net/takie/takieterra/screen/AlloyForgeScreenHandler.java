package net.takie.takieterra.screen;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ArrayPropertyDelegate;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.takie.takieterra.block.entity.backup.AlloyForgeBlockEntity;
import net.takie.takieterra.screen.renderer.AlloyForgeOutputSlot;

public class AlloyForgeScreenHandler extends ScreenHandler {
    private final Inventory inventory;
    private final PropertyDelegate propertyDelegate;

    public AlloyForgeScreenHandler(int syncId, PlayerInventory playerInventory) {
        this(
                syncId,
                playerInventory,
                new SimpleInventory(AlloyForgeBlockEntity.alloyForgeInventorySize),
                new ArrayPropertyDelegate(AlloyForgeBlockEntity.alloyForgePropertyDelegateSize)
        );
    }

    public AlloyForgeScreenHandler(int syncId, PlayerInventory playerInventory, Inventory inventory, PropertyDelegate delegate) {
        super(TakieTerraScreenHandlers.ALLOY_FORGE_SCREEN_HANDLER, syncId);



        checkSize(inventory, AlloyForgeBlockEntity.alloyForgeInventorySize);
        this.inventory = inventory;
        inventory.onOpen(playerInventory.player);
        this.propertyDelegate = delegate;

        // Inputs
        this.addSlot(new Slot(inventory, 0, 50, 34));
        this.addSlot(new Slot(inventory, 1, 76, 34));

        // Output
        this.addSlot(new AlloyForgeOutputSlot(playerInventory.player, inventory, 2, 136, 35));

        // Lava Bucket Slot
        this.addSlot(new Slot(inventory, 3, 35, 57));

        addPlayerInventory(playerInventory);
        addPlayerHotbar(playerInventory);
        addProperties(delegate);
    }

    @Override
    public ItemStack quickMove(PlayerEntity player, int inventorySlot) {
        ItemStack newStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(inventorySlot);
        if (slot != null && slot.hasStack()) {
            ItemStack originalStack = slot.getStack();
            newStack = originalStack.copy();
            if (inventorySlot < this.inventory.size()) {
                if (!this.insertItem(originalStack, this.inventory.size(), this.slots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.insertItem(originalStack, 0, this.inventory.size(), false)) {
                return ItemStack.EMPTY;
            }

            if (originalStack.isEmpty()) {
                slot.setStack(ItemStack.EMPTY);
            } else {
                slot.markDirty();
            }

            slot.onTakeItem(player, originalStack);
        }

        return newStack;
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return this.inventory.canPlayerUse(player);
    }

    public boolean isCrafting() {
        return propertyDelegate.get(0) > 0;
    }

    public boolean hasFuel() {
        return propertyDelegate.get(2) > 0;
    }

    public int getFuel() {
        return propertyDelegate.get(2);
    }

    /**
     * @return the scaled width of the progress bar based on how much "progress" the alloy smelter has made thus far.
     */
    public int getScaledProgressBar() {
        int result = 0;
        int currentProgress = propertyDelegate.get(0);
        int maxProgress = propertyDelegate.get(1);

        // As long as the current and max progress are non-zero scale the
        // progress bar texture according to how much progress was made
        if (maxProgress != 0 && currentProgress != 0) {
            result = currentProgress * AlloyForgeBlockEntity.alloyForgeProgressBarWidth / maxProgress;
        }

        return  result;
    }

    /**
     * @return the scaled length of the fuel progress bar based on how much fuel is remaining in the smelter.
     */
    public int getScaledFuelGauge() {
        int result = 0;
        int maxProgress = propertyDelegate.get(3);
        int currentProgress = propertyDelegate.get(2);

        // As long as the current and max progress are non-zero, scale the
        // progress bar texture according to how much progress was made
        if (maxProgress != 0 && currentProgress != 0) {
            result = currentProgress * 25 / maxProgress;
        }

        return  result;
    }

    private void addPlayerInventory(PlayerInventory playerInventory) {
        for (int i = 0; i < 3; ++i) {
            for (int l = 0; l < 9; ++l) {
                this.addSlot(new Slot(playerInventory, l + i * 9 + 9, 8 + l * 18, 84 + i * 18));
            }
        }
    }

    private void addPlayerHotbar(PlayerInventory playerInventory) {
        for (int i = 0; i < 9; ++i) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 142));
        }
    }
}