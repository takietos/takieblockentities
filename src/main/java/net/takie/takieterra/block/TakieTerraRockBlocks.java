package net.takie.takieterra.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.takie.takieterra.TakieTerraMod;


public class TakieTerraRockBlocks {

    public static final Block WAVE_DOLOMITE_BRICKS = registerBlock("wave_dolomite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block KAOLIN_WHITE = registerBlock("kaolin_white",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block KAOLIN = registerBlock("kaolin",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block KAOLIN_BLACK = registerBlock("kaolin_black",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block KAOLIN_BLUE = registerBlock("kaolin_blue",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block KAOLIN_BROWN = registerBlock("kaolin_brown",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block KAOLIN_CYAN = registerBlock("kaolin_cyan",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_CYAN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block KAOLIN_GRAY = registerBlock("kaolin_gray",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block KAOLIN_GREEN = registerBlock("kaolin_green",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block KAOLIN_LIGHT_BLUE = registerBlock("kaolin_light_blue",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block KAOLIN_LIGHT_GRAY = registerBlock("kaolin_light_gray",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block KAOLIN_LIME = registerBlock("kaolin_lime",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_LIME).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block KAOLIN_MAGENTA = registerBlock("kaolin_magenta",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_MAGENTA).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block KAOLIN_ORANGE = registerBlock("kaolin_orange",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block KAOLIN_PINK = registerBlock("kaolin_pink",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block KAOLIN_PURPLE = registerBlock("kaolin_purple",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block KAOLIN_RED = registerBlock("kaolin_red",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block KAOLIN_YELLOW = registerBlock("kaolin_yellow",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_YELLOW).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    //TERRACOTTA BRICKS
    public static final Block TERRACOTTA_BRICKS_WHITE = registerBlock("terracotta_bricks_white",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TERRACOTTA_BRICKS = registerBlock("terracotta_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TERRACOTTA_BRICKS_BLACK = registerBlock("terracotta_bricks_black",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TERRACOTTA_BRICKS_BLUE = registerBlock("terracotta_bricks_blue",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TERRACOTTA_BRICKS_BROWN = registerBlock("terracotta_bricks_brown",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TERRACOTTA_BRICKS_CYAN = registerBlock("terracotta_bricks_cyan",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_CYAN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TERRACOTTA_BRICKS_GRAY = registerBlock("terracotta_bricks_gray",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TERRACOTTA_BRICKS_GREEN = registerBlock("terracotta_bricks_green",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TERRACOTTA_BRICKS_LIGHT_BLUE = registerBlock("terracotta_bricks_light_blue",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TERRACOTTA_BRICKS_LIGHT_GRAY = registerBlock("terracotta_bricks_light_gray",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TERRACOTTA_BRICKS_LIME = registerBlock("terracotta_bricks_lime",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_LIME).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TERRACOTTA_BRICKS_MAGENTA = registerBlock("terracotta_bricks_magenta",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_MAGENTA).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TERRACOTTA_BRICKS_ORANGE = registerBlock("terracotta_bricks_orange",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TERRACOTTA_BRICKS_PINK = registerBlock("terracotta_bricks_pink",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TERRACOTTA_BRICKS_PURPLE = registerBlock("terracotta_bricks_purple",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TERRACOTTA_BRICKS_RED = registerBlock("terracotta_bricks_red",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TERRACOTTA_BRICKS_YELLOW = registerBlock("terracotta_bricks_yellow",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_YELLOW).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    //CONCRETE BRICKS
    public static final Block CONCRETE_BRICKS_WHITE = registerBlock("concrete_bricks_white",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CONCRETE_BRICKS_BLACK = registerBlock("concrete_bricks_black",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CONCRETE_BRICKS_BLUE = registerBlock("concrete_bricks_blue",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CONCRETE_BRICKS_BROWN = registerBlock("concrete_bricks_brown",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CONCRETE_BRICKS_CYAN = registerBlock("concrete_bricks_cyan",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_CYAN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CONCRETE_BRICKS_GRAY = registerBlock("concrete_bricks_gray",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CONCRETE_BRICKS_GREEN = registerBlock("concrete_bricks_green",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CONCRETE_BRICKS_LIGHT_BLUE = registerBlock("concrete_bricks_light_blue",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CONCRETE_BRICKS_LIGHT_GRAY = registerBlock("concrete_bricks_light_gray",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CONCRETE_BRICKS_LIME = registerBlock("concrete_bricks_lime",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_LIME).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CONCRETE_BRICKS_MAGENTA = registerBlock("concrete_bricks_magenta",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_MAGENTA).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CONCRETE_BRICKS_ORANGE = registerBlock("concrete_bricks_orange",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CONCRETE_BRICKS_PINK = registerBlock("concrete_bricks_pink",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CONCRETE_BRICKS_PURPLE = registerBlock("concrete_bricks_purple",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CONCRETE_BRICKS_RED = registerBlock("concrete_bricks_red",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CONCRETE_BRICKS_YELLOW = registerBlock("concrete_bricks_yellow",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_YELLOW).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block SANDY_SOIL = registerBlock("sandy_soil",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).strength(1.5f, 6.0f).sounds(BlockSoundGroup.SAND)));
    public static final Block ROCKY_SANDY_SOIL = registerBlock("rocky_sandy_soil",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).strength(1.5f, 6.0f).sounds(BlockSoundGroup.GRAVEL)));
    public static final Block DIRT_SANDY = registerBlock("dirt_sandy",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).strength(1.5f, 6.0f).sounds(BlockSoundGroup.SAND)));

    public static final Block ROCKY_SAND = registerBlock("rocky_sand",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT).mapColor(MapColor.PALE_YELLOW).instrument(Instrument.BIT).strength(1.5f, 6.0f).sounds(BlockSoundGroup.SAND)));
    public static final Block ROCKY_RED_SAND = registerBlock("rocky_red_sand",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).strength(1.5f, 6.0f).sounds(BlockSoundGroup.SAND)));

    public static final Block COARSE_DIRT_SANDY = registerBlock("coarse_dirt_sandy",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).strength(1.5f, 6.0f).sounds(BlockSoundGroup.SAND)));
    public static final Block BROWN_MUD = registerBlock("brown_mud",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD).mapColor(MapColor.SPRUCE_BROWN).instrument(Instrument.BIT).requiresTool().strength(1.5f, 6.0f).sounds(BlockSoundGroup.MUD)));
    public static final Block BROWN_MUD_BRICKS = registerBlock("brown_mud_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS).mapColor(MapColor.SPRUCE_BROWN).instrument(Instrument.BIT).requiresTool().strength(1.5f, 6.0f).sounds(BlockSoundGroup.MUD_BRICKS)));
    public static final Block BROWN_MUD_BRICK_SLAB = registerBlock("brown_mud_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MUD_BRICK_SLAB).mapColor(MapColor.SPRUCE_BROWN).instrument(Instrument.BIT).requiresTool().strength(1.5f, 6.0f).sounds(BlockSoundGroup.MUD_BRICKS)));
    public static final Block BROWN_MUD_BRICK_STAIRS = registerBlock("brown_mud_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.BROWN_MUD.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.MUD_BRICK_STAIRS).mapColor(MapColor.SPRUCE_BROWN).instrument(Instrument.BIT).requiresTool().strength(1.5f, 6.0f).sounds(BlockSoundGroup.MUD_BRICKS)));


    public static final Block PETRIFIED_FIRE_BLOCK = registerBlock("petrified_fire_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PETRIFIED_FIRE_ORE = registerBlock("petrified_fire_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_PETRIFIED_FIRE_ORE = registerBlock("deepslate_petrified_fire_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).mapColor(MapColor.RED).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block PETRIFIED_ICE_BLOCK = registerBlock("petrified_ice_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PETRIFIED_ICE_ORE = registerBlock("petrified_ice_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_PETRIFIED_ICE_ORE = registerBlock("deepslate_petrified_ice_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block AEGIRINE = registerBlock("aegirine",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AEGIRINE_COBBLED = registerBlock("aegirine_cobbled",
            new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AEGIRINE_SLAB = registerBlock("aegirine_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AEGIRINE_STAIRS = registerBlock("aegirine_stairs",
            new StairsBlock(TakieTerraRockBlocks.AEGIRINE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AEGIRINE_WALL = registerBlock("aegirine_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AEGIRINE_COBBLED_SLAB = registerBlock("aegirine_cobbled_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AEGIRINE_BRICK_WALL = registerBlock("aegirine_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AEGIRINE_COBBLED_WALL = registerBlock("aegirine_cobbled_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AEGIRINE_BRICKS = registerBlock("aegirine_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AEGIRINE_BRICK_SLAB = registerBlock("aegirine_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AEGIRINE_BRICK_STAIRS = registerBlock("aegirine_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.AEGIRINE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AEGIRINE_COBBLED_STAIRS = registerBlock("aegirine_cobbled_stairs",
            new StairsBlock(TakieTerraRockBlocks.AEGIRINE_COBBLED.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block ALMANDINE_BLOCK = registerBlock("almandine_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DARK_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ALMANDINE_ORE = registerBlock("almandine_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DARK_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_ALMANDINE_ORE = registerBlock("deepslate_almandine_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DARK_RED).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block ALMANDINE_TILES = registerBlock("almandine_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DARK_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ALMANDINE_TILE_SLAB = registerBlock("almandine_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DARK_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ALMANDINE_WALL = registerBlock("almandine_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DARK_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ALMANDINE_STAIRS = registerBlock("almandine_stairs",
            new StairsBlock(TakieTerraRockBlocks.ALMANDINE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DARK_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ALMANDINE_SLAB = registerBlock("almandine_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DARK_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ALMANDINE_BRICK_WALL = registerBlock("almandine_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DARK_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ALMANDINE_BRICKS = registerBlock("almandine_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.DARK_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ALMANDINE_BRICK_SLAB = registerBlock("almandine_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DARK_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ALMANDINE_BRICK_STAIRS = registerBlock("almandine_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.ALMANDINE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DARK_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block AMAZONITE_BLOCK = registerBlock("amazonite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AMAZONITE_ORE = registerBlock("amazonite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_AMAZONITE_ORE = registerBlock("deepslate_amazonite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block AMAZONITE_STAIRS = registerBlock("amazonite_stairs",
            new StairsBlock(TakieTerraRockBlocks.AMAZONITE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AMAZONITE_WALL = registerBlock("amazonite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AMAZONITE_TILES = registerBlock("amazonite_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AMAZONITE_SLAB = registerBlock("amazonite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AMAZONITE_TILE_SLAB = registerBlock("amazonite_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AMAZONITE_BRICK_WALL = registerBlock("amazonite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AMAZONITE_BRICKS = registerBlock("amazonite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AMAZONITE_BRICK_SLAB = registerBlock("amazonite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AMAZONITE_BRICK_STAIRS = registerBlock("amazonite_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.AMAZONITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block AMPHIBOLITE = registerBlock("amphibolite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AMPHIBOLITE_WALL = registerBlock("amphibolite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AMPHIBOLITE_STAIRS = registerBlock("amphibolite_stairs",
            new StairsBlock(TakieTerraRockBlocks.AMPHIBOLITE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AMPHIBOLITE_SLAB = registerBlock("amphibolite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AMPHIBOLITE_BRICK_WALL = registerBlock("amphibolite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AMPHIBOLITE_BRICKS = registerBlock("amphibolite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AMPHIBOLITE_BRICK_SLAB = registerBlock("amphibolite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AMPHIBOLITE_BRICK_STAIRS = registerBlock("amphibolite_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.AMPHIBOLITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block ARGILLITE = registerBlock("argillite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ARGILLITE_STAIRS = registerBlock("argillite_stairs",
            new StairsBlock(TakieTerraRockBlocks.ARGILLITE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ARGILLITE_WALL = registerBlock("argillite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ARGILLITE_COBBLED = registerBlock("argillite_cobbled",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ARGILLITE_COBBLED_SLAB = registerBlock("argillite_cobbled_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ARGILLITE_COBBLED_WALL = registerBlock("argillite_cobbled_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ARGILLITE_COBBLED_STAIRS = registerBlock("argillite_cobbled_stairs",
            new StairsBlock(TakieTerraRockBlocks.ARGILLITE_COBBLED.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ARGILLITE_SLAB = registerBlock("argillite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ARGILLITE_BRICK_WALL = registerBlock("argillite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ARGILLITE_BRICKS = registerBlock("argillite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ARGILLITE_BRICK_SLAB = registerBlock("argillite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ARGILLITE_BRICK_STAIRS = registerBlock("argillite_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.ARGILLITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block ARKOSE = registerBlock("arkose",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ARKOSE_WALL = registerBlock("arkose_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ARKOSE_STAIRS = registerBlock("arkose_stairs",
            new StairsBlock(TakieTerraRockBlocks.ARKOSE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ARKOSE_SLAB = registerBlock("arkose_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ARKOSE_COBBLED = registerBlock("arkose_cobbled",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ARKOSE_COBBLED_WALL = registerBlock("arkose_cobbled_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ARKOSE_COBBLED_SLAB = registerBlock("arkose_cobbled_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ARKOSE_COBBLED_STAIRS = registerBlock("arkose_cobbled_stairs",
            new StairsBlock(TakieTerraRockBlocks.ARKOSE_COBBLED.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ARKOSE_BRICKS = registerBlock("arkose_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ARKOSE_BRICK_WALL = registerBlock("arkose_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ARKOSE_BRICK_SLAB = registerBlock("arkose_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ARKOSE_BRICK_STAIRS = registerBlock("arkose_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.ARKOSE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block AZURITE_BLOCK = registerBlock("azurite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LAPIS_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AZURITE_ORE = registerBlock("azurite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LAPIS_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_AZURITE_ORE = registerBlock("deepslate_azurite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LAPIS_BLUE).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block AZURITE_SLAB = registerBlock("azurite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LAPIS_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AZURITE_WALL = registerBlock("azurite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.LAPIS_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AZURITE_STAIRS = registerBlock("azurite_stairs",
            new StairsBlock(TakieTerraRockBlocks.AZURITE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LAPIS_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AZURITE_BRICKS = registerBlock("azurite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.LAPIS_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AZURITE_BRICK_SLAB = registerBlock("azurite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LAPIS_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AZURITE_BRICK_WALL = registerBlock("azurite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.LAPIS_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block AZURITE_BRICK_STAIRS = registerBlock("azurite_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.AZURITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LAPIS_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block BERYL_GREEN = registerBlock("beryl_green",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LICHEN_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BERYL_GREEN_SLAB = registerBlock("beryl_green_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LICHEN_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BERYL_GREEN_WALL = registerBlock("beryl_green_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.LICHEN_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BERYL_GREEN_STAIRS = registerBlock("beryl_green_stairs",
            new StairsBlock(TakieTerraRockBlocks.BERYL_GREEN.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LICHEN_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BERYL_GREEN_BRICK_SLAB = registerBlock("beryl_green_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LICHEN_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BERYL_GREEN_BRICKS = registerBlock("beryl_green_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.LICHEN_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BERYL_GREEN_BRICK_WALL = registerBlock("beryl_green_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.LICHEN_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BERYL_GREEN_BRICK_STAIRS = registerBlock("beryl_green_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.BERYL_GREEN_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LICHEN_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BERYL_PINK = registerBlock("beryl_pink",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BERYL_PINK_SLAB = registerBlock("beryl_pink_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BERYL_PINK_WALL = registerBlock("beryl_pink_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BERYL_PINK_STAIRS = registerBlock("beryl_pink_stairs",
            new StairsBlock(TakieTerraRockBlocks.BERYL_PINK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BERYL_PINK_BRICK_SLAB = registerBlock("beryl_pink_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BERYL_PINK_BRICKS = registerBlock("beryl_pink_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BERYL_PINK_BRICK_WALL = registerBlock("beryl_pink_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BERYL_PINK_BRICK_STAIRS = registerBlock("beryl_pink_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.BERYL_PINK_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BERYL_TURQUOISE = registerBlock("beryl_turquoise",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.BRIGHT_TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BERYL_TURQUOISE_SLAB = registerBlock("beryl_turquoise_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.BRIGHT_TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BERYL_TURQUOISE_WALL = registerBlock("beryl_turquoise_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.BRIGHT_TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BERYL_TURQUOISE_STAIRS = registerBlock("beryl_turquoise_stairs",
            new StairsBlock(TakieTerraRockBlocks.BERYL_TURQUOISE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.BRIGHT_TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BERYL_TURQUOISE_BRICK_SLAB = registerBlock("beryl_turquoise_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.BRIGHT_TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BERYL_TURQUOISE_BRICKS = registerBlock("beryl_turquoise_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.BRIGHT_TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BERYL_TURQUOISE_BRICK_WALL = registerBlock("beryl_turquoise_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.BRIGHT_TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BERYL_TURQUOISE_BRICK_STAIRS = registerBlock("beryl_turquoise_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.BERYL_TURQUOISE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.BRIGHT_TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block BLUE_SPOT_JASPER_BLOCK = registerBlock("blue_spot_jasper_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LAPIS_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BLUE_SPOT_JASPER_WALL = registerBlock("blue_spot_jasper_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.LAPIS_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BLUE_SPOT_JASPER_STAIRS = registerBlock("blue_spot_jasper_stairs",
            new StairsBlock(TakieTerraRockBlocks.BLUE_SPOT_JASPER_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LAPIS_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BLUE_SPOT_JASPER_ORE = registerBlock("blue_spot_jasper_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LAPIS_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_BLUE_SPOT_JASPER_ORE = registerBlock("deepslate_blue_spot_jasper_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LAPIS_BLUE).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block BLUE_SPOT_JASPER_SLAB = registerBlock("blue_spot_jasper_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LAPIS_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BLUE_SPOT_JASPER_BRICK_SLAB = registerBlock("blue_spot_jasper_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LAPIS_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BLUE_SPOT_JASPER_BRICKS = registerBlock("blue_spot_jasper_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.LAPIS_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BLUE_SPOT_JASPER_BRICK_WALL = registerBlock("blue_spot_jasper_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.LAPIS_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BLUE_SPOT_JASPER_BRICK_STAIRS = registerBlock("blue_spot_jasper_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.BLUE_SPOT_JASPER_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LAPIS_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block BLUESCHIST = registerBlock("blueschist",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BLUESCHIST_WALL = registerBlock("blueschist_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BLUESCHIST_SLAB = registerBlock("blueschist_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BLUESCHIST_STAIRS = registerBlock("blueschist_stairs",
            new StairsBlock(TakieTerraRockBlocks.BLUESCHIST.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BLUESCHIST_COBBLED = registerBlock("blueschist_cobbled",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BLUESCHIST_COBBLED_WALL = registerBlock("blueschist_cobbled_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BLUESCHIST_COBBLED_SLAB = registerBlock("blueschist_cobbled_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BLUESCHIST_COBBLED_STAIRS = registerBlock("blueschist_cobbled_stairs",
            new StairsBlock(TakieTerraRockBlocks.BLUESCHIST_COBBLED.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BLUESCHIST_BRICKS = registerBlock("blueschist_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BLUESCHIST_BRICK_WALL = registerBlock("blueschist_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BLUESCHIST_BRICK_SLAB = registerBlock("blueschist_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BLUESCHIST_BRICK_STAIRS = registerBlock("blueschist_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.BLUESCHIST_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block BORNITE_BLOCK = registerBlock("bornite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.PALE_PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BORNITE_ORE = registerBlock("bornite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.PALE_PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_BORNITE_ORE = registerBlock("deepslate_bornite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.PALE_PURPLE).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block BORNITE_SLAB = registerBlock("bornite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.PALE_PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BORNITE_STAIRS = registerBlock("bornite_stairs",
            new StairsBlock(TakieTerraRockBlocks.BORNITE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.PALE_PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BORNITE_WALL = registerBlock("bornite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.PALE_PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BORNITE_BRICK_WALL = registerBlock("bornite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.PALE_PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BORNITE_BRICKS = registerBlock("bornite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.PALE_PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BORNITE_BRICK_SLAB = registerBlock("bornite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.PALE_PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BORNITE_BRICK_STAIRS = registerBlock("bornite_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.BORNITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.PALE_PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block CARNELIAN_BLOCK = registerBlock("carnelian_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CARNELIAN_ORE = registerBlock("carnelian_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_CARNELIAN_ORE = registerBlock("deepslate_carnelian_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block CARNELIAN_SLAB = registerBlock("carnelian_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CARNELIAN_STAIRS = registerBlock("carnelian_stairs",
            new StairsBlock(TakieTerraRockBlocks.CARNELIAN_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CARNELIAN_WALL = registerBlock("carnelian_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CARNELIAN_BRICK_WALL = registerBlock("carnelian_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CARNELIAN_BRICKS = registerBlock("carnelian_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CARNELIAN_BRICK_SLAB = registerBlock("carnelian_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CARNELIAN_BRICK_STAIRS = registerBlock("carnelian_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.CARNELIAN_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block CHALCOPYRITE_BLOCK = registerBlock("chalcopyrite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.GOLD).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CHALCOPYRITE_TILES = registerBlock("chalcopyrite_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.GOLD).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CHALCOPYRITE_TILE_SLAB = registerBlock("chalcopyrite_tile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.GOLD).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CHALCOPYRITE_ORE = registerBlock("chalcopyrite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.GOLD).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_CHALCOPYRITE_ORE = registerBlock("deepslate_chalcopyrite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.GOLD).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block CHALCOPYRITE_SLAB = registerBlock("chalcopyrite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.GOLD).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CHALCOPYRITE_STAIRS = registerBlock("chalcopyrite_stairs",
            new StairsBlock(TakieTerraRockBlocks.CHALCOPYRITE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.GOLD).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CHALCOPYRITE_WALL = registerBlock("chalcopyrite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.GOLD).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CHALCOPYRITE_BRICK_WALL = registerBlock("chalcopyrite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.GOLD).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CHALCOPYRITE_BRICKS = registerBlock("chalcopyrite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.GOLD).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CHALCOPYRITE_BRICK_SLAB = registerBlock("chalcopyrite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.GOLD).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CHALCOPYRITE_BRICK_STAIRS = registerBlock("chalcopyrite_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.CHALCOPYRITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.GOLD).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block CHIASTOLITE_CROSS = registerBlock("chiastolite_cross",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CHIASTOLITE_TIGER = registerBlock("chiastolite_tiger",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.GOLD).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block CHRYSOCOLLA_BLOCK = registerBlock("chrysocolla_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.WATER_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CHRYSOCOLLA_ORE = registerBlock("chrysocolla_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.WATER_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_CHRYSOCOLLA_ORE = registerBlock("deepslate_chrysocolla_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.WATER_BLUE).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block CHRYSOCOLLA_SLAB = registerBlock("chrysocolla_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.WATER_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CHRYSOCOLLA_STAIRS = registerBlock("chrysocolla_stairs",
            new StairsBlock(TakieTerraRockBlocks.CHRYSOCOLLA_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.WATER_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CHRYSOCOLLA_WALL = registerBlock("chrysocolla_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.WATER_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CHRYSOCOLLA_BRICK_WALL = registerBlock("chrysocolla_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.WATER_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CHRYSOCOLLA_BRICKS = registerBlock("chrysocolla_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.WATER_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CHRYSOCOLLA_BRICK_SLAB = registerBlock("chrysocolla_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.WATER_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CHRYSOCOLLA_BRICK_STAIRS = registerBlock("chrysocolla_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.CHRYSOCOLLA_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.WATER_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block CITRON_CHRYSOPRASE_BLOCK = registerBlock("citron_chrysoprase_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.PALE_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CITRON_CHRYSOPRASE_ORE = registerBlock("citron_chrysoprase_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.PALE_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_CITRON_CHRYSOPRASE_ORE = registerBlock("deepslate_citron_chrysoprase_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.PALE_GREEN).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block CITRON_CHRYSOPRASE_SLAB = registerBlock("citron_chrysoprase_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.PALE_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CITRON_CHRYSOPRASE_STAIRS = registerBlock("citron_chrysoprase_stairs",
            new StairsBlock(TakieTerraRockBlocks.CITRON_CHRYSOPRASE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.PALE_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CITRON_CHRYSOPRASE_WALL = registerBlock("citron_chrysoprase_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.PALE_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CITRON_CHRYSOPRASE_BRICK_WALL = registerBlock("citron_chrysoprase_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.PALE_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CITRON_CHRYSOPRASE_BRICKS = registerBlock("citron_chrysoprase_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.PALE_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CITRON_CHRYSOPRASE_BRICK_SLAB = registerBlock("citron_chrysoprase_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.PALE_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CITRON_CHRYSOPRASE_BRICK_STAIRS = registerBlock("citron_chrysoprase_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.CITRON_CHRYSOPRASE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.PALE_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block CLAYSTONE = registerBlock("claystone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CLAYSTONE_SLAB = registerBlock("claystone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CLAYSTONE_STAIRS = registerBlock("claystone_stairs",
            new StairsBlock(TakieTerraRockBlocks.CLAYSTONE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CLAYSTONE_WALL = registerBlock("claystone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CLAYSTONE_COBBLED = registerBlock("claystone_cobbled",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CLAYSTONE_COBBLED_SLAB = registerBlock("claystone_cobbled_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CLAYSTONE_COBBLED_STAIRS = registerBlock("claystone_cobbled_stairs",
            new StairsBlock(TakieTerraRockBlocks.CLAYSTONE_COBBLED.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CLAYSTONE_COBBLED_WALL = registerBlock("claystone_cobbled_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CLAYSTONE_BRICK_WALL = registerBlock("claystone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CLAYSTONE_BRICKS = registerBlock("claystone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CLAYSTONE_BRICK_SLAB = registerBlock("claystone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CLAYSTONE_BRICK_STAIRS = registerBlock("claystone_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.CLAYSTONE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block CLINOHUMITE_BLOCK = registerBlock("clinohumite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CLINOHUMITE_ORE = registerBlock("clinohumite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_CLINOHUMITE_ORE = registerBlock("deepslate_clinohumite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block CLINOHUMITE_SLAB = registerBlock("clinohumite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CLINOHUMITE_STAIRS = registerBlock("clinohumite_stairs",
            new StairsBlock(TakieTerraRockBlocks.CLINOHUMITE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CLINOHUMITE_WALL = registerBlock("clinohumite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CLINOHUMITE_BRICK_WALL = registerBlock("clinohumite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CLINOHUMITE_BRICKS = registerBlock("clinohumite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CLINOHUMITE_BRICK_SLAB = registerBlock("clinohumite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CLINOHUMITE_BRICK_STAIRS = registerBlock("clinohumite_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.CLINOHUMITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block DIOPTASE_BLOCK = registerBlock("dioptase_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DIOPTASE_ORE = registerBlock("dioptase_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_DIOPTASE_ORE = registerBlock("deepslate_dioptase_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TEAL).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block DIOPTASE_SLAB = registerBlock("dioptase_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DIOPTASE_STAIRS = registerBlock("dioptase_stairs",
            new StairsBlock(TakieTerraRockBlocks.DIOPTASE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DIOPTASE_WALL = registerBlock("dioptase_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DIOPTASE_BRICK_WALL = registerBlock("dioptase_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DIOPTASE_BRICKS = registerBlock("dioptase_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DIOPTASE_BRICK_SLAB = registerBlock("dioptase_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DIOPTASE_BRICK_STAIRS = registerBlock("dioptase_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.DIOPTASE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block DOLERITE = registerBlock("dolerite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DOLERITE_SLAB = registerBlock("dolerite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DOLERITE_STAIRS = registerBlock("dolerite_stairs",
            new StairsBlock(TakieTerraRockBlocks.DOLERITE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DOLERITE_WALL = registerBlock("dolerite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DOLERITE_COBBLED = registerBlock("dolerite_cobbled",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DOLERITE_COBBLED_SLAB = registerBlock("dolerite_cobbled_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DOLERITE_COBBLED_STAIRS = registerBlock("dolerite_cobbled_stairs",
            new StairsBlock(TakieTerraRockBlocks.DOLERITE_COBBLED.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DOLERITE_COBBLED_WALL = registerBlock("dolerite_cobbled_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DOLERITE_BRICK_WALL = registerBlock("dolerite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DOLERITE_BRICKS = registerBlock("dolerite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DOLERITE_BRICK_SLAB = registerBlock("dolerite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DOLERITE_BRICK_STAIRS = registerBlock("dolerite_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.DOLERITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block DOLOMITE = registerBlock("dolomite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DOLOMITE_SLAB = registerBlock("dolomite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DOLOMITE_STAIRS = registerBlock("dolomite_stairs",
            new StairsBlock(TakieTerraRockBlocks.DOLOMITE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DOLOMITE_WALL = registerBlock("dolomite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DOLOMITE_COBBLED = registerBlock("dolomite_cobbled",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DOLOMITE_COBBLED_SLAB = registerBlock("dolomite_cobbled_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DOLOMITE_COBBLED_STAIRS = registerBlock("dolomite_cobbled_stairs",
            new StairsBlock(TakieTerraRockBlocks.DOLOMITE_COBBLED.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DOLOMITE_COBBLED_WALL = registerBlock("dolomite_cobbled_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DOLOMITE_BRICK_WALL = registerBlock("dolomite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DOLOMITE_BRICKS = registerBlock("dolomite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DOLOMITE_BRICK_SLAB = registerBlock("dolomite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DOLOMITE_BRICK_STAIRS = registerBlock("dolomite_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.DOLOMITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block DUMORTIERTITE = registerBlock("dumortiertite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DUMORTIERTITE_SLAB = registerBlock("dumortiertite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DUMORTIERTITE_STAIRS = registerBlock("dumortiertite_stairs",
            new StairsBlock(TakieTerraRockBlocks.DUMORTIERTITE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DUMORTIERTITE_WALL = registerBlock("dumortiertite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DUMORTIERTITE_COBBLED = registerBlock("dumortiertite_cobbled",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DUMORTIERTITE_COBBLED_SLAB = registerBlock("dumortiertite_cobbled_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DUMORTIERTITE_COBBLED_STAIRS = registerBlock("dumortiertite_cobbled_stairs",
            new StairsBlock(TakieTerraRockBlocks.DUMORTIERTITE_COBBLED.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DUMORTIERTITE_COBBLED_WALL = registerBlock("dumortiertite_cobbled_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DUMORTIERTITE_BRICK_WALL = registerBlock("dumortiertite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DUMORTIERTITE_BRICKS = registerBlock("dumortiertite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DUMORTIERTITE_BRICK_SLAB = registerBlock("dumortiertite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DUMORTIERTITE_BRICK_STAIRS = registerBlock("dumortiertite_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.DUMORTIERTITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block DUMORTIERTITE_BLUE = registerBlock("dumortiertite_blue",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DUMORTIERTITE_BLUE_SLAB = registerBlock("dumortiertite_blue_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DUMORTIERTITE_BLUE_STAIRS = registerBlock("dumortiertite_blue_stairs",
            new StairsBlock(TakieTerraRockBlocks.DUMORTIERTITE_BLUE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DUMORTIERTITE_BLUE_WALL = registerBlock("dumortiertite_blue_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DUMORTIERTITE_BLUE_COBBLED = registerBlock("dumortiertite_blue_cobbled",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DUMORTIERTITE_BLUE_COBBLED_SLAB = registerBlock("dumortiertite_blue_cobbled_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DUMORTIERTITE_BLUE_COBBLED_STAIRS = registerBlock("dumortiertite_blue_cobbled_stairs",
            new StairsBlock(TakieTerraRockBlocks.DUMORTIERTITE_BLUE_COBBLED.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DUMORTIERTITE_BLUE_COBBLED_WALL = registerBlock("dumortiertite_blue_cobbled_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DUMORTIERTITE_BLUE_BRICK_WALL = registerBlock("dumortiertite_blue_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DUMORTIERTITE_BLUE_BRICKS = registerBlock("dumortiertite_blue_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.TERRACOTTA_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DUMORTIERTITE_BLUE_BRICK_SLAB = registerBlock("dumortiertite_blue_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DUMORTIERTITE_BLUE_BRICK_STAIRS = registerBlock("dumortiertite_blue_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.DUMORTIERTITE_BLUE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block EUDIALYTE = registerBlock("eudialyte",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block EUDIALYTE_SLAB = registerBlock("eudialyte_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block EUDIALYTE_STAIRS = registerBlock("eudialyte_stairs",
            new StairsBlock(TakieTerraRockBlocks.EUDIALYTE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block EUDIALYTE_WALL = registerBlock("eudialyte_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block FUCHSITE_BLOCK = registerBlock("fuchsite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.EMERALD_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block FUCHSITE_ORE = registerBlock("fuchsite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.EMERALD_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_FUCHSITE_ORE = registerBlock("deepslate_fuchsite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.EMERALD_GREEN).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block FUCHSITE_SLAB = registerBlock("fuchsite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.EMERALD_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block FUCHSITE_STAIRS = registerBlock("fuchsite_stairs",
            new StairsBlock(TakieTerraRockBlocks.FUCHSITE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.EMERALD_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block FUCHSITE_WALL = registerBlock("fuchsite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.EMERALD_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block FUCHSITE_BRICK_WALL = registerBlock("fuchsite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.EMERALD_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block FUCHSITE_BRICKS = registerBlock("fuchsite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.EMERALD_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block FUCHSITE_BRICK_SLAB = registerBlock("fuchsite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.EMERALD_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block FUCHSITE_BRICK_STAIRS = registerBlock("fuchsite_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.FUCHSITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.EMERALD_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block GABBRO = registerBlock("gabbro",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GABBRO_SLAB = registerBlock("gabbro_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GABBRO_STAIRS = registerBlock("gabbro_stairs",
            new StairsBlock(TakieTerraRockBlocks.GABBRO.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GABBRO_WALL = registerBlock("gabbro_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GABBRO_COBBLED = registerBlock("gabbro_cobbled",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GABBRO_COBBLED_SLAB = registerBlock("gabbro_cobbled_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GABBRO_COBBLED_STAIRS = registerBlock("gabbro_cobbled_stairs",
            new StairsBlock(TakieTerraRockBlocks.GABBRO_COBBLED.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GABBRO_COBBLED_WALL = registerBlock("gabbro_cobbled_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GABBRO_BRICK_WALL = registerBlock("gabbro_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GABBRO_BRICKS = registerBlock("gabbro_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GABBRO_BRICK_SLAB = registerBlock("gabbro_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GABBRO_BRICK_STAIRS = registerBlock("gabbro_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.GABBRO_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block GARNET_BLOCK = registerBlock("garnet_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DARK_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_GARNET = registerBlock("polished_garnet",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DARK_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SMOOTH_GARNET = registerBlock("smooth_garnet",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DARK_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GARNET_BRICKS = registerBlock("garnet_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DARK_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GARNET_BRICK_WALL = registerBlock("garnet_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DARK_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GARNET_BRICK_SLAB = registerBlock("garnet_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DARK_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GARNET_BRICK_STAIRS = registerBlock("garnet_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.GARNET_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DARK_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GARNET_ORE = registerBlock("garnet_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DARK_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_GARNET_ORE = registerBlock("deepslate_garnet_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DARK_RED).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE)));


    public static final Block GLAUCOPHANE = registerBlock("glaucophane",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GLAUCOPHANE_SLAB = registerBlock("glaucophane_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GLAUCOPHANE_STAIRS = registerBlock("glaucophane_stairs",
            new StairsBlock(TakieTerraRockBlocks.GLAUCOPHANE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GLAUCOPHANE_WALL = registerBlock("glaucophane_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GLAUCOPHANE_COBBLED = registerBlock("glaucophane_cobbled",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GLAUCOPHANE_COBBLED_SLAB = registerBlock("glaucophane_cobbled_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GLAUCOPHANE_COBBLED_STAIRS = registerBlock("glaucophane_cobbled_stairs",
            new StairsBlock(TakieTerraRockBlocks.GLAUCOPHANE_COBBLED.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GLAUCOPHANE_COBBLED_WALL = registerBlock("glaucophane_cobbled_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GLAUCOPHANE_BRICK_WALL = registerBlock("glaucophane_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GLAUCOPHANE_BRICKS = registerBlock("glaucophane_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GLAUCOPHANE_BRICK_SLAB = registerBlock("glaucophane_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GLAUCOPHANE_BRICK_STAIRS = registerBlock("glaucophane_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.GLAUCOPHANE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block GNEISS_MARINE = registerBlock("gneiss_marine",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DARK_AQUA).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GNEISS_MARINE_SLAB = registerBlock("gneiss_marine_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DARK_AQUA).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GNEISS_MARINE_STAIRS = registerBlock("gneiss_marine_stairs",
            new StairsBlock(TakieTerraRockBlocks.GNEISS_MARINE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DARK_AQUA).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GNEISS_MARINE_WALL = registerBlock("gneiss_marine_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DARK_AQUA).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GNEISS_MARINE_BRICK_WALL = registerBlock("gneiss_marine_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DARK_AQUA).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GNEISS_MARINE_BRICKS = registerBlock("gneiss_marine_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.DARK_AQUA).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GNEISS_MARINE_BRICK_SLAB = registerBlock("gneiss_marine_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DARK_AQUA).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GNEISS_MARINE_BRICK_STAIRS = registerBlock("gneiss_marine_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.GNEISS_MARINE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DARK_AQUA).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block WACKE = registerBlock("wacke",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block WACKE_SLAB = registerBlock("wacke_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block WACKE_STAIRS = registerBlock("wacke_stairs",
            new StairsBlock(TakieTerraRockBlocks.WACKE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block WACKE_WALL = registerBlock("wacke_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block WACKE_COBBLED = registerBlock("wacke_cobbled",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block WACKE_COBBLED_SLAB = registerBlock("wacke_cobbled_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block WACKE_COBBLED_STAIRS = registerBlock("wacke_cobbled_stairs",
            new StairsBlock(TakieTerraRockBlocks.WACKE_COBBLED.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block WACKE_COBBLED_WALL = registerBlock("wacke_cobbled_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block WACKE_BRICK_WALL = registerBlock("wacke_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block WACKE_BRICKS = registerBlock("wacke_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block WACKE_BRICK_SLAB = registerBlock("wacke_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block WACKE_BRICK_STAIRS = registerBlock("wacke_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.WACKE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block GREENSTONE = registerBlock("greenstone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block HEMIMORPHITE_BLOCK = registerBlock("hemimorphite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block HEMIMORPHITE_ORE = registerBlock("hemimorphite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_HEMIMORPHITE_ORE = registerBlock("deepslate_hemimorphite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block HEMIMORPHITE_WALL = registerBlock("hemimorphite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block HEMIMORPHITE_SLAB = registerBlock("hemimorphite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block HEMIMORPHITE_STAIRS = registerBlock("hemimorphite_stairs",
            new StairsBlock(TakieTerraRockBlocks.HEMIMORPHITE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block HEMIMORPHITE_BRICK_WALL = registerBlock("hemimorphite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block HEMIMORPHITE_BRICKS = registerBlock("hemimorphite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block HEMIMORPHITE_BRICK_SLAB = registerBlock("hemimorphite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block HEMIMORPHITE_BRICK_STAIRS = registerBlock("hemimorphite_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.HEMIMORPHITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block HORNFELS = registerBlock("hornfels",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block IOLITE_BLOCK = registerBlock("iolite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block IOLITE_ORE = registerBlock("iolite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_IOLITE_ORE = registerBlock("deepslate_iolite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_PURPLE).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block IOLITE_WALL = registerBlock("iolite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block IOLITE_SLAB = registerBlock("iolite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block IOLITE_STAIRS = registerBlock("iolite_stairs",
            new StairsBlock(TakieTerraRockBlocks.IOLITE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block IOLITE_BRICK_WALL = registerBlock("iolite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block IOLITE_BRICKS = registerBlock("iolite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.TERRACOTTA_PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block IOLITE_BRICK_SLAB = registerBlock("iolite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block IOLITE_BRICK_STAIRS = registerBlock("iolite_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.IOLITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block LABRADORITE_MIDNIGHT_BLOCK = registerBlock("labradorite_midnight_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LABRADORITE_MIDNIGHT_ORE = registerBlock("labradorite_midnight_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_LABRADORITE_MIDNIGHT_ORE = registerBlock("deepslate_labradorite_midnight_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_PURPLE).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block LABRADORITE_MIDNIGHT_WALL = registerBlock("labradorite_midnight_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LABRADORITE_MIDNIGHT_SLAB = registerBlock("labradorite_midnight_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LABRADORITE_MIDNIGHT_STAIRS = registerBlock("labradorite_midnight_stairs",
            new StairsBlock(TakieTerraRockBlocks.LABRADORITE_MIDNIGHT_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LABRADORITE_MIDNIGHT_BRICK_WALL = registerBlock("labradorite_midnight_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LABRADORITE_MIDNIGHT_BRICKS = registerBlock("labradorite_midnight_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.TERRACOTTA_PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LABRADORITE_MIDNIGHT_BRICK_SLAB = registerBlock("labradorite_midnight_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LABRADORITE_MIDNIGHT_BRICK_STAIRS = registerBlock("labradorite_midnight_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.LABRADORITE_MIDNIGHT_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block LAZULITE_BLOCK = registerBlock("lazulite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LAPIS_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LAZULITE_ORE = registerBlock("lazulite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LAPIS_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_LAZULITE_ORE = registerBlock("deepslate_lazulite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LAPIS_BLUE).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block LAZULITE_WALL = registerBlock("lazulite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.LAPIS_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LAZULITE_SLAB = registerBlock("lazulite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LAPIS_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LAZULITE_STAIRS = registerBlock("lazulite_stairs",
            new StairsBlock(TakieTerraRockBlocks.LAZULITE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LAPIS_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LAZULITE_BRICK_WALL = registerBlock("lazulite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.LAPIS_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LAZULITE_BRICKS = registerBlock("lazulite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.LAPIS_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LAZULITE_BRICK_SLAB = registerBlock("lazulite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LAPIS_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LAZULITE_BRICK_STAIRS = registerBlock("lazulite_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.LAZULITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LAPIS_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block LEPIDOLITE_BLOCK = registerBlock("lepidolite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LEPIDOLITE_ORE = registerBlock("lepidolite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_LEPIDOLITE_ORE = registerBlock("deepslate_lepidolite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.PURPLE).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block LEPIDOLITE_WALL = registerBlock("lepidolite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LEPIDOLITE_SLAB = registerBlock("lepidolite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LEPIDOLITE_STAIRS = registerBlock("lepidolite_stairs",
            new StairsBlock(TakieTerraRockBlocks.LEPIDOLITE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LEPIDOLITE_BRICK_WALL = registerBlock("lepidolite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LEPIDOLITE_BRICKS = registerBlock("lepidolite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LEPIDOLITE_BRICK_SLAB = registerBlock("lepidolite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block LEPIDOLITE_BRICK_STAIRS = registerBlock("lepidolite_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.LEPIDOLITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block MIGMATITE = registerBlock("migmatite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.WHITE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MIGMATITE_BRICKS = registerBlock("migmatite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.WHITE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block MONZONITE = registerBlock("monzonite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MONZONITE_BRICKS = registerBlock("monzonite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block MORGANITE_BLOCK = registerBlock("morganite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MORGANITE_ORE = registerBlock("morganite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_MORGANITE_ORE = registerBlock("deepslate_morganite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_PINK).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block MORGANITE_WALL = registerBlock("morganite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MORGANITE_SLAB = registerBlock("morganite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MORGANITE_STAIRS = registerBlock("morganite_stairs",
            new StairsBlock(TakieTerraRockBlocks.MORGANITE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MORGANITE_BRICK_WALL = registerBlock("morganite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MORGANITE_BRICKS = registerBlock("morganite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.TERRACOTTA_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MORGANITE_BRICK_SLAB = registerBlock("morganite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MORGANITE_BRICK_STAIRS = registerBlock("morganite_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.MORGANITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block MUSCOVITE = registerBlock("muscovite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE = registerBlock("novaculite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.RAW_IRON_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_GRAY = registerBlock("novaculite_gray",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_OLIVE = registerBlock("novaculite_olive",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_RED = registerBlock("novaculite_red",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DULL_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block OLIVINE_BLOCK = registerBlock("olivine_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block OLIVINE_WALL = registerBlock("olivine_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block OLIVINE_SLAB = registerBlock("olivine_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block OLIVINE_STAIRS = registerBlock("olivine_stairs",
            new StairsBlock(TakieTerraRockBlocks.OLIVINE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block OLIVINE_BRICK_WALL = registerBlock("olivine_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block OLIVINE_BRICKS = registerBlock("olivine_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block OLIVINE_BRICK_SLAB = registerBlock("olivine_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block OLIVINE_BRICK_STAIRS = registerBlock("olivine_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.OLIVINE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block ORTHOCLASE_BLOCK = registerBlock("orthoclase_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ORTHOCLASE_WALL = registerBlock("orthoclase_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ORTHOCLASE_SLAB = registerBlock("orthoclase_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ORTHOCLASE_STAIRS = registerBlock("orthoclase_stairs",
            new StairsBlock(TakieTerraRockBlocks.ORTHOCLASE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ORTHOCLASE_BRICK_WALL = registerBlock("orthoclase_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ORTHOCLASE_BRICKS = registerBlock("orthoclase_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ORTHOCLASE_BRICK_SLAB = registerBlock("orthoclase_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ORTHOCLASE_BRICK_STAIRS = registerBlock("orthoclase_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.ORTHOCLASE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block PHYLLITE = registerBlock("phyllite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LICHEN_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PHYLLITE_SLAB = registerBlock("phyllite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LICHEN_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PHYLLITE_STAIRS = registerBlock("phyllite_stairs",
            new StairsBlock(TakieTerraRockBlocks.PHYLLITE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LICHEN_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PHYLLITE_WALL = registerBlock("phyllite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.LICHEN_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PHYLLITE_COBBLED = registerBlock("phyllite_cobbled",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LICHEN_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PHYLLITE_COBBLED_SLAB = registerBlock("phyllite_cobbled_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LICHEN_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PHYLLITE_COBBLED_STAIRS = registerBlock("phyllite_cobbled_stairs",
            new StairsBlock(TakieTerraRockBlocks.PHYLLITE_COBBLED.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LICHEN_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PHYLLITE_COBBLED_WALL = registerBlock("phyllite_cobbled_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.LICHEN_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PHYLLITE_BRICK_WALL = registerBlock("phyllite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.LICHEN_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PHYLLITE_BRICKS = registerBlock("phyllite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.LICHEN_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PHYLLITE_BRICK_SLAB = registerBlock("phyllite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LICHEN_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PHYLLITE_BRICK_STAIRS = registerBlock("phyllite_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.PHYLLITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LICHEN_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block PINK_CORUNDUM_BLOCK = registerBlock("pink_corundum_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PINK_CORUNDUM_ORE = registerBlock("pink_corundum_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_PINK_CORUNDUM_ORE = registerBlock("deepslate_pink_corundum_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.PINK).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block PINK_CORUNDUM_WALL = registerBlock("pink_corundum_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PINK_CORUNDUM_SLAB = registerBlock("pink_corundum_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PINK_CORUNDUM_STAIRS = registerBlock("pink_corundum_stairs",
            new StairsBlock(TakieTerraRockBlocks.PINK_CORUNDUM_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PINK_CORUNDUM_BRICK_WALL = registerBlock("pink_corundum_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PINK_CORUNDUM_BRICKS = registerBlock("pink_corundum_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PINK_CORUNDUM_BRICK_SLAB = registerBlock("pink_corundum_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PINK_CORUNDUM_BRICK_STAIRS = registerBlock("pink_corundum_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.PINK_CORUNDUM_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block PREHNITE_BLOCK = registerBlock("prehnite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.PALE_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PREHNITE_ORE = registerBlock("prehnite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_PURPLE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_PREHNITE_ORE = registerBlock("deepslate_prehnite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_PURPLE).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block PREHNITE_WALL = registerBlock("prehnite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.PALE_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PREHNITE_SLAB = registerBlock("prehnite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.PALE_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PREHNITE_STAIRS = registerBlock("prehnite_stairs",
            new StairsBlock(TakieTerraRockBlocks.PREHNITE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.PALE_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PREHNITE_BRICK_WALL = registerBlock("prehnite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.PALE_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PREHNITE_BRICKS = registerBlock("prehnite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.PALE_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PREHNITE_BRICK_SLAB = registerBlock("prehnite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.PALE_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PREHNITE_BRICK_STAIRS = registerBlock("prehnite_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.PREHNITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.PALE_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block PYRITE_BLOCK = registerBlock("pyrite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.GOLD).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PYRITE_ORE = registerBlock("pyrite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.GOLD).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_PYRITE_ORE = registerBlock("deepslate_pyrite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.GOLD).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block PYRITE_WALL = registerBlock("pyrite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.GOLD).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PYRITE_SLAB = registerBlock("pyrite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.GOLD).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PYRITE_STAIRS = registerBlock("pyrite_stairs",
            new StairsBlock(TakieTerraRockBlocks.PYRITE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.GOLD).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PYRITE_BRICK_WALL = registerBlock("pyrite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.GOLD).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PYRITE_BRICKS = registerBlock("pyrite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.GOLD).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PYRITE_BRICK_SLAB = registerBlock("pyrite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.GOLD).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PYRITE_BRICK_STAIRS = registerBlock("pyrite_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.PYRITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.GOLD).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block PYROMORPHITE_BLOCK = registerBlock("pyromorphite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LIME).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PYROMORPHITE_ORE = registerBlock("pyromorphite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LIME).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_PYROMORPHITE_ORE = registerBlock("deepslate_pyromorphite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LIME).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block PYROMORPHITE_WALL = registerBlock("pyromorphite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.LIME).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PYROMORPHITE_SLAB = registerBlock("pyromorphite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LIME).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PYROMORPHITE_STAIRS = registerBlock("pyromorphite_stairs",
            new StairsBlock(TakieTerraRockBlocks.PYROMORPHITE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LIME).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PYROMORPHITE_BRICK_WALL = registerBlock("pyromorphite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.LIME).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PYROMORPHITE_BRICKS = registerBlock("pyromorphite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.LIME).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PYROMORPHITE_BRICK_SLAB = registerBlock("pyromorphite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LIME).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PYROMORPHITE_BRICK_STAIRS = registerBlock("pyromorphite_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.PYROMORPHITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LIME).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block RED_CHERT = registerBlock("red_chert",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LIME).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block RHYOLITE_BLOCK = registerBlock("rhyolite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DARK_DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RHYOLITE_WALL = registerBlock("rhyolite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DARK_DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RHYOLITE_SLAB = registerBlock("rhyolite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DARK_DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RHYOLITE_STAIRS = registerBlock("rhyolite_stairs",
            new StairsBlock(TakieTerraRockBlocks.RHYOLITE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DARK_DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RHYOLITE_BRICK_WALL = registerBlock("rhyolite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DARK_DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RHYOLITE_BRICKS = registerBlock("rhyolite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.DARK_DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RHYOLITE_BRICK_SLAB = registerBlock("rhyolite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DARK_DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RHYOLITE_BRICK_STAIRS = registerBlock("rhyolite_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.RHYOLITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DARK_DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block SHALE_BLOCK = registerBlock("shale_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LIGHT_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SHALE_WALL = registerBlock("shale_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.LIGHT_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SHALE_SLAB = registerBlock("shale_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LIGHT_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SHALE_STAIRS = registerBlock("shale_stairs",
            new StairsBlock(TakieTerraRockBlocks.SHALE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LIGHT_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SHALE_BRICK_WALL = registerBlock("shale_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.LIGHT_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SHALE_BRICKS = registerBlock("shale_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.LIGHT_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SHALE_BRICK_SLAB = registerBlock("shale_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LIGHT_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SHALE_BRICK_STAIRS = registerBlock("shale_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.SHALE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LIGHT_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block SIDERITE = registerBlock("siderite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.SPRUCE_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SIDERITE_SLAB = registerBlock("siderite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.SPRUCE_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SIDERITE_STAIRS = registerBlock("siderite_stairs",
            new StairsBlock(TakieTerraRockBlocks.SIDERITE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.SPRUCE_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SIDERITE_WALL = registerBlock("siderite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.SPRUCE_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SIDERITE_COBBLED = registerBlock("siderite_cobbled",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.SPRUCE_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SIDERITE_COBBLED_SLAB = registerBlock("siderite_cobbled_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.SPRUCE_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SIDERITE_COBBLED_STAIRS = registerBlock("siderite_cobbled_stairs",
            new StairsBlock(TakieTerraRockBlocks.SIDERITE_COBBLED.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.SPRUCE_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SIDERITE_COBBLED_WALL = registerBlock("siderite_cobbled_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.SPRUCE_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SIDERITE_BRICK_WALL = registerBlock("siderite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.SPRUCE_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SIDERITE_BRICKS = registerBlock("siderite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.SPRUCE_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SIDERITE_BRICK_SLAB = registerBlock("siderite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.SPRUCE_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SIDERITE_BRICK_STAIRS = registerBlock("siderite_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.SIDERITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.SPRUCE_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block SILTSTONE = registerBlock("siltstone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SILTSTONE_SLAB = registerBlock("siltstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SILTSTONE_STAIRS = registerBlock("siltstone_stairs",
            new StairsBlock(TakieTerraRockBlocks.SILTSTONE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SILTSTONE_WALL = registerBlock("siltstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SILTSTONE_COBBLED = registerBlock("siltstone_cobbled",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SILTSTONE_COBBLED_SLAB = registerBlock("siltstone_cobbled_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SILTSTONE_COBBLED_STAIRS = registerBlock("siltstone_cobbled_stairs",
            new StairsBlock(TakieTerraRockBlocks.SILTSTONE_COBBLED.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SILTSTONE_COBBLED_WALL = registerBlock("siltstone_cobbled_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SILTSTONE_BRICK_WALL = registerBlock("siltstone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SILTSTONE_BRICKS = registerBlock("siltstone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SILTSTONE_BRICK_SLAB = registerBlock("siltstone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SILTSTONE_BRICK_STAIRS = registerBlock("siltstone_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.SILTSTONE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block SKARN = registerBlock("skarn",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SKARN_WALL = registerBlock("skarn_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SKARN_SLAB = registerBlock("skarn_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SKARN_STAIRS = registerBlock("skarn_stairs",
            new StairsBlock(TakieTerraRockBlocks.SKARN.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SKARN_BRICK_WALL = registerBlock("skarn_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SKARN_BRICKS = registerBlock("skarn_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SKARN_BRICK_SLAB = registerBlock("skarn_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SKARN_BRICK_STAIRS = registerBlock("skarn_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.SKARN_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block SNOW_QUARTZ = registerBlock("snow_quartz",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SOAPSTONE = registerBlock("soapstone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block SOVITE = registerBlock("sovite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SOVITE_SLAB = registerBlock("sovite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SOVITE_STAIRS = registerBlock("sovite_stairs",
            new StairsBlock(TakieTerraRockBlocks.SOVITE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SOVITE_WALL = registerBlock("sovite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SOVITE_COBBLED = registerBlock("sovite_cobbled",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SOVITE_COBBLED_SLAB = registerBlock("sovite_cobbled_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SOVITE_COBBLED_STAIRS = registerBlock("sovite_cobbled_stairs",
            new StairsBlock(TakieTerraRockBlocks.SOVITE_COBBLED.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SOVITE_COBBLED_WALL = registerBlock("sovite_cobbled_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SOVITE_BRICK_WALL = registerBlock("sovite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SOVITE_BRICKS = registerBlock("sovite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SOVITE_BRICK_SLAB = registerBlock("sovite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SOVITE_BRICK_STAIRS = registerBlock("sovite_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.SOVITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block SERPENTINITE = registerBlock("serpentinite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SERPENTINITE_SLAB = registerBlock("serpentinite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SERPENTINITE_STAIRS = registerBlock("serpentinite_stairs",
            new StairsBlock(TakieTerraRockBlocks.SERPENTINITE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SERPENTINITE_WALL = registerBlock("serpentinite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SERPENTINITE_BRICK_WALL = registerBlock("serpentinite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SERPENTINITE_BRICKS = registerBlock("serpentinite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SERPENTINITE_BRICK_SLAB = registerBlock("serpentinite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SERPENTINITE_BRICK_STAIRS = registerBlock("serpentinite_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.SERPENTINITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block TITANITE_BLOCK = registerBlock("titanite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TITANITE_ORE = registerBlock("titanite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_TITANITE_ORE = registerBlock("deepslate_titanite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block TITANITE_SLAB = registerBlock("titanite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TITANITE_STAIRS = registerBlock("titanite_stairs",
            new StairsBlock(TakieTerraRockBlocks.TITANITE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TITANITE_WALL = registerBlock("titanite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TITANITE_BRICK_WALL = registerBlock("titanite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TITANITE_BRICKS = registerBlock("titanite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TITANITE_BRICK_SLAB = registerBlock("titanite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TITANITE_BRICK_STAIRS = registerBlock("titanite_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.TITANITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block SUNSTONE = registerBlock("sunstone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SUNSTONE_ORE = registerBlock("sunstone_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_SUNSTONE_ORE = registerBlock("deepslate_sunstone_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block SUNSTONE_WALL = registerBlock("sunstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SUNSTONE_SLAB = registerBlock("sunstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SUNSTONE_STAIRS = registerBlock("sunstone_stairs",
            new StairsBlock(TakieTerraRockBlocks.SUNSTONE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SUNSTONE_BRICK_WALL = registerBlock("sunstone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SUNSTONE_BRICKS = registerBlock("sunstone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SUNSTONE_BRICK_SLAB = registerBlock("sunstone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SUNSTONE_BRICK_STAIRS = registerBlock("sunstone_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.SUNSTONE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block THORITE = registerBlock("thorite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.RAW_IRON_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block THORITE_SLAB = registerBlock("thorite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.RAW_IRON_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block THORITE_STAIRS = registerBlock("thorite_stairs",
            new StairsBlock(TakieTerraRockBlocks.THORITE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.RAW_IRON_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block THORITE_WALL = registerBlock("thorite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.RAW_IRON_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block THORITE_COBBLED = registerBlock("thorite_cobbled",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.RAW_IRON_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block THORITE_COBBLED_SLAB = registerBlock("thorite_cobbled_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.RAW_IRON_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block THORITE_COBBLED_STAIRS = registerBlock("thorite_cobbled_stairs",
            new StairsBlock(TakieTerraRockBlocks.THORITE_COBBLED.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.RAW_IRON_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block THORITE_COBBLED_WALL = registerBlock("thorite_cobbled_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.RAW_IRON_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block THORITE_BRICK_WALL = registerBlock("thorite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.RAW_IRON_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block THORITE_BRICKS = registerBlock("thorite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.RAW_IRON_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block THORITE_BRICK_SLAB = registerBlock("thorite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.RAW_IRON_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block THORITE_BRICK_STAIRS = registerBlock("thorite_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.THORITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.RAW_IRON_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block TIDE_STONE_BLOCK = registerBlock("tide_stone_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.WATER_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TIDE_STONE_ORE = registerBlock("tide_stone_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.WATER_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_TIDE_STONE_ORE = registerBlock("deepslate_tide_stone_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.WATER_BLUE).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block TIDE_STONE_WALL = registerBlock("tide_stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.WATER_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TIDE_STONE_SLAB = registerBlock("tide_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.WATER_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TIDE_STONE_STAIRS = registerBlock("tide_stone_stairs",
            new StairsBlock(TakieTerraRockBlocks.TIDE_STONE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.WATER_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TIDE_STONE_BRICK_WALL = registerBlock("tide_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.WATER_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TIDE_STONE_BRICKS = registerBlock("tide_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.WATER_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TIDE_STONE_BRICK_SLAB = registerBlock("tide_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.WATER_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TIDE_STONE_BRICK_STAIRS = registerBlock("tide_stone_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.TIDE_STONE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.WATER_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block TOPAZ_BLOCK = registerBlock("topaz_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_YELLOW).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TOPAZ_WALL = registerBlock("topaz_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_YELLOW).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TOPAZ_SLAB = registerBlock("topaz_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_YELLOW).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TOPAZ_STAIRS = registerBlock("topaz_stairs",
            new StairsBlock(TakieTerraRockBlocks.TOPAZ_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_YELLOW).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TOPAZ_BRICK_WALL = registerBlock("topaz_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_YELLOW).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TOPAZ_BRICKS = registerBlock("topaz_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.TERRACOTTA_YELLOW).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TOPAZ_BRICK_SLAB = registerBlock("topaz_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_YELLOW).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TOPAZ_BRICK_STAIRS = registerBlock("topaz_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.TOPAZ_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_YELLOW).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block TRACHYTE = registerBlock("trachyte",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.GOLD).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TRACHYTE_WALL = registerBlock("trachyte_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.GOLD).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TRACHYTE_SLAB = registerBlock("trachyte_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.GOLD).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TRACHYTE_STAIRS = registerBlock("trachyte_stairs",
            new StairsBlock(TakieTerraRockBlocks.TRACHYTE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.GOLD).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TRACHYTE_BRICK_WALL = registerBlock("trachyte_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.GOLD).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TRACHYTE_BRICKS = registerBlock("trachyte_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.GOLD).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TRACHYTE_BRICK_SLAB = registerBlock("trachyte_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.GOLD).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TRACHYTE_BRICK_STAIRS = registerBlock("trachyte_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.TRACHYTE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.GOLD).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block TRAVERTINE = registerBlock("travertine",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TRAVERTINE_WALL = registerBlock("travertine_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TRAVERTINE_SLAB = registerBlock("travertine_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TRAVERTINE_STAIRS = registerBlock("travertine_stairs",
            new StairsBlock(TakieTerraRockBlocks.TRAVERTINE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TRAVERTINE_BRICK_WALL = registerBlock("travertine_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TRAVERTINE_BRICKS = registerBlock("travertine_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TRAVERTINE_BRICK_SLAB = registerBlock("travertine_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TRAVERTINE_BRICK_STAIRS = registerBlock("travertine_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.TRAVERTINE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block VARISCITE = registerBlock("variscite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.BRIGHT_TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block VARISCITE_ORE = registerBlock("variscite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.BRIGHT_TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_VARISCITE_ORE = registerBlock("deepslate_variscite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.BRIGHT_TEAL).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block VARISCITE_WALL = registerBlock("variscite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.BRIGHT_TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block VARISCITE_SLAB = registerBlock("variscite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.BRIGHT_TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block VARISCITE_STAIRS = registerBlock("variscite_stairs",
            new StairsBlock(TakieTerraRockBlocks.VARISCITE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.BRIGHT_TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block VARISCITE_BRICK_WALL = registerBlock("variscite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.BRIGHT_TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block VARISCITE_BRICKS = registerBlock("variscite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.BRIGHT_TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block VARISCITE_BRICK_SLAB = registerBlock("variscite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.BRIGHT_TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block VARISCITE_BRICK_STAIRS = registerBlock("variscite_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.VARISCITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.BRIGHT_TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block VIOLANE = registerBlock("violane",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block VIOLANE_WALL = registerBlock("violane_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block VIOLANE_SLAB = registerBlock("violane_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block VIOLANE_STAIRS = registerBlock("violane_stairs",
            new StairsBlock(TakieTerraRockBlocks.VIOLANE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block VIOLANE_BRICK_WALL = registerBlock("violane_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block VIOLANE_BRICKS = registerBlock("violane_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block VIOLANE_BRICK_SLAB = registerBlock("violane_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block VIOLANE_BRICK_STAIRS = registerBlock("violane_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.VIOLANE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LIGHT_BLUE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block YOWAH_OPAL = registerBlock("yowah_opal",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block YOWAH_OPAL_ORE = registerBlock("yowah_opal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_YOWAH_OPAL_ORE = registerBlock("deepslate_yowah_opal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE)));


//ANDESITE
    public static final Block ANDESITE_BRICKS = registerBlock("andesite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.ANDESITE).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ANDESITE_BRICK_WALL = registerBlock("andesite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ANDESITE_BRICK_SLAB = registerBlock("andesite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ANDESITE_BRICK_STAIRS = registerBlock("andesite_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.ANDESITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ANDESITE_BRICKS_MOSSY = registerBlock("andesite_bricks_mossy",
            new Block(FabricBlockSettings.copyOf(Blocks.ANDESITE).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ANDESITE_BRICK_WALL_MOSSY = registerBlock("andesite_brick_wall_mossy",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ANDESITE_BRICK_SLAB_MOSSY = registerBlock("andesite_brick_slab_mossy",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ANDESITE_BRICK_STAIRS_MOSSY = registerBlock("andesite_brick_stairs_mossy",
            new StairsBlock(TakieTerraRockBlocks.ANDESITE_BRICKS_MOSSY.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ANDESITE_COBBLE = registerBlock("andesite_cobble",
            new Block(FabricBlockSettings.copyOf(Blocks.ANDESITE).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ANDESITE_COBBLE_WALL = registerBlock("andesite_cobble_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ANDESITE_COBBLE_SLAB = registerBlock("andesite_cobble_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ANDESITE_COBBLE_STAIRS = registerBlock("andesite_cobble_stairs",
            new StairsBlock(TakieTerraRockBlocks.ANDESITE_COBBLE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ANDESITE_COBBLE_MOSSY = registerBlock("andesite_cobble_mossy",
            new Block(FabricBlockSettings.copyOf(Blocks.ANDESITE).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ANDESITE_COBBLE_WALL_MOSSY = registerBlock("andesite_cobble_wall_mossy",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ANDESITE_COBBLE_SLAB_MOSSY = registerBlock("andesite_cobble_slab_mossy",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ANDESITE_COBBLE_STAIRS_MOSSY = registerBlock("andesite_cobble_stairs_mossy",
            new StairsBlock(TakieTerraRockBlocks.ANDESITE_COBBLE_MOSSY.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ANDESITE_FINGERBRICKS = registerBlock("andesite_fingerbricks",
            new Block(FabricBlockSettings.copyOf(Blocks.ANDESITE).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ANDESITE_PARQUET = registerBlock("andesite_parquet",
            new Block(FabricBlockSettings.copyOf(Blocks.ANDESITE).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ANDESITE_TILES = registerBlock("andesite_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.ANDESITE).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    //CALCITE
    public static final Block CALCITE_BRICKS = registerBlock("calcite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CALCITE).mapColor(MapColor.TERRACOTTA_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_BRICK_WALL = registerBlock("calcite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_BRICK_SLAB = registerBlock("calcite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_BRICK_STAIRS = registerBlock("calcite_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.CALCITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_BRICKS_MOSSY = registerBlock("calcite_bricks_mossy",
            new Block(FabricBlockSettings.copyOf(Blocks.CALCITE).mapColor(MapColor.TERRACOTTA_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_BRICK_WALL_MOSSY = registerBlock("calcite_brick_wall_mossy",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_BRICK_SLAB_MOSSY = registerBlock("calcite_brick_slab_mossy",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_BRICK_STAIRS_MOSSY = registerBlock("calcite_brick_stairs_mossy",
            new StairsBlock(TakieTerraRockBlocks.CALCITE_BRICKS_MOSSY.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_COBBLE = registerBlock("calcite_cobble",
            new Block(FabricBlockSettings.copyOf(Blocks.CALCITE).mapColor(MapColor.TERRACOTTA_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_COBBLE_WALL = registerBlock("calcite_cobble_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_COBBLE_SLAB = registerBlock("calcite_cobble_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_COBBLE_STAIRS = registerBlock("calcite_cobble_stairs",
            new StairsBlock(TakieTerraRockBlocks.CALCITE_COBBLE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_COBBLE_MOSSY = registerBlock("calcite_cobble_mossy",
            new Block(FabricBlockSettings.copyOf(Blocks.CALCITE).mapColor(MapColor.TERRACOTTA_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_COBBLE_WALL_MOSSY = registerBlock("calcite_cobble_wall_mossy",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_COBBLE_SLAB_MOSSY = registerBlock("calcite_cobble_slab_mossy",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_COBBLE_STAIRS_MOSSY = registerBlock("calcite_cobble_stairs_mossy",
            new StairsBlock(TakieTerraRockBlocks.CALCITE_COBBLE_MOSSY.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_FINGERBRICKS = registerBlock("calcite_fingerbricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CALCITE).mapColor(MapColor.TERRACOTTA_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_PARQUET = registerBlock("calcite_parquet",
            new Block(FabricBlockSettings.copyOf(Blocks.CALCITE).mapColor(MapColor.TERRACOTTA_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.CALCITE)));
    public static final Block CALCITE_TILES = registerBlock("calcite_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.CALCITE).mapColor(MapColor.TERRACOTTA_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.CALCITE)));

    //DIORITE
    public static final Block DIORITE_BRICKS = registerBlock("diorite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.DIORITE).mapColor(MapColor.WHITE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DIORITE_BRICK_WALL = registerBlock("diorite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.WHITE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DIORITE_BRICK_SLAB = registerBlock("diorite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.WHITE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DIORITE_BRICK_STAIRS = registerBlock("diorite_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.DIORITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.WHITE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DIORITE_BRICKS_MOSSY = registerBlock("diorite_bricks_mossy",
            new Block(FabricBlockSettings.copyOf(Blocks.DIORITE).mapColor(MapColor.WHITE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DIORITE_BRICK_WALL_MOSSY = registerBlock("diorite_brick_wall_mossy",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.WHITE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DIORITE_BRICK_SLAB_MOSSY = registerBlock("diorite_brick_slab_mossy",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.WHITE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DIORITE_BRICK_STAIRS_MOSSY = registerBlock("diorite_brick_stairs_mossy",
            new StairsBlock(TakieTerraRockBlocks.DIORITE_BRICKS_MOSSY.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.WHITE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DIORITE_COBBLE = registerBlock("diorite_cobble",
            new Block(FabricBlockSettings.copyOf(Blocks.DIORITE).mapColor(MapColor.WHITE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DIORITE_COBBLE_WALL = registerBlock("diorite_cobble_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.WHITE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DIORITE_COBBLE_SLAB = registerBlock("diorite_cobble_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.WHITE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DIORITE_COBBLE_STAIRS = registerBlock("diorite_cobble_stairs",
            new StairsBlock(TakieTerraRockBlocks.DIORITE_COBBLE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.WHITE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DIORITE_COBBLE_MOSSY = registerBlock("diorite_cobble_mossy",
            new Block(FabricBlockSettings.copyOf(Blocks.DIORITE).mapColor(MapColor.WHITE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DIORITE_COBBLE_WALL_MOSSY = registerBlock("diorite_cobble_wall_mossy",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.WHITE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DIORITE_COBBLE_SLAB_MOSSY = registerBlock("diorite_cobble_slab_mossy",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.WHITE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DIORITE_COBBLE_STAIRS_MOSSY = registerBlock("diorite_cobble_stairs_mossy",
            new StairsBlock(TakieTerraRockBlocks.DIORITE_COBBLE_MOSSY.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.WHITE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DIORITE_FINGERBRICKS = registerBlock("diorite_fingerbricks",
            new Block(FabricBlockSettings.copyOf(Blocks.DIORITE).mapColor(MapColor.WHITE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DIORITE_PARQUET = registerBlock("diorite_parquet",
            new Block(FabricBlockSettings.copyOf(Blocks.DIORITE).mapColor(MapColor.WHITE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DIORITE_TILES = registerBlock("diorite_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.DIORITE).mapColor(MapColor.WHITE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    //MUSCOVITE
    public static final Block MUSCOVITE_BRICKS = registerBlock("muscovite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MUSCOVITE_BRICK_WALL = registerBlock("muscovite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MUSCOVITE_BRICK_SLAB = registerBlock("muscovite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MUSCOVITE_BRICK_STAIRS = registerBlock("muscovite_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.MUSCOVITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MUSCOVITE_BRICKS_MOSSY = registerBlock("muscovite_bricks_mossy",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MUSCOVITE_BRICK_WALL_MOSSY = registerBlock("muscovite_brick_wall_mossy",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MUSCOVITE_BRICK_SLAB_MOSSY = registerBlock("muscovite_brick_slab_mossy",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MUSCOVITE_BRICK_STAIRS_MOSSY = registerBlock("muscovite_brick_stairs_mossy",
            new StairsBlock(TakieTerraRockBlocks.MUSCOVITE_BRICKS_MOSSY.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MUSCOVITE_COBBLE = registerBlock("muscovite_cobble",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MUSCOVITE_COBBLE_WALL = registerBlock("muscovite_cobble_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MUSCOVITE_COBBLE_SLAB = registerBlock("muscovite_cobble_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MUSCOVITE_COBBLE_STAIRS = registerBlock("muscovite_cobble_stairs",
            new StairsBlock(TakieTerraRockBlocks.MUSCOVITE_COBBLE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MUSCOVITE_COBBLE_MOSSY = registerBlock("muscovite_cobble_mossy",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MUSCOVITE_COBBLE_WALL_MOSSY = registerBlock("muscovite_cobble_wall_mossy",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MUSCOVITE_COBBLE_SLAB_MOSSY = registerBlock("muscovite_cobble_slab_mossy",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MUSCOVITE_COBBLE_STAIRS_MOSSY = registerBlock("muscovite_cobble_stairs_mossy",
            new StairsBlock(TakieTerraRockBlocks.MUSCOVITE_COBBLE_MOSSY.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MUSCOVITE_FINGERBRICKS = registerBlock("muscovite_fingerbricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MUSCOVITE_PARQUET = registerBlock("muscovite_parquet",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MUSCOVITE_TILES = registerBlock("muscovite_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    //NOVACULITE
    public static final Block NOVACULITE_BRICKS = registerBlock("novaculite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_BRICK_WALL = registerBlock("novaculite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_BRICK_SLAB = registerBlock("novaculite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_BRICK_STAIRS = registerBlock("novaculite_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.NOVACULITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_BRICKS_MOSSY = registerBlock("novaculite_bricks_mossy",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_BRICK_WALL_MOSSY = registerBlock("novaculite_brick_wall_mossy",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_BRICK_SLAB_MOSSY = registerBlock("novaculite_brick_slab_mossy",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_BRICK_STAIRS_MOSSY = registerBlock("novaculite_brick_stairs_mossy",
            new StairsBlock(TakieTerraRockBlocks.NOVACULITE_BRICKS_MOSSY.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_COBBLE = registerBlock("novaculite_cobble",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_COBBLE_WALL = registerBlock("novaculite_cobble_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_COBBLE_SLAB = registerBlock("novaculite_cobble_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_COBBLE_STAIRS = registerBlock("novaculite_cobble_stairs",
            new StairsBlock(TakieTerraRockBlocks.NOVACULITE_COBBLE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_COBBLE_MOSSY = registerBlock("novaculite_cobble_mossy",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_COBBLE_WALL_MOSSY = registerBlock("novaculite_cobble_wall_mossy",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_COBBLE_SLAB_MOSSY = registerBlock("novaculite_cobble_slab_mossy",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_COBBLE_STAIRS_MOSSY = registerBlock("novaculite_cobble_stairs_mossy",
            new StairsBlock(TakieTerraRockBlocks.NOVACULITE_COBBLE_MOSSY.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_FINGERBRICKS = registerBlock("novaculite_fingerbricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_PARQUET = registerBlock("novaculite_parquet",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_TILES = registerBlock("novaculite_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block NOVACULITE_GRAY_BRICKS = registerBlock("novaculite_gray_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_GRAY_BRICK_WALL = registerBlock("novaculite_gray_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_GRAY_BRICK_SLAB = registerBlock("novaculite_gray_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_GRAY_BRICK_STAIRS = registerBlock("novaculite_gray_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.NOVACULITE_GRAY_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_GRAY_BRICKS_MOSSY = registerBlock("novaculite_gray_bricks_mossy",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_GRAY_BRICK_WALL_MOSSY = registerBlock("novaculite_gray_brick_wall_mossy",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_GRAY_BRICK_SLAB_MOSSY = registerBlock("novaculite_gray_brick_slab_mossy",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_GRAY_BRICK_STAIRS_MOSSY = registerBlock("novaculite_gray_brick_stairs_mossy",
            new StairsBlock(TakieTerraRockBlocks.NOVACULITE_GRAY_BRICKS_MOSSY.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_GRAY_COBBLE = registerBlock("novaculite_gray_cobble",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_GRAY_COBBLE_WALL = registerBlock("novaculite_gray_cobble_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_GRAY_COBBLE_SLAB = registerBlock("novaculite_gray_cobble_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_GRAY_COBBLE_STAIRS = registerBlock("novaculite_gray_cobble_stairs",
            new StairsBlock(TakieTerraRockBlocks.NOVACULITE_GRAY_COBBLE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_GRAY_COBBLE_MOSSY = registerBlock("novaculite_gray_cobble_mossy",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_GRAY_COBBLE_WALL_MOSSY = registerBlock("novaculite_gray_cobble_wall_mossy",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_GRAY_COBBLE_SLAB_MOSSY = registerBlock("novaculite_gray_cobble_slab_mossy",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_GRAY_COBBLE_STAIRS_MOSSY = registerBlock("novaculite_gray_cobble_stairs_mossy",
            new StairsBlock(TakieTerraRockBlocks.NOVACULITE_GRAY_COBBLE_MOSSY.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_GRAY_FINGERBRICKS = registerBlock("novaculite_gray_fingerbricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_GRAY_PARQUET = registerBlock("novaculite_gray_parquet",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_GRAY_TILES = registerBlock("novaculite_gray_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block NOVACULITE_OLIVE_BRICKS = registerBlock("novaculite_olive_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_OLIVE_BRICK_WALL = registerBlock("novaculite_olive_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_OLIVE_BRICK_SLAB = registerBlock("novaculite_olive_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_OLIVE_BRICK_STAIRS = registerBlock("novaculite_olive_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.NOVACULITE_OLIVE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_OLIVE_BRICKS_MOSSY = registerBlock("novaculite_olive_bricks_mossy",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_OLIVE_BRICK_WALL_MOSSY = registerBlock("novaculite_olive_brick_wall_mossy",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_OLIVE_BRICK_SLAB_MOSSY = registerBlock("novaculite_olive_brick_slab_mossy",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_OLIVE_BRICK_STAIRS_MOSSY = registerBlock("novaculite_olive_brick_stairs_mossy",
            new StairsBlock(TakieTerraRockBlocks.NOVACULITE_OLIVE_BRICKS_MOSSY.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_OLIVE_COBBLE = registerBlock("novaculite_olive_cobble",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_OLIVE_COBBLE_WALL = registerBlock("novaculite_olive_cobble_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_OLIVE_COBBLE_SLAB = registerBlock("novaculite_olive_cobble_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_OLIVE_COBBLE_STAIRS = registerBlock("novaculite_olive_cobble_stairs",
            new StairsBlock(TakieTerraRockBlocks.NOVACULITE_OLIVE_COBBLE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_OLIVE_COBBLE_MOSSY = registerBlock("novaculite_olive_cobble_mossy",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_OLIVE_COBBLE_WALL_MOSSY = registerBlock("novaculite_olive_cobble_wall_mossy",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_OLIVE_COBBLE_SLAB_MOSSY = registerBlock("novaculite_olive_cobble_slab_mossy",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_OLIVE_COBBLE_STAIRS_MOSSY = registerBlock("novaculite_olive_cobble_stairs_mossy",
            new StairsBlock(TakieTerraRockBlocks.NOVACULITE_OLIVE_COBBLE_MOSSY.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_OLIVE_FINGERBRICKS = registerBlock("novaculite_olive_fingerbricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_OLIVE_PARQUET = registerBlock("novaculite_olive_parquet",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_OLIVE_TILES = registerBlock("novaculite_olive_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block NOVACULITE_RED_BRICKS = registerBlock("novaculite_red_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DULL_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_RED_BRICK_WALL = registerBlock("novaculite_red_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DULL_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_RED_BRICK_SLAB = registerBlock("novaculite_red_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DULL_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_RED_BRICK_STAIRS = registerBlock("novaculite_red_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.NOVACULITE_RED_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DULL_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_RED_BRICKS_MOSSY = registerBlock("novaculite_red_bricks_mossy",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DULL_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_RED_BRICK_WALL_MOSSY = registerBlock("novaculite_red_brick_wall_mossy",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DULL_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_RED_BRICK_SLAB_MOSSY = registerBlock("novaculite_red_brick_slab_mossy",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DULL_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_RED_BRICK_STAIRS_MOSSY = registerBlock("novaculite_red_brick_stairs_mossy",
            new StairsBlock(TakieTerraRockBlocks.NOVACULITE_RED_BRICKS_MOSSY.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DULL_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_RED_COBBLE = registerBlock("novaculite_red_cobble",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DULL_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_RED_COBBLE_WALL = registerBlock("novaculite_red_cobble_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DULL_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_RED_COBBLE_SLAB = registerBlock("novaculite_red_cobble_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DULL_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_RED_COBBLE_STAIRS = registerBlock("novaculite_red_cobble_stairs",
            new StairsBlock(TakieTerraRockBlocks.NOVACULITE_RED_COBBLE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DULL_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_RED_COBBLE_MOSSY = registerBlock("novaculite_red_cobble_mossy",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DULL_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_RED_COBBLE_WALL_MOSSY = registerBlock("novaculite_red_cobble_wall_mossy",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DULL_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_RED_COBBLE_SLAB_MOSSY = registerBlock("novaculite_red_cobble_slab_mossy",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DULL_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_RED_COBBLE_STAIRS_MOSSY = registerBlock("novaculite_red_cobble_stairs_mossy",
            new StairsBlock(TakieTerraRockBlocks.NOVACULITE_RED_COBBLE_MOSSY.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DULL_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_RED_FINGERBRICKS = registerBlock("novaculite_red_fingerbricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DULL_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_RED_PARQUET = registerBlock("novaculite_red_parquet",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DULL_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NOVACULITE_RED_TILES = registerBlock("novaculite_red_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DULL_RED).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    //STONE
    public static final Block STONE_FINGERBRICKS = registerBlock("stone_fingerbricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block STONE_PARQUET = registerBlock("stone_parquet",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block STONE_BRICKS_NARROW = registerBlock("stone_bricks_narrow",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    //TUFF
    public static final Block TUFF_BRICKS = registerBlock("tuff_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.IRON_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.TUFF)));
    public static final Block TUFF_BRICK_WALL = registerBlock("tuff_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.IRON_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TUFF_BRICK_SLAB = registerBlock("tuff_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.IRON_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TUFF_BRICK_STAIRS = registerBlock("tuff_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.TUFF_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.IRON_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TUFF_BRICKS_MOSSY = registerBlock("tuff_bricks_mossy",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.IRON_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.TUFF)));
    public static final Block TUFF_BRICK_WALL_MOSSY = registerBlock("tuff_brick_wall_mossy",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.IRON_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TUFF_BRICK_SLAB_MOSSY = registerBlock("tuff_brick_slab_mossy",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.IRON_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TUFF_BRICK_STAIRS_MOSSY = registerBlock("tuff_brick_stairs_mossy",
            new StairsBlock(TakieTerraRockBlocks.TUFF_BRICKS_MOSSY.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.IRON_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TUFF_COBBLE = registerBlock("tuff_cobble",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.IRON_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.TUFF)));
    public static final Block TUFF_COBBLE_WALL = registerBlock("tuff_cobble_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.IRON_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TUFF_COBBLE_SLAB = registerBlock("tuff_cobble_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.IRON_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TUFF_COBBLE_STAIRS = registerBlock("tuff_cobble_stairs",
            new StairsBlock(TakieTerraRockBlocks.TUFF_COBBLE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.IRON_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TUFF_COBBLE_MOSSY = registerBlock("tuff_cobble_mossy",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.IRON_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.TUFF)));
    public static final Block TUFF_COBBLE_WALL_MOSSY = registerBlock("tuff_cobble_wall_mossy",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.IRON_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TUFF_COBBLE_SLAB_MOSSY = registerBlock("tuff_cobble_slab_mossy",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.IRON_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TUFF_COBBLE_STAIRS_MOSSY = registerBlock("tuff_cobble_stairs_mossy",
            new StairsBlock(TakieTerraRockBlocks.TUFF_COBBLE_MOSSY.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.IRON_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TUFF_FINGERBRICKS = registerBlock("tuff_fingerbricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.IRON_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.TUFF)));
    public static final Block TUFF_PARQUET = registerBlock("tuff_parquet",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.IRON_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.TUFF)));
    public static final Block TUFF_TILES = registerBlock("tuff_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.IRON_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.TUFF)));


    //BASALT

    public static final Block BASALT_BRICKS = registerBlock("basalt_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.TUFF)));
    public static final Block BASALT_BRICK_WALL = registerBlock("basalt_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BASALT_BRICK_SLAB = registerBlock("basalt_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BASALT_BRICK_STAIRS = registerBlock("basalt_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.TUFF_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BASALT_BRICKS_MOSSY = registerBlock("basalt_bricks_mossy",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.TUFF)));
    public static final Block BASALT_BRICK_WALL_MOSSY = registerBlock("basalt_brick_wall_mossy",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BASALT_BRICK_SLAB_MOSSY = registerBlock("basalt_brick_slab_mossy",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BASALT_BRICK_STAIRS_MOSSY = registerBlock("basalt_brick_stairs_mossy",
            new StairsBlock(TakieTerraRockBlocks.BASALT_BRICKS_MOSSY.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BASALT_COBBLE = registerBlock("basalt_cobble",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.TUFF)));
    public static final Block BASALT_COBBLE_WALL = registerBlock("basalt_cobble_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BASALT_COBBLE_SLAB = registerBlock("basalt_cobble_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BASALT_COBBLE_STAIRS = registerBlock("basalt_cobble_stairs",
            new StairsBlock(TakieTerraRockBlocks.BASALT_COBBLE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BASALT_COBBLE_MOSSY = registerBlock("basalt_cobble_mossy",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.TUFF)));
    public static final Block BASALT_COBBLE_WALL_MOSSY = registerBlock("basalt_cobble_wall_mossy",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BASALT_COBBLE_SLAB_MOSSY = registerBlock("basalt_cobble_slab_mossy",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BASALT_COBBLE_STAIRS_MOSSY = registerBlock("basalt_cobble_stairs_mossy",
            new StairsBlock(TakieTerraRockBlocks.BASALT_COBBLE_MOSSY.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block BASALT_FINGERBRICKS = registerBlock("basalt_fingerbricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.TUFF)));
    public static final Block BASALT_PARQUET = registerBlock("basalt_parquet",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.TUFF)));
    public static final Block BASALT_TILES = registerBlock("basalt_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.TUFF)));


    public static final Block DRIPSTONE_BRICKS = registerBlock("dripstone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_BRICK_WALL = registerBlock("dripstone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_BRICK_SLAB = registerBlock("dripstone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_BRICK_STAIRS = registerBlock("dripstone_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.DRIPSTONE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_BRICKS_MOSSY = registerBlock("dripstone_bricks_mossy",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_BRICK_WALL_MOSSY = registerBlock("dripstone_brick_wall_mossy",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_BRICK_SLAB_MOSSY = registerBlock("dripstone_brick_slab_mossy",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_BRICK_STAIRS_MOSSY = registerBlock("dripstone_brick_stairs_mossy",
            new StairsBlock(TakieTerraRockBlocks.DRIPSTONE_BRICKS_MOSSY.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_COBBLE = registerBlock("dripstone_cobble",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_COBBLE_WALL = registerBlock("dripstone_cobble_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_COBBLE_SLAB = registerBlock("dripstone_cobble_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_COBBLE_STAIRS = registerBlock("dripstone_cobble_stairs",
            new StairsBlock(TakieTerraRockBlocks.DRIPSTONE_COBBLE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_COBBLE_MOSSY = registerBlock("dripstone_cobble_mossy",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_COBBLE_WALL_MOSSY = registerBlock("dripstone_cobble_wall_mossy",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_COBBLE_SLAB_MOSSY = registerBlock("dripstone_cobble_slab_mossy",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_COBBLE_STAIRS_MOSSY = registerBlock("dripstone_cobble_stairs_mossy",
            new StairsBlock(TakieTerraRockBlocks.DRIPSTONE_COBBLE_MOSSY.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_FINGERBRICKS = registerBlock("dripstone_fingerbricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_PARQUET = registerBlock("dripstone_parquet",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));
    public static final Block DRIPSTONE_TILES = registerBlock("dripstone_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.DRIPSTONE_BLOCK)));


    public static final Block SNOW_QUARTZ_WALL = registerBlock("snow_quartz_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SNOW_QUARTZ_SLAB = registerBlock("snow_quartz_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SNOW_QUARTZ_STAIRS = registerBlock("snow_quartz_stairs",
            new StairsBlock(TakieTerraRockBlocks.SNOW_QUARTZ.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SNOW_QUARTZ_BRICKS = registerBlock("snow_quartz_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SNOW_QUARTZ_TILES = registerBlock("snow_quartz_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SNOW_QUARTZ_BRICK_WALL = registerBlock("snow_quartz_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SNOW_QUARTZ_BRICK_SLAB = registerBlock("snow_quartz_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SNOW_QUARTZ_BRICK_STAIRS = registerBlock("snow_quartz_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.SNOW_QUARTZ_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SNOW_QUARTZ_COBBLE = registerBlock("snow_quartz_cobble",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SNOW_QUARTZ_COBBLE_WALL = registerBlock("snow_quartz_cobble_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SNOW_QUARTZ_COBBLE_SLAB = registerBlock("snow_quartz_cobble_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SNOW_QUARTZ_COBBLE_STAIRS = registerBlock("snow_quartz_cobble_stairs",
            new StairsBlock(TakieTerraRockBlocks.SNOW_QUARTZ_COBBLE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block SOAPSTONE_WALL = registerBlock("soapstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SOAPSTONE_SLAB = registerBlock("soapstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SOAPSTONE_STAIRS = registerBlock("soapstone_stairs",
            new StairsBlock(TakieTerraRockBlocks.SOAPSTONE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SOAPSTONE_BRICKS = registerBlock("soapstone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SOAPSTONE_TILES = registerBlock("soapstone_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SOAPSTONE_BRICK_WALL = registerBlock("soapstone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SOAPSTONE_BRICK_SLAB = registerBlock("soapstone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SOAPSTONE_BRICK_STAIRS = registerBlock("soapstone_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.SOAPSTONE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SOAPSTONE_COBBLE = registerBlock("soapstone_cobble",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SOAPSTONE_COBBLE_WALL = registerBlock("soapstone_cobble_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SOAPSTONE_COBBLE_SLAB = registerBlock("soapstone_cobble_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SOAPSTONE_COBBLE_STAIRS = registerBlock("soapstone_cobble_stairs",
            new StairsBlock(TakieTerraRockBlocks.SOAPSTONE_COBBLE.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.LIGHT_BLUE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block CARMELTAZITE_BLOCK = registerBlock("carmeltazite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CARMELTAZITE_WALL = registerBlock("carmeltazite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CARMELTAZITE_SLAB = registerBlock("carmeltazite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CARMELTAZITE_STAIRS = registerBlock("carmeltazite_stairs",
            new StairsBlock(TakieTerraRockBlocks.CARMELTAZITE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CARMELTAZITE_BRICKS = registerBlock("carmeltazite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CARMELTAZITE_BRICK_WALL = registerBlock("carmeltazite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CARMELTAZITE_BRICK_SLAB = registerBlock("carmeltazite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CARMELTAZITE_BRICK_STAIRS = registerBlock("carmeltazite_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.CARMELTAZITE_BRICKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CARMELTAZITE_ORE = registerBlock("carmeltazite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.LAPIS_ORE).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_CARMELTAZITE_ORE = registerBlock("deepslate_carmeltazite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_LAPIS_ORE).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block FLUORITE_BLOCK = registerBlock("fluorite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).mapColor(MapColor.BRIGHT_TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block FLUORITE_SLAB = registerBlock("fluorite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.BRIGHT_TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block FLUORITE_STAIRS = registerBlock("fluorite_stairs",
            new StairsBlock(TakieTerraRockBlocks.FLUORITE_BLOCK.getDefaultState(),
                    (FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS).mapColor(MapColor.BRIGHT_TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE))));
    public static final Block FLUORITE_WALL = registerBlock("fluorite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.BRIGHT_TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block FLUORITE_ORE = registerBlock("fluorite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.LAPIS_ORE).mapColor(MapColor.BRIGHT_TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_FLUORITE_ORE = registerBlock("deepslate_fluorite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_LAPIS_ORE).mapColor(MapColor.BRIGHT_TEAL).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block FLUORITE_BRICKS = registerBlock("fluorite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.BRIGHT_TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block FLUORITE_BRICK_SLAB = registerBlock("fluorite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.BRIGHT_TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block FLUORITE_BRICK_STAIRS = registerBlock("fluorite_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.FLUORITE_BRICKS.getDefaultState(),
                    (FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS).mapColor(MapColor.BRIGHT_TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE))));
    public static final Block FLUORITE_BRICK_WALL = registerBlock("fluorite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.BRIGHT_TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block TOURMALINE_BLOCK = registerBlock("tourmaline_block",
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TOURMALINE_SLAB = registerBlock("tourmaline_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TOURMALINE_STAIRS = registerBlock("tourmaline_stairs",
            new StairsBlock(TakieTerraRockBlocks.TOURMALINE_BLOCK.getDefaultState(),
                    (FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE))));
    public static final Block TOURMALINE_WALL = registerBlock("tourmaline_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TOURMALINE_ORE = registerBlock("tourmaline_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.LAPIS_ORE).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_TOURMALINE_ORE = registerBlock("deepslate_tourmaline_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_LAPIS_ORE).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block TOURMALINE_BRICKS = registerBlock("tourmaline_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TOURMALINE_BRICK_SLAB = registerBlock("tourmaline_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block TOURMALINE_BRICK_STAIRS = registerBlock("tourmaline_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.TOURMALINE_BRICKS.getDefaultState(),
                    (FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE))));
    public static final Block TOURMALINE_BRICK_WALL = registerBlock("tourmaline_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DULL_PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block CUPRITE_BLOCK = registerBlock("cuprite_block",
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).mapColor(MapColor.IRON_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block CUPRITE_ORE = registerBlock("cuprite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.LAPIS_ORE).mapColor(MapColor.IRON_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_CUPRITE_ORE = registerBlock("deepslate_cuprite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_LAPIS_ORE).mapColor(MapColor.IRON_GRAY).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block CUPRITE_BRICKS = registerBlock("cuprite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.IRON_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block CUPRITE_BRICK_SLAB = registerBlock("cuprite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.IRON_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block CUPRITE_BRICK_STAIRS = registerBlock("cuprite_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.CUPRITE_BRICKS.getDefaultState(),
                    (FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS).mapColor(MapColor.IRON_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.METAL))));
    public static final Block CUPRITE_BRICK_WALL = registerBlock("cuprite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.IRON_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.METAL)));
    public static final Block POLISHED_CUPRITE = registerBlock("polished_cuprite",
            new Block(FabricBlockSettings.copyOf(Blocks.LAPIS_BLOCK).mapColor(MapColor.IRON_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.METAL)));


    public static final Block RIDGESTONE = registerBlock("ridgestone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RIDGESTONE_BRICKS = registerBlock("ridgestone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RIDGESTONE_BRICK_SLAB = registerBlock("ridgestone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RIDGESTONE_BRICK_STAIRS = registerBlock("ridgestone_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.RIDGESTONE_BRICKS.getDefaultState(),
                    (FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE))));
    public static final Block RIDGESTONE_BRICK_WALL = registerBlock("ridgestone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RIDGESTONE_COBBLE = registerBlock("ridgestone_cobble",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RIDGESTONE_COBBLE_SLAB = registerBlock("ridgestone_cobble_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block RIDGESTONE_COBBLE_STAIRS = registerBlock("ridgestone_cobble_stairs",
            new StairsBlock(TakieTerraRockBlocks.RIDGESTONE_COBBLE.getDefaultState(),
                    (FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE))));
    public static final Block RIDGESTONE_COBBLE_WALL = registerBlock("ridgestone_cobble_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CHISELED_RIDGESTONE = registerBlock("chiseled_ridgestone",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CHISELED_RIDGESTONE_BRICKS = registerBlock("chiseled_ridgestone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_STONE_BRICKS).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_RIDGESTONE = registerBlock("polished_ridgestone",
            new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block GRAYWACKE = registerBlock("graywacke",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GRAYWACKE_SLAB = registerBlock("graywacke_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GRAYWACKE_STAIRS = registerBlock("graywacke_stairs",
            new StairsBlock(TakieTerraRockBlocks.GRAYWACKE.getDefaultState(),
                    (FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE))));
    public static final Block GRAYWACKE_WALL = registerBlock("graywacke_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GRAYWACKE_BRICKS = registerBlock("graywacke_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GRAYWACKE_BRICK_SLAB = registerBlock("graywacke_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block GRAYWACKE_BRICK_STAIRS = registerBlock("graywacke_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.GRAYWACKE_BRICKS.getDefaultState(),
                    (FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE))));
    public static final Block GRAYWACKE_BRICK_WALL = registerBlock("graywacke_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_GRAYWACKE = registerBlock("polished_graywacke",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block HIGHLAND_STONE = registerBlock("highland_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block HIGHLAND_STONE_SLAB = registerBlock("highland_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block HIGHLAND_STONE_STAIRS = registerBlock("highland_stone_stairs",
            new StairsBlock(TakieTerraRockBlocks.HIGHLAND_STONE.getDefaultState(),
                    (FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE))));
    public static final Block HIGHLAND_STONE_WALL = registerBlock("highland_stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block HIGHLAND_BRICKS = registerBlock("highland_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block HIGHLAND_BRICK_SLAB = registerBlock("highland_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block HIGHLAND_BRICK_STAIRS = registerBlock("highland_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.HIGHLAND_BRICKS.getDefaultState(),
                    (FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE))));
    public static final Block HIGHLAND_BRICK_WALL = registerBlock("highland_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CHUNKY_HIGHLAND_BRICKS = registerBlock("chunky_highland_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CHUNKY_HIGHLAND_BRICK_SLAB = registerBlock("chunky_highland_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block CHUNKY_HIGHLAND_BRICK_STAIRS = registerBlock("chunky_highland_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.CHUNKY_HIGHLAND_BRICKS.getDefaultState(),
                    (FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE))));
    public static final Block CHUNKY_HIGHLAND_BRICK_WALL = registerBlock("chunky_highland_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_HIGHLAND_STONE = registerBlock("polished_highland_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_STONE).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block HIGHLAND_COBBLE = registerBlock("highland_cobble",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block HIGHLAND_COBBLE_SLAB = registerBlock("highland_cobble_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block HIGHLAND_COBBLE_STAIRS = registerBlock("highland_cobble_stairs",
            new StairsBlock(TakieTerraRockBlocks.HIGHLAND_BRICKS.getDefaultState(),
                    (FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE))));
    public static final Block HIGHLAND_COBBLE_WALL = registerBlock("highland_cobble_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DIRT_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block MUDSTONE = registerBlock("mudstone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MUDSTONE_SLAB = registerBlock("mudstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block MUDSTONE_STAIRS = registerBlock("mudstone_stairs",
            new StairsBlock(TakieTerraRockBlocks.MUDSTONE.getDefaultState(),
                    (FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE))));
    public static final Block MUDSTONE_WALL = registerBlock("mudstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block PEACOCK_STONE_BLOCK = registerBlock("peacock_stone_block",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PEACOCK_STONE_ORE = registerBlock("peacock_stone_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.LAPIS_ORE).mapColor(MapColor.TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DEEPSLATE_PEACOCK_STONE_ORE = registerBlock("deepslate_peacock_stone_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_LAPIS_ORE).mapColor(MapColor.TEAL).instrument(Instrument.BIT).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block PEACOCK_SLAB = registerBlock("peacock_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PEACOCK_STAIRS = registerBlock("peacock_stairs",
            new StairsBlock(TakieTerraRockBlocks.PEACOCK_STONE_BLOCK.getDefaultState(),
                    (FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS).mapColor(MapColor.TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE))));
    public static final Block PEACOCK_WALL = registerBlock("peacock_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PEACOCK_BRICKS = registerBlock("peacock_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).mapColor(MapColor.TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PEACOCK_BRICK_SLAB = registerBlock("peacock_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PEACOCK_BRICK_STAIRS = registerBlock("peacock_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.PEACOCK_BRICKS.getDefaultState(),
                    (FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS).mapColor(MapColor.TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE))));
    public static final Block PEACOCK_BRICK_WALL = registerBlock("peacock_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TEAL).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block PERIDOTITE = registerBlock("peridotite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PERIDOTITE_SLAB = registerBlock("peridotite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block PERIDOTITE_STAIRS = registerBlock("peridotite_stairs",
            new StairsBlock(TakieTerraRockBlocks.PERIDOTITE.getDefaultState(),
                    (FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE))));
    public static final Block PERIDOTITE_WALL = registerBlock("peridotite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.DARK_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_COOL_GRANITE = registerBlock("polished_cool_granite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_COOL_GRANITE_SLAB = registerBlock("polished_cool_granite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_COOL_GRANITE_STAIRS = registerBlock("polished_cool_granite_stairs",
            new StairsBlock(TakieTerraRockBlocks.POLISHED_COOL_GRANITE.getDefaultState(),
                    (FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE))));
    public static final Block POLISHED_COOL_GRANITE_WALL = registerBlock("polished_cool_granite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.STONE_GRAY).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_WARM_GRANITE = registerBlock("polished_warm_granite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_WARM_GRANITE_SLAB = registerBlock("polished_warm_granite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_WARM_GRANITE_STAIRS = registerBlock("polished_warm_granite_stairs",
            new StairsBlock(TakieTerraRockBlocks.POLISHED_WARM_GRANITE.getDefaultState(),
                    (FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE))));
    public static final Block POLISHED_WARM_GRANITE_WALL = registerBlock("polished_warm_granite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_PEGMATITE = registerBlock("polished_pegmatite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.PALE_YELLOW).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block QUARTZITE = registerBlock("quartzite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block QUARTZITE_SLAB = registerBlock("quartzite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block QUARTZITE_STAIRS = registerBlock("quartzite_stairs",
            new StairsBlock(TakieTerraRockBlocks.QUARTZITE.getDefaultState(),
                    (FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE))));
    public static final Block QUARTZITE_WALL = registerBlock("quartzite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block QUARTZITE_BRICKS = registerBlock("quartzite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_QUARTZITE = registerBlock("polished_quartzite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.PINK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block QUARTZITE_BRICK_SLAB = registerBlock("quartzite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block QUARTZITE_BRICK_STAIRS = registerBlock("quartzite_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.QUARTZITE_BRICKS.getDefaultState(),
                    (FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE))));
    public static final Block QUARTZITE_BRICK_WALL = registerBlock("quartzite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_ORANGE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block VIRIDITE = registerBlock("viridite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_VIRIDITE = registerBlock("polished_viridite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block VIRIDITE_SLAB = registerBlock("viridite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block VIRIDITE_STAIRS = registerBlock("viridite_stairs",
            new StairsBlock(TakieTerraRockBlocks.VIRIDITE.getDefaultState(),
                    (FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE))));
    public static final Block VIRIDITE_WALL = registerBlock("viridite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_GREEN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block SATINSTONE = registerBlock("satinstone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.SPRUCE_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SATINSTONE_SLAB = registerBlock("satinstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.SPRUCE_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block SATINSTONE_STAIRS = registerBlock("satinstone_stairs",
            new StairsBlock(TakieTerraRockBlocks.SATINSTONE.getDefaultState(),
                    (FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS).mapColor(MapColor.SPRUCE_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE))));
    public static final Block SATINSTONE_WALL = registerBlock("satinstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.SPRUCE_BROWN).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block DIABASE = registerBlock("diabase",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DIABASE_SLAB = registerBlock("diabase_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DIABASE_STAIRS = registerBlock("diabase_stairs",
            new StairsBlock(TakieTerraRockBlocks.DIABASE.getDefaultState(),
                    (FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE))));
    public static final Block DIABASE_WALL = registerBlock("diabase_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DIABASE_BRICKS = registerBlock("diabase_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DIABASE_BRICK_SLAB = registerBlock("diabase_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block DIABASE_BRICK_STAIRS = registerBlock("diabase_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.DIABASE_BRICKS.getDefaultState(),
                    (FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE))));
    public static final Block DIABASE_BRICK_WALL = registerBlock("diabase_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_DIABASE = registerBlock("polished_diabase",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block IRIDOLITE = registerBlock("iridolite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block IRIDOLITE_SLAB = registerBlock("iridolite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block IRIDOLITE_STAIRS = registerBlock("iridolite_stairs",
            new StairsBlock(TakieTerraRockBlocks.IRIDOLITE.getDefaultState(),
                    (FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE))));
    public static final Block IRIDOLITE_WALL = registerBlock("iridolite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block IRIDOLITE_BRICKS = registerBlock("iridolite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block IRIDOLITE_BRICK_SLAB = registerBlock("iridolite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block IRIDOLITE_BRICK_STAIRS = registerBlock("iridolite_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.IRIDOLITE_BRICKS.getDefaultState(),
                    (FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE))));
    public static final Block IRIDOLITE_BRICK_WALL = registerBlock("iridolite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_IRIDOLITE = registerBlock("polished_iridolite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block NITURITE = registerBlock("niturite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NITURITE_SLAB = registerBlock("niturite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NITURITE_STAIRS = registerBlock("niturite_stairs",
            new StairsBlock(TakieTerraRockBlocks.NITURITE.getDefaultState(),
                    (FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE))));
    public static final Block NITURITE_WALL = registerBlock("niturite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NITURITE_BRICKS = registerBlock("niturite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NITURITE_BRICK_SLAB = registerBlock("niturite_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block NITURITE_BRICK_STAIRS = registerBlock("niturite_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.DIABASE.getDefaultState(),
                    (FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE))));
    public static final Block NITURITE_BRICK_WALL = registerBlock("niturite_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block POLISHED_NITURITE = registerBlock("polished_niturite",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.OFF_WHITE).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block ONYX = registerBlock("onyx",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ONYX_SLAB = registerBlock("onyx_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ONYX_STAIRS = registerBlock("onyx_stairs",
            new StairsBlock(TakieTerraRockBlocks.ONYX.getDefaultState(),
                    (FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE))));
    public static final Block ONYX_WALL = registerBlock("onyx_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block ONYX_COBBLED = registerBlock("onyx_cobbled",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ONYX_SLAB_COBBLED = registerBlock("onyx_slab_cobbled",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ONYX_STAIRS_COBBLED = registerBlock("onyx_stairs_cobbled",
            new StairsBlock(TakieTerraRockBlocks.ONYX_COBBLED.getDefaultState(),
                    (FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE))));
    public static final Block ONYX_WALL_COBBLED = registerBlock("onyx_wall_cobbled",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ONYX_SMOOTH = registerBlock("onyx_smooth",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block ONYX_SMOOTH_SLAB = registerBlock("onyx_smooth_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ONYX_SMOOTH_STAIRS = registerBlock("onyx_smooth_stairs",
            new StairsBlock(TakieTerraRockBlocks.ONYX.getDefaultState(),
                    (FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE))));
    public static final Block ONYX_SMOOTH_WALL = registerBlock("onyx_smooth_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ONYX_SMOOTH_COBBLED = registerBlock("onyx_smooth_cobbled",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));

    public static final Block ONYX_SLAB_SMOOTH_COBBLED = registerBlock("onyx_slab_smooth_cobbled",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ONYX_STAIRS_SMOOTH_COBBLED = registerBlock("onyx_stairs_smooth_cobbled",
            new StairsBlock(TakieTerraRockBlocks.ONYX_SMOOTH_COBBLED.getDefaultState(),
                    (FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE))));
    public static final Block ONYX_WALL_SMOOTH_COBBLED = registerBlock("onyx_wall_smooth_cobbled",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ONYX_POLISHED_BRICKS = registerBlock("onyx_polished_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ONYX_POLISHED_BRICK_SLAB = registerBlock("onyx_polished_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ONYX_POLISHED_BRICK_STAIRS = registerBlock("onyx_polished_brick_stairs",
            new StairsBlock(TakieTerraRockBlocks.ONYX_POLISHED_BRICKS.getDefaultState(),
                    (FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE))));
    public static final Block ONYX_POLISHED_BRICK_WALL = registerBlock("onyx_polished_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ONYX_POLISHED = registerBlock("onyx_polished",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ONYX_CHISELED = registerBlock("onyx_chiseled",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));
    public static final Block ONYX_SMOOTH_CHISELED = registerBlock("onyx_smooth_chiseled",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_BLACK).instrument(Instrument.BIT).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)));


    public static final Block WHITE_SAND = registerBlock("white_sand",
            new Block(FabricBlockSettings.copyOf(Blocks.SAND).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final Block WHITE_SANDSTONE = registerBlock("white_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final Block WHITE_SANDSTONE_WALL = registerBlock("white_sandstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_WALL).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final Block WHITE_SANDSTONE_SLAB = registerBlock("white_sandstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_SLAB).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final Block WHITE_SANDSTONE_STAIRS = registerBlock("white_sandstone_stairs",
            new StairsBlock(TakieTerraRockBlocks.WHITE_SANDSTONE.getDefaultState(),
                    (FabricBlockSettings.copyOf(Blocks.SANDSTONE_STAIRS).mapColor(MapColor.TERRACOTTA_WHITE))));
 public static final Block SMOOTH_WHITE_SANDSTONE = registerBlock("smooth_white_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_SANDSTONE).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final Block SMOOTH_WHITE_SANDSTONE_SLAB = registerBlock("smooth_white_sandstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_SANDSTONE_SLAB).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final Block SMOOTH_WHITE_SANDSTONE_STAIRS = registerBlock("smooth_white_sandstone_stairs",
            new StairsBlock(TakieTerraRockBlocks.SMOOTH_WHITE_SANDSTONE.getDefaultState(),
                    (FabricBlockSettings.copyOf(Blocks.SMOOTH_SANDSTONE_STAIRS).mapColor(MapColor.TERRACOTTA_WHITE))));
    public static final Block CHISELED_WHITE_SANDSTONE = registerBlock("chiseled_white_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_SANDSTONE).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final Block CUT_WHITE_SANDSTONE = registerBlock("cut_white_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.CUT_SANDSTONE).mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final Block CUT_WHITE_SANDSTONE_SLAB = registerBlock("cut_white_sandstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CUT_SANDSTONE_SLAB).mapColor(MapColor.TERRACOTTA_WHITE)));


    public static final Block BLACK_SAND = registerBlock("black_sand",
            new Block(FabricBlockSettings.copyOf(Blocks.SAND).mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block BLACK_SANDSTONE = registerBlock("black_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE).mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block BLACK_SANDSTONE_WALL = registerBlock("black_sandstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_WALL).mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block BLACK_SANDSTONE_SLAB = registerBlock("black_sandstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SANDSTONE_SLAB).mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block BLACK_SANDSTONE_STAIRS = registerBlock("black_sandstone_stairs",
            new StairsBlock(TakieTerraRockBlocks.BLACK_SANDSTONE.getDefaultState(),
                    (FabricBlockSettings.copyOf(Blocks.SANDSTONE_STAIRS).mapColor(MapColor.TERRACOTTA_BLACK))));
    public static final Block SMOOTH_BLACK_SANDSTONE = registerBlock("smooth_black_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.SMOOTH_SANDSTONE).mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block SMOOTH_BLACK_SANDSTONE_SLAB = registerBlock("smooth_black_sandstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_SANDSTONE_SLAB).mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block SMOOTH_BLACK_SANDSTONE_STAIRS = registerBlock("smooth_black_sandstone_stairs",
            new StairsBlock(TakieTerraRockBlocks.SMOOTH_BLACK_SANDSTONE.getDefaultState(),
                    (FabricBlockSettings.copyOf(Blocks.SMOOTH_SANDSTONE_STAIRS).mapColor(MapColor.TERRACOTTA_BLACK))));
    public static final Block CHISELED_BLACK_SANDSTONE = registerBlock("chiseled_black_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.CHISELED_SANDSTONE).mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block CUT_BLACK_SANDSTONE = registerBlock("cut_black_sandstone",
            new Block(FabricBlockSettings.copyOf(Blocks.CUT_SANDSTONE).mapColor(MapColor.TERRACOTTA_BLACK)));
    public static final Block CUT_BLACK_SANDSTONE_SLAB = registerBlock("cut_black_sandstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CUT_SANDSTONE_SLAB).mapColor(MapColor.TERRACOTTA_BLACK)));



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

    public static void registerTakieTerraRockBlocks() {
        TakieTerraMod.LOGGER.info("Registering ModBlocks for" + TakieTerraMod.MOD_ID);
    }
}
