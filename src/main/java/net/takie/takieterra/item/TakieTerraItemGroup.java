package net.takie.takieterra.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.takie.takieterra.TakieTerraMod;
import net.takie.takieterra.block.TakieTerraBlocks;

public class TakieTerraItemGroup {

    public static final ItemGroup OPAL_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(TakieTerraMod.MOD_ID, "opal_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.opal_group"))
                    .icon(() -> new ItemStack(TakieTerraItems.OPAL)).entries((displayContext, entries) -> {
                        entries.add(TakieTerraItems.OPAL);
                        entries.add(TakieTerraBlocks.OPAL_BLOCK);
                        entries.add(TakieTerraBlocks.OPAL_ORE);
                        entries.add(TakieTerraBlocks.DEEPSLATE_OPAL_ORE);

                    }).build());

    public static final ItemGroup SEA_OPAL_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(TakieTerraMod.MOD_ID, "sea_opal_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.sea_opal_group"))
                    .icon(() -> new ItemStack(TakieTerraItems.SEA_OPAL)).entries((displayContext, entries) -> {
                        entries.add(TakieTerraItems.SEA_OPAL);
                        entries.add(TakieTerraBlocks.SEA_OPAL_BLOCK);
                        entries.add(TakieTerraBlocks.SEA_OPAL_ORE);
                        entries.add(TakieTerraBlocks.DEEPSLATE_SEA_OPAL_ORE);

                    }).build());

    public static final ItemGroup PLANT_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(TakieTerraMod.MOD_ID, "plant_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.sea_opal_group"))
                    .icon(() -> new ItemStack(TakieTerraItems.SEA_OPAL)).entries((displayContext, entries) -> {
                        entries.add(TakieTerraItems.SEA_OPAL);
                        entries.add(TakieTerraBlocks.SEA_OPAL_BLOCK);
                        entries.add(TakieTerraBlocks.SEA_OPAL_ORE);
                        entries.add(TakieTerraBlocks.DEEPSLATE_SEA_OPAL_ORE);

                    }).build());

    static final ItemGroup CROP_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(TakieTerraMod.MOD_ID, "crop_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.crop_group"))
                    .icon(() -> new ItemStack(TakieTerraBlocks.CORN_CROP)).entries((displayContext, entries) -> {
                        entries.add(TakieTerraBlocks.CORN_CROP);
                        entries.add(TakieTerraItems.CORN_SEEDS);
                        entries.add(TakieTerraBlocks.TOMATO_CROP);
                        entries.add(TakieTerraItems.TOMATO_SEEDS);
                        entries.add(TakieTerraBlocks.STRAWBERRY_CROP);
                        entries.add(TakieTerraItems.STRAWBERRY_SEEDS);
                        entries.add(TakieTerraBlocks.LETTUCE_CROP);
                        entries.add(TakieTerraItems.LETTUCE_SEEDS);
                    }).build());

    public static void registerItemGroups() {

    }
}
