package net.takie.takieterra.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

public class TrellisBlock extends HorizontalFacingBlock {
    public static final BooleanProperty CEILING = BooleanProperty.of("ceiling");
    private static final VoxelShape SHAPE_CEILING = Block.createCuboidShape(0, 14, 0, 16, 16, 16);
    private static final VoxelShape SHAPE_SOUTH = Block.createCuboidShape(0, 0, 0, 16, 16, 2);
    private static final VoxelShape SHAPE_NORTH = Block.createCuboidShape(0, 0, 14, 16, 16, 16);
    private static final VoxelShape SHAPE_WEST = Block.createCuboidShape(14, 0, 0, 16, 16, 16);
    private static final VoxelShape SHAPE_EAST = Block.createCuboidShape(0, 0, 0, 2, 16, 16);

    public TrellisBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(CEILING, false).with(FACING, Direction.NORTH));
    }

    @Override
    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockState blockState = ctx.getWorld().getBlockState(ctx.getBlockPos());
        if (ctx.getSide() == Direction.DOWN) {
            return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite())
                    .with(CEILING, true);
        }
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite())
                .with(CEILING, false);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        if (state.get(CEILING)) {
            return SHAPE_CEILING;
        }

        return switch (state.get(FACING)) {
            case SOUTH -> SHAPE_SOUTH;
            case EAST -> SHAPE_EAST;
            case WEST -> SHAPE_WEST;
            default -> SHAPE_NORTH;
        };
    }

    @Override
    protected void appendProperties (StateManager.Builder < Block, BlockState > builder){
        builder.add(CEILING, FACING);
    }
}