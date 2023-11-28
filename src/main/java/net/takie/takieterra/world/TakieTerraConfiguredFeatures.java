package net.takie.takieterra.world;

import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.dynamic.Range;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.math.noise.DoublePerlinNoiseSampler;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.JungleFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.DualNoiseBlockStateProvider;
import net.minecraft.world.gen.trunk.ForkingTrunkPlacer;
import net.minecraft.world.gen.trunk.MegaJungleTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.takie.takieterra.TakieTerraMod;
import net.takie.takieterra.block.TakieTerraBlocks;
import net.takie.takieterra.block.TakieTerraRockBlocks;
import net.takie.takieterra.block.TakieTerraTreeBlocks;
import net.takie.takieterra.block.custom.LampearBlock;
import net.takie.takieterra.block.custom.PearBlocks;
import net.takie.takieterra.features.HugePearFeatureConfig;
import net.takie.takieterra.features.tree.foliageplacers.SmallCanopyFoliagePlacer;
import net.takie.takieterra.features.tree.trunkplacers.SmallBranchingTrunkPlacer;
import net.takie.takieterra.features.tree.trunkplacers.SmallCanopyTree4BranchTrunkPlacer;
import net.takie.takieterra.features.tree.trunkplacers.SpindlyTrunkPlacer;
import net.takie.takieterra.init.PearFeatures;

import java.util.List;

