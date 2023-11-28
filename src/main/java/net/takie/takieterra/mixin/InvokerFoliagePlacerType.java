package net.takie.takieterra.mixin;

import com.mojang.serialization.Codec;
import net.minecraft.world.gen.foliage.FoliagePlacer;
import net.minecraft.world.gen.foliage.FoliagePlacerType;
import net.minecraft.world.gen.trunk.TrunkPlacer;
import net.minecraft.world.gen.trunk.TrunkPlacerType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(FoliagePlacerType.class)
public interface InvokerFoliagePlacerType {
    @Invoker
    @Deprecated
    static <P extends FoliagePlacer> FoliagePlacerType<P> callRegister(String id, Codec<P> codec) {
        throw new UnsupportedOperationException();
    }
}