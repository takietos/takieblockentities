package net.takie.takieterra.block.custom;

import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockLocating;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.takie.takieterra.block.TakieTerraBlocks;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;

public class WisteriaLeaves extends LeavesBlock implements Fertilizable {
    public WisteriaLeaves(AbstractBlock.Settings properties) {
        super(properties);
    }

    @Override
    public boolean isFertilizable(@NotNull WorldView levelReader, @NotNull BlockPos blockPos, @NotNull BlockState blockState, boolean bl) {
        Block vineBlock;
        Block vineBlock2;

        if(this.asBlock() == TakieTerraBlocks.BLUE_WISTERIA_LEAVES) {
            vineBlock = TakieTerraBlocks.BLUE_WISTERIA_VINES;
            vineBlock2 = TakieTerraBlocks.BLUE_WISTERIA_VINES_PLANT;
        }
        else if(this.asBlock() == TakieTerraBlocks.PINK_WISTERIA_LEAVES) {
            vineBlock = TakieTerraBlocks.PINK_WISTERIA_VINES;
            vineBlock2 = TakieTerraBlocks.PINK_WISTERIA_VINES_PLANT;
        }
        else if(this.asBlock() == TakieTerraBlocks.PURPLE_WISTERIA_LEAVES) {
            vineBlock = TakieTerraBlocks.PURPLE_WISTERIA_VINES;
            vineBlock2 = TakieTerraBlocks.PURPLE_WISTERIA_VINES_PLANT;
        }
        else {
            vineBlock = TakieTerraBlocks.WHITE_WISTERIA_VINES;
            vineBlock2 = TakieTerraBlocks.WHITE_WISTERIA_VINES_PLANT;
        }
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
        Block vineBlock;
        Block vineBlock2;

        if(this.asBlock() == TakieTerraBlocks.BLUE_WISTERIA_LEAVES) {
            vineBlock = TakieTerraBlocks.BLUE_WISTERIA_VINES;
            vineBlock2 = TakieTerraBlocks.BLUE_WISTERIA_VINES_PLANT;
        }
        else if(this.asBlock() == TakieTerraBlocks.PINK_WISTERIA_LEAVES) {
            vineBlock = TakieTerraBlocks.PINK_WISTERIA_VINES;
            vineBlock2 = TakieTerraBlocks.PINK_WISTERIA_VINES_PLANT;
        }
        else if(this.asBlock() == TakieTerraBlocks.PURPLE_WISTERIA_LEAVES) {
            vineBlock = TakieTerraBlocks.PURPLE_WISTERIA_VINES;
            vineBlock2 = TakieTerraBlocks.PURPLE_WISTERIA_VINES_PLANT;
        }
        else {
            vineBlock = TakieTerraBlocks.WHITE_WISTERIA_VINES;
            vineBlock2 = TakieTerraBlocks.WHITE_WISTERIA_VINES_PLANT;
        }

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
