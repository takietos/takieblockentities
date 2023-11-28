package net.takie.takieterra.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.item.ArmorItem;
import net.takie.takieterra.TakieTerraMod;
import net.takie.takieterra.block.TakieTerraBlocks;
import net.takie.takieterra.block.TakieTerraChippedBlocks;
import net.takie.takieterra.block.TakieTerraRockBlocks;
import net.takie.takieterra.block.TakieTerraTreeBlocks;
import net.takie.takieterra.item.TakieTerraItems;

public class TakieTerraModelProvider extends FabricModelProvider {
    public TakieTerraModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.BASKET_WOVEN_CEDAR_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.BRICK_BOND_CEDAR_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.BRICKY_CEDAR_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.CROSS_LACED_CEDAR_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.CROSSED_CEDAR_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.DETAILED_CEDAR_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.DIAGONAL_CEDAR_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.DIAMOND_CEDAR_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.DOUBLE_HERRINGBONE_CEDAR_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.FINE_CEDAR_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.FINE_VERTICAL_CEDAR_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.HERRINGBONE_CEDAR_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.HEWN_CEDAR_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.HORIZONTAL_CEDAR_BOARDS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.LACED_CEDAR_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.MOSAIC_CEDAR_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.NAILED_CEDAR_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.POLISHED_CEDAR_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.RAILED_CEDAR_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.SHIFTED_CEDAR_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.SHINGLED_CEDAR_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.SLANTED_CEDAR_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.STACKED_CEDAR_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.TILED_CEDAR_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.VERSAILLES_CEDAR_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.VERTICAL_CEDAR_BOARDS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.VERTICAL_RAILED_CEDAR_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.WICKER_CEDAR_PLANKS);

        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.BASKET_WOVEN_CHISAI_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.BRICK_BOND_CHISAI_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.BRICKY_CHISAI_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.CROSS_LACED_CHISAI_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.CROSSED_CHISAI_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.DETAILED_CHISAI_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.DIAGONAL_CHISAI_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.DIAMOND_CHISAI_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.DOUBLE_HERRINGBONE_CHISAI_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.FINE_CHISAI_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.FINE_VERTICAL_CHISAI_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.HERRINGBONE_CHISAI_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.HEWN_CHISAI_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.HORIZONTAL_CHISAI_BOARDS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.LACED_CHISAI_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.MOSAIC_CHISAI_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.NAILED_CHISAI_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.POLISHED_CHISAI_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.RAILED_CHISAI_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.SHIFTED_CHISAI_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.SHINGLED_CHISAI_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.SLANTED_CHISAI_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.STACKED_CHISAI_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.TILED_CHISAI_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.VERSAILLES_CHISAI_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.VERTICAL_CHISAI_BOARDS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.VERTICAL_RAILED_CHISAI_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(TakieTerraChippedBlocks.WICKER_CHISAI_PLANKS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
