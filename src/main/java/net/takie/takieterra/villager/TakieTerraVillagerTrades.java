package net.takie.takieterra.villager;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.takie.takieterra.block.TakieTerraBlocks;
import net.takie.takieterra.block.TakieTerraRockBlocks;
import net.takie.takieterra.block.TakieTerraTreeBlocks;
import net.takie.takieterra.block.custom.PearBlocks;
import net.takie.takieterra.item.TakieTerraItems;

public class TakieTerraVillagerTrades {
    public static void registerCustomTrades() {


        //FARMER

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraItems.TOMATO_SEEDS, 3), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraItems.SPINACH_SEEDS, 3), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraItems.OAT_SEEDS, 3), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraItems.LETTUCE_SEEDS, 3), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraItems.SPRING_ONION_SEEDS, 3), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraItems.CAULIFLOWER_SEEDS, 3), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraItems.BROCCOLI_SEEDS, 3), 16, 2, 0.04f
                )));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraItems.CHILI_SEEDS, 3), 16, 2, 0.04f
                )));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraItems.GREEN_BEAN_SEEDS, 3), 16, 2, 0.04f
                )));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(TakieTerraItems.CANTALOUPE_SEEDS, 3), 16, 4, 0.04f
                )));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(TakieTerraItems.HONEYDEW_SEEDS, 3), 16, 4, 0.04f
                )));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(TakieTerraItems.SQUASH_SEEDS, 3), 16, 4, 0.04f
                )));

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 3),
                        new ItemStack(TakieTerraItems.CORN_SEEDS, 3), 14, 6, 0.04f
                )));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 3),
                        new ItemStack(TakieTerraItems.CUCUMBER_SEEDS, 3), 14, 6, 0.04f
                )));

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(TakieTerraItems.STRAWBERRY_SEEDS, 3), 14, 4, 0.04f
                )));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 3),
                        new ItemStack(TakieTerraItems.COTTON_SEEDS, 3), 14, 6, 0.04f
                )));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 3),
                        new ItemStack(TakieTerraItems.JUTE_SEEDS, 3), 14, 6, 0.04f
                )));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 3,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 5),
                        new ItemStack(TakieTerraTreeBlocks.LIME_SAPLING, 1), 10, 6, 0.06f
                )));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 3,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 5),
                        new ItemStack(TakieTerraTreeBlocks.LEMON_SAPLING, 1), 10, 6, 0.06f
                )));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 3,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 5),
                        new ItemStack(TakieTerraTreeBlocks.MANDARIN_SAPLING, 1), 10, 6, 0.06f
                )));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 3,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 5),
                        new ItemStack(TakieTerraTreeBlocks.BLACK_CHERRY_SAPLING, 1), 10, 6, 0.06f
                )));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 3,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 5),
                        new ItemStack(TakieTerraTreeBlocks.CINNAMON_SAPLING, 1), 10, 6, 0.06f
                )));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 3,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 5),
                        new ItemStack(TakieTerraTreeBlocks.OLIVE_SAPLING, 1), 10, 6, 0.06f
                )));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 3,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 3),
                        new ItemStack(TakieTerraItems.GRAPES, 1), 10, 6, 0.06f
                )));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 3,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 3),
                        new ItemStack(TakieTerraItems.RASPBERRY_SEEDS, 3), 10, 6, 0.06f
                )));

        //ARBORIST

        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.ARBORIST, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraTreeBlocks.AUTUMN_ASPEN_SAPLING, 1),
                        new ItemStack(TakieTerraTreeBlocks.AUTUMN_ASPEN_SAPLING_FLAMING, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.ARBORIST, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraTreeBlocks.AUTUMN_ASPEN_SAPLING, 1),
                        new ItemStack(TakieTerraTreeBlocks.AUTUMN_ASPEN_SAPLING_OCHRE, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.ARBORIST, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraTreeBlocks.AUTUMN_ASPEN_SAPLING, 1),
                        new ItemStack(TakieTerraTreeBlocks.AUTUMN_ASPEN_SAPLING_CHESTNUT, 1), 16, 2, 0.02f
                )));
                        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.ARBORIST, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(PearBlocks.PEAR_SAPLING, 1), 12, 8, 0.04f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.ARBORIST, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 3),
                        new ItemStack(TakieTerraTreeBlocks.GINKGO_SAPLING_VERDANT, 1), 12, 4, 0.04f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.ARBORIST, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 3),
                        new ItemStack(TakieTerraTreeBlocks.GINKGO_SAPLING_GOLDEN, 1), 12, 4, 0.04f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.ARBORIST, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 4),
                        new ItemStack(TakieTerraTreeBlocks.SEQUOIA_SAPLING, 4), 6, 6, 0.04f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.ARBORIST, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 4),
                        new ItemStack(TakieTerraTreeBlocks.REDWOOD_SAPLING, 4), 6, 6, 0.04f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.ARBORIST, 3,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 5),
                        new ItemStack(TakieTerraTreeBlocks.MANDARIN_SAPLING, 1), 12, 6, 0.06f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.ARBORIST, 3,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 5),
                        new ItemStack(TakieTerraTreeBlocks.LEMON_SAPLING, 1), 12, 6, 0.06f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.ARBORIST, 3,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 5),
                        new ItemStack(TakieTerraTreeBlocks.LIME_SAPLING, 1), 12, 6, 0.06f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.ARBORIST, 3,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 5),
                        new ItemStack(TakieTerraTreeBlocks.OLIVE_SAPLING, 1), 12, 6, 0.06f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.ARBORIST, 3,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 5),
                        new ItemStack(TakieTerraTreeBlocks.BLACK_CHERRY_SAPLING, 1), 12, 6, 0.06f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.ARBORIST, 4,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 5),
                        new ItemStack(TakieTerraTreeBlocks.NOMERIA_SAPLING, 1), 6, 8, 0.06f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.ARBORIST, 4,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 5),
                        new ItemStack(TakieTerraTreeBlocks.ZISSIAN_SAPLING, 1), 6, 8, 0.06f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.ARBORIST, 4,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 5),
                        new ItemStack(TakieTerraTreeBlocks.AEGIA_SAPLING, 1), 6, 8, 0.06f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.ARBORIST, 5,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 10),
                        new ItemStack(TakieTerraTreeBlocks.SCINTILLA_SAPLING, 1), 3, 30, 0.08f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.ARBORIST, 5,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 5),
                        new ItemStack(TakieTerraTreeBlocks.NEBRA_SAPLING, 1), 12, 30, 0.08f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.ARBORIST, 5,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 5),
                        new ItemStack(TakieTerraTreeBlocks.FLAMEBARK_SAPLING, 1), 6, 30, 0.08f
                )));



        //GEOLOGIST
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GEOLOGIST, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 4),
                        new ItemStack(TakieTerraRockBlocks.KAOLIN, 16), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GEOLOGIST, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(TakieTerraRockBlocks.BROWN_MUD, 16), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GEOLOGIST, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(TakieTerraRockBlocks.ROCKY_SANDY_SOIL, 16), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GEOLOGIST, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(TakieTerraRockBlocks.SANDY_SOIL, 16), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GEOLOGIST, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(TakieTerraRockBlocks.COARSE_DIRT_SANDY, 16), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GEOLOGIST, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(TakieTerraRockBlocks.DIRT_SANDY, 16), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GEOLOGIST, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.GRANITE, 16),
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(TakieTerraBlocks.COOL_GRANITE, 16), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GEOLOGIST, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.GRANITE, 16),
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(TakieTerraBlocks.WARM_GRANITE, 16), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GEOLOGIST, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.DEEPSLATE, 8),
                        new ItemStack(Items.EMERALD, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GEOLOGIST, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraRockBlocks.CHIASTOLITE_CROSS, 5), 12, 4, 0.04f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GEOLOGIST, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraRockBlocks.CHIASTOLITE_TIGER, 5), 12, 4, 0.04f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GEOLOGIST, 3,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(TakieTerraBlocks.LIDDICOATITE_BLOCK, 1), 12, 4, 0.04f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GEOLOGIST, 3,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(TakieTerraBlocks.PINK_LIDDICOATITE_BLOCK, 1), 12, 4, 0.04f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GEOLOGIST, 3,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(TakieTerraBlocks.GREEN_LIDDICOATITE_BLOCK, 1), 12, 4, 0.04f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GEOLOGIST, 3,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 6),
                        new ItemStack(TakieTerraBlocks.SCORCHED_RHYOLITE, 16), 10, 6, 0.06f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GEOLOGIST, 3,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 6),
                        new ItemStack(TakieTerraBlocks.RED_RIBBON_JASPER, 16), 10, 6, 0.06f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GEOLOGIST, 4,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 8),
                        new ItemStack(TakieTerraRockBlocks.BERYL_GREEN, 16), 10, 8, 0.06f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GEOLOGIST, 4,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 8),
                        new ItemStack(TakieTerraRockBlocks.BERYL_PINK, 16), 10, 8, 0.06f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GEOLOGIST, 4,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 8),
                        new ItemStack(TakieTerraRockBlocks.BERYL_TURQUOISE, 16), 10, 8, 0.06f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GEOLOGIST, 4,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.OBSIDIAN, 8),
                        new ItemStack(Items.EMERALD, 8), 5, 10, 0.06f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GEOLOGIST, 5,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 8),
                        new ItemStack(Items.BLACKSTONE, 16), 8, 8, 0.08f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GEOLOGIST, 5,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 16),
                        new ItemStack(Items.SOUL_SAND, 12), 8, 8, 0.08f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GEOLOGIST, 5,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 16),
                        new ItemStack(Items.SOUL_SOIL, 12), 8, 8, 0.08f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GEOLOGIST, 5,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 16),
                        new ItemStack(Items.END_STONE, 8), 8, 8, 0.08f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GEOLOGIST, 5,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.NETHERRACK, 16),
                        new ItemStack(Items.EMERALD, 4), 8, 8, 0.08f
                )));


        //BEACHCOMBER
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.BEACHCOMBER, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(TakieTerraBlocks.COQUINA, 1),
                        new ItemStack(TakieTerraBlocks.SHELL_COWRIE, 3), 16, 4, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.BEACHCOMBER, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(TakieTerraBlocks.COQUINA, 1),
                        new ItemStack(TakieTerraBlocks.SHELL_SAND_DOLLAR, 3), 16, 4, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.BEACHCOMBER, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(TakieTerraBlocks.COQUINA, 2),
                        new ItemStack(TakieTerraBlocks.SEASHELL_CLAM, 9), 12, 4, 0.04f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.BEACHCOMBER, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Blocks.SEAGRASS, 5),
                        new ItemStack(Items.EMERALD, 1), 12, 2, 0.04f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.BEACHCOMBER, 3,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(TakieTerraBlocks.COQUINA, 1),
                        new ItemStack(TakieTerraTreeBlocks.INDIKO_SAPLING, 1), 12, 4, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.BEACHCOMBER, 3,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Blocks.KELP, 5),
                        new ItemStack(Items.EMERALD, 1), 12, 4, 0.04f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.BEACHCOMBER, 4,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(TakieTerraBlocks.COQUINA, 5),
                        new ItemStack(TakieTerraBlocks.SANDCASTLE, 1), 10, 6, 0.04f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.BEACHCOMBER, 4,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.TROPICAL_FISH_BUCKET, 1),
                        new ItemStack(Items.EMERALD, 3), 8, 6, 0.04f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.BEACHCOMBER, 5,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(TakieTerraBlocks.COQUINA, 1),
                        new ItemStack(Blocks.SOUL_SAND, 5), 6, 30, 0.08f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.BEACHCOMBER, 5,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(TakieTerraBlocks.COQUINA, 5),
                        new ItemStack(Blocks.SOUL_CAMPFIRE, 1), 6, 30, 0.08f
                )));



        //GARDENER
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GARDENER, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraBlocks.HOLLYHOCK_BLACK, 1), 12, 2, 0.04f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GARDENER, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraBlocks.HOLLYHOCK_YELLOW, 1), 12, 2, 0.04f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GARDENER, 3,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraBlocks.HOLLYHOCK_PINK, 1), 12, 2, 0.04f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GARDENER, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraBlocks.MARIGOLD, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GARDENER, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraBlocks.PINK_HIBISCUS, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GARDENER, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraBlocks.BROMELIAD, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GARDENER, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraBlocks.LAVENDER_FLOWER, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GARDENER, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraBlocks.HYDRANGEA, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GARDENER, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraBlocks.BLUE_AGAVE, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GARDENER, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraBlocks.ALOE_VERA, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GARDENER, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(TakieTerraBlocks.MOONSEED_VINE, 1), 16, 4, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GARDENER, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(TakieTerraBlocks.SILVERLACE_VINE, 1), 16, 4, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GARDENER, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(TakieTerraBlocks.BITTERSWEET_VINE, 1), 16, 4, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GARDENER, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(TakieTerraBlocks.THUNBERGIA_VINE, 1), 16, 4, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GARDENER, 3,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 3),
                        new ItemStack(TakieTerraItems.GRAPES, 1), 12, 4, 0.04f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GARDENER, 3,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 3),
                        new ItemStack(TakieTerraBlocks.COLEUS_PLANT, 1), 12, 6, 0.06f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GARDENER, 3,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 3),
                        new ItemStack(TakieTerraBlocks.BANANA_TREE, 1), 12, 6, 0.06f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GARDENER, 3,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(TakieTerraBlocks.LOTUS_FLOWER, 1), 16, 6, 0.06f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GARDENER, 4,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 5),
                        new ItemStack(Items.SPORE_BLOSSOM, 1), 16, 6, 0.06f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GARDENER, 4,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 5),
                        new ItemStack(Items.PINK_PETALS, 16), 16, 6, 0.06f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GARDENER, 4,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 5),
                        new ItemStack(TakieTerraBlocks.MONSTERA_POT, 1), 16, 6, 0.06f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GARDENER, 5,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 10),
                        new ItemStack(Items.WITHER_ROSE, 1), 8, 30, 0.08f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GARDENER, 5,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 15),
                        new ItemStack(Items.CHORUS_FLOWER, 1), 8, 30, 0.08f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GARDENER, 5,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 24),
                        new ItemStack(Items.SNIFFER_EGG, 1), 8, 30, 0.08f
                )));

        //HERBALIST

        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.HERBALIST, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraItems.ROSEMARY_SEEDS, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.HERBALIST, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraItems.APPLEMINT_SEEDS, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.HERBALIST, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraItems.LAVENDER_SEEDS, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.HERBALIST, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraItems.BASIL_SEEDS, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.HERBALIST, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraItems.THYME_SEEDS, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.HERBALIST, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraItems.TANSY_SEEDS, 1), 16, 2, 0.02f
                )));

        //GROCER
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GROCER, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(TakieTerraItems.OLIVE_OIL_BOTTLE, 1), 16, 4, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GROCER, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(TakieTerraItems.AGAVE_SYRUP_BOTTLE, 1), 16, 4, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GROCER, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(Items.SUGAR, 3), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GROCER, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraItems.AGAR_AGAR, 3), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GROCER, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraItems.BUTTER, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GROCER, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraItems.RICE, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GROCER, 3,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(TakieTerraItems.CREAM_CHEESE, 1), 16, 4, 0.04f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GROCER, 3,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 3),
                        new ItemStack(Items.HONEY_BOTTLE, 1), 16, 6, 0.04f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.GROCER, 3,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(TakieTerraItems.CHILI_OIL, 1), 16, 4, 0.04f
                )));

        //TEAHOUSE
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.TEAHOUSE_ATTENDANT, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(TakieTerraItems.TEA_LEAVES, 20),
                        new ItemStack(Items.EMERALD, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.TEAHOUSE_ATTENDANT, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(TakieTerraItems.JASMINE_FLOWERS, 20),
                        new ItemStack(Items.EMERALD, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.TEAHOUSE_ATTENDANT, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraItems.TEA_CHAMOMILE, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.TEAHOUSE_ATTENDANT, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraItems.TEA_HIBISCUS, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.TEAHOUSE_ATTENDANT, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraItems.TEA_GREEN, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.TEAHOUSE_ATTENDANT, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraItems.TEA_BLACK, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.TEAHOUSE_ATTENDANT, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraItems.TEA_HERBAL, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.TEAHOUSE_ATTENDANT, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraItems.TEA_JASMINE, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.TEAHOUSE_ATTENDANT, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraItems.TEA_APPLEMINT, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.TEAHOUSE_ATTENDANT, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraItems.TEA_SWEET_BERRY, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.TEAHOUSE_ATTENDANT, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(TakieTerraItems.TEA_SEEDS, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.TEAHOUSE_ATTENDANT, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(TakieTerraItems.JASMINE_SEEDS, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.TEAHOUSE_ATTENDANT, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(TakieTerraItems.TEA_MILK, 1), 16, 2, 0.02f
                )));

        //METALLURGIST
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.METALLURGIST, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.COPPER_INGOT, 5),
                        new ItemStack(Items.EMERALD, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.METALLURGIST, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.GOLD_INGOT, 1),
                        new ItemStack(Items.EMERALD, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.METALLURGIST, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 12),
                        new ItemStack(Items.LAVA_BUCKET, 1), 14, 6, 0.04f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.METALLURGIST, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(Items.GOLD_INGOT, 1),
                        new ItemStack(TakieTerraItems.ROSE_GOLD_INGOT, 1), 14, 6, 0.04f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.METALLURGIST, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(Items.COPPER_INGOT, 1),
                        new ItemStack(TakieTerraItems.BRONZE_INGOT, 1), 14, 6, 0.04f
                )));

        //CHEF
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.CHEF, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraItems.SANDWICH_BLT, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.CHEF, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraItems.CHEESY_OMELETTE, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.CHEF, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraItems.STUFFED_MUSHROOMS, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.CHEF, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraItems.FISH_AND_CHIPS, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.CHEF, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraItems.PANCAKES, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.CHEF, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraItems.MANGO_PUDDING, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.CHEF, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraItems.PANCAKES_STRAWBERRY, 1), 16, 4, 0.04f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.CHEF, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraItems.PANCAKES_SWEET_BERRY, 1), 16, 4, 0.04f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.CHEF, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(TakieTerraItems.PIZZA_MARGHERITA, 1), 16, 4, 0.04f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.CHEF, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(TakieTerraItems.PIZZA_PEPPERONI, 1), 16, 4, 0.04f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.CHEF, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(TakieTerraItems.PIZZA_VEGGIE, 1), 16, 4, 0.04f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.CHEF, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(TakieTerraItems.PIZZA_HAM_AND_PINEAPPLE, 1), 16, 4, 0.04f
                )));


        //BAKER
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.BAKER, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraItems.BUTTER_PECAN_TART, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.BAKER, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraItems.CARAMEL_WALNUT_TART, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.BAKER, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(Items.BREAD, 3), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.BAKER, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(TakieTerraItems.AROMATIC_LOAF, 3), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.BAKER, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(TakieTerraItems.CINNAMON_ROLL, 1), 16, 4, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.BAKER, 3,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(TakieTerraItems.CINNAMON_ROLL_FROSTED, 1), 16, 4, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.BAKER, 4,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 5),
                        new ItemStack(TakieTerraBlocks.PIE_PLUM, 1), 16, 6, 0.06f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.BAKER, 4,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 5),
                        new ItemStack(TakieTerraBlocks.PIE_PEACH, 1), 16, 6, 0.06f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.BAKER, 4,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 5),
                        new ItemStack(TakieTerraBlocks.PIE_RASPBERRY, 1), 16, 6, 0.06f
                )));


        //MYCOLOGIST
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.MYCOLOGIST, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(Items.BROWN_MUSHROOM, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.MYCOLOGIST, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraBlocks.POLYPHORE_AUTUMN_BEAUTY, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.MYCOLOGIST, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraBlocks.POLYPHORE_GROUSE_TAIL, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.MYCOLOGIST, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraBlocks.POLYPHORE_SUN_BLOOM, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.MYCOLOGIST, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraBlocks.POLYPHORE_CACAO, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.MYCOLOGIST, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraBlocks.POLYPHORE_PHANTOM, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.MYCOLOGIST, 1,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(Items.RED_MUSHROOM, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.MYCOLOGIST, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraBlocks.MUSHROOM_CHANTERELLE, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.MYCOLOGIST, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraBlocks.MUSHROOM_HONEY, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.MYCOLOGIST, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraBlocks.MUSHROOM_MOREL, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.MYCOLOGIST, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraBlocks.MUSHROOM_YELLOW_OYSTER, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.MYCOLOGIST, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraBlocks.MUSHROOM_ORANGE_CAP_BOLETE, 1), 16, 2, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.MYCOLOGIST, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(TakieTerraBlocks.MUSHROOM_BLACK_AMANITA, 1), 16, 4, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.MYCOLOGIST, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 3),
                        new ItemStack(TakieTerraBlocks.MUSHROOM_DEATH_TRUMPET, 1), 16, 4, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.MYCOLOGIST, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(TakieTerraBlocks.MUSHROOM_INKY_CAP, 1), 16, 4, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.MYCOLOGIST, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(TakieTerraBlocks.MUSHROOM_PIXIE_CAP, 1), 16, 4, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.MYCOLOGIST, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(TakieTerraBlocks.MUSHROOM_LILAC_RUSSULA, 1), 16, 4, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.MYCOLOGIST, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(TakieTerraBlocks.MUSHROOM_BLUE_OYSTER, 1), 16, 4, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.MYCOLOGIST, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(TakieTerraBlocks.MUSHROOM_GREEN_RUSSULA, 1), 16, 4, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.MYCOLOGIST, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(TakieTerraBlocks.MUSHROOM_RED_AMANITA, 1), 16, 4, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.MYCOLOGIST, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 2),
                        new ItemStack(TakieTerraBlocks.MUSHROOM_SHAGGY_MANE, 1), 16, 4, 0.02f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.MYCOLOGIST, 2,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 3),
                        new ItemStack(TakieTerraBlocks.MUSHROOM_PINK_OYSTER, 1), 12, 4, 0.04f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.MYCOLOGIST, 3,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(Items.PODZOL, 3), 12, 6, 0.04f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.MYCOLOGIST, 3,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(Items.MYCELIUM, 1), 12, 6, 0.04f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.MYCOLOGIST, 3,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraBlocks.MUSHROOM_BRILLIOME, 1), 12, 6, 0.04f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.MYCOLOGIST, 4,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraBlocks.PHOSPORE_SPROUT_BLUE, 1), 8, 6, 0.06f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.MYCOLOGIST, 4,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraBlocks.PHOSPORE_SPROUT_GREEN, 1), 8, 6, 0.06f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.MYCOLOGIST, 4,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraBlocks.PHOSPORE_SPROUT_YELLOW, 1), 8, 6, 0.06f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.MYCOLOGIST, 4,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(TakieTerraBlocks.PHOSPORE_SPROUT_BLUE, 1), 8, 6, 0.06f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.MYCOLOGIST, 5,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 16),
                        new ItemStack(Items.CRIMSON_FUNGUS, 1), 3, 30, 0.08f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.MYCOLOGIST, 5,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 10),
                        new ItemStack(Items.CRIMSON_NYLIUM, 6), 3, 30, 0.08f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.MYCOLOGIST, 5,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 16),
                        new ItemStack(Items.WARPED_FUNGUS, 1), 3, 30, 0.08f
                )));
        TradeOfferHelper.registerVillagerOffers(TakieTerraProfessions.MYCOLOGIST, 5,
                factories -> factories.add((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 10),
                        new ItemStack(Items.WARPED_NYLIUM, 6), 3, 30, 0.08f
                )));


        //WOODWORKER

        //ANTIQUE DEALER

        //STREET VENDOR

    }
}
