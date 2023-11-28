package net.takie.takieterra.block.custom.melons;

import net.minecraft.block.AttachedStemBlock;
import net.minecraft.block.GourdBlock;
import net.minecraft.item.Item;

import java.util.function.Supplier;

public class AttachedHoneydewStem extends AttachedStemBlock {
    public AttachedHoneydewStem(GourdBlock gourdBlock, Supplier<Item> pickBlockItem, Settings settings) {
        super(gourdBlock, pickBlockItem, settings);
    }
}
