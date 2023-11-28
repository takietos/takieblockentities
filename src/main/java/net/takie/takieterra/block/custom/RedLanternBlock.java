package net.takie.takieterra.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.LanternBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class RedLanternBlock extends LanternBlock {
    protected static final VoxelShape STANDING_SHAPE = VoxelShapes.union(Block.createCuboidShape(2.0, 0.0, 2.0, 14.0, 12.0, 14.0));
    protected static final VoxelShape HANGING_SHAPE = VoxelShapes.union(Block.createCuboidShape(2.0, 0.0, 2.0, 14.0, 15.0, 14.0));

    public RedLanternBlock(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return state.get(HANGING) != false ? HANGING_SHAPE : STANDING_SHAPE;
    }
}
