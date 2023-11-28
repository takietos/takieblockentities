package net.takie.takieterra.features.tree.trunkplacers;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.registry.RegistryCodecs;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntryList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.TestableWorld;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.trunk.TrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;
import net.takie.takieterra.init.TakieTerraTrunkPlacerTypes;

import java.util.List;
import java.util.function.BiConsumer;

public class CoconutTrunkPlacer extends TrunkPlacer {
    public static final Codec <CoconutTrunkPlacer> CODEC = RecordCodecBuilder.create((instance) -> {
        return fillTrunkPlacerFields(instance).and(instance.group(IntProvider.POSITIVE_CODEC.fieldOf("trunk_steps").forGetter((trunkPlacer) -> {
            return trunkPlacer.trunkSteps;
        }), Codec.floatRange(0.0F, 1.0F).fieldOf("fork_probability").forGetter((trunkPlacer) -> {
            return trunkPlacer.forkProbability;
        }), RegistryCodecs.entryList(RegistryKeys.BLOCK).fieldOf("can_grow_through").forGetter((trunkPlacer) -> {
            return trunkPlacer.canGrowThrough;
        }))).apply(instance, CoconutTrunkPlacer::new);
    });
    private final IntProvider trunkSteps;
    private final float forkProbability;
    private final RegistryEntryList<Block> canGrowThrough;

    public CoconutTrunkPlacer(int baseHeight, int firstRandomHeight, int secondRandomHeight, IntProvider trunkSteps, float forkProbability, RegistryEntryList <Block> canGrowThrough) {
        super(baseHeight, firstRandomHeight, secondRandomHeight);
        this.trunkSteps = trunkSteps;
        this.forkProbability = forkProbability;
        this.canGrowThrough = canGrowThrough;
    }

    protected TrunkPlacerType<?> getType() {
        return TakieTerraTrunkPlacerTypes.COCONUT_TRUNK_PLACER;
    }

    public List<FoliagePlacer.TreeNode> generate(TestableWorld world, BiConsumer<BlockPos, BlockState> replacer, Random random, int height, BlockPos startPos, TreeFeatureConfig config) {
        List <FoliagePlacer.TreeNode> list = Lists.newArrayList();
        BlockPos.Mutable mutable = new BlockPos.Mutable().set(startPos.getX(), startPos.getY() - 1, startPos.getZ());
        BlockPos.Mutable forkedMutable = new BlockPos.Mutable().set(startPos.getX(), startPos.getY() + 1, startPos.getZ());
        boolean forked = random.nextFloat() < this.forkProbability;
        int steps = this.trunkSteps.get(random);
        int increment = random.nextBetween(0, 1);
        int forkedIncrement = random.nextBetween(0, 1);
        Direction offsetDirection = Direction.Type.HORIZONTAL.random(random);
        Direction offsetDirection2 = Direction.Type.HORIZONTAL.random(random);
        int forkedOffset = random.nextBetween(0 , 2);
        int forkedHeight = height - forkedOffset;

        for(int i = 0; i < height; ++i) {
            BlockPos pos = mutable.move(0, 1, 0);
            this.getAndSetState(world, replacer, random, pos, config);
            if (i >= 2) {
                if (forked && i < forkedHeight) {
                    BlockPos forkedPos = forkedMutable.move(0, 1, 0);
                    this.getAndSetState(world, replacer, random, forkedPos, config);
                    if(i == forkedHeight - 1) {
                        list.add(new FoliagePlacer.TreeNode(forkedPos.up(1), 0, false));
                    }
                }
                if(i == height - 1) {
                    list.add(new FoliagePlacer.TreeNode(pos.up(1), 0, false));
                }
                if (increment == 0) {
                    mutable.move(offsetDirection);
                    if (offsetDirection2 != offsetDirection) {
                        mutable.move(offsetDirection2);
                    }
                    increment = (height/steps) - random.nextBetween(-1, 1);
                }
                if (forkedIncrement == 0) {
                    forkedMutable.move(offsetDirection.getOpposite());
                    if (offsetDirection2 != offsetDirection) {
                        if (random.nextBoolean()) {
                            forkedMutable.move(offsetDirection2.getOpposite());
                        }
                    }
                    forkedIncrement = (forkedHeight/steps) - random.nextBetween(-1, 1);
                }
                --increment;
                --forkedIncrement;
            }

        }

        return list;
    }

    protected boolean canReplace(TestableWorld world, BlockPos pos) {
        return super.canReplace(world, pos) || world.testBlockState(pos, (state) -> {
            return state.isIn(this.canGrowThrough);
        });
    }
}