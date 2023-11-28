package net.takie.takieterra.init;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.HugeMushroomFeatureConfig;
import net.minecraft.world.gen.feature.SingleStateFeatureConfig;
import net.takie.takieterra.TakieTerraMod;
import net.takie.takieterra.features.*;

public class TakieTerraFeatures {
    public static final Feature<HugeMushroomFeatureConfig> PHOSPORE = register("phospore_feature", new PhosporeFeature(HugeMushroomFeatureConfig.CODEC));

    private static <C extends FeatureConfig, F extends Feature<C>> F register(String name, F feature) {
        return Registry.register(Registries.FEATURE, new Identifier(TakieTerraMod.MOD_ID, name), feature);
    }

    public static void init() {
    }
}
