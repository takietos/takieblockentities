package net.takie.takieterra.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.takie.takieterra.item.TakieTerraItems;

import java.util.concurrent.CompletableFuture;


public class TakieTerraItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public TakieTerraItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN
                );

        getOrCreateTagBuilder(ItemTags.LOGS
                );

        getOrCreateTagBuilder(ItemTags.PLANKS);


        getOrCreateTagBuilder(ItemTags.SIGNS);

        getOrCreateTagBuilder(ItemTags.VILLAGER_PLANTABLE_SEEDS
        );

        getOrCreateTagBuilder(ItemTags.SMALL_FLOWERS
        );

        getOrCreateTagBuilder(ItemTags.FLOWERS
        );

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR);

    }
}
