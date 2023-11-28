package net.takie.takieterra.init;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.takie.takieterra.TakieTerraMod;
import net.takie.takieterra.features.HugePearFeature;
import net.takie.takieterra.features.HugePearFeatureConfig;

public class PearFeatures {
    public static final Feature<HugePearFeatureConfig> HUGE_PEAR = register("huge_pear", new HugePearFeature(HugePearFeatureConfig.CODEC));


    private static <C extends FeatureConfig, F extends Feature<C>> F register(String name, F feature) {
        return Registry.register(Registries.FEATURE, new Identifier(TakieTerraMod.MOD_ID, name), feature);
    }

    public static void init() {
    }
}
