package net.takie.takieterra.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.takie.takieterra.block.TakieTerraBlocks;
import net.takie.takieterra.block.TakieTerraChippedBlocks;
import net.takie.takieterra.block.TakieTerraRockBlocks;
import net.takie.takieterra.block.TakieTerraTreeBlocks;

import java.util.concurrent.CompletableFuture;

public class TakieTerraBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public TakieTerraBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }


    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE
        );

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE
                );


        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE);


        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE
        );

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL

        );

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL
        );

        getOrCreateTagBuilder(BlockTags.FENCES
                );

        getOrCreateTagBuilder(BlockTags.FENCE_GATES);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN
                        );

        getOrCreateTagBuilder(BlockTags.STONE_ORE_REPLACEABLES

                );

        getOrCreateTagBuilder(BlockTags.DEEPSLATE_ORE_REPLACEABLES
                );

        getOrCreateTagBuilder(BlockTags.LEAVES
        );

        getOrCreateTagBuilder(BlockTags.FLOWERS
        );

        getOrCreateTagBuilder(BlockTags.FLOWER_POTS
        );

    }
}
