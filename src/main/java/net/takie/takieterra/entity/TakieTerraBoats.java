package net.takie.takieterra.entity;

import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.takie.takieterra.TakieTerraMod;
import net.takie.takieterra.block.TakieTerraBlocks;
import net.takie.takieterra.block.TakieTerraTreeBlocks;
import net.takie.takieterra.item.TakieTerraItems;

public class TakieTerraBoats {
    public static final Identifier RAINBOW_GUM_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "rainbow_gum_boat");
    public static final Identifier RAINBOW_GUM_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "rainbow_gum_chest_boat");
    public static final Identifier WILLOW_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "willow_boat");
    public static final Identifier WILLOW_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "willow_chest_boat");
    public static final Identifier EBONY_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "ebony_boat");
    public static final Identifier EBONY_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "ebony_chest_boat");
    public static final Identifier PEAR_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "pear_boat");
    public static final Identifier PEAR_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "pear_chest_boat");
    public static final Identifier PINE_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "pine_boat");
    public static final Identifier PINE_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "pine_chest_boat");
    public static final Identifier RED_MAPLE_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "red_maple_boat");
    public static final Identifier RED_MAPLE_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "red_maple_chest_boat");
    public static final Identifier WALNUT_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "walnut_boat");
    public static final Identifier WALNUT_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "walnut_chest_boat");
    public static final Identifier AUTUMN_ASPEN_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "autumn_aspen_boat");
    public static final Identifier AUTUMN_ASPEN_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "autumn_aspen_chest_boat");
    public static final Identifier BLUE_GUM_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "blue_gum_boat");
    public static final Identifier BLUE_GUM_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "blue_gum_chest_boat");
    public static final Identifier AEGIA_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "aegia_boat");
    public static final Identifier AEGIA_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "aegia_chest_boat");
    public static final Identifier LARCH_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "larch_boat");
    public static final Identifier LARCH_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "larch_chest_boat");
    public static final Identifier BALD_CYPRESS_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "bald_cypress_boat");
    public static final Identifier BALD_CYPRESS_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "bald_cypress_chest_boat");
    public static final Identifier BEECH_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "beech_boat");
    public static final Identifier BEECH_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "beech_chest_boat");
    public static final Identifier CAMPHOR_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "camphor_boat");
    public static final Identifier CAMPHOR_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "camphor_chest_boat");
    public static final Identifier CAMELLIA_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "camellia_boat");
    public static final Identifier CAMELLIA_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "camellia_chest_boat");
    public static final Identifier REDWOOD_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "redwood_boat");
    public static final Identifier REDWOOD_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "redwood_chest_boat");
    public static final Identifier DEAD_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "dead_boat");
    public static final Identifier DEAD_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "dead_chest_boat");
    public static final Identifier FIR_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "fir_boat");
    public static final Identifier FIR_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "fir_chest_boat");
    public static final Identifier TOONA_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "toona_boat");
    public static final Identifier TOONA_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "toona_chest_boat");
    public static final Identifier GHAF_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "ghaf_boat");
    public static final Identifier GHAF_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "ghaf_chest_boat");
    public static final Identifier SEQUOIA_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "sequoia_boat");
    public static final Identifier SEQUOIA_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "sequoia_chest_boat");
    public static final Identifier GINKGO_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "ginkgo_boat");
    public static final Identifier GINKGO_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "ginkgo_chest_boat");
    public static final Identifier INDIKO_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "indiko_boat");
    public static final Identifier INDIKO_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "indiko_chest_boat");
    public static final Identifier IRONWOOD_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "ironwood_boat");
    public static final Identifier IRONWOOD_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "ironwood_chest_boat");
    public static final Identifier JACARANDA_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "jacaranda_boat");
    public static final Identifier JACARANDA_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "jacaranda_chest_boat");
    public static final Identifier JUNIPER_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "juniper_boat");
    public static final Identifier JUNIPER_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "juniper_chest_boat");
    public static final Identifier KAURI_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "kauri_boat");
    public static final Identifier KAURI_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "kauri_chest_boat");
    public static final Identifier KOBICHA_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "kobicha_boat");
    public static final Identifier KOBICHA_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "kobicha_chest_boat");
    public static final Identifier LAPACHO_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "lapacho_boat");
    public static final Identifier LAPACHO_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "lapacho_chest_boat");
    public static final Identifier MAHOGANY_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "mahogany_boat");
    public static final Identifier MAHOGANY_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "mahogany_chest_boat");
    public static final Identifier MADRONE_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "madrone_boat");
    public static final Identifier MADRONE_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "madrone_chest_boat");
    public static final Identifier MANGO_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "mango_boat");
    public static final Identifier MANGO_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "mango_chest_boat");
    public static final Identifier MIMOSA_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "mimosa_boat");
    public static final Identifier MIMOSA_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "mimosa_chest_boat");
    public static final Identifier MOSSY_HEART_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "mossy_heart_boat");
    public static final Identifier MOSSY_HEART_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "mossy_heart_chest_boat");
    public static final Identifier MYRTA_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "myrta_boat");
    public static final Identifier MYRTA_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "myrta_chest_boat");
    public static final Identifier NOMERIA_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "nomeria_boat");
    public static final Identifier NOMERIA_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "nomeria_chest_boat");
    public static final Identifier PALO_VERDE_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "palo_verde_boat");
    public static final Identifier PALO_VERDE_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "palo_verde_chest_boat");
    public static final Identifier PARASHOREA_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "parashorea_boat");
    public static final Identifier PARASHOREA_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "parashorea_chest_boat");
    public static final Identifier PECAN_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "pecan_boat");
    public static final Identifier PECAN_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "pecan_chest_boat");
    public static final Identifier ROYA_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "roya_boat");
    public static final Identifier ROYA_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "roya_chest_boat");
    public static final Identifier SNOW_GHOST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "snow_ghost_boat");
    public static final Identifier SNOW_GHOST_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "snow_ghost_chest_boat");
    public static final Identifier STEWARTIA_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "stewartia_boat");
    public static final Identifier STEWARTIA_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "stewartia_chest_boat");
    public static final Identifier AUTUMN_STEWARTIA_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "autumn_stewartia_boat");
    public static final Identifier AUTUMN_STEWARTIA_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "autumn_stewartia_chest_boat");
    public static final Identifier PEACH_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "peach_boat");
    public static final Identifier PEACH_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "peach_chest_boat");
    public static final Identifier SWAMP_SYLPH_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "swamp_sylph_boat");
    public static final Identifier SWAMP_SYLPH_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "swamp_sylph_chest_boat");
    public static final Identifier SWEETGUM_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "sweetgum_boat");
    public static final Identifier SWEETGUM_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "sweetgum_chest_boat");
    public static final Identifier SYCAMORE_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "sycamore_boat");
    public static final Identifier SYCAMORE_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "sycamore_chest_boat");
    public static final Identifier PLUM_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "plum_boat");
    public static final Identifier PLUM_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "plum_chest_boat");
    public static final Identifier WINTER_BLOSSOM_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "winter_blossom_boat");
    public static final Identifier WINTER_BLOSSOM_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "winter_blossom_chest_boat");
    public static final Identifier WISTERIA_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "wisteria_boat");
    public static final Identifier WISTERIA_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "wisteria_chest_boat");
    public static final Identifier WITCH_HAZEL_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "witch_hazel_boat");
    public static final Identifier WITCH_HAZEL_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "witch_hazel_chest_boat");
    public static final Identifier YELLOWWOOD_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "yellowwood_boat");
    public static final Identifier YELLOWWOOD_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "yellowwood_chest_boat");
    public static final Identifier ZEBRAWOOD_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "zebrawood_boat");
    public static final Identifier ZEBRAWOOD_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "zebrawood_chest_boat");
    public static final Identifier ZELKOVA_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "zelkova_boat");
    public static final Identifier ZELKOVA_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "zelkova_chest_boat");
    public static final Identifier AUTUMN_ZELKOVA_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "autumn_zelkova_boat");
    public static final Identifier AUTUMN_ZELKOVA_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "autumn_zelkova_chest_boat");
    public static final Identifier ZISSIAN_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "zissian_boat");
    public static final Identifier ZISSIAN_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "zissian_chest_boat");
    public static final Identifier PONDEROSA_PINE_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "ponderosa_pine_boat");
    public static final Identifier PONDEROSA_PINE_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "ponderosa_pine_chest_boat");
    public static final Identifier KNOBCONE_PINE_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "knobcone_pine_boat");
    public static final Identifier KNOBCONE_PINE_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "knobcone_pine_chest_boat");
    public static final Identifier CASSIA_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "cassia_boat");
    public static final Identifier CASSIA_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "cassia_chest_boat");
    public static final Identifier HOLLY_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "holly_boat");
    public static final Identifier HOLLY_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "holly_chest_boat");
    public static final Identifier SEABREEZE_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "seabreeze_boat");
    public static final Identifier SEABREEZE_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "seabreeze_chest_boat");
    public static final Identifier PEONIA_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "peonia_boat");
    public static final Identifier PEONIA_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "peonia_chest_boat");
    public static final Identifier STRAWBERRY_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "strawberry_boat");
    public static final Identifier STRAWBERRY_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "strawberry_chest_boat");
    public static final Identifier CEDAR_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "cedar_boat");
    public static final Identifier CEDAR_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "cedar_chest_boat");
    public static final Identifier CHISAI_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "chisai_boat");
    public static final Identifier CHISAI_CHEST_BOAT_ID = new Identifier(TakieTerraMod.MOD_ID, "chisai_chest_boat");



    public static final RegistryKey<TerraformBoatType> RAINBOW_GUM_BOAT_KEY = TerraformBoatTypeRegistry.createKey(RAINBOW_GUM_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> WILLOW_BOAT_KEY = TerraformBoatTypeRegistry.createKey(WILLOW_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> EBONY_BOAT_KEY = TerraformBoatTypeRegistry.createKey(EBONY_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> PEAR_BOAT_KEY = TerraformBoatTypeRegistry.createKey(PEAR_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> PINE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(PINE_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> RED_MAPLE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(RED_MAPLE_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> WALNUT_BOAT_KEY = TerraformBoatTypeRegistry.createKey(WALNUT_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> AUTUMN_ASPEN_BOAT_KEY = TerraformBoatTypeRegistry.createKey(AUTUMN_ASPEN_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> BLUE_GUM_BOAT_KEY = TerraformBoatTypeRegistry.createKey(BLUE_GUM_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> AEGIA_BOAT_KEY = TerraformBoatTypeRegistry.createKey(AEGIA_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> LARCH_BOAT_KEY = TerraformBoatTypeRegistry.createKey(LARCH_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> BALD_CYPRESS_BOAT_KEY = TerraformBoatTypeRegistry.createKey(BALD_CYPRESS_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> BEECH_BOAT_KEY = TerraformBoatTypeRegistry.createKey(BEECH_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> CAMPHOR_BOAT_KEY = TerraformBoatTypeRegistry.createKey(CAMPHOR_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> CAMELLIA_BOAT_KEY = TerraformBoatTypeRegistry.createKey(CAMELLIA_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> REDWOOD_BOAT_KEY = TerraformBoatTypeRegistry.createKey(REDWOOD_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> DEAD_BOAT_KEY = TerraformBoatTypeRegistry.createKey(DEAD_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> FIR_BOAT_KEY = TerraformBoatTypeRegistry.createKey(FIR_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> TOONA_BOAT_KEY = TerraformBoatTypeRegistry.createKey(TOONA_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> GHAF_BOAT_KEY = TerraformBoatTypeRegistry.createKey(GHAF_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> SEQUOIA_BOAT_KEY = TerraformBoatTypeRegistry.createKey(SEQUOIA_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> GINKGO_BOAT_KEY = TerraformBoatTypeRegistry.createKey(GINKGO_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> INDIKO_BOAT_KEY = TerraformBoatTypeRegistry.createKey(INDIKO_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> IRONWOOD_BOAT_KEY = TerraformBoatTypeRegistry.createKey(IRONWOOD_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> JACARANDA_BOAT_KEY = TerraformBoatTypeRegistry.createKey(JACARANDA_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> JUNIPER_BOAT_KEY = TerraformBoatTypeRegistry.createKey(JUNIPER_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> KAURI_BOAT_KEY = TerraformBoatTypeRegistry.createKey(KAURI_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> KOBICHA_BOAT_KEY = TerraformBoatTypeRegistry.createKey(KOBICHA_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> LAPACHO_BOAT_KEY = TerraformBoatTypeRegistry.createKey(LAPACHO_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> MADRONE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(MADRONE_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> MAHOGANY_BOAT_KEY = TerraformBoatTypeRegistry.createKey(MAHOGANY_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> MANGO_BOAT_KEY = TerraformBoatTypeRegistry.createKey(MANGO_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> MIMOSA_BOAT_KEY = TerraformBoatTypeRegistry.createKey(MIMOSA_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> MOSSY_HEART_BOAT_KEY = TerraformBoatTypeRegistry.createKey(MOSSY_HEART_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> MYRTA_BOAT_KEY = TerraformBoatTypeRegistry.createKey(MYRTA_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> NOMERIA_BOAT_KEY = TerraformBoatTypeRegistry.createKey(NOMERIA_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> PALO_VERDE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(PALO_VERDE_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> PARASHOREA_BOAT_KEY = TerraformBoatTypeRegistry.createKey(PARASHOREA_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> PECAN_BOAT_KEY = TerraformBoatTypeRegistry.createKey(PECAN_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> ROYA_BOAT_KEY = TerraformBoatTypeRegistry.createKey(ROYA_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> SNOW_GHOST_BOAT_KEY = TerraformBoatTypeRegistry.createKey(SNOW_GHOST_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> STEWARTIA_BOAT_KEY = TerraformBoatTypeRegistry.createKey(STEWARTIA_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> AUTUMN_STEWARTIA_BOAT_KEY = TerraformBoatTypeRegistry.createKey(AUTUMN_STEWARTIA_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> PEACH_BOAT_KEY = TerraformBoatTypeRegistry.createKey(PEACH_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> SWAMP_SYLPH_BOAT_KEY = TerraformBoatTypeRegistry.createKey(SWAMP_SYLPH_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> SWEETGUM_BOAT_KEY = TerraformBoatTypeRegistry.createKey(SWEETGUM_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> SYCAMORE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(SYCAMORE_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> PLUM_BOAT_KEY = TerraformBoatTypeRegistry.createKey(PLUM_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> WINTER_BLOSSOM_BOAT_KEY = TerraformBoatTypeRegistry.createKey(WINTER_BLOSSOM_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> WISTERIA_BOAT_KEY = TerraformBoatTypeRegistry.createKey(WISTERIA_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> WITCH_HAZEL_BOAT_KEY = TerraformBoatTypeRegistry.createKey(WITCH_HAZEL_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> YELLOWWOOD_BOAT_KEY = TerraformBoatTypeRegistry.createKey(YELLOWWOOD_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> ZEBRAWOOD_BOAT_KEY = TerraformBoatTypeRegistry.createKey(ZEBRAWOOD_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> ZELKOVA_BOAT_KEY = TerraformBoatTypeRegistry.createKey(ZELKOVA_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> AUTUMN_ZELKOVA_BOAT_KEY = TerraformBoatTypeRegistry.createKey(AUTUMN_ZELKOVA_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> ZISSIAN_BOAT_KEY = TerraformBoatTypeRegistry.createKey(ZISSIAN_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> PONDEROSA_PINE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(PONDEROSA_PINE_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> KNOBCONE_PINE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(KNOBCONE_PINE_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> CASSIA_BOAT_KEY = TerraformBoatTypeRegistry.createKey(CASSIA_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> HOLLY_BOAT_KEY = TerraformBoatTypeRegistry.createKey(HOLLY_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> SEABREEZE_BOAT_KEY = TerraformBoatTypeRegistry.createKey(SEABREEZE_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> PEONIA_BOAT_KEY = TerraformBoatTypeRegistry.createKey(PEONIA_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> STRAWBERRY_BOAT_KEY = TerraformBoatTypeRegistry.createKey(STRAWBERRY_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> CEDAR_BOAT_KEY = TerraformBoatTypeRegistry.createKey(CEDAR_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> CHISAI_BOAT_KEY = TerraformBoatTypeRegistry.createKey(CHISAI_BOAT_ID);

    public static void registerBoats() {
        TerraformBoatType rainbowgumBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.RAINBOW_GUM_BOAT)
                .chestItem(TakieTerraItems.RAINBOW_GUM_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.RAINBOW_GUM_PLANKS.asItem())
                .build();

        TerraformBoatType willowBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.WILLOW_BOAT)
                .chestItem(TakieTerraItems.WILLOW_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.WILLOW_PLANKS.asItem())
                .build();

        TerraformBoatType ebonyBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.EBONY_BOAT)
                .chestItem(TakieTerraItems.EBONY_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.EBONY_PLANKS.asItem())
                .build();

        TerraformBoatType pearBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.PEAR_BOAT)
                .chestItem(TakieTerraItems.PEAR_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.PEAR_PLANKS.asItem())
                .build();

        TerraformBoatType pineBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.PINE_BOAT)
                .chestItem(TakieTerraItems.PINE_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.PINE_PLANKS.asItem())
                .build();

        TerraformBoatType redmapleBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.RED_MAPLE_BOAT)
                .chestItem(TakieTerraItems.RED_MAPLE_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.RED_MAPLE_PLANKS.asItem())
                .build();

        TerraformBoatType walnutBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.WALNUT_BOAT)
                .chestItem(TakieTerraItems.WALNUT_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.WALNUT_PLANKS.asItem())
                .build();

        TerraformBoatType autumnaspenBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.AUTUMN_ASPEN_BOAT)
                .chestItem(TakieTerraItems.AUTUMN_ASPEN_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.AUTUMN_ASPEN_PLANKS.asItem())
                .build();

        TerraformBoatType bluegumBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.BLUE_GUM_BOAT)
                .chestItem(TakieTerraItems.BLUE_GUM_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.BLUE_GUM_PLANKS.asItem())
                .build();

        TerraformBoatType aegiaBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.AEGIA_BOAT)
                .chestItem(TakieTerraItems.AEGIA_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.AEGIA_PLANKS.asItem())
                .build();

        TerraformBoatType larchBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.LARCH_BOAT)
                .chestItem(TakieTerraItems.LARCH_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.LARCH_PLANKS.asItem())
                .build();

        TerraformBoatType baldCypressBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.BALD_CYPRESS_BOAT)
                .chestItem(TakieTerraItems.BALD_CYPRESS_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.BALD_CYPRESS_PLANKS.asItem())
                .build();

        TerraformBoatType beechBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.BEECH_BOAT)
                .chestItem(TakieTerraItems.BEECH_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.BEECH_PLANKS.asItem())
                .build();

        TerraformBoatType camphorBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.CAMPHOR_BOAT)
                .chestItem(TakieTerraItems.CAMPHOR_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.CAMPHOR_PLANKS.asItem())
                .build();

        TerraformBoatType camelliaBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.CAMELLIA_BOAT)
                .chestItem(TakieTerraItems.CAMELLIA_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.CAMELLIA_PLANKS.asItem())
                .build();

        TerraformBoatType redwoodBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.REDWOOD_BOAT)
                .chestItem(TakieTerraItems.REDWOOD_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.REDWOOD_PLANKS.asItem())
                .build();

        TerraformBoatType deadBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.DEAD_BOAT)
                .chestItem(TakieTerraItems.DEAD_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.DEAD_PLANKS.asItem())
                .build();

        TerraformBoatType firBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.FIR_BOAT)
                .chestItem(TakieTerraItems.FIR_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.FIR_PLANKS.asItem())
                .build();

        TerraformBoatType toonaBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.TOONA_BOAT)
                .chestItem(TakieTerraItems.TOONA_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.TOONA_PLANKS.asItem())
                .build();

        TerraformBoatType ghafBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.GHAF_BOAT)
                .chestItem(TakieTerraItems.GHAF_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.GHAT_PLANKS.asItem())
                .build();

        TerraformBoatType sequoiaBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.SEQUOIA_BOAT)
                .chestItem(TakieTerraItems.SEQUOIA_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.SEQUOIA_PLANKS.asItem())
                .build();

        TerraformBoatType ginkgoBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.GINKGO_BOAT)
                .chestItem(TakieTerraItems.GINKGO_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.GINKGO_PLANKS.asItem())
                .build();

        TerraformBoatType indikoBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.INDIKO_BOAT)
                .chestItem(TakieTerraItems.INDIKO_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.INDIKO_PLANKS.asItem())
                .build();

        TerraformBoatType ironwoodBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.IRONWOOD_BOAT)
                .chestItem(TakieTerraItems.IRONWOOD_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.IRONWOOD_PLANKS.asItem())
                .build();

        TerraformBoatType jacarandaBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.JACARANDA_BOAT)
                .chestItem(TakieTerraItems.JACARANDA_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.JACARANDA_PLANKS.asItem())
                .build();

        TerraformBoatType juniperBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.JUNIPER_BOAT)
                .chestItem(TakieTerraItems.JUNIPER_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.JUNIPER_PLANKS.asItem())
                .build();

        TerraformBoatType kauriBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.KAURI_BOAT)
                .chestItem(TakieTerraItems.KAURI_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.KAURI_PLANKS.asItem())
                .build();

        TerraformBoatType kobichaBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.KOBICHA_BOAT)
                .chestItem(TakieTerraItems.KOBICHA_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.KOBICHA_PLANKS.asItem())
                .build();

        TerraformBoatType lapachoBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.LAPACHO_BOAT)
                .chestItem(TakieTerraItems.LAPACHO_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.LAPACHO_PLANKS.asItem())
                .build();

        TerraformBoatType madroneBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.MADRONE_BOAT)
                .chestItem(TakieTerraItems.MADRONE_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.MADRONE_PLANKS.asItem())
                .build();

        TerraformBoatType mahoganyBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.MAHOGANY_BOAT)
                .chestItem(TakieTerraItems.MAHOGANY_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.MAHOGANY_PLANKS.asItem())
                .build();

        TerraformBoatType mangoBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.MANGO_BOAT)
                .chestItem(TakieTerraItems.MANGO_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.MANGO_PLANKS.asItem())
                .build();

        TerraformBoatType mimosaBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.MIMOSA_BOAT)
                .chestItem(TakieTerraItems.MIMOSA_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.MIMOSA_PLANKS.asItem())
                .build();

        TerraformBoatType mossyHeartBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.MOSSY_HEART_BOAT)
                .chestItem(TakieTerraItems.MOSSY_HEART_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.MOSSY_HEART_PLANKS.asItem())
                .build();

        TerraformBoatType myrtaBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.MYRTA_BOAT)
                .chestItem(TakieTerraItems.MYRTA_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.MYRTA_PLANKS.asItem())
                .build();

        TerraformBoatType nomeriaBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.NOMERIA_BOAT)
                .chestItem(TakieTerraItems.NOMERIA_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.NOMERIA_PLANKS.asItem())
                .build();

        TerraformBoatType paloVerdeBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.PALO_VERDE_BOAT)
                .chestItem(TakieTerraItems.PALO_VERDE_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.PALO_VERDE_PLANKS.asItem())
                .build();

        TerraformBoatType parashoreaBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.PARASHOREA_BOAT)
                .chestItem(TakieTerraItems.PARASHOREA_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.PARASHOREA_PLANKS.asItem())
                .build();

        TerraformBoatType pecanBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.PECAN_BOAT)
                .chestItem(TakieTerraItems.PECAN_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.PECAN_PLANKS.asItem())
                .build();

        TerraformBoatType royaBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.ROYA_BOAT)
                .chestItem(TakieTerraItems.ROYA_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.ROYA_PLANKS.asItem())
                .build();

        TerraformBoatType snowGhostBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.SNOW_GHOST_BOAT)
                .chestItem(TakieTerraItems.SNOW_GHOST_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.SNOW_GHOST_PLANKS.asItem())
                .build();

        TerraformBoatType stewartiaBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.STEWARTIA_BOAT)
                .chestItem(TakieTerraItems.STEWARTIA_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.STEWARTIA_PLANKS.asItem())
                .build();

        TerraformBoatType autumnStewartiaBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.AUTUMN_STEWARTIA_BOAT)
                .chestItem(TakieTerraItems.AUTUMN_STEWARTIA_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.AUTUMN_STEWARTIA_PLANKS.asItem())
                .build();

        TerraformBoatType peachBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.PEACH_BOAT)
                .chestItem(TakieTerraItems.PEACH_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.PEACH_PLANKS.asItem())
                .build();

        TerraformBoatType swampSylphBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.SWAMP_SYLPH_BOAT)
                .chestItem(TakieTerraItems.SWAMP_SYLPH_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.SWAMP_SYLPH_PLANKS.asItem())
                .build();

        TerraformBoatType sweetgumBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.SWEETGUM_BOAT)
                .chestItem(TakieTerraItems.SWEETGUM_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.SWEETGUM_PLANKS.asItem())
                .build();

        TerraformBoatType sycamoreBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.SYCAMORE_BOAT)
                .chestItem(TakieTerraItems.SYCAMORE_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.SYCAMORE_PLANKS.asItem())
                .build();

        TerraformBoatType plumBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.PLUM_BOAT)
                .chestItem(TakieTerraItems.PLUM_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.PLUM_PLANKS.asItem())
                .build();

        TerraformBoatType winterBlossomBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.WINTER_BLOSSOM_BOAT)
                .chestItem(TakieTerraItems.WINTER_BLOSSOM_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.WINTER_BLOSSOM_PLANKS.asItem())
                .build();

        TerraformBoatType wisteriaBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.WISTERIA_BOAT)
                .chestItem(TakieTerraItems.WISTERIA_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.WISTERIA_PLANKS.asItem())
                .build();

        TerraformBoatType witchHazelBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.WITCH_HAZEL_BOAT)
                .chestItem(TakieTerraItems.WITCH_HAZEL_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.WITCH_HAZEL_PLANKS.asItem())
                .build();

        TerraformBoatType yellowwoodBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.YELLOWWOOD_BOAT)
                .chestItem(TakieTerraItems.YELLOWWOOD_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.YELLOWWOOD_PLANKS.asItem())
                .build();

        TerraformBoatType zebrawoodBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.ZEBRAWOOD_BOAT)
                .chestItem(TakieTerraItems.ZEBRAWOOD_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.ZEBRAWOOD_PLANKS.asItem())
                .build();

        TerraformBoatType zelkovaBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.ZELKOVA_BOAT)
                .chestItem(TakieTerraItems.ZELKOVA_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.ZELKOVA_PLANKS.asItem())
                .build();

        TerraformBoatType autumnZelkovaBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.AUTUMN_ZELKOVA_BOAT)
                .chestItem(TakieTerraItems.AUTUMN_ZELKOVA_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.AUTUMN_ZELKOVA_PLANKS.asItem())
                .build();

        TerraformBoatType zissianBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.ZISSIAN_BOAT)
                .chestItem(TakieTerraItems.ZISSIAN_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.ZISSIAN_PLANKS.asItem())
                .build();

        TerraformBoatType ponderosaPineBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.PONDEROSA_PINE_BOAT)
                .chestItem(TakieTerraItems.PONDEROSA_PINE_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.PONDEROSA_PINE_PLANKS.asItem())
                .build();

        TerraformBoatType knobconePineBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.KNOBCONE_PINE_BOAT)
                .chestItem(TakieTerraItems.KNOBCONE_PINE_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.KNOBCONE_PINE_PLANKS.asItem())
                .build();

        TerraformBoatType cassiaBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.CASSIA_BOAT)
                .chestItem(TakieTerraItems.CASSIA_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.CASSIA_PLANKS.asItem())
                .build();

        TerraformBoatType hollyBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.HOLLY_BOAT)
                .chestItem(TakieTerraItems.HOLLY_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.HOLLY_PLANKS.asItem())
                .build();

        TerraformBoatType seabreezeBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.SEABREEZE_BOAT)
                .chestItem(TakieTerraItems.SEABREEZE_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.SEABREEZE_PLANKS.asItem())
                .build();

        TerraformBoatType peoniaBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.PEONIA_BOAT)
                .chestItem(TakieTerraItems.PEONIA_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.PEONIA_PLANKS.asItem())
                .build();

        TerraformBoatType strawberryBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.STRAWBERRY_BOAT)
                .chestItem(TakieTerraItems.STRAWBERRY_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.STRAWBERRY_PLANKS.asItem())
                .build();

        TerraformBoatType cedarBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.CEDAR_BOAT)
                .chestItem(TakieTerraItems.CEDAR_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.CEDAR_PLANKS.asItem())
                .build();

        TerraformBoatType chisaiBoat = new TerraformBoatType.Builder()
                .item(TakieTerraItems.CHISAI_BOAT)
                .chestItem(TakieTerraItems.CHISAI_CHEST_BOAT)
                .planks(TakieTerraTreeBlocks.CHISAI_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, RAINBOW_GUM_BOAT_KEY, rainbowgumBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, WILLOW_BOAT_KEY, willowBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, EBONY_BOAT_KEY, ebonyBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, PEAR_BOAT_KEY, pearBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, PINE_BOAT_KEY, pineBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, RED_MAPLE_BOAT_KEY, redmapleBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, WALNUT_BOAT_KEY, walnutBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, AUTUMN_ASPEN_BOAT_KEY, autumnaspenBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, BLUE_GUM_BOAT_KEY, bluegumBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, AEGIA_BOAT_KEY, aegiaBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, LARCH_BOAT_KEY, larchBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, BALD_CYPRESS_BOAT_KEY, baldCypressBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, BEECH_BOAT_KEY, beechBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, CAMPHOR_BOAT_KEY, camphorBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, CAMELLIA_BOAT_KEY, camelliaBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, REDWOOD_BOAT_KEY, redwoodBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, DEAD_BOAT_KEY, deadBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, FIR_BOAT_KEY, firBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, TOONA_BOAT_KEY, toonaBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, GHAF_BOAT_KEY, ghafBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, SEQUOIA_BOAT_KEY, sequoiaBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, GINKGO_BOAT_KEY, ginkgoBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, INDIKO_BOAT_KEY, indikoBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, IRONWOOD_BOAT_KEY, ironwoodBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, JACARANDA_BOAT_KEY, jacarandaBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, JUNIPER_BOAT_KEY, juniperBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, KAURI_BOAT_KEY, kauriBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, KOBICHA_BOAT_KEY, kobichaBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, LAPACHO_BOAT_KEY, lapachoBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, MADRONE_BOAT_KEY, madroneBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, MAHOGANY_BOAT_KEY, mahoganyBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, MANGO_BOAT_KEY, mangoBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, MIMOSA_BOAT_KEY, mimosaBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, MOSSY_HEART_BOAT_KEY, mossyHeartBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, MYRTA_BOAT_KEY, myrtaBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, NOMERIA_BOAT_KEY, nomeriaBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, PALO_VERDE_BOAT_KEY, paloVerdeBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, PARASHOREA_BOAT_KEY, parashoreaBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, PECAN_BOAT_KEY, pecanBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, ROYA_BOAT_KEY, royaBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, SNOW_GHOST_BOAT_KEY, snowGhostBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, STEWARTIA_BOAT_KEY, stewartiaBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, AUTUMN_STEWARTIA_BOAT_KEY, autumnStewartiaBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, PEACH_BOAT_KEY, peachBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, SWAMP_SYLPH_BOAT_KEY, swampSylphBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, SWEETGUM_BOAT_KEY, sweetgumBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, SYCAMORE_BOAT_KEY, sycamoreBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, PLUM_BOAT_KEY, plumBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, WINTER_BLOSSOM_BOAT_KEY, winterBlossomBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, WISTERIA_BOAT_KEY, wisteriaBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, WITCH_HAZEL_BOAT_KEY, witchHazelBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, YELLOWWOOD_BOAT_KEY, yellowwoodBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, ZEBRAWOOD_BOAT_KEY, zebrawoodBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, ZELKOVA_BOAT_KEY, zelkovaBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, AUTUMN_ZELKOVA_BOAT_KEY, autumnZelkovaBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, ZISSIAN_BOAT_KEY, zissianBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, PONDEROSA_PINE_BOAT_KEY, ponderosaPineBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, KNOBCONE_PINE_BOAT_KEY, knobconePineBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, CASSIA_BOAT_KEY, cassiaBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, HOLLY_BOAT_KEY, hollyBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, SEABREEZE_BOAT_KEY, seabreezeBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, PEONIA_BOAT_KEY, peoniaBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, STRAWBERRY_BOAT_KEY, strawberryBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, CEDAR_BOAT_KEY, cedarBoat);
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, CHISAI_BOAT_KEY, chisaiBoat);

    }
}
