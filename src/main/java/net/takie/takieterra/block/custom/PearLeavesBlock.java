package net.takie.takieterra.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.Fertilizable;
import net.minecraft.block.LeavesBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

public class PearLeavesBlock extends LeavesBlock implements Fertilizable {
    public PearLeavesBlock(Settings settings) {
        super(settings);
    }

    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state, boolean isClient) {
        return world.getBlockState(pos.down()).isAir();
    }

    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        world.setBlockState(pos.down(), PearBlocks.LAMPEAR.getDefaultState().with(LampearBlock.HANGING, true), 2);
    }
}