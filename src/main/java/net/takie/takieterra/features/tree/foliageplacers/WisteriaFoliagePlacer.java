package net.takie.takieterra.features.tree.foliageplacers;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.terraformersmc.terraform.shapes.api.Position;
import com.terraformersmc.terraform.shapes.impl.Shapes;
import com.terraformersmc.terraform.shapes.impl.layer.pathfinder.SubtractLayer;
import com.terraformersmc.terraform.shapes.impl.layer.transform.TranslateLayer;
import com.terraformersmc.terraform.shapes.impl.validator.AirValidator;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;
import net.takie.takieterra.init.TakieTerraFoliagePlacerTypes;

import java.util.function.BiConsumer;

public class WisteriaFoliagePlacer extends FoliagePlacer {
	public static final Codec <WisteriaFoliagePlacer> CODEC = RecordCodecBuilder.create((instance) -> {
		return fillFoliagePlacerFields(instance).apply(instance, WisteriaFoliagePlacer::new);
	});

	public WisteriaFoliagePlacer(IntProvider intProvider, IntProvider intProvider2) {
		super(intProvider, intProvider2);
	}

	protected FoliagePlacerType <?> getType() {
		return TakieTerraFoliagePlacerTypes.WISTERIA_FOLIAGE_PLACER_TYPE;
	}

	protected void generate(TestableWorld world, BlockPlacer placer, Random random, TreeFeatureConfig config, int trunkHeight, TreeNode treeNode, int foliageHeight, int radius, int offset) {
		BlockPos blockPos = treeNode.getCenter().up(offset);
		BlockPos.Mutable mutable = blockPos.mutableCopy();
		this.generateSquare(world, placer, random, config, blockPos, radius, -1, true);
		this.generateSquare(world, placer, random, config, blockPos, radius + 1, 0, true);
		this.generateSquare(world, placer, random, config, blockPos, radius, 1, true);
		for(int i = 0; i < 60; ++i) {
			mutable.set(blockPos,
					random.nextInt(radius) - random.nextInt(radius),
					-2,
					random.nextInt(radius) - random.nextInt(radius)
			);
			placeFoliageBlock(world, placer, random, config, mutable);
			placeFoliageBlock(world, placer, random, config, mutable.offset(Direction.DOWN, 1));
			placeFoliageBlock(world, placer, random, config, mutable.offset(Direction.DOWN, 2));
		}
		for(int i = 0; i < 10; ++i) {
			mutable.set(blockPos,
					random.nextInt(radius + 2) - random.nextInt(radius + 2),
					0,
					random.nextInt(radius + 2) - random.nextInt(radius + 2)
			);
			placeFoliageBlock(world, placer, random, config, mutable);
			placeFoliageBlock(world, placer, random, config, mutable.offset(Direction.DOWN, 1));
			placeFoliageBlock(world, placer, random, config, mutable.offset(Direction.DOWN, 2));
		}
		for(int i = 0; i < 10; ++i) {
			mutable.set(blockPos,
					random.nextInt(radius + 2) - random.nextInt(radius + 2),
					0,
					random.nextInt(radius + 2) - random.nextInt(radius + 2)
			);
			placeFoliageBlock(world, placer, random, config, mutable);
			placeFoliageBlock(world, placer, random, config, mutable.offset(Direction.DOWN, 1));
		}
		for(int i = 0; i < 80; ++i) {
			mutable.set(blockPos,
					random.nextInt(radius + 2) - random.nextInt(radius + 2),
					0,
					random.nextInt(radius + 2) - random.nextInt(radius + 2)
			);
			placeFoliageBlock(world, placer, random, config, mutable);
		}

	}

	public int getRandomHeight(Random random, int trunkHeight, TreeFeatureConfig config) {
		return 3;
	}

	protected boolean isPositionInvalid(Random random, int dx, int y, int dz, int radius, boolean giantTrunk) {
		return y == 0 && (dx == -radius || dx >= radius) && (dz == -radius || dz >= radius) || super.isPositionInvalid(random,
				dx,
				y,
				dz,
				radius,
				true
		);
	}

	protected boolean isInvalidForLeaves(Random randomSource, int dx, int y, int dz, int radius, boolean giantTrunk) {
		if(y == -1) {
			return dx == radius && dz == radius;
		}
		else if(y == 1) {
			return dx + dz > radius * 2 - 2;
		}
		else {
			return false;
		}
	}
}
