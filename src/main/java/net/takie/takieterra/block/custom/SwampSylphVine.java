package net.takie.takieterra.block.custom;

import net.minecraft.block.AbstractPlantStemBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.VineLogic;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.WorldView;
import net.takie.takieterra.block.TakieTerraTreeBlocks;

public class SwampSylphVine extends AbstractPlantStemBlock {
    protected static final VoxelShape SHAPE = Block.createCuboidShape(1.0D, 0.0D, 1.0D, 15.0D, 16.0D, 15.0D);

    public SwampSylphVine(Settings properties) {
        super(properties, Direction.DOWN, SHAPE, false, 0.1D);
    }

    protected int getGrowthLength(Random randomSource) {
        return VineLogic.getGrowthLength(randomSource);
    }

    public Block getPlant() {
            return TakieTerraTreeBlocks.SWAMP_SYLPH_VINES_PLANT;
        }

    public boolean chooseStemState(BlockState state) {
        return state.isAir();
    }

    @Override public boolean canPlaceAt(BlockState state, WorldView levelReader, BlockPos pos) {
        BlockPos blockPos = pos.offset(this.growthDirection.getOpposite());
        BlockState blockState = levelReader.getBlockState(blockPos);
        if(!this.canAttachTo(blockState)) {
            return false;
        }
        else {
            return blockState.isOf(this.getStem()) || blockState.isOf(this.getPlant()) || blockState.isSideSolidFullSquare(levelReader,
                    blockPos,
                    this.growthDirection
            ) || blockState.isIn(BlockTags.LEAVES);
        }
    }
}