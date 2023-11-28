package net.takie.takieterra.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.takie.takieterra.TakieTerraMod;

public class TakieTerraTags {

    //public static final TagKey<Block> INSERT_SOMETHING_BLOCKS =
    //         createBlockTag( "insert_something_block");

    public static class Blocks {

        public static final TagKey<Block> SAND_REPLACEABLES =
                createBlockTag("sand_replaceables");
        public static final TagKey<Block> PEAR_LOGS =
                createCommonBlockTag("pear_logs");
        public static final TagKey<Block> HUGE_PEAR_CANNOT_REPLACE =
                createCommonBlockTag("huge_pear_cannot_replace");
        public static final TagKey<Block> PEAR_GROWABLE_ON =
                createCommonBlockTag("pear_growable_on");
        public static final TagKey<Block> BRILLIOME_GROW_BLOCK =
                createCommonBlockTag("brilliome_grow_block");

        public static final TagKey<Block> HEAT_SOURCES =
                createCommonBlockTag("heat_sources");
        public static final TagKey<Block> HEAT_CONDUCTORS =
                createCommonBlockTag("heat_conductors");
        public static final TagKey<Block> TRAY_HEAT_SOURCES =
                createCommonBlockTag("tray_heat_sources");

        public static final TagKey<Block> GRAPE_VINES =
                createCommonBlockTag("grape_vines");
        public static final TagKey<Block> WISTERIA =
                createCommonBlockTag("wisteria");


