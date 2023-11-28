package net.takie.takieterra.block.entity.inventory.slot;

import com.mojang.datafixers.util.Pair;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.util.Identifier;
import net.takie.takieterra.TakieTerraMod;
import net.takie.takieterra.block.entity.inventory.ItemStackInventory;

public class CookingPotBowlSlot extends Slot {

    public static final Identifier EMPTY_CONTAINER_SLOT_BOWL = new Identifier(TakieTerraMod.MOD_ID, "item/empty_container_slot_bowl");

    public CookingPotBowlSlot(ItemStackInventory inventory, int index, int x, int y) {
        super(inventory, index, x, y);
    }

    @Environment(value= EnvType.CLIENT)
    @Override
    public Pair<Identifier, Identifier> getBackgroundSprite() {
        return Pair.of(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE, EMPTY_CONTAINER_SLOT_BOWL);
    }

}
