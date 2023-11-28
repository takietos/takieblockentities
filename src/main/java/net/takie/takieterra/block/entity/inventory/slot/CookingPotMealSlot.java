package net.takie.takieterra.block.entity.inventory.slot;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;
import net.takie.takieterra.block.entity.inventory.ItemStackInventory;

public class CookingPotMealSlot extends Slot {

    public CookingPotMealSlot(ItemStackInventory inventory, int index, int xPosition, int yPosition) {
        super(inventory, index, xPosition, yPosition);
    }

    @Override
    public boolean canInsert(ItemStack stack) {
        return false;
    }

    @Override
    public boolean canTakeItems(PlayerEntity playerIn) {
        return false;
    }

    @Override
    public int getMaxItemCount(ItemStack stack) {
        return getMaxItemCount();
    }

}
