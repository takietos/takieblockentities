package net.takie.takieterra.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Fertilizable;
import net.minecraft.block.LeavesBlock;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockLocating;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.takie.takieterra.TakieTerraModClient;
import net.takie.takieterra.block.TakieTerraBlocks;
import net.takie.takieterra.block.TakieTerraTreeBlocks;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class AegiaLeaves extends LeavesBlock implements Fertilizable {
    public AegiaLeaves(Settings properties) {
        super(properties);
    }

    @Override
    public boolean isFertilizable(@NotNull WorldView levelReader, @NotNull BlockPos blockPos, @NotNull BlockState blockState, boolean bl) {
        Block vineBlock = TakieTerraTreeBlocks.AEGIA_VINES;
        Block vineBlock2 = TakieTerraTreeBlocks.AEGIA_VINES_PLANT;
        Optional<BlockPos> optional = BlockLocating.findColumnEnd(levelReader,
                blockPos,
                vineBlock2,
                Direction.DOWN,
                vineBlock
        );
        return (optional.isPresent() && levelReader.getBlockState(optional.get().offset(Direction.DOWN))
                .isAir()) || levelReader.getBlockState(blockPos.offset(Direction.DOWN)).isAir();
    }


    @Override public boolean canGrow(World level, Random randomSource, BlockPos blockPos, BlockState blockState) {
        return true;
    }

    @Override public void grow(ServerWorld serverLevel, Random randomSource, BlockPos blockPos, BlockState blockState) {
        Block vineBlock = TakieTerraTreeBlocks.AEGIA_VINES;
        Block vineBlock2 = TakieTerraTreeBlocks.AEGIA_VINES_PLANT;

        Optional <BlockPos> optional = BlockLocating.findColumnEnd(serverLevel,
                blockPos,
                vineBlock2,
                Direction.DOWN,
                vineBlock
        );
        if(optional.isPresent()) {
            BlockState blockState2 = serverLevel.getBlockState(optional.get());
            ((WisteriaVine) blockState2.getBlock()).grow(serverLevel, randomSource, optional.get(), blockState2);
        }
        if(optional.isEmpty()) {
            serverLevel.setBlockState(blockPos.down(), vineBlock.getDefaultState(), 2);
        }
    }
}