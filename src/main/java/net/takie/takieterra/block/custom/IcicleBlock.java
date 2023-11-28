package net.takie.takieterra.block.custom;

import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockLocating;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.takie.takieterra.block.TakieTerraTreeBlocks;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;

public class IcicleBlock extends HorizontalFacingBlock {

    public IcicleBlock(Settings settings) {
        super(settings);
    }
    protected static final VoxelShape SHAPE = Block.createCuboidShape(0, 0, 0, 16, 16, 16);
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        return !world.isAir(pos.up());
    }
}