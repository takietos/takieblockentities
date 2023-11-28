package net.takie.takieterra.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.Fertilizable;
import net.minecraft.block.MushroomPlantBlock;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.takie.takieterra.util.TakieTerraTags;

public class PhosporePlantBlock extends MushroomPlantBlock implements Fertilizable {
    public PhosporePlantBlock(Settings settings, RegistryKey<ConfiguredFeature<?, ?>> featureKey) {
        super(settings, featureKey);
    }
    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockPos blockPos = pos.down();
        BlockState blockState = world.getBlockState(blockPos);
        if (blockState.isIn(TakieTerraTags.Blocks.BRILLIOME_GROW_BLOCK)) {
            return true;
        }
        return world.getBaseLightLevel(pos, 0) < 13 && this.canPlantOnTop(blockState, world, blockPos);
    }
}
