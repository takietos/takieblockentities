package net.takie.takieterra.block.custom;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.takie.takieterra.TakieTerraMod;
import net.takie.takieterra.item.TakieTerraFoodComponents;
import net.takie.takieterra.util.PearSoundEvents;

public class PearBlocks {
    public static MapColor calleryColor = MapColor.YELLOW;
        public static MapColor callerySideColor = MapColor.BROWN;


        public static BlockItem createBlockItem(String blockID, Block block){
            return Registry.register(Registries.ITEM, new Identifier(TakieTerraMod.MOD_ID, blockID), new BlockItem(block, new Item.Settings()));
        }
        public static BlockItem createBlockItem(String blockID, Block block, Item.Settings item){
            return Registry.register(Registries.ITEM, new Identifier(TakieTerraMod.MOD_ID, blockID), new BlockItem(block, item));
        }

        public static Block createBlockWithItem(String blockID, Block block){
            createBlockItem(blockID, block);
            return Registry.register(Registries.BLOCK, new Identifier(TakieTerraMod.MOD_ID, blockID), block);
        }
        public static Block createBlockWithoutItem(String blockID, Block block){
            return Registry.register(Registries.BLOCK, new Identifier(TakieTerraMod.MOD_ID, blockID), block);
        }


        public static Block createLampear(String name, Block block, FoodComponent foodComponent, Rarity rarity){
            return Registry.register(Registries.BLOCK, new Identifier(TakieTerraMod.MOD_ID, name), block);
        }
        public static Block createLampear(String name, Block block, FoodComponent foodComponent){
            return createLampear(name, block, foodComponent, Rarity.COMMON);
        }

    public static final Block PEAR_SAPLING = createBlockWithItem("pear_sapling", new PearSaplingBlock(AbstractBlock.Settings.copy(Blocks.OAK_SAPLING).sounds(BlockSoundGroup.CHERRY_SAPLING).offset(AbstractBlock.OffsetType.XZ).mapColor(MapColor.EMERALD_GREEN)));
    public static final Block POTTED_PEAR_SAPLING = createBlockWithoutItem("potted_pear_sapling",
            new FlowerPotBlock(PEAR_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_CHERRY_SAPLING)));

    public static final Block PEAR_TWIG = createBlockWithItem("pear_twig", new PearTwigBlock(AbstractBlock.Settings.copy(Blocks.DEAD_BUSH).offset(AbstractBlock.OffsetType.XZ).mapColor(MapColor.BROWN)));
    public static final Block POTTED_PEAR_TWIG = createBlockWithoutItem("potted_pear_twig", new FlowerPotBlock(PEAR_TWIG, AbstractBlock.Settings.copy(Blocks.POTTED_ACACIA_SAPLING)));

    public static final Block LAMPEAR = createLampear("lampear", new LampearBlock(AbstractBlock.Settings.create()
                    .luminance((state) -> 8).nonOpaque().strength(0.5f, 0.1f).mapColor(MapColor.PALE_YELLOW).sounds(PearSoundEvents.BLOCK_SOUND_PEAR)),
            TakieTerraFoodComponents.LAMPEAR);
    public static final Block COPPER_LAMPEAR = createLampear("copper_lampear", new LampearBlock(AbstractBlock.Settings.create()
            .luminance((state) -> 14).nonOpaque().strength(0.7f, 0.3f).mapColor(Blocks.COPPER_BLOCK.getDefaultMapColor())
            .sounds(PearSoundEvents.BLOCK_SOUND_PEAR)), TakieTerraFoodComponents.COPPER_LAMPEAR, Rarity.RARE);
    public static final Block LAMPEAR_BLOCK = createBlockWithItem("lampear_block", new MushroomBlock(AbstractBlock.Settings.create()
            .mapColor(state -> state.get(MushroomBlock.UP) ? calleryColor : MapColor.WHITE)
            .sounds(PearSoundEvents.BLOCK_SOUND_PEAR)
            .strength(0.75f).luminance(state -> 10)));

    public static final Block PEAR_VINE = createBlockWithItem("pear_vine", new PearVineBlock(AbstractBlock.Settings.copy(Blocks.OAK_SAPLING).sounds(BlockSoundGroup.CHERRY_SAPLING).offset(AbstractBlock.OffsetType.XZ).mapColor(MapColor.EMERALD_GREEN)));


        public static void init() {
        }
}