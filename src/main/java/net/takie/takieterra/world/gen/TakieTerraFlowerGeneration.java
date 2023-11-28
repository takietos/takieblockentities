package net.takie.takieterra.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.tag.convention.v1.ConventionalBiomeTags;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.takie.takieterra.world.TakieTerraPlacedFeatures;

public class TakieTerraFlowerGeneration {

    public static void generateFlowers() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SNOWY_SLOPES, BiomeKeys.SNOWY_PLAINS, BiomeKeys.SNOWY_TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.DRABA_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SNOWY_SLOPES, BiomeKeys.SNOWY_PLAINS, BiomeKeys.SNOWY_TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.PARRAYA_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.SNOWY),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.SHIVER_ROSE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SNOWY_SLOPES, BiomeKeys.SNOWY_PLAINS, BiomeKeys.SNOWY_TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.GLACIER_BUTTERCUP_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SNOWY_SLOPES, BiomeKeys.SNOWY_PLAINS, BiomeKeys.SNOWY_TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.COTTON_GRASS_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SNOWY_SLOPES, BiomeKeys.SNOWY_PLAINS, BiomeKeys.SNOWY_TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.SAXIFRAGE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SNOWY_SLOPES, BiomeKeys.SNOWY_PLAINS, BiomeKeys.SNOWY_TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.COBALT_LUPINE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SNOWY_SLOPES, BiomeKeys.SNOWY_PLAINS, BiomeKeys.SNOWY_TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.MOSS_CAMPION_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.HYDRANGEA_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.TAIGA, BiomeKeys.MEADOW),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.FOXGLOVE_PINK_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.TAIGA, BiomeKeys.MEADOW),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.FOXGLOVE_WHITE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.TAIGA, BiomeKeys.MEADOW),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.FOXGLOVE_YELLOW_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.DANDELION_SEED_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.DANDELION_SEED_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.CLOVER_PATCH_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.WILD_HERBS_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SUNFLOWER_PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.SUNFLOWER_ORNAMENTAL_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SUNFLOWER_PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.SUNFLOWER_ORNAMENTAL_TWO_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SUNFLOWER_PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.SUNFLOWER_ORNAMENTAL_THREE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SUNFLOWER_PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.SUNFLOWER_ORNAMENTAL_FOUR_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SUNFLOWER_PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.SUNFLOWER_ORNAMENTAL_FIVE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SUNFLOWER_PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.SUNFLOWER_ORNAMENTAL_SIX_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MEADOW),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.PANSY_ORANGE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MEADOW),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.PANSY_PINK_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MEADOW),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.PANSY_PURPLE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MEADOW),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.PANSY_WHITE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MEADOW),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.PANSY_RED_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MEADOW),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.LAVENDER_FLOWER_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MEADOW),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.HYACINTH_BLUE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MEADOW),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.HYACINTH_PINK_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MEADOW),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.HYACINTH_PURPLE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MEADOW),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.HYACINTH_WHITE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MEADOW),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.HYACINTH_RED_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.HYACINTH_BLUE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.HYACINTH_PINK_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.HYACINTH_PURPLE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.HYACINTH_WHITE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.HYACINTH_RED_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.CHAMOMILE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.DESERT),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.ALOE_VERA_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.ANTELOPE_BRUSH_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.ANTELOPE_BRUSH_FLOWERING_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.ARROWLEAF_BALSAMROOT_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.DESERT),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.BARREL_CACTUS_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.BARREL_CACTUS_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.BIG_SAGEBRUSH_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.SAGEBRUSH_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.BITTERROOT_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.MARIPOSA_LILY_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.DESERT),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.BLUE_AGAVE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.DESERT),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.PRICKLY_PEAR_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.PRICKLY_PEAR_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.BUNCHGRASS_LARGE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.BUNCHGRASS_TALL_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.BUNCHGRASS_MEDIUM_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.BUNCHGRASS_SMALL_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.WILD_RASPBERRY_BUSH_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.DESERT),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.HUACHUMA_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.DESERT),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.PIPE_ORGAN_CACTUS_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.RABBIT_BRUSH_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.DESERT),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.SOAPTREE_YUCCA_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.SOAPTREE_YUCCA_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST, BiomeKeys.SWAMP),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.MUSHROOM_BLACK_AMANITA_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST, BiomeKeys.SWAMP),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.MUSHROOM_BLUE_OYSTER_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FOREST, BiomeKeys.BIRCH_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.MUSHROOM_CHANTERELLE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST, BiomeKeys.SWAMP),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.MUSHROOM_DEATH_TRUMPET_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST, BiomeKeys.SWAMP),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.MUSHROOM_GREEN_RUSSULA_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FOREST, BiomeKeys.BIRCH_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.MUSHROOM_HONEY_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST, BiomeKeys.SWAMP),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.MUSHROOM_INKY_CAP_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST, BiomeKeys.SWAMP),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.MUSHROOM_LILAC_RUSSULA_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FOREST, BiomeKeys.BIRCH_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.MUSHROOM_MOREL_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FOREST, BiomeKeys.BIRCH_FOREST, BiomeKeys.SWAMP),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.MUSHROOM_ORANGE_CAP_BOLETE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MANGROVE_SWAMP, BiomeKeys.JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.MUSHROOM_PINK_OYSTER_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FOREST, BiomeKeys.BIRCH_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.MUSHROOM_PIXIE_CAP_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST, BiomeKeys.SWAMP),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.MUSHROOM_RED_AMANITA_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST, BiomeKeys.SWAMP),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.MUSHROOM_SHAGGY_MANE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FOREST, BiomeKeys.BIRCH_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.MUSHROOM_YELLOW_OYSTER_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.CAVES),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.MUSHROOM_BRILLIOME_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.HOLLYHOCK_YELLOW_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.HOLLYHOCK_PINK_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.HOLLYHOCK_BLACK_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MEADOW),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.MARIGOLD_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.DELPHINIUM_BLUE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.DELPHINIUM_INDIGO_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.DESERT),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.DUNE_PRIMROSE_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.DESERT),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.GAZANIA_ORANGE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.DESERT),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.GAZANIA_YELLOW_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.DESERT),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.GAZANIA_WHITE_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.DESERT),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.VERBENA_WHITE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.DESERT),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.VERBENA_PINK_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.DESERT),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.VERBENA_YELLOW_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.BLUEBELLS_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MEADOW),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.BLUEBELLS_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SNOWY_SLOPES),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.BLUEBELLS_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.GOLDENROD_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.BROMELIAD_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.PINK_HIBISCUS_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.SNOWY),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.ICY_IRIS_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.CLIMATE_DRY),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.THORNY_BRAMBLE_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.MONSTERA_KEY_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.PARLOUR_PALM_KEY_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.BANANA_TREE_KEY_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.FAN_PALM_KEY_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.FERN_JUNGLE_KEY_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.ARECA_PALM_KEY_PLACED);


        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.SWAMP),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.MONEY_TREE_KEY_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.SWAMP),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.TARO_PLANT_KEY_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.DESERT),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.SNAKE_PLANT_KEY_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.SAVANNA),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.DRAGON_TREE_KEY_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.FERN_DAINTY_KEY_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.FERN_TAIGA_KEY_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.PHOSPORE_SPROUT_BLUE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.PHOSPORE_SPROUT_GREEN_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.PHOSPORE_SPROUT_YELLOW_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.DARK_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.PHOSPORE_SPROUT_PINK_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.BEACH),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.SEA_OATS_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.VIOLET_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.SWAMP),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.WILD_RICE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.SWAMP),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.PINK_DAFFODIL_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.YELLOW_WILDFLOWER_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BADLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.PURPLE_WILDFLOWER_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MEADOW),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.ANEMONE_PURPLE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MEADOW),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.ANEMONE_WHITE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MEADOW),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.ANEMONE_YELLOW_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.ANEMONE_PURPLE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.ANEMONE_WHITE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.ANEMONE_YELLOW_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.GARDENIA_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.CHERRY_GROVE),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.WILD_STRAWBERRY_BUSH_RED_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.CHERRY_GROVE),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.WILD_STRAWBERRY_BUSH_WHITE_PLACED);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.CLIMATE_DRY),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.TAMARISK_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.CLIMATE_DRY),
                GenerationStep.Feature.VEGETAL_DECORATION, TakieTerraPlacedFeatures.TAMARISK_FLOWERING_PLACED_KEY);


    }
}
