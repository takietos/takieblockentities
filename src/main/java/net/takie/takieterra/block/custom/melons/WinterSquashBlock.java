package net.takie.takieterra.block.custom.melons;

import net.minecraft.block.*;
import net.takie.takieterra.block.TakieTerraBlocks;

public class WinterSquashBlock extends GourdBlock{
    public WinterSquashBlock(AbstractBlock.Settings settings) {
            super(settings);
        }
        @Override
        public StemBlock getStem() {
            return (StemBlock) TakieTerraBlocks.SQUASH_STEM;
        }

        @Override
        public AttachedStemBlock getAttachedStem() {
            return (AttachedStemBlock)TakieTerraBlocks.ATTACHED_SQUASH_STEM;
        }
    }