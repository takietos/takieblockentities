package net.takie.takieterra.block.custom.melons;

import net.minecraft.block.AttachedStemBlock;
import net.minecraft.block.GourdBlock;
import net.minecraft.block.StemBlock;
import net.takie.takieterra.block.TakieTerraBlocks;

public class HoneydewMelonBlock extends GourdBlock{
    public HoneydewMelonBlock(Settings settings) {
            super(settings);
        }
        @Override
        public StemBlock getStem() {
            return (StemBlock) TakieTerraBlocks.HONEYDEW_STEM;
        }

        @Override
        public AttachedStemBlock getAttachedStem() {
            return (AttachedStemBlock)TakieTerraBlocks.ATTACHED_HONEYDEW_STEM;
        }
    }