        private static TagKey<Block> createBlockTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(TakieTerraMod.MOD_ID, name));
        }

        private static TagKey<Block> createCommonBlockTag(String name) {

            return TagKey.of(RegistryKeys.BLOCK, new Identifier("c", name));
        }


        public static class Items {

            public static final TagKey<Item> PEAR_LOGS = createCommonItemTag("pear_logs");
            public static final TagKey<Item> FRUITS_PEARS = createCommonItemTag("fruits/pears");
            public static final TagKey<Item> PIZZA_VEGETABLE = createCommonItemTag("pizza_vegetable");
            public static final TagKey<Item> MUSHROOMS_TOXIC = createCommonItemTag("mushrooms_toxic");
            public static final TagKey<Item> MUSHROOMS_TASTY = createCommonItemTag("mushrooms_tasty");

            public static final TagKey<Item> RED_MAPLE_LOGS =
                    createCommonItemTag("red_maple_logs");

            public static final TagKey<Item> MANGO_LOGS =
                    createCommonItemTag("mango_logs");

            public static final TagKey<Item> JACARANDA_LOGS =
                    createCommonItemTag("jacaranda_logs");

            public static final TagKey<Item> AUTUMN_ASPEN_LOGS =
                    createCommonItemTag("autumn_aspen_logs");

            public static final TagKey<Item> COCONUT_LOGS =
                    createCommonItemTag("coconut_logs");

            public static final TagKey<Item> WILLOW_LOGS =
                    createCommonItemTag("willow_logs");

            public static final TagKey<Item> WALNUT_LOGS =
                    createCommonItemTag("walnut_logs");
            public static final TagKey<Item> RAINBOW_GUM_LOGS =
                    createCommonItemTag("rainbow_gum_logs");
            public static final TagKey<Item> DEAD_LOGS =
                    createCommonItemTag("dead_logs");
            public static final TagKey<Item> PALO_VERDE_LOGS =
                    createCommonItemTag("palo_verde_logs");
            public static final TagKey<Item> PLUM_LOGS =
                    createCommonItemTag("plum_logs");
            public static final TagKey<Item> PEACH_LOGS =
                    createCommonItemTag("peach_logs");
            public static final TagKey<Item> ZEBRAWOOD_LOGS =
                    createCommonItemTag("zebrawood_logs");
            public static final TagKey<Item> BLUE_GUM_LOGS =
                    createCommonItemTag("blue_gum_logs");
            public static final TagKey<Item> PONDEROSA_PINE_LOGS =
                    createCommonItemTag("ponderosa_pine_logs");
            public static final TagKey<Item> KNOBCONE_PINE_LOGS =
                    createCommonItemTag("knobcone_pine_logs");
            public static final TagKey<Item> MAHOGANY_LOGS =
                    createCommonItemTag("mahogany_logs");
            public static final TagKey<Item> EBONY_LOGS =
                    createCommonItemTag("ebony_logs");
            public static final TagKey<Item> IRONWOOD_LOGS =
                    createCommonItemTag("ironwood_logs");
            public static final TagKey<Item> CAMELLIA_LOGS =
                    createCommonItemTag("camellia_logs");
            public static final TagKey<Item> GINKGO_LOGS =
                    createCommonItemTag("ginkgo_logs");
            public static final TagKey<Item> SYCAMORE_LOGS =
                    createCommonItemTag("sycamore_logs");
            public static final TagKey<Item> MANDARIN_LOGS =
                    createCommonItemTag("mandarin_logs");
            public static final TagKey<Item> BLACK_CHERRY_LOGS =
                    createCommonItemTag("black_cherry_logs");
            public static final TagKey<Item> OLIVE_LOGS =
                    createCommonItemTag("olive_logs");
            public static final TagKey<Item> LEMON_LOGS =
                    createCommonItemTag("lemon_logs");
            public static final TagKey<Item> LIME_LOGS =
                    createCommonItemTag("lime_logs");
            public static final TagKey<Item> LAPACHO_LOGS =
                    createCommonItemTag("lapacho_logs");
            public static final TagKey<Item> SNOW_GHOST_LOGS =
                    createCommonItemTag("snow_ghost_logs");
            public static final TagKey<Item> SCINTILLA_LOGS =
                    createCommonItemTag("scintilla_logs");
            public static final TagKey<Item> WINTER_BLOSSOM_LOGS =
                    createCommonItemTag("winter_blossom_logs");
            public static final TagKey<Item> CAMPHOR_LOGS =
                    createCommonItemTag("camphor_logs");
            public static final TagKey<Item> KAURI_LOGS =
                    createCommonItemTag("kauri_logs");
            public static final TagKey<Item> BALD_CYPRESS_LOGS =
                    createCommonItemTag("bald_cypress_logs");
            public static final TagKey<Item> STEWARTIA_LOGS =
                    createCommonItemTag("stewartia_logs");
            public static final TagKey<Item> AUTUMN_STEWARTIA_LOGS =
                    createCommonItemTag("autumn_stewartia_logs");
            public static final TagKey<Item> CINNAMON_LOGS =
                    createCommonItemTag("cinnamon_logs");
            public static final TagKey<Item> MOSSY_HEART_LOGS =
                    createCommonItemTag("mossy_heart_logs");
            public static final TagKey<Item> MYRTA_LOGS =
                    createCommonItemTag("myrta_logs");
            public static final TagKey<Item> YELLOWWOOD_LOGS =
                    createCommonItemTag("yellowwood_logs");
            public static final TagKey<Item> JUNIPER_LOGS =
                    createCommonItemTag("juniper_logs");
            public static final TagKey<Item> SWEETGUM_LOGS =
                    createCommonItemTag("sweetgum_logs");
            public static final TagKey<Item> AEGIA_LOGS =
                    createCommonItemTag("aegia_logs");
            public static final TagKey<Item> NOMERIA_LOGS =
                    createCommonItemTag("nomeria_logs");
            public static final TagKey<Item> FLAMEBARK_LOGS =
                    createCommonItemTag("flamebark_logs");
            public static final TagKey<Item> INDIKO_LOGS =
                    createCommonItemTag("indiko_logs");
            public static final TagKey<Item> ZISSIAN_LOGS =
                    createCommonItemTag("zissian_logs");
            public static final TagKey<Item> REDWOOD_LOGS =
                    createCommonItemTag("redwood_logs");
            public static final TagKey<Item> SEQUOIA_LOGS =
                    createCommonItemTag("sequoia_logs");
            public static final TagKey<Item> BEECH_LOGS =
                    createCommonItemTag("beech_logs");
            public static final TagKey<Item> LARCH_LOGS =
                    createCommonItemTag("larch_logs");
            public static final TagKey<Item> FIR_LOGS =
                    createCommonItemTag("fir_logs");
            public static final TagKey<Item> PARASHOREA_LOGS =
                    createCommonItemTag("parashorea_logs");
            public static final TagKey<Item> MADRONE_LOGS =
                    createCommonItemTag("madrone_logs");
            public static final TagKey<Item> PECAN_LOGS =
                    createCommonItemTag("pecan_logs");
            public static final TagKey<Item> ZELKOVA_LOGS =
                    createCommonItemTag("zelkova_logs");
            public static final TagKey<Item> AUTUMN_ZELKOVA_LOGS =
                    createCommonItemTag("autumn_zelkova_logs");
            public static final TagKey<Item> MIMOSA_LOGS =
                    createCommonItemTag("mimosa_logs");
            public static final TagKey<Item> WITCH_HAZEL_LOGS =
                    createCommonItemTag("witch_hazel_logs");
            public static final TagKey<Item> WISTERIA_LOGS =
                    createCommonItemTag("wisteria_logs");
            public static final TagKey<Item> TOONA_LOGS =
                    createCommonItemTag("toona_logs");
            public static final TagKey<Item> GHAT_LOGS =
                    createCommonItemTag("ghat_logs");
            public static final TagKey<Item> BLACK_PINE_LOGS =
                    createCommonItemTag("black_pine_logs");
            public static final TagKey<Item> SWAMP_SYLPH_LOGS =
                    createCommonItemTag("swamp_sylph_logs");
            public static final TagKey<Item> KOBICHA_LOGS =
                    createCommonItemTag("kobicha_logs");
            public static final TagKey<Item> ROYA_LOGS =
                    createCommonItemTag("roya_logs");
            public static final TagKey<Item> NEBRA_LOGS =
                    createCommonItemTag("nebra_logs");
            public static final TagKey<Item> CASSIA_LOGS =
                    createCommonItemTag("cassia_logs");
            public static final TagKey<Item> HOLLY_LOGS =
                    createCommonItemTag("holly_logs");
            public static final TagKey<Item> SEABREEZE_LOGS =
                    createCommonItemTag("seabreeze_logs");
            public static final TagKey<Item> PEONIA_LOGS =
                    createCommonItemTag("peonia_logs");
            public static final TagKey<Item> STRAWBERRY_LOGS =
                    createCommonItemTag("strawberry_logs");
            public static final TagKey<Item> CEDAR_LOGS =
                    createCommonItemTag("cedar_logs");
            public static final TagKey<Item> CHISAI_LOGS =
                    createCommonItemTag("chisai_logs");
            public static final TagKey<Item> HERBS =
                    createCommonItemTag("herbs");
            public static final TagKey<Item> AUTUMN_LEAVES =
                    createCommonItemTag("autumn_leaves");
            public static final TagKey<Item> GRAPE_VINES =
                    createCommonItemTag("grape_vines");
            public static final TagKey<Item> WISTERIA =
                    createCommonItemTag("wisteria");


            private static TagKey<Item> createItemTag(String name) {
                return TagKey.of(RegistryKeys.ITEM, new Identifier(TakieTerraMod.MOD_ID, name));

            }

            private static TagKey<Item> createCommonItemTag(String name) {
                return TagKey.of(RegistryKeys.ITEM, new Identifier("c", name));

            }
        }
    }
}
