package net.takie.takieterra.block.custom;

import net.minecraft.block.*;
import net.minecraft.fluid.Fluids;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.takie.takieterra.block.TakieTerraBlocks;

public class BuddingTitaniumQuartzBlock
        extends AmethystBlock {
    public static final int GROW_CHANCE = 5;
    private static final Direction[] DIRECTIONS = Direction.values();

    public BuddingTitaniumQuartzBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (random.nextInt(5) != 0) {
            return;
        }
        Direction direction = DIRECTIONS[random.nextInt(DIRECTIONS.length)];
        BlockPos blockPos = pos.offset(direction);
        BlockState blockState = world.getBlockState(blockPos);
        Block block = null;
        if (BuddingTitaniumQuartzBlock.canGrowIn(blockState)) {
            block = TakieTerraBlocks.SMALL_TITANIUM_QUARTZ_BUD;
        } else if (blockState.isOf(TakieTerraBlocks.SMALL_TITANIUM_QUARTZ_BUD) && blockState.get(TitaniumQuartzClusterBlock.FACING) == direction) {
            block = TakieTerraBlocks.MEDIUM_TITANIUM_QUARTZ_BUD;
        } else if (blockState.isOf(TakieTerraBlocks.MEDIUM_TITANIUM_QUARTZ_BUD) && blockState.get(TitaniumQuartzClusterBlock.FACING) == direction) {
            block = TakieTerraBlocks.LARGE_TITANIUM_QUARTZ_BUD;
        } else if (blockState.isOf(TakieTerraBlocks.LARGE_TITANIUM_QUARTZ_BUD) && blockState.get(TitaniumQuartzClusterBlock.FACING) == direction) {
            block = TakieTerraBlocks.TITANIUM_QUARTZ_CLUSTER;
        }
        if (block != null) {
            BlockState blockState2 = (BlockState)((BlockState)block.getDefaultState().with(TitaniumQuartzClusterBlock.FACING, direction)).with(TitaniumQuartzClusterBlock.WATERLOGGED, blockState.getFluidState().getFluid() == Fluids.WATER);
            world.setBlockState(blockPos, blockState2);
        }
    }

    public static boolean canGrowIn(BlockState state) {
        return state.isAir() || state.isOf(Blocks.WATER) && state.getFluidState().getLevel() == 8;
    }
}
