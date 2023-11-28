package net.takie.takieterra.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;
import net.takie.takieterra.world.TakieTerraPlacedFeatures;

public class TakieTerraGeodeGeneration {
    public static void generateGeodes() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.LOCAL_MODIFICATIONS, TakieTerraPlacedFeatures.TITANIUM_QUARTZ_GEODE_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.LOCAL_MODIFICATIONS, TakieTerraPlacedFeatures.ROSE_QUARTZ_GEODE_PLACED);
    }
}
