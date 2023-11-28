package net.takie.takieterra.block.custom;

import net.minecraft.block.AbstractPlantBlock;
import net.minecraft.block.AbstractPlantStemBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.WorldView;

public class CassiaVinePlant extends AbstractPlantBlock {
    public static final VoxelShape SHAPE = Block.createCuboidShape(1.0D, 0.0D, 1.0D, 15.0D, 16.0D, 15.0D);
    public Block headBlock;

    public CassiaVinePlant(Settings properties, Block headBlock) {
        super(properties, Direction.DOWN, SHAPE, false);
        this.headBlock = headBlock;
    }

    protected AbstractPlantStemBlock getStem() {
        return (AbstractPlantStemBlock) headBlock;
    }

    @Override public boolean canPlaceAt(BlockState state, WorldView levelReader, BlockPos pos) {
        BlockPos blockPos = pos.offset(this.growthDirection.getOpposite());
        BlockState blockState = levelReader.getBlockState(blockPos);
        if(!this.canAttachTo(blockState)) {
            return false;
        }
        else {
            return blockState.isOf(this.getPlant()) || blockState.isOf(this.getStem()) || blockState.isSideSolidFullSquare(levelReader,
                    blockPos,
                    this.growthDirection
            ) || blockState.isIn(BlockTags.LEAVES);
        }
    }
}