package net.takie.takieterra.features.tree.treedecorators;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;
import net.takie.takieterra.init.TakieTerraTreeDecorators;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WisteriaTreeDecorator extends TreeDecorator {
    public static final Codec<WisteriaTreeDecorator> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            Registries.BLOCK.getCodec().fieldOf("leafBlock").forGetter(WisteriaTreeDecorator::getLeafBlock),
            Registries.BLOCK.getCodec().fieldOf("logBlock").forGetter(WisteriaTreeDecorator::getLogBlock)
    ).apply(instance, WisteriaTreeDecorator::new));
    public static final List<Direction> ACCEPTABLE_POS = List.of(Direction.NORTH, Direction.SOUTH, Direction.EAST, Direction.WEST);
    public final Block leafBlock;
    public final Block logBlock;

    public WisteriaTreeDecorator(Block leafBlock, Block logBlock) {
        this.leafBlock = leafBlock;
        this.logBlock = logBlock;
    }

    public Block getLeafBlock() {
        return leafBlock;
    }

    public Block getLogBlock() {
        return logBlock;
    }

    @Override
    protected TreeDecoratorType<?> getType() {
        return TakieTerraTreeDecorators.WISTERIA_TREE_DECORATOR;
    }

    @Override
    public void generate(Generator generator) {
        List<BlockPos> leaves = generator.getLeavesPositions().stream().filter(blockPos -> generator.isAir(blockPos.down())).toList();
        for (BlockPos leaf : leaves) {
            if (generator.getRandom().nextFloat() >= 0.4f) continue;
            int limit = generator.getRandom().nextInt(4);
            for (int i = 1; i <= limit; i++) {
                BlockPos decoration = leaf.down(i).toImmutable();
                if (generator.isAir(decoration)) {
                    generator.replace(decoration, this.getLeafBlock().getDefaultState());
                }
            }
        }
        ObjectArrayList<BlockPos> logs = new ObjectArrayList<>(generator.getLogPositions());
        logs.sort(Comparator.comparingInt(Vec3i::getY));
        Collections.reverse(logs);
        BlockPos bottomLog = logs.stream().findFirst().orElseThrow();
        for (Direction acceptablePos : ACCEPTABLE_POS) {
            if (generator.getRandom().nextFloat() >= 0.55f) continue;
            BlockPos placementPosition = bottomLog.offset(acceptablePos).toImmutable();
            if (generator.isAir(placementPosition)) {
                generator.replace(placementPosition, this.getLogBlock().getDefaultState());
            }
        }
    }
}
