package net.takie.takieterra.world.gen.tree;

import net.minecraft.block.sapling.LargeTreeSaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.takie.takieterra.world.TakieTerraConfiguredFeatures;
import org.jetbrains.annotations.Nullable;

public class ParashoreaSaplingGenerator extends LargeTreeSaplingGenerator {
        @Override
        @Nullable
        protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
            return null;
        }

        @Override
        @Nullable
        protected RegistryKey<ConfiguredFeature<?, ?>> getLargeTreeFeature(Random random) {
            return TakieTerraConfiguredFeatures.PARASHOREA_KEY;
        }
    }
