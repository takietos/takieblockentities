package net.takie.takieterra.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.tag.convention.v1.ConventionalBiomeTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.takie.takieterra.world.TakieTerraPlacedFeatures;

public class TakieTerraOreGeneration {
    public static void generateOres() {

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.BADLANDS),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.OPAL_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.DESERT),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.SEA_OPAL_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.AMETRINE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.AMBER_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.CLIMATE_HOT),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.BLOODSTONE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.BISMUTH_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.BADLANDS),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.FIRE_AGATE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.CLIMATE_COLD),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.CELESTITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.HOWLITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.CLIMATE_WET),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.HYDITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.CLIMATE_HOT),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.IRIS_AGATE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.CLIMATE_COLD),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.KYANITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.LABRADORITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.FANTASY_PEARLITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.WHITE_PEARLITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.SEASHELL_PEARLITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.JUNGLE),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.LARIMAR_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.LIDDICOATITE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.GREEN_LIDDICOATITE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.PINK_LIDDICOATITE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.MOUNTAIN),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.MALACHITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.DESERT),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.MOONSTONE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.CLIMATE_COLD),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.MOONSTONE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.CLIMATE_COLD),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.ANGELITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.JUNGLE),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.ORANGE_CALCITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.FOREST),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.PERIDOT_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.TREE_DECIDUOUS),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.LUSEDITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.MOUNTAIN),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.RUBY_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.SAVANNA),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.RUBY_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.DESERT),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.SAPPHIRE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.JUNGLE),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.TANZANITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.SAVANNA),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.TOPAZ_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.SNOWFLAKE_OBSIDIAN_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.CLIMATE_WET),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.TURQUOISE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.NEBULITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.STARINITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.CLIMATE_DRY),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.APATITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.CLIMATE_WET),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.RHODOCHROSITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.CLIMATE_TEMPERATE),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.NEPHRITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.CLIMATE_TEMPERATE),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.CITRINE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.CLIMATE_HOT),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.CINNABAR_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.JUNGLE),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.RAINFOREST_JASPER_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.SNOWY),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.CHALCEDONY_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.BEACH),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.COQUINA_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.DESERT),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.COQUINA_DESERT_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.AURANITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.SUGILITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.BRECCIA_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.LIMESTONE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.CLIMATE_COLD),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.COOL_GRANITE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.CLIMATE_HOT),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.WARM_GRANITE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.DACITE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.DARK_SYENITE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.PALE_SYENITE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.DUNITE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.MOUNTAIN),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.GNEISS_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.FLORAL),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.HUANITE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.WINDSWEPT),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.PEGMATITE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.BADLANDS),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.ROANITE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.BADLANDS),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.TONGITE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.BADLANDS),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.WAVE_DOLOMITE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.BADLANDS),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.ARKOSE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.RUSSET_SCORIA_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.SCORIA_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.SLATE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.KAOLIN_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.AEGIRINE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.AMPHIBOLITE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.ARGILLITE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.ONYX_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.TAIGA),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.BLUE_SPOT_JASPER_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.MOUNTAIN),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.ALMANDINE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.JUNGLE),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.AMAZONITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.SNOWY),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.BORNITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.CLIMATE_HOT),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.CARNELIAN_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.CHALCOPYRITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.BLUESCHIST_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.BADLANDS),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.CHIASTOLITE_CROSS_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.DESERT),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.CHIASTOLITE_TIGER_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.CHRYSOCOLLA_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.CITRON_CHRYSOPRASE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.CLAYSTONE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.CLIMATE_HOT),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.CLINOHUMITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.CLIMATE_WET),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.DIOPTASE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.DOLERITE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.DOLOMITE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.DUMORTIERTITE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.DUMORTIERTITE_BLUE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.MOUNTAIN),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.EUDIALYTE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.FOREST),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.FUCHSITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.GABBRO_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.GARNET_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.CLIMATE_COLD),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.GLAUCOPHANE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.STONY_SHORES),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.GNEISS_MARINE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.WACKE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.FOREST),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.GREENSTONE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.DESERT),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.HEMIMORPHITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.WINDSWEPT),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.HORNFELS_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.SAVANNA),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.IOLITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.SAVANNA),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.LEPIDOLITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.LABRADORITE_MIDNIGHT_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.CLIMATE_HOT),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.LAZULITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.MOUNTAIN),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.MIGMATITE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.SAVANNA),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.MONZONITE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.BIRCH_FOREST),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.MORGANITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.MUSCOVITE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.NOVACULITE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.CLIMATE_COLD),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.NOVACULITE_GRAY_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.MOUNTAIN),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.NOVACULITE_OLIVE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.CLIMATE_HOT),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.NOVACULITE_RED_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.OLIVINE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.ORTHOCLASE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.PHYLLITE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.CLIMATE_TEMPERATE),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.PINK_CORUNDUM_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.CLIMATE_TEMPERATE),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.PREHNITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.PYRITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.BIRCH_FOREST),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.PYROMORPHITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.WINDSWEPT),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.RED_CHERT_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.RHYOLITE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.SHALE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.CLIMATE_TEMPERATE),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.SIDERITE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.SILTSTONE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.SWAMP),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.SKARN_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.SNOWY),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.SNOW_QUARTZ_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.SOAPSTONE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.SOVITE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.SWAMP),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.SERPENTINITE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.JUNGLE),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.TITANITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.CLIMATE_HOT),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.SUNSTONE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.THORITE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.CLIMATE_WET),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.TIDE_STONE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.TRACHYTE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.DESERT),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.TRAVERTINE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.TAIGA),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.VARISCITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.VIOLANE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.SAVANNA),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.YOWAH_OPAL_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.MARBLE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.JET_MARBLE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.CLIMATE_COLD),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.PETRIFIED_ICE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.CLIMATE_HOT),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.PETRIFIED_FIRE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.RIDGESTONE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.GRAYWACKE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.HIGHLAND_STONE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.CLIMATE_WET),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.MUDSTONE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.CLIMATE_HOT),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.CARMELTAZITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.CLIMATE_TEMPERATE),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.PERIDOTITE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.QUARTZITE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.VIRIDITE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.CLIMATE_DRY),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.SATINSTONE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.FLUORITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.TOURMALINE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.MOUNTAIN),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.CUPRITE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.SAVANNA),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.PEACOCK_STONE_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.TAIGA),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.NITURITE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.tag(ConventionalBiomeTags.DESERT),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.IRIDOLITE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, TakieTerraPlacedFeatures.DIABASE_PLACED_KEY);
    }
}
