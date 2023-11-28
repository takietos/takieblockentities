package net.takie.takieterra.block.custom;

import net.minecraft.block.*;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockLocating;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.takie.takieterra.block.TakieTerraBlocks;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;

public class StoneSapling extends SaplingBlock {

    public StoneSapling(SaplingGenerator generator, Settings settings) {
        super(generator, settings);
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isIn(BlockTags.BASE_STONE_OVERWORLD);
    }
}