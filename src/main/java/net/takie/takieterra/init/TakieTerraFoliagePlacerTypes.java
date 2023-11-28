package net.takie.takieterra.init;

import com.mojang.serialization.Codec;
import com.terraformersmc.terraform.tree.placer.PlacerTypes;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;
import net.takie.takieterra.TakieTerraMod;
import net.takie.takieterra.features.tree.foliageplacers.*;

public class TakieTerraFoliagePlacerTypes {

	public static FoliagePlacerType<CanopyFoliagePlacer> CANOPY;
	public static FoliagePlacerType<DotShrubPlacer> DOT_SHRUB;
	public static FoliagePlacerType<JapaneseCanopyFoliagePlacer> JAPANESE_CANOPY;
	public static FoliagePlacerType<SmallCanopyFoliagePlacer> SMALL_CANOPY;
	public static FoliagePlacerType<NoneFoliagePlacer> NONE;
	public static FoliagePlacerType<SmallLogSphereFoliagePlacer> SMALL_LOG_SPHERE;
	public static FoliagePlacerType<SphereFoliagePlacer> SPHERE;
	public static FoliagePlacerType<WisteriaFoliagePlacer> WISTERIA_FOLIAGE_PLACER_TYPE;
	public static FoliagePlacerType<MapleFoliagePlacer> MAPLE_FOLIAGE_PLACER_TYPE;
	public static FoliagePlacerType<CoconutFoliagePlacer> COCONUT_FOLIAGE_PLACER_TYPE;



	public static void init() {
		CANOPY = register("canopy_foliage_placer", CanopyFoliagePlacer.CODEC);
		DOT_SHRUB = register("dot_shrub_foliage_placer", DotShrubPlacer.CODEC);
		JAPANESE_CANOPY = register("japanese_canopy_foliage_placer", JapaneseCanopyFoliagePlacer.CODEC);
		SMALL_CANOPY = register("small_canopy_foliage_placer", SmallCanopyFoliagePlacer.CODEC);
		NONE = register("none_foliage_placer", NoneFoliagePlacer.CODEC);
		SMALL_LOG_SPHERE = register("small_log_sphere_foliage_placer", SmallLogSphereFoliagePlacer.CODEC);
		SPHERE = register("sphere_foliage_placer", SphereFoliagePlacer.CODEC);
		WISTERIA_FOLIAGE_PLACER_TYPE = register("wisteria_foliage_placer", WisteriaFoliagePlacer.CODEC);
		MAPLE_FOLIAGE_PLACER_TYPE = register("maple_foliage_placer", MapleFoliagePlacer.CODEC);
		COCONUT_FOLIAGE_PLACER_TYPE = register("coconut_foliage_placer", CoconutFoliagePlacer.CODEC);
	}

	private static <P extends FoliagePlacer> FoliagePlacerType<P> register(String name, Codec<P> codec) {
		return PlacerTypes.registerFoliagePlacer(new Identifier(TakieTerraMod.MOD_ID, name), codec);
	}

}
