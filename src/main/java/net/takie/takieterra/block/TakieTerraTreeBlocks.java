package net.takie.takieterra.block;

import com.terraformersmc.terraform.wood.block.SmallLogBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.takie.takieterra.TakieTerraMod;
import net.takie.takieterra.block.custom.*;
import net.takie.takieterra.util.TakieTerraWoodTypes;
import net.takie.takieterra.world.gen.tree.CedarSaplingGenerator;
import net.takie.takieterra.world.gen.tree.*;

public class TakieTerraTreeBlocks {


    //RED MAPLE
    public static final Block RED_MAPLE_LOG = registerBlock("red_maple_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block RED_MAPLE_WOOD = registerBlock("red_maple_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_RED_MAPLE_LOG = registerBlock("stripped_red_maple_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_RED_MAPLE_WOOD = registerBlock("stripped_red_maple_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block RED_MAPLE_PLANKS = registerBlock("red_maple_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block RED_MAPLE_LEAVES = registerBlock("red_maple_leaves",
            new RedMapleLeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block OCHRE_MAPLE_LEAVES = registerBlock("ochre_maple_leaves",
            new OchreMapleLeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block AMBER_MAPLE_LEAVES = registerBlock("amber_maple_leaves",
            new AmberMapleLeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));

    public static final Block RED_MAPLE_SAPLING = registerBlock("red_maple_sapling",
            new SaplingBlock(new RedMapleSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block OCHRE_MAPLE_SAPLING = registerBlock("ochre_maple_sapling",
            new SaplingBlock(new OchreMapleSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block AMBER_MAPLE_SAPLING = registerBlock("amber_maple_sapling",
            new SaplingBlock(new AmberMapleSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_RED_MAPLE_SAPLING = registerBlockWithoutBlockItem("potted_red_maple_sapling",
            new FlowerPotBlock(RED_MAPLE_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));
    public static final Block POTTED_OCHRE_MAPLE_SAPLING = registerBlockWithoutBlockItem("potted_ochre_maple_sapling",
            new FlowerPotBlock(OCHRE_MAPLE_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));
    public static final Block POTTED_AMBER_MAPLE_SAPLING = registerBlockWithoutBlockItem("potted_amber_maple_sapling",
            new FlowerPotBlock(AMBER_MAPLE_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));
    public static final Block RED_MAPLE_HIGH_SAPLING = registerBlockWithoutItem("red_maple_high_sapling",
            new SaplingBlock(new RedMapleSaplingHighGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block RED_MAPLE_MID_SAPLING = registerBlockWithoutItem("red_maple_mid_sapling",
            new SaplingBlock(new RedMapleSaplingMidGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block RED_MAPLE_LOW_SAPLING = registerBlockWithoutItem("red_maple_low_sapling",
            new SaplingBlock(new RedMapleSaplingLowGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block RED_MAPLE_STAIRS = registerBlock("red_maple_stairs",
            new StairsBlock(TakieTerraTreeBlocks.RED_MAPLE_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block RED_MAPLE_SLAB = registerBlock("red_maple_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block RED_MAPLE_BUTTON = registerBlock("red_maple_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block RED_MAPLE_PRESSURE_PLATE = registerBlock("red_maple_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block RED_MAPLE_FENCE = registerBlock("red_maple_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block RED_MAPLE_FENCE_GATE = registerBlock("red_maple_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));
    public static final Block RED_MAPLE_DOOR = registerBlock("red_maple_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block RED_MAPLE_TRAPDOOR = registerBlock("red_maple_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block RED_MAPLE_SIGN = registerBlockWithoutBlockItem("red_maple_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.RED_MAPLE));
    public static final Block RED_MAPLE_HANGING_SIGN = registerBlockWithoutBlockItem("red_maple_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.RED_MAPLE));
    public static final Block RED_MAPLE_WALL_SIGN = registerBlockWithoutBlockItem("red_maple_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(RED_MAPLE_SIGN), TakieTerraWoodTypes.RED_MAPLE));
    public static final Block RED_MAPLE_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("red_maple_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(RED_MAPLE_HANGING_SIGN), TakieTerraWoodTypes.RED_MAPLE));


    //JACARANDA

    public static final Block JACARANDA_LOG = registerBlock("jacaranda_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LOG)));
    public static final Block JACARANDA_WOOD = registerBlock("jacaranda_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_WOOD)));
    public static final Block STRIPPED_JACARANDA_LOG = registerBlock("stripped_jacaranda_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_LOG)));
    public static final Block STRIPPED_JACARANDA_WOOD = registerBlock("stripped_jacaranda_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_WOOD)));

    public static final Block JACARANDA_PLANKS = registerBlock("jacaranda_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));
    public static final Block JACARANDA_LEAVES = registerBlock("jacaranda_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LEAVES).mapColor(MapColor.PALE_PURPLE)));

    public static final Block JACARANDA_SAPLING = registerBlock("jacaranda_sapling",
            new SaplingBlock(new JacarandaSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.CHERRY_SAPLING)));
    public static final Block POTTED_JACARANDA_SAPLING = registerBlockWithoutBlockItem("potted_jacaranda_sapling",
            new FlowerPotBlock(JACARANDA_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_CHERRY_SAPLING)));

    public static final Block JACARANDA_STAIRS = registerBlock("jacaranda_stairs",
            new StairsBlock(TakieTerraTreeBlocks.JACARANDA_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CHERRY_STAIRS)));
    public static final Block JACARANDA_SLAB = registerBlock("jacaranda_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_SLAB)));
    public static final Block JACARANDA_BUTTON = registerBlock("jacaranda_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_BUTTON), BlockSetType.CHERRY, 10, true));
    public static final Block JACARANDA_PRESSURE_PLATE = registerBlock("jacaranda_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.CHERRY_PRESSURE_PLATE), BlockSetType.CHERRY));
    public static final Block JACARANDA_FENCE = registerBlock("jacaranda_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_FENCE)));
    public static final Block JACARANDA_FENCE_GATE = registerBlock("jacaranda_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_FENCE_GATE), WoodType.CHERRY));

    public static final Block JACARANDA_DOOR = registerBlock("jacaranda_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_DOOR), BlockSetType.CHERRY));
    public static final Block JACARANDA_TRAPDOOR = registerBlock("jacaranda_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_TRAPDOOR), BlockSetType.CHERRY));

    public static final Block JACARANDA_SIGN = registerBlockWithoutBlockItem("jacaranda_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_SIGN), TakieTerraWoodTypes.JACARANDA));
    public static final Block JACARANDA_HANGING_SIGN = registerBlockWithoutBlockItem("jacaranda_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_HANGING_SIGN), TakieTerraWoodTypes.JACARANDA));
    public static final Block JACARANDA_WALL_SIGN = registerBlockWithoutBlockItem("jacaranda_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_SIGN).dropsLike(JACARANDA_SIGN), TakieTerraWoodTypes.JACARANDA));
    public static final Block JACARANDA_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("jacaranda_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_WALL_HANGING_SIGN).dropsLike(JACARANDA_HANGING_SIGN), TakieTerraWoodTypes.JACARANDA));


    //LAPACHO

    public static final Block LAPACHO_LOG = registerBlock("lapacho_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LOG)));
    public static final Block LAPACHO_WOOD = registerBlock("lapacho_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_WOOD)));
    public static final Block STRIPPED_LAPACHO_LOG = registerBlock("stripped_lapacho_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_LOG)));
    public static final Block STRIPPED_LAPACHO_WOOD = registerBlock("stripped_lapacho_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_WOOD)));

    public static final Block LAPACHO_PLANKS = registerBlock("lapacho_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));
    public static final Block LAPACHO_LEAVES_YELLOW = registerBlock("lapacho_leaves_yellow",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LEAVES).mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block LAPACHO_LEAVES_PINK = registerBlock("lapacho_leaves_pink",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LEAVES).mapColor(MapColor.PINK)));

    public static final Block LAPACHO_SAPLING_YELLOW = registerBlock("lapacho_sapling_yellow",
            new SaplingBlock(new YellowLapachoSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.CHERRY_SAPLING)));
    public static final Block LAPACHO_SAPLING_PINK = registerBlock("lapacho_sapling_pink",
            new SaplingBlock(new PinkLapachoSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.CHERRY_SAPLING)));
    public static final Block POTTED_YELLOW_LAPACHO_SAPLING = registerBlockWithoutBlockItem("potted_yellow_lapacho_sapling",
            new FlowerPotBlock(LAPACHO_SAPLING_YELLOW, FabricBlockSettings.copyOf(Blocks.POTTED_CHERRY_SAPLING)));
    public static final Block POTTED_PINK_LAPACHO_SAPLING = registerBlockWithoutBlockItem("potted_pink_lapacho_sapling",
            new FlowerPotBlock(LAPACHO_SAPLING_PINK, FabricBlockSettings.copyOf(Blocks.POTTED_CHERRY_SAPLING)));

    public static final Block LAPACHO_STAIRS = registerBlock("lapacho_stairs",
            new StairsBlock(TakieTerraTreeBlocks.LAPACHO_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CHERRY_STAIRS)));
    public static final Block LAPACHO_SLAB = registerBlock("lapacho_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_SLAB)));
    public static final Block LAPACHO_BUTTON = registerBlock("lapacho_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_BUTTON), BlockSetType.CHERRY, 10, true));
    public static final Block LAPACHO_PRESSURE_PLATE = registerBlock("lapacho_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.CHERRY_PRESSURE_PLATE), BlockSetType.CHERRY));
    public static final Block LAPACHO_FENCE = registerBlock("lapacho_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_FENCE)));
    public static final Block LAPACHO_FENCE_GATE = registerBlock("lapacho_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_FENCE_GATE), WoodType.CHERRY));

    public static final Block LAPACHO_DOOR = registerBlock("lapacho_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_DOOR), BlockSetType.CHERRY));
    public static final Block LAPACHO_TRAPDOOR = registerBlock("lapacho_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_TRAPDOOR), BlockSetType.CHERRY));

    public static final Block LAPACHO_SIGN = registerBlockWithoutBlockItem("lapacho_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_SIGN), TakieTerraWoodTypes.LAPACHO));
    public static final Block LAPACHO_HANGING_SIGN = registerBlockWithoutBlockItem("lapacho_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_HANGING_SIGN), TakieTerraWoodTypes.LAPACHO));
    public static final Block LAPACHO_WALL_SIGN = registerBlockWithoutBlockItem("lapacho_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_WALL_SIGN).dropsLike(LAPACHO_SIGN), TakieTerraWoodTypes.LAPACHO));
    public static final Block LAPACHO_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("lapacho_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_WALL_HANGING_SIGN).dropsLike(LAPACHO_HANGING_SIGN), TakieTerraWoodTypes.LAPACHO));


    //MANGO
    public static final Block MANGO_LOG = registerBlock("mango_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block MANGO_WOOD = registerBlock("mango_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_MANGO_LOG = registerBlock("stripped_mango_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_MANGO_WOOD = registerBlock("stripped_mango_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block MANGO_PLANKS = registerBlock("mango_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block MANGO_LEAVES = registerBlock("mango_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));

    public static final Block MANGO_SAPLING = registerBlock("mango_sapling",
            new SaplingBlock(new MangoSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_MANGO_SAPLING = registerBlockWithoutBlockItem("potted_mango_sapling",
            new FlowerPotBlock(MANGO_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));

    public static final Block MANGO_STAIRS = registerBlock("mango_stairs",
            new StairsBlock(TakieTerraTreeBlocks.MANGO_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block MANGO_SLAB = registerBlock("mango_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block MANGO_BUTTON = registerBlock("mango_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block MANGO_PRESSURE_PLATE = registerBlock("mango_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block MANGO_FENCE = registerBlock("mango_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block MANGO_FENCE_GATE = registerBlock("mango_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block MANGO_DOOR = registerBlock("mango_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block MANGO_TRAPDOOR = registerBlock("mango_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block MANGO_SIGN = registerBlockWithoutBlockItem("mango_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.MANGO));
    public static final Block MANGO_HANGING_SIGN = registerBlockWithoutBlockItem("mango_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.MANGO));
    public static final Block MANGO_WALL_SIGN = registerBlockWithoutBlockItem("mango_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(MANGO_SIGN), TakieTerraWoodTypes.MANGO));
    public static final Block MANGO_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("mango_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(MANGO_HANGING_SIGN), TakieTerraWoodTypes.MANGO));

    //AUTUMN_ASPEN
    public static final Block AUTUMN_ASPEN_LOG = registerBlock("autumn_aspen_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block AUTUMN_ASPEN_WOOD = registerBlock("autumn_aspen_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_AUTUMN_ASPEN_LOG = registerBlock("stripped_autumn_aspen_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_AUTUMN_ASPEN_WOOD = registerBlock("stripped_autumn_aspen_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block AUTUMN_ASPEN_PLANKS = registerBlock("autumn_aspen_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block AUTUMN_ASPEN_LEAVES = registerBlock("autumn_aspen_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block AUTUMN_ASPEN_LEAVES_FLAMING = registerBlock("autumn_aspen_leaves_flaming",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block AUTUMN_ASPEN_LEAVES_OCHRE = registerBlock("autumn_aspen_leaves_ochre",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block AUTUMN_ASPEN_LEAVES_CHESTNUT = registerBlock("autumn_aspen_leaves_chestnut",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));

    public static final Block AUTUMN_ASPEN_SAPLING = registerBlock("autumn_aspen_sapling",
            new SaplingBlock(new AutumnAspenSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block AUTUMN_ASPEN_SAPLING_FLAMING = registerBlock("autumn_aspen_sapling_flaming",
            new SaplingBlock(new FlamingAutumnAspenSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block AUTUMN_ASPEN_SAPLING_OCHRE = registerBlock("autumn_aspen_sapling_ochre",
            new SaplingBlock(new OchreAutumnAspenSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block AUTUMN_ASPEN_SAPLING_CHESTNUT = registerBlock("autumn_aspen_sapling_chestnut",
            new SaplingBlock(new ChestnutAutumnAspenSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_AUTUMN_ASPEN_SAPLING = registerBlockWithoutBlockItem("potted_autumn_aspen_sapling",
            new FlowerPotBlock(AUTUMN_ASPEN_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));
    public static final Block POTTED_AUTUMN_ASPEN_SAPLING_FLAMING = registerBlockWithoutBlockItem("potted_autumn_aspen_sapling_flaming",
            new FlowerPotBlock(AUTUMN_ASPEN_SAPLING_FLAMING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));
    public static final Block POTTED_AUTUMN_ASPEN_SAPLING_OCHRE = registerBlockWithoutBlockItem("potted_autumn_aspen_sapling_ochre",
            new FlowerPotBlock(AUTUMN_ASPEN_SAPLING_OCHRE, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));
    public static final Block POTTED_AUTUMN_ASPEN_SAPLING_CHESTNUT = registerBlockWithoutBlockItem("potted_autumn_aspen_sapling_chestnut",
            new FlowerPotBlock(AUTUMN_ASPEN_SAPLING_CHESTNUT, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));

    public static final Block AUTUMN_ASPEN_STAIRS = registerBlock("autumn_aspen_stairs",
            new StairsBlock(TakieTerraTreeBlocks.AUTUMN_ASPEN_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block AUTUMN_ASPEN_SLAB = registerBlock("autumn_aspen_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block AUTUMN_ASPEN_BUTTON = registerBlock("autumn_aspen_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block AUTUMN_ASPEN_PRESSURE_PLATE = registerBlock("autumn_aspen_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block AUTUMN_ASPEN_FENCE = registerBlock("autumn_aspen_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block AUTUMN_ASPEN_FENCE_GATE = registerBlock("autumn_aspen_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block AUTUMN_ASPEN_DOOR = registerBlock("autumn_aspen_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block AUTUMN_ASPEN_TRAPDOOR = registerBlock("autumn_aspen_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block AUTUMN_ASPEN_SIGN = registerBlockWithoutBlockItem("autumn_aspen_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.AUTUMN_ASPEN));
    public static final Block AUTUMN_ASPEN_HANGING_SIGN = registerBlockWithoutBlockItem("autumn_aspen_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.AUTUMN_ASPEN));
    public static final Block AUTUMN_ASPEN_WALL_SIGN = registerBlockWithoutBlockItem("autumn_aspen_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(AUTUMN_ASPEN_SIGN), TakieTerraWoodTypes.AUTUMN_ASPEN));
    public static final Block AUTUMN_ASPEN_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("autumn_aspen_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(AUTUMN_ASPEN_HANGING_SIGN), TakieTerraWoodTypes.AUTUMN_ASPEN));


    //WILLOW
    public static final Block WILLOW_LOG = registerBlock("willow_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block WILLOW_WOOD = registerBlock("willow_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_WILLOW_LOG = registerBlock("stripped_willow_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_WILLOW_WOOD = registerBlock("stripped_willow_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block WILLOW_PLANKS = registerBlock("willow_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WILLOW_LEAVES = registerBlock("willow_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));

    public static final Block WILLOW_SAPLING = registerBlock("willow_sapling",
            new SaplingBlock(new WillowSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_WILLOW_SAPLING = registerBlockWithoutBlockItem("potted_willow_sapling",
            new FlowerPotBlock(WILLOW_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));

    public static final Block WILLOW_STAIRS = registerBlock("willow_stairs",
            new StairsBlock(TakieTerraTreeBlocks.WILLOW_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block WILLOW_SLAB = registerBlock("willow_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block WILLOW_BUTTON = registerBlock("willow_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block WILLOW_PRESSURE_PLATE = registerBlock("willow_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block WILLOW_FENCE = registerBlock("willow_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block WILLOW_FENCE_GATE = registerBlock("willow_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block WILLOW_DOOR = registerBlock("willow_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block WILLOW_TRAPDOOR = registerBlock("willow_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block WILLOW_SIGN = registerBlockWithoutBlockItem("willow_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.WILLOW));
    public static final Block WILLOW_HANGING_SIGN = registerBlockWithoutBlockItem("willow_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.WILLOW));
    public static final Block WILLOW_WALL_SIGN = registerBlockWithoutBlockItem("willow_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(WILLOW_SIGN), TakieTerraWoodTypes.WILLOW));
    public static final Block WILLOW_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("willow_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(WILLOW_HANGING_SIGN), TakieTerraWoodTypes.WILLOW));


    //WALNUT

    public static final Block WALNUT_LOG = registerBlock("walnut_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block WALNUT_WOOD = registerBlock("walnut_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_WALNUT_LOG = registerBlock("stripped_walnut_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_WALNUT_WOOD = registerBlock("stripped_walnut_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block WALNUT_PLANKS = registerBlock("walnut_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WALNUT_LEAVES = registerBlock("walnut_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));

    public static final Block WALNUT_SAPLING = registerBlock("walnut_sapling",
            new SaplingBlock(new WalnutSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_WALNUT_SAPLING = registerBlockWithoutBlockItem("potted_walnut_sapling",
            new FlowerPotBlock(WALNUT_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));

    public static final Block WALNUT_STAIRS = registerBlock("walnut_stairs",
            new StairsBlock(TakieTerraTreeBlocks.WALNUT_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block WALNUT_SLAB = registerBlock("walnut_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block WALNUT_BUTTON = registerBlock("walnut_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block WALNUT_PRESSURE_PLATE = registerBlock("walnut_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block WALNUT_FENCE = registerBlock("walnut_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block WALNUT_FENCE_GATE = registerBlock("walnut_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), TakieTerraWoodTypes.WALNUT));

    public static final Block WALNUT_DOOR = registerBlock("walnut_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block WALNUT_TRAPDOOR = registerBlock("walnut_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block WALNUT_SIGN = registerBlockWithoutBlockItem("walnut_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.WALNUT));
    public static final Block WALNUT_HANGING_SIGN = registerBlockWithoutBlockItem("walnut_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.WALNUT));
    public static final Block WALNUT_WALL_SIGN = registerBlockWithoutBlockItem("walnut_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(WALNUT_SIGN), TakieTerraWoodTypes.WALNUT));
    public static final Block WALNUT_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("walnut_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(WALNUT_HANGING_SIGN), TakieTerraWoodTypes.WALNUT));


    //PINE

    public static final Block PINE_LOG = registerBlock("pine_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block PINE_WOOD = registerBlock("pine_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_PINE_LOG = registerBlock("stripped_pine_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_PINE_WOOD = registerBlock("stripped_pine_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block PINE_PLANKS = registerBlock("pine_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PINE_LEAVES = registerBlock("pine_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));

    public static final Block PINE_SAPLING = registerBlock("pine_sapling",
            new SaplingBlock(new PineSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_PINE_SAPLING = registerBlockWithoutBlockItem("potted_pine_sapling",
            new FlowerPotBlock(PINE_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));

    public static final Block PINE_STAIRS = registerBlock("pine_stairs",
            new StairsBlock(TakieTerraTreeBlocks.PINE_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block PINE_SLAB = registerBlock("pine_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block PINE_BUTTON = registerBlock("pine_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block PINE_PRESSURE_PLATE = registerBlock("pine_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block PINE_FENCE = registerBlock("pine_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block PINE_FENCE_GATE = registerBlock("pine_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), TakieTerraWoodTypes.PINE));

    public static final Block PINE_DOOR = registerBlock("pine_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block PINE_TRAPDOOR = registerBlock("pine_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block PINE_SIGN = registerBlockWithoutBlockItem("pine_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.PINE));
    public static final Block PINE_HANGING_SIGN = registerBlockWithoutBlockItem("pine_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.PINE));
    public static final Block PINE_WALL_SIGN = registerBlockWithoutBlockItem("pine_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(PINE_SIGN), TakieTerraWoodTypes.PINE));
    public static final Block PINE_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("pine_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(PINE_HANGING_SIGN), TakieTerraWoodTypes.PINE));


    //TWILIGHT PLUM
    public static final Block PLUM_LOG = registerBlock("plum_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LOG)));
    public static final Block PLUM_WOOD = registerBlock("plum_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_WOOD)));
    public static final Block STRIPPED_PLUM_LOG = registerBlock("stripped_plum_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_LOG)));
    public static final Block STRIPPED_PLUM_WOOD = registerBlock("stripped_plum_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_WOOD)));

    public static final Block PLUM_PLANKS = registerBlock("plum_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));
    public static final Block PLUM_LEAVES = registerBlock("plum_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block FLOWERING_PLUM_LEAVES = registerBlock("flowering_plum_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LEAVES)));

    public static final Block PLUM_SAPLING = registerBlock("plum_sapling",
            new SaplingBlock(new PlumSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.CHERRY_SAPLING)));
    public static final Block PLUM_BLOSSOM_SAPLING = registerBlock("plum_blossom_sapling",
            new SaplingBlock(new PlumBlossomSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.CHERRY_SAPLING)));
    public static final Block POTTED_PLUM_SAPLING = registerBlockWithoutBlockItem("potted_plum_sapling",
            new FlowerPotBlock(PLUM_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_CHERRY_SAPLING)));
    public static final Block POTTED_PLUM_BLOSSOM_SAPLING = registerBlockWithoutBlockItem("potted_plum_blossom_sapling",
            new FlowerPotBlock(PLUM_BLOSSOM_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_CHERRY_SAPLING)));

    public static final Block PLUM_STAIRS = registerBlock("plum_stairs",
            new StairsBlock(TakieTerraTreeBlocks.PLUM_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CHERRY_STAIRS)));
    public static final Block PLUM_SLAB = registerBlock("plum_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_SLAB)));
    public static final Block PLUM_BUTTON = registerBlock("plum_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block PLUM_PRESSURE_PLATE = registerBlock("plum_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.CHERRY_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block PLUM_FENCE = registerBlock("plum_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block PLUM_FENCE_GATE = registerBlock("plum_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block PLUM_DOOR = registerBlock("plum_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block PLUM_TRAPDOOR = registerBlock("plum_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_TRAPDOOR), BlockSetType.OAK));

    public static final Block PLUM_SIGN = registerBlockWithoutBlockItem("plum_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_SIGN), TakieTerraWoodTypes.PLUM));
    public static final Block PLUM_HANGING_SIGN = registerBlockWithoutBlockItem("plum_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_HANGING_SIGN), TakieTerraWoodTypes.PLUM));
    public static final Block PLUM_WALL_SIGN = registerBlockWithoutBlockItem("plum_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(PLUM_SIGN), TakieTerraWoodTypes.PLUM));
    public static final Block PLUM_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("plum_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_WALL_HANGING_SIGN).dropsLike(PLUM_HANGING_SIGN), TakieTerraWoodTypes.PLUM));

    //SUNDROP PEACH
    public static final Block PEACH_LOG = registerBlock("peach_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LOG)));
    public static final Block PEACH_WOOD = registerBlock("peach_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_WOOD)));
    public static final Block STRIPPED_PEACH_LOG = registerBlock("stripped_peach_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_LOG)));
    public static final Block STRIPPED_PEACH_WOOD = registerBlock("stripped_peach_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_WOOD)));

    public static final Block PEACH_PLANKS = registerBlock("peach_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));
    public static final Block PEACH_LEAVES = registerBlock("peach_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block FLOWERING_PEACH_LEAVES = registerBlock("flowering_peach_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LEAVES)));

    public static final Block PEACH_SAPLING = registerBlock("peach_sapling",
            new SaplingBlock(new PeachSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.CHERRY_SAPLING)));
    public static final Block PEACH_BLOSSOM_SAPLING = registerBlock("peach_blossom_sapling",
            new SaplingBlock(new PeachBlossomSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.CHERRY_SAPLING)));
    public static final Block POTTED_PEACH_SAPLING = registerBlockWithoutBlockItem("potted_peach_sapling",
            new FlowerPotBlock(PEACH_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_CHERRY_SAPLING)));
    public static final Block POTTED_PEACH_BLOSSOM_SAPLING = registerBlockWithoutBlockItem("potted_peach_blossom_sapling",
            new FlowerPotBlock(PEACH_BLOSSOM_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_CHERRY_SAPLING)));

    public static final Block PEACH_STAIRS = registerBlock("peach_stairs",
            new StairsBlock(TakieTerraTreeBlocks.PEACH_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CHERRY_STAIRS)));
    public static final Block PEACH_SLAB = registerBlock("peach_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_SLAB)));
    public static final Block PEACH_BUTTON = registerBlock("peach_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block PEACH_PRESSURE_PLATE = registerBlock("peach_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.CHERRY_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block PEACH_FENCE = registerBlock("peach_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block PEACH_FENCE_GATE = registerBlock("peach_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block PEACH_DOOR = registerBlock("peach_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block PEACH_TRAPDOOR = registerBlock("peach_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_TRAPDOOR), BlockSetType.OAK));

    public static final Block PEACH_SIGN = registerBlockWithoutBlockItem("peach_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_SIGN), TakieTerraWoodTypes.PEACH));
    public static final Block PEACH_HANGING_SIGN = registerBlockWithoutBlockItem("peach_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_HANGING_SIGN), TakieTerraWoodTypes.PEACH));
    public static final Block PEACH_WALL_SIGN = registerBlockWithoutBlockItem("peach_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(PEACH_SIGN), TakieTerraWoodTypes.PEACH));
    public static final Block PEACH_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("peach_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_WALL_HANGING_SIGN).dropsLike(PEACH_HANGING_SIGN), TakieTerraWoodTypes.PEACH));


    //PEAR

    public static final Block PEAR_LOG = registerBlock("pear_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block PEAR_WOOD = registerBlock("pear_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_PEAR_LOG = registerBlock("stripped_pear_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_PEAR_WOOD = registerBlock("stripped_pear_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block PEAR_PLANKS = registerBlock("pear_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PEAR_LEAVES = registerBlock("pear_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.AZALEA_LEAVES)));

    public static final Block FLOWERING_PEAR_LEAVES = registerBlock("flowering_pear_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.FLOWERING_AZALEA_LEAVES)));

    public static final Block PEAR_STAIRS = registerBlock("pear_stairs",
            new StairsBlock(TakieTerraTreeBlocks.PEAR_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block PEAR_SLAB = registerBlock("pear_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block PEAR_BUTTON = registerBlock("pear_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block PEAR_PRESSURE_PLATE = registerBlock("pear_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block PEAR_FENCE = registerBlock("pear_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block PEAR_FENCE_GATE = registerBlock("pear_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), TakieTerraWoodTypes.PEAR));

    public static final Block PEAR_DOOR = registerBlock("pear_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block PEAR_TRAPDOOR = registerBlock("pear_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block PEAR_SIGN = registerBlockWithoutBlockItem("pear_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.PEAR));
    public static final Block PEAR_HANGING_SIGN = registerBlockWithoutBlockItem("pear_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.PEAR));
    public static final Block PEAR_WALL_SIGN = registerBlockWithoutBlockItem("pear_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(PEAR_SIGN), TakieTerraWoodTypes.PEAR));
    public static final Block PEAR_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("pear_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(PEAR_HANGING_SIGN), TakieTerraWoodTypes.PEAR));



    //RAINBOW_GUM

    public static final Block RAINBOW_GUM_LOG = registerBlock("rainbow_gum_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block RAINBOW_GUM_WOOD = registerBlock("rainbow_gum_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_RAINBOW_GUM_LOG = registerBlock("stripped_rainbow_gum_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_RAINBOW_GUM_WOOD = registerBlock("stripped_rainbow_gum_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block RAINBOW_GUM_PLANKS = registerBlock("rainbow_gum_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block RAINBOW_GUM_LEAVES = registerBlock("rainbow_gum_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block RAINBOW_GUM_SAPLING = registerBlock("rainbow_gum_sapling",
            new SaplingBlock(new RainbowGumSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.JUNGLE_SAPLING)));

    public static final Block POTTED_RAINBOW_GUM_SAPLING = registerBlockWithoutBlockItem("potted_rainbow_gum_sapling",
            new FlowerPotBlock(RAINBOW_GUM_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_JUNGLE_SAPLING)));


    public static final Block RAINBOW_GUM_STAIRS = registerBlock("rainbow_gum_stairs",
            new StairsBlock(TakieTerraTreeBlocks.RAINBOW_GUM_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block RAINBOW_GUM_SLAB = registerBlock("rainbow_gum_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block RAINBOW_GUM_BUTTON = registerBlock("rainbow_gum_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block RAINBOW_GUM_PRESSURE_PLATE = registerBlock("rainbow_gum_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block RAINBOW_GUM_FENCE = registerBlock("rainbow_gum_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block RAINBOW_GUM_FENCE_GATE = registerBlock("rainbow_gum_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block RAINBOW_GUM_DOOR = registerBlock("rainbow_gum_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block RAINBOW_GUM_TRAPDOOR = registerBlock("rainbow_gum_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block RAINBOW_GUM_SIGN = registerBlockWithoutBlockItem("rainbow_gum_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.RAINBOW_GUM));
    public static final Block RAINBOW_GUM_HANGING_SIGN = registerBlockWithoutBlockItem("rainbow_gum_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.RAINBOW_GUM));
    public static final Block RAINBOW_GUM_WALL_SIGN = registerBlockWithoutBlockItem("rainbow_gum_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(RAINBOW_GUM_SIGN), TakieTerraWoodTypes.RAINBOW_GUM));
    public static final Block RAINBOW_GUM_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("rainbow_gum_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(RAINBOW_GUM_HANGING_SIGN), TakieTerraWoodTypes.RAINBOW_GUM));


    //DEAD
    public static final Block DEAD_LOG = registerBlock("dead_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block DEAD_WOOD = registerBlock("dead_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block DEAD_PLANKS = registerBlock("dead_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block DEAD_LEAVES = registerBlock("dead_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block DEAD_SAPLING = registerBlock("dead_sapling",
            new SaplingBlock(new DeadSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));

    public static final Block POTTED_DEAD_SAPLING = registerBlockWithoutItem("potted_dead_sapling",
            new FlowerPotBlock(DEAD_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));

    public static final Block DEAD_STAIRS = registerBlock("dead_stairs",
            new StairsBlock(TakieTerraTreeBlocks.DEAD_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block DEAD_SLAB = registerBlock("dead_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block DEAD_BUTTON = registerBlock("dead_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block DEAD_PRESSURE_PLATE = registerBlock("dead_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block DEAD_FENCE = registerBlock("dead_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block DEAD_FENCE_GATE = registerBlock("dead_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block DEAD_DOOR = registerBlock("dead_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block DEAD_TRAPDOOR = registerBlock("dead_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block DEAD_SIGN = registerBlockWithoutBlockItem("dead_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.DEAD));
    public static final Block DEAD_HANGING_SIGN = registerBlockWithoutBlockItem("dead_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.DEAD));
    public static final Block DEAD_WALL_SIGN = registerBlockWithoutBlockItem("dead_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(DEAD_SIGN), TakieTerraWoodTypes.DEAD));
    public static final Block DEAD_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("dead_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(DEAD_HANGING_SIGN), TakieTerraWoodTypes.DEAD));


    //EBONY

    public static final Block EBONY_LOG = registerBlock("ebony_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block EBONY_WOOD = registerBlock("ebony_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_EBONY_LOG = registerBlock("stripped_ebony_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_EBONY_WOOD = registerBlock("stripped_ebony_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block EBONY_PLANKS = registerBlock("ebony_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block EBONY_LEAVES = registerBlock("ebony_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block EBONY_SAPLING = registerBlock("ebony_sapling",
            new SaplingBlock(new EbonySaplingGenerator(), FabricBlockSettings.copyOf(Blocks.DARK_OAK_SAPLING)));

    public static final Block POTTED_EBONY_SAPLING = registerBlockWithoutBlockItem("potted_ebony_sapling",
            new FlowerPotBlock(EBONY_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));


    public static final Block EBONY_STAIRS = registerBlock("ebony_stairs",
            new StairsBlock(TakieTerraTreeBlocks.EBONY_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block EBONY_SLAB = registerBlock("ebony_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block EBONY_BUTTON = registerBlock("ebony_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block EBONY_PRESSURE_PLATE = registerBlock("ebony_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block EBONY_FENCE = registerBlock("ebony_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block EBONY_FENCE_GATE = registerBlock("ebony_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block EBONY_DOOR = registerBlock("ebony_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block EBONY_TRAPDOOR = registerBlock("ebony_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block EBONY_SIGN = registerBlockWithoutBlockItem("ebony_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.EBONY));
    public static final Block EBONY_HANGING_SIGN = registerBlockWithoutBlockItem("ebony_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.EBONY));
    public static final Block EBONY_WALL_SIGN = registerBlockWithoutBlockItem("ebony_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(EBONY_SIGN), TakieTerraWoodTypes.EBONY));
    public static final Block EBONY_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("ebony_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(EBONY_HANGING_SIGN), TakieTerraWoodTypes.EBONY));

    public static final Block EBONY_VINES = registerBlock("ebony_vines",
            new VineBlock(FabricBlockSettings.copyOf(Blocks.VINE)));

    //FRUIT TREES
    public static final Block MANDARIN_LEAVES = registerBlock("mandarin_leaves",
            new MandarinLeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block MANDARIN_LOG = registerBlock("mandarin_log",
            SmallLogBlock.of(TakieTerraTreeBlocks.MANDARIN_LEAVES, MapColor.BROWN));
    public static final Block STRIPPED_MANDARIN_LOG = registerBlock("stripped_mandarin_log",
            SmallLogBlock.of(TakieTerraTreeBlocks.MANDARIN_LEAVES, MapColor.OAK_TAN));
    public static final Block MANDARIN_PLANKS = registerBlock("mandarin_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));
    public static final Block MANDARIN_SAPLING = registerBlock("mandarin_sapling",
            new SaplingBlock(new MandarinSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_MANDARIN_SAPLING = registerBlockWithoutBlockItem("potted_mandarin_sapling",
            new FlowerPotBlock(MANDARIN_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));

    public static final Block LEMON_LEAVES = registerBlock("lemon_leaves",
            new LemonLeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block LEMON_LOG = registerBlock("lemon_log",
            SmallLogBlock.of(TakieTerraTreeBlocks.LEMON_LEAVES, MapColor.BROWN));
    public static final Block STRIPPED_LEMON_LOG = registerBlock("stripped_lemon_log",
            SmallLogBlock.of(TakieTerraTreeBlocks.LEMON_LEAVES, MapColor.OAK_TAN));
    public static final Block LEMON_PLANKS = registerBlock("lemon_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));
    public static final Block LEMON_SAPLING = registerBlock("lemon_sapling",
            new SaplingBlock(new LemonSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_LEMON_SAPLING = registerBlockWithoutBlockItem("potted_lemon_sapling",
            new FlowerPotBlock(LEMON_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));

    public static final Block LIME_LEAVES = registerBlock("lime_leaves",
            new LimeLeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block LIME_LOG = registerBlock("lime_log",
            SmallLogBlock.of(TakieTerraTreeBlocks.LIME_LEAVES, MapColor.BROWN));
    public static final Block STRIPPED_LIME_LOG = registerBlock("stripped_lime_log",
            SmallLogBlock.of(TakieTerraTreeBlocks.LIME_LEAVES, MapColor.OAK_TAN));
    public static final Block LIME_PLANKS = registerBlock("lime_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));
    public static final Block LIME_SAPLING = registerBlock("lime_sapling",
            new SaplingBlock(new LimeSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_LIME_SAPLING = registerBlockWithoutBlockItem("potted_lime_sapling",
            new FlowerPotBlock(LIME_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));

    public static final Block BLACK_CHERRY_LEAVES = registerBlock("black_cherry_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LEAVES)));
    public static final Block BLACK_CHERRY_LOG = registerBlock("black_cherry_log",
            SmallLogBlock.of(TakieTerraTreeBlocks.BLACK_CHERRY_LEAVES, MapColor.BROWN));
    public static final Block STRIPPED_BLACK_CHERRY_LOG = registerBlock("stripped_black_cherry_log",
            SmallLogBlock.of(TakieTerraTreeBlocks.BLACK_CHERRY_LEAVES, MapColor.OAK_TAN));
    public static final Block BLACK_CHERRY_PLANKS = registerBlock("black_cherry_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));
    public static final Block BLACK_CHERRY_SAPLING = registerBlock("black_cherry_sapling",
            new SaplingBlock(new BlackCherrySaplingGenerator(), FabricBlockSettings.copyOf(Blocks.CHERRY_SAPLING)));
    public static final Block POTTED_BLACK_CHERRY_SAPLING = registerBlockWithoutBlockItem("potted_black_cherry_sapling",
            new FlowerPotBlock(BLACK_CHERRY_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_CHERRY_SAPLING)));

    public static final Block OLIVE_LEAVES = registerBlock("olive_leaves",
            new OliveLeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block OLIVE_LOG = registerBlock("olive_log",
            SmallLogBlock.of(TakieTerraTreeBlocks.OLIVE_LEAVES, MapColor.BROWN));
    public static final Block STRIPPED_OLIVE_LOG = registerBlock("stripped_olive_log",
            SmallLogBlock.of(TakieTerraTreeBlocks.OLIVE_LEAVES, MapColor.OAK_TAN));
    public static final Block OLIVE_PLANKS = registerBlock("olive_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));
    public static final Block OLIVE_SAPLING = registerBlock("olive_sapling",
            new SaplingBlock(new OliveSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_OLIVE_SAPLING = registerBlockWithoutBlockItem("potted_olive_sapling",
            new FlowerPotBlock(OLIVE_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));

    public static final Block CINNAMON_LEAVES = registerBlock("cinnamon_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block CINNAMON_LOG = registerBlock("cinnamon_log",
            SmallLogBlock.of(TakieTerraTreeBlocks.CINNAMON_LEAVES, MapColor.BROWN));
    public static final Block STRIPPED_CINNAMON_LOG = registerBlock("stripped_cinnamon_log",
            SmallLogBlock.of(TakieTerraTreeBlocks.CINNAMON_LEAVES, MapColor.OAK_TAN));
    public static final Block CINNAMON_PLANKS = registerBlock("cinnamon_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));
    public static final Block CINNAMON_SAPLING = registerBlock("cinnamon_sapling",
            new SaplingBlock(new CinnamonSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_CINNAMON_SAPLING = registerBlockWithoutBlockItem("potted_cinnamon_sapling",
            new FlowerPotBlock(CINNAMON_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));


    //WISTERIA TREES

    public static final Block WISTERIA_LOG = registerBlock("wisteria_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block WISTERIA_WOOD = registerBlock("wisteria_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_WISTERIA_LOG = registerBlock("stripped_wisteria_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_WISTERIA_WOOD = registerBlock("stripped_wisteria_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block WISTERIA_PLANKS = registerBlock("wisteria_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PURPLE_WISTERIA_SAPLING = registerBlock("purple_wisteria_sapling",
            new SaplingBlock(new PurpleWisteriaSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block WHITE_WISTERIA_SAPLING = registerBlock("white_wisteria_sapling",
            new SaplingBlock(new WhiteWisteriaSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block BLUE_WISTERIA_SAPLING = registerBlock("blue_wisteria_sapling",
            new SaplingBlock(new BlueWisteriaSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block PINK_WISTERIA_SAPLING = registerBlock("pink_wisteria_sapling",
            new SaplingBlock(new PinkWisteriaSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_PURPLE_WISTERIA_SAPLING = registerBlockWithoutBlockItem("potted_purple_wisteria_sapling",
            new FlowerPotBlock(PURPLE_WISTERIA_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));
    public static final Block POTTED_WHITE_WISTERIA_SAPLING = registerBlockWithoutBlockItem("potted_white_wisteria_sapling",
            new FlowerPotBlock(WHITE_WISTERIA_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));
    public static final Block POTTED_BLUE_WISTERIA_SAPLING = registerBlockWithoutBlockItem("potted_blue_wisteria_sapling",
            new FlowerPotBlock(BLUE_WISTERIA_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));
    public static final Block POTTED_PINK_WISTERIA_SAPLING = registerBlockWithoutBlockItem("potted_pink_wisteria_sapling",
            new FlowerPotBlock(PINK_WISTERIA_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));

    public static final Block WISTERIA_STAIRS = registerBlock("wisteria_stairs",
            new StairsBlock(TakieTerraTreeBlocks.WISTERIA_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block WISTERIA_SLAB = registerBlock("wisteria_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block WISTERIA_BUTTON = registerBlock("wisteria_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block WISTERIA_PRESSURE_PLATE = registerBlock("wisteria_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block WISTERIA_FENCE = registerBlock("wisteria_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block WISTERIA_FENCE_GATE = registerBlock("wisteria_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block PURPLE_WISTERIA_DOOR = registerBlock("wisteria_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block WHITE_WISTERIA_DOOR = registerBlock("white_wisteria_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block BLUE_WISTERIA_DOOR = registerBlock("blue_wisteria_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block PINK_WISTERIA_DOOR = registerBlock("pink_wisteria_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block WISTERIA_TRAPDOOR = registerBlock("wisteria_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block WISTERIA_SIGN = registerBlockWithoutBlockItem("wisteria_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.WISTERIA));
    public static final Block WISTERIA_HANGING_SIGN = registerBlockWithoutBlockItem("wisteria_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.WISTERIA));
    public static final Block WISTERIA_WALL_SIGN = registerBlockWithoutBlockItem("wisteria_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(WISTERIA_SIGN), TakieTerraWoodTypes.WISTERIA));
    public static final Block WISTERIA_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("wisteria_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(WISTERIA_HANGING_SIGN), TakieTerraWoodTypes.WISTERIA));

    //AEGIA
    public static final Block AEGIA_LOG = registerBlock("aegia_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block AEGIA_WOOD = registerBlock("aegia_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_AEGIA_LOG = registerBlock("stripped_aegia_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_AEGIA_WOOD = registerBlock("stripped_aegia_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block AEGIA_PLANKS = registerBlock("aegia_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block AEGIA_LEAVES = registerBlock("aegia_leaves",
            new AegiaLeaves(FabricBlockSettings.copyOf(Blocks.CHERRY_LEAVES)));
    public static final Block AEGIA_VINES = registerBlock("aegia_vines",
            new AegiaVine(FabricBlockSettings.create()
                    .mapColor(MapColor.PINK)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .ticksRandomly()
                    .noCollision()
                    .nonOpaque()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.CHERRY_LEAVES)));
    public static final Block AEGIA_VINES_PLANT = registerBlock("aegia_vines_plant",
            new AegiaVinePlant(FabricBlockSettings.create()
                    .mapColor(MapColor.PINK)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .ticksRandomly()
                    .noCollision()
                    .nonOpaque()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.CHERRY_LEAVES), TakieTerraTreeBlocks.AEGIA_VINES));

    public static final Block AEGIA_SAPLING = registerBlock("aegia_sapling",
            new SaplingBlock(new AegiaSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_AEGIA_SAPLING = registerBlockWithoutBlockItem("potted_aegia_sapling",
            new FlowerPotBlock(AEGIA_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));

    public static final Block AEGIA_STAIRS = registerBlock("aegia_stairs",
            new StairsBlock(TakieTerraTreeBlocks.AEGIA_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block AEGIA_SLAB = registerBlock("aegia_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block AEGIA_BUTTON = registerBlock("aegia_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block AEGIA_PRESSURE_PLATE = registerBlock("aegia_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block AEGIA_FENCE = registerBlock("aegia_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block AEGIA_FENCE_GATE = registerBlock("aegia_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block AEGIA_DOOR = registerBlock("aegia_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block AEGIA_TRAPDOOR = registerBlock("aegia_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block AEGIA_SIGN = registerBlockWithoutBlockItem("aegia_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.AEGIA));
    public static final Block AEGIA_HANGING_SIGN = registerBlockWithoutBlockItem("aegia_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.AEGIA));
    public static final Block AEGIA_WALL_SIGN = registerBlockWithoutBlockItem("aegia_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(AEGIA_SIGN), TakieTerraWoodTypes.AEGIA));
    public static final Block AEGIA_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("aegia_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(AEGIA_HANGING_SIGN), TakieTerraWoodTypes.AEGIA));


    //SWAMP SYLPH
    public static final Block SWAMP_SYLPH_LOG = registerBlock("swamp_sylph_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block SWAMP_SYLPH_WOOD = registerBlock("swamp_sylph_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_SWAMP_SYLPH_LOG = registerBlock("stripped_swamp_sylph_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_SWAMP_SYLPH_WOOD = registerBlock("stripped_swamp_sylph_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block SWAMP_SYLPH_PLANKS = registerBlock("swamp_sylph_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block SWAMP_SYLPH_LEAVES = registerBlock("swamp_sylph_leaves",
            new SwampSylphLeaves(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block SWAMP_SYLPH_VINES = registerBlock("swamp_sylph_vines",
            new SwampSylphVine(FabricBlockSettings.create()
                    .mapColor(MapColor.LICHEN_GREEN)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .ticksRandomly()
                    .noCollision()
                    .nonOpaque()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.CHERRY_LEAVES)));
    public static final Block SWAMP_SYLPH_VINES_PLANT = registerBlock("swamp_sylph_vines_plant",
            new SwampSylphVinePlant(FabricBlockSettings.create()
                    .mapColor(MapColor.LICHEN_GREEN)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .ticksRandomly()
                    .noCollision()
                    .nonOpaque()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.CHERRY_LEAVES), TakieTerraTreeBlocks.SWAMP_SYLPH_VINES));

    public static final Block SWAMP_SYLPH_SAPLING = registerBlock("swamp_sylph_sapling",
            new SaplingBlock(new SwampSylphSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_SWAMP_SYLPH_SAPLING = registerBlockWithoutBlockItem("potted_swamp_sylph_sapling",
            new FlowerPotBlock(SWAMP_SYLPH_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));

    public static final Block SWAMP_SYLPH_STAIRS = registerBlock("swamp_sylph_stairs",
            new StairsBlock(TakieTerraTreeBlocks.SWAMP_SYLPH_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block SWAMP_SYLPH_SLAB = registerBlock("swamp_sylph_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block SWAMP_SYLPH_BUTTON = registerBlock("swamp_sylph_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block SWAMP_SYLPH_PRESSURE_PLATE = registerBlock("swamp_sylph_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block SWAMP_SYLPH_FENCE = registerBlock("swamp_sylph_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block SWAMP_SYLPH_FENCE_GATE = registerBlock("swamp_sylph_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block SWAMP_SYLPH_DOOR = registerBlock("swamp_sylph_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block SWAMP_SYLPH_TRAPDOOR = registerBlock("swamp_sylph_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block SWAMP_SYLPH_SIGN = registerBlockWithoutBlockItem("swamp_sylph_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.SWAMP_SYLPH));
    public static final Block SWAMP_SYLPH_HANGING_SIGN = registerBlockWithoutBlockItem("swamp_sylph_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.SWAMP_SYLPH));
    public static final Block SWAMP_SYLPH_WALL_SIGN = registerBlockWithoutBlockItem("swamp_sylph_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(SWAMP_SYLPH_SIGN), TakieTerraWoodTypes.SWAMP_SYLPH));
    public static final Block SWAMP_SYLPH_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("swamp_sylph_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(SWAMP_SYLPH_HANGING_SIGN), TakieTerraWoodTypes.SWAMP_SYLPH));

    //YELLOWWOOD

    public static final Block YELLOWWOOD_LOG = registerBlock("yellowwood_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block YELLOWWOOD_WOOD = registerBlock("yellowwood_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_YELLOWWOOD_LOG = registerBlock("stripped_yellowwood_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_YELLOWWOOD_WOOD = registerBlock("stripped_yellowwood_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block YELLOWWOOD_PLANKS = registerBlock("yellowwood_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block YELLOWWOOD_LEAVES = registerBlock("yellowwood_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block YELLOWWOOD_BLOSSOMS = registerBlock("yellowwood_blossoms",
            new ShortHangingFlowersBlock(FabricBlockSettings.copyOf(Blocks.WHITE_TULIP).mapColor(MapColor.WHITE)));
    public static final Block YELLOWWOOD_SAPLING = registerBlock("yellowwood_sapling",
            new SaplingBlock(new YellowwoodSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_YELLOWWOOD_SAPLING = registerBlockWithoutBlockItem("potted_yellowwood_sapling",
            new FlowerPotBlock(YELLOWWOOD_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));


    public static final Block YELLOWWOOD_STAIRS = registerBlock("yellowwood_stairs",
            new StairsBlock(TakieTerraTreeBlocks.YELLOWWOOD_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block YELLOWWOOD_SLAB = registerBlock("yellowwood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block YELLOWWOOD_BUTTON = registerBlock("yellowwood_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block YELLOWWOOD_PRESSURE_PLATE = registerBlock("yellowwood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block YELLOWWOOD_FENCE = registerBlock("yellowwood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block YELLOWWOOD_FENCE_GATE = registerBlock("yellowwood_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block YELLOWWOOD_DOOR = registerBlock("yellowwood_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block YELLOWWOOD_TRAPDOOR = registerBlock("yellowwood_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block YELLOWWOOD_SIGN = registerBlockWithoutBlockItem("yellowwood_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.YELLOWWOOD));
    public static final Block YELLOWWOOD_HANGING_SIGN = registerBlockWithoutBlockItem("yellowwood_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.YELLOWWOOD));
    public static final Block YELLOWWOOD_WALL_SIGN = registerBlockWithoutBlockItem("yellowwood_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(YELLOWWOOD_SIGN), TakieTerraWoodTypes.YELLOWWOOD));
    public static final Block YELLOWWOOD_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("yellowwood_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(YELLOWWOOD_HANGING_SIGN), TakieTerraWoodTypes.YELLOWWOOD));


    // SWEETGUM

    public static final Block SWEETGUM_LOG = registerBlock("sweetgum_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block SWEETGUM_WOOD = registerBlock("sweetgum_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_SWEETGUM_LOG = registerBlock("stripped_sweetgum_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_SWEETGUM_WOOD = registerBlock("stripped_sweetgum_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block SWEETGUM_PLANKS = registerBlock("sweetgum_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block SWEETGUM_LEAVES = registerBlock("sweetgum_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block SWEETGUM_SAPLING = registerBlock("sweetgum_sapling",
            new SaplingBlock(new SweetgumSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_SWEETGUM_SAPLING = registerBlockWithoutBlockItem("potted_sweetgum_sapling",
            new FlowerPotBlock(SWEETGUM_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));


    public static final Block SWEETGUM_STAIRS = registerBlock("sweetgum_stairs",
            new StairsBlock(TakieTerraTreeBlocks.SWEETGUM_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block SWEETGUM_SLAB = registerBlock("sweetgum_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block SWEETGUM_BUTTON = registerBlock("sweetgum_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block SWEETGUM_PRESSURE_PLATE = registerBlock("sweetgum_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block SWEETGUM_FENCE = registerBlock("sweetgum_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block SWEETGUM_FENCE_GATE = registerBlock("sweetgum_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block SWEETGUM_DOOR = registerBlock("sweetgum_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block SWEETGUM_TRAPDOOR = registerBlock("sweetgum_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block SWEETGUM_SIGN = registerBlockWithoutBlockItem("sweetgum_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.SWEETGUM));
    public static final Block SWEETGUM_HANGING_SIGN = registerBlockWithoutBlockItem("sweetgum_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.SWEETGUM));
    public static final Block SWEETGUM_WALL_SIGN = registerBlockWithoutBlockItem("sweetgum_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(SWEETGUM_SIGN), TakieTerraWoodTypes.SWEETGUM));
    public static final Block SWEETGUM_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("sweetgum_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(SWEETGUM_HANGING_SIGN), TakieTerraWoodTypes.SWEETGUM));



    //NOMERIA

    public static final Block NOMERIA_LOG = registerBlock("nomeria_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block NOMERIA_WOOD = registerBlock("nomeria_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_NOMERIA_LOG = registerBlock("stripped_nomeria_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_NOMERIA_WOOD = registerBlock("stripped_nomeria_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block NOMERIA_PLANKS = registerBlock("nomeria_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block NOMERIA_LEAVES = registerBlock("nomeria_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block NOMERIA_SAPLING = registerBlock("nomeria_sapling",
            new SaplingBlock(new NomeriaSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_NOMERIA_SAPLING = registerBlockWithoutBlockItem("potted_nomeria_sapling",
            new FlowerPotBlock(NOMERIA_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));


    public static final Block NOMERIA_STAIRS = registerBlock("nomeria_stairs",
            new StairsBlock(TakieTerraTreeBlocks.NOMERIA_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block NOMERIA_SLAB = registerBlock("nomeria_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block NOMERIA_BUTTON = registerBlock("nomeria_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block NOMERIA_PRESSURE_PLATE = registerBlock("nomeria_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block NOMERIA_FENCE = registerBlock("nomeria_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block NOMERIA_FENCE_GATE = registerBlock("nomeria_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block NOMERIA_DOOR = registerBlock("nomeria_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block NOMERIA_TRAPDOOR = registerBlock("nomeria_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block NOMERIA_SIGN = registerBlockWithoutBlockItem("nomeria_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.NOMERIA));
    public static final Block NOMERIA_HANGING_SIGN = registerBlockWithoutBlockItem("nomeria_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.NOMERIA));
    public static final Block NOMERIA_WALL_SIGN = registerBlockWithoutBlockItem("nomeria_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(NOMERIA_SIGN), TakieTerraWoodTypes.NOMERIA));
    public static final Block NOMERIA_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("nomeria_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(NOMERIA_HANGING_SIGN), TakieTerraWoodTypes.NOMERIA));


    //INDIKO

    public static final Block INDIKO_LOG = registerBlock("indiko_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block INDIKO_WOOD = registerBlock("indiko_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_INDIKO_LOG = registerBlock("stripped_indiko_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_INDIKO_WOOD = registerBlock("stripped_indiko_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block INDIKO_PLANKS = registerBlock("indiko_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block INDIKO_LEAVES = registerBlock("indiko_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block INDIKO_SAPLING = registerBlock("indiko_sapling",
            new DesertSapling(new IndikoSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_INDIKO_SAPLING = registerBlockWithoutBlockItem("potted_indiko_sapling",
            new FlowerPotBlock(INDIKO_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));


    public static final Block INDIKO_STAIRS = registerBlock("indiko_stairs",
            new StairsBlock(TakieTerraTreeBlocks.INDIKO_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block INDIKO_SLAB = registerBlock("indiko_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block INDIKO_BUTTON = registerBlock("indiko_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block INDIKO_PRESSURE_PLATE = registerBlock("indiko_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block INDIKO_FENCE = registerBlock("indiko_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block INDIKO_FENCE_GATE = registerBlock("indiko_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block INDIKO_DOOR = registerBlock("indiko_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block INDIKO_TRAPDOOR = registerBlock("indiko_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block INDIKO_SIGN = registerBlockWithoutBlockItem("indiko_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.INDIKO));
    public static final Block INDIKO_HANGING_SIGN = registerBlockWithoutBlockItem("indiko_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.INDIKO));
    public static final Block INDIKO_WALL_SIGN = registerBlockWithoutBlockItem("indiko_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(INDIKO_SIGN), TakieTerraWoodTypes.INDIKO));
    public static final Block INDIKO_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("indiko_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(INDIKO_HANGING_SIGN), TakieTerraWoodTypes.INDIKO));

    //SEABREEZE

    public static final Block SEABREEZE_LOG = registerBlock("seabreeze_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block SEABREEZE_WOOD = registerBlock("seabreeze_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_SEABREEZE_LOG = registerBlock("stripped_seabreeze_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_SEABREEZE_WOOD = registerBlock("stripped_seabreeze_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block SEABREEZE_PLANKS = registerBlock("seabreeze_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block SEABREEZE_LEAVES = registerBlock("seabreeze_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block SEABREEZE_SAPLING = registerBlock("seabreeze_sapling",
            new DesertSapling(new SeabreezeSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_SEABREEZE_SAPLING = registerBlockWithoutBlockItem("potted_seabreeze_sapling",
            new FlowerPotBlock(SEABREEZE_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));


    public static final Block SEABREEZE_STAIRS = registerBlock("seabreeze_stairs",
            new StairsBlock(TakieTerraTreeBlocks.SEABREEZE_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block SEABREEZE_SLAB = registerBlock("seabreeze_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block SEABREEZE_BUTTON = registerBlock("seabreeze_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block SEABREEZE_PRESSURE_PLATE = registerBlock("seabreeze_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block SEABREEZE_FENCE = registerBlock("seabreeze_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block SEABREEZE_FENCE_GATE = registerBlock("seabreeze_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block SEABREEZE_DOOR = registerBlock("seabreeze_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block SEABREEZE_TRAPDOOR = registerBlock("seabreeze_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block SEABREEZE_SIGN = registerBlockWithoutBlockItem("seabreeze_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.SEABREEZE));
    public static final Block SEABREEZE_HANGING_SIGN = registerBlockWithoutBlockItem("seabreeze_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.SEABREEZE));
    public static final Block SEABREEZE_WALL_SIGN = registerBlockWithoutBlockItem("seabreeze_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(SEABREEZE_SIGN), TakieTerraWoodTypes.SEABREEZE));
    public static final Block SEABREEZE_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("seabreeze_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(SEABREEZE_HANGING_SIGN), TakieTerraWoodTypes.SEABREEZE));


    //FIR
    public static final Block FIR_LOG = registerBlock("fir_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block FIR_WOOD = registerBlock("fir_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_FIR_LOG = registerBlock("stripped_fir_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_FIR_WOOD = registerBlock("stripped_fir_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block FIR_PLANKS = registerBlock("fir_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block FIR_LEAVES = registerBlock("fir_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block FIR_SAPLING = registerBlock("fir_sapling",
            new SaplingBlock(new FirSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.DARK_OAK_SAPLING)));
    public static final Block POTTED_FIR_SAPLING = registerBlockWithoutBlockItem("potted_fir_sapling",
            new FlowerPotBlock(FIR_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_DARK_OAK_SAPLING)));


    public static final Block FIR_STAIRS = registerBlock("fir_stairs",
            new StairsBlock(TakieTerraTreeBlocks.FIR_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block FIR_SLAB = registerBlock("fir_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block FIR_BUTTON = registerBlock("fir_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block FIR_PRESSURE_PLATE = registerBlock("fir_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block FIR_FENCE = registerBlock("fir_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block FIR_FENCE_GATE = registerBlock("fir_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block FIR_DOOR = registerBlock("fir_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block FIR_TRAPDOOR = registerBlock("fir_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block FIR_SIGN = registerBlockWithoutBlockItem("fir_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.FIR));
    public static final Block FIR_HANGING_SIGN = registerBlockWithoutBlockItem("fir_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.FIR));
    public static final Block FIR_WALL_SIGN = registerBlockWithoutBlockItem("fir_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(FIR_SIGN), TakieTerraWoodTypes.FIR));
    public static final Block FIR_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("fir_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(FIR_HANGING_SIGN), TakieTerraWoodTypes.FIR));


    //MOSSY HEART

    public static final Block MOSSY_HEART_LOG = registerBlock("mossy_heart_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block MOSSY_HEART_WOOD = registerBlock("mossy_heart_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_MOSSY_HEART_LOG = registerBlock("stripped_mossy_heart_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_MOSSY_HEART_WOOD = registerBlock("stripped_mossy_heart_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block MOSSY_HEART_PLANKS = registerBlock("mossy_heart_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block MOSSY_HEART_LEAVES = registerBlock("mossy_heart_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block MOSSY_HEART_SAPLING = registerBlock("mossy_heart_sapling",
            new SaplingBlock(new MossyHeartSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_MOSSY_HEART_SAPLING = registerBlockWithoutBlockItem("potted_mossy_heart_sapling",
            new FlowerPotBlock(MOSSY_HEART_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));


    public static final Block MOSSY_HEART_STAIRS = registerBlock("mossy_heart_stairs",
            new StairsBlock(TakieTerraTreeBlocks.MOSSY_HEART_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block MOSSY_HEART_SLAB = registerBlock("mossy_heart_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block MOSSY_HEART_BUTTON = registerBlock("mossy_heart_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block MOSSY_HEART_PRESSURE_PLATE = registerBlock("mossy_heart_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block MOSSY_HEART_FENCE = registerBlock("mossy_heart_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block MOSSY_HEART_FENCE_GATE = registerBlock("mossy_heart_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block MOSSY_HEART_DOOR = registerBlock("mossy_heart_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block MOSSY_HEART_TRAPDOOR = registerBlock("mossy_heart_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block MOSSY_HEART_SIGN = registerBlockWithoutBlockItem("mossy_heart_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.MOSSY_HEART));
    public static final Block MOSSY_HEART_HANGING_SIGN = registerBlockWithoutBlockItem("mossy_heart_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.MOSSY_HEART));
    public static final Block MOSSY_HEART_WALL_SIGN = registerBlockWithoutBlockItem("mossy_heart_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(MOSSY_HEART_SIGN), TakieTerraWoodTypes.MOSSY_HEART));
    public static final Block MOSSY_HEART_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("mossy_heart_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(MOSSY_HEART_HANGING_SIGN), TakieTerraWoodTypes.MOSSY_HEART));

    //PALO VERDE
    public static final Block PALO_VERDE_LOG = registerBlock("palo_verde_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LOG)));
    public static final Block PALO_VERDE_WOOD = registerBlock("palo_verde_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_WOOD)));
    public static final Block STRIPPED_PALO_VERDE_LOG = registerBlock("stripped_palo_verde_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_LOG)));
    public static final Block STRIPPED_PALO_VERDE_WOOD = registerBlock("stripped_palo_verde_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_WOOD)));
    public static final Block PALO_VERDE_BUNDLE = registerBlock("palo_verde_bundle",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_WOOD)));

    public static final Block PALO_VERDE_PLANKS = registerBlock("palo_verde_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));
    public static final Block PALO_VERDE_LEAVES = registerBlock("palo_verde_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.AZALEA_LEAVES)));
    public static final Block FLOWERING_PALO_VERDE_LEAVES = registerBlock("flowering_palo_verde_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.FLOWERING_AZALEA_LEAVES)));

    public static final Block PALO_VERDE_SAPLING = registerBlock("palo_verde_sapling",
            new DesertSapling(new PaloVerdeSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.CHERRY_SAPLING)));
    public static final Block POTTED_PALO_VERDE_SAPLING = registerBlockWithoutBlockItem("potted_palo_verde_sapling",
            new FlowerPotBlock(PALO_VERDE_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_CHERRY_SAPLING)));

    public static final Block PALO_VERDE_STAIRS = registerBlock("palo_verde_stairs",
            new StairsBlock(TakieTerraTreeBlocks.PALO_VERDE_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CHERRY_STAIRS)));
    public static final Block PALO_VERDE_SLAB = registerBlock("palo_verde_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_SLAB)));
    public static final Block PALO_VERDE_BUTTON = registerBlock("palo_verde_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block PALO_VERDE_PRESSURE_PLATE = registerBlock("palo_verde_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.CHERRY_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block PALO_VERDE_FENCE = registerBlock("palo_verde_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_FENCE)));
    public static final Block PALO_VERDE_FENCE_GATE = registerBlock("palo_verde_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_FENCE_GATE), WoodType.OAK));

    public static final Block PALO_VERDE_DOOR = registerBlock("palo_verde_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_DOOR), BlockSetType.OAK));
    public static final Block PALO_VERDE_TRAPDOOR = registerBlock("palo_verde_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_TRAPDOOR), BlockSetType.OAK));

    public static final Block PALO_VERDE_SIGN = registerBlockWithoutBlockItem("palo_verde_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_SIGN), TakieTerraWoodTypes.PALO_VERDE));
    public static final Block PALO_VERDE_HANGING_SIGN = registerBlockWithoutBlockItem("palo_verde_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_HANGING_SIGN), TakieTerraWoodTypes.PALO_VERDE));
    public static final Block PALO_VERDE_WALL_SIGN = registerBlockWithoutBlockItem("palo_verde_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_SIGN).dropsLike(PALO_VERDE_SIGN), TakieTerraWoodTypes.PALO_VERDE));
    public static final Block PALO_VERDE_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("palo_verde_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_WALL_HANGING_SIGN).dropsLike(PALO_VERDE_HANGING_SIGN), TakieTerraWoodTypes.PALO_VERDE));


    //ZEBRAWOOD

    public static final Block ZEBRAWOOD_LOG = registerBlock("zebrawood_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block ZEBRAWOOD_WOOD = registerBlock("zebrawood_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_ZEBRAWOOD_LOG = registerBlock("stripped_zebrawood_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_ZEBRAWOOD_WOOD = registerBlock("stripped_zebrawood_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block ZEBRAWOOD_PLANKS = registerBlock("zebrawood_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block ZEBRAWOOD_LEAVES = registerBlock("zebrawood_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block ZEBRAWOOD_SAPLING = registerBlock("zebrawood_sapling",
            new SaplingBlock(new ZebrawoodSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));

    public static final Block POTTED_ZEBRAWOOD_SAPLING = registerBlockWithoutBlockItem("potted_zebrawood_sapling",
            new FlowerPotBlock(ZEBRAWOOD_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));


    public static final Block ZEBRAWOOD_STAIRS = registerBlock("zebrawood_stairs",
            new StairsBlock(TakieTerraTreeBlocks.ZEBRAWOOD_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block ZEBRAWOOD_SLAB = registerBlock("zebrawood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block ZEBRAWOOD_BUTTON = registerBlock("zebrawood_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block ZEBRAWOOD_PRESSURE_PLATE = registerBlock("zebrawood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block ZEBRAWOOD_FENCE = registerBlock("zebrawood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block ZEBRAWOOD_FENCE_GATE = registerBlock("zebrawood_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block ZEBRAWOOD_DOOR = registerBlock("zebrawood_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block ZEBRAWOOD_TRAPDOOR = registerBlock("zebrawood_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block ZEBRAWOOD_SIGN = registerBlockWithoutBlockItem("zebrawood_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.ZEBRAWOOD));
    public static final Block ZEBRAWOOD_HANGING_SIGN = registerBlockWithoutBlockItem("zebrawood_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.ZEBRAWOOD));
    public static final Block ZEBRAWOOD_WALL_SIGN = registerBlockWithoutBlockItem("zebrawood_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(ZEBRAWOOD_SIGN), TakieTerraWoodTypes.ZEBRAWOOD));
    public static final Block ZEBRAWOOD_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("zebrawood_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(ZEBRAWOOD_HANGING_SIGN), TakieTerraWoodTypes.ZEBRAWOOD));

    //BLUE_GUM
    public static final Block BLUE_GUM_LOG = registerBlock("blue_gum_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block BLUE_GUM_WOOD = registerBlock("blue_gum_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_BLUE_GUM_LOG = registerBlock("stripped_blue_gum_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_BLUE_GUM_WOOD = registerBlock("stripped_blue_gum_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block BLUE_GUM_PLANKS = registerBlock("blue_gum_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLUE_GUM_LEAVES = registerBlock("blue_gum_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block BLUE_GUM_SAPLING = registerBlock("blue_gum_sapling",
            new SaplingBlock(new BlueGumSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));

    public static final Block POTTED_BLUE_GUM_SAPLING = registerBlockWithoutBlockItem("potted_blue_gum_sapling",
            new FlowerPotBlock(BLUE_GUM_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));


    public static final Block BLUE_GUM_STAIRS = registerBlock("blue_gum_stairs",
            new StairsBlock(TakieTerraTreeBlocks.BLUE_GUM_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block BLUE_GUM_SLAB = registerBlock("blue_gum_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block BLUE_GUM_BUTTON = registerBlock("blue_gum_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block BLUE_GUM_PRESSURE_PLATE = registerBlock("blue_gum_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block BLUE_GUM_FENCE = registerBlock("blue_gum_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block BLUE_GUM_FENCE_GATE = registerBlock("blue_gum_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block BLUE_GUM_DOOR = registerBlock("blue_gum_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block BLUE_GUM_TRAPDOOR = registerBlock("blue_gum_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block BLUE_GUM_SIGN = registerBlockWithoutBlockItem("blue_gum_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.BLUE_GUM));
    public static final Block BLUE_GUM_HANGING_SIGN = registerBlockWithoutBlockItem("blue_gum_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.BLUE_GUM));
    public static final Block BLUE_GUM_WALL_SIGN = registerBlockWithoutBlockItem("blue_gum_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(BLUE_GUM_SIGN), TakieTerraWoodTypes.BLUE_GUM));
    public static final Block BLUE_GUM_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("blue_gum_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(BLUE_GUM_HANGING_SIGN), TakieTerraWoodTypes.BLUE_GUM));


    //PONDEROSA_PINE
    public static final Block PONDEROSA_PINE_LOG = registerBlock("ponderosa_pine_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block PONDEROSA_PINE_TRANSITION_LOG = registerBlock("ponderosa_pine_transition_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block PONDEROSA_PINE_WOOD = registerBlock("ponderosa_pine_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_PONDEROSA_PINE_LOG = registerBlock("stripped_ponderosa_pine_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_PONDEROSA_PINE_WOOD = registerBlock("stripped_ponderosa_pine_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block PONDEROSA_PINE_PLANKS = registerBlock("ponderosa_pine_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PONDEROSA_PINE_LEAVES = registerBlock("ponderosa_pine_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block PONDEROSA_PINE_SAPLING = registerBlock("ponderosa_pine_sapling",
            new SaplingBlock(new PonderosaPineSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));

    public static final Block POTTED_PONDEROSA_PINE_SAPLING = registerBlockWithoutBlockItem("potted_ponderosa_pine_sapling",
            new FlowerPotBlock(PONDEROSA_PINE_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));


    public static final Block PONDEROSA_PINE_STAIRS = registerBlock("ponderosa_pine_stairs",
            new StairsBlock(TakieTerraTreeBlocks.PONDEROSA_PINE_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block PONDEROSA_PINE_SLAB = registerBlock("ponderosa_pine_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block PONDEROSA_PINE_BUTTON = registerBlock("ponderosa_pine_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block PONDEROSA_PINE_PRESSURE_PLATE = registerBlock("ponderosa_pine_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block PONDEROSA_PINE_FENCE = registerBlock("ponderosa_pine_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block PONDEROSA_PINE_FENCE_GATE = registerBlock("ponderosa_pine_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block PONDEROSA_PINE_DOOR = registerBlock("ponderosa_pine_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block PONDEROSA_PINE_TRAPDOOR = registerBlock("ponderosa_pine_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block PONDEROSA_PINE_SIGN = registerBlockWithoutBlockItem("ponderosa_pine_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.PONDEROSA_PINE));
    public static final Block PONDEROSA_PINE_HANGING_SIGN = registerBlockWithoutBlockItem("ponderosa_pine_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.PONDEROSA_PINE));
    public static final Block PONDEROSA_PINE_WALL_SIGN = registerBlockWithoutBlockItem("ponderosa_pine_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(PONDEROSA_PINE_SIGN), TakieTerraWoodTypes.PONDEROSA_PINE));
    public static final Block PONDEROSA_PINE_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("ponderosa_pine_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(PONDEROSA_PINE_HANGING_SIGN), TakieTerraWoodTypes.PONDEROSA_PINE));

    //BEECH
    public static final Block BEECH_LOG = registerBlock("beech_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block BEECH_WOOD = registerBlock("beech_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_BEECH_LOG = registerBlock("stripped_beech_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_BEECH_WOOD = registerBlock("stripped_beech_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block BEECH_PLANKS = registerBlock("beech_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BEECH_LEAVES = registerBlock("beech_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));

    public static final Block BEECH_SAPLING = registerBlock("beech_sapling",
            new SaplingBlock(new BeechSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_BEECH_SAPLING = registerBlockWithoutBlockItem("potted_beech_sapling",
            new FlowerPotBlock(BEECH_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));

    public static final Block BEECH_STAIRS = registerBlock("beech_stairs",
            new StairsBlock(TakieTerraTreeBlocks.BEECH_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block BEECH_SLAB = registerBlock("beech_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block BEECH_BUTTON = registerBlock("beech_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block BEECH_PRESSURE_PLATE = registerBlock("beech_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block BEECH_FENCE = registerBlock("beech_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block BEECH_FENCE_GATE = registerBlock("beech_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), TakieTerraWoodTypes.BEECH));

    public static final Block BEECH_DOOR = registerBlock("beech_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block BEECH_TRAPDOOR = registerBlock("beech_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block BEECH_SIGN = registerBlockWithoutBlockItem("beech_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.BEECH));
    public static final Block BEECH_HANGING_SIGN = registerBlockWithoutBlockItem("beech_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.BEECH));
    public static final Block BEECH_WALL_SIGN = registerBlockWithoutBlockItem("beech_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(BEECH_SIGN), TakieTerraWoodTypes.BEECH));
    public static final Block BEECH_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("beech_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(BEECH_HANGING_SIGN), TakieTerraWoodTypes.BEECH));


    //KNOBCONE_PINE
    public static final Block KNOBCONE_PINE_LOG = registerBlock("knobcone_pine_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block KNOBCONE_PINE_WOOD = registerBlock("knobcone_pine_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_KNOBCONE_PINE_LOG = registerBlock("stripped_knobcone_pine_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_KNOBCONE_PINE_WOOD = registerBlock("stripped_knobcone_pine_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block KNOBCONE_PINE_PLANKS = registerBlock("knobcone_pine_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block KNOBCONE_PINE_LEAVES = registerBlock("knobcone_pine_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block KNOBCONE_PINE_SAPLING = registerBlock("knobcone_pine_sapling",
            new SaplingBlock(new KnobconePineSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_KNOBCONE_PINE_SAPLING = registerBlockWithoutBlockItem("potted_knobcone_pine_sapling",
            new FlowerPotBlock(KNOBCONE_PINE_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));
    public static final Block KNOBCONE_PINE_STAIRS = registerBlock("knobcone_pine_stairs",
            new StairsBlock(TakieTerraTreeBlocks.KNOBCONE_PINE_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block KNOBCONE_PINE_SLAB = registerBlock("knobcone_pine_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block KNOBCONE_PINE_BUTTON = registerBlock("knobcone_pine_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block KNOBCONE_PINE_PRESSURE_PLATE = registerBlock("knobcone_pine_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block KNOBCONE_PINE_FENCE = registerBlock("knobcone_pine_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block KNOBCONE_PINE_FENCE_GATE = registerBlock("knobcone_pine_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block KNOBCONE_PINE_DOOR = registerBlock("knobcone_pine_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block KNOBCONE_PINE_TRAPDOOR = registerBlock("knobcone_pine_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block KNOBCONE_PINE_SIGN = registerBlockWithoutBlockItem("knobcone_pine_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.KNOBCONE_PINE));
    public static final Block KNOBCONE_PINE_HANGING_SIGN = registerBlockWithoutBlockItem("knobcone_pine_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.KNOBCONE_PINE));
    public static final Block KNOBCONE_PINE_WALL_SIGN = registerBlockWithoutBlockItem("knobcone_pine_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(KNOBCONE_PINE_SIGN), TakieTerraWoodTypes.KNOBCONE_PINE));
    public static final Block KNOBCONE_PINE_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("knobcone_pine_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(KNOBCONE_PINE_HANGING_SIGN), TakieTerraWoodTypes.KNOBCONE_PINE));



    //MAHOGANY
    public static final Block MAHOGANY_LOG = registerBlock("mahogany_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block MAHOGANY_WOOD = registerBlock("mahogany_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_MAHOGANY_LOG = registerBlock("stripped_mahogany_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_MAHOGANY_WOOD = registerBlock("stripped_mahogany_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block MAHOGANY_PLANKS = registerBlock("mahogany_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block MAHOGANY_LEAVES = registerBlock("mahogany_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block MAHOGANY_SAPLING = registerBlock("mahogany_sapling",
            new SaplingBlock(new MahoganySaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));

    public static final Block POTTED_MAHOGANY_SAPLING = registerBlockWithoutBlockItem("potted_mahogany_sapling",
            new FlowerPotBlock(MAHOGANY_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));


    public static final Block MAHOGANY_STAIRS = registerBlock("mahogany_stairs",
            new StairsBlock(TakieTerraTreeBlocks.MAHOGANY_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block MAHOGANY_SLAB = registerBlock("mahogany_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block MAHOGANY_BUTTON = registerBlock("mahogany_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block MAHOGANY_PRESSURE_PLATE = registerBlock("mahogany_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block MAHOGANY_FENCE = registerBlock("mahogany_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block MAHOGANY_FENCE_GATE = registerBlock("mahogany_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block MAHOGANY_DOOR = registerBlock("mahogany_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block MAHOGANY_TRAPDOOR = registerBlock("mahogany_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block MAHOGANY_SIGN = registerBlockWithoutBlockItem("mahogany_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.MAHOGANY));
    public static final Block MAHOGANY_HANGING_SIGN = registerBlockWithoutBlockItem("mahogany_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.MAHOGANY));
    public static final Block MAHOGANY_WALL_SIGN = registerBlockWithoutBlockItem("mahogany_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(MAHOGANY_SIGN), TakieTerraWoodTypes.MAHOGANY));
    public static final Block MAHOGANY_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("mahogany_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(MAHOGANY_HANGING_SIGN), TakieTerraWoodTypes.MAHOGANY));


    //IRONWOOD
    public static final Block IRONWOOD_LOG = registerBlock("ironwood_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block IRONWOOD_WOOD = registerBlock("ironwood_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_IRONWOOD_LOG = registerBlock("stripped_ironwood_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_IRONWOOD_WOOD = registerBlock("stripped_ironwood_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block IRONWOOD_PLANKS = registerBlock("ironwood_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block IRONWOOD_LEAVES = registerBlock("ironwood_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block IRONWOOD_SAPLING = registerBlock("ironwood_sapling",
            new SaplingBlock(new IronwoodSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));

    public static final Block POTTED_IRONWOOD_SAPLING = registerBlockWithoutBlockItem("potted_ironwood_sapling",
            new FlowerPotBlock(MAHOGANY_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));


    public static final Block IRONWOOD_STAIRS = registerBlock("ironwood_stairs",
            new StairsBlock(TakieTerraTreeBlocks.IRONWOOD_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block IRONWOOD_SLAB = registerBlock("ironwood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block IRONWOOD_BUTTON = registerBlock("ironwood_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block IRONWOOD_PRESSURE_PLATE = registerBlock("ironwood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block IRONWOOD_FENCE = registerBlock("ironwood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block IRONWOOD_FENCE_GATE = registerBlock("ironwood_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block IRONWOOD_DOOR = registerBlock("ironwood_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block IRONWOOD_TRAPDOOR = registerBlock("ironwood_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block IRONWOOD_SIGN = registerBlockWithoutBlockItem("ironwood_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.IRONWOOD));
    public static final Block IRONWOOD_HANGING_SIGN = registerBlockWithoutBlockItem("ironwood_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.IRONWOOD));
    public static final Block IRONWOOD_WALL_SIGN = registerBlockWithoutBlockItem("ironwood_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(IRONWOOD_SIGN), TakieTerraWoodTypes.IRONWOOD));
    public static final Block IRONWOOD_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("ironwood_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(IRONWOOD_HANGING_SIGN), TakieTerraWoodTypes.IRONWOOD));


    //CAMELLIA
    public static final Block CAMELLIA_LOG = registerBlock("camellia_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LOG)));
    public static final Block CAMELLIA_WOOD = registerBlock("camellia_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_WOOD)));
    public static final Block STRIPPED_CAMELLIA_LOG = registerBlock("stripped_camellia_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_LOG)));
    public static final Block STRIPPED_CAMELLIA_WOOD = registerBlock("stripped_camellia_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_WOOD)));
    public static final Block CAMELLIA_PLANKS = registerBlock("camellia_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));
    public static final Block CAMELLIA_LEAVES = registerBlock("camellia_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.AZALEA_LEAVES)));
    public static final Block FLOWERING_CAMELLIA_LEAVES = registerBlock("flowering_camellia_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.FLOWERING_AZALEA_LEAVES)));

    public static final Block CAMELLIA_SAPLING = registerBlock("camellia_sapling",
            new SaplingBlock(new CamelliaSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.AZALEA)));
    public static final Block POTTED_CAMELLIA_SAPLING = registerBlockWithoutBlockItem("potted_camellia_sapling",
            new FlowerPotBlock(CAMELLIA_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_AZALEA_BUSH)));

    public static final Block CAMELLIA_STAIRS = registerBlock("camellia_stairs",
            new StairsBlock(TakieTerraTreeBlocks.CAMELLIA_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CHERRY_STAIRS)));
    public static final Block CAMELLIA_SLAB = registerBlock("camellia_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_SLAB)));
    public static final Block CAMELLIA_BUTTON = registerBlock("camellia_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block CAMELLIA_PRESSURE_PLATE = registerBlock("camellia_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.CHERRY_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block CAMELLIA_FENCE = registerBlock("camellia_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_FENCE)));
    public static final Block CAMELLIA_FENCE_GATE = registerBlock("camellia_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_FENCE_GATE), WoodType.OAK));

    public static final Block CAMELLIA_DOOR = registerBlock("camellia_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_DOOR), BlockSetType.OAK));
    public static final Block CAMELLIA_TRAPDOOR = registerBlock("camellia_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_TRAPDOOR), BlockSetType.OAK));

    public static final Block CAMELLIA_SIGN = registerBlockWithoutBlockItem("camellia_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_SIGN), TakieTerraWoodTypes.CAMELLIA));
    public static final Block CAMELLIA_HANGING_SIGN = registerBlockWithoutBlockItem("camellia_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_HANGING_SIGN), TakieTerraWoodTypes.CAMELLIA));
    public static final Block CAMELLIA_WALL_SIGN = registerBlockWithoutBlockItem("camellia_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_SIGN).dropsLike(CAMELLIA_SIGN), TakieTerraWoodTypes.CAMELLIA));
    public static final Block CAMELLIA_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("camellia_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_WALL_HANGING_SIGN).dropsLike(CAMELLIA_HANGING_SIGN), TakieTerraWoodTypes.CAMELLIA));

    //AZALEA DOOR
    public static final Block AZALEA_DOOR = registerBlock("azalea_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_DOOR), BlockSetType.OAK));
    public static final Block AZALEA_TRAPDOOR = registerBlock("azalea_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_TRAPDOOR), BlockSetType.OAK));


    //GINKGO
    public static final Block GINKGO_LOG = registerBlock("ginkgo_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block GINKGO_WOOD = registerBlock("ginkgo_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_GINKGO_LOG = registerBlock("stripped_ginkgo_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_GINKGO_WOOD = registerBlock("stripped_ginkgo_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block GINKGO_PLANKS = registerBlock("ginkgo_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GINKGO_LEAVES_VERDANT = registerBlock("ginkgo_leaves_verdant",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block GINKGO_LEAVES_GOLDEN = registerBlock("ginkgo_leaves_golden",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block GINKGO_SAPLING_VERDANT = registerBlock("ginkgo_sapling_verdant",
            new SaplingBlock(new VerdantGinkgoSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block GINKGO_SAPLING_GOLDEN = registerBlock("ginkgo_sapling_golden",
            new SaplingBlock(new GoldenGinkgoSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_VERDANT_GINKGO_SAPLING = registerBlockWithoutBlockItem("potted_verdant_ginkgo_sapling",
            new FlowerPotBlock(GINKGO_SAPLING_VERDANT, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));
    public static final Block POTTED_GOLDEN_GINKGO_SAPLING = registerBlockWithoutBlockItem("potted_golden_ginkgo_sapling",
            new FlowerPotBlock(GINKGO_SAPLING_GOLDEN, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));


    public static final Block GINKGO_STAIRS = registerBlock("ginkgo_stairs",
            new StairsBlock(TakieTerraTreeBlocks.GINKGO_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block GINKGO_SLAB = registerBlock("ginkgo_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block GINKGO_BUTTON = registerBlock("ginkgo_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block GINKGO_PRESSURE_PLATE = registerBlock("ginkgo_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block GINKGO_FENCE = registerBlock("ginkgo_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block GINKGO_FENCE_GATE = registerBlock("ginkgo_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block GINKGO_DOOR = registerBlock("ginkgo_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block GINKGO_TRAPDOOR = registerBlock("ginkgo_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block GINKGO_SIGN = registerBlockWithoutBlockItem("ginkgo_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.GINKGO));
    public static final Block GINKGO_HANGING_SIGN = registerBlockWithoutBlockItem("ginkgo_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.GINKGO));
    public static final Block GINKGO_WALL_SIGN = registerBlockWithoutBlockItem("ginkgo_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(GINKGO_SIGN), TakieTerraWoodTypes.GINKGO));
    public static final Block GINKGO_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("ginkgo_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(GINKGO_HANGING_SIGN), TakieTerraWoodTypes.GINKGO));


    // MYRTA
    public static final Block MYRTA_LOG = registerBlock("myrta_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block MYRTA_WOOD = registerBlock("myrta_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_MYRTA_LOG = registerBlock("stripped_myrta_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_MYRTA_WOOD = registerBlock("stripped_myrta_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block MYRTA_PLANKS = registerBlock("myrta_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block MYRTA_LEAVES = registerBlock("myrta_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block MYRTA_LEAVES_PINK = registerBlock("myrta_leaves_pink",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block MYRTA_SAPLING = registerBlock("myrta_sapling",
            new SaplingBlock(new MyrtaSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_MYRTA_SAPLING = registerBlockWithoutBlockItem("potted_myrta_sapling",
            new FlowerPotBlock(MYRTA_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));


    public static final Block MYRTA_STAIRS = registerBlock("myrta_stairs",
            new StairsBlock(TakieTerraTreeBlocks.MYRTA_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block MYRTA_SLAB = registerBlock("myrta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block MYRTA_BUTTON = registerBlock("myrta_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block MYRTA_PRESSURE_PLATE = registerBlock("myrta_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block MYRTA_FENCE = registerBlock("myrta_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block MYRTA_FENCE_GATE = registerBlock("myrta_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block MYRTA_DOOR = registerBlock("myrta_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block MYRTA_TRAPDOOR = registerBlock("myrta_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block MYRTA_SIGN = registerBlockWithoutBlockItem("myrta_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.MYRTA));
    public static final Block MYRTA_HANGING_SIGN = registerBlockWithoutBlockItem("myrta_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.MYRTA));
    public static final Block MYRTA_WALL_SIGN = registerBlockWithoutBlockItem("myrta_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(MYRTA_SIGN), TakieTerraWoodTypes.MYRTA));
    public static final Block MYRTA_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("myrta_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(MYRTA_HANGING_SIGN), TakieTerraWoodTypes.MYRTA));

    //SYCAMORE
    public static final Block SYCAMORE_LOG = registerBlock("sycamore_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block SYCAMORE_WOOD = registerBlock("sycamore_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_SYCAMORE_LOG = registerBlock("stripped_sycamore_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_SYCAMORE_WOOD = registerBlock("stripped_sycamore_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block SYCAMORE_PLANKS = registerBlock("sycamore_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block SYCAMORE_LEAVES = registerBlock("sycamore_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block SYCAMORE_SAPLING = registerBlock("sycamore_sapling",
            new SaplingBlock(new SycamoreSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.DARK_OAK_SAPLING)));
    public static final Block POTTED_SYCAMORE_SAPLING = registerBlockWithoutBlockItem("potted_sycamore_sapling",
            new FlowerPotBlock(SYCAMORE_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));


    public static final Block SYCAMORE_STAIRS = registerBlock("sycamore_stairs",
            new StairsBlock(TakieTerraTreeBlocks.SYCAMORE_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block SYCAMORE_SLAB = registerBlock("sycamore_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block SYCAMORE_BUTTON = registerBlock("sycamore_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block SYCAMORE_PRESSURE_PLATE = registerBlock("sycamore_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block SYCAMORE_FENCE = registerBlock("sycamore_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block SYCAMORE_FENCE_GATE = registerBlock("sycamore_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block SYCAMORE_DOOR = registerBlock("sycamore_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block SYCAMORE_TRAPDOOR = registerBlock("sycamore_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block SYCAMORE_SIGN = registerBlockWithoutBlockItem("sycamore_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.SYCAMORE));
    public static final Block SYCAMORE_HANGING_SIGN = registerBlockWithoutBlockItem("sycamore_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.SYCAMORE));
    public static final Block SYCAMORE_WALL_SIGN = registerBlockWithoutBlockItem("sycamore_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(SYCAMORE_SIGN), TakieTerraWoodTypes.SYCAMORE));
    public static final Block SYCAMORE_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("sycamore_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(SYCAMORE_HANGING_SIGN), TakieTerraWoodTypes.SYCAMORE));

    //SNOW GHOST

    public static final Block SNOW_GHOST_LOG = registerBlock("snow_ghost_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block SNOW_GHOST_WOOD = registerBlock("snow_ghost_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_SNOW_GHOST_LOG = registerBlock("stripped_snow_ghost_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_SNOW_GHOST_WOOD = registerBlock("stripped_snow_ghost_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block SNOW_GHOST_PLANKS = registerBlock("snow_ghost_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block SNOW_GHOST_LEAVES = registerBlock("snow_ghost_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));

    public static final Block SNOW_GHOST_SAPLING = registerBlock("snow_ghost_sapling",
            new SnowSaplingBlock(new SnowGhostSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_SNOW_GHOST_SAPLING = registerBlockWithoutBlockItem("potted_snow_ghost_sapling",
            new FlowerPotBlock(SNOW_GHOST_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));

    public static final Block SNOW_GHOST_STAIRS = registerBlock("snow_ghost_stairs",
            new StairsBlock(TakieTerraTreeBlocks.SNOW_GHOST_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block SNOW_GHOST_SLAB = registerBlock("snow_ghost_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block SNOW_GHOST_BUTTON = registerBlock("snow_ghost_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block SNOW_GHOST_PRESSURE_PLATE = registerBlock("snow_ghost_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block SNOW_GHOST_FENCE = registerBlock("snow_ghost_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block SNOW_GHOST_FENCE_GATE = registerBlock("snow_ghost_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block SNOW_GHOST_DOOR = registerBlock("snow_ghost_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block SNOW_GHOST_TRAPDOOR = registerBlock("snow_ghost_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block SNOW_GHOST_SIGN = registerBlockWithoutBlockItem("snow_ghost_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.SNOW_GHOST));
    public static final Block SNOW_GHOST_HANGING_SIGN = registerBlockWithoutBlockItem("snow_ghost_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.SNOW_GHOST));
    public static final Block SNOW_GHOST_WALL_SIGN = registerBlockWithoutBlockItem("snow_ghost_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(SNOW_GHOST_SIGN), TakieTerraWoodTypes.SNOW_GHOST));
    public static final Block SNOW_GHOST_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("snow_ghost_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(SNOW_GHOST_HANGING_SIGN), TakieTerraWoodTypes.SNOW_GHOST));
    public static final Block SNOW_GHOST_VINES = registerBlock("snow_ghost_vines",
            new VineBlock(FabricBlockSettings.copyOf(Blocks.VINE)));


    //SCINTILLA

    public static final Block SCINTILLA_LOG = registerBlock("scintilla_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block SCINTILLA_WOOD = registerBlock("scintilla_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_SCINTILLA_LOG = registerBlock("stripped_scintilla_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_SCINTILLA_WOOD = registerBlock("stripped_scintilla_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block SCINTILLA_PLANKS = registerBlock("scintilla_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block SCINTILLA_LEAVES = registerBlock("scintilla_leaves",
            new ScintillaLeavesBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LEAVES).luminance(7).mapColor(MapColor.CYAN)));
    public static final Block SCINTILLA_SAPLING = registerBlock("scintilla_sapling",
            new SaplingBlock(new ScintillaSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.CHERRY_SAPLING).luminance(7)));

    public static final Block POTTED_SCINTILLA_SAPLING = registerBlockWithoutBlockItem("potted_scintilla_sapling",
            new FlowerPotBlock(SCINTILLA_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));


    public static final Block SCINTILLA_STAIRS = registerBlock("scintilla_stairs",
            new StairsBlock(TakieTerraTreeBlocks.SCINTILLA_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block SCINTILLA_SLAB = registerBlock("scintilla_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block SCINTILLA_BUTTON = registerBlock("scintilla_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block SCINTILLA_PRESSURE_PLATE = registerBlock("scintilla_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block SCINTILLA_FENCE = registerBlock("scintilla_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block SCINTILLA_FENCE_GATE = registerBlock("scintilla_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block SCINTILLA_DOOR = registerBlock("scintilla_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block SCINTILLA_TRAPDOOR = registerBlock("scintilla_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block SCINTILLA_SIGN = registerBlockWithoutBlockItem("scintilla_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.SCINTILLA));
    public static final Block SCINTILLA_HANGING_SIGN = registerBlockWithoutBlockItem("scintilla_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.SCINTILLA));
    public static final Block SCINTILLA_WALL_SIGN = registerBlockWithoutBlockItem("scintilla_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(SCINTILLA_SIGN), TakieTerraWoodTypes.SCINTILLA));
    public static final Block SCINTILLA_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("scintilla_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(SCINTILLA_HANGING_SIGN), TakieTerraWoodTypes.SCINTILLA));



    //WINTER BLOSSOM

    public static final Block WINTER_BLOSSOM_LOG = registerBlock("winter_blossom_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block WINTER_BLOSSOM_WOOD = registerBlock("winter_blossom_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_WINTER_BLOSSOM_LOG = registerBlock("stripped_winter_blossom_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_WINTER_BLOSSOM_WOOD = registerBlock("stripped_winter_blossom_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block WINTER_BLOSSOM_PLANKS = registerBlock("winter_blossom_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WINTER_BLOSSOM_LEAVES = registerBlock("winter_blossom_leaves",
            new WinterBlossomLeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).mapColor(MapColor.WHITE)));

    public static final Block WINTER_BLOSSOM_SAPLING = registerBlock("winter_blossom_sapling",
            new SnowSaplingBlock(new WinterBlossomSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_WINTER_BLOSSOM_SAPLING = registerBlockWithoutBlockItem("potted_winter_blossom_sapling",
            new FlowerPotBlock(WINTER_BLOSSOM_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));

    public static final Block WINTER_BLOSSOM_STAIRS = registerBlock("winter_blossom_stairs",
            new StairsBlock(TakieTerraTreeBlocks.WINTER_BLOSSOM_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block WINTER_BLOSSOM_SLAB = registerBlock("winter_blossom_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block WINTER_BLOSSOM_BUTTON = registerBlock("winter_blossom_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block WINTER_BLOSSOM_PRESSURE_PLATE = registerBlock("winter_blossom_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block WINTER_BLOSSOM_FENCE = registerBlock("winter_blossom_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block WINTER_BLOSSOM_FENCE_GATE = registerBlock("winter_blossom_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block WINTER_BLOSSOM_DOOR = registerBlock("winter_blossom_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block WINTER_BLOSSOM_TRAPDOOR = registerBlock("winter_blossom_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block WINTER_BLOSSOM_SIGN = registerBlockWithoutBlockItem("winter_blossom_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.WINTER_BLOSSOM));
    public static final Block WINTER_BLOSSOM_HANGING_SIGN = registerBlockWithoutBlockItem("winter_blossom_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.WINTER_BLOSSOM));
    public static final Block WINTER_BLOSSOM_WALL_SIGN = registerBlockWithoutBlockItem("winter_blossom_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(WINTER_BLOSSOM_SIGN), TakieTerraWoodTypes.WINTER_BLOSSOM));
    public static final Block WINTER_BLOSSOM_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("winter_blossom_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(WINTER_BLOSSOM_HANGING_SIGN), TakieTerraWoodTypes.WINTER_BLOSSOM));


    // CAMPHOR
    public static final Block CAMPHOR_LOG = registerBlock("camphor_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block CAMPHOR_WOOD = registerBlock("camphor_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_CAMPHOR_LOG = registerBlock("stripped_camphor_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_CAMPHOR_WOOD = registerBlock("stripped_camphor_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block CAMPHOR_PLANKS = registerBlock("camphor_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block CAMPHOR_LEAVES = registerBlock("camphor_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block CAMPHOR_SAPLING = registerBlock("camphor_sapling",
            new SaplingBlock(new CamphorSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.DARK_OAK_SAPLING)));
    public static final Block POTTED_CAMPHOR_SAPLING = registerBlockWithoutBlockItem("potted_camphor_sapling",
            new FlowerPotBlock(CAMPHOR_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_DARK_OAK_SAPLING)));


    public static final Block CAMPHOR_STAIRS = registerBlock("camphor_stairs",
            new StairsBlock(TakieTerraTreeBlocks.CAMPHOR_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block CAMPHOR_SLAB = registerBlock("camphor_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block CAMPHOR_BUTTON = registerBlock("camphor_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block CAMPHOR_PRESSURE_PLATE = registerBlock("camphor_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block CAMPHOR_FENCE = registerBlock("camphor_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block CAMPHOR_FENCE_GATE = registerBlock("camphor_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block CAMPHOR_DOOR = registerBlock("camphor_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block CAMPHOR_TRAPDOOR = registerBlock("camphor_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block CAMPHOR_SIGN = registerBlockWithoutBlockItem("camphor_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.CAMPHOR));
    public static final Block CAMPHOR_HANGING_SIGN = registerBlockWithoutBlockItem("camphor_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.CAMPHOR));
    public static final Block CAMPHOR_WALL_SIGN = registerBlockWithoutBlockItem("camphor_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(CAMPHOR_SIGN), TakieTerraWoodTypes.CAMPHOR));
    public static final Block CAMPHOR_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("camphor_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(CAMPHOR_HANGING_SIGN), TakieTerraWoodTypes.CAMPHOR));

    //PARASHOREA
    public static final Block PARASHOREA_LOG = registerBlock("parashorea_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block PARASHOREA_WOOD = registerBlock("parashorea_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_PARASHOREA_LOG = registerBlock("stripped_parashorea_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_PARASHOREA_WOOD = registerBlock("stripped_parashorea_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block PARASHOREA_PLANKS = registerBlock("parashorea_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PARASHOREA_LEAVES = registerBlock("parashorea_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block PARASHOREA_SAPLING = registerBlock("parashorea_sapling",
            new SaplingBlock(new ParashoreaSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.DARK_OAK_SAPLING)));
    public static final Block POTTED_PARASHOREA_SAPLING = registerBlockWithoutBlockItem("potted_parashorea_sapling",
            new FlowerPotBlock(PARASHOREA_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_DARK_OAK_SAPLING)));


    public static final Block PARASHOREA_STAIRS = registerBlock("parashorea_stairs",
            new StairsBlock(TakieTerraTreeBlocks.PARASHOREA_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block PARASHOREA_SLAB = registerBlock("parashorea_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block PARASHOREA_BUTTON = registerBlock("parashorea_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block PARASHOREA_PRESSURE_PLATE = registerBlock("parashorea_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block PARASHOREA_FENCE = registerBlock("parashorea_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block PARASHOREA_FENCE_GATE = registerBlock("parashorea_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block PARASHOREA_DOOR = registerBlock("parashorea_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block PARASHOREA_TRAPDOOR = registerBlock("parashorea_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block PARASHOREA_SIGN = registerBlockWithoutBlockItem("parashorea_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.PARASHOREA));
    public static final Block PARASHOREA_HANGING_SIGN = registerBlockWithoutBlockItem("parashorea_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.PARASHOREA));
    public static final Block PARASHOREA_WALL_SIGN = registerBlockWithoutBlockItem("parashorea_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(PARASHOREA_SIGN), TakieTerraWoodTypes.PARASHOREA));
    public static final Block PARASHOREA_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("parashorea_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(PARASHOREA_HANGING_SIGN), TakieTerraWoodTypes.PARASHOREA));


    //MADRONE
    public static final Block MADRONE_LOG = registerBlock("madrone_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block MADRONE_WOOD = registerBlock("madrone_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_MADRONE_LOG = registerBlock("stripped_madrone_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_MADRONE_WOOD = registerBlock("stripped_madrone_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block MADRONE_PLANKS = registerBlock("madrone_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block MADRONE_LEAVES = registerBlock("madrone_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block MADRONE_SAPLING = registerBlock("madrone_sapling",
            new SaplingBlock(new MadroneSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_MADRONE_SAPLING = registerBlockWithoutBlockItem("potted_madrone_sapling",
            new FlowerPotBlock(MADRONE_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));


    public static final Block MADRONE_STAIRS = registerBlock("madrone_stairs",
            new StairsBlock(TakieTerraTreeBlocks.MADRONE_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block MADRONE_SLAB = registerBlock("madrone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block MADRONE_BUTTON = registerBlock("madrone_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block MADRONE_PRESSURE_PLATE = registerBlock("madrone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block MADRONE_FENCE = registerBlock("madrone_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block MADRONE_FENCE_GATE = registerBlock("madrone_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block MADRONE_DOOR = registerBlock("madrone_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block MADRONE_TRAPDOOR = registerBlock("madrone_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block MADRONE_SIGN = registerBlockWithoutBlockItem("madrone_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.MADRONE));
    public static final Block MADRONE_HANGING_SIGN = registerBlockWithoutBlockItem("madrone_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.MADRONE));
    public static final Block MADRONE_WALL_SIGN = registerBlockWithoutBlockItem("madrone_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(MADRONE_SIGN), TakieTerraWoodTypes.MADRONE));
    public static final Block MADRONE_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("madrone_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(MADRONE_HANGING_SIGN), TakieTerraWoodTypes.MADRONE));



    // KAURI

    public static final Block KAURI_LOG = registerBlock("kauri_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block KAURI_WOOD = registerBlock("kauri_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_KAURI_LOG = registerBlock("stripped_kauri_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_KAURI_WOOD = registerBlock("stripped_kauri_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block KAURI_PLANKS = registerBlock("kauri_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block KAURI_LEAVES = registerBlock("kauri_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block KAURI_SAPLING = registerBlock("kauri_sapling",
            new SaplingBlock(new KauriSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.DARK_OAK_SAPLING)));
    public static final Block POTTED_KAURI_SAPLING = registerBlockWithoutBlockItem("potted_kauri_sapling",
            new FlowerPotBlock(KAURI_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_DARK_OAK_SAPLING)));


    public static final Block KAURI_STAIRS = registerBlock("kauri_stairs",
            new StairsBlock(TakieTerraTreeBlocks.KAURI_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block KAURI_SLAB = registerBlock("kauri_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block KAURI_BUTTON = registerBlock("kauri_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block KAURI_PRESSURE_PLATE = registerBlock("kauri_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block KAURI_FENCE = registerBlock("kauri_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block KAURI_FENCE_GATE = registerBlock("kauri_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block KAURI_DOOR = registerBlock("kauri_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block KAURI_TRAPDOOR = registerBlock("kauri_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block KAURI_SIGN = registerBlockWithoutBlockItem("kauri_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.KAURI));
    public static final Block KAURI_HANGING_SIGN = registerBlockWithoutBlockItem("kauri_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.KAURI));
    public static final Block KAURI_WALL_SIGN = registerBlockWithoutBlockItem("kauri_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(KAURI_SIGN), TakieTerraWoodTypes.KAURI));
    public static final Block KAURI_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("kauri_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(KAURI_HANGING_SIGN), TakieTerraWoodTypes.KAURI));


    // BALD CYPRESS

    public static final Block BALD_CYPRESS_LOG = registerBlock("bald_cypress_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block BALD_CYPRESS_WOOD = registerBlock("bald_cypress_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_BALD_CYPRESS_LOG = registerBlock("stripped_bald_cypress_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_BALD_CYPRESS_WOOD = registerBlock("stripped_bald_cypress_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block BALD_CYPRESS_PLANKS = registerBlock("bald_cypress_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BALD_CYPRESS_LEAVES = registerBlock("bald_cypress_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block BALD_CYPRESS_SAPLING = registerBlock("bald_cypress_sapling",
            new SaplingBlock(new BaldCypressSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.DARK_OAK_SAPLING)));
    public static final Block POTTED_BALD_CYPRESS_SAPLING = registerBlockWithoutBlockItem("potted_bald_cypress_sapling",
            new FlowerPotBlock(BALD_CYPRESS_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_DARK_OAK_SAPLING)));


    public static final Block BALD_CYPRESS_STAIRS = registerBlock("bald_cypress_stairs",
            new StairsBlock(TakieTerraTreeBlocks.BALD_CYPRESS_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block BALD_CYPRESS_SLAB = registerBlock("bald_cypress_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block BALD_CYPRESS_BUTTON = registerBlock("bald_cypress_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block BALD_CYPRESS_PRESSURE_PLATE = registerBlock("bald_cypress_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block BALD_CYPRESS_FENCE = registerBlock("bald_cypress_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block BALD_CYPRESS_FENCE_GATE = registerBlock("bald_cypress_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block BALD_CYPRESS_DOOR = registerBlock("bald_cypress_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block BALD_CYPRESS_TRAPDOOR = registerBlock("bald_cypress_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block BALD_CYPRESS_SIGN = registerBlockWithoutBlockItem("bald_cypress_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.BALD_CYPRESS));
    public static final Block BALD_CYPRESS_HANGING_SIGN = registerBlockWithoutBlockItem("bald_cypress_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.BALD_CYPRESS));
    public static final Block BALD_CYPRESS_WALL_SIGN = registerBlockWithoutBlockItem("bald_cypress_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(BALD_CYPRESS_SIGN), TakieTerraWoodTypes.BALD_CYPRESS));
    public static final Block BALD_CYPRESS_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("bald_cypress_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(BALD_CYPRESS_HANGING_SIGN), TakieTerraWoodTypes.BALD_CYPRESS));

    // STEWARTIA

    public static final Block STEWARTIA_LOG = registerBlock("stewartia_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block STEWARTIA_WOOD = registerBlock("stewartia_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_STEWARTIA_LOG = registerBlock("stripped_stewartia_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_STEWARTIA_WOOD = registerBlock("stripped_stewartia_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block STEWARTIA_PLANKS = registerBlock("stewartia_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block STEWARTIA_LEAVES = registerBlock("stewartia_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block STEWARTIA_LEAVES_FLOWERING = registerBlock("stewartia_leaves_flowering",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block STEWARTIA_SAPLING = registerBlock("stewartia_sapling",
            new SaplingBlock(new StewartiaSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.DARK_OAK_SAPLING)));
    public static final Block POTTED_STEWARTIA_SAPLING = registerBlockWithoutBlockItem("potted_stewartia_sapling",
            new FlowerPotBlock(STEWARTIA_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_DARK_OAK_SAPLING)));


    public static final Block STEWARTIA_STAIRS = registerBlock("stewartia_stairs",
            new StairsBlock(TakieTerraTreeBlocks.STEWARTIA_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block STEWARTIA_SLAB = registerBlock("stewartia_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block STEWARTIA_BUTTON = registerBlock("stewartia_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block STEWARTIA_PRESSURE_PLATE = registerBlock("stewartia_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block STEWARTIA_FENCE = registerBlock("stewartia_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block STEWARTIA_FENCE_GATE = registerBlock("stewartia_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block STEWARTIA_DOOR = registerBlock("stewartia_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block STEWARTIA_TRAPDOOR = registerBlock("stewartia_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block STEWARTIA_SIGN = registerBlockWithoutBlockItem("stewartia_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.STEWARTIA));
    public static final Block STEWARTIA_HANGING_SIGN = registerBlockWithoutBlockItem("stewartia_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.STEWARTIA));
    public static final Block STEWARTIA_WALL_SIGN = registerBlockWithoutBlockItem("stewartia_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(STEWARTIA_SIGN), TakieTerraWoodTypes.STEWARTIA));
    public static final Block STEWARTIA_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("stewartia_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(STEWARTIA_HANGING_SIGN), TakieTerraWoodTypes.STEWARTIA));


    // AUTUMN STEWARTIA

    public static final Block AUTUMN_STEWARTIA_LOG = registerBlock("autumn_stewartia_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block AUTUMN_STEWARTIA_WOOD = registerBlock("autumn_stewartia_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_AUTUMN_STEWARTIA_LOG = registerBlock("stripped_autumn_stewartia_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_AUTUMN_STEWARTIA_WOOD = registerBlock("stripped_autumn_stewartia_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block AUTUMN_STEWARTIA_PLANKS = registerBlock("autumn_stewartia_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block AUTUMN_STEWARTIA_LEAVES = registerBlock("autumn_stewartia_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block AUTUMN_STEWARTIA_SAPLING = registerBlock("autumn_stewartia_sapling",
            new SaplingBlock(new AutumnStewartiaSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_AUTUMN_STEWARTIA_SAPLING = registerBlockWithoutBlockItem("potted_autumn_stewartia_sapling",
            new FlowerPotBlock(AUTUMN_STEWARTIA_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));


    public static final Block AUTUMN_STEWARTIA_STAIRS = registerBlock("autumn_stewartia_stairs",
            new StairsBlock(TakieTerraTreeBlocks.AUTUMN_STEWARTIA_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block AUTUMN_STEWARTIA_SLAB = registerBlock("autumn_stewartia_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block AUTUMN_STEWARTIA_BUTTON = registerBlock("autumn_stewartia_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block AUTUMN_STEWARTIA_PRESSURE_PLATE = registerBlock("autumn_stewartia_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block AUTUMN_STEWARTIA_FENCE = registerBlock("autumn_stewartia_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block AUTUMN_STEWARTIA_FENCE_GATE = registerBlock("autumn_stewartia_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block AUTUMN_STEWARTIA_DOOR = registerBlock("autumn_stewartia_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block AUTUMN_STEWARTIA_TRAPDOOR = registerBlock("autumn_stewartia_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block AUTUMN_STEWARTIA_SIGN = registerBlockWithoutBlockItem("autumn_stewartia_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.AUTUMN_STEWARTIA));
    public static final Block AUTUMN_STEWARTIA_HANGING_SIGN = registerBlockWithoutBlockItem("autumn_stewartia_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.AUTUMN_STEWARTIA));
    public static final Block AUTUMN_STEWARTIA_WALL_SIGN = registerBlockWithoutBlockItem("autumn_stewartia_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(AUTUMN_STEWARTIA_SIGN), TakieTerraWoodTypes.AUTUMN_STEWARTIA));
    public static final Block AUTUMN_STEWARTIA_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("autumn_stewartia_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(AUTUMN_STEWARTIA_HANGING_SIGN), TakieTerraWoodTypes.AUTUMN_STEWARTIA));


    //AUTUMN ZELKOVA
    public static final Block AUTUMN_ZELKOVA_LOG = registerBlock("autumn_zelkova_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block AUTUMN_ZELKOVA_WOOD = registerBlock("autumn_zelkova_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_AUTUMN_ZELKOVA_LOG = registerBlock("stripped_autumn_zelkova_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_AUTUMN_ZELKOVA_WOOD = registerBlock("stripped_autumn_zelkova_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block AUTUMN_ZELKOVA_PLANKS = registerBlock("autumn_zelkova_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block AUTUMN_ZELKOVA_LEAVES = registerBlock("autumn_zelkova_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block AUTUMN_ZELKOVA_SAPLING = registerBlock("autumn_zelkova_sapling",
            new SaplingBlock(new AutumnZelkovaSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_AUTUMN_ZELKOVA_SAPLING = registerBlockWithoutBlockItem("potted_autumn_zelkova_sapling",
            new FlowerPotBlock(AUTUMN_ZELKOVA_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));


    public static final Block AUTUMN_ZELKOVA_STAIRS = registerBlock("autumn_zelkova_stairs",
            new StairsBlock(TakieTerraTreeBlocks.AUTUMN_ZELKOVA_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block AUTUMN_ZELKOVA_SLAB = registerBlock("autumn_zelkova_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block AUTUMN_ZELKOVA_BUTTON = registerBlock("autumn_zelkova_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block AUTUMN_ZELKOVA_PRESSURE_PLATE = registerBlock("autumn_zelkova_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block AUTUMN_ZELKOVA_FENCE = registerBlock("autumn_zelkova_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block AUTUMN_ZELKOVA_FENCE_GATE = registerBlock("autumn_zelkova_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block AUTUMN_ZELKOVA_DOOR = registerBlock("autumn_zelkova_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block AUTUMN_ZELKOVA_TRAPDOOR = registerBlock("autumn_zelkova_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block AUTUMN_ZELKOVA_SIGN = registerBlockWithoutBlockItem("autumn_zelkova_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.AUTUMN_ZELKOVA));
    public static final Block AUTUMN_ZELKOVA_HANGING_SIGN = registerBlockWithoutBlockItem("autumn_zelkova_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.AUTUMN_ZELKOVA));
    public static final Block AUTUMN_ZELKOVA_WALL_SIGN = registerBlockWithoutBlockItem("autumn_zelkova_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(AUTUMN_ZELKOVA_SIGN), TakieTerraWoodTypes.AUTUMN_ZELKOVA));
    public static final Block AUTUMN_ZELKOVA_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("autumn_zelkova_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(AUTUMN_ZELKOVA_HANGING_SIGN), TakieTerraWoodTypes.AUTUMN_ZELKOVA));


    //ZELKOVA
    public static final Block ZELKOVA_LOG = registerBlock("zelkova_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block ZELKOVA_WOOD = registerBlock("zelkova_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_ZELKOVA_LOG = registerBlock("stripped_zelkova_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_ZELKOVA_WOOD = registerBlock("stripped_zelkova_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block ZELKOVA_PLANKS = registerBlock("zelkova_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block ZELKOVA_LEAVES = registerBlock("zelkova_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block ZELKOVA_SAPLING = registerBlock("zelkova_sapling",
            new SaplingBlock(new ZelkovaSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.DARK_OAK_SAPLING)));
    public static final Block POTTED_ZELKOVA_SAPLING = registerBlockWithoutBlockItem("potted_zelkova_sapling",
            new FlowerPotBlock(ZELKOVA_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_DARK_OAK_SAPLING)));


    public static final Block ZELKOVA_STAIRS = registerBlock("zelkova_stairs",
            new StairsBlock(TakieTerraTreeBlocks.ZELKOVA_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block ZELKOVA_SLAB = registerBlock("zelkova_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block ZELKOVA_BUTTON = registerBlock("zelkova_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block ZELKOVA_PRESSURE_PLATE = registerBlock("zelkova_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block ZELKOVA_FENCE = registerBlock("zelkova_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block ZELKOVA_FENCE_GATE = registerBlock("zelkova_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block ZELKOVA_DOOR = registerBlock("zelkova_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block ZELKOVA_TRAPDOOR = registerBlock("zelkova_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block ZELKOVA_SIGN = registerBlockWithoutBlockItem("zelkova_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.ZELKOVA));
    public static final Block ZELKOVA_HANGING_SIGN = registerBlockWithoutBlockItem("zelkova_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.ZELKOVA));
    public static final Block ZELKOVA_WALL_SIGN = registerBlockWithoutBlockItem("zelkova_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(ZELKOVA_SIGN), TakieTerraWoodTypes.ZELKOVA));
    public static final Block ZELKOVA_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("zelkova_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(ZELKOVA_HANGING_SIGN), TakieTerraWoodTypes.ZELKOVA));

    //JUNIPER
    public static final Block JUNIPER_LOG = registerBlock("juniper_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block JUNIPER_WOOD = registerBlock("juniper_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_JUNIPER_LOG = registerBlock("stripped_juniper_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_JUNIPER_WOOD = registerBlock("stripped_juniper_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block JUNIPER_PLANKS = registerBlock("juniper_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block JUNIPER_LEAVES = registerBlock("juniper_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block JUNIPER_LEAVES_BERRIES = registerBlock("juniper_leaves_berries",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block JUNIPER_SAPLING = registerBlock("juniper_sapling",
            new SaplingBlock(new JuniperSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.DARK_OAK_SAPLING)));
    public static final Block POTTED_JUNIPER_SAPLING = registerBlockWithoutBlockItem("potted_juniper_sapling",
            new FlowerPotBlock(JUNIPER_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_DARK_OAK_SAPLING)));


    public static final Block JUNIPER_STAIRS = registerBlock("juniper_stairs",
            new StairsBlock(TakieTerraTreeBlocks.JUNIPER_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block JUNIPER_SLAB = registerBlock("juniper_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block JUNIPER_BUTTON = registerBlock("juniper_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block JUNIPER_PRESSURE_PLATE = registerBlock("juniper_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block JUNIPER_FENCE = registerBlock("juniper_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block JUNIPER_FENCE_GATE = registerBlock("juniper_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block JUNIPER_DOOR = registerBlock("juniper_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block JUNIPER_TRAPDOOR = registerBlock("juniper_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block JUNIPER_SIGN = registerBlockWithoutBlockItem("juniper_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.JUNIPER));
    public static final Block JUNIPER_HANGING_SIGN = registerBlockWithoutBlockItem("juniper_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.JUNIPER));
    public static final Block JUNIPER_WALL_SIGN = registerBlockWithoutBlockItem("juniper_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(JUNIPER_SIGN), TakieTerraWoodTypes.JUNIPER));
    public static final Block JUNIPER_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("juniper_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(JUNIPER_HANGING_SIGN), TakieTerraWoodTypes.JUNIPER));

    //LARCH
    public static final Block LARCH_LOG = registerBlock("larch_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block LARCH_WOOD = registerBlock("larch_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_LARCH_LOG = registerBlock("stripped_larch_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_LARCH_WOOD = registerBlock("stripped_larch_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block LARCH_PLANKS = registerBlock("larch_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block LARCH_LEAVES = registerBlock("larch_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block LARCH_SAPLING = registerBlock("larch_sapling",
            new SaplingBlock(new LarchSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.DARK_OAK_SAPLING)));
    public static final Block POTTED_LARCH_SAPLING = registerBlockWithoutBlockItem("potted_larch_sapling",
            new FlowerPotBlock(LARCH_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_DARK_OAK_SAPLING)));


    public static final Block LARCH_STAIRS = registerBlock("larch_stairs",
            new StairsBlock(TakieTerraTreeBlocks.LARCH_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block LARCH_SLAB = registerBlock("larch_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block LARCH_BUTTON = registerBlock("larch_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block LARCH_PRESSURE_PLATE = registerBlock("larch_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block LARCH_FENCE = registerBlock("larch_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block LARCH_FENCE_GATE = registerBlock("larch_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block LARCH_DOOR = registerBlock("larch_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block LARCH_TRAPDOOR = registerBlock("larch_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block LARCH_SIGN = registerBlockWithoutBlockItem("larch_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.LARCH));
    public static final Block LARCH_HANGING_SIGN = registerBlockWithoutBlockItem("larch_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.LARCH));
    public static final Block LARCH_WALL_SIGN = registerBlockWithoutBlockItem("larch_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(LARCH_SIGN), TakieTerraWoodTypes.LARCH));
    public static final Block LARCH_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("larch_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(LARCH_HANGING_SIGN), TakieTerraWoodTypes.LARCH));




    //FLAMEBARK
    public static final Block FLAMEBARK_LOG = registerBlock("flamebark_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).luminance(10)));
    public static final Block FLAMEBARK_WOOD = registerBlock("flamebark_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).luminance(10)));
    public static final Block STRIPPED_FLAMEBARK_LOG = registerBlock("stripped_flamebark_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).luminance(10)));
    public static final Block STRIPPED_FLAMEBARK_WOOD = registerBlock("stripped_flamebark_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).luminance(10)));

    public static final Block FLAMEBARK_PLANKS_ASHEN = registerBlock("flamebark_planks_ashen",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block FLAMEBARK_PLANKS_IGNITED = registerBlock("flamebark_planks_ignited",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).luminance(10)));
    public static final Block FLAMEBARK_LEAVES_IGNITED = registerBlock("flamebark_leaves_ignited",
            new FlamebarkLeaves(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).luminance(15)));
    public static final Block FLAMEBARK_LEAVES_SMOLDERING = registerBlock("flamebark_leaves_smoldering",
            new FlamebarkLeaves(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).luminance(5)));
    public static final Block FLAMEBARK_LEAVES_ASHEN = registerBlock("flamebark_leaves_ashen",
            new FlamebarkLeaves(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block FLAMEBARK_SAPLING = registerBlock("flamebark_sapling",
            new StoneSapling(new FlamebarkSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).luminance(10)));
    public static final Block POTTED_FLAMEBARK_SAPLING = registerBlockWithoutBlockItem("potted_flamebark_sapling",
            new FlowerPotBlock(FLAMEBARK_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING).luminance(10)));

    public static final Block FLAMEBARK_STAIRS = registerBlock("flamebark_stairs",
            new StairsBlock(TakieTerraTreeBlocks.FLAMEBARK_PLANKS_ASHEN.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block FLAMEBARK_SLAB = registerBlock("flamebark_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block FLAMEBARK_BUTTON = registerBlock("flamebark_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block FLAMEBARK_PRESSURE_PLATE = registerBlock("flamebark_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block FLAMEBARK_FENCE = registerBlock("flamebark_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block FLAMEBARK_FENCE_GATE = registerBlock("flamebark_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block FLAMEBARK_DOOR = registerBlock("flamebark_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block FLAMEBARK_TRAPDOOR = registerBlock("flamebark_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block FLAMEBARK_SIGN = registerBlockWithoutBlockItem("flamebark_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.FLAMEBARK));
    public static final Block FLAMEBARK_HANGING_SIGN = registerBlockWithoutBlockItem("flamebark_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.FLAMEBARK));
    public static final Block FLAMEBARK_WALL_SIGN = registerBlockWithoutBlockItem("flamebark_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(FLAMEBARK_SIGN), TakieTerraWoodTypes.FLAMEBARK));
    public static final Block FLAMEBARK_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("flamebark_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(FLAMEBARK_HANGING_SIGN), TakieTerraWoodTypes.FLAMEBARK));


    //ZISSIAN

    public static final Block ZISSIAN_LOG = registerBlock("zissian_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block ZISSIAN_WOOD = registerBlock("zissian_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_ZISSIAN_LOG = registerBlock("stripped_zissian_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_ZISSIAN_WOOD = registerBlock("stripped_zissian_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block ZISSIAN_PLANKS = registerBlock("zissian_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block ZISSIAN_LEAVES = registerBlock("zissian_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block ZISSIAN_SAPLING = registerBlock("zissian_sapling",
            new DesertSapling(new ZissianSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_ZISSIAN_SAPLING = registerBlockWithoutBlockItem("potted_zissian_sapling",
            new FlowerPotBlock(ZISSIAN_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));


    public static final Block ZISSIAN_STAIRS = registerBlock("zissian_stairs",
            new StairsBlock(TakieTerraTreeBlocks.ZISSIAN_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block ZISSIAN_SLAB = registerBlock("zissian_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block ZISSIAN_BUTTON = registerBlock("zissian_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block ZISSIAN_PRESSURE_PLATE = registerBlock("zissian_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block ZISSIAN_FENCE = registerBlock("zissian_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block ZISSIAN_FENCE_GATE = registerBlock("zissian_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block ZISSIAN_DOOR = registerBlock("zissian_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block ZISSIAN_TRAPDOOR = registerBlock("zissian_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block ZISSIAN_SIGN = registerBlockWithoutBlockItem("zissian_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.ZISSIAN));
    public static final Block ZISSIAN_HANGING_SIGN = registerBlockWithoutBlockItem("zissian_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.ZISSIAN));
    public static final Block ZISSIAN_WALL_SIGN = registerBlockWithoutBlockItem("zissian_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(ZISSIAN_SIGN), TakieTerraWoodTypes.ZISSIAN));
    public static final Block ZISSIAN_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("zissian_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(ZISSIAN_HANGING_SIGN), TakieTerraWoodTypes.ZISSIAN));


    //REDWOOD
    public static final Block REDWOOD_LOG = registerBlock("redwood_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block REDWOOD_WOOD = registerBlock("redwood_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_REDWOOD_LOG = registerBlock("stripped_redwood_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_REDWOOD_WOOD = registerBlock("stripped_redwood_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block REDWOOD_PLANKS = registerBlock("redwood_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block REDWOOD_LEAVES = registerBlock("redwood_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block REDWOOD_SAPLING = registerBlock("redwood_sapling",
            new DesertSapling(new RedwoodSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_REDWOOD_SAPLING = registerBlockWithoutBlockItem("potted_redwood_sapling",
            new FlowerPotBlock(REDWOOD_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));


    public static final Block REDWOOD_STAIRS = registerBlock("redwood_stairs",
            new StairsBlock(TakieTerraTreeBlocks.REDWOOD_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block REDWOOD_SLAB = registerBlock("redwood_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block REDWOOD_BUTTON = registerBlock("redwood_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block REDWOOD_PRESSURE_PLATE = registerBlock("redwood_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block REDWOOD_FENCE = registerBlock("redwood_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block REDWOOD_FENCE_GATE = registerBlock("redwood_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block REDWOOD_DOOR = registerBlock("redwood_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block REDWOOD_TRAPDOOR = registerBlock("redwood_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block REDWOOD_SIGN = registerBlockWithoutBlockItem("redwood_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.REDWOOD));
    public static final Block REDWOOD_HANGING_SIGN = registerBlockWithoutBlockItem("redwood_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.REDWOOD));
    public static final Block REDWOOD_WALL_SIGN = registerBlockWithoutBlockItem("redwood_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(REDWOOD_SIGN), TakieTerraWoodTypes.REDWOOD));
    public static final Block REDWOOD_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("redwood_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(REDWOOD_HANGING_SIGN), TakieTerraWoodTypes.REDWOOD));


    //GIANT SEQUOIA
    public static final Block SEQUOIA_LOG = registerBlock("sequoia_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block SEQUOIA_WOOD = registerBlock("sequoia_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_SEQUOIA_LOG = registerBlock("stripped_sequoia_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_SEQUOIA_WOOD = registerBlock("stripped_sequoia_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block SEQUOIA_PLANKS = registerBlock("sequoia_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block SEQUOIA_LEAVES = registerBlock("sequoia_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block SEQUOIA_SAPLING = registerBlock("sequoia_sapling",
            new DesertSapling(new SequoiaSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_SEQUOIA_SAPLING = registerBlockWithoutBlockItem("potted_sequoia_sapling",
            new FlowerPotBlock(SEQUOIA_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));


    public static final Block SEQUOIA_STAIRS = registerBlock("sequoia_stairs",
            new StairsBlock(TakieTerraTreeBlocks.SEQUOIA_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block SEQUOIA_SLAB = registerBlock("sequoia_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block SEQUOIA_BUTTON = registerBlock("sequoia_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block SEQUOIA_PRESSURE_PLATE = registerBlock("sequoia_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block SEQUOIA_FENCE = registerBlock("sequoia_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block SEQUOIA_FENCE_GATE = registerBlock("sequoia_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block SEQUOIA_DOOR = registerBlock("sequoia_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block SEQUOIA_TRAPDOOR = registerBlock("sequoia_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block SEQUOIA_SIGN = registerBlockWithoutBlockItem("sequoia_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.SEQUOIA));
    public static final Block SEQUOIA_HANGING_SIGN = registerBlockWithoutBlockItem("sequoia_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN).mapColor(MapColor.TERRACOTTA_ORANGE), TakieTerraWoodTypes.SEQUOIA));
    public static final Block SEQUOIA_WALL_SIGN = registerBlockWithoutBlockItem("sequoia_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(SEQUOIA_SIGN), TakieTerraWoodTypes.SEQUOIA));
    public static final Block SEQUOIA_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("sequoia_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(SEQUOIA_HANGING_SIGN), TakieTerraWoodTypes.SEQUOIA));


    //PECAN
    public static final Block PECAN_LOG = registerBlock("pecan_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block PECAN_WOOD = registerBlock("pecan_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_PECAN_LOG = registerBlock("stripped_pecan_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_PECAN_WOOD = registerBlock("stripped_pecan_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block PECAN_PLANKS = registerBlock("pecan_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PECAN_LEAVES = registerBlock("pecan_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));

    public static final Block PECAN_SAPLING = registerBlock("pecan_sapling",
            new SaplingBlock(new PecanSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_PECAN_SAPLING = registerBlockWithoutBlockItem("potted_pecan_sapling",
            new FlowerPotBlock(PECAN_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));

    public static final Block PECAN_STAIRS = registerBlock("pecan_stairs",
            new StairsBlock(TakieTerraTreeBlocks.PECAN_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block PECAN_SLAB = registerBlock("pecan_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block PECAN_BUTTON = registerBlock("pecan_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block PECAN_PRESSURE_PLATE = registerBlock("pecan_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block PECAN_FENCE = registerBlock("pecan_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block PECAN_FENCE_GATE = registerBlock("pecan_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block PECAN_DOOR = registerBlock("pecan_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block PECAN_TRAPDOOR = registerBlock("pecan_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block PECAN_SIGN = registerBlockWithoutBlockItem("pecan_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.PECAN));
    public static final Block PECAN_HANGING_SIGN = registerBlockWithoutBlockItem("pecan_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.PECAN));
    public static final Block PECAN_WALL_SIGN = registerBlockWithoutBlockItem("pecan_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(PECAN_SIGN), TakieTerraWoodTypes.PECAN));
    public static final Block PECAN_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("pecan_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(PECAN_HANGING_SIGN), TakieTerraWoodTypes.PECAN));


    //MIMOSA
    public static final Block MIMOSA_LOG = registerBlock("mimosa_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block MIMOSA_WOOD = registerBlock("mimosa_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_MIMOSA_LOG = registerBlock("stripped_mimosa_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_MIMOSA_WOOD = registerBlock("stripped_mimosa_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block MIMOSA_PLANKS = registerBlock("mimosa_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block MIMOSA_LEAVES = registerBlock("mimosa_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block MIMOSA_LEAVES_FLOWERING = registerBlock("mimosa_leaves_flowering",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));

    public static final Block MIMOSA_SAPLING = registerBlock("mimosa_sapling",
            new SaplingBlock(new MimosaSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_MIMOSA_SAPLING = registerBlockWithoutBlockItem("potted_mimosa_sapling",
            new FlowerPotBlock(MIMOSA_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));

    public static final Block MIMOSA_STAIRS = registerBlock("mimosa_stairs",
            new StairsBlock(TakieTerraTreeBlocks.MIMOSA_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block MIMOSA_SLAB = registerBlock("mimosa_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block MIMOSA_BUTTON = registerBlock("mimosa_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block MIMOSA_PRESSURE_PLATE = registerBlock("mimosa_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block MIMOSA_FENCE = registerBlock("mimosa_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block MIMOSA_FENCE_GATE = registerBlock("mimosa_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block MIMOSA_DOOR = registerBlock("mimosa_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block MIMOSA_TRAPDOOR = registerBlock("mimosa_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block MIMOSA_SIGN = registerBlockWithoutBlockItem("mimosa_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.MIMOSA));
    public static final Block MIMOSA_HANGING_SIGN = registerBlockWithoutBlockItem("mimosa_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.MIMOSA));
    public static final Block MIMOSA_WALL_SIGN = registerBlockWithoutBlockItem("mimosa_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(MIMOSA_SIGN), TakieTerraWoodTypes.MIMOSA));
    public static final Block MIMOSA_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("mimosa_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(MIMOSA_HANGING_SIGN), TakieTerraWoodTypes.MIMOSA));


    //NEBRA
    public static final Block NEBRA_LOG = registerBlock("nebra_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block NEBRA_WOOD = registerBlock("nebra_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_NEBRA_LOG = registerBlock("stripped_nebra_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_NEBRA_WOOD = registerBlock("stripped_nebra_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block NEBRA_PLANKS = registerBlock("nebra_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block NEBRA_LEAVES = registerBlock("nebra_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));

    public static final Block NEBRA_SAPLING = registerBlock("nebra_sapling",
            new SaplingBlock(new NebraSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_NEBRA_SAPLING = registerBlockWithoutBlockItem("potted_nebra_sapling",
            new FlowerPotBlock(NEBRA_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));

    public static final Block NEBRA_STAIRS = registerBlock("nebra_stairs",
            new StairsBlock(TakieTerraTreeBlocks.NEBRA_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block NEBRA_SLAB = registerBlock("nebra_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block NEBRA_BUTTON = registerBlock("nebra_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block NEBRA_PRESSURE_PLATE = registerBlock("nebra_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block NEBRA_FENCE = registerBlock("nebra_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block NEBRA_FENCE_GATE = registerBlock("nebra_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block NEBRA_DOOR = registerBlock("nebra_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block NEBRA_TRAPDOOR = registerBlock("nebra_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block NEBRA_SIGN = registerBlockWithoutBlockItem("nebra_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.NEBRA));
    public static final Block NEBRA_HANGING_SIGN = registerBlockWithoutBlockItem("nebra_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.NEBRA));
    public static final Block NEBRA_WALL_SIGN = registerBlockWithoutBlockItem("nebra_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(NEBRA_SIGN), TakieTerraWoodTypes.NEBRA));
    public static final Block NEBRA_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("nebra_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(NEBRA_HANGING_SIGN), TakieTerraWoodTypes.NEBRA));


    //WITCH HAZEL
    public static final Block WITCH_HAZEL_LOG = registerBlock("witch_hazel_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block WITCH_HAZEL_WOOD = registerBlock("witch_hazel_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_WITCH_HAZEL_LOG = registerBlock("stripped_witch_hazel_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_WITCH_HAZEL_WOOD = registerBlock("stripped_witch_hazel_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block WITCH_HAZEL_PLANKS = registerBlock("witch_hazel_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WITCH_HAZEL_LEAVES = registerBlock("witch_hazel_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block WITCH_HAZEL_SAPLING = registerBlock("witch_hazel_sapling",
            new SaplingBlock(new WitchHazelSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.DARK_OAK_SAPLING)));
    public static final Block POTTED_WITCH_HAZEL_SAPLING = registerBlockWithoutBlockItem("potted_witch_hazel_sapling",
            new FlowerPotBlock(WITCH_HAZEL_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_DARK_OAK_SAPLING)));


    public static final Block WITCH_HAZEL_STAIRS = registerBlock("witch_hazel_stairs",
            new StairsBlock(TakieTerraTreeBlocks.WITCH_HAZEL_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block WITCH_HAZEL_SLAB = registerBlock("witch_hazel_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block WITCH_HAZEL_BUTTON = registerBlock("witch_hazel_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block WITCH_HAZEL_PRESSURE_PLATE = registerBlock("witch_hazel_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block WITCH_HAZEL_FENCE = registerBlock("witch_hazel_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block WITCH_HAZEL_FENCE_GATE = registerBlock("witch_hazel_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block WITCH_HAZEL_DOOR = registerBlock("witch_hazel_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block WITCH_HAZEL_TRAPDOOR = registerBlock("witch_hazel_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block WITCH_HAZEL_SIGN = registerBlockWithoutBlockItem("witch_hazel_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.WITCH_HAZEL));
    public static final Block WITCH_HAZEL_HANGING_SIGN = registerBlockWithoutBlockItem("witch_hazel_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.WITCH_HAZEL));
    public static final Block WITCH_HAZEL_WALL_SIGN = registerBlockWithoutBlockItem("witch_hazel_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(WITCH_HAZEL_SIGN), TakieTerraWoodTypes.WITCH_HAZEL));
    public static final Block WITCH_HAZEL_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("witch_hazel_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(WITCH_HAZEL_HANGING_SIGN), TakieTerraWoodTypes.WITCH_HAZEL));



    //FLAMINGO TOONA
    public static final Block TOONA_LOG = registerBlock("toona_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LOG)));
    public static final Block TOONA_WOOD = registerBlock("toona_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_WOOD)));
    public static final Block STRIPPED_TOONA_LOG = registerBlock("stripped_toona_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_LOG)));
    public static final Block STRIPPED_TOONA_WOOD = registerBlock("stripped_toona_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_WOOD)));

    public static final Block TOONA_PLANKS = registerBlock("toona_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));
    public static final Block TOONA_LEAVES = registerBlock("toona_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LEAVES).mapColor(MapColor.PALE_PURPLE)));

    public static final Block TOONA_SAPLING = registerBlock("toona_sapling",
            new SaplingBlock(new ToonaSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.CHERRY_SAPLING)));
    public static final Block POTTED_TOONA_SAPLING = registerBlockWithoutBlockItem("potted_toona_sapling",
            new FlowerPotBlock(TOONA_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_CHERRY_SAPLING)));

    public static final Block TOONA_STAIRS = registerBlock("toona_stairs",
            new StairsBlock(TakieTerraTreeBlocks.JACARANDA_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CHERRY_STAIRS)));
    public static final Block TOONA_SLAB = registerBlock("toona_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_SLAB)));
    public static final Block TOONA_BUTTON = registerBlock("toona_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_BUTTON), BlockSetType.CHERRY, 10, true));
    public static final Block TOONA_PRESSURE_PLATE = registerBlock("toona_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.CHERRY_PRESSURE_PLATE), BlockSetType.CHERRY));
    public static final Block TOONA_FENCE = registerBlock("toona_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_FENCE)));
    public static final Block TOONA_FENCE_GATE = registerBlock("toona_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_FENCE_GATE), WoodType.CHERRY));

    public static final Block TOONA_DOOR = registerBlock("toona_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_DOOR), BlockSetType.CHERRY));
    public static final Block TOONA_TRAPDOOR = registerBlock("toona_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_TRAPDOOR), BlockSetType.CHERRY));

    public static final Block TOONA_SIGN = registerBlockWithoutBlockItem("toona_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_SIGN), TakieTerraWoodTypes.TOONA));
    public static final Block TOONA_HANGING_SIGN = registerBlockWithoutBlockItem("toona_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_HANGING_SIGN), TakieTerraWoodTypes.TOONA));
    public static final Block TOONA_WALL_SIGN = registerBlockWithoutBlockItem("toona_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_SIGN).dropsLike(TOONA_SIGN), TakieTerraWoodTypes.TOONA));
    public static final Block TOONA_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("toona_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_WALL_HANGING_SIGN).dropsLike(TOONA_HANGING_SIGN), TakieTerraWoodTypes.TOONA));


    //GHAT
    public static final Block GHAT_LOG = registerBlock("ghat_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block GHAT_WOOD = registerBlock("ghat_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_GHAT_LOG = registerBlock("stripped_ghat_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_GHAT_WOOD = registerBlock("stripped_ghat_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block GHAT_PLANKS = registerBlock("ghat_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GHAT_LEAVES = registerBlock("ghat_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));

    public static final Block GHAT_SAPLING = registerBlock("ghat_sapling",
            new DesertSapling(new GhatSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_GHAT_SAPLING = registerBlockWithoutBlockItem("potted_ghat_sapling",
            new FlowerPotBlock(GHAT_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));

    public static final Block GHAT_STAIRS = registerBlock("ghat_stairs",
            new StairsBlock(TakieTerraTreeBlocks.GHAT_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block GHAT_SLAB = registerBlock("ghat_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block GHAT_BUTTON = registerBlock("ghat_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block GHAT_PRESSURE_PLATE = registerBlock("ghat_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block GHAT_FENCE = registerBlock("ghat_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block GHAT_FENCE_GATE = registerBlock("ghat_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block GHAT_DOOR = registerBlock("ghat_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block GHAT_TRAPDOOR = registerBlock("ghat_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block GHAT_SIGN = registerBlockWithoutBlockItem("ghat_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.GHAT));
    public static final Block GHAT_HANGING_SIGN = registerBlockWithoutBlockItem("ghat_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.GHAT));
    public static final Block GHAT_WALL_SIGN = registerBlockWithoutBlockItem("ghat_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(GHAT_SIGN), TakieTerraWoodTypes.GHAT));
    public static final Block GHAT_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("ghat_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(GHAT_HANGING_SIGN), TakieTerraWoodTypes.GHAT));


    //KOBICHA
    public static final Block KOBICHA_LOG = registerBlock("kobicha_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block KOBICHA_WOOD = registerBlock("kobicha_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_KOBICHA_LOG = registerBlock("stripped_kobicha_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_KOBICHA_WOOD = registerBlock("stripped_kobicha_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block KOBICHA_PLANKS = registerBlock("kobicha_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block KOBICHA_LEAVES = registerBlock("kobicha_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).mapColor(MapColor.GREEN)));

    public static final Block KOBICHA_SAPLING = registerBlock("kobicha_sapling",
            new SaplingBlock(new KobichaSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_KOBICHA_SAPLING = registerBlockWithoutBlockItem("potted_kobicha_sapling",
            new FlowerPotBlock(KOBICHA_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));

    public static final Block KOBICHA_STAIRS = registerBlock("kobicha_stairs",
            new StairsBlock(TakieTerraTreeBlocks.KOBICHA_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block KOBICHA_SLAB = registerBlock("kobicha_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block KOBICHA_BUTTON = registerBlock("kobicha_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block KOBICHA_PRESSURE_PLATE = registerBlock("kobicha_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block KOBICHA_FENCE = registerBlock("kobicha_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block KOBICHA_FENCE_GATE = registerBlock("kobicha_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block KOBICHA_DOOR = registerBlock("kobicha_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block KOBICHA_TRAPDOOR = registerBlock("kobicha_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block KOBICHA_SIGN = registerBlockWithoutBlockItem("kobicha_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.KOBICHA));
    public static final Block KOBICHA_HANGING_SIGN = registerBlockWithoutBlockItem("kobicha_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.KOBICHA));
    public static final Block KOBICHA_WALL_SIGN = registerBlockWithoutBlockItem("kobicha_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(KOBICHA_SIGN), TakieTerraWoodTypes.KOBICHA));
    public static final Block KOBICHA_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("kobicha_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(KOBICHA_HANGING_SIGN), TakieTerraWoodTypes.KOBICHA));


    //BLACK PINE
    public static final Block BLACK_PINE_LOG = registerBlock("black_pine_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block BLACK_PINE_WOOD = registerBlock("black_pine_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_BLACK_PINE_LOG = registerBlock("stripped_black_pine_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_BLACK_PINE_WOOD = registerBlock("stripped_black_pine_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block BLACK_PINE_PLANKS = registerBlock("black_pine_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLACK_PINE_LEAVES = registerBlock("black_pine_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));

    public static final Block BLACK_PINE_SAPLING = registerBlock("black_pine_sapling",
            new DesertSapling(new BlackPineSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_BLACK_PINE_SAPLING = registerBlockWithoutBlockItem("potted_black_pine_sapling",
            new FlowerPotBlock(BLACK_PINE_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));

    public static final Block BLACK_PINE_STAIRS = registerBlock("black_pine_stairs",
            new StairsBlock(TakieTerraTreeBlocks.BLACK_PINE_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block BLACK_PINE_SLAB = registerBlock("black_pine_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block BLACK_PINE_BUTTON = registerBlock("black_pine_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block BLACK_PINE_PRESSURE_PLATE = registerBlock("black_pine_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block BLACK_PINE_FENCE = registerBlock("black_pine_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block BLACK_PINE_FENCE_GATE = registerBlock("black_pine_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block BLACK_PINE_DOOR = registerBlock("black_pine_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block BLACK_PINE_TRAPDOOR = registerBlock("black_pine_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block BLACK_PINE_SIGN = registerBlockWithoutBlockItem("black_pine_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.BLACK_PINE));
    public static final Block BLACK_PINE_HANGING_SIGN = registerBlockWithoutBlockItem("black_pine_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.BLACK_PINE));
    public static final Block BLACK_PINE_WALL_SIGN = registerBlockWithoutBlockItem("black_pine_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(BLACK_PINE_SIGN), TakieTerraWoodTypes.BLACK_PINE));
    public static final Block BLACK_PINE_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("black_pine_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(BLACK_PINE_HANGING_SIGN), TakieTerraWoodTypes.BLACK_PINE));


    //ROYA

    public static final Block ROYA_LOG = registerBlock("roya_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block ROYA_WOOD = registerBlock("roya_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_ROYA_LOG = registerBlock("stripped_roya_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_ROYA_WOOD = registerBlock("stripped_roya_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block ROYA_PLANKS = registerBlock("roya_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block ROYA_LEAVES = registerBlock("roya_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));

    public static final Block ROYA_SAPLING = registerBlock("roya_sapling",
            new SaplingBlock(new RoyaSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_ROYA_SAPLING = registerBlockWithoutBlockItem("potted_roya_sapling",
            new FlowerPotBlock(ROYA_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));

    public static final Block ROYA_STAIRS = registerBlock("roya_stairs",
            new StairsBlock(TakieTerraTreeBlocks.ROYA_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block ROYA_SLAB = registerBlock("roya_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block ROYA_BUTTON = registerBlock("roya_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block ROYA_PRESSURE_PLATE = registerBlock("roya_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block ROYA_FENCE = registerBlock("roya_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block ROYA_FENCE_GATE = registerBlock("roya_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block ROYA_DOOR = registerBlock("roya_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block ROYA_TRAPDOOR = registerBlock("roya_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block ROYA_SIGN = registerBlockWithoutBlockItem("roya_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.ROYA));
    public static final Block ROYA_HANGING_SIGN = registerBlockWithoutBlockItem("roya_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.ROYA));
    public static final Block ROYA_WALL_SIGN = registerBlockWithoutBlockItem("roya_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(ROYA_SIGN), TakieTerraWoodTypes.ROYA));
    public static final Block ROYA_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("roya_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(ROYA_HANGING_SIGN), TakieTerraWoodTypes.ROYA));



    //CASSIA

    public static final Block CASSIA_LOG = registerBlock("cassia_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LOG)));
    public static final Block CASSIA_WOOD = registerBlock("cassia_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_WOOD)));
    public static final Block STRIPPED_CASSIA_LOG = registerBlock("stripped_cassia_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_LOG)));
    public static final Block STRIPPED_CASSIA_WOOD = registerBlock("stripped_cassia_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_WOOD)));

    public static final Block CASSIA_PLANKS = registerBlock("cassia_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));
    public static final Block CASSIA_LEAVES = registerBlock("cassia_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LEAVES).mapColor(MapColor.PALE_PURPLE)));

    public static final Block CASSIA_VINES = registerBlock("cassia_vines",
            new CassiaVine(FabricBlockSettings.create()
                    .mapColor(MapColor.YELLOW)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .ticksRandomly()
                    .noCollision()
                    .nonOpaque()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.CHERRY_LEAVES)));
    public static final Block CASSIA_VINES_PLANT = registerBlock("cassia_vines_plant",
            new CassiaVinePlant(FabricBlockSettings.create()
                    .mapColor(MapColor.YELLOW)
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .ticksRandomly()
                    .noCollision()
                    .nonOpaque()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.CHERRY_LEAVES), TakieTerraTreeBlocks.CASSIA_VINES));

    public static final Block CASSIA_FLOWERS = registerBlock("cassia_flowers",
            new FlowerbedBlock(FabricBlockSettings.copyOf(Blocks.PINK_PETALS)));

    public static final Block CASSIA_SAPLING = registerBlock("cassia_sapling",
            new SaplingBlock(new CassiaSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.CHERRY_SAPLING)));
    public static final Block POTTED_CASSIA_SAPLING = registerBlockWithoutBlockItem("potted_cassia_sapling",
            new FlowerPotBlock(CASSIA_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_CHERRY_SAPLING)));

    public static final Block CASSIA_STAIRS = registerBlock("cassia_stairs",
            new StairsBlock(TakieTerraTreeBlocks.CASSIA_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CHERRY_STAIRS)));
    public static final Block CASSIA_SLAB = registerBlock("cassia_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_SLAB)));
    public static final Block CASSIA_BUTTON = registerBlock("cassia_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_BUTTON), BlockSetType.CHERRY, 10, true));
    public static final Block CASSIA_PRESSURE_PLATE = registerBlock("cassia_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.CHERRY_PRESSURE_PLATE), BlockSetType.CHERRY));
    public static final Block CASSIA_FENCE = registerBlock("cassia_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_FENCE)));
    public static final Block CASSIA_FENCE_GATE = registerBlock("cassia_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_FENCE_GATE), WoodType.CHERRY));

    public static final Block CASSIA_DOOR = registerBlock("cassia_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_DOOR), BlockSetType.CHERRY));
    public static final Block CASSIA_TRAPDOOR = registerBlock("cassia_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_TRAPDOOR), BlockSetType.CHERRY));

    public static final Block CASSIA_SIGN = registerBlockWithoutBlockItem("cassia_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_SIGN), TakieTerraWoodTypes.CASSIA));
    public static final Block CASSIA_HANGING_SIGN = registerBlockWithoutBlockItem("cassia_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_HANGING_SIGN), TakieTerraWoodTypes.CASSIA));
    public static final Block CASSIA_WALL_SIGN = registerBlockWithoutBlockItem("cassia_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_SIGN).dropsLike(CASSIA_SIGN), TakieTerraWoodTypes.CASSIA));
    public static final Block CASSIA_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("cassia_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_WALL_HANGING_SIGN).dropsLike(CASSIA_HANGING_SIGN), TakieTerraWoodTypes.CASSIA));




    //HOLLY

    public static final Block HOLLY_LOG = registerBlock("holly_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block HOLLY_WOOD = registerBlock("holly_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_HOLLY_LOG = registerBlock("stripped_holly_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_HOLLY_WOOD = registerBlock("stripped_holly_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block HOLLY_PLANKS = registerBlock("holly_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block HOLLY_LEAVES = registerBlock("holly_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block HOLLY_SAPLING = registerBlock("holly_sapling",
            new SaplingBlock(new HollySaplingGenerator(), FabricBlockSettings.copyOf(Blocks.DARK_OAK_SAPLING)));
    public static final Block POTTED_HOLLY_SAPLING = registerBlockWithoutBlockItem("potted_holly_sapling",
            new FlowerPotBlock(HOLLY_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_DARK_OAK_SAPLING)));


    public static final Block HOLLY_STAIRS = registerBlock("holly_stairs",
            new StairsBlock(TakieTerraTreeBlocks.HOLLY_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block HOLLY_SLAB = registerBlock("holly_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block HOLLY_BUTTON = registerBlock("holly_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block HOLLY_PRESSURE_PLATE = registerBlock("holly_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block HOLLY_FENCE = registerBlock("holly_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block HOLLY_FENCE_GATE = registerBlock("holly_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block HOLLY_DOOR = registerBlock("holly_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block HOLLY_TRAPDOOR = registerBlock("holly_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block HOLLY_SIGN = registerBlockWithoutBlockItem("holly_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.HOLLY));
    public static final Block HOLLY_HANGING_SIGN = registerBlockWithoutBlockItem("holly_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.HOLLY));
    public static final Block HOLLY_WALL_SIGN = registerBlockWithoutBlockItem("holly_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(HOLLY_SIGN), TakieTerraWoodTypes.HOLLY));
    public static final Block HOLLY_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("holly_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(HOLLY_HANGING_SIGN), TakieTerraWoodTypes.HOLLY));



    //STRAWBERRY
    public static final Block STRAWBERRY_LOG = registerBlock("strawberry_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block STRAWBERRY_WOOD = registerBlock("strawberry_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_STRAWBERRY_LOG = registerBlock("stripped_strawberry_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_STRAWBERRY_WOOD = registerBlock("stripped_strawberry_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block STRAWBERRY_PLANKS = registerBlock("strawberry_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block STRAWBERRY_LEAVES = registerBlock("strawberry_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));

    public static final Block STRAWBERRY_SAPLING = registerBlock("strawberry_sapling",
            new SaplingBlock(new StrawberrySaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_STRAWBERRY_SAPLING = registerBlockWithoutBlockItem("potted_strawberry_sapling",
            new FlowerPotBlock(STRAWBERRY_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));

    public static final Block STRAWBERRY_STAIRS = registerBlock("strawberry_stairs",
            new StairsBlock(TakieTerraTreeBlocks.STRAWBERRY_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block STRAWBERRY_SLAB = registerBlock("strawberry_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block STRAWBERRY_BUTTON = registerBlock("strawberry_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block STRAWBERRY_PRESSURE_PLATE = registerBlock("strawberry_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block STRAWBERRY_FENCE = registerBlock("strawberry_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block STRAWBERRY_FENCE_GATE = registerBlock("strawberry_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block STRAWBERRY_DOOR = registerBlock("strawberry_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block STRAWBERRY_TRAPDOOR = registerBlock("strawberry_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block STRAWBERRY_SIGN = registerBlockWithoutBlockItem("strawberry_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.STRAWBERRY));
    public static final Block STRAWBERRY_HANGING_SIGN = registerBlockWithoutBlockItem("strawberry_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.STRAWBERRY));
    public static final Block STRAWBERRY_WALL_SIGN = registerBlockWithoutBlockItem("strawberry_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(STRAWBERRY_SIGN), TakieTerraWoodTypes.STRAWBERRY));
    public static final Block STRAWBERRY_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("strawberry_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(STRAWBERRY_HANGING_SIGN), TakieTerraWoodTypes.STRAWBERRY));


    //PEONIA
    public static final Block PEONIA_LOG = registerBlock("peonia_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block PEONIA_WOOD = registerBlock("peonia_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_PEONIA_LOG = registerBlock("stripped_peonia_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_PEONIA_WOOD = registerBlock("stripped_peonia_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block PEONIA_PLANKS = registerBlock("peonia_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PEONIA_LEAVES = registerBlock("peonia_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block PEONIA_LEAVES_FLOWERING = registerBlock("peonia_leaves_flowering",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));

    public static final Block PEONIA_SAPLING = registerBlock("peonia_sapling",
            new SaplingBlock(new PeoniaSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_PEONIA_SAPLING = registerBlockWithoutBlockItem("potted_peonia_sapling",
            new FlowerPotBlock(PEONIA_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));

    public static final Block PEONIA_STAIRS = registerBlock("peonia_stairs",
            new StairsBlock(TakieTerraTreeBlocks.PEONIA_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block PEONIA_SLAB = registerBlock("peonia_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block PEONIA_BUTTON = registerBlock("peonia_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block PEONIA_PRESSURE_PLATE = registerBlock("peonia_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block PEONIA_FENCE = registerBlock("peonia_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block PEONIA_FENCE_GATE = registerBlock("peonia_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block PEONIA_DOOR = registerBlock("peonia_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block PEONIA_TRAPDOOR = registerBlock("peonia_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block PEONIA_SIGN = registerBlockWithoutBlockItem("peonia_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.PEONIA));
    public static final Block PEONIA_HANGING_SIGN = registerBlockWithoutBlockItem("peonia_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.PEONIA));
    public static final Block PEONIA_WALL_SIGN = registerBlockWithoutBlockItem("peonia_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(PEONIA_SIGN), TakieTerraWoodTypes.PEONIA));
    public static final Block PEONIA_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("peonia_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(PEONIA_HANGING_SIGN), TakieTerraWoodTypes.PEONIA));


    //CEDAR
    public static final Block CEDAR_LOG = registerBlock("cedar_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block CEDAR_WOOD = registerBlock("cedar_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_CEDAR_LOG = registerBlock("stripped_cedar_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_CEDAR_WOOD = registerBlock("stripped_cedar_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block CEDAR_PLANKS = registerBlock("cedar_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block CEDAR_LEAVES = registerBlock("cedar_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block CEDAR_SAPLING = registerBlock("cedar_sapling",
            new SaplingBlock(new CedarSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.DARK_OAK_SAPLING)));
    public static final Block POTTED_CEDAR_SAPLING = registerBlockWithoutBlockItem("potted_cedar_sapling",
            new FlowerPotBlock(CEDAR_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_DARK_OAK_SAPLING)));


    public static final Block CEDAR_STAIRS = registerBlock("cedar_stairs",
            new StairsBlock(TakieTerraTreeBlocks.CEDAR_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block CEDAR_SLAB = registerBlock("cedar_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block CEDAR_BUTTON = registerBlock("cedar_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block CEDAR_PRESSURE_PLATE = registerBlock("cedar_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block CEDAR_FENCE = registerBlock("cedar_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block CEDAR_FENCE_GATE = registerBlock("cedar_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));

    public static final Block CEDAR_DOOR = registerBlock("cedar_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block CEDAR_TRAPDOOR = registerBlock("cedar_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final Block CEDAR_SIGN = registerBlockWithoutBlockItem("cedar_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.CEDAR));
    public static final Block CEDAR_HANGING_SIGN = registerBlockWithoutBlockItem("cedar_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.CEDAR));
    public static final Block CEDAR_WALL_SIGN = registerBlockWithoutBlockItem("cedar_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(CEDAR_SIGN), TakieTerraWoodTypes.CEDAR));
    public static final Block CEDAR_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("cedar_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(CEDAR_HANGING_SIGN), TakieTerraWoodTypes.CEDAR));



    //CHISAI MAPLE

    //RED MAPLE
    public static final Block CHISAI_LOG = registerBlock("chisai_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block CHISAI_WOOD = registerBlock("chisai_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_CHISAI_LOG = registerBlock("stripped_chisai_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_CHISAI_WOOD = registerBlock("stripped_chisai_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block CHISAI_PLANKS = registerBlock("chisai_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block CHISAI_LEAVES_GREEN = registerBlock("chisai_leaves_green",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block CHISAI_LEAVES_RED = registerBlock("chisai_leaves_red",
            new RedAutumnLeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block CHISAI_LEAVES_ORANGE = registerBlock("chisai_leaves_orange",
            new OrangeAutumnLeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block CHISAI_LEAVES_YELLOW = registerBlock("chisai_leaves_yellow",
            new YellowAutumnLeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));

    public static final Block CHISAI_SAPLING_GREEN = registerBlock("chisai_sapling_green",
            new SaplingBlock(new ChisaiGreenSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block CHISAI_SAPLING_RED = registerBlock("chisai_sapling_red",
            new SaplingBlock(new ChisaiRedSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block CHISAI_SAPLING_ORANGE = registerBlock("chisai_sapling_orange",
            new SaplingBlock(new ChisaiOrangeSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block CHISAI_SAPLING_YELLOW = registerBlock("chisai_sapling_yellow",
            new SaplingBlock(new ChisaiYellowSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));
    public static final Block POTTED_CHISAI_SAPLING_GREEN = registerBlockWithoutBlockItem("potted_chisai_sapling_green",
            new FlowerPotBlock(CHISAI_LEAVES_GREEN, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));
    public static final Block POTTED_CHISAI_SAPLING_RED = registerBlockWithoutBlockItem("potted_chisai_sapling_red",
            new FlowerPotBlock(CHISAI_SAPLING_RED, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));
    public static final Block POTTED_CHISAI_SAPLING_ORANGE = registerBlockWithoutBlockItem("potted_chisai_sapling_orange",
            new FlowerPotBlock(CHISAI_SAPLING_ORANGE, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));
    public static final Block POTTED_CHISAI_SAPLING_YELLOW = registerBlockWithoutBlockItem("potted_chisai_sapling_yellow",
            new FlowerPotBlock(CHISAI_SAPLING_YELLOW, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING)));
    public static final Block CHISAI_STAIRS = registerBlock("chisai_stairs",
            new StairsBlock(TakieTerraTreeBlocks.CHISAI_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block CHISAI_SLAB = registerBlock("chisai_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));
    public static final Block CHISAI_BUTTON = registerBlock("chisai_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON), BlockSetType.OAK, 10, true));
    public static final Block CHISAI_PRESSURE_PLATE = registerBlock("chisai_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final Block CHISAI_FENCE = registerBlock("chisai_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block CHISAI_FENCE_GATE = registerBlock("chisai_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE), WoodType.OAK));
    public static final Block CHISAI_DOOR = registerBlock("chisai_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block CHISAI_TRAPDOOR = registerBlock("chisai_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final Block CHISAI_SIGN = registerBlockWithoutBlockItem("chisai_sign",
            new TakieTerraStandingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN), TakieTerraWoodTypes.CHISAI));
    public static final Block CHISAI_HANGING_SIGN = registerBlockWithoutBlockItem("chisai_hanging_sign",
            new TakieTerraHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN), TakieTerraWoodTypes.CHISAI));
    public static final Block CHISAI_WALL_SIGN = registerBlockWithoutBlockItem("chisai_wall_sign",
            new TakieTerraWallSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_SIGN).dropsLike(CHISAI_SIGN), TakieTerraWoodTypes.CHISAI));
    public static final Block CHISAI_WALL_HANGING_SIGN = registerBlockWithoutBlockItem("chisai_wall_hanging_sign",
            new TakieTerraWallHangingSignBlock(FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(CHISAI_HANGING_SIGN), TakieTerraWoodTypes.CHISAI));

    public static final Block AUTUMN_OAK_LEAVES = registerBlock("autumn_oak_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block FLOWERING_OAK_LEAVES = registerBlock("flowering_oak_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));


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

    public static void registerTakieTerraTreeBlocks() {
        TakieTerraMod.LOGGER.info("Registering ModBlocks for" + TakieTerraMod.MOD_ID);
    }
}