public class TakieTerraConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_MAPLE_KEY = registerKey("red_maple");
    public static final RegistryKey<ConfiguredFeature<?, ?>> AMBER_MAPLE_KEY = registerKey("amber_maple");
    public static final RegistryKey<ConfiguredFeature<?, ?>> OCHRE_MAPLE_KEY = registerKey("ochre_maple");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_MAPLE_HIGH_KEY = registerKey("red_maple_high");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_MAPLE_MID_KEY = registerKey("red_maple_mid");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_MAPLE_LOW_KEY = registerKey("red_maple_low");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SWEETGUM_KEY = registerKey("sweetgum");
    public static final RegistryKey<ConfiguredFeature<?, ?>> STRAWBERRY_TREE_KEY = registerKey("strawberry_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PEONIA_KEY = registerKey("peonia");
    public static final RegistryKey<ConfiguredFeature<?, ?>> KOBICHA_KEY = registerKey("kobicha");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CHISAI_GREEN_KEY = registerKey("chisai_green");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CHISAI_RED_KEY = registerKey("chisai_red");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CHISAI_ORANGE_KEY = registerKey("chisai_orange");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CHISAI_YELLOW_KEY = registerKey("chisai_yellow");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CEDAR_KEY = registerKey("cedar");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HOLLY_TREE_KEY = registerKey("holly_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CASSIA_KEY = registerKey("cassia");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROYA_KEY = registerKey("roya");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NEBRA_KEY = registerKey("nebra");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SWAMP_SYLPH_KEY = registerKey("swamp_sylph");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GHAT_KEY = registerKey("ghat");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLACK_PINE_KEY = registerKey("black_pine");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WITCH_HAZEL_KEY = registerKey("witch_hazel");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MIMOSA_KEY = registerKey("mimosa");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TOONA_KEY = registerKey("toona");
    public static final RegistryKey<ConfiguredFeature<?, ?>> AUTUMN_ZELKOVA_KEY = registerKey("autumn_zelkova");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ZELKOVA_KEY = registerKey("zelkova");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PECAN_TREE_KEY = registerKey("pecan_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LARCH_KEY = registerKey("larch");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FIR_KEY = registerKey("fir");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MADRONE_KEY = registerKey("madrone");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BEECH_KEY = registerKey("beech");
    public static final RegistryKey<ConfiguredFeature<?, ?>> INDIKO_KEY = registerKey("indiko");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SEABREEZE_KEY = registerKey("seabreeze");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PARASHOREA_KEY = registerKey("parashorea");
    public static final RegistryKey<ConfiguredFeature<?, ?>> REDWOOD_KEY = registerKey("redwood");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SEQUOIA_KEY = registerKey("sequoia");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ZISSIAN_KEY = registerKey("zissian");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FLAMEBARK_KEY = registerKey("flamebark");
    public static final RegistryKey<ConfiguredFeature<?, ?>> JACARANDA_KEY = registerKey("jacaranda");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PURPLE_WISTERIA_KEY = registerKey("purple_wisteria");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WHITE_WISTERIA_KEY = registerKey("white_wisteria");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLUE_WISTERIA_KEY = registerKey("blue_wisteria");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PINK_WISTERIA_KEY = registerKey("pink_wisteria");
    public static final RegistryKey<ConfiguredFeature<?, ?>> AEGIA_KEY = registerKey("aegia");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NOMERIA_KEY = registerKey("nomeria");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MYRTA_KEY = registerKey("myrta_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> YELLOWWOOD_KEY = registerKey("yellowwood");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LAPACHO_YELLOW_KEY = registerKey("lapacho_yellow");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LAPACHO_PINK_KEY = registerKey("lapacho_pink");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CAMELLIA_KEY = registerKey("camellia");
    public static final RegistryKey<ConfiguredFeature<?, ?>> STEWARTIA_KEY = registerKey("stewartia");
    public static final RegistryKey<ConfiguredFeature<?, ?>> AUTUMN_STEWARTIA_KEY = registerKey("autumn_stewartia");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SCINTILLA_KEY = registerKey("scintilla");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SYCAMORE_KEY = registerKey("sycamore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CAMPHOR_KEY = registerKey("camphor");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GINKGO_GOLDEN_KEY = registerKey("ginkgo_golden");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GINKGO_VERDANT_KEY = registerKey("ginkgo_verdant");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MANGO_KEY = registerKey("mango");
    public static final RegistryKey<ConfiguredFeature<?, ?>> AUTUMN_ASPEN_KEY = registerKey("autumn_aspen");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FLAMING_AUTUMN_ASPEN_KEY = registerKey("flaming_autumn_aspen");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CHESTNUT_AUTUMN_ASPEN_KEY = registerKey("chestnut_autumn_aspen");
    public static final RegistryKey<ConfiguredFeature<?, ?>> OCHRE_AUTUMN_ASPEN_KEY = registerKey("ochre_autumn_aspen");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RAINBOW_GUM_KEY = registerKey("rainbow_gum");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLUE_GUM_KEY = registerKey("blue_gum");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEAD_TREE_KEY = registerKey("dead_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> EBONY_KEY = registerKey("ebony");
    public static final RegistryKey<ConfiguredFeature<?, ?>> IRONWOOD_KEY = registerKey("ironwood");
    public static final RegistryKey<ConfiguredFeature<?, ?>> KAURI_KEY = registerKey("kauri");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BALD_CYPRESS_KEY = registerKey("bald_cypress");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WILD_RASPBERRY_BUSH_KEY = registerKey("wild_raspberry_bush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WINTER_BLOSSOM_TREE_KEY = registerKey("winter_blossom_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WISTERIA_TREE_KEY = registerKey("wisteria_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MOSSY_HEART_KEY = registerKey("mossy_heart");

    public static final RegistryKey<ConfiguredFeature<?, ?>> WILLOW_KEY = registerKey("willow");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WALNUT_KEY = registerKey("walnut_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PEAR_KEY = registerKey("pear_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PINE_KEY = registerKey("pine");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PONDEROSA_PINE_KEY = registerKey("ponderosa_pine");
    public static final RegistryKey<ConfiguredFeature<?, ?>> KNOBCONE_PINE_KEY = registerKey("knobcone_pine");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PALO_VERDE_KEY = registerKey("palo_verde");
    public static final RegistryKey<ConfiguredFeature<?, ?>> JUNIPER_KEY = registerKey("juniper");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ZEBRAWOOD_KEY = registerKey("zebrawood");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAHOGANY_KEY = registerKey("mahogany");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PLUM_KEY = registerKey("plum");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PEACH_KEY = registerKey("peach");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PLUM_BLOSSOM_KEY = registerKey("plum_blossom");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PEACH_BLOSSOM_KEY = registerKey("peach_blossom");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SNOW_GHOST_KEY = registerKey("snow_ghost");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PHOSPORE_BLUE_KEY = registerKey("phospore_blue");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PHOSPORE_YELLOW_KEY = registerKey("phospore_yellow");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PHOSPORE_PINK_KEY = registerKey("phospore_pink");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PHOSPORE_GREEN_KEY = registerKey("phospore_green");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PHOSPORE_SPROUT_BLUE_KEY = registerKey("phospore_sprout_blue");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PHOSPORE_SPROUT_YELLOW_KEY = registerKey("phospore_sprout_yellow");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PHOSPORE_SPROUT_PINK_KEY = registerKey("phospore_sprout_pink");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PHOSPORE_SPROUT_GREEN_KEY = registerKey("phospore_sprout_green");

    public static final RegistryKey<ConfiguredFeature<?, ?>> MANDARIN_KEY = registerKey("mandarin_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MANDARIN_VARIANT_KEY = registerKey("mandarin_tree_variant");
    public static final RegistryKey<ConfiguredFeature<?, ?>> OLIVE_KEY = registerKey("olive_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> OLIVE_VARIANT_KEY = registerKey("olive_tree_variant");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LEMON_KEY = registerKey("lemon_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LEMON_VARIANT_KEY = registerKey("lemon_tree_variant");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LIME_KEY = registerKey("lime_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LIME_VARIANT_KEY = registerKey("lime_tree_variant");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLACK_CHERRY_KEY = registerKey("black_cherry_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CINNAMON_TREE_KEY = registerKey("cinnamon_tree");

    public static final RegistryKey<ConfiguredFeature<?, ?>> FALLEN_LEAVES_AUTUMN_KEY = registerKey("fallen_leaves_autumn");

    public static final RegistryKey<ConfiguredFeature<?, ?>> OPAL_ORE_KEY = registerKey("opal_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SEA_OPAL_ORE_KEY = registerKey("sea_opal_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> AMETRINE_ORE_KEY = registerKey("ametrine_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CITRINE_ORE_KEY = registerKey("citrine_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLOODSTONE_0RE_KEY = registerKey("bloodstone_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BISMUTH_ORE_KEY = registerKey("bismuth_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FIRE_AGATE_ORE_KEY = registerKey("fire_agate_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CELESTITE_ORE_KEY = registerKey("celestite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HOWLITE_0RE_KEY = registerKey("howlite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HYDITE_KEY = registerKey("hydite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> IRIS_AGATE_ORE_KEY = registerKey("iris_agate_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> KYANITE_ORE_KEY = registerKey("kyanite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ANGELITE_ORE_KEY = registerKey("angelite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LABRADORITE_0RE_KEY = registerKey("labradorite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LIDDICOATITE_KEY = registerKey("liddicoatite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GREEN_LIDDICOATITE_KEY = registerKey("green_liddicoatite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PINK_LIDDICOATITE_KEY = registerKey("pink_liddicoatite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MALACHITE_0RE_KEY = registerKey("malachite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MOONSTONE_ORE_KEY = registerKey("moonstone_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORANGE_CALCITE_ORE_KEY = registerKey("orange_calcite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PERIDOT_ORE_KEY = registerKey("peridot_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LUSEDITE_ORE_KEY = registerKey("lusedite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROSE_GOLD_ORE_KEY = registerKey("rose_gold_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RUBY_ORE_KEY = registerKey("ruby_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SAPPHIRE_ORE_KEY = registerKey("sapphire_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TANZANITE_0RE_KEY = registerKey("tanzanite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TOPAZ_ORE_KEY = registerKey("topaz_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SNOWFLAKE_OBSIDIAN_0RE_KEY = registerKey("snowflake_obsidian_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TURQUOISE_0RE_KEY = registerKey("turquoise_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> STARINITE_0RE_KEY = registerKey("starinite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NEBULITE_0RE_KEY = registerKey("nebulite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> AURANITE_0RE_KEY = registerKey("auranite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SUGILITE_0RE_KEY = registerKey("sugilite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FANTASY_PEARLITE_0RE_KEY = registerKey("fantasy_pearlite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WHITE_PEARLITE_0RE_KEY = registerKey("white_pearlite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SEASHELL_PEARLITE_0RE_KEY = registerKey("seashell_pearlite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> AMBER_0RE_KEY = registerKey("amber_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NEPHRITE_0RE_KEY = registerKey("nephrite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> APATITE_0RE_KEY = registerKey("apatite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RHODOCHROSITE_0RE_KEY = registerKey("rhodochrosite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CINNABAR_0RE_KEY = registerKey("cinnabar_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CHALCEDONY_0RE_KEY = registerKey("chalcedony_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RAINFOREST_JASPER_0RE_KEY = registerKey("rainforest_jasper_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> COQUINA_KEY = registerKey("coquina");
    public static final RegistryKey<ConfiguredFeature<?, ?>> COQUINA_DESERT_KEY = registerKey("coquina_desert");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BRECCIA_KEY = registerKey("breccia");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LIMESTONE_KEY = registerKey("limestone");
    public static final RegistryKey<ConfiguredFeature<?, ?>> COOL_GRANITE_KEY = registerKey("cool_granite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WARM_GRANITE_KEY = registerKey("warm_granite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DACITE_KEY = registerKey("dacite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DARK_SYENITE_KEY = registerKey("dark_syenite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PALE_SYENITE_KEY = registerKey("pale_syenite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DUNITE_KEY = registerKey("dunite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GNEISS_KEY = registerKey("gneiss");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HUANITE_KEY = registerKey("huanite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> JET_MARBLE_KEY = registerKey("jet_marble");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MARBLE_KEY = registerKey("marble");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PEGMATITE_KEY = registerKey("pegmatite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROANITE_KEY = registerKey("roanite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RUSSET_SCORIA_KEY = registerKey("russet_scoria");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SCORIA_KEY = registerKey("scoria");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SLATE_KEY = registerKey("slate");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TONGITE_KEY = registerKey("tongite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WAVE_DOLOMITE_KEY = registerKey("wave_dolomite");

    public static final RegistryKey<ConfiguredFeature<?, ?>> KAOLIN_KEY = registerKey("kaolin");
    public static final RegistryKey<ConfiguredFeature<?, ?>> AEGIRINE_KEY = registerKey("aegirine");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DIABASE_KEY = registerKey("diabase");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ONYX_KEY = registerKey("onyx");
    public static final RegistryKey<ConfiguredFeature<?, ?>> IRIDOLITE_KEY = registerKey("iridolite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NITURITE_KEY = registerKey("niturite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> AMPHIBOLITE_KEY = registerKey("amphibolite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ARGILLITE_KEY = registerKey("argillite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ARKOSE_KEY = registerKey("arkose");
    public static final RegistryKey<ConfiguredFeature<?, ?>> AZURITE_ORE_KEY = registerKey("azurite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLUE_SPOT_JASPER_ORE_KEY = registerKey("blue_spot_jasper_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ALMANDINE_ORE_KEY = registerKey("almandine_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> AMAZONITE_ORE_KEY = registerKey("amazonite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BORNITE_ORE_KEY = registerKey("bornite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CARNELIAN_ORE_KEY = registerKey("carnelian_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CHALCOPYRITE_ORE_KEY = registerKey("chalcopyrite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLUESCHIST_KEY = registerKey("blueschist");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CHIASTOLITE_CROSS_KEY = registerKey("chiastolite_cross");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CHIASTOLITE_TIGER_KEY = registerKey("chiastolite_tiger");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CHRYSOCOLLA_ORE_KEY = registerKey("chrysocolla_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CITRON_CHRYSOPRASE_ORE_KEY = registerKey("citron_chrysoprase_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CLAYSTONE_KEY = registerKey("claystone");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CLINOHUMITE_ORE_KEY = registerKey("clinohumite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DIOPTASE_ORE_KEY = registerKey("dioptase_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DOLERITE_KEY = registerKey("dolerite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DOLOMITE_KEY = registerKey("dolomite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DUMORTIERTITE_KEY = registerKey("dumortiertite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DUMORTIERTITE_BLUE_KEY = registerKey("dumortiertite_blue");
    public static final RegistryKey<ConfiguredFeature<?, ?>> EUDIALYTE_KEY = registerKey("eudialyte");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FUCHSITE_ORE_KEY = registerKey("fuchsite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GABBRO_KEY = registerKey("gabbro");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GARNET_ORE_KEY = registerKey("garnet_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GLAUCOPHANE_KEY = registerKey("glaucophane");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GNEISS_MARINE_KEY = registerKey("gneiss_marine");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WACKE_KEY = registerKey("wacke");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GREENSTONE_KEY = registerKey("greenstone");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HEMIMORPHITE_ORE_KEY = registerKey("hemimorphite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HORNFELS_KEY = registerKey("hornfels");
    public static final RegistryKey<ConfiguredFeature<?, ?>> IOLITE_ORE_KEY = registerKey("iolite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LABRADORITE_MIDNIGHT_ORE_KEY = registerKey("labradorite_midnight_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LAZULITE_ORE_KEY = registerKey("lazulite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LEPIDOLITE_ORE_KEY = registerKey("lepidolite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MIGMATITE_KEY = registerKey("migmatite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MONZONITE_KEY = registerKey("monzonite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MORGANITE_ORE_KEY = registerKey("morganite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MUSCOVITE_KEY = registerKey("muscovite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NOVACULITE_KEY = registerKey("novaculite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NOVACULITE_GRAY_KEY = registerKey("novaculite_gray");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NOVACULITE_OLIVE_KEY = registerKey("novaculite_olive");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NOVACULITE_RED_KEY = registerKey("novaculite_red");
    public static final RegistryKey<ConfiguredFeature<?, ?>> OLIVINE_KEY = registerKey("olivine");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORTHOCLASE_KEY = registerKey("orthoclase");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PHYLLITE_KEY = registerKey("phyllite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PINK_CORUNDUM_ORE_KEY = registerKey("pink_corundum_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PREHNITE_ORE_KEY = registerKey("prehnite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PYRITE_ORE_KEY = registerKey("pyrite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PYROMORPHITE_ORE_KEY = registerKey("pyromorphite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_CHERT_KEY = registerKey("red_chert");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RHYOLITE_KEY = registerKey("rhyolite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SHALE_KEY = registerKey("shale");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SIDERITE_KEY = registerKey("siderite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SILTSTONE_KEY = registerKey("siltstone");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SKARN_KEY = registerKey("skarn");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SNOW_QUARTZ_KEY = registerKey("snow_quartz");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SOAPSTONE_KEY = registerKey("soapstone");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SOVITE_KEY = registerKey("sovite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SERPENTINITE_KEY = registerKey("serpentinite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TITANITE_KEY = registerKey("titanite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SUNSTONE_ORE_KEY = registerKey("sunstone_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> THORITE_KEY = registerKey("thorite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TIDE_STONE_ORE_KEY = registerKey("tide_stone_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TRACHYTE_KEY = registerKey("trachyte");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TRAVERTINE_KEY = registerKey("travertine");
    public static final RegistryKey<ConfiguredFeature<?, ?>> VARISCITE_ORE_KEY = registerKey("variscite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> VIOLANE_KEY = registerKey("violane");
    public static final RegistryKey<ConfiguredFeature<?, ?>> YOWAH_OPAL_ORE_KEY = registerKey("yowah_opal_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PETRIFIED_FIRE_ORE_KEY = registerKey("petrified_fire_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PETRIFIED_ICE_ORE_KEY = registerKey("petrified_ice_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BERYL_PINK_ORE_KEY = registerKey("beryl_pink_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BERYL_GREEN_ORE_KEY = registerKey("beryl_green_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BERYL_TURQUOISE_ORE_KEY = registerKey("beryl_turquoise_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CARMELTAZITE_ORE_KEY = registerKey("carmeltazite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FLUORITE_ORE_KEY = registerKey("fluorite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SATINSTONE_KEY = registerKey("satinstone");
    public static final RegistryKey<ConfiguredFeature<?, ?>> VIRIDITE_KEY = registerKey("viridite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> QUARTZITE_KEY = registerKey("quartzite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PERIDOTITE_KEY = registerKey("peridotite");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MUDSTONE_KEY = registerKey("mudstone");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HIGHLAND_STONE_KEY = registerKey("highland_stone");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GRAYWACKE_KEY = registerKey("graywacke");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RIDGESTONE_KEY = registerKey("ridgestone");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CUPRITE_ORE_KEY = registerKey("cuprite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TOURMALINE_ORE_KEY = registerKey("tourmaline_ore");


    public static final RegistryKey<ConfiguredFeature<?, ?>> COBALT_LUPINE_KEY = registerKey("cobalt_lupine");
    public static final RegistryKey<ConfiguredFeature<?, ?>> COTTON_GRASS_KEY = registerKey("cotton_grass");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DRABA_KEY = registerKey("draba");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GLACIER_BUTTERCUP_KEY = registerKey("glacier_buttercup");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MOSS_CAMPION_KEY = registerKey("moss_campion");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PARRAYA_KEY = registerKey("parraya");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SHIVER_ROSE_KEY = registerKey("shiver_rose");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SAXIFRAGE_KEY = registerKey("saxifrage");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LUSH_MOSS_BLOCK_KEY = registerKey("lush_moss_block");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LUSH_MOSS_VEGETATION_KEY = registerKey("lush_moss_vegetation");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LUSH_MOSS_PATCH_KEY = registerKey("lush_moss_patch");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HYDRANGEA_KEY = registerKey("hydrangea");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WILD_HERBS_KEY = registerKey("wild_herbs");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CHAMOMILE_KEY = registerKey("chamomile");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FOXGLOVE_PINK_KEY = registerKey("foxglove_pink");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FOXGLOVE_YELLOW_KEY = registerKey("foxglove_yellow");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FOXGLOVE_WHITE_KEY = registerKey("foxglove_white");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HOLLYHOCK_YELLOW_KEY = registerKey("hollyhock_yellow");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HOLLYHOCK_BLACK_KEY = registerKey("hollyhock_black");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HOLLYHOCK_PINK_KEY = registerKey("hollyhock_pink");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DELPHINIUM_BLUE_KEY = registerKey("delphinium_blue");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DELPHINIUM_INDIGO_KEY = registerKey("delphinium_indigo");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CLOVER_PATCH_KEY = registerKey("clover_patch");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MARIGOLD_KEY = registerKey("marigold");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DANDELION_SEED_KEY = registerKey("dandelion_seed");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PANSY_ORANGE_KEY = registerKey("pansy_orange");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PANSY_PINK_KEY = registerKey("pansy_pink");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PANSY_PURPLE_KEY = registerKey("pansy_purple");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PANSY_WHITE_KEY = registerKey("pansy_white");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PANSY_RED_KEY = registerKey("pansy_red");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HYACINTH_BLUE_KEY = registerKey("hyacinth_blue");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HYACINTH_PINK_KEY = registerKey("hyacinth_pink");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HYACINTH_PURPLE_KEY = registerKey("hyacinth_purple");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HYACINTH_WHITE_KEY = registerKey("hyacinth_white");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HYACINTH_RED_KEY = registerKey("hyacinth_red");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SUNFLOWER_ORNAMENTAL_KEY = registerKey("sunflower_ornamental");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SUNFLOWER_ORNAMENTAL_TWO_KEY = registerKey("sunflower_ornamental_two");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SUNFLOWER_ORNAMENTAL_THREE_KEY = registerKey("sunflower_ornamental_three");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SUNFLOWER_ORNAMENTAL_FOUR_KEY = registerKey("sunflower_ornamental_four");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SUNFLOWER_ORNAMENTAL_FIVE_KEY = registerKey("sunflower_ornamental_five");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SUNFLOWER_ORNAMENTAL_SIX_KEY = registerKey("sunflower_ornamental_six");

    public static final RegistryKey<ConfiguredFeature<?, ?>> MUSHROOM_BLACK_AMANITA_KEY = registerKey("mushroom_black_amanita");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MUSHROOM_BLUE_OYSTER_KEY = registerKey("mushroom_blue_oyster");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MUSHROOM_CHANTERELLE_KEY = registerKey("mushroom_chanterelle");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MUSHROOM_DEATH_TRUMPET_KEY = registerKey("mushroom_death_trumpet");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MUSHROOM_GREEN_RUSSULA_KEY = registerKey("mushroom_green_russula");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MUSHROOM_HONEY_KEY = registerKey("mushroom_honey");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MUSHROOM_INKY_CAP_KEY = registerKey("mushroom_inky_cap");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MUSHROOM_LILAC_RUSSULA_KEY = registerKey("mushroom_lilac_russula");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MUSHROOM_MOREL_KEY = registerKey("mushroom_morel");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MUSHROOM_ORANGE_CAP_BOLETE_KEY = registerKey("mushroom_orange_cap_bolete");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MUSHROOM_PINK_OYSTER_KEY = registerKey("mushroom_pink_oyster");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MUSHROOM_PIXIE_CAP_KEY = registerKey("mushroom_pixie_cap");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MUSHROOM_RED_AMANITA_KEY = registerKey("mushroom_red_amanita");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MUSHROOM_SHAGGY_MANE_KEY = registerKey("mushroom_shaggy_mane");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MUSHROOM_YELLOW_OYSTER_KEY = registerKey("mushroom_yellow_oyster");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MUSHROOM_BRILLIOME_KEY = registerKey("mushroom_brilliome");


    public static final RegistryKey<ConfiguredFeature<?, ?>> ALOE_VERA_KEY = registerKey("aloe_vera");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ANTELOPE_BRUSH_KEY = registerKey("antelope_brush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ANTELOPE_BRUSH_FLOWERING_KEY = registerKey("antelope_brush_flowering");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ARROWLEAF_BALSAMROOT_KEY = registerKey("arrowleaf_balsamroot");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BARREL_CACTUS_KEY = registerKey("barrel_cactus");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BIG_SAGEBRUSH_KEY = registerKey("big_sagebrush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SAGEBRUSH_KEY = registerKey("sagebrush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BITTERROOT_KEY = registerKey("bitterroot");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLUE_AGAVE_KEY = registerKey("blue_agave");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BUNCHGRASS_LARGE_KEY = registerKey("bunchgrass_large");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BUNCHGRASS_TALL_KEY = registerKey("bunchgrass_tall");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SEA_OATS_KEY = registerKey("sea_oats");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BUNCHGRASS_MEDIUM_KEY = registerKey("bunchgrass_medium");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BUNCHGRASS_SMALL_KEY = registerKey("bunchgrass_small");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HUACHUMA_KEY = registerKey("huachuma");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TAMARISK_KEY = registerKey("tamarisk");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TAMARISK_FLOWERING_KEY = registerKey("tamarisk_flowering");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MARIPOSA_LILY_KEY = registerKey("mariposa_lily");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PIPE_ORGAN_CACTUS_KEY = registerKey("pipe_organ_cactus");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PRICKLY_PEAR_KEY = registerKey("prickly_pear");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RABBIT_BRUSH_KEY = registerKey("rabbit_brush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SOAPTREE_YUCCA_KEY = registerKey("soaptree_yucca");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DUNE_PRIMROSE_KEY = registerKey("dune_primrose");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GAZANIA_WHITE_KEY = registerKey("gazania_white");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GAZANIA_YELLOW_KEY = registerKey("gazania_yellow");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GAZANIA_ORANGE_KEY = registerKey("gazania_orange");
    public static final RegistryKey<ConfiguredFeature<?, ?>> VERBENA_WHITE_KEY = registerKey("verbena_white");
    public static final RegistryKey<ConfiguredFeature<?, ?>> VERBENA_YELLOW_KEY = registerKey("verbena_yellow");
    public static final RegistryKey<ConfiguredFeature<?, ?>> VERBENA_PINK_KEY = registerKey("verbena_pink");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BROMELIAD_KEY = registerKey("bromeliad");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLUEBELLS = registerKey("bluebells");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ANEMONE_PURPLE = registerKey("anemone_purple");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ANEMONE_WHITE = registerKey("anemone_white");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ANEMONE_YELLOW = registerKey("anemone_yellow");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GARDENIA = registerKey("gardenia");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PURPLE_WILDFLOWER = registerKey("purple_wildflower");
    public static final RegistryKey<ConfiguredFeature<?, ?>> YELLOW_WILDFLOWER = registerKey("yellow_wildflower");
    public static final RegistryKey<ConfiguredFeature<?, ?>> VIOLET = registerKey("violet");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WILD_RICE = registerKey("wild_rice");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WILD_STRAWBERRY_BUSH_RED = registerKey("wild_strawberry_bush_red");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WILD_STRAWBERRY_BUSH_WHITE = registerKey("wild_strawberry_bush_white");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PINK_DAFFODIL = registerKey("pink_daffodil");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PINK_HIBISCUS = registerKey("pink_hibiscus");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LAVENDER_FLOWER = registerKey("lavender_flower");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ICY_IRIS = registerKey("icy_iris");
    public static final RegistryKey<ConfiguredFeature<?, ?>> THORNY_BRAMBLE = registerKey("thorny_bramble");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HIBISCUS_BUSH_KEY = registerKey("hibiscus_bush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROSE_OF_SHARON_BUSH_KEY = registerKey("rose_of_sharon_bush");
    public static final RegistryKey <ConfiguredFeature <?, ?>> LOTUS_PLANT = registerKey("lotus_plant");
    public static final RegistryKey <ConfiguredFeature <?, ?>> MONSTERA_KEY = registerKey("monstera");
    public static final RegistryKey <ConfiguredFeature <?, ?>> TARO_PLANT_KEY = registerKey("taro_plant");
    public static final RegistryKey <ConfiguredFeature <?, ?>> SNAKE_PLANT_KEY = registerKey("snake_plant");
    public static final RegistryKey <ConfiguredFeature <?, ?>> DRAGON_TREE_KEY = registerKey("dragon_tree");
    public static final RegistryKey <ConfiguredFeature <?, ?>> MONEY_TREE_KEY = registerKey("money_tree");
    public static final RegistryKey <ConfiguredFeature <?, ?>> PARLOUR_PALM_KEY = registerKey("parlour_palm");
    public static final RegistryKey <ConfiguredFeature <?, ?>> BANANA_TREE_KEY = registerKey("banana_tree");
    public static final RegistryKey <ConfiguredFeature <?, ?>> ARECA_PALM_KEY = registerKey("areca_palm");
    public static final RegistryKey <ConfiguredFeature <?, ?>> FAN_PALM_KEY = registerKey("fan_palm");
    public static final RegistryKey <ConfiguredFeature <?, ?>> FERN_TAIGA_KEY = registerKey("fern_taiga");
    public static final RegistryKey <ConfiguredFeature <?, ?>> FERN_JUNGLE_KEY = registerKey("fern_jungle");
    public static final RegistryKey <ConfiguredFeature <?, ?>> FERN_DAINTY_KEY = registerKey("fern_dainty");

    public static final RegistryKey<ConfiguredFeature<?, ?>> FLOWER_TUNDRA = registerKey("flower_tundra");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MOSS_TUNDRA_KEY = registerKey("moss_tundra");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREES_ASPEN_WOODS = registerKey("trees_aspen_woods");

    public static final RegistryKey<ConfiguredFeature<?, ?>> HUGE_PEAR = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE,
            new Identifier(TakieTerraMod.MOD_ID, "huge_pear"));

    public static final RegistryKey<ConfiguredFeature<?, ?>> TITANIUM_QUARTZ_GEODE = registerKey("titanium_quartz_geode");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROSE_QUARTZ_GEODE = registerKey("rose_quartz_geode");


    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest sandReplaceables = new BlockMatchRuleTest(Blocks.SAND);


        List<OreFeatureConfig.Target> overworldOpalOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.OPAL_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraBlocks.DEEPSLATE_OPAL_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldSeaOpalOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.SEA_OPAL_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraBlocks.DEEPSLATE_SEA_OPAL_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldAmetrineOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.AMETRINE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraBlocks.DEEPSLATE_AMETRINE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldBloodstoneOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.BLOODSTONE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraBlocks.DEEPSLATE_BLOODSTONE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldFireAgateOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.FIRE_AGATE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraBlocks.DEEPSLATE_FIRE_AGATE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldCelestiteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.CELESTITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraBlocks.DEEPSLATE_CELESTITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldHowliteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.HOWLITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraBlocks.DEEPSLATE_HOWLITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldHyditeOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.HYDITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraBlocks.DEEPSLATE_HYDITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldIrisAgateOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.IRIS_AGATE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraBlocks.DEEPSLATE_IRIS_AGATE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldKyaniteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.KYANITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraBlocks.DEEPSLATE_KYANITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldAngeliteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.ANGELITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraBlocks.DEEPSLATE_ANGELITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldLarimarOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.LARIMAR_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraBlocks.DEEPSLATE_LARIMAR_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldLiddicoatite =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.LIDDICOATITE_BLOCK.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraBlocks.LIDDICOATITE_BLOCK.getDefaultState()));

        List<OreFeatureConfig.Target> overworldGreenLiddicoatite =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.GREEN_LIDDICOATITE_BLOCK.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraBlocks.GREEN_LIDDICOATITE_BLOCK.getDefaultState()));

        List<OreFeatureConfig.Target> overworldPinkLiddicoatite =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.PINK_LIDDICOATITE_BLOCK.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraBlocks.PINK_LIDDICOATITE_BLOCK.getDefaultState()));

        List<OreFeatureConfig.Target> overworldMalachiteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.MALACHITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraBlocks.DEEPSLATE_MALACHITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldMoonstoneOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.MOONSTONE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraBlocks.DEEPSLATE_MOONSTONE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldOrangeCalciteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.ORANGE_CALCITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraBlocks.DEEPSLATE_ORANGE_CALCITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldPeridotOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.PERIDOT_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraBlocks.DEEPSLATE_PERIDOT_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldRoseGoldOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.ROSE_GOLD_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraBlocks.DEEPSLATE_ROSE_GOLD_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldLusediteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.LUSEDITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraBlocks.DEEPSLATE_LUSEDITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldRubyOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.RUBY_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraBlocks.DEEPSLATE_RUBY_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldSapphireOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.SAPPHIRE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraBlocks.DEEPSLATE_SAPPHIRE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldTanzaniteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.TANZANITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraBlocks.DEEPSLATE_TANZANITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldTopazOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.TOPAZ_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraBlocks.DEEPSLATE_TOPAZ_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldSnowflakeObsidianOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.SNOWFLAKE_OBSIDIAN_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraBlocks.DEEPSLATE_SNOWFLAKE_OBSIDIAN_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldTurquoiseOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.TURQUOISE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraBlocks.DEEPSLATE_TURQUOISE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldStariniteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.STARINITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraBlocks.DEEPSLATE_STARINITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldNebuliteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.NEBULITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraBlocks.DEEPSLATE_NEBULITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldAuraniteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.AURANITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraBlocks.DEEPSLATE_AURANITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldSugiliteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.SUGILITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraBlocks.DEEPSLATE_SUGILITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldFantasyPearliteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.FANTASY_PEARLITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraBlocks.DEEPSLATE_FANTASY_PEARLITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldSeashellPearliteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.SEASHELL_PEARLITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraBlocks.DEEPSLATE_SEASHELL_PEARLITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldWhitePearliteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.WHITE_PEARLITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraBlocks.DEEPSLATE_WHITE_PEARLITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldAmberOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.AMBER_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraBlocks.DEEPSLATE_AMBER_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldApatiteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.APATITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraBlocks.DEEPSLATE_APATITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldRhodochrositeOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.RHODOCHROSITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraBlocks.DEEPSLATE_RHODOCHROSITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldNephriteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.NEPHRITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraBlocks.DEEPSLATE_NEPHRITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldCinnabarOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.CINNABAR_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraBlocks.DEEPSLATE_CINNABAR_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldRainforestJasperOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.RAINFOREST_JASPER_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraBlocks.DEEPSLATE_RAINFOREST_JASPER_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldChalcedonyOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.CHALCEDONY_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraBlocks.DEEPSLATE_CHALCEDONY_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldCitrineOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.CITRINE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraBlocks.DEEPSLATE_CITRINE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldCoquinaOres =
                List.of(OreFeatureConfig.createTarget(sandReplaceables, TakieTerraBlocks.COQUINA.getDefaultState()));

        List<OreFeatureConfig.Target> overworldDesertCoquinaOres =
                List.of(OreFeatureConfig.createTarget(sandReplaceables, TakieTerraBlocks.COQUINA.getDefaultState()));

        List<OreFeatureConfig.Target> overworldBrecciaOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.BRECCIA.getDefaultState()));
        List<OreFeatureConfig.Target> overworldLimestoneOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.LIMESTONE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldCoolGraniteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.COOL_GRANITE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldDaciteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.DACITE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldDarkSyeniteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.DARK_SYENITE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldPaleSyeniteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.PALE_SYENITE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldDuniteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.DUNITE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldGneissOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.GNEISS.getDefaultState()));
        List<OreFeatureConfig.Target> overworldHuaniteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.HUANITE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldPegmatiteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.PEGMATITE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldRoaniteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.ROANITE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldRussetScoriaOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.RUSSET_SCORIA.getDefaultState()));
        List<OreFeatureConfig.Target> overworldScoriaOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.SCORIA.getDefaultState()));
        List<OreFeatureConfig.Target> overworldSlateOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.SLATE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldTongiteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.TONGITE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldWaveDolomiteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraBlocks.WAVE_DOLOMITE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldKaolinOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.KAOLIN.getDefaultState()));
        List<OreFeatureConfig.Target> overworldAegirineOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.AEGIRINE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldAmphiboliteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.AMPHIBOLITE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldArgilliteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.ARGILLITE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldArkoseOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.ARKOSE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldAzuriteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.AZURITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraRockBlocks.DEEPSLATE_AZURITE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldBlueSpotJasperOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.BLUE_SPOT_JASPER_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraRockBlocks.DEEPSLATE_BLUE_SPOT_JASPER_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldAlmandineOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.ALMANDINE_ORE.getDefaultState()),
        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraRockBlocks.DEEPSLATE_ALMANDINE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldAmazoniteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.AMAZONITE_ORE.getDefaultState()),
        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraRockBlocks.DEEPSLATE_AMAZONITE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldBorniteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.BORNITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraRockBlocks.DEEPSLATE_BORNITE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldCarnelianOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.CARNELIAN_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraRockBlocks.DEEPSLATE_CARNELIAN_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldChalcopyriteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.CHALCOPYRITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraRockBlocks.DEEPSLATE_CHALCOPYRITE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldBlueschistOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.BLUESCHIST.getDefaultState()));
        List<OreFeatureConfig.Target> overworldChiastoliteCrossOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.CHIASTOLITE_CROSS.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraRockBlocks.CHIASTOLITE_CROSS.getDefaultState()));
        List<OreFeatureConfig.Target> overworldChiastoliteTigerOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.CHIASTOLITE_TIGER.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraRockBlocks.CHIASTOLITE_TIGER.getDefaultState()));
        List<OreFeatureConfig.Target> overworldChrysocollaOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.CHRYSOCOLLA_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraRockBlocks.DEEPSLATE_CHRYSOCOLLA_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldCitronChrysopraseOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.CITRON_CHRYSOPRASE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraRockBlocks.DEEPSLATE_CITRON_CHRYSOPRASE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldClaystoneOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.CLAYSTONE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldClinohumiteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.CLINOHUMITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraRockBlocks.DEEPSLATE_CLINOHUMITE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldDioptaseOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.DIOPTASE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraRockBlocks.DEEPSLATE_DIOPTASE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldDoleriteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.DOLERITE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldDolomiteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.DOLOMITE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldDumortiertiteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.DUMORTIERTITE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldDumortiertiteBlueOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.DUMORTIERTITE_BLUE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldEudialyteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.EUDIALYTE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldFuchsiteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.FUCHSITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraRockBlocks.DEEPSLATE_FUCHSITE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldGabbroOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.GABBRO.getDefaultState()));
        List<OreFeatureConfig.Target> overworldGarnetOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.GARNET_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraRockBlocks.DEEPSLATE_GARNET_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldGlaucophaneOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.GLAUCOPHANE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldGneissMarineOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.GNEISS_MARINE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldWackeOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.WACKE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldGreenstoneOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.GREENSTONE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldHemimorphiteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.HEMIMORPHITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraRockBlocks.DEEPSLATE_HEMIMORPHITE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldHornfelsOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.HORNFELS.getDefaultState()));
        List<OreFeatureConfig.Target> overworldIoliteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.IOLITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraRockBlocks.DEEPSLATE_IOLITE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldLabradoriteMidnightOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.LABRADORITE_MIDNIGHT_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraRockBlocks.DEEPSLATE_LABRADORITE_MIDNIGHT_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldLazuliteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.LAZULITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraRockBlocks.DEEPSLATE_LAZULITE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldLepidoliteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.LEPIDOLITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraRockBlocks.DEEPSLATE_LEPIDOLITE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldMigmatiteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.MIGMATITE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldMonzoniteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.MONZONITE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldMorganiteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.MORGANITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraRockBlocks.DEEPSLATE_MORGANITE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldMuscoviteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.MUSCOVITE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldNovaculiteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.NOVACULITE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldNovaculiteGrayOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.NOVACULITE_GRAY.getDefaultState()));
        List<OreFeatureConfig.Target> overworldNovaculiteOliveOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.NOVACULITE_OLIVE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldNovaculiteRedOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.NOVACULITE_RED.getDefaultState()));
        List<OreFeatureConfig.Target> overworldOlivineOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.OLIVINE_BLOCK.getDefaultState()));
        List<OreFeatureConfig.Target> overworldOrthoclaseOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.ORTHOCLASE_BLOCK.getDefaultState()));
        List<OreFeatureConfig.Target> overworldPhylliteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.PHYLLITE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldPinkCorundumOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.PINK_CORUNDUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraRockBlocks.DEEPSLATE_PINK_CORUNDUM_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldPrehniteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.PREHNITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraRockBlocks.DEEPSLATE_PREHNITE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldPyriteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.PYRITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraRockBlocks.DEEPSLATE_PYRITE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldPyromorphiteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.PYROMORPHITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraRockBlocks.DEEPSLATE_PYROMORPHITE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldRedChertOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.RED_CHERT.getDefaultState()));
        List<OreFeatureConfig.Target> overworldRhyoliteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.RHYOLITE_BLOCK.getDefaultState()));
        List<OreFeatureConfig.Target> overworldSideriteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.SIDERITE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldSiltstoneOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.SILTSTONE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldSkarnOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.SKARN.getDefaultState()));
        List<OreFeatureConfig.Target> overworldSnowQuartzOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.SNOW_QUARTZ.getDefaultState()));
        List<OreFeatureConfig.Target> overworldSoapstoneOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.SOAPSTONE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldSoviteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.SOVITE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldSerpentiniteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.SERPENTINITE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldTitaniteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.TITANITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraRockBlocks.DEEPSLATE_TITANITE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldSunstoneOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.SUNSTONE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraRockBlocks.DEEPSLATE_SUNSTONE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldTideStoneOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.TIDE_STONE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraRockBlocks.DEEPSLATE_TIDE_STONE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldThoriteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.THORITE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldTrachyteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.TRACHYTE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldTravertineOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.TRAVERTINE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldVarisciteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.VARISCITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraRockBlocks.DEEPSLATE_VARISCITE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldViolaneOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.VIOLANE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldYowahOpalOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.YOWAH_OPAL_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraRockBlocks.DEEPSLATE_YOWAH_OPAL_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldPetrifiedIceOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.PETRIFIED_ICE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraRockBlocks.DEEPSLATE_PETRIFIED_ICE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldPetrifiedFireOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.PETRIFIED_FIRE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraRockBlocks.DEEPSLATE_PETRIFIED_FIRE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldCarmeltaziteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.CARMELTAZITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraRockBlocks.DEEPSLATE_CARMELTAZITE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldFluoriteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.FLUORITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraRockBlocks.DEEPSLATE_FLUORITE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldRidgestoneOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.RIDGESTONE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldGraywackeOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.GRAYWACKE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldHighlandStoneOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.HIGHLAND_STONE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldMudstoneOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.MUDSTONE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldPeridotiteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.PERIDOTITE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldQuartziteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.QUARTZITE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldViriditeOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.VIRIDITE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldSatinstoneOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.SATINSTONE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldPeacockStoneOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.PEACOCK_STONE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldCupriteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.CUPRITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraRockBlocks.DEEPSLATE_CUPRITE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldTourmalineOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.TOURMALINE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, TakieTerraRockBlocks.DEEPSLATE_TOURMALINE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldDiabaseOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.DIABASE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldIridoliteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.IRIDOLITE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldNituriteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, TakieTerraRockBlocks.NITURITE.getDefaultState()));




        register(context, TITANIUM_QUARTZ_GEODE, Feature.GEODE,
                new GeodeFeatureConfig(new GeodeLayerConfig(BlockStateProvider.of(Blocks.AIR),
                        BlockStateProvider.of(TakieTerraBlocks.TITANIUM_QUARTZ_BLOCK),
                        BlockStateProvider.of(TakieTerraBlocks.BUDDING_TITANIUM_QUARTZ_BLOCK),
                        BlockStateProvider.of(Blocks.QUARTZ_BLOCK),
                        BlockStateProvider.of(Blocks.BLACKSTONE),
                        List.of(TakieTerraBlocks.SMALL_TITANIUM_QUARTZ_BUD.getDefaultState(), TakieTerraBlocks.MEDIUM_TITANIUM_QUARTZ_BUD.getDefaultState(),
                                TakieTerraBlocks.LARGE_TITANIUM_QUARTZ_BUD.getDefaultState(), TakieTerraBlocks.TITANIUM_QUARTZ_CLUSTER.getDefaultState()),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                        new GeodeLayerThicknessConfig(1.7, 2.2, 3.2, 4.2),
                        new GeodeCrackConfig(0.95, 2.0D, 2),
                        0.35, 0.083,
                        true, UniformIntProvider.create(3, 8),
                        UniformIntProvider.create(4, 6), UniformIntProvider.create(3, 4),
                        -16, 16, 0.05, 1));

        register(context, ROSE_QUARTZ_GEODE, Feature.GEODE,
                new GeodeFeatureConfig(new GeodeLayerConfig(BlockStateProvider.of(Blocks.AIR),
                        BlockStateProvider.of(TakieTerraBlocks.ROSE_QUARTZ_BLOCK),
                        BlockStateProvider.of(TakieTerraBlocks.BUDDING_ROSE_QUARTZ_BLOCK),
                        BlockStateProvider.of(Blocks.QUARTZ_BLOCK),
                        BlockStateProvider.of(Blocks.POLISHED_BLACKSTONE),
                        List.of(TakieTerraBlocks.SMALL_ROSE_QUARTZ_BUD.getDefaultState(), TakieTerraBlocks.MEDIUM_ROSE_QUARTZ_BUD.getDefaultState(),
                                TakieTerraBlocks.LARGE_ROSE_QUARTZ_BUD.getDefaultState(), TakieTerraBlocks.ROSE_QUARTZ_CLUSTER.getDefaultState()),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                        new GeodeLayerThicknessConfig(1.7, 2.2, 3.2, 4.2),
                        new GeodeCrackConfig(0.95, 2.0D, 2),
                        0.35, 0.083,
                        true, UniformIntProvider.create(3, 8),
                        UniformIntProvider.create(4, 6), UniformIntProvider.create(3, 4),
                        -16, 16, 0.05, 1));

        {
            register(context, HUGE_PEAR, PearFeatures.HUGE_PEAR,
                    new HugePearFeatureConfig(
                            BlockStateProvider.of(TakieTerraTreeBlocks.PEAR_LOG),
                            BlockStateProvider.of(TakieTerraTreeBlocks.PEAR_LEAVES),
                            BlockStateProvider.of(TakieTerraTreeBlocks.FLOWERING_PEAR_LEAVES),
                            BlockStateProvider.of(PearBlocks.LAMPEAR_BLOCK),
                            BlockStateProvider.of(PearBlocks.LAMPEAR.getDefaultState().with(LampearBlock.HANGING, true))
                    ));
        }
        register(context, MANDARIN_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(TakieTerraTreeBlocks.MANDARIN_LOG),
                new StraightTrunkPlacer(4, 1, 1),
                BlockStateProvider.of(TakieTerraTreeBlocks.MANDARIN_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, LEMON_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(TakieTerraTreeBlocks.LEMON_LOG),
                new StraightTrunkPlacer(4, 1, 1),
                BlockStateProvider.of(TakieTerraTreeBlocks.LEMON_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, LIME_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(TakieTerraTreeBlocks.LIME_LOG),
                new StraightTrunkPlacer(4, 1, 1),
                BlockStateProvider.of(TakieTerraTreeBlocks.LIME_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
                new TwoLayersFeatureSize(1, 0, 1)).build());

        register(context, OLIVE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(TakieTerraTreeBlocks.OLIVE_LOG),
                new StraightTrunkPlacer(4, 1, 1),
                BlockStateProvider.of(TakieTerraTreeBlocks.OLIVE_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(1), 2),
                new TwoLayersFeatureSize(1, 0, 1)).build());


        register(context, OPAL_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldOpalOres, 4));
        register(context, SEA_OPAL_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldSeaOpalOres, 4));
        register(context, COQUINA_KEY, Feature.ORE, new OreFeatureConfig(overworldSeaOpalOres, 4));


        register(context, COBALT_LUPINE_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(32, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(TakieTerraBlocks.COBALT_LUPINE)))));
        register(context, COTTON_GRASS_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(32, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(TakieTerraBlocks.COTTON_GRASS)))));
        register(context, DRABA_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(32, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(TakieTerraBlocks.DRABA)))));
        register(context, GLACIER_BUTTERCUP_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(32, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(TakieTerraBlocks.GLACIER_BUTTERCUP)))));
        register(context, PARRAYA_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(32, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(TakieTerraBlocks.PARRAYA)))));
        register(context, SAXIFRAGE_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(32, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(TakieTerraBlocks.SAXIFRAGE)))));
        register(context, HYDRANGEA_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(32, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                new SimpleBlockFeatureConfig(BlockStateProvider.of(TakieTerraBlocks.HYDRANGEA)))));

        register(context, FLOWER_TUNDRA, Feature.FLOWER,
                new RandomPatchFeatureConfig(64, 6, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(
                        new DualNoiseBlockStateProvider (new Range<>(1, 3), new DoublePerlinNoiseSampler.NoiseParameters(-3, 1), 1, 2345, new DoublePerlinNoiseSampler.NoiseParameters(-10, 1), 1.0F,
                                List.of(TakieTerraBlocks.DRABA.getDefaultState(),
                                TakieTerraBlocks.SAXIFRAGE.getDefaultState(),
                                TakieTerraBlocks.GLACIER_BUTTERCUP.getDefaultState(),
                                TakieTerraBlocks.PARRAYA.getDefaultState(),
                                TakieTerraBlocks.COBALT_LUPINE.getDefaultState(),
                                TakieTerraBlocks.COTTON_GRASS.getDefaultState()))))));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(TakieTerraMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
