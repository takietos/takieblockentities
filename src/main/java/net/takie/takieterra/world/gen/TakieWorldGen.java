package net.takie.takieterra.world.gen;

import net.minecraft.world.gen.stateprovider.BlockStateProviderType;
import net.takie.takieterra.features.TakieSimpleBlockStateProvider;
import net.takie.takieterra.mixin.BlockStateProviderMixin;

public class TakieWorldGen {
    public static final BlockStateProviderType<TakieSimpleBlockStateProvider> TAKIE_SIMPLE_BLOCK_STATE_PROVIDER = BlockStateProviderMixin.callRegister("takie_simple_block_state_provider",
            TakieSimpleBlockStateProvider.CODEC
    );

    public static void init() {
    }
}
