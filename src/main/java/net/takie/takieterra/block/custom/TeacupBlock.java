package net.takie.takieterra.block.custom;

import net.minecraft.block.*;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

public class TeacupBlock extends Block {
    public static final IntProperty CUPS = IntProperty.of("cups", 1, 3);
    protected static final VoxelShape ONE_CUP_SHAPE = Block.createCuboidShape(4.0, 0.0, 5.0, 12.0, 6.0, 12.0);
    protected static final VoxelShape TWO_CUPS_SHAPE = Block.createCuboidShape(1.0, 0.0, 0.0, 16.0, 6.0, 16.0);
    protected static final VoxelShape THREE_CUPS_SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 6.0, 16.0);

    public TeacupBlock(AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)((BlockState)this.stateManager.getDefaultState()).with(CUPS, 1));
    }

    @Override
    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockState blockState = ctx.getWorld().getBlockState(ctx.getBlockPos());
        if (blockState.isOf(this)) {
            return (BlockState)blockState.with(CUPS, Math.min(3, blockState.get(CUPS) + 1));
        }
        return (BlockState)super.getPlacementState(ctx);
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockPos blockPos = pos.down();
        return true;
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (!state.canPlaceAt(world, pos)) {
            return Blocks.AIR.getDefaultState();
        }
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public boolean canReplace(BlockState state, ItemPlacementContext context) {
        if (!context.shouldCancelInteraction() && context.getStack().isOf(this.asItem()) && state.get(CUPS) < 3) {
            return true;
        }
        return super.canReplace(state, context);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        switch (state.get(CUPS)) {
            default: {
                return ONE_CUP_SHAPE;
            }
            case 2: {
                return TWO_CUPS_SHAPE;
            }
            case 3:
        }
        return THREE_CUPS_SHAPE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(CUPS);
    }
}
