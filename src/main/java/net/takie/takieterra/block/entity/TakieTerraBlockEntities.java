package net.takie.takieterra.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.takie.takieterra.TakieTerraMod;
import net.takie.takieterra.block.TakieTerraBlocks;
import net.takie.takieterra.block.TakieTerraTreeBlocks;
import net.takie.takieterra.block.entity.backup.KettleBlockEntity;
import net.takie.takieterra.block.entity.backup.WeaverBlockEntity;
import net.takie.takieterra.block.entity.backup.WoodworkerBlockEntity;

public class TakieTerraBlockEntities {

    public static final BlockEntityType<TakieTerraSignBlockEntity> TAKIETERRA_SIGN_BLOCK_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE,
            new Identifier(TakieTerraMod.MOD_ID, "takieterra_sign_entity"),
            FabricBlockEntityTypeBuilder.create
                    (TakieTerraSignBlockEntity::new,
                    TakieTerraTreeBlocks.RED_MAPLE_SIGN, TakieTerraTreeBlocks.RED_MAPLE_WALL_SIGN,
                            TakieTerraTreeBlocks.AUTUMN_ASPEN_SIGN, TakieTerraTreeBlocks.AUTUMN_ASPEN_WALL_SIGN,
                            TakieTerraTreeBlocks.BLUE_GUM_SIGN, TakieTerraTreeBlocks.BLUE_GUM_WALL_SIGN,
                            TakieTerraTreeBlocks.CAMELLIA_SIGN, TakieTerraTreeBlocks.CAMELLIA_WALL_SIGN,
                            TakieTerraTreeBlocks.DEAD_SIGN, TakieTerraTreeBlocks.DEAD_WALL_SIGN,
                            TakieTerraTreeBlocks.EBONY_SIGN, TakieTerraTreeBlocks.EBONY_WALL_SIGN,
                            TakieTerraTreeBlocks.GINKGO_SIGN, TakieTerraTreeBlocks.GINKGO_WALL_SIGN,
                            TakieTerraTreeBlocks.IRONWOOD_SIGN, TakieTerraTreeBlocks.IRONWOOD_WALL_SIGN,
                            TakieTerraTreeBlocks.JACARANDA_SIGN, TakieTerraTreeBlocks.JACARANDA_WALL_SIGN,
                            TakieTerraTreeBlocks.LAPACHO_SIGN, TakieTerraTreeBlocks.LAPACHO_WALL_SIGN,
                            TakieTerraTreeBlocks.MAHOGANY_SIGN, TakieTerraTreeBlocks.MAHOGANY_WALL_SIGN,
                            TakieTerraTreeBlocks.MANGO_SIGN, TakieTerraTreeBlocks.MANGO_WALL_SIGN,
                            TakieTerraTreeBlocks.PALO_VERDE_SIGN, TakieTerraTreeBlocks.PALO_VERDE_WALL_SIGN,
                            TakieTerraTreeBlocks.PEAR_SIGN, TakieTerraTreeBlocks.PEAR_WALL_SIGN,
                            TakieTerraTreeBlocks.PINE_SIGN, TakieTerraTreeBlocks.PINE_WALL_SIGN,
                            TakieTerraTreeBlocks.PONDEROSA_PINE_SIGN, TakieTerraTreeBlocks.PONDEROSA_PINE_WALL_SIGN,
                            TakieTerraTreeBlocks.KNOBCONE_PINE_SIGN, TakieTerraTreeBlocks.KNOBCONE_PINE_WALL_SIGN,
                            TakieTerraTreeBlocks.RAINBOW_GUM_SIGN, TakieTerraTreeBlocks.RAINBOW_GUM_WALL_SIGN,
                            TakieTerraTreeBlocks.PEACH_SIGN, TakieTerraTreeBlocks.PEACH_WALL_SIGN,
                            TakieTerraTreeBlocks.PLUM_SIGN, TakieTerraTreeBlocks.PLUM_WALL_SIGN,
                            TakieTerraTreeBlocks.SYCAMORE_SIGN, TakieTerraTreeBlocks.SYCAMORE_WALL_SIGN,
                            TakieTerraTreeBlocks.WALNUT_SIGN, TakieTerraTreeBlocks.WALNUT_WALL_SIGN,
                            TakieTerraTreeBlocks.WILLOW_SIGN, TakieTerraTreeBlocks.WILLOW_WALL_SIGN,
                            TakieTerraTreeBlocks.ZEBRAWOOD_SIGN, TakieTerraTreeBlocks.ZEBRAWOOD_WALL_SIGN,
                            TakieTerraTreeBlocks.AEGIA_SIGN, TakieTerraTreeBlocks.AEGIA_WALL_SIGN,
                            TakieTerraTreeBlocks.LARCH_SIGN, TakieTerraTreeBlocks.LARCH_WALL_SIGN,
                            TakieTerraTreeBlocks.BALD_CYPRESS_SIGN, TakieTerraTreeBlocks.BALD_CYPRESS_WALL_SIGN,
                            TakieTerraTreeBlocks.BEECH_SIGN, TakieTerraTreeBlocks.BEECH_WALL_SIGN,
                            TakieTerraTreeBlocks.CAMPHOR_SIGN, TakieTerraTreeBlocks.CAMPHOR_WALL_SIGN,
                            TakieTerraTreeBlocks.REDWOOD_SIGN, TakieTerraTreeBlocks.REDWOOD_WALL_SIGN,
                            TakieTerraTreeBlocks.DEAD_SIGN, TakieTerraTreeBlocks.DEAD_WALL_SIGN,
                            TakieTerraTreeBlocks.FIR_SIGN, TakieTerraTreeBlocks.FIR_WALL_SIGN,
                            TakieTerraTreeBlocks.FLAMEBARK_SIGN, TakieTerraTreeBlocks.FLAMEBARK_WALL_SIGN,
                            TakieTerraTreeBlocks.TOONA_SIGN, TakieTerraTreeBlocks.TOONA_WALL_SIGN,
                            TakieTerraTreeBlocks.GHAT_SIGN, TakieTerraTreeBlocks.GHAT_WALL_SIGN,
                            TakieTerraTreeBlocks.SEQUOIA_SIGN, TakieTerraTreeBlocks.SEQUOIA_WALL_SIGN,
                            TakieTerraTreeBlocks.INDIKO_SIGN, TakieTerraTreeBlocks.INDIKO_WALL_SIGN,
                            TakieTerraTreeBlocks.JUNIPER_SIGN, TakieTerraTreeBlocks.JUNIPER_WALL_SIGN,
                            TakieTerraTreeBlocks.KAURI_SIGN, TakieTerraTreeBlocks.KAURI_WALL_SIGN,
                            TakieTerraTreeBlocks.KOBICHA_SIGN, TakieTerraTreeBlocks.KOBICHA_WALL_SIGN,
                            TakieTerraTreeBlocks.MADRONE_SIGN, TakieTerraTreeBlocks.MADRONE_WALL_SIGN,
                            TakieTerraTreeBlocks.MIMOSA_SIGN, TakieTerraTreeBlocks.MIMOSA_WALL_SIGN,
                            TakieTerraTreeBlocks.MOSSY_HEART_SIGN, TakieTerraTreeBlocks.MOSSY_HEART_WALL_SIGN,
                            TakieTerraTreeBlocks.MYRTA_SIGN, TakieTerraTreeBlocks.MYRTA_WALL_SIGN,
                            TakieTerraTreeBlocks.NEBRA_SIGN, TakieTerraTreeBlocks.NEBRA_WALL_SIGN,
                            TakieTerraTreeBlocks.NOMERIA_SIGN, TakieTerraTreeBlocks.NOMERIA_WALL_SIGN,
                            TakieTerraTreeBlocks.PARASHOREA_SIGN, TakieTerraTreeBlocks.PARASHOREA_WALL_SIGN,
                            TakieTerraTreeBlocks.PECAN_SIGN, TakieTerraTreeBlocks.PECAN_WALL_SIGN,
                            TakieTerraTreeBlocks.ROYA_SIGN, TakieTerraTreeBlocks.ROYA_WALL_SIGN,
                            TakieTerraTreeBlocks.SCINTILLA_SIGN, TakieTerraTreeBlocks.SCINTILLA_WALL_SIGN,
                            TakieTerraTreeBlocks.SNOW_GHOST_SIGN, TakieTerraTreeBlocks.SNOW_GHOST_WALL_SIGN,
                            TakieTerraTreeBlocks.STEWARTIA_SIGN, TakieTerraTreeBlocks.STEWARTIA_WALL_SIGN,
                            TakieTerraTreeBlocks.AUTUMN_STEWARTIA_SIGN, TakieTerraTreeBlocks.AUTUMN_STEWARTIA_WALL_SIGN,
                            TakieTerraTreeBlocks.SWAMP_SYLPH_SIGN, TakieTerraTreeBlocks.SWAMP_SYLPH_WALL_SIGN,
                            TakieTerraTreeBlocks.SWEETGUM_SIGN, TakieTerraTreeBlocks.SWEETGUM_WALL_SIGN,
                            TakieTerraTreeBlocks.SYCAMORE_SIGN, TakieTerraTreeBlocks.SYCAMORE_WALL_SIGN,
                            TakieTerraTreeBlocks.WINTER_BLOSSOM_SIGN, TakieTerraTreeBlocks.WINTER_BLOSSOM_WALL_SIGN,
                            TakieTerraTreeBlocks.WISTERIA_SIGN, TakieTerraTreeBlocks.WISTERIA_WALL_SIGN,
                            TakieTerraTreeBlocks.WITCH_HAZEL_SIGN, TakieTerraTreeBlocks.WITCH_HAZEL_WALL_SIGN,
                            TakieTerraTreeBlocks.YELLOWWOOD_SIGN, TakieTerraTreeBlocks.YELLOWWOOD_WALL_SIGN,
                            TakieTerraTreeBlocks.ZELKOVA_SIGN, TakieTerraTreeBlocks.ZELKOVA_WALL_SIGN,
                            TakieTerraTreeBlocks.AUTUMN_ZELKOVA_SIGN, TakieTerraTreeBlocks.AUTUMN_ZELKOVA_WALL_SIGN,
                            TakieTerraTreeBlocks.ZISSIAN_SIGN, TakieTerraTreeBlocks.ZISSIAN_WALL_SIGN,
                            TakieTerraTreeBlocks.BLACK_PINE_SIGN, TakieTerraTreeBlocks.BLACK_PINE_WALL_SIGN,
                            TakieTerraTreeBlocks.HOLLY_SIGN, TakieTerraTreeBlocks.HOLLY_WALL_SIGN,
                            TakieTerraTreeBlocks.SEABREEZE_SIGN, TakieTerraTreeBlocks.SEABREEZE_WALL_SIGN,
                            TakieTerraTreeBlocks.CASSIA_SIGN, TakieTerraTreeBlocks.CASSIA_WALL_SIGN,
                            TakieTerraTreeBlocks.STRAWBERRY_SIGN, TakieTerraTreeBlocks.STRAWBERRY_WALL_SIGN,
                            TakieTerraTreeBlocks.PEONIA_SIGN, TakieTerraTreeBlocks.PEONIA_WALL_SIGN,
                            TakieTerraTreeBlocks.CEDAR_SIGN, TakieTerraTreeBlocks.CEDAR_WALL_SIGN,
                            TakieTerraTreeBlocks.CHISAI_SIGN, TakieTerraTreeBlocks.CHISAI_WALL_SIGN
                            ).build());

    public static final BlockEntityType<TakieTerraHangingSignBlockEntity> TAKIETERRA_HANGING_SIGN_BLOCK_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE,
            new Identifier(TakieTerraMod.MOD_ID, "takieterra_hanging_sign_entity"),
            FabricBlockEntityTypeBuilder.create
                    (TakieTerraHangingSignBlockEntity::new,
                            TakieTerraTreeBlocks.RED_MAPLE_HANGING_SIGN, TakieTerraTreeBlocks.RED_MAPLE_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.AUTUMN_ASPEN_HANGING_SIGN, TakieTerraTreeBlocks.AUTUMN_ASPEN_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.BLUE_GUM_HANGING_SIGN, TakieTerraTreeBlocks.BLUE_GUM_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.CAMELLIA_HANGING_SIGN, TakieTerraTreeBlocks.CAMELLIA_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.DEAD_HANGING_SIGN, TakieTerraTreeBlocks.DEAD_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.EBONY_HANGING_SIGN, TakieTerraTreeBlocks.EBONY_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.GINKGO_HANGING_SIGN, TakieTerraTreeBlocks.GINKGO_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.IRONWOOD_HANGING_SIGN, TakieTerraTreeBlocks.IRONWOOD_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.JACARANDA_HANGING_SIGN, TakieTerraTreeBlocks.JACARANDA_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.LAPACHO_HANGING_SIGN, TakieTerraTreeBlocks.LAPACHO_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.MAHOGANY_HANGING_SIGN, TakieTerraTreeBlocks.MAHOGANY_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.MANGO_HANGING_SIGN, TakieTerraTreeBlocks.MANGO_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.PALO_VERDE_HANGING_SIGN, TakieTerraTreeBlocks.PALO_VERDE_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.PEAR_HANGING_SIGN, TakieTerraTreeBlocks.PEAR_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.PINE_HANGING_SIGN, TakieTerraTreeBlocks.PINE_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.PONDEROSA_PINE_HANGING_SIGN, TakieTerraTreeBlocks.PONDEROSA_PINE_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.KNOBCONE_PINE_HANGING_SIGN, TakieTerraTreeBlocks.KNOBCONE_PINE_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.RAINBOW_GUM_HANGING_SIGN, TakieTerraTreeBlocks.RAINBOW_GUM_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.PEACH_HANGING_SIGN, TakieTerraTreeBlocks.PEACH_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.PLUM_HANGING_SIGN, TakieTerraTreeBlocks.PLUM_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.SYCAMORE_HANGING_SIGN, TakieTerraTreeBlocks.SYCAMORE_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.WALNUT_HANGING_SIGN, TakieTerraTreeBlocks.WALNUT_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.WILLOW_HANGING_SIGN, TakieTerraTreeBlocks.WILLOW_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.ZEBRAWOOD_HANGING_SIGN, TakieTerraTreeBlocks.ZEBRAWOOD_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.AEGIA_HANGING_SIGN, TakieTerraTreeBlocks.AEGIA_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.LARCH_HANGING_SIGN, TakieTerraTreeBlocks.LARCH_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.BALD_CYPRESS_HANGING_SIGN, TakieTerraTreeBlocks.BALD_CYPRESS_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.BEECH_HANGING_SIGN, TakieTerraTreeBlocks.BEECH_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.CAMPHOR_HANGING_SIGN, TakieTerraTreeBlocks.CAMPHOR_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.REDWOOD_HANGING_SIGN, TakieTerraTreeBlocks.REDWOOD_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.DEAD_HANGING_SIGN, TakieTerraTreeBlocks.DEAD_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.FIR_HANGING_SIGN, TakieTerraTreeBlocks.FIR_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.FLAMEBARK_HANGING_SIGN, TakieTerraTreeBlocks.FLAMEBARK_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.TOONA_HANGING_SIGN, TakieTerraTreeBlocks.TOONA_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.GHAT_HANGING_SIGN, TakieTerraTreeBlocks.GHAT_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.SEQUOIA_HANGING_SIGN, TakieTerraTreeBlocks.SEQUOIA_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.INDIKO_HANGING_SIGN, TakieTerraTreeBlocks.INDIKO_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.JUNIPER_HANGING_SIGN, TakieTerraTreeBlocks.JUNIPER_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.KAURI_HANGING_SIGN, TakieTerraTreeBlocks.KAURI_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.KOBICHA_HANGING_SIGN, TakieTerraTreeBlocks.KOBICHA_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.MADRONE_HANGING_SIGN, TakieTerraTreeBlocks.MADRONE_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.MIMOSA_HANGING_SIGN, TakieTerraTreeBlocks.MIMOSA_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.MOSSY_HEART_HANGING_SIGN, TakieTerraTreeBlocks.MOSSY_HEART_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.MYRTA_HANGING_SIGN, TakieTerraTreeBlocks.MYRTA_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.NEBRA_HANGING_SIGN, TakieTerraTreeBlocks.NEBRA_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.NOMERIA_HANGING_SIGN, TakieTerraTreeBlocks.NOMERIA_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.PARASHOREA_HANGING_SIGN, TakieTerraTreeBlocks.PARASHOREA_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.PECAN_HANGING_SIGN, TakieTerraTreeBlocks.PECAN_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.ROYA_HANGING_SIGN, TakieTerraTreeBlocks.ROYA_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.SCINTILLA_HANGING_SIGN, TakieTerraTreeBlocks.SCINTILLA_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.SNOW_GHOST_HANGING_SIGN, TakieTerraTreeBlocks.SNOW_GHOST_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.STEWARTIA_HANGING_SIGN, TakieTerraTreeBlocks.STEWARTIA_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.AUTUMN_STEWARTIA_HANGING_SIGN, TakieTerraTreeBlocks.AUTUMN_STEWARTIA_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.SWAMP_SYLPH_HANGING_SIGN, TakieTerraTreeBlocks.SWAMP_SYLPH_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.SWEETGUM_HANGING_SIGN, TakieTerraTreeBlocks.SWEETGUM_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.SYCAMORE_HANGING_SIGN, TakieTerraTreeBlocks.SYCAMORE_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.WINTER_BLOSSOM_HANGING_SIGN, TakieTerraTreeBlocks.WINTER_BLOSSOM_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.WISTERIA_HANGING_SIGN, TakieTerraTreeBlocks.WISTERIA_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.WITCH_HAZEL_HANGING_SIGN, TakieTerraTreeBlocks.WITCH_HAZEL_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.YELLOWWOOD_HANGING_SIGN, TakieTerraTreeBlocks.YELLOWWOOD_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.ZELKOVA_HANGING_SIGN, TakieTerraTreeBlocks.ZELKOVA_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.AUTUMN_ZELKOVA_HANGING_SIGN, TakieTerraTreeBlocks.AUTUMN_ZELKOVA_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.ZISSIAN_HANGING_SIGN, TakieTerraTreeBlocks.ZISSIAN_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.BLACK_PINE_HANGING_SIGN, TakieTerraTreeBlocks.BLACK_PINE_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.HOLLY_HANGING_SIGN, TakieTerraTreeBlocks.HOLLY_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.SEABREEZE_HANGING_SIGN, TakieTerraTreeBlocks.SEABREEZE_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.CASSIA_HANGING_SIGN, TakieTerraTreeBlocks.CASSIA_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.PEONIA_HANGING_SIGN, TakieTerraTreeBlocks.PEONIA_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.STRAWBERRY_HANGING_SIGN, TakieTerraTreeBlocks.STRAWBERRY_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.CEDAR_HANGING_SIGN, TakieTerraTreeBlocks.CEDAR_WALL_HANGING_SIGN,
                            TakieTerraTreeBlocks.CHISAI_HANGING_SIGN, TakieTerraTreeBlocks.CHISAI_WALL_HANGING_SIGN

                    ).build(null));

    public static final BlockEntityType<AlloyForgeBlockEntity> ALLOY_FORGE_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(TakieTerraMod.MOD_ID, "alloy_forge_block_entity"),
                    FabricBlockEntityTypeBuilder.create(AlloyForgeBlockEntity::new,
                            TakieTerraBlocks.ALLOY_FORGE_BLOCK).build(null));
    public static final BlockEntityType<WoodworkerBlockEntity> WOODWORKER_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(TakieTerraMod.MOD_ID, "woodworker_block_entity"),
                    FabricBlockEntityTypeBuilder.create(WoodworkerBlockEntity::new,
                            TakieTerraBlocks.WOODWORKER_BLOCK).build(null));
    public static final BlockEntityType<KettleBlockEntity> KETTLE_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(TakieTerraMod.MOD_ID, "kettle_block_entity"),
                    FabricBlockEntityTypeBuilder.create(KettleBlockEntity::new,
                            TakieTerraBlocks.KETTLE_BLOCK).build(null));
    public static final BlockEntityType<WeaverBlockEntity> WEAVER_BLOCK_ENTITY =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(TakieTerraMod.MOD_ID, "weaver_block_entity"),
                    FabricBlockEntityTypeBuilder.create(WeaverBlockEntity::new,
                            TakieTerraBlocks.WEAVER_BLOCK).build(null));


    public static void registerBlockEntities() {
        TakieTerraMod.LOGGER.info("Registering Block Entities for " + TakieTerraMod.MOD_ID);
    }
}
