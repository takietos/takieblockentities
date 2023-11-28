package net.takie.takieterra.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;
import net.takie.takieterra.TakieTerraMod;
import net.takie.takieterra.block.TakieTerraBlocks;
import net.takie.takieterra.block.TakieTerraTreeBlocks;
import net.takie.takieterra.block.custom.PearBlocks;

import java.util.List;

public class TakieTerraPlacedFeatures {
    public static final RegistryKey<PlacedFeature> RED_MAPLE_PLACED_KEY = registerKey("red_maple_placed");
    public static final RegistryKey<PlacedFeature> AMBER_MAPLE_PLACED_KEY = registerKey("amber_maple_placed");
    public static final RegistryKey<PlacedFeature> OCHRE_MAPLE_PLACED_KEY = registerKey("ochre_maple_placed");
    public static final RegistryKey<PlacedFeature> RED_MAPLE_HIGH_PLACED_KEY = registerKey("red_maple_high_placed");
    public static final RegistryKey<PlacedFeature> RED_MAPLE_MID_PLACED_KEY = registerKey("red_maple_mid_placed");
    public static final RegistryKey<PlacedFeature> RED_MAPLE_LOW_PLACED_KEY = registerKey("red_maple_low_placed");
    public static final RegistryKey<PlacedFeature> SWEETGUM_PLACED_KEY = registerKey("sweetgum_placed");
    public static final RegistryKey<PlacedFeature> KOBICHA_PLACED_KEY = registerKey("kobicha_placed");
    public static final RegistryKey<PlacedFeature> STRAWBERRY_TREE_PLACED_KEY = registerKey("strawberry_tree_placed");
    public static final RegistryKey<PlacedFeature> PEONIA_PLACED_KEY = registerKey("peonia_placed");
    public static final RegistryKey<PlacedFeature> ROYA_PLACED_KEY = registerKey("roya_placed");
    public static final RegistryKey<PlacedFeature> CHISAI_GREEN_PLACED_KEY = registerKey("chisai_green_placed");
    public static final RegistryKey<PlacedFeature> CHISAI_RED_PLACED_KEY = registerKey("chisai_red_placed");
    public static final RegistryKey<PlacedFeature> CHISAI_ORANGE_PLACED_KEY = registerKey("chisai_orange_placed");
    public static final RegistryKey<PlacedFeature> CHISAI_YELLOW_PLACED_KEY = registerKey("chisai_yellow_placed");
    public static final RegistryKey<PlacedFeature> CEDAR_PLACED_KEY = registerKey("cedar_placed");
    public static final RegistryKey<PlacedFeature> CASSIA_PLACED_KEY = registerKey("cassia_placed");
    public static final RegistryKey<PlacedFeature> HOLLY_TREE_PLACED_KEY = registerKey("holly_tree_placed");
    public static final RegistryKey<PlacedFeature> NEBRA_PLACED_KEY = registerKey("nebra_placed");
    public static final RegistryKey<PlacedFeature> AUTUMN_ZELKOVA_PLACED_KEY = registerKey("autumn_zelkova_placed");
    public static final RegistryKey<PlacedFeature> ZELKOVA_PLACED_KEY = registerKey("zelkova_placed");
    public static final RegistryKey<PlacedFeature> MIMOSA_PLACED_KEY = registerKey("mimosa_placed");
    public static final RegistryKey<PlacedFeature> SWAMP_SYLPH_PLACED_KEY = registerKey("swamp_sylph_placed");
    public static final RegistryKey<PlacedFeature> PECAN_TREE_PLACED_KEY = registerKey("pecan_tree_placed");
    public static final RegistryKey<PlacedFeature> LARCH_PLACED_KEY = registerKey("larch_placed");
    public static final RegistryKey<PlacedFeature> BLACK_PINE_PLACED_KEY = registerKey("black_pine_placed");
    public static final RegistryKey<PlacedFeature> FIR_PLACED_KEY = registerKey("fir_placed");
    public static final RegistryKey<PlacedFeature> BEECH_PLACED_KEY = registerKey("beech_placed");
    public static final RegistryKey<PlacedFeature> MADRONE_PLACED_KEY = registerKey("madrone_placed");
    public static final RegistryKey<PlacedFeature> JACARANDA_PLACED_KEY = registerKey("jacaranda_placed");
    public static final RegistryKey<PlacedFeature> AEGIA_PLACED_KEY = registerKey("aegia_placed");
    public static final RegistryKey<PlacedFeature> NOMERIA_PLACED_KEY = registerKey("nomeria_placed");
    public static final RegistryKey<PlacedFeature> PARASHOREA_PLACED_KEY = registerKey("parashorea_placed");
    public static final RegistryKey<PlacedFeature> REDWOOD_PLACED_KEY = registerKey("redwood_placed");
    public static final RegistryKey<PlacedFeature> SEQUOIA_PLACED_KEY = registerKey("sequoia_placed");
    public static final RegistryKey<PlacedFeature> LAPACHO_YELLOW_PLACED_KEY = registerKey("lapacho_yellow_placed");
    public static final RegistryKey<PlacedFeature> LAPACHO_PINK_PLACED_KEY = registerKey("lapacho_pink_placed");
    public static final RegistryKey<PlacedFeature> PURPLE_WISTERIA_PLACED_KEY = registerKey("purple_wisteria_placed");
    public static final RegistryKey<PlacedFeature> WHITE_WISTERIA_PLACED_KEY = registerKey("white_wisteria_placed");
    public static final RegistryKey<PlacedFeature> BLUE_WISTERIA_PLACED_KEY = registerKey("blue_wisteria_placed");
    public static final RegistryKey<PlacedFeature> PINK_WISTERIA_PLACED_KEY = registerKey("pink_wisteria_placed");
    public static final RegistryKey<PlacedFeature> CAMELLIA_PLACED_KEY = registerKey("camellia_placed");
    public static final RegistryKey<PlacedFeature> SYCAMORE_PLACED_KEY = registerKey("sycamore_placed");
    public static final RegistryKey<PlacedFeature> WITCH_HAZEL_PLACED_KEY = registerKey("witch_hazel_placed");
    public static final RegistryKey<PlacedFeature> CAMPHOR_PLACED_KEY = registerKey("camphor_placed");
    public static final RegistryKey<PlacedFeature> GINKGO_VERDANT_PLACED_KEY = registerKey("ginkgo_verdant_placed");
    public static final RegistryKey<PlacedFeature> GINKGO_GOLDEN_PLACED_KEY = registerKey("ginkgo_golden_placed");
    public static final RegistryKey<PlacedFeature> MANGO_PLACED_KEY = registerKey("mango_placed");
    public static final RegistryKey<PlacedFeature> SCINTILLA_PLACED_KEY = registerKey("scintilla_placed");
    public static final RegistryKey<PlacedFeature> PHOSPORE_BLUE_PLACED_KEY = registerKey("phospore_blue_placed");
    public static final RegistryKey<PlacedFeature> PHOSPORE_GREEN_PLACED_KEY = registerKey("phospore_green_placed");
    public static final RegistryKey<PlacedFeature> PHOSPORE_PINK_PLACED_KEY = registerKey("phospore_pink_placed");
    public static final RegistryKey<PlacedFeature> PHOSPORE_YELLOW_PLACED_KEY = registerKey("phospore_yellow_placed");
    public static final RegistryKey<PlacedFeature> PHOSPORE_SPROUT_BLUE_PLACED_KEY = registerKey("phospore_sprout_blue_placed");
    public static final RegistryKey<PlacedFeature> PHOSPORE_SPROUT_GREEN_PLACED_KEY = registerKey("phospore_sprout_green_placed");
    public static final RegistryKey<PlacedFeature> PHOSPORE_SPROUT_PINK_PLACED_KEY = registerKey("phospore_sprout_pink_placed");
    public static final RegistryKey<PlacedFeature> PHOSPORE_SPROUT_YELLOW_PLACED_KEY = registerKey("phospore_sprout_yellow_placed");
    public static final RegistryKey<PlacedFeature> SNOW_GHOST_PLACED_KEY = registerKey("snow_ghost_placed");
    public static final RegistryKey<PlacedFeature> AUTUMN_ASPEN_PLACED_KEY = registerKey("autumn_aspen_placed");
    public static final RegistryKey<PlacedFeature> WILLOW_PLACED_KEY = registerKey("willow_placed");
    public static final RegistryKey<PlacedFeature> WALNUT_PLACED_KEY = registerKey("walnut_placed");
    public static final RegistryKey<PlacedFeature> PINE_PLACED_KEY = registerKey("pine_placed");
    public static final RegistryKey<PlacedFeature> PONDEROSA_PINE_PLACED_KEY = registerKey("ponderosa_pine_placed");
    public static final RegistryKey<PlacedFeature> KNOBCONE_PINE_PLACED_KEY = registerKey("knobcone_pine_placed");
    public static final RegistryKey<PlacedFeature> RAINBOW_GUM_PLACED_KEY = registerKey("rainbow_gum_placed");
    public static final RegistryKey<PlacedFeature> BLUE_GUM_PLACED_KEY = registerKey("blue_gum_placed");
    public static final RegistryKey<PlacedFeature> DEAD_TREE_PLACED_KEY = registerKey("dead_tree_placed");
    public static final RegistryKey<PlacedFeature> EBONY_PLACED_KEY = registerKey("ebony_placed");
    public static final RegistryKey<PlacedFeature> IRONWOOD_PLACED_KEY = registerKey("ironwood_placed");
    public static final RegistryKey<PlacedFeature> FLAMEBARK_PLACED_KEY = registerKey("flamebark_placed");
    public static final RegistryKey<PlacedFeature> WINTER_BLOSSOM_TREE_PLACED_KEY = registerKey("winter_blossom_tree_placed");
    public static final RegistryKey<PlacedFeature> PEAR_TREE_PLACED_KEY = registerKey("pear_tree_placed");
    public static final RegistryKey<PlacedFeature> PALO_VERDE_PLACED_KEY = registerKey("palo_verde_placed");
    public static final RegistryKey<PlacedFeature> JUNIPER_PLACED_KEY = registerKey("juniper_placed");
    public static final RegistryKey<PlacedFeature> ZEBRAWOOD_PLACED_KEY = registerKey("zebrawood_placed");
    public static final RegistryKey<PlacedFeature> MAHOGANY_PLACED_KEY = registerKey("mahogany_placed");
    public static final RegistryKey<PlacedFeature> PLUM_PLACED_KEY = registerKey("plum_placed");
    public static final RegistryKey<PlacedFeature> PEACH_PLACED_KEY = registerKey("peach_placed");
    public static final RegistryKey<PlacedFeature> KAURI_PLACED_KEY = registerKey("kauri_placed");
    public static final RegistryKey<PlacedFeature> BALD_CYPRESS_PLACED_KEY = registerKey("bald_cypress_placed");
    public static final RegistryKey<PlacedFeature> MOSSY_HEART_PLACED_KEY = registerKey("mossy_heart_placed");
    public static final RegistryKey<PlacedFeature> MYRTA_PLACED_KEY = registerKey("myrta_tree_placed");
    public static final RegistryKey<PlacedFeature> GHAT_PLACED_KEY = registerKey("ghat_tree_placed");
    public static final RegistryKey<PlacedFeature> INDIKO_PLACED_KEY = registerKey("indiko_placed");
    public static final RegistryKey<PlacedFeature> SEABREEZE_PLACED_KEY = registerKey("seabreeze_placed");
    public static final RegistryKey<PlacedFeature> ZISSIAN_PLACED_KEY = registerKey("zissian_placed");
    public static final RegistryKey<PlacedFeature> YELLOWWOOD_PLACED_KEY = registerKey("yellowwood_placed");
    public static final RegistryKey<PlacedFeature> TOONA_PLACED_KEY = registerKey("toona_placed");
    public static final RegistryKey<PlacedFeature> WILD_RASPBERRY_BUSH_PLACED_KEY = registerKey("wild_raspberry_bush_placed");

