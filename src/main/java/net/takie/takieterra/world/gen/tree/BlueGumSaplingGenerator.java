package net.takie.takieterra.world.gen.tree;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.takie.takieterra.world.TakieTerraConfiguredFeatures;
import org.jetbrains.annotations.Nullable;

public class BlueGumSaplingGenerator extends SaplingGenerator {

    @Nullable
    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return TakieTerraConfiguredFeatures.BLUE_GUM_KEY;

    }
}