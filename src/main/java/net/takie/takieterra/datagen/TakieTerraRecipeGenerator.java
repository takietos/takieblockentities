package net.takie.takieterra.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.takie.takieterra.block.TakieTerraBlocks;
import net.takie.takieterra.block.TakieTerraChippedBlocks;
import net.takie.takieterra.block.TakieTerraRockBlocks;
import net.takie.takieterra.block.TakieTerraTreeBlocks;

import java.util.function.Consumer;

public class TakieTerraRecipeGenerator extends FabricRecipeProvider {


    public TakieTerraRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.BASKET_WOVEN_CHISAI_PLANKS, TakieTerraTreeBlocks.CHISAI_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.BRICK_BOND_CHISAI_PLANKS, TakieTerraTreeBlocks.CHISAI_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.BRICKY_CHISAI_PLANKS, TakieTerraTreeBlocks.CHISAI_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.CROSS_LACED_CHISAI_PLANKS, TakieTerraTreeBlocks.CHISAI_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.CROSSED_CHISAI_PLANKS, TakieTerraTreeBlocks.CHISAI_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.DETAILED_CHISAI_PLANKS, TakieTerraTreeBlocks.CHISAI_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.DIAGONAL_CHISAI_PLANKS, TakieTerraTreeBlocks.CHISAI_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.DIAMOND_CHISAI_PLANKS, TakieTerraTreeBlocks.CHISAI_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.DOUBLE_HERRINGBONE_CHISAI_PLANKS, TakieTerraTreeBlocks.CHISAI_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.FINE_CHISAI_PLANKS, TakieTerraTreeBlocks.CHISAI_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.FINE_VERTICAL_CHISAI_PLANKS, TakieTerraTreeBlocks.CHISAI_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.HERRINGBONE_CHISAI_PLANKS, TakieTerraTreeBlocks.CHISAI_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.HEWN_CHISAI_PLANKS, TakieTerraTreeBlocks.CHISAI_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.HORIZONTAL_CHISAI_BOARDS, TakieTerraTreeBlocks.CHISAI_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.LACED_CHISAI_PLANKS, TakieTerraTreeBlocks.CHISAI_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.MOSAIC_CHISAI_PLANKS, TakieTerraTreeBlocks.CHISAI_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.NAILED_CHISAI_PLANKS, TakieTerraTreeBlocks.CHISAI_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.POLISHED_CHISAI_PLANKS, TakieTerraTreeBlocks.CHISAI_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.RAILED_CHISAI_PLANKS, TakieTerraTreeBlocks.CHISAI_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.SHIFTED_CHISAI_PLANKS, TakieTerraTreeBlocks.CHISAI_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.SHINGLED_CHISAI_PLANKS, TakieTerraTreeBlocks.CHISAI_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.SLANTED_CHISAI_PLANKS, TakieTerraTreeBlocks.CHISAI_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.STACKED_CHISAI_PLANKS, TakieTerraTreeBlocks.CHISAI_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.TILED_CHISAI_PLANKS, TakieTerraTreeBlocks.CHISAI_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.VERSAILLES_CHISAI_PLANKS, TakieTerraTreeBlocks.CHISAI_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.VERTICAL_CHISAI_BOARDS, TakieTerraTreeBlocks.CHISAI_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.VERTICAL_RAILED_CHISAI_PLANKS, TakieTerraTreeBlocks.CHISAI_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.WICKER_CHISAI_PLANKS, TakieTerraTreeBlocks.CHISAI_PLANKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.BASKET_WOVEN_CEDAR_PLANKS, TakieTerraTreeBlocks.CEDAR_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.BRICK_BOND_CEDAR_PLANKS, TakieTerraTreeBlocks.CEDAR_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.BRICKY_CEDAR_PLANKS, TakieTerraTreeBlocks.CEDAR_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.CROSS_LACED_CEDAR_PLANKS, TakieTerraTreeBlocks.CEDAR_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.CROSSED_CEDAR_PLANKS, TakieTerraTreeBlocks.CEDAR_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.DETAILED_CEDAR_PLANKS, TakieTerraTreeBlocks.CEDAR_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.DIAGONAL_CEDAR_PLANKS, TakieTerraTreeBlocks.CEDAR_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.DIAMOND_CEDAR_PLANKS, TakieTerraTreeBlocks.CEDAR_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.DOUBLE_HERRINGBONE_CEDAR_PLANKS, TakieTerraTreeBlocks.CEDAR_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.FINE_CEDAR_PLANKS, TakieTerraTreeBlocks.CEDAR_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.FINE_VERTICAL_CEDAR_PLANKS, TakieTerraTreeBlocks.CEDAR_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.HERRINGBONE_CEDAR_PLANKS, TakieTerraTreeBlocks.CEDAR_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.HEWN_CEDAR_PLANKS, TakieTerraTreeBlocks.CEDAR_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.HORIZONTAL_CEDAR_BOARDS, TakieTerraTreeBlocks.CEDAR_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.LACED_CEDAR_PLANKS, TakieTerraTreeBlocks.CEDAR_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.MOSAIC_CEDAR_PLANKS, TakieTerraTreeBlocks.CEDAR_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.NAILED_CEDAR_PLANKS, TakieTerraTreeBlocks.CEDAR_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.POLISHED_CEDAR_PLANKS, TakieTerraTreeBlocks.CEDAR_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.RAILED_CEDAR_PLANKS, TakieTerraTreeBlocks.CEDAR_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.SHIFTED_CEDAR_PLANKS, TakieTerraTreeBlocks.CEDAR_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.SHINGLED_CEDAR_PLANKS, TakieTerraTreeBlocks.CEDAR_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.SLANTED_CEDAR_PLANKS, TakieTerraTreeBlocks.CEDAR_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.STACKED_CEDAR_PLANKS, TakieTerraTreeBlocks.CEDAR_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.TILED_CEDAR_PLANKS, TakieTerraTreeBlocks.CEDAR_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.VERSAILLES_CEDAR_PLANKS, TakieTerraTreeBlocks.CEDAR_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.VERTICAL_CEDAR_BOARDS, TakieTerraTreeBlocks.CEDAR_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.VERTICAL_RAILED_CEDAR_PLANKS, TakieTerraTreeBlocks.CEDAR_PLANKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, TakieTerraChippedBlocks.WICKER_CEDAR_PLANKS, TakieTerraTreeBlocks.CEDAR_PLANKS);


    }
}
