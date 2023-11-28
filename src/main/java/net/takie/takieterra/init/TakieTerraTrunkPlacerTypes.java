package net.takie.takieterra.init;

import com.mojang.serialization.Codec;
import com.terraformersmc.terraform.tree.placer.PlacerTypes;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.trunk.TrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;
import net.takie.takieterra.TakieTerraMod;
import net.takie.takieterra.features.tree.foliageplacers.MapleFoliagePlacer;
import net.takie.takieterra.features.tree.trunkplacers.*;

public class TakieTerraTrunkPlacerTypes {

	public static TrunkPlacerType<BentTrunkPlacer> BENT;
	public static TrunkPlacerType<CanopyTree4BranchTrunkPlacer> CANOPY_4_BRANCHES;
	public static TrunkPlacerType<QuarteredMegaCanopyTrunkPlacer> QUARTERED_MEGA_CANOPY;
	public static TrunkPlacerType<MegaTrunkPlacer> MEGA;
	public static TrunkPlacerType<SaguaroCactusTrunkPlacer> SAGUARO_CACTUS;
	public static TrunkPlacerType<SmallCanopyTree4BranchTrunkPlacer> SMALL_CANOPY_4_BRANCHES;
	public static TrunkPlacerType<SpindlyTrunkPlacer> SPINDLY;
	public static TrunkPlacerType<SmallBranchingTrunkPlacer> SMALL_BRANCHING;
	public static TrunkPlacerType<RubberTreeTrunkPlacer> RUBBER_TREE;
	public static TrunkPlacerType<FallenStraightTrunkPlacer> FALLEN_STRAIGHT;
	public static TrunkPlacerType<WisteriaTrunkPlacer> WISTERIA_TRUNK_PLACER_TYPE;
	public static TrunkPlacerType<MapleTrunkPlacer> MAPLE_TRUNK_PLACER_TYPE;
	public static TrunkPlacerType<AegiaTrunkPlacer> AEGIA_TRUNK_PLACER_TYPE;
	public static TrunkPlacerType<MadroneTrunkPlacer> MADRONE_TRUNK_PLACER_TYPE;
	public static TrunkPlacerType<GhafTrunkPlacer> GHAF_TRUNK_PLACER;
	public static TrunkPlacerType<CoconutTrunkPlacer> COCONUT_TRUNK_PLACER;
	public static TrunkPlacerType<PaloVerdeTrunkPlacer> PALO_VERDE_TRUNK_PLACER;

	public static void init() {
		// Do these need a "trunk_placer" suffix? It's the name of the registry after all.
		// Mojang uses the "trunk_placer" suffix, so we'll use it too.
		BENT = register("bent_trunk_placer", BentTrunkPlacer.CODEC);
		CANOPY_4_BRANCHES = register("canopy_tree_4_branch_trunk_placer", CanopyTree4BranchTrunkPlacer.CODEC);
		QUARTERED_MEGA_CANOPY = register("quartered_mega_canopy_trunk_placer", QuarteredMegaCanopyTrunkPlacer.CODEC);
		MEGA = register("mega_trunk_placer", MegaTrunkPlacer.CODEC);
		RUBBER_TREE = register("rubber_tree_trunk_placer", RubberTreeTrunkPlacer.CODEC);
		SAGUARO_CACTUS = register("saguaro_cactus_trunk_placer", SaguaroCactusTrunkPlacer.CODEC);
		SMALL_CANOPY_4_BRANCHES = register("small_canopy_tree_4_branch_trunk_placer", SmallCanopyTree4BranchTrunkPlacer.CODEC);
		SPINDLY = register("spindly_trunk_placer", SpindlyTrunkPlacer.CODEC);
		SMALL_BRANCHING = register("small_branching_trunk_placer", SmallBranchingTrunkPlacer.CODEC);
		FALLEN_STRAIGHT = register("fallen_straight_trunk_placer", FallenStraightTrunkPlacer.CODEC);
		WISTERIA_TRUNK_PLACER_TYPE = register("wisteria_trunk_placer", WisteriaTrunkPlacer.CODEC);
		MAPLE_TRUNK_PLACER_TYPE = register("maple_trunk_placer", MapleTrunkPlacer.CODEC);
		AEGIA_TRUNK_PLACER_TYPE = register("aegia_trunk_placer", AegiaTrunkPlacer.CODEC);
		MADRONE_TRUNK_PLACER_TYPE = register("madrone_trunk_placer", MadroneTrunkPlacer.CODEC);
		GHAF_TRUNK_PLACER = register("ghaf_trunk_placer", GhafTrunkPlacer.CODEC);
		COCONUT_TRUNK_PLACER = register("coconut_trunk_placer", CoconutTrunkPlacer.CODEC);
		PALO_VERDE_TRUNK_PLACER = register("palo_verde_trunk_placer", PaloVerdeTrunkPlacer.CODEC);
	}

	private static <P extends TrunkPlacer> TrunkPlacerType<P> register(String name, Codec<P> codec) {
		return PlacerTypes.registerTrunkPlacer(new Identifier(TakieTerraMod.MOD_ID, name), codec);
	}

}
