package net.takie.takieterra.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.takie.takieterra.TakieTerraMod;
import net.takie.takieterra.block.TTComplexBlocks;

import java.util.Arrays;
import java.util.function.Supplier;

public enum TTBlockEntityType {
    COOKING_POT("cooking_pot", CookingPotBlockEntity.class, CookingPotBlockEntity::new, TTComplexBlocks.COOKING_POT);


    private final String pathName;
    private final Class<? extends BlockEntity> blockEntityClass;
    private final Supplier<BlockEntityType<? extends BlockEntity>> blockEntityTypeSupplier;
    private BlockEntityType<? extends BlockEntity> blockEntityType;

    TTBlockEntityType(String pathName, Class<? extends BlockEntity> blockEntityClass,
                             FabricBlockEntityTypeBuilder.Factory<? extends BlockEntity> blockEntitySupplier, TTComplexBlocks... blockRegistryArray) {
        this.pathName = pathName;
        this.blockEntityClass = blockEntityClass;
        this.blockEntityTypeSupplier = () -> FabricBlockEntityTypeBuilder.create(blockEntitySupplier, Arrays.stream(blockRegistryArray)
                .map(TTComplexBlocks::get).toArray(Block[]::new)).build(null);
    }

    public static void registerAll() {
        for (TTBlockEntityType value : values()) {
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(TakieTerraMod.MOD_ID, value.pathName), value.get());
        }
    }

    @SuppressWarnings("unchecked")
    public <T extends BlockEntity> BlockEntityType<T> get() {
        return (BlockEntityType<T>) get(blockEntityClass);
    }

    @SuppressWarnings({"unchecked","unused"})
    private <T extends BlockEntity> BlockEntityType<T> get(Class<T> clazz) {
        if (blockEntityType == null) {
            blockEntityType = blockEntityTypeSupplier.get();
        }

        return (BlockEntityType<T>) blockEntityType;
    }

    public String getId() {
        return Registries.BLOCK_ENTITY_TYPE.getId(get()).toString();
    }

}
