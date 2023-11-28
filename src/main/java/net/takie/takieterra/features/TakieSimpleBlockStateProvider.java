package net.takie.takieterra.features;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.BlockStateProviderType;
import net.takie.takieterra.world.gen.TakieWorldGen;

public class TakieSimpleBlockStateProvider extends BlockStateProvider {
    public static final Codec<TakieSimpleBlockStateProvider> CODEC;

    static {
        CODEC = BlockState.CODEC.fieldOf("state").xmap(TakieSimpleBlockStateProvider::new,
                (takieSimpleBlockStateProvider) -> {
                    return takieSimpleBlockStateProvider.state;
                }
        ).codec();
    }

    private final BlockState state;

    public TakieSimpleBlockStateProvider(BlockState state) {
        this.state = state;
    }

    @Override protected BlockStateProviderType<?> getType() {
        return TakieWorldGen.TAKIE_SIMPLE_BLOCK_STATE_PROVIDER;
    }

    @Override public BlockState get(Random randomSource, BlockPos blockPos) {
        return this.state;
    }
}