    public static final RegistryKey<PlacedFeature> FALLEN_LEAVES_AUTUMN_PLACED_KEY = registerKey("fallen_leaves_autumn_placed");
    public static final RegistryKey <PlacedFeature> LOTUS_PLANT_PLACED = registerKey("lotus_plant_placed");

    public static final RegistryKey<PlacedFeature> OPAL_ORE_PLACED_KEY = registerKey("opal_ore_placed");
    public static final RegistryKey<PlacedFeature> SEA_OPAL_ORE_PLACED_KEY = registerKey("sea_opal_ore_placed");
    public static final RegistryKey<PlacedFeature> AMETRINE_ORE_PLACED_KEY = registerKey("ametrine_ore_placed");
    public static final RegistryKey<PlacedFeature> CITRINE_ORE_PLACED_KEY = registerKey("citrine_ore_placed");
    public static final RegistryKey<PlacedFeature> BLOODSTONE_ORE_PLACED_KEY = registerKey("bloodstone_ore_placed");
    public static final RegistryKey<PlacedFeature> BISMUTH_ORE_PLACED_KEY = registerKey("bismuth_ore_placed");
    public static final RegistryKey<PlacedFeature> FIRE_AGATE_ORE_PLACED_KEY = registerKey("fire_agate_ore_placed");
    public static final RegistryKey<PlacedFeature> CELESTITE_ORE_PLACED_KEY = registerKey("celestite_ore_placed");
    public static final RegistryKey<PlacedFeature> HOWLITE_ORE_PLACED_KEY = registerKey("howlite_ore_placed");
    public static final RegistryKey<PlacedFeature> HYDITE_ORE_PLACED_KEY = registerKey("hydite_ore_placed");
    public static final RegistryKey<PlacedFeature> IRIS_AGATE_ORE_PLACED_KEY = registerKey("iris_agate_ore_placed");
    public static final RegistryKey<PlacedFeature> KYANITE_ORE_PLACED_KEY = registerKey("kyanite_ore_placed");
    public static final RegistryKey<PlacedFeature> ANGELITE_ORE_PLACED_KEY = registerKey("angelite_ore_placed");
    public static final RegistryKey<PlacedFeature> LABRADORITE_ORE_PLACED_KEY = registerKey("labradorite_ore_placed");
    public static final RegistryKey<PlacedFeature> LARIMAR_ORE_PLACED_KEY = registerKey("larimar_ore_placed");
    public static final RegistryKey<PlacedFeature> LIDDICOATITE_PLACED_KEY = registerKey("liddicoatite_placed");
    public static final RegistryKey<PlacedFeature> GREEN_LIDDICOATITE_PLACED_KEY = registerKey("green_liddicoatite_placed");
    public static final RegistryKey<PlacedFeature> PINK_LIDDICOATITE_PLACED_KEY = registerKey("pink_liddicoatite_placed");
    public static final RegistryKey<PlacedFeature> MALACHITE_ORE_PLACED_KEY = registerKey("malachite_ore_placed");
    public static final RegistryKey<PlacedFeature> MOONSTONE_ORE_PLACED_KEY = registerKey("moonstone_ore_placed");
    public static final RegistryKey<PlacedFeature> ORANGE_CALCITE_ORE_PLACED_KEY = registerKey("orange_calcite_ore_placed");
    public static final RegistryKey<PlacedFeature> PERIDOT_ORE_PLACED_KEY = registerKey("peridot_ore_placed");
    public static final RegistryKey<PlacedFeature> LUSEDITE_ORE_PLACED_KEY = registerKey("lusedite_ore_placed");
    public static final RegistryKey<PlacedFeature> RUBY_ORE_PLACED_KEY = registerKey("ruby_ore_placed");
    public static final RegistryKey<PlacedFeature> SAPPHIRE_ORE_PLACED_KEY = registerKey("sapphire_ore_placed");
    public static final RegistryKey<PlacedFeature> TANZANITE_ORE_PLACED_KEY = registerKey("tanzanite_ore_placed");
    public static final RegistryKey<PlacedFeature> TOPAZ_ORE_PLACED_KEY = registerKey("topaz_ore_placed");
    public static final RegistryKey<PlacedFeature> SNOWFLAKE_OBSIDIAN_ORE_PLACED_KEY = registerKey("snowflake_obsidian_ore_placed");
    public static final RegistryKey<PlacedFeature> TURQUOISE_ORE_PLACED_KEY = registerKey("turquoise_ore_placed");
    public static final RegistryKey<PlacedFeature> STARINITE_ORE_PLACED_KEY = registerKey("starinite_ore_placed");
    public static final RegistryKey<PlacedFeature> NEBULITE_ORE_PLACED_KEY = registerKey("nebulite_ore_placed");
    public static final RegistryKey<PlacedFeature> AURANITE_ORE_PLACED_KEY = registerKey("auranite_ore_placed");
    public static final RegistryKey<PlacedFeature> SUGILITE_ORE_PLACED_KEY = registerKey("sugilite_ore_placed");
    public static final RegistryKey<PlacedFeature> WHITE_PEARLITE_ORE_PLACED_KEY = registerKey("white_pearlite_ore_placed");
    public static final RegistryKey<PlacedFeature> FANTASY_PEARLITE_ORE_PLACED_KEY = registerKey("fantasy_pearlite_ore_placed");
    public static final RegistryKey<PlacedFeature> SEASHELL_PEARLITE_ORE_PLACED_KEY = registerKey("seashell_pearlite_ore_placed");
    public static final RegistryKey<PlacedFeature> AMBER_ORE_PLACED_KEY = registerKey("amber_ore_placed");
    public static final RegistryKey<PlacedFeature> APATITE_ORE_PLACED_KEY = registerKey("apatite_ore_placed");
    public static final RegistryKey<PlacedFeature> RHODOCHROSITE_ORE_PLACED_KEY = registerKey("rhodochrosite_ore_placed");
    public static final RegistryKey<PlacedFeature> NEPHRITE_ORE_PLACED_KEY = registerKey("nephrite_ore_placed");
    public static final RegistryKey<PlacedFeature> CINNABAR_ORE_PLACED_KEY = registerKey("cinnabar_ore_placed");
    public static final RegistryKey<PlacedFeature> CHALCEDONY_ORE_PLACED_KEY = registerKey("chalcedony_ore_placed");
    public static final RegistryKey<PlacedFeature> COQUINA_PLACED_KEY = registerKey("coquina_placed");
    public static final RegistryKey<PlacedFeature> COQUINA_DESERT_PLACED_KEY = registerKey("coquina_desert_placed");
    public static final RegistryKey<PlacedFeature> RAINFOREST_JASPER_ORE_PLACED_KEY = registerKey("rainforest_jasper_ore_placed");
    public static final RegistryKey<PlacedFeature> BRECCIA_PLACED_KEY = registerKey("breccia_placed");
    public static final RegistryKey<PlacedFeature> LIMESTONE_PLACED_KEY = registerKey("limestone_placed");
    public static final RegistryKey<PlacedFeature> COOL_GRANITE_PLACED_KEY = registerKey("cool_granite_placed");
    public static final RegistryKey<PlacedFeature> WARM_GRANITE_PLACED_KEY = registerKey("warm_granite_placed");
    public static final RegistryKey<PlacedFeature> DACITE_PLACED_KEY = registerKey("dacite_placed");
    public static final RegistryKey<PlacedFeature> DARK_SYENITE_PLACED_KEY = registerKey("dark_syenite_placed");
    public static final RegistryKey<PlacedFeature> PALE_SYENITE_PLACED_KEY = registerKey("pale_syenite_placed");
    public static final RegistryKey<PlacedFeature> DUNITE_PLACED_KEY = registerKey("dunite_placed");
    public static final RegistryKey<PlacedFeature> GNEISS_PLACED_KEY = registerKey("gneiss_placed");
    public static final RegistryKey<PlacedFeature> HUANITE_PLACED_KEY = registerKey("huanite_placed");
    public static final RegistryKey<PlacedFeature> PEGMATITE_PLACED_KEY = registerKey("pegmatite_placed");
    public static final RegistryKey<PlacedFeature> ROANITE_PLACED_KEY = registerKey("roanite_placed");
    public static final RegistryKey<PlacedFeature> RUSSET_SCORIA_PLACED_KEY = registerKey("russet_scoria_placed");
    public static final RegistryKey<PlacedFeature> SCORIA_PLACED_KEY = registerKey("scoria_placed");
    public static final RegistryKey<PlacedFeature> SLATE_PLACED_KEY = registerKey("slate_placed");
    public static final RegistryKey<PlacedFeature> TONGITE_PLACED_KEY = registerKey("tongite_placed");
    public static final RegistryKey<PlacedFeature> WAVE_DOLOMITE_PLACED_KEY = registerKey("wave_dolomite_placed");
    public static final RegistryKey<PlacedFeature> KAOLIN_PLACED_KEY = registerKey("kaolin_placed");
    public static final RegistryKey<PlacedFeature> AEGIRINE_PLACED_KEY = registerKey("aegirine_placed");
    public static final RegistryKey<PlacedFeature> ONYX_PLACED_KEY = registerKey("onyx_placed");
    public static final RegistryKey<PlacedFeature> IRIDOLITE_PLACED_KEY = registerKey("iridolite_placed");
    public static final RegistryKey<PlacedFeature> NITURITE_PLACED_KEY = registerKey("niturite_placed");
    public static final RegistryKey<PlacedFeature> DIABASE_PLACED_KEY = registerKey("diabase_placed");
    public static final RegistryKey<PlacedFeature> AMPHIBOLITE_PLACED_KEY = registerKey("amphibolite_placed");
    public static final RegistryKey<PlacedFeature> ARGILLITE_PLACED_KEY = registerKey("argillite_placed");
    public static final RegistryKey<PlacedFeature> ARKOSE_PLACED_KEY = registerKey("arkose_placed");
    public static final RegistryKey<PlacedFeature> AZURITE_ORE_PLACED_KEY = registerKey("azurite_ore_placed");
    public static final RegistryKey<PlacedFeature> BLUE_SPOT_JASPER_ORE_PLACED_KEY = registerKey("blue_spot_jasper_ore_placed");
    public static final RegistryKey<PlacedFeature> ALMANDINE_ORE_PLACED_KEY = registerKey("almandine_ore_placed");
    public static final RegistryKey<PlacedFeature> AMAZONITE_ORE_PLACED_KEY = registerKey("amazonite_ore_placed");
    public static final RegistryKey<PlacedFeature> BORNITE_ORE_PLACED_KEY = registerKey("bornite_ore_placed");
    public static final RegistryKey<PlacedFeature> CARNELIAN_ORE_PLACED_KEY = registerKey("carnelian_ore_placed");
    public static final RegistryKey<PlacedFeature> CHALCOPYRITE_ORE_PLACED_KEY = registerKey("chalcopyrite_ore_placed");
    public static final RegistryKey<PlacedFeature> BLUESCHIST_PLACED_KEY = registerKey("blueschist_placed");
    public static final RegistryKey<PlacedFeature> CHIASTOLITE_CROSS_PLACED_KEY = registerKey("chiastolite_cross_placed");
    public static final RegistryKey<PlacedFeature> CHIASTOLITE_TIGER_PLACED_KEY = registerKey("chiastolite_tiger_placed");
    public static final RegistryKey<PlacedFeature> CHRYSOCOLLA_ORE_PLACED_KEY = registerKey("chrysocolla_ore_placed");
    public static final RegistryKey<PlacedFeature> CITRON_CHRYSOPRASE_ORE_PLACED_KEY = registerKey("citron_chrysoprase_ore_placed");
    public static final RegistryKey<PlacedFeature> CLAYSTONE_PLACED_KEY = registerKey("claystone_placed");
    public static final RegistryKey<PlacedFeature> CLINOHUMITE_ORE_PLACED_KEY = registerKey("clinohumite_ore_placed");
    public static final RegistryKey<PlacedFeature> DIOPTASE_ORE_PLACED_KEY = registerKey("dioptase_ore_placed");
    public static final RegistryKey<PlacedFeature> DOLERITE_PLACED_KEY = registerKey("dolerite_placed");
    public static final RegistryKey<PlacedFeature> DOLOMITE_PLACED_KEY = registerKey("dolomite_placed");
    public static final RegistryKey<PlacedFeature> DUMORTIERTITE_PLACED_KEY = registerKey("dumortiertite_placed");
    public static final RegistryKey<PlacedFeature> DUMORTIERTITE_BLUE_PLACED_KEY = registerKey("dumortiertite_blue_placed");
    public static final RegistryKey<PlacedFeature> EUDIALYTE_PLACED_KEY = registerKey("eudialyte_placed");
    public static final RegistryKey<PlacedFeature> FUCHSITE_ORE_PLACED_KEY = registerKey("fuchsite_ore_placed");
    public static final RegistryKey<PlacedFeature> GABBRO_PLACED_KEY = registerKey("gabbro_placed");
    public static final RegistryKey<PlacedFeature> GARNET_ORE_PLACED_KEY = registerKey("garnet_ore_placed");
    public static final RegistryKey<PlacedFeature> GLAUCOPHANE_PLACED_KEY = registerKey("glaucophane_placed");
    public static final RegistryKey<PlacedFeature> GNEISS_MARINE_PLACED_KEY = registerKey("gneiss_marine_placed");
    public static final RegistryKey<PlacedFeature> WACKE_PLACED_KEY = registerKey("wacke_placed");
    public static final RegistryKey<PlacedFeature> GREENSTONE_PLACED_KEY = registerKey("greenstone_placed");
    public static final RegistryKey<PlacedFeature> HEMIMORPHITE_ORE_PLACED_KEY = registerKey("hemimorphite_ore_placed");
    public static final RegistryKey<PlacedFeature> HORNFELS_PLACED_KEY = registerKey("hornfels_placed");
    public static final RegistryKey<PlacedFeature> IOLITE_ORE_PLACED_KEY = registerKey("iolite_ore_placed");
    public static final RegistryKey<PlacedFeature> LABRADORITE_MIDNIGHT_ORE_PLACED_KEY = registerKey("labradorite_midnight_ore_placed");
    public static final RegistryKey<PlacedFeature> LAZULITE_ORE_PLACED_KEY = registerKey("lazulite_ore_placed");
    public static final RegistryKey<PlacedFeature> LEPIDOLITE_ORE_PLACED_KEY = registerKey("lepidolite_ore_placed");
    public static final RegistryKey<PlacedFeature> MIGMATITE_PLACED_KEY = registerKey("migmatite_placed");
    public static final RegistryKey<PlacedFeature> MONZONITE_PLACED_KEY = registerKey("monzonite_placed");
    public static final RegistryKey<PlacedFeature> MORGANITE_ORE_PLACED_KEY = registerKey("morganite_ore_placed");
    public static final RegistryKey<PlacedFeature> MUSCOVITE_PLACED_KEY = registerKey("muscovite_placed");
    public static final RegistryKey<PlacedFeature> NOVACULITE_PLACED_KEY = registerKey("novaculite_placed");
    public static final RegistryKey<PlacedFeature> NOVACULITE_GRAY_PLACED_KEY = registerKey("novaculite_gray_placed");
    public static final RegistryKey<PlacedFeature> NOVACULITE_OLIVE_PLACED_KEY = registerKey("novaculite_olive_placed");
    public static final RegistryKey<PlacedFeature> NOVACULITE_RED_PLACED_KEY = registerKey("novaculite_red_placed");
    public static final RegistryKey<PlacedFeature> OLIVINE_PLACED_KEY = registerKey("olivine_placed");
    public static final RegistryKey<PlacedFeature> ORTHOCLASE_PLACED_KEY = registerKey("orthoclase_placed");
    public static final RegistryKey<PlacedFeature> PHYLLITE_PLACED_KEY = registerKey("phyllite_placed");
    public static final RegistryKey<PlacedFeature> PINK_CORUNDUM_ORE_PLACED_KEY = registerKey("pink_corundum_ore_placed");
    public static final RegistryKey<PlacedFeature> PREHNITE_ORE_PLACED_KEY = registerKey("prehnite_ore_placed");
    public static final RegistryKey<PlacedFeature> PYRITE_ORE_PLACED_KEY = registerKey("pyrite_ore_placed");
    public static final RegistryKey<PlacedFeature> PYROMORPHITE_ORE_PLACED_KEY = registerKey("pyromorphite_ore_placed");
    public static final RegistryKey<PlacedFeature> RED_CHERT_PLACED_KEY = registerKey("red_chert_placed");
    public static final RegistryKey<PlacedFeature> RHYOLITE_PLACED_KEY = registerKey("rhyolite_placed");
    public static final RegistryKey<PlacedFeature> SHALE_PLACED_KEY = registerKey("shale_placed");
    public static final RegistryKey<PlacedFeature> SIDERITE_PLACED_KEY = registerKey("siderite_placed");
    public static final RegistryKey<PlacedFeature> SILTSTONE_PLACED_KEY = registerKey("siltstone_placed");
    public static final RegistryKey<PlacedFeature> SKARN_PLACED_KEY = registerKey("skarn_placed");
    public static final RegistryKey<PlacedFeature> SNOW_QUARTZ_PLACED_KEY = registerKey("snow_quartz_placed");
    public static final RegistryKey<PlacedFeature> SOAPSTONE_PLACED_KEY = registerKey("soapstone_placed");
    public static final RegistryKey<PlacedFeature> SOVITE_PLACED_KEY = registerKey("sovite_placed");
    public static final RegistryKey<PlacedFeature> SERPENTINITE_PLACED_KEY = registerKey("serpentinite_placed");
    public static final RegistryKey<PlacedFeature> TITANITE_ORE_PLACED_KEY = registerKey("titanite_ore_placed");
    public static final RegistryKey<PlacedFeature> SUNSTONE_ORE_PLACED_KEY = registerKey("sunstone_ore_placed");
    public static final RegistryKey<PlacedFeature> THORITE_PLACED_KEY = registerKey("thorite_placed");
    public static final RegistryKey<PlacedFeature> TIDE_STONE_ORE_PLACED_KEY = registerKey("tide_stone_ore_placed");
    public static final RegistryKey<PlacedFeature> TRACHYTE_PLACED_KEY = registerKey("trachyte_placed");
    public static final RegistryKey<PlacedFeature> TRAVERTINE_PLACED_KEY = registerKey("travertine_placed");
    public static final RegistryKey<PlacedFeature> VARISCITE_ORE_PLACED_KEY = registerKey("variscite_ore_placed");
    public static final RegistryKey<PlacedFeature> VIOLANE_PLACED_KEY = registerKey("violane_placed");
    public static final RegistryKey<PlacedFeature> YOWAH_OPAL_ORE_PLACED_KEY = registerKey("yowah_opal_ore_placed");
    public static final RegistryKey<PlacedFeature> MARBLE_PLACED_KEY = registerKey("marble_placed");
    public static final RegistryKey<PlacedFeature> JET_MARBLE_PLACED_KEY = registerKey("jet_marble_placed");
    public static final RegistryKey<PlacedFeature> PETRIFIED_ICE_ORE_PLACED_KEY = registerKey("petrified_ice_ore_placed");
    public static final RegistryKey<PlacedFeature> PETRIFIED_FIRE_ORE_PLACED_KEY = registerKey("petrified_fire_ore_placed");
    public static final RegistryKey<PlacedFeature> BERYL_PINK_ORE_PLACED_KEY = registerKey("beryl_pink_ore_placed");
    public static final RegistryKey<PlacedFeature> BERYL_GREEN_ORE_PLACED_KEY = registerKey("beryl_green_ore_placed");
    public static final RegistryKey<PlacedFeature> BERYL_TURQUOISE_ORE_PLACED_KEY = registerKey("beryl_turquoise_ore_placed");
    public static final RegistryKey<PlacedFeature> CARMELTAZITE_ORE_PLACED_KEY = registerKey("carmeltazite_ore_placed");
    public static final RegistryKey<PlacedFeature> PEACOCK_STONE_ORE_PLACED_KEY = registerKey("peacock_stone_ore_placed");
    public static final RegistryKey<PlacedFeature> FLUORITE_ORE_PLACED_KEY = registerKey("fluorite_ore_placed");
    public static final RegistryKey<PlacedFeature> CUPRITE_ORE_PLACED_KEY = registerKey("cuprite_ore_placed");
    public static final RegistryKey<PlacedFeature> TOURMALINE_ORE_PLACED_KEY = registerKey("tourmaline_ore_placed");
    public static final RegistryKey<PlacedFeature> SATINSTONE_PLACED_KEY = registerKey("satinstone_placed");
    public static final RegistryKey<PlacedFeature> VIRIDITE_PLACED_KEY = registerKey("viridite_placed");
    public static final RegistryKey<PlacedFeature> QUARTZITE_PLACED_KEY = registerKey("quartzite_placed");
    public static final RegistryKey<PlacedFeature> PERIDOTITE_PLACED_KEY = registerKey("peridotite_placed");
    public static final RegistryKey<PlacedFeature> MUDSTONE_PLACED_KEY = registerKey("mudstone_placed");
    public static final RegistryKey<PlacedFeature> HIGHLAND_STONE_PLACED_KEY = registerKey("highland_stone_placed");
    public static final RegistryKey<PlacedFeature> GRAYWACKE_PLACED_KEY = registerKey("graywacke_placed");
    public static final RegistryKey<PlacedFeature> RIDGESTONE_PLACED_KEY = registerKey("ridgestone_placed");

