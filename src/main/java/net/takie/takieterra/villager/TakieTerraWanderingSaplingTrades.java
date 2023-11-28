package net.takie.takieterra.villager;

import com.terraformersmc.terraform.tree.merchant.TerraformSaplingTradeHelper;
import net.takie.takieterra.block.TakieTerraBlocks;
import net.takie.takieterra.block.TakieTerraTreeBlocks;
import net.takie.takieterra.block.custom.PearBlocks;

public class TakieTerraWanderingSaplingTrades {
    public static void register() {
        TerraformSaplingTradeHelper.registerWanderingTraderSaplingTrades(
                TakieTerraTreeBlocks.PURPLE_WISTERIA_SAPLING,
                TakieTerraTreeBlocks.WHITE_WISTERIA_SAPLING,
                TakieTerraTreeBlocks.BLUE_WISTERIA_SAPLING,
                TakieTerraTreeBlocks.PINK_WISTERIA_SAPLING,
                TakieTerraTreeBlocks.MANDARIN_SAPLING,
                TakieTerraTreeBlocks.LIME_SAPLING,
                TakieTerraTreeBlocks.LEMON_SAPLING,
                TakieTerraTreeBlocks.BLACK_CHERRY_SAPLING,
                TakieTerraTreeBlocks.CINNAMON_SAPLING,
                TakieTerraTreeBlocks.OLIVE_SAPLING,
                TakieTerraTreeBlocks.PALO_VERDE_SAPLING,
                TakieTerraTreeBlocks.KOBICHA_SAPLING,
                TakieTerraTreeBlocks.MYRTA_SAPLING,
                TakieTerraTreeBlocks.LARCH_SAPLING,
                TakieTerraTreeBlocks.FIR_SAPLING,
                TakieTerraTreeBlocks.BEECH_SAPLING,
                TakieTerraTreeBlocks.CAMPHOR_SAPLING,
                PearBlocks.PEAR_SAPLING,
                TakieTerraTreeBlocks.SNOW_GHOST_SAPLING,
                TakieTerraTreeBlocks.WINTER_BLOSSOM_SAPLING,
                TakieTerraTreeBlocks.AEGIA_SAPLING,
                TakieTerraTreeBlocks.SCINTILLA_SAPLING,
                TakieTerraTreeBlocks.NEBRA_SAPLING,
                TakieTerraTreeBlocks.ZISSIAN_SAPLING,
                TakieTerraTreeBlocks.NOMERIA_SAPLING
        );
    }
}
