package net.takie.takieterra.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.FlowerPotBlock;
import net.takie.takieterra.block.TakieTerraBlocks;
import net.takie.takieterra.block.TakieTerraChippedBlocks;
import net.takie.takieterra.block.TakieTerraRockBlocks;
import net.takie.takieterra.block.TakieTerraTreeBlocks;
import net.takie.takieterra.item.TakieTerraItems;

public class TakieTerraBlockLootTableGenerator extends FabricBlockLootTableProvider {
    public TakieTerraBlockLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(TakieTerraChippedBlocks.BASKET_WOVEN_CHISAI_PLANKS);
        addDrop(TakieTerraChippedBlocks.BRICK_BOND_CHISAI_PLANKS);
        addDrop(TakieTerraChippedBlocks.BRICKY_CHISAI_PLANKS);
        addDrop(TakieTerraChippedBlocks.CROSS_LACED_CHISAI_PLANKS);
        addDrop(TakieTerraChippedBlocks.CROSSED_CHISAI_PLANKS);
        addDrop(TakieTerraChippedBlocks.DETAILED_CHISAI_PLANKS);
        addDrop(TakieTerraChippedBlocks.DIAGONAL_CHISAI_PLANKS);
        addDrop(TakieTerraChippedBlocks.DIAMOND_CHISAI_PLANKS);
        addDrop(TakieTerraChippedBlocks.DOUBLE_HERRINGBONE_CHISAI_PLANKS);
        addDrop(TakieTerraChippedBlocks.FINE_CHISAI_PLANKS);
        addDrop(TakieTerraChippedBlocks.FINE_VERTICAL_CHISAI_PLANKS);
        addDrop(TakieTerraChippedBlocks.HERRINGBONE_CHISAI_PLANKS);
        addDrop(TakieTerraChippedBlocks.HEWN_CHISAI_PLANKS);
        addDrop(TakieTerraChippedBlocks.HORIZONTAL_CHISAI_BOARDS);
        addDrop(TakieTerraChippedBlocks.LACED_CHISAI_PLANKS);
        addDrop(TakieTerraChippedBlocks.MOSAIC_CHISAI_PLANKS);
        addDrop(TakieTerraChippedBlocks.NAILED_CHISAI_PLANKS);
        addDrop(TakieTerraChippedBlocks.POLISHED_CHISAI_PLANKS);
        addDrop(TakieTerraChippedBlocks.RAILED_CHISAI_PLANKS);
        addDrop(TakieTerraChippedBlocks.SHIFTED_CHISAI_PLANKS);
        addDrop(TakieTerraChippedBlocks.SHINGLED_CHISAI_PLANKS);
        addDrop(TakieTerraChippedBlocks.SLANTED_CHISAI_PLANKS);
        addDrop(TakieTerraChippedBlocks.STACKED_CHISAI_PLANKS);
        addDrop(TakieTerraChippedBlocks.TILED_CHISAI_PLANKS);
        addDrop(TakieTerraChippedBlocks.VERSAILLES_CHISAI_PLANKS);
        addDrop(TakieTerraChippedBlocks.VERTICAL_CHISAI_BOARDS);
        addDrop(TakieTerraChippedBlocks.VERTICAL_RAILED_CHISAI_PLANKS);
        addDrop(TakieTerraChippedBlocks.WICKER_CHISAI_PLANKS);

        addDrop(TakieTerraChippedBlocks.BASKET_WOVEN_CEDAR_PLANKS);
        addDrop(TakieTerraChippedBlocks.BRICK_BOND_CEDAR_PLANKS);
        addDrop(TakieTerraChippedBlocks.BRICKY_CEDAR_PLANKS);
        addDrop(TakieTerraChippedBlocks.CROSS_LACED_CEDAR_PLANKS);
        addDrop(TakieTerraChippedBlocks.CROSSED_CEDAR_PLANKS);
        addDrop(TakieTerraChippedBlocks.DETAILED_CEDAR_PLANKS);
        addDrop(TakieTerraChippedBlocks.DIAGONAL_CEDAR_PLANKS);
        addDrop(TakieTerraChippedBlocks.DIAMOND_CEDAR_PLANKS);
        addDrop(TakieTerraChippedBlocks.DOUBLE_HERRINGBONE_CEDAR_PLANKS);
        addDrop(TakieTerraChippedBlocks.FINE_CEDAR_PLANKS);
        addDrop(TakieTerraChippedBlocks.FINE_VERTICAL_CEDAR_PLANKS);
        addDrop(TakieTerraChippedBlocks.HERRINGBONE_CEDAR_PLANKS);
        addDrop(TakieTerraChippedBlocks.HEWN_CEDAR_PLANKS);
        addDrop(TakieTerraChippedBlocks.HORIZONTAL_CEDAR_BOARDS);
        addDrop(TakieTerraChippedBlocks.LACED_CEDAR_PLANKS);
        addDrop(TakieTerraChippedBlocks.MOSAIC_CEDAR_PLANKS);
        addDrop(TakieTerraChippedBlocks.NAILED_CEDAR_PLANKS);
        addDrop(TakieTerraChippedBlocks.POLISHED_CEDAR_PLANKS);
        addDrop(TakieTerraChippedBlocks.RAILED_CEDAR_PLANKS);
        addDrop(TakieTerraChippedBlocks.SHIFTED_CEDAR_PLANKS);
        addDrop(TakieTerraChippedBlocks.SHINGLED_CEDAR_PLANKS);
        addDrop(TakieTerraChippedBlocks.SLANTED_CEDAR_PLANKS);
        addDrop(TakieTerraChippedBlocks.STACKED_CEDAR_PLANKS);
        addDrop(TakieTerraChippedBlocks.TILED_CEDAR_PLANKS);
        addDrop(TakieTerraChippedBlocks.VERSAILLES_CEDAR_PLANKS);
        addDrop(TakieTerraChippedBlocks.VERTICAL_CEDAR_BOARDS);
        addDrop(TakieTerraChippedBlocks.VERTICAL_RAILED_CEDAR_PLANKS);
        addDrop(TakieTerraChippedBlocks.WICKER_CEDAR_PLANKS);
    }
    public void makePottedLootTable(FlowerPotBlock flowerPotBlock) {
        addPottedPlantDrops(flowerPotBlock);
        addDrop(flowerPotBlock.getContent());
    }
}