    public static final RegistryKey<PlacedFeature> COBALT_LUPINE_PLACED_KEY = registerKey("cobalt_lupine_placed");
    public static final RegistryKey<PlacedFeature> COTTON_GRASS_PLACED_KEY = registerKey("cotton_grass_placed");
    public static final RegistryKey<PlacedFeature> DRABA_PLACED_KEY = registerKey("draba_placed");
    public static final RegistryKey<PlacedFeature> GLACIER_BUTTERCUP_PLACED_KEY = registerKey("glacier_buttercup_placed");
    public static final RegistryKey<PlacedFeature> MOSS_CAMPION_PLACED_KEY = registerKey("moss_campion_placed");
    public static final RegistryKey<PlacedFeature> PARRAYA_PLACED_KEY = registerKey("parraya_placed");
    public static final RegistryKey<PlacedFeature> SHIVER_ROSE_PLACED_KEY = registerKey("shiver_rose_placed");
    public static final RegistryKey<PlacedFeature> SAXIFRAGE_PLACED_KEY = registerKey("saxifrage_placed");
    public static final RegistryKey<PlacedFeature> LUSH_MOSS_BLOCK_PLACED_KEY = registerKey("lush_moss_block_placed");
    public static final RegistryKey<PlacedFeature> LUSH_MOSS_PATCH_PLACED_KEY = registerKey("lush_moss_patch_placed");
    public static final RegistryKey<PlacedFeature> FLOWERS_TUNDRA_PLACED_KEY = registerKey("flowers_tundra_placed");
    public static final RegistryKey<PlacedFeature> MOSS_TUNDRA_PLACED_KEY = registerKey("moss_tundra_placed");
    public static final RegistryKey<PlacedFeature> HYDRANGEA_PLACED_KEY = registerKey("hydrangea_placed");
    public static final RegistryKey<PlacedFeature> WILD_HERBS_PLACED_KEY = registerKey("wild_herbs_placed");
    public static final RegistryKey<PlacedFeature> CHAMOMILE_PLACED_KEY = registerKey("chamomile_placed");
    public static final RegistryKey<PlacedFeature> FOXGLOVE_WHITE_PLACED_KEY = registerKey("foxglove_white_placed");
    public static final RegistryKey<PlacedFeature> FOXGLOVE_YELLOW_PLACED_KEY = registerKey("foxglove_yellow_placed");
    public static final RegistryKey<PlacedFeature> FOXGLOVE_PINK_PLACED_KEY = registerKey("foxglove_pink_placed");
    public static final RegistryKey<PlacedFeature> HOLLYHOCK_PINK_PLACED_KEY = registerKey("hollyhock_pink_placed");
    public static final RegistryKey<PlacedFeature> HOLLYHOCK_BLACK_PLACED_KEY = registerKey("hollyhock_black_placed");
    public static final RegistryKey<PlacedFeature> HOLLYHOCK_YELLOW_PLACED_KEY = registerKey("hollyhock_yellow_placed");
    public static final RegistryKey<PlacedFeature> DELPHINIUM_BLUE_PLACED_KEY = registerKey("delphinium_blue_placed");
    public static final RegistryKey<PlacedFeature> DELPHINIUM_INDIGO_PLACED_KEY = registerKey("delphinium_indigo_placed");
    public static final RegistryKey<PlacedFeature> CLOVER_PATCH_PLACED_KEY = registerKey("clover_patch_placed");
    public static final RegistryKey<PlacedFeature> MARIGOLD_PLACED_KEY = registerKey("marigold_placed");
    public static final RegistryKey<PlacedFeature> GOLDENROD_PLACED_KEY = registerKey("goldenrod_placed");
    public static final RegistryKey<PlacedFeature> DANDELION_SEED_PLACED_KEY = registerKey("dandelion_seed_placed");
    public static final RegistryKey<PlacedFeature> PANSY_RED_PLACED_KEY = registerKey("pansy_red_placed");
    public static final RegistryKey<PlacedFeature> PANSY_ORANGE_PLACED_KEY = registerKey("pansy_orange_placed");
    public static final RegistryKey<PlacedFeature> PANSY_WHITE_PLACED_KEY = registerKey("pansy_white_placed");
    public static final RegistryKey<PlacedFeature> PANSY_PURPLE_PLACED_KEY = registerKey("pansy_purple_placed");
    public static final RegistryKey<PlacedFeature> PANSY_PINK_PLACED_KEY = registerKey("pansy_pink_placed");
    public static final RegistryKey<PlacedFeature> HYACINTH_RED_PLACED_KEY = registerKey("hyacinth_red_placed");
    public static final RegistryKey<PlacedFeature> HYACINTH_BLUE_PLACED_KEY = registerKey("hyacinth_blue_placed");
    public static final RegistryKey<PlacedFeature> HYACINTH_WHITE_PLACED_KEY = registerKey("hyacinth_white_placed");
    public static final RegistryKey<PlacedFeature> HYACINTH_PURPLE_PLACED_KEY = registerKey("hyacinth_purple_placed");
    public static final RegistryKey<PlacedFeature> HYACINTH_PINK_PLACED_KEY = registerKey("hyacinth_pink_placed");
    public static final RegistryKey<PlacedFeature> SUNFLOWER_ORNAMENTAL_PLACED_KEY = registerKey("sunflower_ornamental_placed");
    public static final RegistryKey<PlacedFeature> SUNFLOWER_ORNAMENTAL_TWO_PLACED_KEY = registerKey("sunflower_ornamental_two_placed");
    public static final RegistryKey<PlacedFeature> SUNFLOWER_ORNAMENTAL_THREE_PLACED_KEY = registerKey("sunflower_ornamental_three_placed");
    public static final RegistryKey<PlacedFeature> SUNFLOWER_ORNAMENTAL_FOUR_PLACED_KEY = registerKey("sunflower_ornamental_four_placed");
    public static final RegistryKey<PlacedFeature> SUNFLOWER_ORNAMENTAL_FIVE_PLACED_KEY = registerKey("sunflower_ornamental_five_placed");
    public static final RegistryKey<PlacedFeature> SUNFLOWER_ORNAMENTAL_SIX_PLACED_KEY = registerKey("sunflower_ornamental_six_placed");
    public static final RegistryKey<PlacedFeature> BLACK_CHERRY_TREE_PLACED_KEY = registerKey("black_cherry_tree_placed");
    public static final RegistryKey<PlacedFeature> STEWARTIA_PLACED_KEY = registerKey("stewartia_placed");
    public static final RegistryKey<PlacedFeature> AUTUMN_STEWARTIA_PLACED_KEY = registerKey("autumn_stewartia_placed");
    public static final RegistryKey<PlacedFeature> TREES_ASPEN_WOODS_PLACED = registerKey("trees_aspen_woods_placed");
    public static final RegistryKey<PlacedFeature> MONSTERA_KEY_PLACED = registerKey("monstera_placed");
    public static final RegistryKey<PlacedFeature> TARO_PLANT_KEY_PLACED = registerKey("taro_plant_placed");
    public static final RegistryKey<PlacedFeature> BANANA_TREE_KEY_PLACED = registerKey("banana_tree_placed");
    public static final RegistryKey<PlacedFeature> ARECA_PALM_KEY_PLACED = registerKey("areca_palm_placed");
    public static final RegistryKey<PlacedFeature> SNAKE_PLANT_KEY_PLACED = registerKey("snake_plant_placed");
    public static final RegistryKey<PlacedFeature> MONEY_TREE_KEY_PLACED = registerKey("money_tree_placed");
    public static final RegistryKey<PlacedFeature> PARLOUR_PALM_KEY_PLACED = registerKey("parlour_palm_placed");
    public static final RegistryKey<PlacedFeature> DRAGON_TREE_KEY_PLACED = registerKey("dragon_tree_placed");
    public static final RegistryKey<PlacedFeature> FAN_PALM_KEY_PLACED = registerKey("fan_palm_placed");
    public static final RegistryKey<PlacedFeature> FERN_TAIGA_KEY_PLACED = registerKey("fern_taiga_placed");
    public static final RegistryKey<PlacedFeature> FERN_JUNGLE_KEY_PLACED = registerKey("fern_jungle_placed");
    public static final RegistryKey<PlacedFeature> FERN_DAINTY_KEY_PLACED = registerKey("fern_dainty_placed");

