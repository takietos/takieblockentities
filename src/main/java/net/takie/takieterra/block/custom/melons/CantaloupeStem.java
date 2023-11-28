package net.takie.takieterra.block.custom.melons;

import net.minecraft.block.GourdBlock;
import net.minecraft.block.StemBlock;
import net.minecraft.item.Item;

import java.util.function.Supplier;

public class CantaloupeStem extends StemBlock {
    public CantaloupeStem(GourdBlock gourdBlock, Supplier<Item> pickBlockItem, Settings settings) {
        super(gourdBlock, pickBlockItem, settings);
    }
}
