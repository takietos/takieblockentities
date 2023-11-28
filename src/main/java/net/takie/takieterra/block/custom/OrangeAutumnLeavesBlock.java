package net.takie.takieterra.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Fertilizable;
import net.minecraft.block.LeavesBlock;
import net.minecraft.client.util.ParticleUtil;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockLocating;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.takie.takieterra.block.TakieTerraTreeBlocks;
import net.takie.takieterra.particle.TakieTerraParticles;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;

public class OrangeAutumnLeavesBlock
        extends LeavesBlock {
    public OrangeAutumnLeavesBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        super.randomDisplayTick(state, world, pos, random);
        if (random.nextInt(10) != 0) {
            return;
        }
        BlockPos blockPos = pos.down();
        BlockState blockState = world.getBlockState(blockPos);
        if (OchreMapleLeavesBlock.isFaceFullSquare(blockState.getCollisionShape(world, blockPos), Direction.UP)) {
            return;
        }
        ParticleUtil.spawnParticle(world, pos, random, TakieTerraParticles.ORANGE_AUTUMN_PARTICLE);
    }
}