    public static final RegistryKey<PlacedFeature> MUSHROOM_BLACK_AMANITA_PLACED_KEY = registerKey("mushroom_black_amanita_placed");
    public static final RegistryKey<PlacedFeature> MUSHROOM_BLUE_OYSTER_PLACED_KEY = registerKey("mushroom_blue_oyster_placed");
    public static final RegistryKey<PlacedFeature> MUSHROOM_CHANTERELLE_PLACED_KEY = registerKey("mushroom_chanterelle_placed");
    public static final RegistryKey<PlacedFeature> MUSHROOM_DEATH_TRUMPET_PLACED_KEY = registerKey("mushroom_death_trumpet_placed");
    public static final RegistryKey<PlacedFeature> MUSHROOM_GREEN_RUSSULA_PLACED_KEY = registerKey("mushroom_green_russula_placed");
    public static final RegistryKey<PlacedFeature> MUSHROOM_HONEY_PLACED_KEY = registerKey("mushroom_honey_placed");
    public static final RegistryKey<PlacedFeature> MUSHROOM_INKY_CAP_PLACED_KEY = registerKey("mushroom_inky_cap_placed");
    public static final RegistryKey<PlacedFeature> MUSHROOM_LILAC_RUSSULA_PLACED_KEY = registerKey("mushroom_lilac_russula_placed");
    public static final RegistryKey<PlacedFeature> MUSHROOM_MOREL_PLACED_KEY = registerKey("mushroom_morel_placed");
    public static final RegistryKey<PlacedFeature> MUSHROOM_ORANGE_CAP_BOLETE_PLACED_KEY = registerKey("mushroom_orange_cap_bolete_placed");
    public static final RegistryKey<PlacedFeature> MUSHROOM_PINK_OYSTER_PLACED_KEY = registerKey("mushroom_pink_oyster_placed");
    public static final RegistryKey<PlacedFeature> MUSHROOM_PIXIE_CAP_PLACED_KEY = registerKey("mushroom_pixie_cap_placed");
    public static final RegistryKey<PlacedFeature> MUSHROOM_RED_AMANITA_PLACED_KEY = registerKey("mushroom_red_amanita_placed");
    public static final RegistryKey<PlacedFeature> MUSHROOM_SHAGGY_MANE_PLACED_KEY = registerKey("mushroom_shaggy_mane_placed");
    public static final RegistryKey<PlacedFeature> MUSHROOM_YELLOW_OYSTER_PLACED_KEY = registerKey("mushroom_yellow_oyster_placed");
    public static final RegistryKey<PlacedFeature> MUSHROOM_BRILLIOME_PLACED_KEY = registerKey("mushroom_brilliome_placed");

