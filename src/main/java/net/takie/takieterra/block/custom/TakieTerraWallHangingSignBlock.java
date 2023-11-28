package net.takie.takieterra.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.WallHangingSignBlock;
import net.minecraft.block.WoodType;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.takie.takieterra.block.entity.TakieTerraHangingSignBlockEntity;

public class TakieTerraWallHangingSignBlock extends WallHangingSignBlock {
    public TakieTerraWallHangingSignBlock(Settings settings, WoodType woodType) {
        super(settings, woodType);
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new TakieTerraHangingSignBlockEntity(pos, state);
    }
}
