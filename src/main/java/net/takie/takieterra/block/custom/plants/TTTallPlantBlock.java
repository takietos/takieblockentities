package net.takie.takieterra.block.custom.plants;

import net.minecraft.block.*;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

import java.util.List;

public class TTTallPlantBlock extends TallFlowerBlock {
    private final VoxelShape voxelShape;
    private final List<Block> canPlantOnTop;

    public TTTallPlantBlock(Settings settings, List<Block> canPlantOnTop, VoxelShape voxelShape) {
        super(settings);
        this.canPlantOnTop = canPlantOnTop;
        this.voxelShape = voxelShape;
        this.setDefaultState((BlockState)((BlockState)this.stateManager.getDefaultState()).with(FACING, Direction.NORTH));
    }

    @Override
    protected boolean canPlantOnTop(BlockState state, BlockView world, BlockPos pos) {
        if (canPlantOnTop.contains(state.getBlock())) {
            if(state.isOf(Blocks.DIRT)){
                return !world.getBlockState(pos.down()).isOf(Blocks.DIRT);
            }
            return true;
        }
        return super.canPlantOnTop(state, world, pos);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Vec3d vec3 = state.getModelOffset(world, pos);
        return voxelShape.offset(vec3.x, vec3.y, vec3.z);
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pPos, Entity entity) {
        double d0 = Math.abs(entity.getVelocity().y);
        if (d0 < 0.1D && !entity.bypassesSteppingEffects()) {
            double d1 = 0.4D + d0 * 0.8D;
            entity.setVelocity(entity.getVelocity().multiply(d1, 1.0D, d1));
        }

        super.onEntityCollision(state, world, pPos, entity);
    }

    public BlockState getPlacementState(ItemPlacementContext context) {
        if(context.getBlockPos().getY() < context.getWorld().getTopY() - 1 && context.getWorld().getBlockState(context.getBlockPos().up()).canReplace(context)){
            return this.getDefaultState().with(FACING, context.getHorizontalPlayerFacing().getOpposite());
        }
        return null;
    }

    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    //FACING
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    protected void appendProperties (StateManager.Builder < Block, BlockState > builder){
        builder.add(FACING, HALF);
    }

}
