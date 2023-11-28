package net.takie.takieterra.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.client.util.ParticleUtil;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.takie.takieterra.particle.TakieTerraParticles;

public class WinterBlossomLeavesBlock
    extends LeavesBlock {
    public WinterBlossomLeavesBlock(Settings settings) {
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
            if (WinterBlossomLeavesBlock.isFaceFullSquare(blockState.getCollisionShape(world, blockPos), Direction.UP)) {
                return;
            }
            ParticleUtil.spawnParticle(world, pos, random, TakieTerraParticles.WINTER_BLOSSOM_SNOW_PARTICLE);
        }
    }
