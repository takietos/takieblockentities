package net.takie.takieterra.block.custom.melons;

import net.minecraft.block.AttachedStemBlock;
import net.minecraft.block.GourdBlock;
import net.minecraft.item.Item;

import java.util.function.Supplier;

public class AttachedSquashStem extends AttachedStemBlock {
    public AttachedSquashStem(GourdBlock gourdBlock, Supplier<Item> pickBlockItem, Settings settings) {
        super(gourdBlock, pickBlockItem, settings);
    }
}