    public static final RegistryKey<PlacedFeature> ALOE_VERA_PLACED_KEY = registerKey("aloe_vera_placed");
    public static final RegistryKey<PlacedFeature> ANTELOPE_BRUSH_PLACED_KEY = registerKey("antelope_brush_placed");
    public static final RegistryKey<PlacedFeature> ANTELOPE_BRUSH_FLOWERING_PLACED_KEY = registerKey("antelope_brush_flowering_placed");
    public static final RegistryKey<PlacedFeature> ARROWLEAF_BALSAMROOT_PLACED_KEY = registerKey("arrowleaf_balsamroot_placed");
    public static final RegistryKey<PlacedFeature> BARREL_CACTUS_PLACED_KEY = registerKey("barrel_cactus_placed");
    public static final RegistryKey<PlacedFeature> BIG_SAGEBRUSH_PLACED_KEY = registerKey("big_sagebrush_placed");
    public static final RegistryKey<PlacedFeature> SAGEBRUSH_PLACED_KEY = registerKey("sagebrush_placed");
    public static final RegistryKey<PlacedFeature> BITTERROOT_PLACED_KEY = registerKey("bitterroot_placed");
    public static final RegistryKey<PlacedFeature> BLUE_AGAVE_PLACED_KEY = registerKey("blue_agave_placed");
    public static final RegistryKey<PlacedFeature> BUNCHGRASS_LARGE_PLACED_KEY = registerKey("bunchgrass_large_placed");
    public static final RegistryKey<PlacedFeature> BUNCHGRASS_TALL_PLACED_KEY = registerKey("bunchgrass_tall_placed");
    public static final RegistryKey<PlacedFeature> SEA_OATS_PLACED_KEY = registerKey("sea_oats_placed");
    public static final RegistryKey<PlacedFeature> BUNCHGRASS_MEDIUM_PLACED_KEY = registerKey("bunchgrass_medium_placed");
    public static final RegistryKey<PlacedFeature> BUNCHGRASS_SMALL_PLACED_KEY = registerKey("bunchgrass_small_placed");
    public static final RegistryKey<PlacedFeature> HUACHUMA_PLACED_KEY = registerKey("huachuma_placed");
    public static final RegistryKey<PlacedFeature> TAMARISK_FLOWERING_PLACED_KEY = registerKey("tamarisk_flowering_placed");
    public static final RegistryKey<PlacedFeature> TAMARISK_PLACED_KEY = registerKey("tamarisk_placed");
    public static final RegistryKey<PlacedFeature> MARIPOSA_LILY_PLACED_KEY = registerKey("mariposa_lily_placed");
    public static final RegistryKey<PlacedFeature> PIPE_ORGAN_CACTUS_PLACED = registerKey("pipe_organ_cactus_placed");
    public static final RegistryKey<PlacedFeature> PRICKLY_PEAR_PLACED = registerKey("prickly_pear_placed");
    public static final RegistryKey<PlacedFeature> RABBIT_BRUSH_PLACED = registerKey("rabbit_brush_placed");
    public static final RegistryKey<PlacedFeature> SOAPTREE_YUCCA_PLACED = registerKey("soaptree_yucca_placed");
    public static final RegistryKey<PlacedFeature> DUNE_PRIMROSE_PLACED = registerKey("dune_primrose_placed");
    public static final RegistryKey<PlacedFeature> GAZANIA_WHITE_PLACED = registerKey("gazania_white_placed");
    public static final RegistryKey<PlacedFeature> GAZANIA_YELLOW_PLACED = registerKey("gazania_yellow_placed");
    public static final RegistryKey<PlacedFeature> GAZANIA_ORANGE_PLACED = registerKey("gazania_orange_placed");
    public static final RegistryKey<PlacedFeature> VERBENA_WHITE_PLACED = registerKey("verbena_white_placed");
    public static final RegistryKey<PlacedFeature> VERBENA_YELLOW_PLACED = registerKey("verbena_yellow_placed");
    public static final RegistryKey<PlacedFeature> VERBENA_PINK_PLACED = registerKey("verbena_pink_placed");
    public static final RegistryKey<PlacedFeature> BROMELIAD_PLACED = registerKey("bromeliad_placed");
    public static final RegistryKey<PlacedFeature> BLUEBELLS_PLACED = registerKey("bluebells_placed");
    public static final RegistryKey<PlacedFeature> ANEMONE_PURPLE_PLACED = registerKey("anemone_purple_placed");
    public static final RegistryKey<PlacedFeature> ANEMONE_WHITE_PLACED = registerKey("anemone_white_placed");
    public static final RegistryKey<PlacedFeature> ANEMONE_YELLOW_PLACED = registerKey("anemone_yellow_placed");
    public static final RegistryKey<PlacedFeature> GARDENIA_PLACED = registerKey("gardenia_placed");
    public static final RegistryKey<PlacedFeature> PURPLE_WILDFLOWER_PLACED = registerKey("purple_wildflower_placed");
    public static final RegistryKey<PlacedFeature> YELLOW_WILDFLOWER_PLACED = registerKey("yellow_wildflower_placed");
    public static final RegistryKey<PlacedFeature> VIOLET_PLACED = registerKey("violet_placed");
    public static final RegistryKey<PlacedFeature> WILD_RICE_PLACED = registerKey("wild_rice_placed");
    public static final RegistryKey<PlacedFeature> WILD_STRAWBERRY_BUSH_RED_PLACED = registerKey("wild_strawberry_bush_red_placed");
    public static final RegistryKey<PlacedFeature> WILD_STRAWBERRY_BUSH_WHITE_PLACED = registerKey("wild_strawberry_bush_white_placed");
    public static final RegistryKey<PlacedFeature> PINK_DAFFODIL_PLACED = registerKey("pink_daffodil_placed");
    public static final RegistryKey<PlacedFeature> PINK_HIBISCUS_PLACED = registerKey("pink_hibiscus_placed");
    public static final RegistryKey<PlacedFeature> LAVENDER_FLOWER_PLACED = registerKey("lavender_flower_placed");
    public static final RegistryKey<PlacedFeature> ICY_IRIS_PLACED = registerKey("icy_iris_placed");
    public static final RegistryKey<PlacedFeature> THORNY_BRAMBLE_PLACED = registerKey("thorny_bramble_placed");
    public static final RegistryKey<PlacedFeature> HIBISCUS_BUSH_PLACED = registerKey("hibiscus_bush_placed");
    public static final RegistryKey<PlacedFeature> ROSE_OF_SHARON_BUSH_PLACED = registerKey("rose_of_sharon_bush_placed");

