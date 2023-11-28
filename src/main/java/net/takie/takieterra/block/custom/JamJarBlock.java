package net.takie.takieterra.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class JamJarBlock extends Block {
    public JamJarBlock(Settings settings) {
        super(settings);
    }
    protected static final VoxelShape SHAPE = Block.createCuboidShape(0.3125, 0, 0.3125, 0.6875, 0.5, 0.6875);

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Vec3d vec3d = state.getModelOffset(world, pos);
        return SHAPE.offset(vec3d.x, vec3d.y, vec3d.z);
    }
}
