package net.takie.takieterra.mixin;

import com.mojang.serialization.Codec;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.BlockStateProviderType;
import net.takie.takieterra.features.TakieSimpleBlockStateProvider;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(BlockStateProviderType.class) public interface BlockStateProviderMixin {
    @Invoker
    static <P extends BlockStateProvider> BlockStateProviderType <P> callRegister(String id, Codec<TakieSimpleBlockStateProvider> codec) {
        throw new IllegalStateException();
    }
}
