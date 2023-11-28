package net.takie.takieterra.block.custom.plants;

import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

import java.util.List;

public class TTPlantBlock extends PlantBlock implements Fertilizable {
    private final VoxelShape voxelShape;
    private final List<Block> canPlantOnTop;

    public TTPlantBlock(Settings settings, List<Block> canPlantOnTop, VoxelShape pVoxelShape) {
        super(settings);
        this.canPlantOnTop = canPlantOnTop;
        this.voxelShape = pVoxelShape;
        this.setDefaultState((BlockState)((BlockState)this.stateManager.getDefaultState()).with(FACING, Direction.NORTH));
    }

    @Override
    protected boolean canPlantOnTop(BlockState state, BlockView world, BlockPos pos) {
        if (canPlantOnTop.contains(state.getBlock())) {
            if(state.isOf(Blocks.WATER)){
                return !world.getBlockState(pos.down()).isOf(Blocks.WATER);
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

    public BlockState getPlacementState(ItemPlacementContext context) {
        return this.getDefaultState().with(FACING, context.getHorizontalPlayerFacing().getOpposite());
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
        builder.add(FACING);
    }

    @Override
    public boolean isFertilizable(WorldView level, BlockPos pos, BlockState state, boolean isClient) {
        return true;
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        dropStack(world, pos, new ItemStack(this));
    }
}
