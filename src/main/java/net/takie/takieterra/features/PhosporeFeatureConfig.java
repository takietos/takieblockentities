package net.takie.takieterra.features;

import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.PillarBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.HugeMushroomFeatureConfig;
import net.minecraft.world.gen.feature.util.FeatureContext;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.takie.takieterra.util.TakieTerraTags;

import java.util.HashMap;
import java.util.Map;

public class PhosporeFeatureConfig implements FeatureConfig {
    public static final Codec<PhosporeFeatureConfig> CODEC = RecordCodecBuilder.create((instance) ->
            instance.group(
                            BlockStateProvider.TYPE_CODEC.fieldOf("cap_provider").forGetter((config) -> config.capProvider),
                            BlockStateProvider.TYPE_CODEC.fieldOf("stem_provider").forGetter((config) -> config.stemProvider),
                            Codec.INT.fieldOf("foliage_radius").forGetter((config) -> config.foliageRadius))
                    .apply(instance, PhosporeFeatureConfig::new));


    public final BlockStateProvider capProvider;
    public final BlockStateProvider stemProvider;
    public final int foliageRadius;

    public PhosporeFeatureConfig(BlockStateProvider capProvider, BlockStateProvider stemProvider, int foliageRadius) {
        this.capProvider = capProvider;
        this.stemProvider = stemProvider;
        this.foliageRadius = foliageRadius;

        }
    }
