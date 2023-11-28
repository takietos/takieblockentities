package net.takie.takieterra.features.tree.treedecorators;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.block.VineBlock;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;
import net.takie.takieterra.block.TakieTerraBlocks;
import net.takie.takieterra.init.TakieTerraTreeDecorators;

public class HangingMossTreeDecorator extends TreeDecorator
{
    public static final Codec<HangingMossTreeDecorator> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter((getter) -> getter.probability),
            Codec.intRange(1, 3).fieldOf("length").forGetter((getter) -> getter.length)
    ).apply(instance, HangingMossTreeDecorator::new));

    // Values
    protected final float probability;
    protected final int length;

    @Override
    protected TreeDecoratorType<?> getType() {
        return TakieTerraTreeDecorators.HANGING_MOSS;
    }

    public HangingMossTreeDecorator(float probability, int length)
    {
        this.probability = probability;
        this.length = length;
    }

    @Override
    public void generate(TreeDecorator.Generator generator) {
        Random random = generator.getRandom();
        generator.getLeavesPositions().forEach(pos -> {
            BlockPos blockPos;
            if (random.nextFloat() < this.probability && generator.isAir(blockPos = pos.west())) {
                HangingMossTreeDecorator.addHangingMoss(blockPos, VineBlock.EAST, generator);
            }
            if (random.nextFloat() < this.probability && generator.isAir(blockPos = pos.east())) {
                HangingMossTreeDecorator.addHangingMoss(blockPos, VineBlock.WEST, generator);
            }
            if (random.nextFloat() < this.probability && generator.isAir(blockPos = pos.north())) {
                HangingMossTreeDecorator.addHangingMoss(blockPos, VineBlock.SOUTH, generator);
            }
            if (random.nextFloat() < this.probability && generator.isAir(blockPos = pos.south())) {
                HangingMossTreeDecorator.addHangingMoss(blockPos, VineBlock.NORTH, generator);
            }
        });
    }


    private static void addHangingMoss(BlockPos pos, BooleanProperty property, Generator generator)
    {
        generator.replace(pos, TakieTerraBlocks.HANGING_MOSS.getDefaultState().with(property, true));
        int i = 2;

        for(BlockPos blockpos = pos.down(); (generator.isAir(blockpos) || generator.getWorld().testBlockState(blockpos, state -> state.isOf(Blocks.WATER))) && i > 0; --i)
        {
            generator.replace(blockpos, TakieTerraBlocks.HANGING_MOSS.getDefaultState().with(property, true).with(Properties.WATERLOGGED, generator.getWorld().testBlockState(blockpos, state -> state.isOf(Blocks.WATER))));
            blockpos = blockpos.down();
        }
    }
}
