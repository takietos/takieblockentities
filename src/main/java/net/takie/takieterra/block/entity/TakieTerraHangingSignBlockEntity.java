package net.takie.takieterra.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.HangingSignBlockEntity;
import net.minecraft.util.math.BlockPos;

public class TakieTerraHangingSignBlockEntity extends HangingSignBlockEntity {
    public TakieTerraHangingSignBlockEntity(BlockPos pos, BlockState state) {
        super(pos, state);
    }

    @Override
    public BlockEntityType<?> getType() {
        return TakieTerraBlockEntities.TAKIETERRA_HANGING_SIGN_BLOCK_ENTITY;
    }
}
