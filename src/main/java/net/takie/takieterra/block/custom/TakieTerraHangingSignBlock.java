package net.takie.takieterra.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.HangingSignBlock;
import net.minecraft.block.WoodType;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.takie.takieterra.block.entity.TakieTerraHangingSignBlockEntity;

public class TakieTerraHangingSignBlock extends HangingSignBlock {
    public TakieTerraHangingSignBlock(Settings settings, WoodType woodType) {
        super(settings, woodType);
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new TakieTerraHangingSignBlockEntity(pos, state);
    }
}
