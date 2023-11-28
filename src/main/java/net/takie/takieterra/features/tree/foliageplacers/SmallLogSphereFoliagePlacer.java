package net.takie.takieterra.features.tree.foliageplacers;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.terraformersmc.terraform.shapes.api.Position;
import com.terraformersmc.terraform.shapes.impl.Shapes;
import com.terraformersmc.terraform.shapes.impl.layer.transform.TranslateLayer;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;
import net.takie.takieterra.features.tree.foliageplacers.templates.SmallFoliagePlacer;
import net.takie.takieterra.init.TakieTerraFoliagePlacerTypes;

import java.util.function.BiConsumer;

public class SmallLogSphereFoliagePlacer extends SmallFoliagePlacer {

	public static final Codec<SmallLogSphereFoliagePlacer> CODEC = RecordCodecBuilder.create(smallLogSphereFoliagePlacerInstance ->
			fillFoliagePlacerFields(smallLogSphereFoliagePlacerInstance).apply(smallLogSphereFoliagePlacerInstance, SmallLogSphereFoliagePlacer::new));

	public SmallLogSphereFoliagePlacer(IntProvider radius, IntProvider offset) {
		super(radius, offset);
	}

	@Override
	protected FoliagePlacerType<?> getType() {
		return TakieTerraFoliagePlacerTypes.SMALL_LOG_SPHERE;
	}

	@Override
	protected void generate(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, int trunkHeight, FoliagePlacer.TreeNode treeNode, int foliageHeight, int radius, int offset) {

		// Add 0.25 to make it not a square and also not a single block
		Shapes.ellipsoid(radius + 0.25,radius + 0.25,radius + 0.25)
				.applyLayer(TranslateLayer.of(Position.of(treeNode.getCenter())))
				.stream()
				.forEach((block) -> {
					tryPlaceLeaves(world, block.toBlockPos(), random, placer, config);
				});

	}

	@Override
	public int getRandomHeight(Random random, int trunkHeight, TreeFeatureConfig config) {
		return 0;
	}

	@Override
	protected boolean isInvalidForLeaves(Random random, int baseHeight, int dx, int dy, int dz, boolean bl) {
		return false;
	}
}
