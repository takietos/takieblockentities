package net.takie.takieterra.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.Fertilizable;
import net.minecraft.block.TallFlowerBlock;
import net.minecraft.block.TallPlantBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

public class TallCactusBlock extends TallPlantBlock implements Fertilizable {

    public TallCactusBlock(Settings settings) {
        super(settings);
    }

    @Override
    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state, boolean isClient) {
        return true;
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        TallFlowerBlock.dropStack((World) world, pos, new ItemStack(this));}

        @Override
        protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
            return floor.isIn(BlockTags.DEAD_BUSH_MAY_PLACE_ON);

    }
}
