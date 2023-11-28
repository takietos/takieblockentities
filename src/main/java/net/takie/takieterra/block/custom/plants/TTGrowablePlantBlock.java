package net.takie.takieterra.block.custom.plants;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;

import java.util.List;

public class TTGrowablePlantBlock extends TTPlantBlock {
    private final TTTallPlantBlock grownPlant;
    public TTGrowablePlantBlock(Settings settings, List<Block> canPlantOnTop, VoxelShape voxelShape, TTTallPlantBlock pGrownPlant) {
        super(settings, canPlantOnTop, voxelShape);
        grownPlant = pGrownPlant;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        if(world.getBlockState(pos.up()).isAir()){
            world.setBlockState(pos, grownPlant.getDefaultState().with(FACING, state.get(FACING)).with(TTTallPlantBlock.HALF, DoubleBlockHalf.LOWER), 3);
            world.setBlockState(pos.up(), grownPlant.getDefaultState().with(FACING, state.get(FACING)).with(TTTallPlantBlock.HALF, DoubleBlockHalf.UPPER), 3);
        }
    }
}
