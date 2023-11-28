package net.takie.takieterra.villager;

import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.util.Identifier;
import net.minecraft.world.poi.PointOfInterestType;
import net.takie.takieterra.TakieTerraMod;
import net.takie.takieterra.block.TakieTerraBlocks;

public class TakieTerraPOIType {

    //POI TYPE
    public static PointOfInterestType ARBORIST_POI;
    public static PointOfInterestType GEOLOGIST_POI;
    public static PointOfInterestType BEACHCOMBER_POI;
    public static PointOfInterestType GARDENER_POI;
    public static PointOfInterestType METALLURGIST_POI;
    public static PointOfInterestType WOODWORKER_POI;
    public static PointOfInterestType HERBALIST_POI;
    public static PointOfInterestType GROCER_POI;
    public static PointOfInterestType CHEF_POI;
    public static PointOfInterestType TEAHOUSE_POI;
    public static PointOfInterestType WEAVER_POI;
    public static PointOfInterestType BAKER_POI;
    public static PointOfInterestType MYCOLOGIST_POI;
    public static PointOfInterestType ANTIQUE_DEALER_POI;
    public static PointOfInterestType STREET_VENDOR_POI;

    public static void registerPOIs() {
        ARBORIST_POI = PointOfInterestHelper.register(new Identifier(TakieTerraMod.MOD_ID, "arborist"), 1, 1,
                TakieTerraBlocks.ARBORIST_BLOCK);
        GEOLOGIST_POI = PointOfInterestHelper.register(new Identifier(TakieTerraMod.MOD_ID, "geologist"), 1, 1,
                TakieTerraBlocks.GEOLOGIST_BLOCK);
        BEACHCOMBER_POI = PointOfInterestHelper.register(new Identifier(TakieTerraMod.MOD_ID, "beachcomber"), 1, 1,
                TakieTerraBlocks.BEACHCOMBER_BLOCK);
        GARDENER_POI = PointOfInterestHelper.register(new Identifier(TakieTerraMod.MOD_ID, "gardener"), 1, 1,
                TakieTerraBlocks.GARDENER_BLOCK);
        METALLURGIST_POI = PointOfInterestHelper.register(new Identifier(TakieTerraMod.MOD_ID, "metallurgist"), 1, 1,
                TakieTerraBlocks.ALLOY_FORGE_BLOCK);
        WOODWORKER_POI = PointOfInterestHelper.register(new Identifier(TakieTerraMod.MOD_ID, "woodworker"), 1, 1,
                TakieTerraBlocks.WOODWORKER_BLOCK);
        HERBALIST_POI = PointOfInterestHelper.register(new Identifier(TakieTerraMod.MOD_ID, "herbalist"), 1, 1,
                TakieTerraBlocks.HERBALIST_BLOCK);
        GROCER_POI = PointOfInterestHelper.register(new Identifier(TakieTerraMod.MOD_ID, "grocer"), 1, 1,
                TakieTerraBlocks.GROCER_BLOCK);
        CHEF_POI = PointOfInterestHelper.register(new Identifier(TakieTerraMod.MOD_ID, "chef"), 1, 1,
                TakieTerraBlocks.FRYING_PAN_BLOCK);
        TEAHOUSE_POI = PointOfInterestHelper.register(new Identifier(TakieTerraMod.MOD_ID, "teahouse"), 1, 1,
                TakieTerraBlocks.KETTLE_BLOCK);
        WEAVER_POI = PointOfInterestHelper.register(new Identifier(TakieTerraMod.MOD_ID, "weaver"), 1, 1,
                TakieTerraBlocks.WEAVER_BLOCK);
        BAKER_POI = PointOfInterestHelper.register(new Identifier(TakieTerraMod.MOD_ID, "baker"), 1, 1,
                TakieTerraBlocks.BRICK_OVEN_BLOCK);
        MYCOLOGIST_POI = PointOfInterestHelper.register(new Identifier(TakieTerraMod.MOD_ID, "mycologist"), 1, 1,
                TakieTerraBlocks.MYCOLOGIST_BLOCK);
        ANTIQUE_DEALER_POI = PointOfInterestHelper.register(new Identifier(TakieTerraMod.MOD_ID, "antique_dealer_block"), 1, 1,
                TakieTerraBlocks.ANTIQUE_DEALER_BLOCK);
        STREET_VENDOR_POI = PointOfInterestHelper.register(new Identifier(TakieTerraMod.MOD_ID, "street_vendor_block"), 1, 1,
                TakieTerraBlocks.STREET_VENDOR_BLOCK);
    }
}