    public static final RegistryKey<PlacedFeature> TITANIUM_QUARTZ_GEODE_PLACED = registerKey("titanium_quartz_geode_placed");
    public static final RegistryKey<PlacedFeature> ROSE_QUARTZ_GEODE_PLACED = registerKey("rose_quartz_geode_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, RED_MAPLE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(TakieTerraConfiguredFeatures.RED_MAPLE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.01f, 2), TakieTerraTreeBlocks.RED_MAPLE_SAPLING));

        register(context, RED_MAPLE_HIGH_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(TakieTerraConfiguredFeatures.RED_MAPLE_HIGH_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.01f, 2), TakieTerraTreeBlocks.RED_MAPLE_HIGH_SAPLING));

        register(context, RED_MAPLE_MID_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(TakieTerraConfiguredFeatures.RED_MAPLE_MID_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.01f, 2), TakieTerraTreeBlocks.RED_MAPLE_MID_SAPLING));

        register(context, RED_MAPLE_LOW_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(TakieTerraConfiguredFeatures.RED_MAPLE_LOW_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.01f, 2), TakieTerraTreeBlocks.RED_MAPLE_LOW_SAPLING));

        register(context, JACARANDA_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(TakieTerraConfiguredFeatures.JACARANDA_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.01f, 2), TakieTerraTreeBlocks.JACARANDA_SAPLING));

        register(context, MANGO_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(TakieTerraConfiguredFeatures.MANGO_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.01f, 2), TakieTerraTreeBlocks.MANGO_SAPLING));

        register(context, AUTUMN_ASPEN_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(TakieTerraConfiguredFeatures.AUTUMN_ASPEN_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.01f, 2), TakieTerraTreeBlocks.AUTUMN_ASPEN_SAPLING));

        register(context, WALNUT_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(TakieTerraConfiguredFeatures.WALNUT_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.01f, 2), TakieTerraTreeBlocks.WALNUT_SAPLING));

        register(context, WILLOW_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(TakieTerraConfiguredFeatures.WILLOW_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.01f, 2), TakieTerraTreeBlocks.WILLOW_SAPLING));

        register(context, RAINBOW_GUM_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(TakieTerraConfiguredFeatures.RAINBOW_GUM_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.01f, 2), TakieTerraTreeBlocks.RAINBOW_GUM_SAPLING));

        register(context, PEAR_TREE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(TakieTerraConfiguredFeatures.HUGE_PEAR),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.01f, 2), PearBlocks.PEAR_SAPLING));

        register(context, PALO_VERDE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(TakieTerraConfiguredFeatures.PALO_VERDE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.01f, 2), TakieTerraTreeBlocks.PALO_VERDE_SAPLING));


        register(context, FALLEN_LEAVES_AUTUMN_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(TakieTerraConfiguredFeatures.FALLEN_LEAVES_AUTUMN_KEY),
                CountPlacementModifier.of(256));


        register(context, OPAL_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(TakieTerraConfiguredFeatures.OPAL_ORE_KEY),
                TakieTerraOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(32))));

        register(context, SEA_OPAL_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(TakieTerraConfiguredFeatures.OPAL_ORE_KEY),
                TakieTerraOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(32))));

        register(context, TITANIUM_QUARTZ_GEODE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(TakieTerraConfiguredFeatures.TITANIUM_QUARTZ_GEODE),
        TakieTerraOrePlacement.modifiersWithRarity(24,
                HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6), YOffset.fixed(30))));


        register(context, ROSE_QUARTZ_GEODE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(TakieTerraConfiguredFeatures.ROSE_QUARTZ_GEODE),
                TakieTerraOrePlacement.modifiersWithRarity(24,
                        HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6), YOffset.fixed(30))));

        register(context, LUSH_MOSS_BLOCK_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(TakieTerraConfiguredFeatures.LUSH_MOSS_BLOCK_KEY));
        register(context, LUSH_MOSS_PATCH_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(TakieTerraConfiguredFeatures.LUSH_MOSS_PATCH_KEY));
        register(context, COBALT_LUPINE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(TakieTerraConfiguredFeatures.COBALT_LUPINE_KEY));
        register(context, COTTON_GRASS_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(TakieTerraConfiguredFeatures.COTTON_GRASS_KEY));
        register(context, DRABA_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(TakieTerraConfiguredFeatures.DRABA_KEY));
        register(context, GLACIER_BUTTERCUP_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(TakieTerraConfiguredFeatures.GLACIER_BUTTERCUP_KEY));
        register(context, MOSS_CAMPION_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(TakieTerraConfiguredFeatures.MOSS_CAMPION_KEY));
        register(context, PARRAYA_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(TakieTerraConfiguredFeatures.PARRAYA_KEY));
        register(context, SAXIFRAGE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(TakieTerraConfiguredFeatures.SAXIFRAGE_KEY));
        register(context, FLOWERS_TUNDRA_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(TakieTerraConfiguredFeatures.FLOWER_TUNDRA));
        register(context, MOSS_TUNDRA_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(TakieTerraConfiguredFeatures.MOSS_TUNDRA_KEY));
        register(context, HYDRANGEA_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(TakieTerraConfiguredFeatures.HYDRANGEA_KEY));
        register(context, TREES_ASPEN_WOODS_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(TakieTerraConfiguredFeatures.TREES_ASPEN_WOODS));


    }


    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(TakieTerraMod.MOD_ID, name));
    }


    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}