package net.takie.takieterra.block.custom;

import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockLocating;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.takie.takieterra.block.TakieTerraTreeBlocks;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class MonsteraVineBlock extends Block {

    public static final DirectionProperty FACING = HorizontalFacingBlock.FACING;
    protected static final VoxelShape SHAPE_NORTH = Block.createCuboidShape(0, 0, 15, 16, 20.0, 16);
    protected static final VoxelShape SHAPE_EAST = Block.createCuboidShape(0.0, 0.0, 0.0, 1.0, 20.0, 16.0);
    protected static final VoxelShape SHAPE_SOUTH = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 20.0, 1.0);
    protected static final VoxelShape SHAPE_WEST = Block.createCuboidShape(15.0, 0.0, 0.0, 16.0, 20.0, 16.0);

    public MonsteraVineBlock(Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)((BlockState)this.stateManager.getDefaultState()).with(FACING, Direction.NORTH));
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, net.minecraft.world.BlockView world, BlockPos pos, ShapeContext context) {
        switch (state.get(FACING)) {
            default: {
                return SHAPE_NORTH;
            }
            case EAST: {
                return SHAPE_EAST;
            }
            case WEST: {
                return SHAPE_WEST;
            }
            case SOUTH:
        }
        return SHAPE_SOUTH;
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return (BlockState)state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}