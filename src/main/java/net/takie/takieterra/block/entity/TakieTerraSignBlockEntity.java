package net.takie.takieterra.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.SignBlockEntity;
import net.minecraft.util.math.BlockPos;

public class TakieTerraSignBlockEntity extends SignBlockEntity {
    public TakieTerraSignBlockEntity(BlockPos pos, BlockState state) {
        super(pos, state);
    }

    @Override
    public BlockEntityType<?> getType() {
        return TakieTerraBlockEntities.TAKIETERRA_SIGN_BLOCK_ENTITY;
    }
}