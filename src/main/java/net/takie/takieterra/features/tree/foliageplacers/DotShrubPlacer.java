package net.takie.takieterra.features.tree.foliageplacers;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;
import net.takie.takieterra.init.TakieTerraFoliagePlacerTypes;

import java.util.function.BiConsumer;

public class DotShrubPlacer extends FoliagePlacer {

	public static final Codec<DotShrubPlacer> CODEC = RecordCodecBuilder.create(dotShrubPlacerInstance ->
			fillFoliagePlacerFields(dotShrubPlacerInstance).apply(dotShrubPlacerInstance, DotShrubPlacer::new));

	public DotShrubPlacer(IntProvider radius, IntProvider offset) {
		super(radius, offset);
	}

	@Override
	protected FoliagePlacerType<?> getType() {
		return TakieTerraFoliagePlacerTypes.DOT_SHRUB;
	}

	@Override
	protected void generate(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, int trunkHeight, TreeNode treeNode, int foliageHeight, int radius, int offset) {

	}

	protected void generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, TreeFeatureConfig config, int trunkHeight, TreeNode treeNode, int foliageHeight, int radius, int offset) {
		checkAndSetBlockState(world, random, treeNode.getCenter(), replacer, config);
		Direction.Type.HORIZONTAL.forEach((direction) -> checkAndSetBlockState(world, random, treeNode.getCenter().down().offset(direction), replacer, config));
	}

	private void checkAndSetBlockState(TestableWorld world, Random random, BlockPos currentPosition, BiConsumer<BlockPos, BlockState> replacer, TreeFeatureConfig config) {
		if (TreeFeature.canReplace(world, currentPosition)) {
			replacer.accept(currentPosition.toImmutable(), config.foliageProvider.get(random, currentPosition));
		}
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
