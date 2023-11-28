package net.takie.takieterra.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.tag.convention.v1.ConventionalBiomeTags;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.takie.takieterra.world.TakieTerraPlacedFeatures;

public class TakieTerraTreeGeneration {
    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.SNOWY),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.RED_MAPLE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.SNOWY),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.AMBER_MAPLE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.SNOWY),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.OCHRE_MAPLE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.SAVANNA),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.JACARANDA_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.MANGO_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.BIRCH_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.AUTUMN_ASPEN_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.WALNUT_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.PECAN_TREE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.SWAMP),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.WILLOW_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.SWAMP),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.BALD_CYPRESS_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.SWAMP),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.MOSSY_HEART_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.SNOWY),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.SNOW_GHOST_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.SNOWY),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.WINTER_BLOSSOM_TREE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.TAIGA, BiomeKeys.SNOWY_TAIGA, BiomeKeys.SNOWY_PLAINS, BiomeKeys.SNOWY_SLOPES),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.PINE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.PONDEROSA_PINE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.KNOBCONE_PINE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.RAINBOW_GUM_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.BLUE_GUM_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.MAHOGANY_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.DESERT),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.PALO_VERDE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.FLORAL),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.PLUM_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.FLORAL),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.PEACH_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.SAVANNA),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.ZEBRAWOOD_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.IRONWOOD_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.BIRCH_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.MIMOSA_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.CAMELLIA_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MEADOW),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.CAMELLIA_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.GINKGO_VERDANT_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.GINKGO_GOLDEN_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.SYCAMORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.EBONY_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.SAVANNA),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.LAPACHO_PINK_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.SAVANNA),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.LAPACHO_YELLOW_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.CAMPHOR_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.KAURI_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MEADOW),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.STEWARTIA_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.AUTUMN_STEWARTIA_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.ZELKOVA_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.AUTUMN_ZELKOVA_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.MYRTA_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.YELLOWWOOD_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.CLIMATE_DRY),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.JUNIPER_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.SWEETGUM_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.MOUNTAIN_PEAK),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.FLAMEBARK_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.BEACH),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.INDIKO_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.BEACH),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.SEABREEZE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.FLORAL),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.PURPLE_WISTERIA_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.FLORAL),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.WHITE_WISTERIA_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.FLORAL),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.BLUE_WISTERIA_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.FLORAL),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.PINK_WISTERIA_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.OLD_GROWTH_PINE_TAIGA, BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.REDWOOD_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.WOODED_BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.SEQUOIA_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.BIRCH_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.BEECH_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.LARCH_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.FIR_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.PARASHOREA_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.STONY_SHORES),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.MADRONE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.WITCH_HAZEL_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.CHERRY_GROVE),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.BLACK_CHERRY_TREE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.TOONA_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.DESERT),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.GHAT_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.BLACK_PINE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.CEDAR_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.CHISAI_GREEN_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.CHISAI_GREEN_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.MOUNTAIN),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.CHISAI_RED_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.MOUNTAIN),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.CHISAI_ORANGE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.MOUNTAIN),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.CHISAI_YELLOW_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.CHISAI_RED_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.CHISAI_ORANGE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.CHISAI_YELLOW_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.SWAMP),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.SWAMP_SYLPH_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.CLIMATE_DRY),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.KOBICHA_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.ROYA_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.NEBRA_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.PHOSPORE_BLUE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.PHOSPORE_GREEN_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.PHOSPORE_YELLOW_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.PHOSPORE_PINK_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.ZISSIAN_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.NOMERIA_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.AEGIA_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.SAVANNA),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.CASSIA_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SNOWY_SLOPES, BiomeKeys.SNOWY_PLAINS, BiomeKeys.SNOWY_TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.HOLLY_TREE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.PEONIA_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MEADOW),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.PEONIA_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.CHERRY_GROVE),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.STRAWBERRY_TREE_PLACED_KEY);
    }
}
