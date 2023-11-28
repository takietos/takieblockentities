package net.takie.takieterra.util;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.takie.takieterra.TakieTerraMod;

public enum TTSoundEvents {
    BLOCK_STOVE_CRACKLE("block.stove.crackle"),

    BLOCK_COOKING_POT_BOIL_SOUP("block.cooking_pot.boil_soup"),
    BLOCK_COOKING_POT_BOIL("block.cooking_pot.boil"),

    BLOCK_CUTTING_BOARD_KNIFE("block.cutting_board.knife"),

    BLOCK_CABINET_OPEN("block.cabinet.open"),
    BLOCK_CABINET_CLOSE("block.cabinet.close"),

    BLOCK_SKILLET_SIZZLE("block.skillet.sizzle"),
    BLOCK_SKILLET_ADD_FOOD("block.skillet.add_food"),
    ITEM_SKILLET_ATTACK_STRONG("item.skillet.attack.strong"),
    ITEM_SKILLET_ATTACK_WEAK("item.skillet.attack.weak");

    private final String pathName;
    private final SoundEvent soundEvent;

    TTSoundEvents(String pathName) {
        this.pathName = pathName;
        this.soundEvent = SoundEvent.of(new Identifier(TakieTerraMod.MOD_ID, this.pathName));
    }

    public static void registerAll() {
        for (TTSoundEvents value : values()) {
            Registry.register(Registries.SOUND_EVENT, new Identifier(TakieTerraMod.MOD_ID, value.pathName), value.soundEvent);
        }
    }

    public SoundEvent get() {
        return soundEvent;
    }

}
