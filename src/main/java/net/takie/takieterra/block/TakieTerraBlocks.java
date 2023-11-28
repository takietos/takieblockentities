package net.takie.takieterra.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.takie.takieterra.TakieTerraMod;
import net.takie.takieterra.block.custom.*;
import net.takie.takieterra.block.custom.melons.*;
import net.takie.takieterra.block.custom.plants.TTGrowablePlantBlock;
import net.takie.takieterra.block.custom.plants.TTPlantBlock;
import net.takie.takieterra.block.custom.plants.TTTallPlantBlock;
import net.takie.takieterra.block.custom.plants.TurnableFlowerPotBlock;
import net.takie.takieterra.item.TakieTerraItems;
import net.takie.takieterra.world.TakieTerraConfiguredFeatures;

import java.util.List;
import java.util.function.Supplier;

public class TakieTerraBlocks {




    //ORES
    public static final Block OPAL_BLOCK = registerBlock("opal_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block OPAL_SLAB = registerBlock("opal_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block OPAL_BRICKS = registerBlock("opal_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block OPAL_BRICK_SLAB = registerBlock("opal_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block OPAL_BRICK_WALL = registerBlock("opal_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block OPAL_WALL = registerBlock("opal_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block OPAL_STAIRS = registerBlock("opal_stairs",
            new StairsBlock(TakieTerraBlocks.OPAL_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block OPAL_BRICK_STAIRS = registerBlock("opal_brick_stairs",
            new StairsBlock(TakieTerraBlocks.OPAL_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SEA_OPAL_BLOCK = registerBlock("sea_opal_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SEA_OPAL_BRICKS = registerBlock("sea_opal_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block OPAL_ORE = registerBlock("opal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE).mapColor(MapColor.TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
    public static final Block SEA_OPAL_SLAB = registerBlock("sea_opal_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SEA_OPAL_BRICK_SLAB = registerBlock("sea_opal_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SEA_OPAL_BRICK_WALL = registerBlock("sea_opal_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SEA_OPAL_WALL = registerBlock("sea_opal_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SEA_OPAL_STAIRS = registerBlock("sea_opal_stairs",
            new StairsBlock(TakieTerraBlocks.SEA_OPAL_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SEA_OPAL_BRICK_STAIRS = registerBlock("sea_opal_brick_stairs",
            new StairsBlock(TakieTerraBlocks.SEA_OPAL_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block DEEPSLATE_OPAL_ORE = registerBlock("deepslate_opal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_EMERALD_ORE).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));

    public static final Block SEA_OPAL_ORE = registerBlock("sea_opal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE).mapColor(MapColor.TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));

    public static final Block DEEPSLATE_SEA_OPAL_ORE = registerBlock("deepslate_sea_opal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_EMERALD_ORE).mapColor(MapColor.TEAL).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));

    public static final Block AMETRINE_BLOCK = registerBlock("ametrine_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.TERRACOTTA_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AMETRINE_BRICKS = registerBlock("ametrine_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.TERRACOTTA_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AMETRINE_ORE = registerBlock("ametrine_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE).mapColor(MapColor.TERRACOTTA_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_AMETRINE_ORE = registerBlock("deepslate_ametrine_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_EMERALD_ORE).mapColor(MapColor.TERRACOTTA_PINK).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));
    public static final Block AMETRINE_SLAB = registerBlock("ametrine_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.TERRACOTTA_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AMETRINE_BRICK_SLAB = registerBlock("ametrine_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AMETRINE_BRICK_WALL = registerBlock("ametrine_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AMETRINE_WALL = registerBlock("ametrine_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.TERRACOTTA_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AMETRINE_STAIRS = registerBlock("ametrine_stairs",
            new StairsBlock(TakieTerraBlocks.AMETRINE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.TERRACOTTA_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AMETRINE_BRICK_STAIRS = registerBlock("ametrine_brick_stairs",
            new StairsBlock(TakieTerraBlocks.AMETRINE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.TERRACOTTA_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block BLOODSTONE_BLOCK = registerBlock("bloodstone_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.DARK_CRIMSON).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BLOODSTONE_BRICKS = registerBlock("bloodstone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.DARK_CRIMSON).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BLOODSTONE_ORE = registerBlock("bloodstone_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE).mapColor(MapColor.DARK_CRIMSON).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
    public static final Block BLOODSTONE_SLAB = registerBlock("bloodstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.DARK_CRIMSON).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BLOODSTONE_BRICK_SLAB = registerBlock("bloodstone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DARK_CRIMSON).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BLOODSTONE_BRICK_WALL = registerBlock("bloodstone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DARK_CRIMSON).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BLOODSTONE_WALL = registerBlock("bloodstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.DARK_CRIMSON).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BLOODSTONE_STAIRS = registerBlock("bloodstone_stairs",
            new StairsBlock(TakieTerraBlocks.BLOODSTONE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.DARK_CRIMSON).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BLOODSTONE_BRICK_STAIRS = registerBlock("bloodstone_brick_stairs",
            new StairsBlock(TakieTerraBlocks.BLOODSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.DARK_CRIMSON).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block DEEPSLATE_BLOODSTONE_ORE = registerBlock("deepslate_bloodstone_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_EMERALD_ORE).mapColor(MapColor.DARK_CRIMSON).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));

    public static final Block BISMUTH_BLOCK = registerBlock("bismuth_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.EMERALD_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block BISMUTH_BRICKS = registerBlock("bismuth_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.EMERALD_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block BISMUTH_SLAB = registerBlock("bismuth_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.EMERALD_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block BISMUTH_BRICK_SLAB = registerBlock("bismuth_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.EMERALD_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block BISMUTH_BRICK_WALL = registerBlock("bismuth_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.EMERALD_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block BISMUTH_WALL = registerBlock("bismuth_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.EMERALD_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block BISMUTH_STAIRS = registerBlock("bismuth_stairs",
            new StairsBlock(TakieTerraBlocks.BISMUTH_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.EMERALD_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block BISMUTH_BRICK_STAIRS = registerBlock("bismuth_brick_stairs",
            new StairsBlock(TakieTerraBlocks.BISMUTH_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.EMERALD_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block BISMUTH_TILE = registerBlock("bismuth_tile",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.EMERALD_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block BISMUTH_GLASS = registerBlock("bismuth_glass",
            new GlassBlock(FabricBlockSettings.copyOf(Blocks.CYAN_STAINED_GLASS).mapColor(MapColor.EMERALD_GREEN).instrument(Instrument.BIT).requiresTool().strength(1.0f, 6.0f).sounds(BlockSoundGroup.GLASS)));
    public static final Block BISMUTH_GLASS_PANE = registerBlock("bismuth_glass_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.CYAN_STAINED_GLASS_PANE).mapColor(MapColor.EMERALD_GREEN).instrument(Instrument.BIT).requiresTool().strength(1.0f, 6.0f).sounds(BlockSoundGroup.GLASS)));
    public static final Block BISMUTH_ORE = registerBlock("bismuth_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE).mapColor(MapColor.EMERALD_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_BISMUTH_ORE = registerBlock("deepslate_bismuth_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE).mapColor(MapColor.EMERALD_GREEN).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));
    public static final Block FIRE_AGATE_SWIRL = registerBlock("fire_agate_swirl",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block FIRE_AGATE_WALL = registerBlock("fire_agate_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block FIRE_AGATE_STAIRS = registerBlock("fire_agate_stairs",
            new StairsBlock(TakieTerraBlocks.FIRE_AGATE_SWIRL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block FIRE_AGATE_SLAB = registerBlock("fire_agate_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block FIRE_AGATE_TRIM = registerBlock("fire_agate_trim",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block FIRE_AGATE_TILE = registerBlock("fire_agate_tile",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block FIRE_AGATE_ORE = registerBlock("fire_agate_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_FIRE_AGATE_ORE = registerBlock("deepslate_fire_agate_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_EMERALD_ORE).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));

    public static final Block CELESTITE_BLOCK = registerBlock("celestite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CELESTITE_BRICKS = registerBlock("celestite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CELESTITE_SLAB = registerBlock("celestite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CELESTITE_BRICK_SLAB = registerBlock("celestite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CELESTITE_BRICK_WALL = registerBlock("celestite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CELESTITE_WALL = registerBlock("celestite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CELESTITE_STAIRS = registerBlock("celestite_stairs",
            new StairsBlock(TakieTerraBlocks.CELESTITE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CELESTITE_BRICK_STAIRS = registerBlock("celestite_brick_stairs",
            new StairsBlock(TakieTerraBlocks.CELESTITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CELESTITE_ORE = registerBlock("celestite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE).mapColor(MapColor.LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_CELESTITE_ORE = registerBlock("deepslate_celestite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_EMERALD_ORE).mapColor(MapColor.LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));
    public static final Block HOWLITE_BLOCK = registerBlock("howlite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block HOWLITE_BRICKS = registerBlock("howlite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block HOWLITE_SLAB = registerBlock("howlite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block HOWLITE_BRICK_SLAB = registerBlock("howlite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block HOWLITE_BRICK_WALL = registerBlock("howlite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block HOWLITE_WALL = registerBlock("howlite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block HOWLITE_STAIRS = registerBlock("howlite_stairs",
            new StairsBlock(TakieTerraBlocks.HOWLITE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block HOWLITE_BRICK_STAIRS = registerBlock("howlite_brick_stairs",
            new StairsBlock(TakieTerraBlocks.HOWLITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block HOWLITE_ORE = registerBlock("howlite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_HOWLITE_ORE = registerBlock("deepslate_howlite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_EMERALD_ORE).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));
    public static final Block HYDITE_BLOCK = registerBlock("hydite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block HYDITE_BRICKS = registerBlock("hydite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block HYDITE_SLAB = registerBlock("hydite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block HYDITE_BRICK_SLAB = registerBlock("hydite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block HYDITE_BRICK_WALL = registerBlock("hydite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block HYDITE_WALL = registerBlock("hydite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block HYDITE_STAIRS = registerBlock("hydite_stairs",
            new StairsBlock(TakieTerraBlocks.HYDITE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block HYDITE_BRICK_STAIRS = registerBlock("hydite_brick_stairs",
            new StairsBlock(TakieTerraBlocks.HYDITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block HYDITE_ORE = registerBlock("hydite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_HYDITE_ORE = registerBlock("deepslate_hydite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_EMERALD_ORE).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));
    public static final Block IRIS_AGATE_BRICKS = registerBlock("iris_agate_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
   public static final Block IRIS_AGATE_BRICK_SLAB = registerBlock("iris_agate_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block IRIS_AGATE_BRICK_WALL = registerBlock("iris_agate_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block IRIS_AGATE_BRICK_STAIRS = registerBlock("iris_agate_brick_stairs",
            new StairsBlock(TakieTerraBlocks.IRIS_AGATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block IRIS_AGATE_TRIM = registerBlock("iris_agate_trim",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block IRIS_AGATE_ORE = registerBlock("iris_agate_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_IRIS_AGATE_ORE = registerBlock("deepslate_iris_agate_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_EMERALD_ORE).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));
    public static final Block KYANITE_BLOCK = registerBlock("kyanite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block KYANITE_BRICKS = registerBlock("kyanite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block KYANITE_SLAB = registerBlock("kyanite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block KYANITE_BRICK_SLAB = registerBlock("kyanite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block KYANITE_BRICK_WALL = registerBlock("kyanite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block KYANITE_WALL = registerBlock("kyanite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block KYANITE_STAIRS = registerBlock("kyanite_stairs",
            new StairsBlock(TakieTerraBlocks.KYANITE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block KYANITE_BRICK_STAIRS = registerBlock("kyanite_brick_stairs",
            new StairsBlock(TakieTerraBlocks.KYANITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block KYANITE_ORE = registerBlock("kyanite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE).mapColor(MapColor.BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_KYANITE_ORE = registerBlock("deepslate_kyanite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_EMERALD_ORE).mapColor(MapColor.BLUE).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));
    public static final Block LABRADORITE_BLOCK = registerBlock("labradorite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.DARK_AQUA).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LABRADORITE_BRICKS = registerBlock("labradorite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.DARK_AQUA).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LABRADORITE_SLAB = registerBlock("labradorite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.DARK_AQUA).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LABRADORITE_BRICK_SLAB = registerBlock("labradorite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DARK_AQUA).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LABRADORITE_BRICK_WALL = registerBlock("labradorite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DARK_AQUA).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LABRADORITE_WALL = registerBlock("labradorite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.DARK_AQUA).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LABRADORITE_STAIRS = registerBlock("labradorite_stairs",
            new StairsBlock(TakieTerraBlocks.LABRADORITE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.DARK_AQUA).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LABRADORITE_BRICK_STAIRS = registerBlock("labradorite_brick_stairs",
            new StairsBlock(TakieTerraBlocks.LABRADORITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.DARK_AQUA).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LABRADORITE_ORE = registerBlock("labradorite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE).mapColor(MapColor.DARK_AQUA).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_LABRADORITE_ORE = registerBlock("deepslate_labradorite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_EMERALD_ORE).mapColor(MapColor.DARK_AQUA).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));
    public static final Block LARIMAR_BLOCK = registerBlock("larimar_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LARIMAR_BRICKS = registerBlock("larimar_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LARIMAR_SLAB = registerBlock("larimar_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LARIMAR_BRICK_SLAB = registerBlock("larimar_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LARIMAR_BRICK_WALL = registerBlock("larimar_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LARIMAR_WALL = registerBlock("larimar_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LARIMAR_STAIRS = registerBlock("larimar_stairs",
            new StairsBlock(TakieTerraBlocks.LARIMAR_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LARIMAR_BRICK_STAIRS = registerBlock("larimar_brick_stairs",
            new StairsBlock(TakieTerraBlocks.LARIMAR_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LARIMAR_ORE = registerBlock("larimar_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_LARIMAR_ORE = registerBlock("deepslate_larimar_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_EMERALD_ORE).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));
    public static final Block LIDDICOATITE_BLOCK = registerBlock("liddicoatite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LIDDICOATITE_SLICE = registerBlock("liddicoatite_slice",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.GLASS_PANE).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LIDDICOATITE_TILE = registerBlock("liddicoatite_tile",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block GREEN_LIDDICOATITE_BLOCK = registerBlock("green_liddicoatite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GREEN_LIDDICOATITE_SLICE = registerBlock("green_liddicoatite_slice",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.GLASS_PANE).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GREEN_LIDDICOATITE_TILE = registerBlock("green_liddicoatite_tile",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LUSEDITE_ORE = registerBlock("lusedite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_LUSEDITE_ORE = registerBlock("deepslate_lusedite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_EMERALD_ORE).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));
    public static final Block LUSEDITE_BLOCK = registerBlock("lusedite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LUSEDITE_BRICKS = registerBlock("lusedite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LUSEDITE_SLAB = registerBlock("lusedite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LUSEDITE_BRICK_SLAB = registerBlock("lusedite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LUSEDITE_BRICK_WALL = registerBlock("lusedite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LUSEDITE_WALL = registerBlock("lusedite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LUSEDITE_STAIRS = registerBlock("lusedite_stairs",
            new StairsBlock(TakieTerraBlocks.LUSEDITE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LUSEDITE_BRICK_STAIRS = registerBlock("lusedite_brick_stairs",
            new StairsBlock(TakieTerraBlocks.LUSEDITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MALACHITE_ORE = registerBlock("malachite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_MALACHITE_ORE = registerBlock("deepslate_malachite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_EMERALD_ORE).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));
    public static final Block MALACHITE_BLOCK = registerBlock("malachite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MALACHITE_BRICKS = registerBlock("malachite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MALACHITE_SLAB = registerBlock("malachite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MALACHITE_BRICK_SLAB = registerBlock("malachite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MALACHITE_BRICK_WALL = registerBlock("malachite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MALACHITE_WALL = registerBlock("malachite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MALACHITE_STAIRS = registerBlock("malachite_stairs",
            new StairsBlock(TakieTerraBlocks.MALACHITE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MALACHITE_BRICK_STAIRS = registerBlock("malachite_brick_stairs",
            new StairsBlock(TakieTerraBlocks.MALACHITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MOONSTONE_ORE = registerBlock("moonstone_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_MOONSTONE_ORE = registerBlock("deepslate_moonstone_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_EMERALD_ORE).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));
    public static final Block MOONSTONE_BLOCK = registerBlock("moonstone_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MOONSTONE_BRICKS = registerBlock("moonstone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MOONSTONE_SLAB = registerBlock("moonstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MOONSTONE_BRICK_SLAB = registerBlock("moonstone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MOONSTONE_BRICK_WALL = registerBlock("moonstone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MOONSTONE_WALL = registerBlock("moonstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MOONSTONE_STAIRS = registerBlock("moonstone_stairs",
            new StairsBlock(TakieTerraBlocks.MOONSTONE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MOONSTONE_BRICK_STAIRS = registerBlock("moonstone_brick_stairs",
            new StairsBlock(TakieTerraBlocks.MOONSTONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ORANGE_CALCITE_ORE = registerBlock("orange_calcite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_ORANGE_CALCITE_ORE = registerBlock("deepslate_orange_calcite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_EMERALD_ORE).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));
    public static final Block ORANGE_CALCITE_BLOCK = registerBlock("orange_calcite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ORANGE_CALCITE_BRICKS = registerBlock("orange_calcite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ORANGE_CALCITE_SLAB = registerBlock("orange_calcite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ORANGE_CALCITE_BRICK_SLAB = registerBlock("orange_calcite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ORANGE_CALCITE_BRICK_WALL = registerBlock("orange_calcite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ORANGE_CALCITE_WALL = registerBlock("orange_calcite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ORANGE_CALCITE_STAIRS = registerBlock("orange_calcite_stairs",
            new StairsBlock(TakieTerraBlocks.ORANGE_CALCITE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ORANGE_CALCITE_BRICK_STAIRS = registerBlock("orange_calcite_brick_stairs",
            new StairsBlock(TakieTerraBlocks.ORANGE_CALCITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PERIDOT_ORE = registerBlock("peridot_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE).mapColor(MapColor.PALE_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_PERIDOT_ORE = registerBlock("deepslate_peridot_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_EMERALD_ORE).mapColor(MapColor.PALE_GREEN).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));
    public static final Block PERIDOT_BLOCK = registerBlock("peridot_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.PALE_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PINK_LIDDICOATITE_BLOCK = registerBlock("pink_liddicoatite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE).mapColor(MapColor.PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PINK_LIDDICOATITE_SLICE = registerBlock("pink_liddicoatite_slice",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_EMERALD_ORE).mapColor(MapColor.PINK).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block PINK_LIDDICOATITE_TILE = registerBlock("pink_liddicoatite_tile",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ROSE_GOLD_ORE = registerBlock("rose_gold_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.GOLD_ORE).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_ROSE_GOLD_ORE = registerBlock("deepslate_rose_gold_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_GOLD_ORE).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));
    public static final Block RAW_ROSE_GOLD_BLOCK = registerBlock("raw_rose_gold_block",
            new Block(FabricBlockSettings.copyOf(Blocks.RAW_GOLD_BLOCK).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ROSE_GOLD_BLOCK = registerBlock("rose_gold_block",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE).mapColor(MapColor.RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_EMERALD_ORE).mapColor(MapColor.RED).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SAPPHIRE_ORE = registerBlock("sapphire_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE).mapColor(MapColor.BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_EMERALD_ORE).mapColor(MapColor.BLUE).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));
    public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block RHODOCHROSITE_ORE = registerBlock("rhodochrosite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE).mapColor(MapColor.PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_RHODOCHROSITE_ORE = registerBlock("deepslate_rhodochrosite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_EMERALD_ORE).mapColor(MapColor.PINK).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));
    public static final Block RHODOCHROSITE_BLOCK = registerBlock("rhodochrosite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RHODOCHROSITE_BRICKS = registerBlock("rhodochrosite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RHODOCHROSITE_SLAB = registerBlock("rhodochrosite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RHODOCHROSITE_BRICK_SLAB = registerBlock("rhodochrosite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RHODOCHROSITE_BRICK_WALL = registerBlock("rhodochrosite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RHODOCHROSITE_WALL = registerBlock("rhodochrosite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RHODOCHROSITE_STAIRS = registerBlock("rhodochrosite_stairs",
            new StairsBlock(TakieTerraBlocks.RHODOCHROSITE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RHODOCHROSITE_BRICK_STAIRS = registerBlock("rhodochrosite_brick_stairs",
            new StairsBlock(TakieTerraBlocks.RHODOCHROSITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CITRINE_ORE = registerBlock("citrine_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE).mapColor(MapColor.TERRACOTTA_YELLOW).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_CITRINE_ORE = registerBlock("deepslate_citrine_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_EMERALD_ORE).mapColor(MapColor.TERRACOTTA_YELLOW).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));
    public static final Block CITRINE_BLOCK = registerBlock("citrine_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.TERRACOTTA_YELLOW).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CITRINE_BRICKS = registerBlock("citrine_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.TERRACOTTA_YELLOW).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CITRINE_SLAB = registerBlock("citrine_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.TERRACOTTA_YELLOW).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CITRINE_BRICK_SLAB = registerBlock("citrine_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_YELLOW).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CITRINE_BRICK_WALL = registerBlock("citrine_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_YELLOW).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CITRINE_WALL = registerBlock("citrine_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.TERRACOTTA_YELLOW).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CITRINE_STAIRS = registerBlock("citrine_stairs",
            new StairsBlock(TakieTerraBlocks.CITRINE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.TERRACOTTA_YELLOW).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CITRINE_BRICK_STAIRS = registerBlock("citrine_brick_stairs",
            new StairsBlock(TakieTerraBlocks.CITRINE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.TERRACOTTA_YELLOW).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block TITANIUM_QUARTZ_BLOCK = registerBlock("titanium_quartz_block",
            new AmethystBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BIT).requiresTool().strength(1.5f).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block TITANIUM_QUARTZ_CLUSTER = registerBlock("titanium_quartz_cluster",
            new TitaniumQuartzClusterBlock(7, 3, AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).solid().nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance(state -> 5).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block BUDDING_TITANIUM_QUARTZ_BLOCK = registerBlock("budding_titanium_quartz_block",
            new BuddingTitaniumQuartzBlock(FabricBlockSettings.copyOf(Blocks.BUDDING_AMETHYST)));
    public static final Block SMALL_TITANIUM_QUARTZ_BUD = registerBlock("small_titanium_quartz_bud",
            new TitaniumQuartzClusterBlock(3, 4, AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).solid().nonOpaque().ticksRandomly().sounds(BlockSoundGroup.SMALL_AMETHYST_BUD).luminance(state -> 1).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block MEDIUM_TITANIUM_QUARTZ_BUD = registerBlock("medium_titanium_quartz_bud",
            new TitaniumQuartzClusterBlock(4, 3, AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).solid().nonOpaque().ticksRandomly().sounds(BlockSoundGroup.MEDIUM_AMETHYST_BUD).luminance(state -> 2).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block LARGE_TITANIUM_QUARTZ_BUD = registerBlock("large_titanium_quartz_bud",
            new TitaniumQuartzClusterBlock(5, 3, AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).solid().nonOpaque().ticksRandomly().sounds(BlockSoundGroup.LARGE_AMETHYST_BUD).luminance(state -> 3).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block ROSE_QUARTZ_BLOCK = registerBlock("rose_quartz_block",
            new AmethystBlock(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(1.5f).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block ROSE_QUARTZ_CLUSTER = registerBlock("rose_quartz_cluster",
            new RoseQuartzClusterBlock(7, 3, AbstractBlock.Settings.create().mapColor(MapColor.DULL_PINK).solid().nonOpaque().ticksRandomly().sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.5f).luminance(state -> 5).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block BUDDING_ROSE_QUARTZ_BLOCK = registerBlock("budding_rose_quartz_block",
            new BuddingRoseQuartzBlock(FabricBlockSettings.copyOf(Blocks.BUDDING_AMETHYST)));
    public static final Block SMALL_ROSE_QUARTZ_BUD = registerBlock("small_rose_quartz_bud",
            new RoseQuartzClusterBlock(3, 4, AbstractBlock.Settings.create().mapColor(MapColor.DULL_PINK).solid().nonOpaque().ticksRandomly().sounds(BlockSoundGroup.SMALL_AMETHYST_BUD).luminance(state -> 1).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block MEDIUM_ROSE_QUARTZ_BUD = registerBlock("medium_rose_quartz_bud",
            new RoseQuartzClusterBlock(4, 3, AbstractBlock.Settings.create().mapColor(MapColor.DULL_PINK).solid().nonOpaque().ticksRandomly().sounds(BlockSoundGroup.MEDIUM_AMETHYST_BUD).luminance(state -> 2).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block LARGE_ROSE_QUARTZ_BUD = registerBlock("large_rose_quartz_bud",
            new RoseQuartzClusterBlock(5, 3, AbstractBlock.Settings.create().mapColor(MapColor.DULL_PINK).solid().nonOpaque().ticksRandomly().sounds(BlockSoundGroup.LARGE_AMETHYST_BUD).luminance(state -> 3).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block TANZANITE_ORE = registerBlock("tanzanite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE).mapColor(MapColor.PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_TANZANITE_ORE = registerBlock("deepslate_tanzanite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_EMERALD_ORE).mapColor(MapColor.PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));
    public static final Block TANZANITE_BLOCK = registerBlock("tanzanite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SNOWFLAKE_OBSIDIAN_BLOCK = registerBlock("snowflake_obsidian_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SNOWFLAKE_OBSIDIAN_BRICKS = registerBlock("snowflake_obsidian_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SNOWFLAKE_OBSIDIAN_BRICK_SLAB = registerBlock("snowflake_obsidian_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SNOWFLAKE_OBSIDIAN_TILES = registerBlock("snowflake_obsidian_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SNOWFLAKE_OBSIDIAN_TILE_SLAB = registerBlock("snowflake_obsidian_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SNOWFLAKE_OBSIDIAN_SLAB = registerBlock("snowflake_obsidian_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SNOWFLAKE_OBSIDIAN_BRICK_WALL = registerBlock("snowflake_obsidian_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_YELLOW).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SNOWFLAKE_OBSIDIAN_WALL = registerBlock("snowflake_obsidian_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.TERRACOTTA_YELLOW).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SNOWFLAKE_OBSIDIAN_STAIRS = registerBlock("snowflake_obsidian_stairs",
            new StairsBlock(TakieTerraBlocks.SNOWFLAKE_OBSIDIAN_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.TERRACOTTA_YELLOW).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SNOWFLAKE_OBSIDIAN_BRICK_STAIRS = registerBlock("snowflake_obsidian_brick_stairs",
            new StairsBlock(TakieTerraBlocks.SNOWFLAKE_OBSIDIAN_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.TERRACOTTA_YELLOW).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SNOWFLAKE_OBSIDIAN_ORE = registerBlock("snowflake_obsidian_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_SNOWFLAKE_OBSIDIAN_ORE = registerBlock("deepslate_snowflake_obsidian_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_EMERALD_ORE).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));
    public static final Block TOPAZ_ORE = registerBlock("topaz_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE).mapColor(MapColor.TERRACOTTA_YELLOW).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_TOPAZ_ORE = registerBlock("deepslate_topaz_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_EMERALD_ORE).mapColor(MapColor.TERRACOTTA_YELLOW).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));
    public static final Block TURQUOISE_BLOCK = registerBlock("turquoise_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.DARK_AQUA).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TURQUOISE_BRICKS = registerBlock("turquoise_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK).mapColor(MapColor.DARK_AQUA).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TURQUOISE_SLAB = registerBlock("turquoise_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.DARK_AQUA).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TURQUOISE_BRICK_SLAB = registerBlock("turquoise_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DARK_AQUA).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TURQUOISE_BRICK_WALL = registerBlock("turquoise_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DARK_AQUA).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TURQUOISE_WALL = registerBlock("turquoise_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.DARK_AQUA).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TURQUOISE_STAIRS = registerBlock("turquoise_stairs",
            new StairsBlock(TakieTerraBlocks.TURQUOISE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.DARK_AQUA).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TURQUOISE_BRICK_STAIRS = registerBlock("turquoise_brick_stairs",
            new StairsBlock(TakieTerraBlocks.TURQUOISE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.DARK_AQUA).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TURQUOISE_ORE = registerBlock("turquoise_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE).mapColor(MapColor.DARK_AQUA).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_TURQUOISE_ORE = registerBlock("deepslate_turquoise_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_EMERALD_ORE).mapColor(MapColor.DARK_AQUA).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));
    public static final Block APATITE_BLOCK = registerBlock("apatite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).mapColor(MapColor.LAPIS_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block APATITE_BRICKS = registerBlock("apatite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).mapColor(MapColor.LAPIS_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block APATITE_SLAB = registerBlock("apatite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.DARK_AQUA).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block APATITE_BRICK_SLAB = registerBlock("apatite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DARK_AQUA).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block APATITE_BRICK_WALL = registerBlock("apatite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DARK_AQUA).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block APATITE_WALL = registerBlock("apatite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.DARK_AQUA).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block APATITE_STAIRS = registerBlock("apatite_stairs",
            new StairsBlock(TakieTerraBlocks.APATITE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.DARK_AQUA).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block APATITE_BRICK_STAIRS = registerBlock("apatite_brick_stairs",
            new StairsBlock(TakieTerraBlocks.APATITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.DARK_AQUA).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block APATITE_ORE = registerBlock("apatite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.LAPIS_ORE).mapColor(MapColor.LAPIS_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_APATITE_ORE = registerBlock("deepslate_apatite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_LAPIS_ORE).mapColor(MapColor.LAPIS_BLUE).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));
    public static final Block ANGELITE_BLOCK = registerBlock("angelite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).mapColor(MapColor.DIAMOND_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ANGELITE_BRICKS = registerBlock("angelite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).mapColor(MapColor.DIAMOND_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ANGELITE_SLAB = registerBlock("angelite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.DIAMOND_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ANGELITE_BRICK_SLAB = registerBlock("angelite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DIAMOND_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ANGELITE_BRICK_WALL = registerBlock("angelite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DIAMOND_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ANGELITE_WALL = registerBlock("angelite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.DIAMOND_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ANGELITE_STAIRS = registerBlock("angelite_stairs",
            new StairsBlock(TakieTerraBlocks.ANGELITE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.DIAMOND_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ANGELITE_BRICK_STAIRS = registerBlock("angelite_brick_stairs",
            new StairsBlock(TakieTerraBlocks.ANGELITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.DIAMOND_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ANGELITE_ORE = registerBlock("angelite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.LAPIS_ORE).mapColor(MapColor.DIAMOND_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_ANGELITE_ORE = registerBlock("deepslate_angelite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_LAPIS_ORE).mapColor(MapColor.DIAMOND_BLUE).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));
    public static final Block AMBER_BLOCK = registerBlock("amber_block",
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AMBER_BRICKS = registerBlock("amber_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AMBER_SLAB = registerBlock("amber_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AMBER_BRICK_SLAB = registerBlock("amber_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AMBER_BRICK_WALL = registerBlock("amber_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AMBER_WALL = registerBlock("amber_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AMBER_STAIRS = registerBlock("amber_stairs",
            new StairsBlock(TakieTerraBlocks.AMBER_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AMBER_BRICK_STAIRS = registerBlock("amber_brick_stairs",
            new StairsBlock(TakieTerraBlocks.AMBER_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_AMBER = registerBlock("polished_amber",
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AMBER_ORE = registerBlock("amber_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.LAPIS_ORE).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_AMBER_ORE = registerBlock("deepslate_amber_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_LAPIS_ORE).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));
    public static final Block NEPHRITE_BLOCK = registerBlock("nephrite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).mapColor(MapColor.EMERALD_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NEPHRITE_BRICKS = registerBlock("nephrite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).mapColor(MapColor.EMERALD_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NEPHRITE_SLAB = registerBlock("nephrite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.EMERALD_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NEPHRITE_BRICK_SLAB = registerBlock("nephrite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.EMERALD_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NEPHRITE_BRICK_WALL = registerBlock("nephrite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.EMERALD_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NEPHRITE_WALL = registerBlock("nephrite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.EMERALD_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NEPHRITE_STAIRS = registerBlock("nephrite_stairs",
            new StairsBlock(TakieTerraBlocks.NEPHRITE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.EMERALD_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NEPHRITE_BRICK_STAIRS = registerBlock("nephrite_brick_stairs",
            new StairsBlock(TakieTerraBlocks.NEPHRITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.EMERALD_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_NEPHRITE = registerBlock("polished_nephrite",
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).mapColor(MapColor.EMERALD_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NEPHRITE_ORE = registerBlock("nephrite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.LAPIS_ORE).mapColor(MapColor.EMERALD_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_NEPHRITE_ORE = registerBlock("deepslate_nephrite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_LAPIS_ORE).mapColor(MapColor.EMERALD_GREEN).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));
    public static final Block CINNABAR_BLOCK = registerBlock("cinnabar_block",
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).mapColor(MapColor.RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CINNABAR_BRICKS = registerBlock("cinnabar_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).mapColor(MapColor.RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CINNABAR_SLAB = registerBlock("cinnabar_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CINNABAR_BRICK_SLAB = registerBlock("cinnabar_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CINNABAR_BRICK_WALL = registerBlock("cinnabar_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CINNABAR_WALL = registerBlock("cinnabar_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CINNABAR_STAIRS = registerBlock("cinnabar_stairs",
            new StairsBlock(TakieTerraBlocks.CINNABAR_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CINNABAR_BRICK_STAIRS = registerBlock("cinnabar_brick_stairs",
            new StairsBlock(TakieTerraBlocks.CINNABAR_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_CINNABAR = registerBlock("polished_cinnabar",
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).mapColor(MapColor.RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CINNABAR_ORE = registerBlock("cinnabar_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.LAPIS_ORE).mapColor(MapColor.RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_CINNABAR_ORE = registerBlock("deepslate_cinnabar_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_LAPIS_ORE).mapColor(MapColor.RED).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));
    public static final Block WHITE_PEARLITE_BLOCK = registerBlock("white_pearlite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block WHITE_PEARLITE_BRICKS = registerBlock("white_pearlite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block WHITE_PEARLITE_SLAB = registerBlock("white_pearlite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block WHITE_PEARLITE_BRICK_SLAB = registerBlock("white_pearlite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block WHITE_PEARLITE_BRICK_WALL = registerBlock("white_pearlite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block WHITE_PEARLITE_WALL = registerBlock("white_pearlite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block WHITE_PEARLITE_STAIRS = registerBlock("white_pearlite_stairs",
            new StairsBlock(TakieTerraBlocks.WHITE_PEARLITE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block WHITE_PEARLITE_BRICK_STAIRS = registerBlock("white_pearlite_brick_stairs",
            new StairsBlock(TakieTerraBlocks.WHITE_PEARLITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block WHITE_PEARLITE_ORE = registerBlock("white_pearlite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.LAPIS_ORE).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_WHITE_PEARLITE_ORE = registerBlock("deepslate_white_pearlite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_LAPIS_ORE).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));
    public static final Block FANTASY_PEARLITE_BLOCK = registerBlock("fantasy_pearlite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block FANTASY_PEARLITE_BRICKS = registerBlock("fantasy_pearlite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block FANTASY_PEARLITE_SLAB = registerBlock("fantasy_pearlite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block FANTASY_PEARLITE_BRICK_SLAB = registerBlock("fantasy_pearlite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block FANTASY_PEARLITE_BRICK_WALL = registerBlock("fantasy_pearlite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block FANTASY_PEARLITE_WALL = registerBlock("fantasy_pearlite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block FANTASY_PEARLITE_STAIRS = registerBlock("fantasy_pearlite_stairs",
            new StairsBlock(TakieTerraBlocks.FANTASY_PEARLITE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block FANTASY_PEARLITE_BRICK_STAIRS = registerBlock("fantasy_pearlite_brick_stairs",
            new StairsBlock(TakieTerraBlocks.FANTASY_PEARLITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block FANTASY_PEARLITE_ORE = registerBlock("fantasy_pearlite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.LAPIS_ORE).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_FANTASY_PEARLITE_ORE = registerBlock("deepslate_fantasy_pearlite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_LAPIS_ORE).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));
    public static final Block SEASHELL_PEARLITE_BLOCK = registerBlock("seashell_pearlite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).mapColor(MapColor.TERRACOTTA_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SEASHELL_PEARLITE_BRICKS = registerBlock("seashell_pearlite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).mapColor(MapColor.TERRACOTTA_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SEASHELL_PEARLITE_SLAB = registerBlock("seashell_pearlite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.TERRACOTTA_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SEASHELL_PEARLITE_BRICK_SLAB = registerBlock("seashell_pearlite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SEASHELL_PEARLITE_BRICK_WALL = registerBlock("seashell_pearlite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SEASHELL_PEARLITE_WALL = registerBlock("seashell_pearlite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.TERRACOTTA_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SEASHELL_PEARLITE_STAIRS = registerBlock("seashell_pearlite_stairs",
            new StairsBlock(TakieTerraBlocks.SEASHELL_PEARLITE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.TERRACOTTA_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SEASHELL_PEARLITE_BRICK_STAIRS = registerBlock("seashell_pearlite_brick_stairs",
            new StairsBlock(TakieTerraBlocks.SEASHELL_PEARLITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.TERRACOTTA_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SEASHELL_PEARLITE_ORE = registerBlock("seashell_pearlite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.LAPIS_ORE).mapColor(MapColor.TERRACOTTA_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_SEASHELL_PEARLITE_ORE = registerBlock("deepslate_seashell_pearlite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_LAPIS_ORE).mapColor(MapColor.TERRACOTTA_WHITE).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));
    public static final Block STARINITE_BLOCK = registerBlock("starinite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block STARINITE_BRICKS = registerBlock("starinite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block STARINITE_SLAB = registerBlock("starinite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block STARINITE_BRICK_SLAB = registerBlock("starinite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block STARINITE_BRICK_WALL = registerBlock("starinite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block STARINITE_WALL = registerBlock("starinite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block STARINITE_STAIRS = registerBlock("starinite_stairs",
            new StairsBlock(TakieTerraBlocks.STARINITE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block STARINITE_BRICK_STAIRS = registerBlock("starinite_brick_stairs",
            new StairsBlock(TakieTerraBlocks.STARINITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block STARINITE_ORE = registerBlock("starinite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.LAPIS_ORE).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_STARINITE_ORE = registerBlock("deepslate_starinite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_LAPIS_ORE).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));
    public static final Block NEBULITE_BLOCK = registerBlock("nebulite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NEBULITE_BRICKS = registerBlock("nebulite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NEBULITE_SLAB = registerBlock("nebulite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NEBULITE_BRICK_SLAB = registerBlock("nebulite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NEBULITE_BRICK_WALL = registerBlock("nebulite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NEBULITE_WALL = registerBlock("nebulite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NEBULITE_STAIRS = registerBlock("nebulite_stairs",
            new StairsBlock(TakieTerraBlocks.NEBULITE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NEBULITE_BRICK_STAIRS = registerBlock("nebulite_brick_stairs",
            new StairsBlock(TakieTerraBlocks.NEBULITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NEBULITE_ORE = registerBlock("nebulite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.LAPIS_ORE).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_NEBULITE_ORE = registerBlock("deepslate_nebulite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_LAPIS_ORE).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));
    public static final Block CHALCEDONY_BLOCK = registerBlock("chalcedony_block",
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).mapColor(MapColor.WATER_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CHALCEDONY_BRICKS = registerBlock("chalcedony_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).mapColor(MapColor.WATER_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CHALCEDONY_SLAB = registerBlock("chalcedony_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.WATER_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CHALCEDONY_BRICK_SLAB = registerBlock("chalcedony_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.WATER_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CHALCEDONY_BRICK_WALL = registerBlock("chalcedony_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.WATER_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CHALCEDONY_WALL = registerBlock("chalcedony_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.WATER_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CHALCEDONY_STAIRS = registerBlock("chalcedony_stairs",
            new StairsBlock(TakieTerraBlocks.CHALCEDONY_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.WATER_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CHALCEDONY_BRICK_STAIRS = registerBlock("chalcedony_brick_stairs",
            new StairsBlock(TakieTerraBlocks.CHALCEDONY_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.WATER_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CHALCEDONY_ORE = registerBlock("chalcedony_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.LAPIS_ORE).mapColor(MapColor.WATER_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_CHALCEDONY_ORE = registerBlock("deepslate_chalcedony_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_LAPIS_ORE).mapColor(MapColor.WATER_BLUE).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));
    public static final Block RAINFOREST_JASPER_BLOCK = registerBlock("rainforest_jasper_block",
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RAINFOREST_JASPER_BRICKS = registerBlock("rainforest_jasper_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RAINFOREST_JASPER_SLAB = registerBlock("rainforest_jasper_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RAINFOREST_JASPER_BRICK_SLAB = registerBlock("rainforest_jasper_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RAINFOREST_JASPER_BRICK_WALL = registerBlock("rainforest_jasper_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RAINFOREST_JASPER_WALL = registerBlock("rainforest_jasper_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RAINFOREST_JASPER_STAIRS = registerBlock("rainforest_jasper_stairs",
            new StairsBlock(TakieTerraBlocks.RAINFOREST_JASPER_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RAINFOREST_JASPER_BRICK_STAIRS = registerBlock("rainforest_jasper_brick_stairs",
            new StairsBlock(TakieTerraBlocks.RAINFOREST_JASPER_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RAINFOREST_JASPER_ORE = registerBlock("rainforest_jasper_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.LAPIS_ORE).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_RAINFOREST_JASPER_ORE = registerBlock("deepslate_rainforest_jasper_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_LAPIS_ORE).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));
    public static final Block BRECCIA = registerBlock("breccia",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BRECCIA_BRICKS = registerBlock("breccia_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BRECCIA_SLAB = registerBlock("breccia_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BRECCIA_BRICK_SLAB = registerBlock("breccia_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BRECCIA_BRICK_WALL = registerBlock("breccia_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BRECCIA_WALL = registerBlock("breccia_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BRECCIA_STAIRS = registerBlock("breccia_stairs",
            new StairsBlock(TakieTerraBlocks.BRECCIA.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BRECCIA_BRICK_STAIRS = registerBlock("breccia_brick_stairs",
            new StairsBlock(TakieTerraBlocks.BRECCIA_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block COOL_GRANITE = registerBlock("cool_granite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block COOL_GRANITE_SLAB = registerBlock("cool_granite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.TERRACOTTA_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block COOL_GRANITE_WALL = registerBlock("cool_granite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.TERRACOTTA_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block COOL_GRANITE_STAIRS = registerBlock("cool_granite_stairs",
            new StairsBlock(TakieTerraBlocks.COOL_GRANITE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.TERRACOTTA_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block COQUINA = registerBlock("coquina",
            new SandBlock(14406560, AbstractBlock.Settings.copy(Blocks.SANDSTONE)));
    public static final Block DACITE = registerBlock("dacite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LIGHT_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DACITE_BRICKS = registerBlock("dacite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.LIGHT_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DACITE_SLAB = registerBlock("dacite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.LIGHT_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DACITE_BRICK_SLAB = registerBlock("dacite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LIGHT_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DACITE_BRICK_WALL = registerBlock("dacite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.LIGHT_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DACITE_WALL = registerBlock("dacite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.LIGHT_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DACITE_STAIRS = registerBlock("dacite_stairs",
            new StairsBlock(TakieTerraBlocks.DACITE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.LIGHT_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DACITE_BRICK_STAIRS = registerBlock("dacite_brick_stairs",
            new StairsBlock(TakieTerraBlocks.DACITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.LIGHT_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DARK_SYENITE = registerBlock("dark_syenite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DARK_SYENITE_BRICKS = registerBlock("dark_syenite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DARK_SYENITE_SLAB = registerBlock("dark_syenite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DARK_SYENITE_BRICK_SLAB = registerBlock("dark_syenite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DARK_SYENITE_WALL = registerBlock("dark_syenite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DARK_SYENITE_BRICK_WALL = registerBlock("dark_syenite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DARK_SYENITE_STAIRS = registerBlock("dark_syenite_stairs",
            new StairsBlock(TakieTerraBlocks.DARK_SYENITE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DARK_SYENITE_BRICK_STAIRS = registerBlock("dark_syenite_brick_stairs",
            new StairsBlock(TakieTerraBlocks.DARK_SYENITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block WAVE_DOLOMITE_TILE = registerBlock("wave_dolomite_tile",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DUNITE = registerBlock("dunite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LICHEN_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DUNITE_BRICKS = registerBlock("dunite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.LICHEN_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DUNITE_SLAB = registerBlock("dunite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.LICHEN_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DUNITE_BRICK_SLAB = registerBlock("dunite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LICHEN_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DUNITE_WALL = registerBlock("dunite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.LICHEN_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DUNITE_BRICK_WALL = registerBlock("dunite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.LICHEN_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DUNITE_STAIRS = registerBlock("dunite_stairs",
            new StairsBlock(TakieTerraBlocks.DUNITE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.LICHEN_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DUNITE_BRICK_STAIRS = registerBlock("dunite_brick_stairs",
            new StairsBlock(TakieTerraBlocks.DUNITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.LICHEN_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GNEISS = registerBlock("gneiss",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GNEISS_BRICKS = registerBlock("gneiss_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GNEISS_SLAB = registerBlock("gneiss_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GNEISS_BRICK_SLAB = registerBlock("gneiss_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GNEISS_WALL = registerBlock("gneiss_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GNEISS_BRICK_WALL = registerBlock("gneiss_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GNEISS_STAIRS = registerBlock("gneiss_stairs",
            new StairsBlock(TakieTerraBlocks.GNEISS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GNEISS_BRICK_STAIRS = registerBlock("gneiss_brick_stairs",
            new StairsBlock(TakieTerraBlocks.GNEISS_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block HUANITE = registerBlock("huanite",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).mapColor(MapColor.PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block HUANITE_BRICKS = registerBlock("huanite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).mapColor(MapColor.PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block HUANITE_SLAB = registerBlock("huanite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block HUANITE_BRICK_SLAB = registerBlock("huanite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block HUANITE_WALL = registerBlock("huanite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block HUANITE_BRICK_WALL = registerBlock("huanite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block HUANITE_STAIRS = registerBlock("huanite_stairs",
            new StairsBlock(TakieTerraBlocks.HUANITE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block HUANITE_BRICK_STAIRS = registerBlock("huanite_brick_stairs",
            new StairsBlock(TakieTerraBlocks.HUANITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block JET_MARBLE = registerBlock("jet_marble",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block JET_MARBLE_BRICKS = registerBlock("jet_marble_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block JET_MARBLE_SLAB = registerBlock("jet_marble_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block JET_MARBLE_BRICK_SLAB = registerBlock("jet_marble_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block JET_MARBLE_WALL = registerBlock("jet_marble_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block JET_MARBLE_BRICK_WALL = registerBlock("jet_marble_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block JET_MARBLE_STAIRS = registerBlock("jet_marble_stairs",
            new StairsBlock(TakieTerraBlocks.JET_MARBLE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block JET_MARBLE_BRICK_STAIRS = registerBlock("jet_marble_brick_stairs",
            new StairsBlock(TakieTerraBlocks.JET_MARBLE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PALE_SYENITE = registerBlock("pale_syenite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LIGHT_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PALE_SYENITE_BRICKS = registerBlock("pale_syenite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LIGHT_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PALE_SYENITE_SLAB = registerBlock("pale_syenite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.LIGHT_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PALE_SYENITE_BRICK_SLAB = registerBlock("pale_syenite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LIGHT_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PALE_SYENITE_WALL = registerBlock("pale_syenite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.LIGHT_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PALE_SYENITE_BRICK_WALL = registerBlock("pale_syenite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.LIGHT_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PALE_SYENITE_STAIRS = registerBlock("pale_syenite_stairs",
            new StairsBlock(TakieTerraBlocks.PALE_SYENITE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.LIGHT_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PALE_SYENITE_BRICK_STAIRS = registerBlock("pale_syenite_brick_stairs",
            new StairsBlock(TakieTerraBlocks.PALE_SYENITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.LIGHT_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LIMESTONE = registerBlock("limestone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LIMESTONE_BRICKS = registerBlock("limestone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LIMESTONE_SLAB = registerBlock("limestone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LIMESTONE_BRICK_SLAB = registerBlock("limestone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LIMESTONE_WALL = registerBlock("limestone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LIMESTONE_BRICK_WALL = registerBlock("limestone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LIMESTONE_STAIRS = registerBlock("limestone_stairs",
            new StairsBlock(TakieTerraBlocks.LIMESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LIMESTONE_BRICK_STAIRS = registerBlock("limestone_brick_stairs",
            new StairsBlock(TakieTerraBlocks.LIMESTONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MARBLE = registerBlock("marble",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MARBLE_BRICKS = registerBlock("marble_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MARBLE_SLAB = registerBlock("marble_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MARBLE_BRICK_SLAB = registerBlock("marble_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MARBLE_WALL = registerBlock("marble_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MARBLE_BRICK_WALL = registerBlock("marble_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MARBLE_STAIRS = registerBlock("marble_stairs",
            new StairsBlock(TakieTerraBlocks.MARBLE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MARBLE_BRICK_STAIRS = registerBlock("marble_brick_stairs",
            new StairsBlock(TakieTerraBlocks.MARBLE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PEGMATITE = registerBlock("pegmatite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.SPRUCE_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PEGMATITE_BRICKS = registerBlock("pegmatite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.SPRUCE_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PEGMATITE_SLAB = registerBlock("pegmatite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.SPRUCE_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PEGMATITE_BRICK_SLAB = registerBlock("pegmatite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.SPRUCE_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PEGMATITE_WALL = registerBlock("pegmatite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.SPRUCE_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PEGMATITE_BRICK_WALL = registerBlock("pegmatite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.SPRUCE_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PEGMATITE_STAIRS = registerBlock("pegmatite_stairs",
            new StairsBlock(TakieTerraBlocks.MARBLE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.SPRUCE_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PEGMATITE_BRICK_STAIRS = registerBlock("pegmatite_brick_stairs",
            new StairsBlock(TakieTerraBlocks.PEGMATITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.SPRUCE_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RED_RIBBON_JASPER = registerBlock("red_ribbon_jasper",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DULL_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SCORCHED_RHYOLITE = registerBlock("scorched_rhyolite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ROANITE = registerBlock("roanite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ROANITE_BRICKS = registerBlock("roanite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ROANITE_SLAB = registerBlock("roanite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ROANITE_BRICK_SLAB = registerBlock("roanite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ROANITE_WALL = registerBlock("roanite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ROANITE_BRICK_WALL = registerBlock("roanite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ROANITE_STAIRS = registerBlock("roanite_stairs",
            new StairsBlock(TakieTerraBlocks.ROANITE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ROANITE_BRICK_STAIRS = registerBlock("roanite_brick_stairs",
            new StairsBlock(TakieTerraBlocks.ROANITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TONGITE = registerBlock("tongite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DARK_DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TONGITE_BRICKS = registerBlock("tongite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DARK_DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TONGITE_SLAB = registerBlock("tongite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.DARK_DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TONGITE_BRICK_SLAB = registerBlock("tongite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DARK_DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TONGITE_WALL = registerBlock("tongite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DARK_DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TONGITE_BRICK_WALL = registerBlock("tongite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.DARK_DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TONGITE_STAIRS = registerBlock("tongite_stairs",
            new StairsBlock(TakieTerraBlocks.TONGITE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.DARK_DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TONGITE_BRICK_STAIRS = registerBlock("tongite_brick_stairs",
            new StairsBlock(TakieTerraBlocks.TONGITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.DARK_DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block WARM_GRANITE = registerBlock("warm_granite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block WARM_GRANITE_SLAB = registerBlock("warm_granite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block WARM_GRANITE_WALL = registerBlock("warm_granite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block WARM_GRANITE_STAIRS = registerBlock("warm_granite_stairs",
            new StairsBlock(TakieTerraBlocks.WARM_GRANITE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block WAVE_DOLOMITE = registerBlock("wave_dolomite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block WAVE_DOLOMITE_SLAB = registerBlock("wave_dolomite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block WAVE_DOLOMITE_WALL = registerBlock("wave_dolomite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block WAVE_DOLOMITE_STAIRS = registerBlock("wave_dolomite_stairs",
            new StairsBlock(TakieTerraBlocks.WAVE_DOLOMITE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SCORIA = registerBlock("scoria",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RUSSET_SCORIA = registerBlock("russet_scoria",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SLATE = registerBlock("slate",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SLATE_BRICKS = registerBlock("slate_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SLATE_SLAB = registerBlock("slate_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SLATE_BRICK_SLAB = registerBlock("slate_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SLATE_WALL = registerBlock("slate_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SLATE_BRICK_WALL = registerBlock("slate_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SLATE_STAIRS = registerBlock("slate_stairs",
            new StairsBlock(TakieTerraBlocks.SLATE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SLATE_BRICK_STAIRS = registerBlock("slate_brick_stairs",
            new StairsBlock(TakieTerraBlocks.SLATE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SANDSTONE_BRICKS = registerBlock("sandstone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_SANDSTONE).mapColor(MapColor.PALE_YELLOW).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SANDY_BRICKS = registerBlock("sandy_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_SANDSTONE).mapColor(MapColor.PALE_YELLOW).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SANDY_BRICKS_RED = registerBlock("sandy_bricks_red",
            new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_SANDSTONE).mapColor(MapColor.DULL_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block STONE_TILES = registerBlock("stone_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block HAY_THATCH = registerBlock("hay_thatch",
            new HayBlock(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).mapColor(MapColor.YELLOW).instrument(Instrument.BANJO).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.GRASS)));
    public static final Block HAY_THATCH_SLAB = registerBlock("hay_thatch_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).mapColor(MapColor.YELLOW).instrument(Instrument.BANJO).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.GRASS)));
    public static final Block HAY_THATCH_STAIRS = registerBlock("hay_thatch_stairs",
            new StairsBlock(TakieTerraBlocks.HAY_THATCH.getDefaultState(), FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).mapColor(MapColor.YELLOW).instrument(Instrument.BANJO).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.GRASS)));
    public static final Block RIAD_FLOOR_TILES_RED = registerBlock("riad_floor_tiles_red",
            new Block(FabricBlockSettings.copyOf(Blocks.CALCITE).mapColor(MapColor.DULL_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.CALCITE)));
    public static final Block RIAD_FLOOR_TILES_TEAL = registerBlock("riad_floor_tiles_teal",
            new Block(FabricBlockSettings.copyOf(Blocks.CALCITE).mapColor(MapColor.TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.CALCITE)));

    public static final Block AURANITE_BLOCK = registerBlock("auranite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).mapColor(MapColor.TERRACOTTA_PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AURANITE_BRICKS = registerBlock("auranite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).mapColor(MapColor.TERRACOTTA_PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AURANITE_SLAB = registerBlock("auranite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.TERRACOTTA_PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AURANITE_BRICK_SLAB = registerBlock("auranite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AURANITE_BRICK_WALL = registerBlock("auranite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AURANITE_WALL = registerBlock("auranite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.TERRACOTTA_PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AURANITE_STAIRS = registerBlock("auranite_stairs",
            new StairsBlock(TakieTerraBlocks.AURANITE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.TERRACOTTA_PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AURANITE_BRICK_STAIRS = registerBlock("auranite_brick_stairs",
            new StairsBlock(TakieTerraBlocks.AURANITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.TERRACOTTA_PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AURANITE_ORE = registerBlock("auranite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.LAPIS_ORE).mapColor(MapColor.TERRACOTTA_PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_AURANITE_ORE = registerBlock("deepslate_auranite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_LAPIS_ORE).mapColor(MapColor.TERRACOTTA_PURPLE).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));
    public static final Block SUGILITE_BLOCK = registerBlock("sugilite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).mapColor(MapColor.PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SUGILITE_BRICKS = registerBlock("sugilite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).mapColor(MapColor.PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SUGILITE_SLAB = registerBlock("sugilite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SUGILITE_BRICK_SLAB = registerBlock("sugilite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SUGILITE_BRICK_WALL = registerBlock("sugilite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SUGILITE_WALL = registerBlock("sugilite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL).mapColor(MapColor.PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SUGILITE_STAIRS = registerBlock("sugilite_stairs",
            new StairsBlock(TakieTerraBlocks.SUGILITE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SUGILITE_BRICK_STAIRS = registerBlock("sugilite_brick_stairs",
            new StairsBlock(TakieTerraBlocks.SUGILITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_STAIRS).mapColor(MapColor.PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SUGILITE_ORE = registerBlock("sugilite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.LAPIS_ORE).mapColor(MapColor.PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE), UniformIntProvider.create(3, 7)));
    public static final Block DEEPSLATE_SUGILITE_ORE = registerBlock("deepslate_sugilite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_LAPIS_ORE).mapColor(MapColor.PURPLE).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)));

    //METALS
    public static final Block BRONZE_BLOCK = registerBlock("bronze_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block BRONZE_BRICKS = registerBlock("bronze_bricks",
            new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.create().mapColor(MapColor.ORANGE).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.COPPER)));
    public static final Block WAXED_BRONZE_BRICKS = registerBlock("waxed_bronze_bricks",
            new Block(FabricBlockSettings.copyOf(TakieTerraBlocks.BRONZE_BRICKS)));
    public static final Block CUT_BRONZE_BLOCK = registerBlock("cut_bronze_block",
            new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block WAXED_CUT_BRONZE_BLOCK = registerBlock("waxed_cut_bronze_block",
            new Block(FabricBlockSettings.copyOf(TakieTerraBlocks.CUT_BRONZE_BLOCK)));
    public static final Block BRONZE_TILES = registerBlock("bronze_tiles",
            new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block WAXED_BRONZE_TILES = registerBlock("waxed_bronze_tiles",
            new Block(FabricBlockSettings.copyOf(TakieTerraBlocks.BRONZE_TILES)));
    public static final Block WEATHERED_BRONZE_BRICKS = registerBlock("weathered_bronze_bricks",
            new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block WAXED_WEATHERED_BRONZE_BRICKS = registerBlock("waxed_weathered_bronze_bricks",
            new Block(FabricBlockSettings.copyOf(TakieTerraBlocks.BRONZE_BRICKS)));
    public static final Block WEATHERED_CUT_BRONZE_BLOCK = registerBlock("weathered_cut_bronze_block",
            new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block WAXED_WEATHERED_CUT_BRONZE_BLOCK = registerBlock("waxed_weathered_cut_bronze_block",
            new Block(FabricBlockSettings.copyOf(TakieTerraBlocks.CUT_BRONZE_BLOCK)));
    public static final Block WEATHERED_BRONZE_TILES = registerBlock("weathered_bronze_tiles",
            new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block WAXED_WEATHERED_BRONZE_TILES = registerBlock("waxed_weathered_bronze_tiles",
            new Block(FabricBlockSettings.copyOf(TakieTerraBlocks.BRONZE_TILES)));
    public static final Block ANCIENT_BRONZE_BRICKS = registerBlock("ancient_bronze_bricks",
            new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block WAXED_ANCIENT_BRONZE_BRICKS = registerBlock("waxed_ancient_bronze_bricks",
            new Block(FabricBlockSettings.copyOf(TakieTerraBlocks.BRONZE_BRICKS)));
    public static final Block ANCIENT_CUT_BRONZE_BLOCK = registerBlock("ancient_cut_bronze_block",
            new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block WAXED_ANCIENT_CUT_BRONZE_BLOCK = registerBlock("waxed_ancient_cut_bronze_block",
            new Block(FabricBlockSettings.copyOf(TakieTerraBlocks.CUT_BRONZE_BLOCK)));
    public static final Block ANCIENT_BRONZE_TILES = registerBlock("ancient_bronze_tiles",
            new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block WAXED_ANCIENT_BRONZE_TILES = registerBlock("waxed_ancient_bronze_tiles",
            new Block(FabricBlockSettings.copyOf(TakieTerraBlocks.BRONZE_TILES)));
    public static final Block BRONZE_DECO_TILE = registerBlock("bronze_deco_tile",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block BRONZE_MIRROR = registerBlock("bronze_mirror",
            new TrellisBlock(FabricBlockSettings.create().strength(2.0f).sounds(BlockSoundGroup.METAL)));

    public static final Block AZULEJO_TILE = registerBlock("azulejo_tile",
            new Block(FabricBlockSettings.copyOf(Blocks.CALCITE).mapColor(MapColor.LAPIS_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.CALCITE)));

    public static final Block DECORATIVE_KNOT = registerBlock("decorative_knot",
            new DecorativeKnotBlock(FabricBlockSettings.create().strength(0.1f).sounds(BlockSoundGroup.GRASS)));

    public static final Block ICICLE = registerBlock("icicle",
            new IcicleBlock(FabricBlockSettings.create().strength(0.5f).sounds(BlockSoundGroup.GLASS).nonOpaque()));

    public static final Block PAPER_BLOCK = registerBlock("paper_block",
            new Block(FabricBlockSettings.create().mapColor(MapColor.OFF_WHITE).strength(0.1f, 0.8f).sounds(BlockSoundGroup.MANGROVE_ROOTS).instrument(Instrument.BASS)));
    public static final Block PAPER_DOOR_COUPLET = registerBlock("paper_door_couplet",
            new FacingBlockHorizontal(FabricBlockSettings.copy(Blocks.OAK_WOOD), Block.createCuboidShape(0, 0, 0, 16, 16, 16)));
    public static final Block PAPER_BLESSING = registerBlock("paper_blessing",
            new TrellisBlock(FabricBlockSettings.create().mapColor(MapColor.OFF_WHITE).strength(0.1f, 0.8f).sounds(BlockSoundGroup.GRASS).instrument(Instrument.BASS)));
    public static final Block PAPER_BLESSING_WINDOW = registerBlock("paper_blessing_window",
            new TrellisBlock(FabricBlockSettings.create().mapColor(MapColor.OFF_WHITE).strength(0.1f, 0.8f).sounds(BlockSoundGroup.GRASS).instrument(Instrument.BASS)));
    public static final Block PAPER_DOOR = registerBlock("paper_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_DOOR), BlockSetType.BAMBOO));
    public static final Block PAPER_TRAPDOOR = registerBlock("paper_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_TRAPDOOR), BlockSetType.BAMBOO));
    public static final Block PAPER_WALL = registerBlock("paper_wall",
            new PaneBlock(FabricBlockSettings.create().mapColor(MapColor.OFF_WHITE).strength(0.1f, 0.8f).sounds(BlockSoundGroup.MANGROVE_ROOTS).instrument(Instrument.BASS)));
    public static final Block PAPER_LANTERN = registerBlock("paper_lantern",
            new PaperLanternBlock(FabricBlockSettings.create().mapColor(MapColor.OFF_WHITE).strength(0.1f, 0.8f).sounds(BlockSoundGroup.MANGROVE_ROOTS).luminance(15).instrument(Instrument.BASS)));
    public static final Block WHITE_PAPER_LANTERN = registerBlock("white_paper_lantern",
            new WhitePaperLanternBlock(FabricBlockSettings.create().mapColor(MapColor.OFF_WHITE).strength(0.1f, 0.8f).sounds(BlockSoundGroup.GRASS).luminance(15).instrument(Instrument.BASS)));
    public static final Block RED_LANTERN = registerBlock("red_lantern",
            new RedLanternBlock(FabricBlockSettings.create().mapColor(MapColor.RED).strength(0.1f, 0.8f).sounds(BlockSoundGroup.MANGROVE_ROOTS).luminance(15).instrument(Instrument.BASS)));

    public static final Block OAK_WINDOW_DOOR = registerBlock("oak_window_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block OAK_WINDOW_0 = registerBlock("oak_window_0",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(0.5f).sounds(BlockSoundGroup.MANGROVE_ROOTS)));
    public static final Block OAK_WINDOW_1 = registerBlock("oak_window_1",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(0.5f).sounds(BlockSoundGroup.MANGROVE_ROOTS)));
    public static final Block OAK_WINDOW_2 = registerBlock("oak_window_2",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(0.5f).sounds(BlockSoundGroup.MANGROVE_ROOTS)));
    public static final Block VERMILION_PLANKS = registerBlock("vermilion_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block VERMILION_WINDOW_DOOR = registerBlock("vermilion_window_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));

    public static final Block AMETHYST_LAMP = registerBlock("amethyst_lamp",
            new Block(FabricBlockSettings.create().mapColor(MapColor.PALE_PURPLE).strength(1.0f, 0.8f).sounds(BlockSoundGroup.AMETHYST_BLOCK).luminance(15).instrument(Instrument.BIT)));

    public static final Block STONE_LANTERN = registerBlock("stone_lantern",
            new StoneLanternBlock(FabricBlockSettings.create().mapColor(MapColor.STONE_GRAY).strength(1.5f).sounds(BlockSoundGroup.STONE).luminance(10).instrument(Instrument.BASS).nonOpaque()));
    public static final Block STONE_LANTERN_MOSSY = registerBlock("stone_lantern_mossy",
            new StoneLanternBlock(FabricBlockSettings.create().mapColor(MapColor.STONE_GRAY).strength(1.5f).sounds(BlockSoundGroup.STONE).luminance(10).instrument(Instrument.BASS).nonOpaque()));
    public static final Block STONE_LANTERN_POST = registerBlock("stone_lantern_post",
            new StoneLanternPostBlock(FabricBlockSettings.create().mapColor(MapColor.STONE_GRAY).strength(1.5f).sounds(BlockSoundGroup.STONE).luminance(10).instrument(Instrument.BASS).nonOpaque()));

    public static final Block TOASTER_CYAN = registerBlock("toaster_cyan",
            new FacingBlockHorizontal(FabricBlockSettings.create().mapColor(MapColor.BRIGHT_TEAL).strength(1.5f).sounds(BlockSoundGroup.METAL).instrument(Instrument.BIT).nonOpaque(), Block.createCuboidShape(1,0,4,15,10,12)));

    public static final Block SUSHI_PLATTER = registerBlock("sushi_platter",
            new FacingBlockHorizontal(FabricBlockSettings.create().mapColor(MapColor.OAK_TAN).strength(0.5f).sounds(BlockSoundGroup.BAMBOO_WOOD).instrument(Instrument.BIT).nonOpaque(), Block.createCuboidShape(0,0,2,16,4,14)));

    public static final Block SANDCASTLE = registerBlock("sandcastle",
            new SandcastleBlock(FabricBlockSettings.create().mapColor(MapColor.OFF_WHITE).strength(0.7f).sounds(BlockSoundGroup.SAND).instrument(Instrument.BIT).nonOpaque().ticksRandomly()));
    public static final Block SEASHELL_CLAM = registerBlock("seashell_clam",
            new SeashellBlock(FabricBlockSettings.create().mapColor(MapColor.DULL_PINK).strength(0.5f).sounds(BlockSoundGroup.BONE).instrument(Instrument.BIT).nonOpaque()));

    public static final Block SEASHELL_BLOCK = registerBlock("seashell_block",
            new Block(FabricBlockSettings.create().mapColor(MapColor.DULL_PINK).strength(1.0f).sounds(BlockSoundGroup.BONE).instrument(Instrument.BIT)));
    public static final Block SEASHELL_SLAB = registerBlock("seashell_slab",
            new SlabBlock(FabricBlockSettings.create().mapColor(MapColor.DULL_PINK).strength(1.0f).sounds(BlockSoundGroup.BONE).instrument(Instrument.BIT)));
    public static final Block SEASHELL_STAIRS = registerBlock("seashell_stairs",
            new StairsBlock(TakieTerraBlocks.SEASHELL_BLOCK.getDefaultState(), FabricBlockSettings.create().mapColor(MapColor.DULL_PINK).strength(1.0f).sounds(BlockSoundGroup.BONE).instrument(Instrument.BIT)));
    public static final Block SEASHELL_WALL = registerBlock("seashell_wall",
            new WallBlock(FabricBlockSettings.create().mapColor(MapColor.DULL_PINK).strength(1.0f).sounds(BlockSoundGroup.BONE).instrument(Instrument.BIT)));


    public static final Block OAK_LOG_STOOL = registerBlock("oak_log_stool",
            new FacingBlockHorizontal(FabricBlockSettings.create().mapColor(MapColor.OAK_TAN).strength(1.0f).sounds(BlockSoundGroup.WOOD).instrument(Instrument.BIT).nonOpaque(), Block.createCuboidShape(3, 0, 3, 13, 8, 13)));
    public static final Block OAK_LOG_STACK = registerBlock("oak_log_stack",
            new FacingBlockHorizontal(FabricBlockSettings.create().mapColor(MapColor.OAK_TAN).strength(1.0f).sounds(BlockSoundGroup.WOOD).instrument(Instrument.BIT).nonOpaque(), Block.createCuboidShape(1, 0, 0, 14, 12, 16)));
    public static final Block WATERING_CAN = registerBlock("watering_can",
            new FacingBlockHorizontal(FabricBlockSettings.create().mapColor(MapColor.IRON_GRAY).strength(1.5f).sounds(BlockSoundGroup.METAL).instrument(Instrument.BIT).nonOpaque(), Block.createCuboidShape(4, 0, 4, 14, 12, 12)));
    public static final Block WOODEN_WATER_PAIL = registerBlock("wooden_water_pail",
            new FacingBlockHorizontal(FabricBlockSettings.create().mapColor(MapColor.OAK_TAN).strength(1.0f).sounds(BlockSoundGroup.WOOD).instrument(Instrument.BIT).nonOpaque(), Block.createCuboidShape(2, 0, 2, 14, 14, 14)));


    public static final Block ELEGANT_LANTERN = registerBlock("elegant_lantern",
            new LanternBlock(FabricBlockSettings.create().mapColor(MapColor.BLACK).strength(1.0f).sounds(BlockSoundGroup.WOOD).luminance(15).instrument(Instrument.BASS)));

    public static final Block DAWN_SAKURA_WALL = registerBlock("dawn_sakura_wall",
            new DawnSakuraWallBlock(FabricBlockSettings.create().mapColor(MapColor.DARK_GREEN).strength(0.2f, 0.7f).sounds(BlockSoundGroup.BAMBOO_WOOD).instrument(Instrument.BASS)));
    public static final Block DAWN_SAKURA_WINDOW = registerBlock("dawn_sakura_window",
            new PaneBlock(FabricBlockSettings.create().mapColor(MapColor.DULL_PINK).strength(0.1f, 0.8f).sounds(BlockSoundGroup.MANGROVE_ROOTS).instrument(Instrument.BASS)));

    public static final Block BRONZE_ROOF_TILES = registerBlock("bronze_roof_tiles",
            new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block WAXED_BRONZE_ROOF_TILES = registerBlock("waxed_bronze_roof_tiles",
            new Block(FabricBlockSettings.copyOf(TakieTerraBlocks.BRONZE_ROOF_TILES)));
    public static final Block BRONZE_ROOF_SLAB = registerBlock("bronze_roof_slab",
            new OxidizableSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block WAXED_BRONZE_ROOF_SLAB = registerBlock("waxed_bronze_roof_slab",
            new SlabBlock(FabricBlockSettings.copyOf(TakieTerraBlocks.BRONZE_ROOF_SLAB)));
    public static final Block WEATHERED_BRONZE_ROOF_TILES = registerBlock("weathered_bronze_roof_tiles",
            new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block WAXED_WEATHERED_BRONZE_ROOF_TILES = registerBlock("waxed_weathered_bronze_roof_tiles",
            new Block(FabricBlockSettings.copyOf(TakieTerraBlocks.BRONZE_ROOF_TILES)));
    public static final Block WEATHERED_BRONZE_ROOF_SLAB = registerBlock("weathered_bronze_roof_slab",
            new OxidizableSlabBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block WAXED_WEATHERED_BRONZE_ROOF_SLAB = registerBlock("waxed_weathered_bronze_roof_slab",
            new SlabBlock(FabricBlockSettings.copyOf(TakieTerraBlocks.BRONZE_ROOF_SLAB)));
    public static final Block ANCIENT_BRONZE_ROOF_TILES = registerBlock("ancient_bronze_roof_tiles",
            new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block WAXED_ANCIENT_BRONZE_ROOF_TILES = registerBlock("waxed_ancient_bronze_roof_tiles",
            new Block(FabricBlockSettings.copyOf(TakieTerraBlocks.BRONZE_ROOF_TILES)));
    public static final Block ANCIENT_BRONZE_ROOF_SLAB = registerBlock("ancient_bronze_roof_slab",
            new OxidizableSlabBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block WAXED_ANCIENT_BRONZE_ROOF_SLAB = registerBlock("waxed_ancient_bronze_roof_slab",
            new SlabBlock(FabricBlockSettings.copyOf(TakieTerraBlocks.BRONZE_ROOF_SLAB)));
    public static final Block COPPER_ROOF_TILES = registerBlock("copper_roof_tiles",
            new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).mapColor(MapColor.DARK_DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block COPPER_ROOF_SLAB = registerBlock("copper_roof_slab",
            new OxidizableSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.CUT_COPPER_SLAB).mapColor(MapColor.DARK_DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block WEATHERED_COPPER_ROOF_TILES = registerBlock("weathered_copper_roof_tiles",
            new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block WEATHERED_COPPER_ROOF_SLAB = registerBlock("weathered_copper_roof_slab",
            new OxidizableSlabBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.WEATHERED_CUT_COPPER_SLAB).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block OXIDIZED_COPPER_ROOF_TILES = registerBlock("oxidized_copper_roof_tiles",
            new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).mapColor(MapColor.TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block OXIDIZED_COPPER_ROOF_SLAB = registerBlock("oxidized_copper_roof_slab",
            new OxidizableSlabBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.OXIDIZED_CUT_COPPER_SLAB).mapColor(MapColor.TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.METAL)));

    public static final Block CINNABAR_ROOF_TILES = registerBlock("cinnabar_roof_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).mapColor(MapColor.RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CINNABAR_ROOF_SLAB = registerBlock("cinnabar_roof_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NEPHRITE_ROOF_TILES = registerBlock("nephrite_roof_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).mapColor(MapColor.EMERALD_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NEPHRITE_ROOF_SLAB = registerBlock("nephrite_roof_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.EMERALD_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TERRACOTTA_ROOF_TILES = registerBlock("terracotta_roof_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TERRACOTTA_ROOF_SLAB = registerBlock("terracotta_roof_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SLATE_ROOF_TILES = registerBlock("slate_roof_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SLATE_ROOF_SLAB = registerBlock("slate_roof_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.DEEPSLATE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GOLD_ROOF_TILES = registerBlock("gold_roof_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).mapColor(MapColor.GOLD).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GOLD_ROOF_SLAB = registerBlock("gold_roof_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB).mapColor(MapColor.GOLD).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BAMBOO_ROOF_TILES = registerBlock("bamboo_roof_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.BAMBOO_BLOCK).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.BAMBOO_WOOD)));
    public static final Block BAMBOO_ROOF_SLAB = registerBlock("bamboo_roof_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_SLAB).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.BAMBOO_WOOD)));
    public static final Block STRIPPED_BAMBOO_ROOF_TILES = registerBlock("stripped_bamboo_roof_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.BAMBOO_BLOCK).mapColor(MapColor.PALE_YELLOW).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.BAMBOO_WOOD)));
    public static final Block STRIPPED_BAMBOO_ROOF_SLAB = registerBlock("stripped_bamboo_roof_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_SLAB).mapColor(MapColor.PALE_YELLOW).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.BAMBOO_WOOD)));
    public static final Block DAWN_SAKURA_ROOF_TILES = registerBlock("dawn_sakura_roof_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.BAMBOO_BLOCK).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.BAMBOO_WOOD)));
    public static final Block DAWN_SAKURA_ROOF_SLAB = registerBlock("dawn_sakura_roof_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_SLAB).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.BAMBOO_WOOD)));

    //SHELLS

    public static final Block SHELL_COWRIE = registerBlock("shell_cowrie",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(1.0f, 6.0f).sounds(BlockSoundGroup.SAND)));
    public static final Block SHELL_SAND_DOLLAR = registerBlock("shell_sand_dollar",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(1.0f, 6.0f).sounds(BlockSoundGroup.SAND)));


    //MISC

    public static final Block PEAT_BLOCK = registerBlock("peat_block",
            new Block(FabricBlockSettings.copyOf(Blocks.MOSS_BLOCK).mapColor(MapColor.DIRT_BROWN)));

    public static final Block APPLE_CRATE = registerBlock("apple_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(1.0f)));
    public static final Block BEETROOT_CRATE = registerBlock("beetroot_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(1.0f)));
    public static final Block GOLDEN_APPLE_CRATE = registerBlock("golden_apple_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(1.0f)));
    public static final Block POTATO_CRATE = registerBlock("potato_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(1.0f)));
    public static final Block CARROT_CRATE = registerBlock("carrot_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(1.0f)));
    public static final Block GOLDEN_CARROT_CRATE = registerBlock("golden_carrot_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(1.0f)));
    public static final Block GLOW_BERRIES_BAG = registerBlock("glow_berries_bag",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).sounds(BlockSoundGroup.CROP).strength(0.5f)));
    public static final Block SWEET_BERRIES_BASKET = registerBlock("sweet_berries_basket",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).sounds(BlockSoundGroup.MANGROVE_ROOTS).strength(1.0f)));
    public static final Block STRAWBERRY_BASKET = registerBlock("strawberry_basket",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).sounds(BlockSoundGroup.MANGROVE_ROOTS).strength(1.0f)));
    public static final Block WHITE_STRAWBERRY_BASKET = registerBlock("white_strawberry_basket",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).sounds(BlockSoundGroup.MANGROVE_ROOTS).strength(1.0f)));
    public static final Block COCOA_BEANS_SAC = registerBlock("cocoa_beans_sac",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).sounds(BlockSoundGroup.CROP).strength(0.5f)));
    public static final Block RICE_BAG = registerBlock("rice_bag",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).sounds(BlockSoundGroup.CROP).strength(0.5f)));
    public static final Block COFFEE_BEANS_BAG = registerBlock("coffee_beans_bag",
            new Block(FabricBlockSettings.create().strength(1.0f).sounds(BlockSoundGroup.GRASS).mapColor(MapColor.DIRT_BROWN)));

    public static final Block SNOW_BRICKS = registerBlock("snow_bricks",
    new Block(FabricBlockSettings.copyOf(Blocks.SNOW_BLOCK).sounds(BlockSoundGroup.SNOW).strength(0.5f)));
    public static final Block SNOW_BRICK_SLAB = registerBlock("snow_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(0.5f, 6.0f).sounds(BlockSoundGroup.SNOW)));
    public static final Block SNOW_BRICK_WALL = registerBlock("snow_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(0.5f, 6.0f).sounds(BlockSoundGroup.SNOW)));
    public static final Block SNOW_BRICK_STAIRS = registerBlock("snow_brick_stairs",
            new StairsBlock(TakieTerraBlocks.SNOW_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(0.5f, 6.0f).sounds(BlockSoundGroup.SNOW)));
    public static final Block PACKED_SNOW_BRICKS = registerBlock("packed_snow_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.SNOW_BLOCK).sounds(BlockSoundGroup.SNOW).strength(1.0f)));
    public static final Block PACKED_SNOW_BRICK_SLAB = registerBlock("packed_snow_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(1.0f, 6.0f).sounds(BlockSoundGroup.SNOW)));
    public static final Block PACKED_SNOW_BRICK_WALL = registerBlock("packed_snow_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(1.0f, 6.0f).sounds(BlockSoundGroup.SNOW)));
    public static final Block PACKED_SNOW_BRICK_STAIRS = registerBlock("packed_snow_brick_stairs",
            new StairsBlock(TakieTerraBlocks.PACKED_SNOW_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(1.0f, 6.0f).sounds(BlockSoundGroup.SNOW)));
    public static final Block ICE_BRICKS = registerBlock("ice_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.ICE).sounds(BlockSoundGroup.GLASS).strength(0.5f).slipperiness(0.98f)));
    public static final Block ICE_BRICK_SLAB = registerBlock("ice_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(0.5f ).sounds(BlockSoundGroup.GLASS).slipperiness(0.98f)));
    public static final Block ICE_BRICK_WALL = registerBlock("ice_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(0.5f).sounds(BlockSoundGroup.GLASS).slipperiness(0.98f)));
    public static final Block ICE_BRICK_STAIRS = registerBlock("ice_brick_stairs",
            new StairsBlock(TakieTerraBlocks.ICE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(0.5f).sounds(BlockSoundGroup.GLASS).slipperiness(0.98f)));
    public static final Block RUSTED_METAL_PANEL = registerBlock("rusted_metal_panel",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.METAL).strength(2.0f).mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block RUSTED_METAL = registerBlock("rusted_metal",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.METAL).strength(2.0f).mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block METAL_PANELING = registerBlock("metal_paneling",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.METAL).strength(2.0f).mapColor(MapColor.IRON_GRAY)));
    public static final Block METAL_VENT = registerBlock("metal_vent",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block CORRUGATED_METAL = registerBlock("corrugated_metal",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block CORRUGATED_METAL_AWNING = registerBlock("corrugated_metal_awning",
            new FacingBlockHorizontal(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.METAL).strength(2.0f).mapColor(MapColor.TERRACOTTA_ORANGE).nonOpaque(), Block.createCuboidShape(0,6,0,16,16,16)));
    public static final Block METAL_VENT_RUSTY = registerBlock("metal_vent_rusty",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block ARBORIST_BLOCK = registerBlock("arborist_block",
            new ArboristBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).strength(1.0f)));
    public static final Block GARDENER_BLOCK = registerBlock("gardener_block",
            new GardenerBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).strength(1.0f)));
    public static final Block GEOLOGIST_BLOCK = registerBlock("geologist_block",
            new GeologistBlock(FabricBlockSettings.copy(Blocks.STONE).strength(2.0f).nonOpaque()));
    public static final Block BEACHCOMBER_BLOCK = registerBlock("beachcomber_block",
            new BeachcomberBlock(FabricBlockSettings.copy(Blocks.GLASS).strength(1.0f).nonOpaque()));
    public static final Block ALLOY_FORGE_BLOCK = registerBlock("alloy_forge_block",
            new AlloyForgeBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.DEEPSLATE).strength(4.5F, 8.0F).requiresTool().luminance((state) -> state.get(AlloyForgeBlock.LIT) ? 15 : 0)));
    public static final Block WOODWORKER_BLOCK = registerBlock("woodworker_block",
            new WoodworkerBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).strength(1.0f)));
    public static final Block HERBALIST_BLOCK = registerBlock("herbalist_block",
            new HerbalistBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).strength(1.0f)));
    public static final Block GROCER_BLOCK = registerBlock("grocer_block",
            new GrocerBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).strength(1.0f)));
    public static final Block BRICK_OVEN_BLOCK = registerBlock("brick_oven_block",
            new FacingBlockHorizontal(FabricBlockSettings.create().sounds(BlockSoundGroup.STONE).strength(3.0F, 8.0F).requiresTool().luminance(15), Block.createCuboidShape(0, 0, 0, 16, 16, 16)));
    public static final Block KETTLE_BLOCK = registerBlock("kettle_block",
            new KettleBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(1.5F, 8.0F).nonOpaque()));
    public static final Block FRYING_PAN_BLOCK = registerBlock("frying_pan_block",
            new FacingBlockHorizontal(FabricBlockSettings.create().sounds(BlockSoundGroup.METAL).strength(2.0F, 8.0F).nonOpaque(), Block.createCuboidShape(1, 0, 1, 15, 3, 15)));
    public static final Block WEAVER_BLOCK = registerBlock("weaver_block",
            new WeaverBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(2.0F, 8.0F).nonOpaque()));
    public static final Block STREET_VENDOR_BLOCK = registerBlock("street_vendor_block",
            new StreetVendorBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(3.0F, 8.0F).nonOpaque().luminance(5)));
    public static final Block ANTIQUE_DEALER_BLOCK = registerBlock("antique_dealer_block",
            new FacingBlockHorizontal(FabricBlockSettings.create().sounds(BlockSoundGroup.WOOD).strength(1.0F).nonOpaque(), Block.createCuboidShape(3, 0, 2, 13, 16, 14)));
    public static final Block CUTTING_BOARD = registerBlock("cutting_board",
            new FacingBlockHorizontal(FabricBlockSettings.copy(Blocks.OAK_WOOD).strength(0.5f).nonOpaque(), Block.createCuboidShape(1,0,5,16,1,15)));
    public static final Block MYCOLOGIST_BLOCK = registerBlock("mycologist_block",
            new MycologistBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).strength(1.0f).nonOpaque()));


    public static final Block FALLEN_LEAVES_AUTUMN = registerBlock("fallen_leaves_autumn",
            new FallenLeavesAutumnBlock(AbstractBlock.Settings.copy(Blocks.PINK_PETALS)));
    public static final Block AUTUMN_VINES = registerBlock("autumn_vines",
            new VineBlock(FabricBlockSettings.copyOf(Blocks.VINE).mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block SILVERLACE_VINE = registerBlock("silverlace_vine",
            new VineBlock(FabricBlockSettings.copyOf(Blocks.VINE).mapColor(MapColor.WHITE)));
    public static final Block MOONSEED_VINE = registerBlock("moonseed_vine",
            new VineBlock(FabricBlockSettings.copyOf(Blocks.VINE).mapColor(MapColor.EMERALD_GREEN)));
    public static final Block BITTERSWEET_VINE = registerBlock("bittersweet_vine",
            new VineBlock(FabricBlockSettings.copyOf(Blocks.VINE).mapColor(MapColor.TERRACOTTA_GREEN)));
    public static final Block THUNBERGIA_VINE = registerBlock("thunbergia_vine",
            new VineBlock(FabricBlockSettings.copyOf(Blocks.VINE).mapColor(MapColor.ORANGE)));
    public static final Block SPANISH_MOSS = registerBlock("spanish_moss",
            new VineBlock(FabricBlockSettings.copyOf(Blocks.VINE).mapColor(MapColor.LICHEN_GREEN)));
    public static final Block SCINTILLA_LICHEN = registerBlock("scintilla_lichen",
            new VineBlock(FabricBlockSettings.copyOf(Blocks.VINE).mapColor(MapColor.CYAN).luminance(10)));
    public static final Block HANGING_MOSS = registerBlock("hanging_moss",
            new VineBlock(FabricBlockSettings.copyOf(Blocks.VINE).mapColor(MapColor.TERRACOTTA_GREEN)));
    public static final Block MOSSY_LEAVES = registerBlock("mossy_leaves",
            new VineBlock(FabricBlockSettings.copyOf(Blocks.VINE).mapColor(MapColor.TERRACOTTA_GREEN)));
    public static final Block CREEPING_VINE = registerBlock("creeping_vine",
            new VineBlock(FabricBlockSettings.copyOf(Blocks.VINE).mapColor(MapColor.TERRACOTTA_GREEN)));

    public static final Block CLOVER_PATCH = registerBlock("clover_patch",
            new GroundPatchBlock(FabricBlockSettings.copyOf(Blocks.PINK_PETALS)));
    public static final Block MANGO_BLOCK = registerBlock("mango_block",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block MYRTA_CRATE = registerBlock("myrta_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block COD_CRATE = registerBlock("cod_crate",
            new FacingBlockHorizontal(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).nonOpaque(), Block.createCuboidShape(0, 0, 0, 16, 16, 16)));
    public static final Block SALMON_CRATE = registerBlock("salmon_crate",
            new FacingBlockHorizontal(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).nonOpaque(), Block.createCuboidShape(0, 0, 0, 16, 16, 16)));



    //PAINTED_GINKGO_BLOCKS
    public static final Block PAINTED_BEAM_BLACK = registerBlock("painted_beam_black",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block PAINTED_BEAM_BLUE = registerBlock("painted_beam_blue",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block PAINTED_BEAM_CYAN = registerBlock("painted_beam_cyan",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block PAINTED_BEAM_GREEN = registerBlock("painted_beam_green",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block PAINTED_BEAM_LIGHT_BLUE = registerBlock("painted_beam_light_blue",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block PAINTED_BEAM_LIME = registerBlock("painted_beam_lime",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block PAINTED_BEAM_MAGENTA = registerBlock("painted_beam_magenta",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block PAINTED_BEAM_ORANGE = registerBlock("painted_beam_orange",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block PAINTED_BEAM_PINK = registerBlock("painted_beam_pink",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block PAINTED_BEAM_PURPLE = registerBlock("painted_beam_purple",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block PAINTED_BEAM_RED = registerBlock("painted_beam_red",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block PAINTED_BEAM_WHITE = registerBlock("painted_beam_white",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block PAINTED_BEAM_YELLOW = registerBlock("painted_beam_yellow",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));

    public static final Block PAINTED_PLANKS_BLACK = registerBlock("painted_planks_black",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PAINTED_PLANKS_BLUE = registerBlock("painted_planks_blue",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PAINTED_PLANKS_CYAN = registerBlock("painted_planks_cyan",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PAINTED_PLANKS_GREEN = registerBlock("painted_planks_green",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PAINTED_PLANKS_LIGHT_BLUE = registerBlock("painted_planks_light_blue",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PAINTED_PLANKS_LIME = registerBlock("painted_planks_lime",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PAINTED_PLANKS_MAGENTA = registerBlock("painted_planks_magenta",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PAINTED_PLANKS_ORANGE = registerBlock("painted_planks_orange",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PAINTED_PLANKS_PINK = registerBlock("painted_planks_pink",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PAINTED_PLANKS_PURPLE = registerBlock("painted_planks_purple",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PAINTED_PLANKS_RED = registerBlock("painted_planks_red",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PAINTED_PLANKS_WHITE = registerBlock("painted_planks_white",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PAINTED_PLANKS_YELLOW = registerBlock("painted_planks_yellow",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block PAINTED_FENCE_RED = registerBlock("painted_fence_red",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_FENCE).mapColor(MapColor.RED)));



    //BADLANDS & DESERT PLANTS
    public static final Block ALOE_VERA = registerBlock("aloe_vera",
            new DeadBushBlock(FabricBlockSettings.copyOf(Blocks.DEAD_BUSH).sounds(BlockSoundGroup.WEEPING_VINES_LOW_PITCH)));
    public static final Block THORNY_BRAMBLE = registerBlock("thorny_bramble",
            new DeadBushBlock(FabricBlockSettings.copyOf(Blocks.DEAD_BUSH)));
    public static final Block DUNE_PRIMROSE = registerBlock("dune_primrose",
            new DeadBushBlock(FabricBlockSettings.copyOf(Blocks.WHITE_TULIP).sounds(BlockSoundGroup.GRASS)));
    public static final Block POTTED_DUNE_PRIMROSE = registerBlockWithoutBlockItem("potted_dune_primrose",
            new FlowerPotBlock(DUNE_PRIMROSE, FabricBlockSettings.copyOf(Blocks.POTTED_WHITE_TULIP)));
    public static final Block GAZANIA_WHITE = registerBlock("gazania_white",
            new DeadBushBlock(FabricBlockSettings.copyOf(Blocks.WHITE_TULIP).sounds(BlockSoundGroup.GRASS)));
    public static final Block POTTED_WHITE_GAZANIA = registerBlockWithoutBlockItem("potted_white_gazania",
            new FlowerPotBlock(GAZANIA_WHITE, FabricBlockSettings.copyOf(Blocks.POTTED_WHITE_TULIP)));
    public static final Block GAZANIA_YELLOW = registerBlock("gazania_yellow",
            new DeadBushBlock(FabricBlockSettings.copyOf(Blocks.DANDELION).sounds(BlockSoundGroup.GRASS)));
    public static final Block POTTED_YELLOW_GAZANIA = registerBlockWithoutBlockItem("potted_yellow_gazania",
            new FlowerPotBlock(GAZANIA_YELLOW, FabricBlockSettings.copyOf(Blocks.POTTED_DANDELION)));
    public static final Block GAZANIA_ORANGE = registerBlock("gazania_orange",
            new DeadBushBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_TULIP).sounds(BlockSoundGroup.GRASS)));
    public static final Block POTTED_ORANGE_GAZANIA = registerBlockWithoutBlockItem("potted_orange_gazania",
            new FlowerPotBlock(GAZANIA_ORANGE, FabricBlockSettings.copyOf(Blocks.POTTED_ORANGE_TULIP)));
    public static final Block VERBENA_WHITE = registerBlock("verbena_white",
            new DeadBushBlock(FabricBlockSettings.copyOf(Blocks.WHITE_TULIP).sounds(BlockSoundGroup.GRASS)));
    public static final Block POTTED_WHITE_VERBENA = registerBlockWithoutBlockItem("potted_white_verbena",
            new FlowerPotBlock(VERBENA_WHITE, FabricBlockSettings.copyOf(Blocks.POTTED_WHITE_TULIP)));
    public static final Block VERBENA_PINK = registerBlock("verbena_pink",
            new DeadBushBlock(FabricBlockSettings.copyOf(Blocks.PINK_TULIP).sounds(BlockSoundGroup.GRASS)));
    public static final Block POTTED_PINK_VERBENA = registerBlockWithoutBlockItem("potted_pink_verbena",
            new FlowerPotBlock(VERBENA_PINK, FabricBlockSettings.copyOf(Blocks.POTTED_PINK_TULIP)));
    public static final Block VERBENA_YELLOW = registerBlock("verbena_yellow",
            new DeadBushBlock(FabricBlockSettings.copyOf(Blocks.DANDELION).sounds(BlockSoundGroup.GRASS)));
    public static final Block POTTED_YELLOW_VERBENA = registerBlockWithoutBlockItem("potted_yellow_verbena",
            new FlowerPotBlock(VERBENA_YELLOW, FabricBlockSettings.copyOf(Blocks.POTTED_DANDELION)));
    public static final Block POTTED_ALOE_VERA = registerBlockWithoutBlockItem("potted_aloe_vera",
            new FlowerPotBlock(ALOE_VERA, FabricBlockSettings.copyOf(Blocks.POTTED_FERN)));
    public static final Block ANTELOPE_BRUSH = registerBlock("antelope_brush",
            new DeadBushBlock(FabricBlockSettings.copyOf(Blocks.DEAD_BUSH).sounds(BlockSoundGroup.MANGROVE_ROOTS)));
    public static final Block POTTED_ANTELOPE_BRUSH = registerBlockWithoutBlockItem("potted_antelope_brush",
            new FlowerPotBlock(ANTELOPE_BRUSH, FabricBlockSettings.copyOf(Blocks.POTTED_DEAD_BUSH)));
    public static final Block ANTELOPE_BRUSH_FLOWERING = registerBlock("antelope_brush_flowering",
            new DeadBushBlock(FabricBlockSettings.copyOf(Blocks.DEAD_BUSH).sounds(BlockSoundGroup.MANGROVE_ROOTS)));
    public static final Block POTTED_ANTELOPE_BRUSH_FLOWERING = registerBlockWithoutBlockItem("potted_antelope_brush_flowering",
            new FlowerPotBlock(ANTELOPE_BRUSH_FLOWERING, FabricBlockSettings.copyOf(Blocks.POTTED_DEAD_BUSH)));
    public static final Block ARROWLEAF_BALSAMROOT = registerBlock("arrowleaf_balsamroot",
            new DeadBushBlock(FabricBlockSettings.copyOf(Blocks.DANDELION)));
    public static final Block POTTED_ARROWLEAF_BALSAMROOT = registerBlockWithoutBlockItem("potted_arrowleaf_balsamroot",
            new FlowerPotBlock(ARROWLEAF_BALSAMROOT, FabricBlockSettings.copyOf(Blocks.POTTED_DANDELION)));
    public static final Block BARREL_CACTUS = registerBlock("barrel_cactus",
            new DeadBushBlock(FabricBlockSettings.copyOf(Blocks.DEAD_BUSH).sounds(BlockSoundGroup.WEEPING_VINES_LOW_PITCH)));
    public static final Block POTTED_BARREL_CACTUS = registerBlockWithoutBlockItem("potted_barrel_cactus",
            new FlowerPotBlock(BARREL_CACTUS, FabricBlockSettings.copyOf(Blocks.POTTED_CACTUS)));
    public static final Block BIG_SAGEBRUSH = registerBlock("big_sagebrush",
            new TallCactusBlock(FabricBlockSettings.copyOf(Blocks.LILAC).sounds(BlockSoundGroup.MANGROVE_ROOTS)));
    public static final Block SAGEBRUSH = registerBlock("sagebrush",
            new DeadBushBlock(FabricBlockSettings.copyOf(Blocks.DEAD_BUSH).sounds(BlockSoundGroup.MANGROVE_ROOTS)));
    public static final Block POTTED_SAGEBRUSH = registerBlockWithoutBlockItem("potted_sagebrush",
            new FlowerPotBlock(SAGEBRUSH, FabricBlockSettings.copyOf(Blocks.POTTED_DEAD_BUSH)));
    public static final Block BITTERROOT = registerBlock("bitterroot",
            new DeadBushBlock(FabricBlockSettings.copyOf(Blocks.PINK_TULIP)));
    public static final Block POTTED_BITTERROOT = registerBlockWithoutBlockItem("potted_bitterroot",
            new FlowerPotBlock(BITTERROOT, FabricBlockSettings.copyOf(Blocks.POTTED_PINK_TULIP)));
    public static final Block BLUE_AGAVE = registerBlock("blue_agave",
            new DeadBushBlock(FabricBlockSettings.copyOf(Blocks.DEAD_BUSH).sounds(BlockSoundGroup.WEEPING_VINES_LOW_PITCH)));
    public static final Block POTTED_BLUE_AGAVE = registerBlockWithoutBlockItem("potted_blue_agave",
            new FlowerPotBlock(BLUE_AGAVE, FabricBlockSettings.copyOf(Blocks.POTTED_FERN)));

    public static final Block BUNCHGRASS_TALL = registerBlock("bunchgrass_tall",
            new TallPlantBlock(FabricBlockSettings.copyOf(Blocks.LARGE_FERN)));
    public static final Block SEA_OATS = registerBlock("sea_oats",
            new TallCactusBlock(FabricBlockSettings.copyOf(Blocks.TALL_GRASS).sounds(BlockSoundGroup.GRASS).breakInstantly()));
    public static final Block BUNCHGRASS_LARGE = registerBlock("bunchgrass_large",
            new DeadBushBlock(FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block BUNCHGRASS_MEDIUM = registerBlock("bunchgrass_medium",
            new DeadBushBlock(FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block BUNCHGRASS_SMALL = registerBlock("bunchgrass_small",
            new DeadBushBlock(FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block WILD_RICE = registerBlock("wild_rice",
            new DeadBushBlock(FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block HUACHUMA = registerBlock("huachuma",
            new TallCactusBlock(FabricBlockSettings.copyOf(Blocks.LILAC).strength(0.5f).sounds(BlockSoundGroup.WEEPING_VINES_LOW_PITCH)));
    public static final Block TAMARISK = registerBlock("tamarisk",
            new TallCactusBlock(FabricBlockSettings.copyOf(Blocks.LILAC).strength(0.2f).sounds(BlockSoundGroup.GRASS)));
    public static final Block TAMARISK_FLOWERING = registerBlock("tamarisk_flowering",
            new TallCactusBlock(FabricBlockSettings.copyOf(Blocks.LILAC).strength(0.2f).sounds(BlockSoundGroup.GRASS)));
    public static final Block POTTED_HUACHUMA = registerBlockWithoutBlockItem("potted_huachuma",
            new FlowerPotBlock(HUACHUMA, FabricBlockSettings.copyOf(Blocks.POTTED_CACTUS)));
    public static final Block MARIPOSA_LILY = registerBlock("mariposa_lily",
            new DeadBushBlock(FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY)));
    public static final Block POTTED_MARIPOSA_LILY = registerBlockWithoutBlockItem("potted_mariposa_lily",
            new FlowerPotBlock(MARIPOSA_LILY, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY)));
    public static final Block PIPE_ORGAN_CACTUS = registerBlock("pipe_organ_cactus",
            new TallCactusBlock(FabricBlockSettings.copyOf(Blocks.LILAC).strength(0.5f).sounds(BlockSoundGroup.WEEPING_VINES_LOW_PITCH)));
    public static final Block POTTED_PIPE_ORGAN_CACTUS = registerBlockWithoutBlockItem("potted_pipe_organ_cactus",
            new FlowerPotBlock(PIPE_ORGAN_CACTUS, FabricBlockSettings.copyOf(Blocks.POTTED_CACTUS)));
    public static final Block PRICKLY_PEAR = registerBlock("prickly_pear",
            new DeadBushBlock(FabricBlockSettings.copyOf(Blocks.DEAD_BUSH).sounds(BlockSoundGroup.WEEPING_VINES_LOW_PITCH)));
    public static final Block POTTED_PRICKLY_PEAR = registerBlockWithoutBlockItem("potted_prickly_pear",
            new FlowerPotBlock(PRICKLY_PEAR, FabricBlockSettings.copyOf(Blocks.POTTED_CACTUS)));
    public static final Block RABBIT_BRUSH = registerBlock("rabbit_brush",
            new DeadBushBlock(FabricBlockSettings.copyOf(Blocks.DEAD_BUSH)));
    public static final Block POTTED_RABBIT_BRUSH = registerBlockWithoutBlockItem("potted_rabbit_brush",
            new FlowerPotBlock(RABBIT_BRUSH, FabricBlockSettings.copyOf(Blocks.POTTED_DEAD_BUSH)));
    public static final Block SOAPTREE_YUCCA = registerBlock("soaptree_yucca",
            new TallCactusBlock(FabricBlockSettings.copyOf(Blocks.LILAC).strength(1.0f).sounds(BlockSoundGroup.WEEPING_VINES_LOW_PITCH)));
    public static final Block POTTED_SOAPTREE_YUCCA = registerBlockWithoutBlockItem("potted_soaptree_yucca",
            new FlowerPotBlock(SOAPTREE_YUCCA, FabricBlockSettings.copyOf(Blocks.POTTED_DEAD_BUSH)));


    //FLOWERS
    public static final Block FLOWER_BASKET = registerBlock("flower_basket",
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.MANGROVE_ROOTS).strength(1.0f)));
    public static final Block COTTON_GRASS = registerBlock("cotton_grass",
            new FlowerBlock(StatusEffects.SLOW_FALLING, 4, FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block POTTED_COTTON_GRASS = registerBlockWithoutBlockItem("potted_cotton_grass",
            new FlowerPotBlock(COTTON_GRASS, FabricBlockSettings.copyOf(Blocks.POTTED_FERN)));
    public static final Block DRABA = registerBlock("draba",
            new FlowerBlock(StatusEffects.GLOWING, 4, FabricBlockSettings.copyOf(Blocks.DANDELION)));
    public static final Block POTTED_DRABA = registerBlockWithoutBlockItem("potted_draba",
            new FlowerPotBlock(DRABA, FabricBlockSettings.copyOf(Blocks.POTTED_DANDELION)));
    public static final Block GLACIER_BUTTERCUP = registerBlock("glacier_buttercup",
            new FlowerBlock(StatusEffects.ABSORPTION, 4, FabricBlockSettings.copyOf(Blocks.AZURE_BLUET)));
    public static final Block POTTED_GLACIER_BUTTERCUP = registerBlockWithoutBlockItem("potted_glacier_buttercup",
            new FlowerPotBlock(GLACIER_BUTTERCUP, FabricBlockSettings.copyOf(Blocks.POTTED_AZURE_BLUET)));
    public static final Block COBALT_LUPINE = registerBlock("cobalt_lupine",
            new FlowerBlock(StatusEffects.NIGHT_VISION, 4, FabricBlockSettings.copyOf(Blocks.CORNFLOWER)));
    public static final Block POTTED_COBALT_LUPINE = registerBlockWithoutBlockItem("potted_cobalt_lupine",
            new FlowerPotBlock(COBALT_LUPINE, FabricBlockSettings.copyOf(Blocks.POTTED_CORNFLOWER)));
    public static final Block PARRAYA = registerBlock("parraya",
            new FlowerBlock(StatusEffects.BLINDNESS, 4, FabricBlockSettings.copyOf(Blocks.ALLIUM)));
    public static final Block POTTED_PARRAYA = registerBlockWithoutBlockItem("potted_parraya",
            new FlowerPotBlock(PARRAYA, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM)));
    public static final Block SAXIFRAGE = registerBlock("saxifrage",
            new FlowerBlock(StatusEffects.HEALTH_BOOST, 4, FabricBlockSettings.copyOf(Blocks.PINK_TULIP)));
    public static final Block POTTED_SAXIFRAGE = registerBlockWithoutBlockItem("potted_saxifrage",
            new FlowerPotBlock(SAXIFRAGE, FabricBlockSettings.copyOf(Blocks.POTTED_PINK_TULIP)));
    public static final Block MOSS_CAMPION = registerBlock("moss_campion",
            new MossCampionBlock(AbstractBlock.Settings.copy(Blocks.PINK_PETALS)));
    public static final Block LUSH_MOSS_CARPET = registerBlock("lush_moss_carpet",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.GREEN_CARPET)));
    public static final Block LUSH_MOSS_BLOCK = registerBlock("lush_moss_block",
            new Block(FabricBlockSettings.copyOf(Blocks.MOSS_BLOCK)));
    public static final Block SHIVER_ROSE = registerBlock("shiver_rose",
            new FlowerBlock(StatusEffects.DARKNESS, 4, FabricBlockSettings.copyOf(Blocks.AZURE_BLUET)));
    public static final Block POTTED_SHIVER_ROSE = registerBlockWithoutBlockItem("potted_shiver_rose",
            new FlowerPotBlock(SHIVER_ROSE, FabricBlockSettings.copyOf(Blocks.POTTED_WHITE_TULIP)));
    public static final Block MARIGOLD = registerBlock("marigold",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 4, FabricBlockSettings.copyOf(Blocks.ORANGE_TULIP)));
    public static final Block POTTED_MARIGOLD = registerBlockWithoutBlockItem("potted_marigold",
            new FlowerPotBlock(MARIGOLD, FabricBlockSettings.copyOf(Blocks.POTTED_ORANGE_TULIP)));

    public static final Block BLUEBELLS = registerBlock("bluebells",
            new FlowerBlock(StatusEffects.DOLPHINS_GRACE, 4, FabricBlockSettings.copyOf(Blocks.BLUE_ORCHID).mapColor(MapColor.LAPIS_BLUE)));
    public static final Block ANEMONE_PURPLE = registerBlock("anemone_purple",
            new FlowerBlock(StatusEffects.BLINDNESS, 4, FabricBlockSettings.copyOf(Blocks.BLUE_ORCHID).mapColor(MapColor.PURPLE)));
    public static final Block POTTED_PURPLE_ANEMONE = registerBlockWithoutBlockItem("potted_purple_anemone",
            new FlowerPotBlock(ANEMONE_PURPLE, FabricBlockSettings.copyOf(Blocks.POTTED_BLUE_ORCHID).mapColor(MapColor.PURPLE)));
    public static final Block ANEMONE_WHITE = registerBlock("anemone_white",
            new FlowerBlock(StatusEffects.LUCK, 4, FabricBlockSettings.copyOf(Blocks.BLUE_ORCHID).mapColor(MapColor.WHITE)));
    public static final Block POTTED_WHITE_ANEMONE = registerBlockWithoutBlockItem("potted_white_anemone",
            new FlowerPotBlock(ANEMONE_WHITE, FabricBlockSettings.copyOf(Blocks.POTTED_BLUE_ORCHID).mapColor(MapColor.WHITE)));
    public static final Block ANEMONE_YELLOW = registerBlock("anemone_yellow",
            new FlowerBlock(StatusEffects.BLINDNESS, 4, FabricBlockSettings.copyOf(Blocks.BLUE_ORCHID).mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block POTTED_YELLOW_ANEMONE = registerBlockWithoutBlockItem("potted_yellow_anemone",
            new FlowerPotBlock(ANEMONE_YELLOW, FabricBlockSettings.copyOf(Blocks.POTTED_BLUE_ORCHID).mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block GARDENIA = registerBlock("gardenia",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.PEONY).mapColor(MapColor.PALE_YELLOW)));
    public static final Block PURPLE_WILDFLOWER = registerBlock("purple_wildflower",
            new DeadBushBlock(FabricBlockSettings.copyOf(Blocks.BLUE_ORCHID).mapColor(MapColor.PURPLE).sounds(BlockSoundGroup.GRASS)));
    public static final Block YELLOW_WILDFLOWER = registerBlock("yellow_wildflower",
            new DeadBushBlock(FabricBlockSettings.copyOf(Blocks.BLUE_ORCHID).mapColor(MapColor.TERRACOTTA_YELLOW).sounds(BlockSoundGroup.GRASS)));
    public static final Block VIOLET = registerBlock("violet",
            new FlowerBlock(StatusEffects.ABSORPTION, 4, FabricBlockSettings.copyOf(Blocks.BLUE_ORCHID).mapColor(MapColor.PURPLE)));
    public static final Block PINK_DAFFODIL = registerBlock("pink_daffodil",
            new FlowerBlock(StatusEffects.INSTANT_HEALTH, 4, FabricBlockSettings.copyOf(Blocks.PINK_TULIP).mapColor(MapColor.PINK)));
    public static final Block POTTED_PINK_DAFFODIL = registerBlockWithoutBlockItem("potted_pink_daffodil",
            new FlowerPotBlock(PINK_DAFFODIL, FabricBlockSettings.copyOf(Blocks.POTTED_BLUE_ORCHID).mapColor(MapColor.PINK)));
    public static final Block POTTED_BLUEBELLS = registerBlockWithoutBlockItem("potted_bluebells",
            new FlowerPotBlock(BLUEBELLS, FabricBlockSettings.copyOf(Blocks.POTTED_BLUE_ORCHID).mapColor(MapColor.LAPIS_BLUE)));
    public static final Block BROMELIAD = registerBlock("bromeliad",
            new FlowerBlock(StatusEffects.DOLPHINS_GRACE, 4, FabricBlockSettings.copyOf(Blocks.POPPY)));
    public static final Block PINK_HIBISCUS = registerBlock("pink_hibiscus",
            new FlowerBlock(StatusEffects.SLOWNESS, 4, FabricBlockSettings.copyOf(Blocks.PINK_TULIP)));
    public static final Block POTTED_PINK_HIBISCUS = registerBlockWithoutBlockItem("potted_pink_hibiscus",
            new FlowerPotBlock(PINK_HIBISCUS, FabricBlockSettings.copyOf(Blocks.POTTED_PINK_TULIP).mapColor(MapColor.PINK)));
    public static final Block LOTUS_FLOWER = registerBlockWithoutBlockItem("lotus_flower",
            new LotusFlowerBlock(FabricBlockSettings.copyOf(Blocks.LILY_PAD)));
    public static final Block LOTUS_STEM = registerBlock("lotus_stem", new LotusStem(FabricBlockSettings
            .create()
            .mapColor(MapColor.GREEN)
            .pistonBehavior(PistonBehavior.DESTROY)
            .noCollision()
            .nonOpaque()
            .breakInstantly()
            .sounds(BlockSoundGroup.LILY_PAD), LOTUS_FLOWER));

    public static final Block LAVENDER_FLOWER = registerBlock("lavender_flower",
            new FlowerBlock(StatusEffects.BLINDNESS, 4, FabricBlockSettings.copyOf(Blocks.ALLIUM)));
    public static final Block POTTED_LAVENDER_FLOWER = registerBlockWithoutBlockItem("potted_lavender_flower",
            new FlowerPotBlock(LAVENDER_FLOWER, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).mapColor(MapColor.PURPLE)));
    public static final Block HIBISCUS_LEAVES = registerBlock("hibiscus_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.FLOWERING_AZALEA_LEAVES)));
    public static final Block ROSE_OF_SHARON_LEAVES = registerBlock("rose_of_sharon_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.FLOWERING_AZALEA_LEAVES)));
    public static final Block GOLDENROD = registerBlock("goldenrod",
            new FlowerBlock(StatusEffects.LUCK, 4, FabricBlockSettings.copyOf(Blocks.POPPY)));
    public static final Block POTTED_GOLDENROD = registerBlockWithoutBlockItem("potted_goldenrod",
            new FlowerPotBlock(GOLDENROD, FabricBlockSettings.copyOf(Blocks.POTTED_DANDELION).mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block POTTED_BROMELIAD = registerBlockWithoutBlockItem("potted_bromeliad",
            new FlowerPotBlock(BROMELIAD, FabricBlockSettings.copyOf(Blocks.POTTED_POPPY)));
    public static final Block ICY_IRIS = registerBlock("icy_iris",
            new FlowerBlock(StatusEffects.SLOW_FALLING, 4, FabricBlockSettings.copyOf(Blocks.AZURE_BLUET).mapColor(MapColor.LIGHT_BLUE_GRAY)));
    public static final Block POTTED_ICY_IRIS = registerBlockWithoutBlockItem("potted_icy_iris",
            new FlowerPotBlock(ICY_IRIS, FabricBlockSettings.copyOf(Blocks.POTTED_AZURE_BLUET).mapColor(MapColor.LIGHT_BLUE_GRAY)));

    public static final Block FOXGLOVE_YELLOW = registerBlock("foxglove_yellow",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.LILAC).mapColor(MapColor.PALE_YELLOW)));
    public static final Block FOXGLOVE_PINK = registerBlock("foxglove_pink",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.LILAC).mapColor(MapColor.DULL_PINK)));
    public static final Block FOXGLOVE_WHITE = registerBlock("foxglove_white",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.LILAC).mapColor(MapColor.WHITE)));
    public static final Block DELPHINIUM_BLUE = registerBlock("delphinium_blue",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.LILAC).mapColor(MapColor.LAPIS_BLUE)));
    public static final Block DELPHINIUM_INDIGO = registerBlock("delphinium_indigo",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.LILAC).mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block DANDELION_SEED = registerBlock("dandelion_seed",
            new FlowerBlock(StatusEffects.GLOWING, 4, FabricBlockSettings.copyOf(Blocks.DANDELION)));
    public static final Block POTTED_DANDELION_SEED = registerBlockWithoutBlockItem("potted_dandelion_seed",
            new FlowerPotBlock(TakieTerraBlocks.DANDELION_SEED, FabricBlockSettings.copyOf(Blocks.POTTED_DANDELION)));
    public static final Block PANSY_ORANGE = registerBlock("pansy_orange",
            new FlowerBlock(StatusEffects.BLINDNESS, 4, FabricBlockSettings.copyOf(Blocks.ORANGE_TULIP)));
    public static final Block POTTED_ORANGE_PANSY = registerBlockWithoutBlockItem("potted_orange_pansy",
            new FlowerPotBlock(TakieTerraBlocks.PANSY_ORANGE, FabricBlockSettings.copyOf(Blocks.POTTED_ORANGE_TULIP)));
    public static final Block PANSY_PINK = registerBlock("pansy_pink",
            new FlowerBlock(StatusEffects.BLINDNESS, 4, FabricBlockSettings.copyOf(Blocks.PINK_TULIP)));
    public static final Block POTTED_PINK_PANSY = registerBlockWithoutBlockItem("potted_pink_pansy",
            new FlowerPotBlock(TakieTerraBlocks.PANSY_ORANGE, FabricBlockSettings.copyOf(Blocks.POTTED_PINK_TULIP)));
    public static final Block PANSY_PURPLE = registerBlock("pansy_purple",
            new FlowerBlock(StatusEffects.BLINDNESS, 4, FabricBlockSettings.copyOf(Blocks.ALLIUM)));
    public static final Block POTTED_PURPLE_PANSY = registerBlockWithoutBlockItem("potted_purple_pansy",
            new FlowerPotBlock(TakieTerraBlocks.PANSY_PURPLE, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM)));
    public static final Block PANSY_RED = registerBlock("pansy_red",
            new FlowerBlock(StatusEffects.BLINDNESS, 4, FabricBlockSettings.copyOf(Blocks.RED_TULIP)));
    public static final Block POTTED_RED_PANSY = registerBlockWithoutBlockItem("potted_red_pansy",
            new FlowerPotBlock(TakieTerraBlocks.PANSY_RED, FabricBlockSettings.copyOf(Blocks.POTTED_RED_TULIP)));
    public static final Block PANSY_WHITE = registerBlock("pansy_white",
            new FlowerBlock(StatusEffects.BLINDNESS, 4, FabricBlockSettings.copyOf(Blocks.WHITE_TULIP)));
    public static final Block POTTED_WHITE_PANSY = registerBlockWithoutBlockItem("potted_white_pansy",
            new FlowerPotBlock(TakieTerraBlocks.PANSY_WHITE, FabricBlockSettings.copyOf(Blocks.POTTED_WHITE_TULIP)));
    public static final Block HYACINTH_BLUE = registerBlock("hyacinth_blue",
            new FlowerBlock(StatusEffects.HUNGER, 4, FabricBlockSettings.copyOf(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_BLUE_HYACINTH = registerBlockWithoutBlockItem("potted_blue_hyacinth",
            new FlowerPotBlock(TakieTerraBlocks.HYACINTH_BLUE, FabricBlockSettings.copyOf(Blocks.POTTED_BLUE_ORCHID)));
    public static final Block HYACINTH_PINK = registerBlock("hyacinth_pink",
            new FlowerBlock(StatusEffects.HUNGER, 4, FabricBlockSettings.copyOf(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_PINK_HYACINTH = registerBlockWithoutBlockItem("potted_pink_hyacinth",
            new FlowerPotBlock(TakieTerraBlocks.HYACINTH_PINK, FabricBlockSettings.copyOf(Blocks.POTTED_BLUE_ORCHID)));
    public static final Block HYACINTH_PURPLE = registerBlock("hyacinth_purple",
            new FlowerBlock(StatusEffects.HUNGER, 4, FabricBlockSettings.copyOf(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_PURPLE_HYACINTH = registerBlockWithoutBlockItem("potted_purple_hyacinth",
            new FlowerPotBlock(TakieTerraBlocks.HYACINTH_PURPLE, FabricBlockSettings.copyOf(Blocks.POTTED_BLUE_ORCHID)));
    public static final Block HYACINTH_RED = registerBlock("hyacinth_red",
            new FlowerBlock(StatusEffects.HUNGER, 4, FabricBlockSettings.copyOf(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_RED_HYACINTH = registerBlockWithoutBlockItem("potted_red_hyacinth",
            new FlowerPotBlock(TakieTerraBlocks.HYACINTH_RED, FabricBlockSettings.copyOf(Blocks.POTTED_BLUE_ORCHID)));
    public static final Block HYACINTH_WHITE = registerBlock("hyacinth_white",
            new FlowerBlock(StatusEffects.HUNGER, 4, FabricBlockSettings.copyOf(Blocks.BLUE_ORCHID)));
    public static final Block POTTED_WHITE_HYACINTH = registerBlockWithoutBlockItem("potted_white_hyacinth",
            new FlowerPotBlock(TakieTerraBlocks.HYACINTH_WHITE, FabricBlockSettings.copyOf(Blocks.POTTED_BLUE_ORCHID)));
    public static final Block SUNFLOWER_ORNAMENTAL = registerBlock("sunflower_ornamental",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.SUNFLOWER)));
    public static final Block SUNFLOWER_ORNAMENTAL_TWO = registerBlock("sunflower_ornamental_two",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.SUNFLOWER)));
    public static final Block SUNFLOWER_ORNAMENTAL_THREE = registerBlock("sunflower_ornamental_three",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.SUNFLOWER)));
    public static final Block SUNFLOWER_ORNAMENTAL_FOUR = registerBlock("sunflower_ornamental_four",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.SUNFLOWER)));
    public static final Block SUNFLOWER_ORNAMENTAL_FIVE = registerBlock("sunflower_ornamental_five",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.SUNFLOWER)));
    public static final Block SUNFLOWER_ORNAMENTAL_SIX = registerBlock("sunflower_ornamental_six",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.SUNFLOWER)));
    public static final Block HOLLYHOCK_YELLOW = registerBlock("hollyhock_yellow",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.LILAC)));
    public static final Block HOLLYHOCK_PINK = registerBlock("hollyhock_pink",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.LILAC)));
    public static final Block HOLLYHOCK_BLACK = registerBlock("hollyhock_black",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.LILAC)));

    public static final Block COLEUS_PLANT = registerBlock("coleus_plant",
            new PlantBlock(FabricBlockSettings.copyOf(Blocks.FERN)));

    public static final Block BIOSHROOM_YELLOW = registerBlock("bioshroom_yellow",
            new PlantBlock(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM).mapColor(MapColor.YELLOW).luminance(10)));
    public static final Block BIOSHROOM_GREEN = registerBlock("bioshroom_green",
            new PlantBlock(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM).mapColor(MapColor.TERRACOTTA_LIME).luminance(10)));
    public static final Block BIOSHROOM_PINK = registerBlock("bioshroom_pink",
            new PlantBlock(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM).mapColor(MapColor.PINK).luminance(10)));
    public static final Block BIOSHROOM_BLUE = registerBlock("bioshroom_blue",
            new PlantBlock(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).luminance(10)));
    public static final Block MUSHROOM_BLACK_AMANITA = registerBlock("mushroom_black_amanita",
            new PlantBlock(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM).mapColor(MapColor.BLACK)));
    public static final Block MUSHROOM_BLUE_OYSTER = registerBlock("mushroom_blue_oyster",
            new PlantBlock(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM).mapColor(MapColor.TERRACOTTA_BLUE)));
    public static final Block MUSHROOM_CHANTERELLE = registerBlock("mushroom_chanterelle",
            new PlantBlock(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM).mapColor(MapColor.ORANGE)));
    public static final Block MUSHROOM_DEATH_TRUMPET = registerBlock("mushroom_death_trumpet",
            new PlantBlock(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM).mapColor(MapColor.DEEPSLATE_GRAY)));
    public static final Block MUSHROOM_GREEN_RUSSULA = registerBlock("mushroom_green_russula",
            new PlantBlock(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM).mapColor(MapColor.TERRACOTTA_CYAN)));
    public static final Block MUSHROOM_HONEY = registerBlock("mushroom_honey",
            new PlantBlock(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM).mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block MUSHROOM_INKY_CAP = registerBlock("mushroom_inky_cap",
            new PlantBlock(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM).mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block MUSHROOM_LILAC_RUSSULA = registerBlock("mushroom_lilac_russula",
            new PlantBlock(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM).mapColor(MapColor.PURPLE)));
    public static final Block MUSHROOM_MOREL = registerBlock("mushroom_morel",
            new PlantBlock(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM).mapColor(MapColor.DIRT_BROWN)));
    public static final Block MUSHROOM_ORANGE_CAP_BOLETE = registerBlock("mushroom_orange_cap_bolete",
            new PlantBlock(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM).mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block MUSHROOM_PINK_OYSTER = registerBlock("mushroom_pink_oyster",
            new PlantBlock(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM).mapColor(MapColor.PINK)));
    public static final Block MUSHROOM_PIXIE_CAP = registerBlock("mushroom_pixie_cap",
            new PlantBlock(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM).mapColor(MapColor.BLUE)));
    public static final Block MUSHROOM_RED_AMANITA = registerBlock("mushroom_red_amanita",
            new PlantBlock(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM).mapColor(MapColor.TERRACOTTA_RED)));
    public static final Block MUSHROOM_SHAGGY_MANE = registerBlock("mushroom_shaggy_mane",
            new PlantBlock(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM).mapColor(MapColor.OFF_WHITE)));
    public static final Block MUSHROOM_YELLOW_OYSTER = registerBlock("mushroom_yellow_oyster",
            new PlantBlock(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM).mapColor(MapColor.TERRACOTTA_YELLOW)));

    public static final Block POLYPHORE_AUTUMN_BEAUTY = registerBlock("polyphore_autumn_beauty",
            new PolyphoreBlock(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM).mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Block POLYPHORE_GROUSE_TAIL = registerBlock("polyphore_grouse_tail",
            new PolyphoreBlock(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM).mapColor(MapColor.LIGHT_BLUE_GRAY)));
    public static final Block POLYPHORE_SUN_BLOOM = registerBlock("polyphore_sun_bloom",
            new PolyphoreBlock(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM).mapColor(MapColor.YELLOW)));
    public static final Block POLYPHORE_CACAO = registerBlock("polyphore_cacao",
            new PolyphoreBlock(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM).mapColor(MapColor.BROWN)));
    public static final Block POLYPHORE_PHANTOM = registerBlock("polyphore_phantom",
            new PolyphoreBlock(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM).mapColor(MapColor.OFF_WHITE)));

    public static final Block MUSHROOM_BRILLIOME = registerBlock("mushroom_brilliome",
            new BrilliomeBlock(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM).mapColor(MapColor.LIGHT_BLUE_GRAY).luminance(10)));

    public static final Block PHOSPORE_SPROUT_BLUE = registerBlock("phospore_sprout_blue",
            new PhosporePlantBlock(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM).luminance(15), TakieTerraConfiguredFeatures.PHOSPORE_BLUE_KEY));
    public static final Block PHOSPORE_SPROUT_PINK = registerBlock("phospore_sprout_pink",
            new PhosporePlantBlock(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM).luminance(15), TakieTerraConfiguredFeatures.PHOSPORE_PINK_KEY));
    public static final Block PHOSPORE_SPROUT_YELLOW = registerBlock("phospore_sprout_yellow",
            new PhosporePlantBlock(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM).luminance(15), TakieTerraConfiguredFeatures.PHOSPORE_YELLOW_KEY));
    public static final Block PHOSPORE_SPROUT_GREEN = registerBlock("phospore_sprout_green",
            new PhosporePlantBlock(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM).luminance(15), TakieTerraConfiguredFeatures.PHOSPORE_GREEN_KEY));

    public static final Block PHOSPORE_BLOCK_BLUE = registerBlock("phospore_block_blue",
            new MushroomBlock(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM_BLOCK).mapColor(MapColor.LIGHT_BLUE).luminance(15)));
    public static final Block PHOSPORE_BLOCK_PINK = registerBlock("phospore_block_pink",
            new MushroomBlock(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM_BLOCK).mapColor(MapColor.PINK).luminance(15)));
    public static final Block PHOSPORE_BLOCK_YELLOW = registerBlock("phospore_block_yellow",
            new MushroomBlock(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM_BLOCK).mapColor(MapColor.YELLOW).luminance(15)));
    public static final Block PHOSPORE_BLOCK_GREEN = registerBlock("phospore_block_green",
            new MushroomBlock(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM_BLOCK).mapColor(MapColor.PALE_GREEN).luminance(15)));
    public static final Block PHOSPORE_STEM_BLUE = registerBlock("phospore_stem_blue",
            new MushroomBlock(FabricBlockSettings.copyOf(Blocks.MUSHROOM_STEM).mapColor(MapColor.OFF_WHITE).luminance(5)));
    public static final Block PHOSPORE_STEM_GREEN = registerBlock("phospore_stem_green",
            new MushroomBlock(FabricBlockSettings.copyOf(Blocks.MUSHROOM_STEM).mapColor(MapColor.OFF_WHITE).luminance(5)));
    public static final Block PHOSPORE_STEM_PINK = registerBlock("phospore_stem_pink",
            new MushroomBlock(FabricBlockSettings.copyOf(Blocks.MUSHROOM_STEM).mapColor(MapColor.OFF_WHITE).luminance(5)));
    public static final Block PHOSPORE_STEM_YELLOW = registerBlock("phospore_stem_yellow",
            new MushroomBlock(FabricBlockSettings.copyOf(Blocks.MUSHROOM_STEM).mapColor(MapColor.OFF_WHITE).luminance(5)));

    public static final Block PACKED_MUD_BRICKS = registerBlock("packed_mud_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));
    public static final Block COBBLESTONE_BRICKS = registerBlock("cobblestone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block MOSSY_COBBLESTONE_BRICKS = registerBlock("mossy_cobblestone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.MOSSY_COBBLESTONE)));
    public static final Block MOSS_BRICKS = registerBlock("moss_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.MOSS_BLOCK)));
    public static final Block DIRT_BRICKS = registerBlock("dirt_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block COARSE_DIRT_BRICKS = registerBlock("coarse_dirt_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.COARSE_DIRT)));
    public static final Block COTTON_SHEET = registerBlock("cotton_sheet",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.WHITE_CARPET)));
    public static final Block GINGHAM_BLANKET_BLUE = registerBlock("gingham_blanket_blue",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.BLUE_CARPET)));
    public static final Block GINGHAM_BLANKET_CYAN = registerBlock("gingham_blanket_cyan",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.CYAN_CARPET)));
    public static final Block GINGHAM_BLANKET_GREEN = registerBlock("gingham_blanket_green",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.GREEN_CARPET)));
    public static final Block GINGHAM_BLANKET_LIGHT_BLUE = registerBlock("gingham_blanket_light_blue",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_CARPET)));
    public static final Block GINGHAM_BLANKET_LIME = registerBlock("gingham_blanket_lime",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.LIME_CARPET)));
    public static final Block GINGHAM_BLANKET_MAGENTA = registerBlock("gingham_blanket_magenta",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_CARPET)));
    public static final Block GINGHAM_BLANKET_PINK = registerBlock("gingham_blanket_pink",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.PINK_CARPET)));
    public static final Block GINGHAM_BLANKET_PURPLE = registerBlock("gingham_blanket_purple",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.PINK_CARPET)));
    public static final Block GINGHAM_BLANKET_RED = registerBlock("gingham_blanket_red",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.RED_CARPET)));
    public static final Block GINGHAM_BLANKET_YELLOW = registerBlock("gingham_blanket_yellow",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_CARPET)));
    public static final Block GINGHAM_BLANKET_ORANGE = registerBlock("gingham_blanket_orange",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_CARPET)));

    public static final Block BURLAP = registerBlock("burlap",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.WHITE_CARPET)));
    public static final Block ROPE = registerBlock("rope",
            new ChainBlock(FabricBlockSettings.copyOf(Blocks.CHAIN).strength(0.2f).sounds(BlockSoundGroup.CHERRY_SAPLING)));
    public static final Block JUTE_BUNDLE = registerBlock("jute_bundle",
            new HayBlock(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block WOVEN_BASKET = registerBlock("woven_basket",
            new FacingBlockHorizontal(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).sounds(BlockSoundGroup.MANGROVE_ROOTS), Block.createCuboidShape(1,0,1,15,14,15)));
    public static final Block BREAD_BASKET_BAGUETTE = registerBlock("bread_basket_baguette",
            new FacingBlockHorizontal(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).nonOpaque().sounds(BlockSoundGroup.MANGROVE_ROOTS), Block.createCuboidShape(1,0,1,15,14,15)));
    public static final Block BREAD_BASKET_LOAF = registerBlock("bread_basket_loaf",
            new FacingBlockHorizontal(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).nonOpaque().sounds(BlockSoundGroup.MANGROVE_ROOTS), Block.createCuboidShape(1,0,1,15,14,15)));
    public static final Block BREAD_BASKET_ROLL = registerBlock("bread_basket_roll",
            new FacingBlockHorizontal(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).nonOpaque().sounds(BlockSoundGroup.MANGROVE_ROOTS), Block.createCuboidShape(1,0,1,15,14,15)));
    public static final Block DECORATIVE_BARREL = registerBlock("decorative_barrel",
            new DecorativeBarrelBlock(FabricBlockSettings.copyOf(Blocks.BARREL)));

    public static final Block RASPBERRY_JAM_JAR = registerBlock("raspberry_jam_jar",
            new JamJarBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block STRAWBERRY_JAM_JAR = registerBlock("strawberry_jam_jar",
            new JamJarBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block SWEET_BERRY_JAM_JAR = registerBlock("sweet_berry_jam_jar",
            new JamJarBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block APPLE_JAM_JAR = registerBlock("apple_jam_jar",
            new JamJarBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block GRAPE_JAM_JAR = registerBlock("grape_jam_jar",
            new JamJarBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block MARMALADE_JAR = registerBlock("marmalade_jar",
            new JamJarBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));

    public static final Block HYDRANGEA = registerBlock("hydrangea",
            new FlowerBlock(StatusEffects.SATURATION, 4, FabricBlockSettings.copyOf(Blocks.OXEYE_DAISY)));
    public static final Block POTTED_HYDRANGEA = registerBlockWithoutBlockItem("potted_hydrangea",
            new FlowerPotBlock(HYDRANGEA, FabricBlockSettings.copyOf(Blocks.POTTED_OXEYE_DAISY)));
    public static final Block HYDRANGEA_SHRUB = registerBlock("hydrangea_shrub",
            new AzaleaBlock(FabricBlockSettings.copyOf(Blocks.AZALEA)));
    public static final Block POTTED_HYDRANGEA_SHRUB = registerBlockWithoutBlockItem("potted_hydrangea_shrub",
            new FlowerPotBlock(HYDRANGEA_SHRUB, FabricBlockSettings.copyOf(Blocks.POTTED_AZALEA_BUSH)));
    public static final Block WILD_HERBS = registerBlock("wild_herbs",
            new FlowerBlock(StatusEffects.SATURATION, 4, FabricBlockSettings.copyOf(Blocks.OXEYE_DAISY)));
    public static final Block CHAMOMILE = registerBlock("chamomile",
            new FlowerBlock(StatusEffects.LUCK, 4, FabricBlockSettings.copyOf(Blocks.OXEYE_DAISY)));
    public static final Block POTTED_CHAMOMILE = registerBlockWithoutBlockItem("potted_chamomile",
            new FlowerPotBlock(CHAMOMILE, FabricBlockSettings.copyOf(Blocks.POTTED_OXEYE_DAISY)));

    public static final Block HERB_BALE = registerBlock("herb_bale",
            new HayBlock(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block HERB_BALE_BASIL = registerBlock("herb_bale_basil",
            new HayBlock(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block HERB_BALE_APPLEMINT = registerBlock("herb_bale_applemint",
            new HayBlock(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block HERB_BALE_LAVENDER = registerBlock("herb_bale_lavender",
            new HayBlock(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block HERB_BALE_ROSEMARY = registerBlock("herb_bale_rosemary",
            new HayBlock(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block HERB_BALE_TANSY = registerBlock("herb_bale_tansy",
            new HayBlock(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));
    public static final Block HERB_BALE_THYME = registerBlock("herb_bale_thyme",
            new HayBlock(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));

    public static final Block OAT_BLOCK = registerBlock("oat_block",
            new HayBlock(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK)));

    public static final Block TEACUP_APPLEMINT = registerBlock("teacup_applemint",
            new TeacupBlock(FabricBlockSettings.create().strength(1.0f).sounds(BlockSoundGroup.DECORATED_POT_SHATTER)));
    public static final Block TEACUP_BLACK = registerBlock("teacup_black",
            new TeacupBlock(FabricBlockSettings.create().strength(1.0f).sounds(BlockSoundGroup.DECORATED_POT_SHATTER)));
    public static final Block TEACUP_CHAMOMILE = registerBlock("teacup_chamomile",
            new TeacupBlock(FabricBlockSettings.create().strength(1.0f).sounds(BlockSoundGroup.DECORATED_POT_SHATTER)));
    public static final Block TEACUP_GREEN = registerBlock("teacup_green",
            new TeacupBlock(FabricBlockSettings.create().strength(1.0f).sounds(BlockSoundGroup.DECORATED_POT_SHATTER)));
    public static final Block TEACUP_HERBAL = registerBlock("teacup_herbal",
            new TeacupBlock(FabricBlockSettings.create().strength(1.0f).sounds(BlockSoundGroup.DECORATED_POT_SHATTER)));
    public static final Block TEACUP_HIBISCUS = registerBlock("teacup_hibiscus",
            new TeacupBlock(FabricBlockSettings.create().strength(1.0f).sounds(BlockSoundGroup.DECORATED_POT_SHATTER)));
    public static final Block TEACUP_JASMINE = registerBlock("teacup_jasmine",
            new TeacupBlock(FabricBlockSettings.create().strength(1.0f).sounds(BlockSoundGroup.DECORATED_POT_SHATTER)));
    public static final Block TEACUP_MILK = registerBlock("teacup_milk",
            new TeacupBlock(FabricBlockSettings.create().strength(1.0f).sounds(BlockSoundGroup.DECORATED_POT_SHATTER)));
    public static final Block TEACUP_SWEET_BERRY = registerBlock("teacup_sweet_berry",
            new TeacupBlock(FabricBlockSettings.create().strength(1.0f).sounds(BlockSoundGroup.DECORATED_POT_SHATTER)));
    public static final Block COFFEE_MUG = registerBlock("coffee_mug",
            new CoffeeMugBlock(FabricBlockSettings.create().strength(1.0f).sounds(BlockSoundGroup.DECORATED_POT_SHATTER)));
    public static final Block CUP_LATTE = registerBlockWithoutBlockItem("cup_latte",
            new DrinkCupBlock(FabricBlockSettings.create().strength(1.0f).sounds(BlockSoundGroup.CANDLE)));
    public static final Block CUP_CAPPUCCINO = registerBlockWithoutBlockItem("cup_cappuccino",
            new DrinkCupBlock(FabricBlockSettings.create().strength(1.0f).sounds(BlockSoundGroup.CANDLE)));
    public static final Block CUP_BROWN_SUGAR_MILK_TEA = registerBlockWithoutBlockItem("cup_brown_sugar_milk_tea",
            new DrinkCupBlock(FabricBlockSettings.create().strength(1.0f).sounds(BlockSoundGroup.CANDLE)));
    public static final Block CUP_CHOCOLATE_MILK_TEA = registerBlockWithoutBlockItem("cup_chocolate_milk_tea",
            new DrinkCupBlock(FabricBlockSettings.create().strength(1.0f).sounds(BlockSoundGroup.CANDLE)));
    public static final Block CUP_GRASS_JELLY_MILK_TEA = registerBlockWithoutBlockItem("cup_grass_jelly_milk_tea",
            new DrinkCupBlock(FabricBlockSettings.create().strength(1.0f).sounds(BlockSoundGroup.CANDLE)));
    public static final Block CUP_HONEY_ORANGE_BLOSSOM_MILK_TEA = registerBlockWithoutBlockItem("cup_honey_orange_blossom_milk_tea",
            new DrinkCupBlock(FabricBlockSettings.create().strength(1.0f).sounds(BlockSoundGroup.CANDLE)));
    public static final Block CUP_HONEYDEW_MELON_MILK_TEA = registerBlockWithoutBlockItem("cup_honeydew_melon_milk_tea",
            new DrinkCupBlock(FabricBlockSettings.create().strength(1.0f).sounds(BlockSoundGroup.CANDLE)));
    public static final Block CUP_MANGO_MILK_TEA = registerBlockWithoutBlockItem("cup_mango_milk_tea",
            new DrinkCupBlock(FabricBlockSettings.create().strength(1.0f).sounds(BlockSoundGroup.CANDLE)));
    public static final Block CUP_TARO_MILK_TEA = registerBlockWithoutBlockItem("cup_taro_milk_tea",
            new DrinkCupBlock(FabricBlockSettings.create().strength(1.0f).sounds(BlockSoundGroup.CANDLE)));
    public static final Block CUP_YUENYEUNG = registerBlockWithoutBlockItem("cup_yuenyeung",
            new DrinkCupBlock(FabricBlockSettings.create().strength(1.0f).sounds(BlockSoundGroup.CANDLE)));

    public static final Block PIE_PLUM = registerBlock("pie_plum",
            new PieBlock(FabricBlockSettings.copyOf(Blocks.CAKE)));
    public static final Block PIE_PEACH = registerBlock("pie_peach",
            new PieBlock(FabricBlockSettings.copyOf(Blocks.CAKE)));
    public static final Block PIE_RASPBERRY = registerBlock("pie_raspberry",
            new PieBlock(FabricBlockSettings.copyOf(Blocks.CAKE)));

    public static final Block PIZZA_HAM_AND_PINEAPPLE = registerBlockWithoutBlockItem("pizza_ham_and_pineapple",
            new PizzaBlock(FabricBlockSettings.copyOf(Blocks.CAKE)));
    public static final Block PIZZA_MARGHERITA = registerBlockWithoutBlockItem("pizza_margherita",
            new PizzaBlock(FabricBlockSettings.copyOf(Blocks.CAKE)));
    public static final Block PIZZA_PEPPERONI = registerBlockWithoutBlockItem("pizza_pepperoni",
            new PizzaBlock(FabricBlockSettings.copyOf(Blocks.CAKE)));
    public static final Block PIZZA_VEGGIE = registerBlockWithoutBlockItem("pizza_veggie",
            new PizzaBlock(FabricBlockSettings.copyOf(Blocks.CAKE)));


            //CROPS
    public static final CropBlock TOMATO_CROP = (CropBlock) registerBlockWithoutBlockItem("tomato_crop",
            new TomatoCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final CropBlock STRAWBERRY_CROP = (CropBlock) registerBlockWithoutBlockItem("strawberry_crop",
            new StrawberryCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final CropBlock LETTUCE_CROP = (CropBlock) registerBlockWithoutBlockItem("lettuce_crop",
            new LettuceCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final CropBlock SPINACH_CROP = (CropBlock) registerBlockWithoutBlockItem("spinach_crop",
            new SpinachCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final CropBlock CUCUMBER_CROP = (CropBlock) registerBlockWithoutBlockItem("cucumber_crop",
            new CucumberCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final CropBlock CORN_CROP = (CropBlock) registerBlockWithoutBlockItem("corn_crop",
            new CornCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final CropBlock TEA_CROP = (CropBlock) registerBlockWithoutBlockItem("tea_crop",
            new TeaCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final CropBlock OAT_CROP = (CropBlock) registerBlockWithoutBlockItem("oat_crop",
            new OatCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final CropBlock RICE_CROP = (CropBlock) registerBlockWithoutBlockItem("rice_crop",
            new RiceCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final CropBlock GREEN_BEAN_CROP = (CropBlock) registerBlockWithoutBlockItem("green_bean_crop",
            new GreenBeanCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    public static final Block SQUASH = registerBlock("squash",
            new WinterSquashBlock(FabricBlockSettings.copyOf(Blocks.PUMPKIN)));
    public static final Block SQUASH_STEM = registerBlockWithoutBlockItem("squash_stem",
            new SquashStem((GourdBlock) TakieTerraBlocks.SQUASH, (Supplier<Item>) TakieTerraItems.SQUASH_SEEDS, FabricBlockSettings.copyOf(Blocks.PUMPKIN_STEM)));
    public static final Block ATTACHED_SQUASH_STEM = registerBlockWithoutBlockItem("attached_squash_stem",
            new AttachedSquashStem((GourdBlock) TakieTerraBlocks.SQUASH, (Supplier<Item>) TakieTerraItems.SQUASH_SEEDS, FabricBlockSettings.copyOf(Blocks.ATTACHED_PUMPKIN_STEM)));
    public static final Block HONEYDEW = registerBlock("honeydew",
            new HoneydewMelonBlock(FabricBlockSettings.copyOf(Blocks.MELON)));
    public static final Block HONEYDEW_STEM = registerBlockWithoutBlockItem("honeydew_stem",
            new HoneydewStem((GourdBlock) TakieTerraBlocks.HONEYDEW, (Supplier<Item>) TakieTerraItems.HONEYDEW_SEEDS, FabricBlockSettings.copyOf(Blocks.MELON_STEM)));
    public static final Block ATTACHED_HONEYDEW_STEM = registerBlockWithoutBlockItem("attached_honeydew_stem",
            new AttachedHoneydewStem((GourdBlock) TakieTerraBlocks.HONEYDEW, (Supplier<Item>) TakieTerraItems.HONEYDEW_SEEDS, FabricBlockSettings.copyOf(Blocks.ATTACHED_MELON_STEM)));
    public static final Block CANTALOUPE = registerBlock("cantaloupe",
            new CantaloupeMelonBlock(FabricBlockSettings.copyOf(Blocks.MELON)));
    public static final Block CANTALOUPE_STEM = registerBlockWithoutBlockItem("cantaloupe_stem",
            new CantaloupeStem((GourdBlock) TakieTerraBlocks.CANTALOUPE, (Supplier<Item>) TakieTerraItems.CANTALOUPE_SEEDS, FabricBlockSettings.copyOf(Blocks.MELON_STEM)));
    public static final Block ATTACHED_CANTALOUPE_STEM = registerBlockWithoutBlockItem("attached_cantaloupe_stem",
            new AttachedCantaloupeStem((GourdBlock) TakieTerraBlocks.CANTALOUPE, (Supplier<Item>) TakieTerraItems.CANTALOUPE_SEEDS, FabricBlockSettings.copyOf(Blocks.ATTACHED_MELON_STEM)));

    public static final Block TEA_LEAVES_BUNDLE = registerBlock("tea_leaves_bundle",
            new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.create().mapColor(MapColor.GREEN).requiresTool().strength(1.0f, 6.0f).sounds(BlockSoundGroup.WET_GRASS)));
    public static final Block TEA_LEAVES_BUNDLE_DRIED = registerBlock("tea_leaves_bundle_dried",
            new OxidizableBlock(Oxidizable.OxidationLevel.WEATHERED, AbstractBlock.Settings.create().mapColor(MapColor.DIRT_BROWN).requiresTool().strength(1.0f, 6.0f).sounds(BlockSoundGroup.GRASS)));
    public static final Block TEA_LEAVES_BUNDLE_OXIDIZED = registerBlock("tea_leaves_bundle_oxidized",
            new OxidizableBlock(Oxidizable.OxidationLevel.OXIDIZED, AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_BROWN).requiresTool().strength(1.0f, 6.0f).sounds(BlockSoundGroup.GRASS)));
    public static final Block JASMINE_BRANCH_BLOCK = registerBlock("jasmine_branch_block",
            new FlowerBlock(StatusEffects.LUCK, 4, FabricBlockSettings.copyOf(Blocks.OXEYE_DAISY)));
    public static final CropBlock JASMINE_CROP = (CropBlock) registerBlockWithoutBlockItem("jasmine_crop",
            new JasmineCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block POTTED_JASMINE_BRANCH = registerBlockWithoutBlockItem("potted_jasmine_branch",
            new FlowerPotBlock(JASMINE_BRANCH_BLOCK, FabricBlockSettings.copyOf(Blocks.POTTED_WHITE_TULIP)));
    public static final CropBlock SPRING_ONION_CROP = (CropBlock) registerBlockWithoutBlockItem("spring_onion_crop",
            new SpringOnionCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final CropBlock BROCCOLI_CROP = (CropBlock) registerBlockWithoutBlockItem("broccoli_crop",
            new BroccoliCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final CropBlock CAULIFLOWER_CROP = (CropBlock) registerBlockWithoutBlockItem("cauliflower_crop",
            new CauliflowerCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final CropBlock COTTON_CROP = (CropBlock) registerBlockWithoutBlockItem("cotton_crop",
            new CottonCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final CropBlock CHILI_CROP = (CropBlock) registerBlockWithoutBlockItem("chili_crop",
            new ChiliCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final CropBlock JUTE_CROP = (CropBlock) registerBlockWithoutBlockItem("jute_crop",
            new JuteCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final CropBlock RASPBERRY_BUSH = (CropBlock) registerBlockWithoutBlockItem("raspberry_bush",
            new RaspberryBushBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block WILD_RASPBERRY_BUSH = registerBlockWithoutBlockItem("wild_raspberry_bush",
            new WildBerryBushBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH)));
    public static final Block WILD_STRAWBERRY_BUSH_RED = registerBlockWithoutBlockItem("wild_strawberry_bush_red",
            new StrawberryBushBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH)));
    public static final Block WILD_STRAWBERRY_BUSH_WHITE = registerBlockWithoutBlockItem("wild_strawberry_bush_white",
            new WhiteStrawberryBushBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH)));


    public static final CropBlock BASIL = (CropBlock) registerBlock("basil",
            new HerbCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    public static final CropBlock LAVENDER = (CropBlock) registerBlock("lavender",
            new HerbCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    public static final CropBlock APPLEMINT = (CropBlock) registerBlock("applemint",
            new HerbCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    public static final CropBlock ROSEMARY = (CropBlock) registerBlock("rosemary",
            new HerbCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    public static final CropBlock TANSY = (CropBlock) registerBlock("tansy",
            new HerbCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    public static final CropBlock THYME = (CropBlock) registerBlock("thyme",
            new HerbCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));


    public static final Block BIRCH_PLANTER_LILAC = registerBlock("birch_planter_lilac",
            new TallPlanterBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.CHERRY_WOOD).strength(0.5f).nonOpaque()));
    public static final Block BIRCH_PLANTER_PEONY = registerBlock("birch_planter_peony",
            new TallPlanterBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.CHERRY_WOOD).strength(0.5f).nonOpaque()));
    public static final Block BIRCH_PLANTER_ROSE = registerBlock("birch_planter_rose",
            new TallPlanterBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.CHERRY_WOOD).strength(0.5f).nonOpaque()));
    public static final Block CHERRY_BRANCH_VASE = registerBlock("cherry_branch_vase",
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.GRASS).strength(0.4f).nonOpaque()));
    public static final Block MONSTERA_POT = registerBlock("monstera_pot",
            new FacingBlockHorizontal(FabricBlockSettings.create().sounds(BlockSoundGroup.MANGROVE_ROOTS).strength(0.5f).nonOpaque(), Block.createCuboidShape(4, 0, 8, 12, 32, 14)));
    public static final Block MONSTERA_VINE = registerBlock("monstera_vine",
            new MonsteraVineBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.WET_GRASS).strength(0.1f).nonOpaque().noCollision()));
    public static final Block FLOWER_POT_TRIO = registerBlock("flower_pot_trio",
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.GRASS).strength(0.1f).nonOpaque()));

    public static final Block MONSTERA = registerBlock("monstera",
            new TTPlantBlock(FabricBlockSettings.create().mapColor(MapColor.GREEN).noCollision().breakInstantly().sounds(BlockSoundGroup.CHERRY_SAPLING), List.of(), Block.createCuboidShape(3, 0, 3, 13, 15, 13)));
    public static final Block SNAKE_PLANT = registerBlock("snake_plant",
            new TTPlantBlock(FabricBlockSettings.create().mapColor(MapColor.GREEN).noCollision().breakInstantly().sounds(BlockSoundGroup.CHERRY_SAPLING), List.of(Blocks.SAND, Blocks.RED_SAND), Block.createCuboidShape(2, 0, 2, 14, 16, 14)));
    public static final Block PARLOUR_PALM = registerBlock("parlour_palm",
            new TTPlantBlock(FabricBlockSettings.create().mapColor(MapColor.GREEN).noCollision().breakInstantly().sounds(BlockSoundGroup.CHERRY_SAPLING), List.of(Blocks.DIRT, Blocks.SAND), Block.createCuboidShape(2, 0, 2, 14, 22, 14)));
    public static final Block MONEY_TREE = registerBlock("money_tree",
            new TTPlantBlock(FabricBlockSettings.create().mapColor(MapColor.GREEN).noCollision().breakInstantly().sounds(BlockSoundGroup.CHERRY_SAPLING), List.of(Blocks.MUD), Block.createCuboidShape(3, 0, 3, 13, 10, 13)));
    public static final Block TALL_DRAGON_TREE = registerBlock("tall_dragon_tree",
            new TTTallPlantBlock(FabricBlockSettings.create().mapColor(MapColor.GREEN).strength(0.2f).sounds(BlockSoundGroup.GRASS), List.of(Blocks.SAND, Blocks.DIRT), Block.createCuboidShape(2, 0, 3, 13, 16, 13)));
    public static final Block DRAGON_TREE = registerBlock("dragon_tree",
            new TTGrowablePlantBlock(FabricBlockSettings.create().mapColor(MapColor.GREEN).strength(0.2f).sounds(BlockSoundGroup.GRASS), List.of(Blocks.SAND, Blocks.DIRT), Block.createCuboidShape(2, 0, 3, 13, 16, 13), (TTTallPlantBlock) TALL_DRAGON_TREE));

    public static final Block BANANA_TREE = registerBlock("banana_tree",
            new TTPlantBlock(FabricBlockSettings.create().mapColor(MapColor.GREEN).strength(0.2f).nonOpaque().sounds(BlockSoundGroup.WET_GRASS), List.of(Blocks.DIRT, Blocks.SAND), Block.createCuboidShape(0, 0, 0, 16, 30, 16)));
    public static final Block ARECA_PALM = registerBlock("areca_palm",
            new TTPlantBlock(FabricBlockSettings.create().mapColor(MapColor.GREEN).strength(0.2f).nonOpaque().sounds(BlockSoundGroup.MANGROVE_ROOTS), List.of(Blocks.DIRT, Blocks.SAND), Block.createCuboidShape(7, 0, 7, 10, 22, 10)));
    public static final Block FAN_PALM = registerBlock("fan_palm",
            new TTPlantBlock(FabricBlockSettings.create().mapColor(MapColor.GREEN).strength(0.1f).nonOpaque().noCollision().sounds(BlockSoundGroup.WET_GRASS), List.of(Blocks.DIRT, Blocks.SAND), Block.createCuboidShape(2, 0, 2, 16, 32, 16)));
    public static final Block FERN_TAIGA = registerBlock("fern_taiga",
            new TTPlantBlock(FabricBlockSettings.create().mapColor(MapColor.GREEN).breakInstantly().nonOpaque().noCollision().sounds(BlockSoundGroup.WET_GRASS), List.of(Blocks.DIRT, Blocks.MOSS_BLOCK), Block.createCuboidShape(2, 0, 2, 16, 16, 16)));
    public static final Block FERN_TAIGA_POTTED = registerBlock("fern_taiga_potted",
            new Block(FabricBlockSettings.copyOf(Blocks.FLOWER_POT).sounds(BlockSoundGroup.WET_GRASS).strength(0.1f).nonOpaque()));
    public static final Block FERN_JUNGLE = registerBlock("fern_jungle",
            new TTPlantBlock(FabricBlockSettings.create().mapColor(MapColor.GREEN).breakInstantly().nonOpaque().noCollision().sounds(BlockSoundGroup.WET_GRASS), List.of(Blocks.DIRT, Blocks.MOSS_BLOCK), Block.createCuboidShape(2, 0, 2, 16, 24, 16)));
    public static final Block FERN_JUNGLE_POTTED = registerBlock("fern_jungle_potted",
            new TallPlanterBlock(FabricBlockSettings.copyOf(Blocks.FLOWER_POT).sounds(BlockSoundGroup.WET_GRASS).strength(0.1f).nonOpaque()));
    public static final Block FERN_DAINTY = registerBlock("fern_dainty",
            new TTPlantBlock(FabricBlockSettings.create().mapColor(MapColor.GREEN).breakInstantly().nonOpaque().noCollision().sounds(BlockSoundGroup.WET_GRASS), List.of(Blocks.DIRT, Blocks.MOSS_BLOCK), Block.createCuboidShape(2, 0, 2, 16, 16, 16)));
    public static final Block FERN_DAINTY_POTTED = registerBlock("fern_dainty_potted",
            new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.WET_GRASS).strength(0.1f).nonOpaque()));
    public static final Block TARO_PLANT = registerBlock("taro_plant",
            new TTPlantBlock(FabricBlockSettings.create().mapColor(MapColor.GREEN).breakInstantly().nonOpaque().noCollision().sounds(BlockSoundGroup.WET_GRASS), List.of(Blocks.DIRT, Blocks.MOSS_BLOCK), Block.createCuboidShape(2, 0, 2, 13, 18, 13)));

    public static final Block POTTED_MONSTERA = registerBlock("potted_monstera",
            new TurnableFlowerPotBlock(MONSTERA, FabricBlockSettings.copy(Blocks.POTTED_CORNFLOWER)));
    public static final Block POTTED_SNAKE_PLANT = registerBlock("potted_snake_plant",
            new TurnableFlowerPotBlock(SNAKE_PLANT, FabricBlockSettings.copy(Blocks.POTTED_CORNFLOWER)));
    public static final Block POTTED_PARLOUR_PALM = registerBlock("potted_parlour_palm",
            new TurnableFlowerPotBlock(PARLOUR_PALM, FabricBlockSettings.copy(Blocks.POTTED_CORNFLOWER)));
    public static final Block POTTED_MONEY_TREE = registerBlock("potted_money_tree",
            new TurnableFlowerPotBlock(MONEY_TREE, FabricBlockSettings.copy(Blocks.POTTED_CORNFLOWER)));
    public static final Block POTTED_DRAGON_TREE = registerBlock("potted_dragon_tree",
            new TurnableFlowerPotBlock(DRAGON_TREE, FabricBlockSettings.copy(Blocks.POTTED_CORNFLOWER)));

    //VINES
    public static final Block PURPLE_WISTERIA_VINES = registerBlock("purple_wisteria_vines",
            new WisteriaVine(FabricBlockSettings.copyOf(Blocks.LILAC)));
    public static final Block PURPLE_WISTERIA_VINES_PLANT = registerBlock("purple_wisteria_vines_plant",
            new WisteriaVinePlant(FabricBlockSettings.copyOf(Blocks.LILAC), TakieTerraBlocks.PURPLE_WISTERIA_VINES));
    public static final Block WHITE_WISTERIA_VINES = registerBlock("white_wisteria_vines",
            new WisteriaVine(FabricBlockSettings.copyOf(Blocks.LILAC)));
    public static final Block WHITE_WISTERIA_VINES_PLANT = registerBlock("white_wisteria_vines_plant",
            new WisteriaVinePlant(FabricBlockSettings.copyOf(Blocks.LILAC), TakieTerraBlocks.WHITE_WISTERIA_VINES));
    public static final Block BLUE_WISTERIA_VINES = registerBlock("blue_wisteria_vines",
            new WisteriaVine(FabricBlockSettings.copyOf(Blocks.LILAC)));
    public static final Block BLUE_WISTERIA_VINES_PLANT = registerBlock("blue_wisteria_vines_plant",
            new WisteriaVinePlant(FabricBlockSettings.copyOf(Blocks.LILAC), TakieTerraBlocks.BLUE_WISTERIA_VINES));
    public static final Block PINK_WISTERIA_VINES = registerBlock("pink_wisteria_vines",
            new WisteriaVine(FabricBlockSettings.copyOf(Blocks.LILAC)));
    public static final Block PINK_WISTERIA_VINES_PLANT = registerBlock("pink_wisteria_vines_plant",
            new WisteriaVinePlant(FabricBlockSettings.copyOf(Blocks.LILAC), TakieTerraBlocks.PINK_WISTERIA_VINES));

    public static final Block PURPLE_WISTERIA_FLOWERS = registerBlock("purple_wisteria_flowers",
            new FlowerbedBlock(FabricBlockSettings.copyOf(Blocks.PINK_PETALS)));
    public static final Block PINK_WISTERIA_FLOWERS = registerBlock("pink_wisteria_flowers",
            new FlowerbedBlock(FabricBlockSettings.copyOf(Blocks.PINK_PETALS)));
    public static final Block BLUE_WISTERIA_FLOWERS = registerBlock("blue_wisteria_flowers",
            new FlowerbedBlock(FabricBlockSettings.copyOf(Blocks.PINK_PETALS)));
    public static final Block WHITE_WISTERIA_FLOWERS = registerBlock("white_wisteria_flowers",
            new FlowerbedBlock(FabricBlockSettings.copyOf(Blocks.PINK_PETALS)));

    public static final Block GRAPE_VINES = registerBlock("grape_vines",
            new GrapeVinesHeadBlock(FabricBlockSettings.copyOf(Blocks.CAVE_VINES).luminance(0)));
    public static final Block GRAPE_VINES_PLANT = registerBlock("grape_vines_plant",
            new GrapeVinesBodyBlock(FabricBlockSettings.copyOf(Blocks.CAVE_VINES_PLANT).luminance(0)));

    public static final Block PURPLE_WISTERIA_LEAVES = registerBlock("purple_wisteria_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LEAVES)));
    public static final Block PINK_WISTERIA_LEAVES = registerBlock("pink_wisteria_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LEAVES)));
    public static final Block BLUE_WISTERIA_LEAVES = registerBlock("blue_wisteria_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LEAVES)));
    public static final Block WHITE_WISTERIA_LEAVES = registerBlock("white_wisteria_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LEAVES)));



    public static Block createBlockWithItem(String name, Block block){
        createBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TakieTerraMod.MOD_ID, name), block);
    }
    public static Block createBlockWithoutItem(String name, Block block){
        return Registry.register(Registries.BLOCK, new Identifier(TakieTerraMod.MOD_ID, name), block);
    }

    public static Block registerBlockWithoutItem(String name, Block block){
        return Registry.register(Registries.BLOCK, new Identifier(TakieTerraMod.MOD_ID, name), block);
    }

    public static BlockItem createBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(TakieTerraMod.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }
    public static BlockItem createBlockItem(String name, Block block, Item.Settings item){
        return Registry.register(Registries.ITEM, new Identifier(TakieTerraMod.MOD_ID, name), new BlockItem(block, item));
    }

    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(TakieTerraMod.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TakieTerraMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(TakieTerraMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerTakieTerraBlocks() {
        TakieTerraMod.LOGGER.info("Registering ModBlocks for" + TakieTerraMod.MOD_ID);
    }
}

