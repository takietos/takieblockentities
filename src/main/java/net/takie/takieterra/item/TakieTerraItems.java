package net.takie.takieterra.item;

import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import com.terraformersmc.terraform.boat.impl.item.TerraformBoatItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.takie.takieterra.TakieTerraMod;
import net.takie.takieterra.block.TakieTerraBlocks;
import net.takie.takieterra.block.TakieTerraTreeBlocks;
import net.takie.takieterra.entity.TakieTerraBoats;
import net.takie.takieterra.item.custom.BottleItem;
import net.takie.takieterra.item.custom.FireSwordItem;
import net.takie.takieterra.item.custom.IceSwordItem;
import net.takie.takieterra.item.custom.TeaItem;

public class TakieTerraItems {

    public static Item createItem(String blockID, Item item){
        return Registry.register(Registries.ITEM, new Identifier(TakieTerraMod.MOD_ID, blockID), item);
    }
    public static Item createBoatItem(TerraformBoatType type) {
        return new TerraformBoatItem(TerraformBoatTypeRegistry.INSTANCE.getKey(type).get(), false, new Item.Settings().maxCount(1));
    }
    public static Item createChestBoatItem(TerraformBoatType type) {
        return new TerraformBoatItem(TerraformBoatTypeRegistry.INSTANCE.getKey(type).get(), true, new Item.Settings().maxCount(1));
    }

    public static Item createSignItem(Block sign, Block wallSign) {
        return new SignItem(new FabricItemSettings().maxCount(16), sign, wallSign);
    }
    public static Item createHangingSignItem(Block sign, Block wallSign) {
        return new HangingSignItem(sign, wallSign, new FabricItemSettings().maxCount(16));
    }



    //STONES
    public static final Item OPAL = registerItem("opal",
            new Item(new FabricItemSettings()));
    public static final Item SEA_OPAL = registerItem("sea_opal",
            new Item(new FabricItemSettings()));
    public static final Item AMETRINE_STONE = registerItem("ametrine_stone",
            new Item(new FabricItemSettings()));
    public static final Item BLOODSTONE = registerItem("bloodstone",
            new Item(new FabricItemSettings()));
    public static final Item CELESTITE_STONE = registerItem("celestite_stone",
            new Item(new FabricItemSettings()));
    public static final Item ANGELITE_STONE = registerItem("angelite_stone",
            new Item(new FabricItemSettings()));
    public static final Item RAW_BISMUTH = registerItem("raw_bismuth",
            new Item(new FabricItemSettings()));
    public static final Item BISMUTH_INGOT = registerItem("bismuth_ingot",
            new Item(new FabricItemSettings()));
    public static final Item FIRE_AGATE_STONE = registerItem("fire_agate_stone",
            new Item(new FabricItemSettings()));
    public static final Item HOWLITE_STONE = registerItem("howlite_stone",
            new Item(new FabricItemSettings()));
    public static final Item HYDITE_STONE = registerItem("hydite_stone",
            new Item(new FabricItemSettings()));
    public static final Item IRIS_AGATE_STONE = registerItem("iris_agate_stone",
            new Item(new FabricItemSettings()));
    public static final Item KYANITE_STONE = registerItem("kyanite_stone",
            new Item(new FabricItemSettings()));
    public static final Item LABRADORITE_STONE = registerItem("labradorite_stone",
            new Item(new FabricItemSettings()));
    public static final Item LARIMAR_STONE = registerItem("larimar_stone",
            new Item(new FabricItemSettings()));
    public static final Item LUSEDITE_STONE = registerItem("lusedite_stone",
            new Item(new FabricItemSettings()));
    public static final Item MALACHTIE_STONE = registerItem("malachite_stone",
            new Item(new FabricItemSettings()));
    public static final Item TITANIUM_QUARTZ_CRYSTAL = registerItem("titanium_quartz_crystal",
            new Item(new FabricItemSettings()));
    public static final Item ROSE_QUARTZ_CRYSTAL = registerItem("rose_quartz_crystal",
            new Item(new FabricItemSettings()));
    public static final Item MOONSTONE = registerItem("moonstone",
            new Item(new FabricItemSettings()));
    public static final Item ORANGE_CALCITE_STONE = registerItem("orange_calcite_stone",
            new Item(new FabricItemSettings()));
    public static final Item PERIDOT_STONE = registerItem("peridot_stone",
            new Item(new FabricItemSettings()));
    public static final Item RUBY_STONE = registerItem("ruby_stone",
            new Item(new FabricItemSettings()));
    public static final Item SAPPHIRE_STONE = registerItem("sapphire_stone",
            new Item(new FabricItemSettings()));
    public static final Item SNOWFLAKE_OBSIDIAN_STONE = registerItem("snowflake_obsidian_stone",
            new Item(new FabricItemSettings()));
    public static final Item TANZANITE_STONE = registerItem("tanzanite_stone",
            new Item(new FabricItemSettings()));
    public static final Item TOPAZ_STONE = registerItem("topaz_stone",
            new Item(new FabricItemSettings()));
    public static final Item TURQUOISE_STONE = registerItem("turquoise_stone",
            new Item(new FabricItemSettings()));
    public static final Item RAW_ROSE_GOLD = registerItem("raw_rose_gold",
            new Item(new FabricItemSettings()));
    public static final Item ROSE_GOLD_INGOT = registerItem("rose_gold_ingot",
            new Item(new FabricItemSettings()));
    public static final Item STARINITE_STONE = registerItem("starinite_stone",
            new Item(new FabricItemSettings()));
    public static final Item NEBULITE_STONE = registerItem("nebulite_stone",
            new Item(new FabricItemSettings()));
    public static final Item AMBER_STONE = registerItem("amber_stone",
            new Item(new FabricItemSettings()));
    public static final Item APATITE_STONE = registerItem("apatite_stone",
            new Item(new FabricItemSettings()));
    public static final Item FANTASY_PEARLITE_STONE = registerItem("fantasy_pearlite_stone",
            new Item(new FabricItemSettings()));
    public static final Item SEASHELL_PEARLITE_STONE = registerItem("seashell_pearlite_stone",
            new Item(new FabricItemSettings()));
    public static final Item WHITE_PEARLITE_STONE = registerItem("white_pearlite_stone",
            new Item(new FabricItemSettings()));
    public static final Item RHODOCHROSITE_STONE = registerItem("rhodochrosite_stone",
            new Item(new FabricItemSettings()));
    public static final Item NEPHRITE_STONE = registerItem("nephrite_stone",
            new Item(new FabricItemSettings()));
    public static final Item CINNABAR_STONE = registerItem("cinnabar_stone",
            new Item(new FabricItemSettings()));
    public static final Item LIDDICOATITE_STONE = registerItem("liddicoatite_stone",
            new Item(new FabricItemSettings()));
    public static final Item GREEN_LIDDICOATITE_STONE = registerItem("green_liddicoatite_stone",
            new Item(new FabricItemSettings()));
    public static final Item PINK_LIDDICOATITE_STONE = registerItem("pink_liddicoatite_stone",
            new Item(new FabricItemSettings()));
    public static final Item CHALCEDONY_STONE = registerItem("chalcedony_stone",
            new Item(new FabricItemSettings()));
    public static final Item RAINFOREST_JASPER_STONE = registerItem("rainforest_jasper_stone",
            new Item(new FabricItemSettings()));
    public static final Item CITRINE_STONE = registerItem("citrine_stone",
            new Item(new FabricItemSettings()));
    public static final Item BRONZE_INGOT = registerItem("bronze_ingot",
            new Item(new FabricItemSettings()));
    public static final Item BRONZE_COIN = registerItem("bronze_coin",
            new Item(new FabricItemSettings()));
    public static final Item SUGILITE_STONE = registerItem("sugilite_stone",
            new Item(new FabricItemSettings()));
    public static final Item AURANITE_STONE = registerItem("auranite_stone",
            new Item(new FabricItemSettings()));
    public static final Item ALMANDINE_STONE = registerItem("almandine_stone",
            new Item(new FabricItemSettings()));
    public static final Item AMAZONITE_STONE = registerItem("amazonite_stone",
            new Item(new FabricItemSettings()));
    public static final Item AZURITE_STONE = registerItem("azurite_stone",
            new Item(new FabricItemSettings()));
    public static final Item BLUE_SPOT_JASPER_STONE = registerItem("blue_spot_jasper_stone",
            new Item(new FabricItemSettings()));
    public static final Item BORNITE_STONE = registerItem("bornite_stone",
            new Item(new FabricItemSettings()));
    public static final Item CARNELIAN_STONE = registerItem("carnelian_stone",
            new Item(new FabricItemSettings()));
    public static final Item CHALCOPYRITE_STONE = registerItem("chalcopyrite_stone",
            new Item(new FabricItemSettings()));
    public static final Item CHRYSOCOLLA_STONE = registerItem("chrysocolla_stone",
            new Item(new FabricItemSettings()));
    public static final Item CITRON_CHRYSOPRASE_STONE = registerItem("citron_chrysoprase_stone",
            new Item(new FabricItemSettings()));
    public static final Item CLINOHUMITE_STONE = registerItem("clinohumite_stone",
            new Item(new FabricItemSettings()));
    public static final Item DIOPTASE_STONE = registerItem("dioptase_stone",
            new Item(new FabricItemSettings()));
    public static final Item FUCHSITE_STONE = registerItem("fuchsite_stone",
            new Item(new FabricItemSettings()));
    public static final Item GARNET_STONE = registerItem("garnet_stone",
            new Item(new FabricItemSettings()));
    public static final Item HEMIMORPHITE_STONE = registerItem("hemimorphite_stone",
            new Item(new FabricItemSettings()));
    public static final Item IOLITE_STONE = registerItem("iolite_stone",
            new Item(new FabricItemSettings()));
    public static final Item MIDNIGHT_LABRADORITE_STONE = registerItem("midnight_labradorite_stone",
            new Item(new FabricItemSettings()));
    public static final Item LAZULITE_STONE = registerItem("lazulite_stone",
            new Item(new FabricItemSettings()));
    public static final Item LEPIDOLITE_STONE = registerItem("lepidolite_stone",
            new Item(new FabricItemSettings()));
    public static final Item MORGANITE_STONE = registerItem("morganite_stone",
            new Item(new FabricItemSettings()));
    public static final Item PINK_CORUNDUM_STONE = registerItem("pink_corundum_stone",
            new Item(new FabricItemSettings()));
    public static final Item PREHNITE_STONE = registerItem("prehnite_stone",
            new Item(new FabricItemSettings()));
    public static final Item PYRITE_STONE = registerItem("pyrite_stone",
            new Item(new FabricItemSettings()));
    public static final Item PYROMORPHITE_STONE = registerItem("pyromorphite_stone",
            new Item(new FabricItemSettings()));
    public static final Item SUNSTONE_STONE = registerItem("sunstone_stone",
            new Item(new FabricItemSettings()));
    public static final Item TIDE_STONE = registerItem("tide_stone",
            new Item(new FabricItemSettings()));
    public static final Item VARISCITE_STONE = registerItem("variscite_stone",
            new Item(new FabricItemSettings()));
    public static final Item YOWAH_OPAL_STONE = registerItem("yowah_opal_stone",
            new Item(new FabricItemSettings()));
    public static final Item TITANITE_STONE = registerItem("titanite_stone",
            new Item(new FabricItemSettings()));
    public static final Item PETRIFIED_ICE_STONE = registerItem("petrified_ice_stone",
            new Item(new FabricItemSettings()));
    public static final Item PETRIFIED_FIRE_STONE = registerItem("petrified_fire_stone",
            new Item(new FabricItemSettings()));
    public static final Item BERYL_PINK_STONE = registerItem("beryl_pink_stone",
            new Item(new FabricItemSettings()));
    public static final Item BERYL_GREEN_STONE = registerItem("beryl_green_stone",
            new Item(new FabricItemSettings()));
    public static final Item BERYL_TURQUOISE_STONE = registerItem("beryl_turquoise_stone",
            new Item(new FabricItemSettings()));
    public static final Item CARMELTAZITE_STONE = registerItem("carmeltazite_stone",
            new Item(new FabricItemSettings()));
    public static final Item FLUORITE_STONE = registerItem("fluorite_stone",
            new Item(new FabricItemSettings()));
    public static final Item PEACOCK_STONE = registerItem("peacock_stone",
            new Item(new FabricItemSettings()));
    public static final Item TOURMALINE_STONE = registerItem("tourmaline_stone",
            new Item(new FabricItemSettings()));
    public static final Item CUPRITE_STONE = registerItem("cuprite_stone",
            new Item(new FabricItemSettings()));


    public static final Item LOTUS_FLOWER_ITEM = Items.register(new PlaceableOnWaterItem(TakieTerraBlocks.LOTUS_FLOWER, new Item.Settings()));


    //FOODS & INGREDIENTS

    public static final Item AGAVE_SYRUP_BOTTLE = registerItem("agave_syrup_bottle",
            new BottleItem(new FabricItemSettings()));
    public static final Item CHILI_OIL = registerItem("chili_oil",
            new BottleItem(new FabricItemSettings()));
    public static final Item MILK_BOTTLE = registerItem("milk_bottle",
            new BottleItem(new FabricItemSettings()));
    public static final Item AGAR_AGAR = registerItem("agar_agar",
            new Item(new FabricItemSettings()));
    public static final Item FLOUR = registerItem("flour",
            new Item(new FabricItemSettings()));
    public static final Item BUTTER = registerItem("butter",
            new Item(new FabricItemSettings()));
    public static final Item OLIVE_OIL_BOTTLE = registerItem("olive_oil_bottle",
            new BottleItem(new FabricItemSettings()));
    public static final Item JUTE_FIBER = registerItem("jute_fiber",
            new Item(new FabricItemSettings()));
    public static final Item AROMATIC_LOAF = registerItem("aromatic_loaf",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.AROMATIC_LOAF)));
    public static final Item PIZZA_PEPPERONI = registerItem("pizza_pepperoni",
            new AliasedBlockItem(TakieTerraBlocks.PIZZA_PEPPERONI, new Item.Settings().food(TakieTerraFoodComponents.PIZZA_PEPPERONI)));
    public static final Item PIZZA_HAM_AND_PINEAPPLE = registerItem("pizza_ham_and_pineapple",
            new AliasedBlockItem(TakieTerraBlocks.PIZZA_HAM_AND_PINEAPPLE, new Item.Settings().food(TakieTerraFoodComponents.PIZZA_HAM_AND_PINEAPPLE)));
    public static final Item PIZZA_MARGHERITA = registerItem("pizza_margherita",
            new AliasedBlockItem(TakieTerraBlocks.PIZZA_MARGHERITA, new Item.Settings().food(TakieTerraFoodComponents.PIZZA_MARGHERITA)));
    public static final Item PIZZA_VEGGIE = registerItem("pizza_veggie",
            new AliasedBlockItem(TakieTerraBlocks.PIZZA_VEGGIE, new Item.Settings().food(TakieTerraFoodComponents.PIZZA_VEGGIE)));
    public static final Item PIZZA_CRUST = registerItem("pizza_crust",
            new Item(new FabricItemSettings()));
    public static final Item SPAGHETTI = registerItem("spaghetti",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.SPAGHETTI)));
    public static final Item CORN_CHOWDER = registerItem("corn_chowder",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.CORN_CHOWDER)));
    public static final Item SQUASH_SOUP = registerItem("squash_soup",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.SQUASH_SOUP)));
    public static final Item GARDEN_SALAD = registerItem("garden_salad",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.GARDEN_SALAD)));
    public static final Item LEMONADE = registerItem("lemonade",
            new TeaItem(new FabricItemSettings().food(TakieTerraFoodComponents.LEMONADE)));
    public static final Item PIE_CRUST = registerItem("pie_crust",
            new Item(new FabricItemSettings()));
    public static final Item CHEESE = registerItem("cheese",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.CHEESE)));
    public static final Item CREAM_CHEESE = registerItem("cream_cheese",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.CREAM_CHEESE)));
    public static final Item CARAMEL_WALNUT_TART = registerItem("caramel_walnut_tart",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.CARAMEL_WALNUT_TART)));
    public static final Item BUTTER_PECAN_TART = registerItem("butter_pecan_tart",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.BUTTER_PECAN_TART)));
    public static final Item CINNAMON_ROLL = registerItem("cinnamon_roll",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.CINNAMON_ROLL)));
    public static final Item CINNAMON_ROLL_FROSTED = registerItem("cinnamon_roll_frosted",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.CINNAMON_ROLL_FROSTED)));
    public static final Item STUFFED_MUSHROOMS = registerItem("stuffed_mushrooms",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.STUFFED_MUSHROOMS)));
    public static final Item STUFFED_MUSHROOMS_POISON = registerItem("stuffed_mushrooms_poison",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.STUFFED_MUSHROOMS_POISON)));

    //ARMOR
    public static final Item ROSE_GOLD_HELMET = registerItem("rose_gold_helmet",
            new ArmorItem(TakieTerraArmorMaterials.ROSE_GOLD, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item ROSE_GOLD_LEGGINGS = registerItem("rose_gold_leggings",
            new ArmorItem(TakieTerraArmorMaterials.ROSE_GOLD, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item ROSE_GOLD_BOOTS = registerItem("rose_gold_boots",
            new ArmorItem(TakieTerraArmorMaterials.ROSE_GOLD, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item ROSE_GOLD_CHESTPLATE = registerItem("rose_gold_chestplate",
            new ArmorItem(TakieTerraArmorMaterials.ROSE_GOLD, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));

    public static final Item AMETHYST_HELMET = registerItem("amethyst_helmet",
            new ArmorItem(TakieTerraArmorMaterials.AMETHYST, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item AMETHYST_LEGGINGS = registerItem("amethyst_leggings",
            new ArmorItem(TakieTerraArmorMaterials.AMETHYST, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item AMETHYST_BOOTS = registerItem("amethyst_boots",
            new ArmorItem(TakieTerraArmorMaterials.AMETHYST, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item AMETHYST_CHESTPLATE = registerItem("amethyst_chestplate",
            new ArmorItem(TakieTerraArmorMaterials.AMETHYST, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));

    public static final Item CINNABAR_HELMET = registerItem("cinnabar_helmet",
            new ArmorItem(TakieTerraArmorMaterials.CINNABAR, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item CINNABAR_LEGGINGS = registerItem("cinnabar_leggings",
            new ArmorItem(TakieTerraArmorMaterials.CINNABAR, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item CINNABAR_BOOTS = registerItem("cinnabar_boots",
            new ArmorItem(TakieTerraArmorMaterials.CINNABAR, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item CINNABAR_CHESTPLATE = registerItem("cinnabar_chestplate",
            new ArmorItem(TakieTerraArmorMaterials.CINNABAR, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));

    public static final Item NEPHRITE_HELMET = registerItem("nephrite_helmet",
            new ArmorItem(TakieTerraArmorMaterials.NEPHRITE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item NEPHRITE_LEGGINGS = registerItem("nephrite_leggings",
            new ArmorItem(TakieTerraArmorMaterials.NEPHRITE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item NEPHRITE_BOOTS = registerItem("nephrite_boots",
            new ArmorItem(TakieTerraArmorMaterials.NEPHRITE, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item NEPHRITE_CHESTPLATE = registerItem("nephrite_chestplate",
            new ArmorItem(TakieTerraArmorMaterials.NEPHRITE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));

    public static final Item PETRIFIED_ICE_HELMET = registerItem("petrified_ice_helmet",
            new ArmorItem(TakieTerraArmorMaterials.PETRIFIED_ICE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item PETRIFIED_ICE_LEGGINGS = registerItem("petrified_ice_leggings",
            new ArmorItem(TakieTerraArmorMaterials.PETRIFIED_ICE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item PETRIFIED_ICE_BOOTS = registerItem("petrified_ice_boots",
            new ArmorItem(TakieTerraArmorMaterials.PETRIFIED_ICE, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item PETRIFIED_ICE_CHESTPLATE = registerItem("petrified_ice_chestplate",
            new ArmorItem(TakieTerraArmorMaterials.PETRIFIED_ICE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));

    public static final Item PETRIFIED_FIRE_HELMET = registerItem("petrified_fire_helmet",
            new ArmorItem(TakieTerraArmorMaterials.PETRIFIED_FIRE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item PETRIFIED_FIRE_LEGGINGS = registerItem("petrified_fire_leggings",
            new ArmorItem(TakieTerraArmorMaterials.PETRIFIED_FIRE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item PETRIFIED_FIRE_BOOTS = registerItem("petrified_fire_boots",
            new ArmorItem(TakieTerraArmorMaterials.PETRIFIED_FIRE, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item PETRIFIED_FIRE_CHESTPLATE = registerItem("petrified_fire_chestplate",
            new ArmorItem(TakieTerraArmorMaterials.PETRIFIED_FIRE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));

    public static final Item RUBY_HELMET = registerItem("ruby_helmet",
            new ArmorItem(TakieTerraArmorMaterials.RUBY, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings",
            new ArmorItem(TakieTerraArmorMaterials.RUBY, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item RUBY_BOOTS = registerItem("ruby_boots",
            new ArmorItem(TakieTerraArmorMaterials.RUBY, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate",
            new ArmorItem(TakieTerraArmorMaterials.RUBY, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));

    public static final Item SAPPHIRE_HELMET = registerItem("sapphire_helmet",
            new ArmorItem(TakieTerraArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item SAPPHIRE_LEGGINGS = registerItem("sapphire_leggings",
            new ArmorItem(TakieTerraArmorMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item SAPPHIRE_BOOTS = registerItem("sapphire_boots",
            new ArmorItem(TakieTerraArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item SAPPHIRE_CHESTPLATE = registerItem("sapphire_chestplate",
            new ArmorItem(TakieTerraArmorMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));

    public static final Item SEA_OPAL_HELMET = registerItem("sea_opal_helmet",
            new ArmorItem(TakieTerraArmorMaterials.SEA_OPAL, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item SEA_OPAL_LEGGINGS = registerItem("sea_opal_leggings",
            new ArmorItem(TakieTerraArmorMaterials.SEA_OPAL, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item SEA_OPAL_BOOTS = registerItem("sea_opal_boots",
            new ArmorItem(TakieTerraArmorMaterials.SEA_OPAL, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item SEA_OPAL_CHESTPLATE = registerItem("sea_opal_chestplate",
            new ArmorItem(TakieTerraArmorMaterials.SEA_OPAL, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));

    //TOOLS
    public static final Item ROSE_GOLD_SWORD = registerItem("rose_gold_sword",
            new SwordItem(TakieTerraToolMaterials.ROSE_GOLD, 3, -2.4f, new FabricItemSettings()));
    public static final Item ROSE_GOLD_SHOVEL = registerItem("rose_gold_shovel",
            new ShovelItem(TakieTerraToolMaterials.ROSE_GOLD, 1, -3.0f, new FabricItemSettings()));
    public static final Item ROSE_GOLD_PICKAXE = registerItem("rose_gold_pickaxe",
            new PickaxeItem(TakieTerraToolMaterials.ROSE_GOLD, 1, -2.8f, new FabricItemSettings()));
    public static final Item ROSE_GOLD_AXE = registerItem("rose_gold_axe",
            new AxeItem(TakieTerraToolMaterials.ROSE_GOLD, 6, -3.0f, new FabricItemSettings()));
    public static final Item ROSE_GOLD_HOE = registerItem("rose_gold_hoe",
            new HoeItem(TakieTerraToolMaterials.ROSE_GOLD, 0, -3.0f, new FabricItemSettings()));

    public static final Item PETRIFIED_FIRE_SWORD = registerItem("petrified_fire_sword",
            new FireSwordItem(3, -2.4f, new FabricItemSettings()));
    public static final Item PETRIFIED_ICE_SWORD = registerItem("petrified_ice_sword",
            new IceSwordItem(3, -2.4f, new FabricItemSettings()));

    public static final Item AMETHYST_SWORD = registerItem("amethyst_sword",
            new SwordItem(TakieTerraToolMaterials.AMETHYST, 3, -2.4f, new FabricItemSettings()));
    public static final Item AMETHYST_SHOVEL = registerItem("amethyst_shovel",
            new ShovelItem(TakieTerraToolMaterials.AMETHYST, 1, -3.0f, new FabricItemSettings()));
    public static final Item AMETHYST_PICKAXE = registerItem("amethyst_pickaxe",
            new PickaxeItem(TakieTerraToolMaterials.AMETHYST, 1, -2.8f, new FabricItemSettings()));
    public static final Item AMETHYST_AXE = registerItem("amethyst_axe",
            new AxeItem(TakieTerraToolMaterials.AMETHYST, 6, -3.0f, new FabricItemSettings()));
    public static final Item AMETHYST_HOE = registerItem("amethyst_hoe",
            new HoeItem(TakieTerraToolMaterials.AMETHYST, 0, -3.0f, new FabricItemSettings()));


    //CROPS
    public static final Item TOMATO = registerItem("tomato",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.TOMATO)));
    public static final Item CORN = registerItem("corn",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.CORN)));
    public static final Item PEAR = registerItem("pear",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.PEAR)));
    public static final Item LETTUCE = registerItem("lettuce",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.LETTUCE)));
    public static final Item CUCUMBER = registerItem("cucumber",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.CUCUMBER)));
    public static final Item SPINACH = registerItem("spinach",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.SPINACH)));
    public static final Item SPRING_ONION = registerItem("spring_onion",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.SPRING_ONION)));
    public static final Item STRAWBERRY = registerItem("strawberry",
            new AliasedBlockItem(TakieTerraBlocks.WILD_STRAWBERRY_BUSH_RED, new Item.Settings().food(TakieTerraFoodComponents.STRAWBERRY)));
    public static final Item STRAWBERRY_WHITE = registerItem("strawberry_white",
            new AliasedBlockItem(TakieTerraBlocks.WILD_STRAWBERRY_BUSH_WHITE, new Item.Settings().food(TakieTerraFoodComponents.STRAWBERRY_WHITE)));

    public static final Item MANGO = registerItem("mango",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.MANGO)));
    public static final Item MYRTA_FRUIT = registerItem("myrta_fruit",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.MYRTA_FRUIT)));
    public static final Item BROCCOLI = registerItem("broccoli",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.BROCCOLI)));
    public static final Item CAULIFLOWER = registerItem("cauliflower",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.CAULIFLOWER)));
    public static final Item CHILI_PEPPER = registerItem("chili_pepper",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.CHILI_PEPPER)));

    public static final Item GRAPES = registerItem("grapes",
            new AliasedBlockItem(TakieTerraBlocks.GRAPE_VINES, new Item.Settings().food(TakieTerraFoodComponents.GRAPES)));
    public static final Item RASPBERRY = registerItem("raspberry",
            new AliasedBlockItem(TakieTerraBlocks.WILD_RASPBERRY_BUSH, new Item.Settings().food(TakieTerraFoodComponents.RASPBERRY)));
    public static final Item MANDARIN = registerItem("mandarin",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.MANDARIN)));
    public static final Item CHERRY = registerItem("cherry",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.CHERRY)));
    public static final Item LEMON = registerItem("lemon",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.LEMON)));
    public static final Item LIME = registerItem("lime",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.LIME)));
    public static final Item OLIVE = registerItem("olive",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.OLIVE)));
    public static final Item WALNUT = registerItem("walnut",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.WALNUT)));
    public static final Item GREEN_BEAN = registerItem("green_bean",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.GREEN_BEAN)));
    public static final Item SICHUAN_GREEN_BEANS = registerItem("sichuan_green_beans",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.SICHUAN_GREEN_BEANS)));
    public static final Item PECAN = registerItem("pecan",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.PECAN)));
    public static final Item CINNAMON_BARK = registerItem("cinnamon_bark",
            new Item(new FabricItemSettings()));
    public static final Item MANGO_SEED = registerItem("mango_seed",
            new AliasedBlockItem(TakieTerraTreeBlocks.MANGO_SAPLING,
                    new Item.Settings().rarity(Rarity.COMMON)));

    public static final Item PLUM = registerItem("plum",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.PLUM)));
    public static final Item PEACH = registerItem("peach",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.PEACH)));

    public static final Item SQUASH_SLICE = registerItem("squash_slice",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.SQUASH_SLICE)));
    public static final Item SQUASH_SEEDS = registerItem("squash_seeds",
            new AliasedBlockItem(TakieTerraBlocks.SQUASH_STEM, new FabricItemSettings()));
    public static final Item CANTALOUPE_SLICE = registerItem("cantaloupe_slice",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.CANTALOUPE_SLICE)));
    public static final Item CANTALOUPE_SEEDS = registerItem("cantaloupe_seeds",
            new AliasedBlockItem(TakieTerraBlocks.CANTALOUPE_STEM, new FabricItemSettings()));
    public static final Item HONEYDEW_SLICE = registerItem("honeydew_slice",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.HONEYDEW_SLICE)));
    public static final Item HONEYDEW_SEEDS = registerItem("honeydew_seeds",
            new AliasedBlockItem(TakieTerraBlocks.HONEYDEW_STEM, new FabricItemSettings()));

    public static final Item OATS = registerItem("oats",
            new Item(new FabricItemSettings()));
    public static final Item OAT_SEEDS = registerItem("oat_seeds",
            new AliasedBlockItem(TakieTerraBlocks.OAT_CROP, new Item.Settings()));
    public static final Item RICE = registerItem("rice",
            new AliasedBlockItem(TakieTerraBlocks.RICE_CROP, new Item.Settings()));
    public static final Item GREEN_BEAN_SEEDS = registerItem("green_bean_seeds",
            new AliasedBlockItem(TakieTerraBlocks.GREEN_BEAN_CROP, new Item.Settings()));
    public static final Item STEAMED_RICE = registerItem("steamed_rice",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.STEAMED_RICE)));
    public static final Item SUSHI_TAMAGO = registerItem("sushi_tamago",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.SUSHI_TAMAGO)));
    public static final Item SUSHI_NIGIRI = registerItem("sushi_nigiri",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.SUSHI_NIGIRI)));
    public static final Item SUSHI_VEGETABLE_ROLLS = registerItem("sushi_vegetable_rolls",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.SUSHI_VEGETABLE_ROLLS)));
    public static final Item OAT_FLOUR = registerItem("oat_flour",
            new Item(new FabricItemSettings()));
    public static final Item RASPBERRY_SEEDS = registerItem("raspberry_seeds",
            new AliasedBlockItem(TakieTerraBlocks.RASPBERRY_BUSH, new Item.Settings()));

    public static final Item PIE_SLICE_PLUM = registerItem("pie_slice_plum",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.PIE_SLICE_PLUM)));
    public static final Item PIE_SLICE_PEACH = registerItem("pie_slice_peach",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.PIE_SLICE_PEACH)));
    public static final Item PIE_SLICE_RASPBERRY = registerItem("pie_slice_raspberry",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.PIE_SLICE_RASPBERRY)));

    public static final Item LAMPEAR = registerItem("lampear",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.LAMPEAR)));

    public static final Item COPPER_LAMPEAR = registerItem("copper_lampear",
            new Item(new FabricItemSettings().food(TakieTerraFoodComponents.COPPER_LAMPEAR)));

    public static final Item PEAR_TART = registerItem("pear_tart", new Item(new Item.Settings().food(TakieTerraFoodComponents.PEAR_TART)));


    //CROP SEEDS
    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds",
            new AliasedBlockItem(TakieTerraBlocks.TOMATO_CROP, new Item.Settings()));
    public static final Item CORN_SEEDS = registerItem("corn_seeds",
            new AliasedBlockItem(TakieTerraBlocks.CORN_CROP, new Item.Settings()));
    public static final Item LETTUCE_SEEDS = registerItem("lettuce_seeds",
            new AliasedBlockItem(TakieTerraBlocks.LETTUCE_CROP, new Item.Settings()));
    public static final Item CUCUMBER_SEEDS = registerItem("cucumber_seeds",
            new AliasedBlockItem(TakieTerraBlocks.CUCUMBER_CROP, new Item.Settings()));
    public static final Item SPINACH_SEEDS = registerItem("spinach_seeds",
            new AliasedBlockItem(TakieTerraBlocks.SPINACH_CROP, new Item.Settings()));
    public static final Item STRAWBERRY_SEEDS = registerItem("strawberry_seeds",
            new AliasedBlockItem(TakieTerraBlocks.STRAWBERRY_CROP, new Item.Settings()));
    public static final Item TEA_SEEDS = registerItem("tea_seeds",
            new AliasedBlockItem(TakieTerraBlocks.TEA_CROP, new Item.Settings()));
    public static final Item JASMINE_SEEDS = registerItem("jasmine_seeds",
            new AliasedBlockItem(TakieTerraBlocks.JASMINE_CROP, new Item.Settings()));
    public static final Item SUNFLOWER_SEED = registerItem("sunflower_seed",
            new Item(new Item.Settings().food(TakieTerraFoodComponents.SUNFLOWER_SEED)));
    public static final Item TEA_LEAVES = registerItem("tea_leaves",
            new AliasedBlockItem(TakieTerraBlocks.TEA_CROP, new Item.Settings()));
    public static final Item ROASTED_TEA_LEAVES = registerItem("roasted_tea_leaves",
            new Item(new Item.Settings()));
    public static final Item OXIDIZED_TEA_LEAVES = registerItem("oxidized_tea_leaves",
            new Item(new Item.Settings()));
    public static final Item COFFEE_BEANS = registerItem("coffee_beans",
            new Item(new Item.Settings()));
    public static final Item COFFEE_BEANS_ROASTED = registerItem("coffee_beans_roasted",
            new Item(new Item.Settings()));
    public static final Item COFFEE = registerItem("coffee",
            new Item(new Item.Settings()));
    public static final Item JASMINE_FLOWERS = registerItem("jasmine_flowers",
            new AliasedBlockItem(TakieTerraBlocks.JASMINE_CROP, new Item.Settings()));
    public static final Item JASMINE_BRANCH = registerItem("jasmine_branch",
            new AliasedBlockItem(TakieTerraBlocks.JASMINE_BRANCH_BLOCK, new Item.Settings()));
    public static final Item COTTON_BOLL = registerItem("cotton_boll",
            new AliasedBlockItem(TakieTerraBlocks.COTTON_CROP, new Item.Settings()));
    public static final Item JUTE = registerItem("jute",
            new AliasedBlockItem(TakieTerraBlocks.JUTE_CROP, new Item.Settings()));
    public static final Item APPLEMINT_SEEDS = registerItem("applemint_seeds",
            new AliasedBlockItem(TakieTerraBlocks.APPLEMINT, new Item.Settings()));
    public static final Item ROSEMARY_SEEDS = registerItem("rosemary_seeds",
            new AliasedBlockItem(TakieTerraBlocks.ROSEMARY, new Item.Settings()));
    public static final Item LAVENDER_SEEDS = registerItem("lavender_seeds",
            new AliasedBlockItem(TakieTerraBlocks.LAVENDER, new Item.Settings()));
    public static final Item BASIL_SEEDS = registerItem("basil_seeds",
            new AliasedBlockItem(TakieTerraBlocks.BASIL, new Item.Settings()));
    public static final Item THYME_SEEDS = registerItem("thyme_seeds",
            new AliasedBlockItem(TakieTerraBlocks.THYME, new Item.Settings()));
    public static final Item TANSY_SEEDS = registerItem("tansy_seeds",
            new AliasedBlockItem(TakieTerraBlocks.TANSY, new Item.Settings()));
    public static final Item SPRING_ONION_SEEDS = registerItem("spring_onion_seeds",
            new AliasedBlockItem(TakieTerraBlocks.SPRING_ONION_CROP, new Item.Settings()));
    public static final Item BROCCOLI_SEEDS = registerItem("broccoli_seeds",
            new AliasedBlockItem(TakieTerraBlocks.BROCCOLI_CROP, new Item.Settings()));
    public static final Item CAULIFLOWER_SEEDS = registerItem("cauliflower_seeds",
            new AliasedBlockItem(TakieTerraBlocks.CAULIFLOWER_CROP, new Item.Settings()));
    public static final Item COTTON_SEEDS = registerItem("cotton_seeds",
            new AliasedBlockItem(TakieTerraBlocks.COTTON_CROP, new Item.Settings()));
    public static final Item CHILI_SEEDS = registerItem("chili_seeds",
            new AliasedBlockItem(TakieTerraBlocks.CHILI_CROP, new Item.Settings()));
    public static final Item JUTE_SEEDS = registerItem("jute_seeds",
            new AliasedBlockItem(TakieTerraBlocks.JUTE_CROP, new Item.Settings()));

    public static final Item PAINT_BUCKET = registerItem("paint_bucket",
            new Item(new FabricItemSettings().maxCount(16)));


    //TEA
    public static final Item TEA_APPLEMINT = registerItem("tea_applemint",
            new TeaItem(new Item.Settings().food(TakieTerraFoodComponents.TEA_APPLEMINT)));
    public static final Item TEA_BLACK = registerItem("tea_black",
            new TeaItem(new Item.Settings().food(TakieTerraFoodComponents.TEA_BLACK)));
    public static final Item TEA_CHAMOMILE = registerItem("tea_chamomile",
            new TeaItem(new Item.Settings().food(TakieTerraFoodComponents.TEA_CHAMOMILE)));
    public static final Item TEA_GREEN = registerItem("tea_green",
            new TeaItem(new Item.Settings().food(TakieTerraFoodComponents.TEA_GREEN)));
    public static final Item TEA_JASMINE = registerItem("tea_jasmine",
            new TeaItem(new Item.Settings().food(TakieTerraFoodComponents.TEA_JASMINE)));
    public static final Item TEA_HIBISCUS = registerItem("tea_hibiscus",
            new TeaItem(new Item.Settings().food(TakieTerraFoodComponents.TEA_HIBISCUS)));
    public static final Item TEA_HERBAL = registerItem("tea_herbal",
            new TeaItem(new Item.Settings().food(TakieTerraFoodComponents.TEA_HERBAL)));
    public static final Item TEA_MILK = registerItem("tea_milk",
            new TeaItem(new Item.Settings().food(TakieTerraFoodComponents.TEA_MILK)));
    public static final Item TEA_SWEET_BERRY = registerItem("tea_sweet_berry",
            new TeaItem(new Item.Settings().food(TakieTerraFoodComponents.TEA_SWEET_BERRY)));
    public static final Item LATTE = registerItem("latte",
            new AliasedBlockItem(TakieTerraBlocks.CUP_LATTE, new Item.Settings().food(TakieTerraFoodComponents.LATTE)));
    public static final Item CAPPUCCINO = registerItem("cappuccino",
            new AliasedBlockItem(TakieTerraBlocks.CUP_CAPPUCCINO, new Item.Settings().food(TakieTerraFoodComponents.CAPPUCCINO)));
    public static final Item BROWN_SUGAR_MILK_TEA = registerItem("brown_sugar_milk_tea",
            new AliasedBlockItem(TakieTerraBlocks.CUP_BROWN_SUGAR_MILK_TEA, new Item.Settings().food(TakieTerraFoodComponents.BROWN_SUGAR_MILK_TEA)));
    public static final Item CHOCOLATE_MILK_TEA = registerItem("chocolate_milk_tea",
            new AliasedBlockItem(TakieTerraBlocks.CUP_CHOCOLATE_MILK_TEA, new Item.Settings().food(TakieTerraFoodComponents.CHOCOLATE_MILK_TEA)));
    public static final Item GRASS_JELLY_MILK_TEA = registerItem("grass_jelly_milk_tea",
            new AliasedBlockItem(TakieTerraBlocks.CUP_GRASS_JELLY_MILK_TEA, new Item.Settings().food(TakieTerraFoodComponents.GRASS_JELLY_MILK_TEA)));
    public static final Item HONEY_ORANGE_BLOSSOM_MILK_TEA = registerItem("honey_orange_blossom_milk_tea",
            new AliasedBlockItem(TakieTerraBlocks.CUP_HONEY_ORANGE_BLOSSOM_MILK_TEA, new Item.Settings().food(TakieTerraFoodComponents.HONEY_ORANGE_BLOSSOM_MILK_TEA)));
    public static final Item HONEYDEW_MELON_MILK_TEA = registerItem("honeydew_melon_milk_tea",
            new AliasedBlockItem(TakieTerraBlocks.CUP_HONEYDEW_MELON_MILK_TEA, new Item.Settings().food(TakieTerraFoodComponents.HONEYDEW_MELON_MILK_TEA)));
    public static final Item MANGO_MILK_TEA = registerItem("mango_milk_tea",
            new AliasedBlockItem(TakieTerraBlocks.CUP_MANGO_MILK_TEA, new Item.Settings().food(TakieTerraFoodComponents.MANGO_MILK_TEA)));
    public static final Item TARO_MILK_TEA = registerItem("taro_milk_tea",
            new AliasedBlockItem(TakieTerraBlocks.CUP_TARO_MILK_TEA, new Item.Settings().food(TakieTerraFoodComponents.TARO_MILK_TEA)));
    public static final Item YUENYEUNG = registerItem("yuenyeung",
            new AliasedBlockItem(TakieTerraBlocks.CUP_YUENYEUNG, new Item.Settings().food(TakieTerraFoodComponents.YUENYEUNG)));


    //FOOD
    public static final Item PANCAKES = registerItem("pancakes",
            new Item(new Item.Settings().food(TakieTerraFoodComponents.PANCAKES)));
    public static final Item PANCAKES_STRAWBERRY = registerItem("pancakes_strawberry",
            new Item(new Item.Settings().food(TakieTerraFoodComponents.PANCAKES_STRAWBERRY)));
    public static final Item PANCAKES_SWEET_BERRY = registerItem("pancakes_sweet_berry",
            new Item(new Item.Settings().food(TakieTerraFoodComponents.PANCAKES_SWEET_BERRY)));
    public static final Item MANGO_PUDDING = registerItem("mango_pudding",
            new Item(new Item.Settings().food(TakieTerraFoodComponents.MANGO_PUDDING)));
    public static final Item SANDWICH_BLT = registerItem("sandwich_blt",
            new Item(new Item.Settings().food(TakieTerraFoodComponents.SANDWICH_BLT)));
    public static final Item FISH_AND_CHIPS = registerItem("fish_and_chips",
            new Item(new Item.Settings().food(TakieTerraFoodComponents.FISH_AND_CHIPS)));
    public static final Item FRIED_EGG = registerItem("fried_egg",
            new Item(new Item.Settings().food(TakieTerraFoodComponents.FRIED_EGG)));
    public static final Item CHEESY_OMELETTE = registerItem("cheesy_omelette",
            new Item(new Item.Settings().food(TakieTerraFoodComponents.CHEESY_OMELETTE)));

    //SIGNS

    public static final Item RED_MAPLE_SIGN = registerItem("red_maple_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.RED_MAPLE_SIGN, TakieTerraTreeBlocks.RED_MAPLE_WALL_SIGN));
    public static final Item RED_MAPLE_HANGING_SIGN = registerItem("red_maple_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.RED_MAPLE_HANGING_SIGN, TakieTerraTreeBlocks.RED_MAPLE_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item PEAR_SIGN = registerItem("pear_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.PEAR_SIGN, TakieTerraTreeBlocks.PEAR_WALL_SIGN));
    public static final Item PEAR_HANGING_SIGN = registerItem("pear_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.PEAR_HANGING_SIGN, TakieTerraTreeBlocks.PEAR_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item AUTUMN_ASPEN_SIGN = registerItem("autumn_aspen_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.AUTUMN_ASPEN_SIGN, TakieTerraTreeBlocks.AUTUMN_ASPEN_WALL_SIGN));
    public static final Item AUTUMN_ASPEN_HANGING_SIGN = registerItem("autumn_aspen_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.AUTUMN_ASPEN_HANGING_SIGN, TakieTerraTreeBlocks.AUTUMN_ASPEN_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item BLUE_GUM_SIGN = registerItem("blue_gum_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.BLUE_GUM_SIGN, TakieTerraTreeBlocks.BLUE_GUM_WALL_SIGN));
    public static final Item BLUE_GUM_HANGING_SIGN = registerItem("blue_gum_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.BLUE_GUM_HANGING_SIGN, TakieTerraTreeBlocks.BLUE_GUM_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item CAMELLIA_SIGN = registerItem("camellia_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.CAMELLIA_SIGN, TakieTerraTreeBlocks.CAMELLIA_WALL_SIGN));
    public static final Item CAMELLIA_HANGING_SIGN = registerItem("camellia_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.CAMELLIA_HANGING_SIGN, TakieTerraTreeBlocks.CAMELLIA_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item EBONY_SIGN = registerItem("ebony_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.EBONY_SIGN, TakieTerraTreeBlocks.EBONY_WALL_SIGN));
    public static final Item EBONY_HANGING_SIGN = registerItem("ebony_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.EBONY_HANGING_SIGN, TakieTerraTreeBlocks.EBONY_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item GINKGO_SIGN = registerItem("ginkgo_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.GINKGO_SIGN, TakieTerraTreeBlocks.GINKGO_WALL_SIGN));
    public static final Item GINKGO_HANGING_SIGN = registerItem("ginkgo_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.GINKGO_HANGING_SIGN, TakieTerraTreeBlocks.GINKGO_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item IRONWOOD_SIGN = registerItem("ironwood_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.IRONWOOD_SIGN, TakieTerraTreeBlocks.IRONWOOD_WALL_SIGN));
    public static final Item IRONWOOD_HANGING_SIGN = registerItem("ironwood_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.IRONWOOD_HANGING_SIGN, TakieTerraTreeBlocks.IRONWOOD_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item JACARANDA_SIGN = registerItem("jacaranda_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.JACARANDA_SIGN, TakieTerraTreeBlocks.JACARANDA_WALL_SIGN));
    public static final Item JACARANDA_HANGING_SIGN = registerItem("jacaranda_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.JACARANDA_HANGING_SIGN, TakieTerraTreeBlocks.JACARANDA_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item KNOBCONE_PINE_SIGN = registerItem("knobcone_pine_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.KNOBCONE_PINE_SIGN, TakieTerraTreeBlocks.KNOBCONE_PINE_WALL_SIGN));
    public static final Item KNOBCONE_PINE_HANGING_SIGN = registerItem("knobcone_pine_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.KNOBCONE_PINE_HANGING_SIGN, TakieTerraTreeBlocks.KNOBCONE_PINE_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item LAPACHO_SIGN = registerItem("lapacho_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.LAPACHO_SIGN, TakieTerraTreeBlocks.LAPACHO_WALL_SIGN));
    public static final Item LAPACHO_HANGING_SIGN = registerItem("lapacho_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.LAPACHO_HANGING_SIGN, TakieTerraTreeBlocks.LAPACHO_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item MAHOGANY_SIGN = registerItem("mahogany_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.MAHOGANY_SIGN, TakieTerraTreeBlocks.MAHOGANY_WALL_SIGN));
    public static final Item MAHOGANY_HANGING_SIGN = registerItem("mahogany_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.MAHOGANY_HANGING_SIGN, TakieTerraTreeBlocks.MAHOGANY_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item MANGO_SIGN = registerItem("mango_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.MANGO_SIGN, TakieTerraTreeBlocks.MANGO_WALL_SIGN));
    public static final Item MANGO_HANGING_SIGN = registerItem("mango_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.MANGO_HANGING_SIGN, TakieTerraTreeBlocks.MANGO_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item PALO_VERDE_SIGN = registerItem("palo_verde_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.PALO_VERDE_SIGN, TakieTerraTreeBlocks.PALO_VERDE_WALL_SIGN));
    public static final Item PALO_VERDE_HANGING_SIGN = registerItem("palo_verde_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.PALO_VERDE_HANGING_SIGN, TakieTerraTreeBlocks.PALO_VERDE_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item PEACH_SIGN = registerItem("peach_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.PEACH_SIGN, TakieTerraTreeBlocks.PEACH_WALL_SIGN));
    public static final Item PEACH_HANGING_SIGN = registerItem("peach_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.PEACH_HANGING_SIGN, TakieTerraTreeBlocks.PEACH_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item PINE_SIGN = registerItem("pine_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.PINE_SIGN, TakieTerraTreeBlocks.PINE_WALL_SIGN));
    public static final Item PINE_HANGING_SIGN = registerItem("pine_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.PINE_HANGING_SIGN, TakieTerraTreeBlocks.PINE_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item PLUM_SIGN = registerItem("plum_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.PLUM_SIGN, TakieTerraTreeBlocks.PLUM_WALL_SIGN));
    public static final Item PLUM_HANGING_SIGN = registerItem("plum_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.PLUM_HANGING_SIGN, TakieTerraTreeBlocks.PLUM_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item PONDEROSA_PINE_SIGN = registerItem("ponderosa_pine_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.PONDEROSA_PINE_SIGN, TakieTerraTreeBlocks.PONDEROSA_PINE_WALL_SIGN));
    public static final Item PONDEROSA_PINE_HANGING_SIGN = registerItem("ponderosa_pine_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.PONDEROSA_PINE_HANGING_SIGN, TakieTerraTreeBlocks.PONDEROSA_PINE_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item RAINBOW_GUM_SIGN = registerItem("rainbow_gum_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.RAINBOW_GUM_SIGN, TakieTerraTreeBlocks.RAINBOW_GUM_WALL_SIGN));
    public static final Item RAINBOW_GUM_HANGING_SIGN = registerItem("rainbow_gum_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.RAINBOW_GUM_HANGING_SIGN, TakieTerraTreeBlocks.RAINBOW_GUM_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item SYCAMORE_SIGN = registerItem("sycamore_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.SYCAMORE_SIGN, TakieTerraTreeBlocks.SYCAMORE_WALL_SIGN));
    public static final Item SYCAMORE_HANGING_SIGN = registerItem("sycamore_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.SYCAMORE_HANGING_SIGN, TakieTerraTreeBlocks.SYCAMORE_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item WALNUT_SIGN = registerItem("walnut_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.WALNUT_SIGN, TakieTerraTreeBlocks.WALNUT_WALL_SIGN));
    public static final Item WALNUT_HANGING_SIGN = registerItem("walnut_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.WALNUT_HANGING_SIGN, TakieTerraTreeBlocks.WALNUT_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item WILLOW_SIGN = registerItem("willow_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.WILLOW_SIGN, TakieTerraTreeBlocks.WILLOW_WALL_SIGN));
    public static final Item WILLOW_HANGING_SIGN = registerItem("willow_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.WILLOW_HANGING_SIGN, TakieTerraTreeBlocks.WILLOW_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item DEAD_SIGN = registerItem("dead_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.DEAD_SIGN, TakieTerraTreeBlocks.DEAD_WALL_SIGN));
    public static final Item DEAD_HANGING_SIGN = registerItem("dead_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.DEAD_HANGING_SIGN, TakieTerraTreeBlocks.DEAD_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item KAURI_SIGN = registerItem("kauri_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.KAURI_SIGN, TakieTerraTreeBlocks.KAURI_WALL_SIGN));
    public static final Item KAURI_HANGING_SIGN = registerItem("kauri_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.KAURI_HANGING_SIGN, TakieTerraTreeBlocks.KAURI_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item CAMPHOR_SIGN = registerItem("camphor_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.CAMPHOR_SIGN, TakieTerraTreeBlocks.CAMPHOR_WALL_SIGN));
    public static final Item CAMPHOR_HANGING_SIGN = registerItem("camphor_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.CAMPHOR_HANGING_SIGN, TakieTerraTreeBlocks.CAMPHOR_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item SNOW_GHOST_SIGN = registerItem("snow_ghost_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.SNOW_GHOST_SIGN, TakieTerraTreeBlocks.SNOW_GHOST_WALL_SIGN));
    public static final Item SNOW_GHOST_HANGING_SIGN = registerItem("snow_ghost_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.SNOW_GHOST_HANGING_SIGN, TakieTerraTreeBlocks.SNOW_GHOST_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item WINTER_BLOSSOM_SIGN = registerItem("winter_blossom_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.WINTER_BLOSSOM_SIGN, TakieTerraTreeBlocks.WINTER_BLOSSOM_WALL_SIGN));
    public static final Item WINTER_BLOSSOM_HANGING_SIGN = registerItem("winter_blossom_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.WINTER_BLOSSOM_HANGING_SIGN, TakieTerraTreeBlocks.WINTER_BLOSSOM_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item BALD_CYPRESS_SIGN = registerItem("bald_cypress_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.BALD_CYPRESS_SIGN, TakieTerraTreeBlocks.BALD_CYPRESS_WALL_SIGN));
    public static final Item BALD_CYPRESS_HANGING_SIGN = registerItem("bald_cypress_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.BALD_CYPRESS_HANGING_SIGN, TakieTerraTreeBlocks.BALD_CYPRESS_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item MYRTA_SIGN = registerItem("myrta_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.MYRTA_SIGN, TakieTerraTreeBlocks.MYRTA_WALL_SIGN));
    public static final Item MYRTA_HANGING_SIGN = registerItem("myrta_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.MYRTA_HANGING_SIGN, TakieTerraTreeBlocks.MYRTA_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item MOSSY_HEART_SIGN = registerItem("mossy_heart_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.MOSSY_HEART_SIGN, TakieTerraTreeBlocks.MOSSY_HEART_WALL_SIGN));
    public static final Item MOSSY_HEART_HANGING_SIGN = registerItem("mossy_heart_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.MOSSY_HEART_HANGING_SIGN, TakieTerraTreeBlocks.MOSSY_HEART_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item YELLOWWOOD_SIGN = registerItem("yellowwood_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.YELLOWWOOD_SIGN, TakieTerraTreeBlocks.YELLOWWOOD_WALL_SIGN));
    public static final Item YELLOWWOOD_HANGING_SIGN = registerItem("yellowwood_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.YELLOWWOOD_HANGING_SIGN, TakieTerraTreeBlocks.YELLOWWOOD_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item AEGIA_SIGN = registerItem("aegia_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.AEGIA_SIGN, TakieTerraTreeBlocks.AEGIA_WALL_SIGN));
    public static final Item AEGIA_HANGING_SIGN = registerItem("aegia_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.AEGIA_HANGING_SIGN, TakieTerraTreeBlocks.AEGIA_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item JUNIPER_SIGN = registerItem("juniper_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.JUNIPER_SIGN, TakieTerraTreeBlocks.JUNIPER_WALL_SIGN));
    public static final Item JUNIPER_HANGING_SIGN = registerItem("juniper_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.JUNIPER_HANGING_SIGN, TakieTerraTreeBlocks.JUNIPER_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item BEECH_SIGN = registerItem("beech_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.BEECH_SIGN, TakieTerraTreeBlocks.BEECH_WALL_SIGN));
    public static final Item BEECH_HANGING_SIGN = registerItem("beech_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.BEECH_HANGING_SIGN, TakieTerraTreeBlocks.BEECH_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item LARCH_SIGN = registerItem("larch_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.LARCH_SIGN, TakieTerraTreeBlocks.LARCH_WALL_SIGN));
    public static final Item LARCH_HANGING_SIGN = registerItem("larch_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.LARCH_HANGING_SIGN, TakieTerraTreeBlocks.LARCH_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item FIR_SIGN = registerItem("fir_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.FIR_SIGN, TakieTerraTreeBlocks.FIR_WALL_SIGN));
    public static final Item FIR_HANGING_SIGN = registerItem("fir_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.FIR_HANGING_SIGN, TakieTerraTreeBlocks.FIR_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item SEQUOIA_SIGN = registerItem("sequoia_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.SEQUOIA_SIGN, TakieTerraTreeBlocks.SEQUOIA_WALL_SIGN));
    public static final Item SEQUOIA_HANGING_SIGN = registerItem("sequoia_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.SEQUOIA_HANGING_SIGN, TakieTerraTreeBlocks.SEQUOIA_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item INDIKO_SIGN = registerItem("indiko_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.INDIKO_SIGN, TakieTerraTreeBlocks.INDIKO_WALL_SIGN));
    public static final Item INDIKO_HANGING_SIGN = registerItem("indiko_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.INDIKO_HANGING_SIGN, TakieTerraTreeBlocks.INDIKO_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item MADRONE_SIGN = registerItem("madrone_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.MADRONE_SIGN, TakieTerraTreeBlocks.MADRONE_WALL_SIGN));
    public static final Item MADRONE_HANGING_SIGN = registerItem("madrone_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.MADRONE_HANGING_SIGN, TakieTerraTreeBlocks.MADRONE_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item NOMERIA_SIGN = registerItem("nomeria_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.NOMERIA_SIGN, TakieTerraTreeBlocks.NOMERIA_WALL_SIGN));
    public static final Item NOMERIA_HANGING_SIGN = registerItem("nomeria_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.NOMERIA_HANGING_SIGN, TakieTerraTreeBlocks.NOMERIA_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item PARASHOREA_SIGN = registerItem("parashorea_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.PARASHOREA_SIGN, TakieTerraTreeBlocks.PARASHOREA_WALL_SIGN));
    public static final Item PARASHOREA_HANGING_SIGN = registerItem("parashorea_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.PARASHOREA_HANGING_SIGN, TakieTerraTreeBlocks.PARASHOREA_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item SWEETGUM_SIGN = registerItem("sweetgum_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.SWEETGUM_SIGN, TakieTerraTreeBlocks.SWEETGUM_WALL_SIGN));
    public static final Item SWEETGUM_HANGING_SIGN = registerItem("sweetgum_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.SWEETGUM_HANGING_SIGN, TakieTerraTreeBlocks.SWEETGUM_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item WISTERIA_SIGN = registerItem("wisteria_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.WISTERIA_SIGN, TakieTerraTreeBlocks.WISTERIA_WALL_SIGN));
    public static final Item WISTERIA_HANGING_SIGN = registerItem("wisteria_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.WISTERIA_HANGING_SIGN, TakieTerraTreeBlocks.WISTERIA_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item ZISSIAN_SIGN = registerItem("zissian_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.ZISSIAN_SIGN, TakieTerraTreeBlocks.ZISSIAN_WALL_SIGN));
    public static final Item ZISSIAN_HANGING_SIGN = registerItem("zissian_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.ZISSIAN_HANGING_SIGN, TakieTerraTreeBlocks.ZISSIAN_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item PECAN_SIGN = registerItem("pecan_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.PECAN_SIGN, TakieTerraTreeBlocks.PECAN_WALL_SIGN));
    public static final Item PECAN_HANGING_SIGN = registerItem("pecan_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.PECAN_HANGING_SIGN, TakieTerraTreeBlocks.PECAN_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item WITCH_HAZEL_SIGN = registerItem("witch_hazel_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.WITCH_HAZEL_SIGN, TakieTerraTreeBlocks.WITCH_HAZEL_WALL_SIGN));
    public static final Item WITCH_HAZEL_HANGING_SIGN = registerItem("witch_hazel_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.WITCH_HAZEL_HANGING_SIGN, TakieTerraTreeBlocks.WITCH_HAZEL_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item ZELKOVA_SIGN = registerItem("zelkova_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.ZELKOVA_SIGN, TakieTerraTreeBlocks.ZELKOVA_WALL_SIGN));
    public static final Item ZELKOVA_HANGING_SIGN = registerItem("zelkova_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.ZELKOVA_HANGING_SIGN, TakieTerraTreeBlocks.ZELKOVA_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item AUTUMN_ZELKOVA_SIGN = registerItem("autumn_zelkova_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.AUTUMN_ZELKOVA_SIGN, TakieTerraTreeBlocks.AUTUMN_ZELKOVA_WALL_SIGN));
    public static final Item AUTUMN_ZELKOVA_HANGING_SIGN = registerItem("autumn_zelkova_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.AUTUMN_ZELKOVA_HANGING_SIGN, TakieTerraTreeBlocks.AUTUMN_ZELKOVA_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item MIMOSA_SIGN = registerItem("mimosa_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.MIMOSA_SIGN, TakieTerraTreeBlocks.MIMOSA_WALL_SIGN));
    public static final Item MIMOSA_HANGING_SIGN = registerItem("mimosa_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.MIMOSA_HANGING_SIGN, TakieTerraTreeBlocks.MIMOSA_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item FLAMEBARK_SIGN = registerItem("flamebark_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.FLAMEBARK_SIGN, TakieTerraTreeBlocks.FLAMEBARK_WALL_SIGN));
    public static final Item FLAMEBARK_HANGING_SIGN = registerItem("flamebark_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.FLAMEBARK_HANGING_SIGN, TakieTerraTreeBlocks.FLAMEBARK_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item SCINTILLA_SIGN = registerItem("scintilla_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.SCINTILLA_SIGN, TakieTerraTreeBlocks.SCINTILLA_WALL_SIGN));
    public static final Item SCINTILLA_HANGING_SIGN = registerItem("scintilla_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.SCINTILLA_HANGING_SIGN, TakieTerraTreeBlocks.SCINTILLA_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item ZEBRAWOOD_SIGN = registerItem("zebrawood_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.ZEBRAWOOD_SIGN, TakieTerraTreeBlocks.ZEBRAWOOD_WALL_SIGN));
    public static final Item ZEBRAWOOD_HANGING_SIGN = registerItem("zebrawood_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.ZEBRAWOOD_HANGING_SIGN, TakieTerraTreeBlocks.ZEBRAWOOD_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item REDWOOD_SIGN = registerItem("redwood_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.REDWOOD_SIGN, TakieTerraTreeBlocks.REDWOOD_WALL_SIGN));
    public static final Item REDWOOD_HANGING_SIGN = registerItem("redwood_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.REDWOOD_HANGING_SIGN, TakieTerraTreeBlocks.REDWOOD_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item STEWARTIA_SIGN = registerItem("stewartia_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.STEWARTIA_SIGN, TakieTerraTreeBlocks.STEWARTIA_WALL_SIGN));
    public static final Item STEWARTIA_HANGING_SIGN = registerItem("stewartia_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.STEWARTIA_HANGING_SIGN, TakieTerraTreeBlocks.STEWARTIA_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item AUTUMN_STEWARTIA_SIGN = registerItem("autumn_stewartia_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.AUTUMN_STEWARTIA_SIGN, TakieTerraTreeBlocks.AUTUMN_STEWARTIA_WALL_SIGN));
    public static final Item AUTUMN_STEWARTIA_HANGING_SIGN = registerItem("autumn_stewartia_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.AUTUMN_STEWARTIA_HANGING_SIGN, TakieTerraTreeBlocks.AUTUMN_STEWARTIA_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item TOONA_SIGN = registerItem("toona_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.TOONA_SIGN, TakieTerraTreeBlocks.TOONA_WALL_SIGN));
    public static final Item TOONA_HANGING_SIGN = registerItem("toona_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.TOONA_HANGING_SIGN, TakieTerraTreeBlocks.TOONA_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item GHAT_SIGN = registerItem("ghat_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.GHAT_SIGN, TakieTerraTreeBlocks.GHAT_WALL_SIGN));
    public static final Item GHAT_HANGING_SIGN = registerItem("ghat_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.GHAT_HANGING_SIGN, TakieTerraTreeBlocks.GHAT_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item BLACK_PINE_SIGN = registerItem("black_pine_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.BLACK_PINE_SIGN, TakieTerraTreeBlocks.BLACK_PINE_WALL_SIGN));
    public static final Item BLACK_PINE_HANGING_SIGN = registerItem("black_pine_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.BLACK_PINE_HANGING_SIGN, TakieTerraTreeBlocks.BLACK_PINE_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item SWAMP_SYLPH_SIGN = registerItem("swamp_sylph_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.SWAMP_SYLPH_SIGN, TakieTerraTreeBlocks.SWAMP_SYLPH_WALL_SIGN));
    public static final Item SWAMP_SYLPH_HANGING_SIGN = registerItem("swamp_sylph_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.SWAMP_SYLPH_HANGING_SIGN, TakieTerraTreeBlocks.SWAMP_SYLPH_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item KOBICHA_SIGN = registerItem("kobicha_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.KOBICHA_SIGN, TakieTerraTreeBlocks.KOBICHA_WALL_SIGN));
    public static final Item KOBICHA_HANGING_SIGN = registerItem("kobicha_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.KOBICHA_HANGING_SIGN, TakieTerraTreeBlocks.KOBICHA_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item NEBRA_SIGN = registerItem("nebra_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.NEBRA_SIGN, TakieTerraTreeBlocks.NEBRA_WALL_SIGN));
    public static final Item NEBRA_HANGING_SIGN = registerItem("nebra_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.NEBRA_HANGING_SIGN, TakieTerraTreeBlocks.NEBRA_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item ROYA_SIGN = registerItem("roya_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.ROYA_SIGN, TakieTerraTreeBlocks.ROYA_WALL_SIGN));
    public static final Item ROYA_HANGING_SIGN = registerItem("roya_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.ROYA_HANGING_SIGN, TakieTerraTreeBlocks.ROYA_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item CASSIA_SIGN = registerItem("cassia_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.CASSIA_SIGN, TakieTerraTreeBlocks.CASSIA_WALL_SIGN));
    public static final Item CASSIA_HANGING_SIGN = registerItem("cassia_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.CASSIA_HANGING_SIGN, TakieTerraTreeBlocks.CASSIA_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item SEABREEZE_SIGN = registerItem("seabreeze_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.SEABREEZE_SIGN, TakieTerraTreeBlocks.SEABREEZE_WALL_SIGN));
    public static final Item SEABREEZE_HANGING_SIGN = registerItem("seabreeze_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.SEABREEZE_HANGING_SIGN, TakieTerraTreeBlocks.SEABREEZE_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item HOLLY_SIGN = registerItem("holly_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.HOLLY_SIGN, TakieTerraTreeBlocks.HOLLY_WALL_SIGN));
    public static final Item HOLLY_HANGING_SIGN = registerItem("holly_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.HOLLY_HANGING_SIGN, TakieTerraTreeBlocks.HOLLY_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item PEONIA_SIGN = registerItem("peonia_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.PEONIA_SIGN, TakieTerraTreeBlocks.PEONIA_WALL_SIGN));
    public static final Item PEONIA_HANGING_SIGN = registerItem("peonia_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.PEONIA_HANGING_SIGN, TakieTerraTreeBlocks.PEONIA_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item STRAWBERRY_SIGN = registerItem("strawberry_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.STRAWBERRY_SIGN, TakieTerraTreeBlocks.STRAWBERRY_WALL_SIGN));
    public static final Item STRAWBERRY_HANGING_SIGN = registerItem("strawberry_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.STRAWBERRY_HANGING_SIGN, TakieTerraTreeBlocks.STRAWBERRY_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item CEDAR_SIGN = registerItem("cedar_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.CEDAR_SIGN, TakieTerraTreeBlocks.CEDAR_WALL_SIGN));
    public static final Item CEDAR_HANGING_SIGN = registerItem("cedar_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.CEDAR_HANGING_SIGN, TakieTerraTreeBlocks.CEDAR_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item CHISAI_SIGN = registerItem("chisai_sign",
            new SignItem(new FabricItemSettings().maxCount(16), TakieTerraTreeBlocks.CHISAI_SIGN, TakieTerraTreeBlocks.CHISAI_WALL_SIGN));
    public static final Item CHISAI_HANGING_SIGN = registerItem("chisai_hanging_sign",
            new HangingSignItem(TakieTerraTreeBlocks.CHISAI_HANGING_SIGN, TakieTerraTreeBlocks.CHISAI_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));



    //BOATS

    public static final Item WILLOW_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.WILLOW_BOAT_ID, TakieTerraBoats.WILLOW_BOAT_KEY, false);
    public static final Item WILLOW_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.WILLOW_CHEST_BOAT_ID, TakieTerraBoats.WILLOW_BOAT_KEY, true);

    public static final Item RAINBOW_GUM_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.RAINBOW_GUM_BOAT_ID, TakieTerraBoats.RAINBOW_GUM_BOAT_KEY, false);
    public static final Item RAINBOW_GUM_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.RAINBOW_GUM_CHEST_BOAT_ID, TakieTerraBoats.RAINBOW_GUM_BOAT_KEY, true);

    public static final Item EBONY_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.EBONY_BOAT_ID, TakieTerraBoats.EBONY_BOAT_KEY, false);
    public static final Item EBONY_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.EBONY_CHEST_BOAT_ID, TakieTerraBoats.EBONY_BOAT_KEY, true);

    public static final Item PEAR_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.PEAR_BOAT_ID, TakieTerraBoats.PEAR_BOAT_KEY, false);
    public static final Item PEAR_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.PEAR_CHEST_BOAT_ID, TakieTerraBoats.PEAR_BOAT_KEY, true);

    public static final Item PINE_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.PINE_BOAT_ID, TakieTerraBoats.PINE_BOAT_KEY, false);
    public static final Item PINE_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.PINE_CHEST_BOAT_ID, TakieTerraBoats.PINE_BOAT_KEY, true);

    public static final Item RED_MAPLE_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.RED_MAPLE_BOAT_ID, TakieTerraBoats.RED_MAPLE_BOAT_KEY, false);
    public static final Item RED_MAPLE_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.RED_MAPLE_CHEST_BOAT_ID, TakieTerraBoats.RED_MAPLE_BOAT_KEY, true);

    public static final Item WALNUT_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.WALNUT_BOAT_ID, TakieTerraBoats.WALNUT_BOAT_KEY, false);
    public static final Item WALNUT_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.WALNUT_CHEST_BOAT_ID, TakieTerraBoats.WALNUT_BOAT_KEY, true);

    public static final Item AUTUMN_ASPEN_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.AUTUMN_ASPEN_BOAT_ID, TakieTerraBoats.AUTUMN_ASPEN_BOAT_KEY, false);
    public static final Item AUTUMN_ASPEN_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.AUTUMN_ASPEN_CHEST_BOAT_ID, TakieTerraBoats.AUTUMN_ASPEN_BOAT_KEY, true);

    public static final Item BLUE_GUM_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.BLUE_GUM_BOAT_ID, TakieTerraBoats.BLUE_GUM_BOAT_KEY, false);
    public static final Item BLUE_GUM_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.BLUE_GUM_CHEST_BOAT_ID, TakieTerraBoats.BLUE_GUM_BOAT_KEY, true);

    public static final Item AEGIA_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.AEGIA_BOAT_ID, TakieTerraBoats.AEGIA_BOAT_KEY, false);
    public static final Item AEGIA_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.AEGIA_CHEST_BOAT_ID, TakieTerraBoats.AEGIA_BOAT_KEY, true);

    public static final Item LARCH_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.LARCH_BOAT_ID, TakieTerraBoats.LARCH_BOAT_KEY, false);
    public static final Item LARCH_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.LARCH_CHEST_BOAT_ID, TakieTerraBoats.LARCH_BOAT_KEY, true);

    public static final Item BALD_CYPRESS_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.BALD_CYPRESS_BOAT_ID, TakieTerraBoats.BALD_CYPRESS_BOAT_KEY, false);
    public static final Item BALD_CYPRESS_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.BALD_CYPRESS_CHEST_BOAT_ID, TakieTerraBoats.BALD_CYPRESS_BOAT_KEY, true);

    public static final Item BEECH_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.BEECH_BOAT_ID, TakieTerraBoats.BEECH_BOAT_KEY, false);
    public static final Item BEECH_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.BEECH_CHEST_BOAT_ID, TakieTerraBoats.BEECH_BOAT_KEY, true);

    public static final Item CAMPHOR_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.CAMPHOR_BOAT_ID, TakieTerraBoats.CAMPHOR_BOAT_KEY, false);
    public static final Item CAMPHOR_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.CAMPHOR_CHEST_BOAT_ID, TakieTerraBoats.CAMPHOR_BOAT_KEY, true);

    public static final Item CAMELLIA_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.CAMELLIA_BOAT_ID, TakieTerraBoats.CAMELLIA_BOAT_KEY, false);
    public static final Item CAMELLIA_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.CAMELLIA_CHEST_BOAT_ID, TakieTerraBoats.CAMELLIA_BOAT_KEY, true);

    public static final Item REDWOOD_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.REDWOOD_BOAT_ID, TakieTerraBoats.REDWOOD_BOAT_KEY, false);
    public static final Item REDWOOD_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.REDWOOD_CHEST_BOAT_ID, TakieTerraBoats.REDWOOD_BOAT_KEY, true);

    public static final Item DEAD_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.DEAD_BOAT_ID, TakieTerraBoats.DEAD_BOAT_KEY, false);
    public static final Item DEAD_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.DEAD_CHEST_BOAT_ID, TakieTerraBoats.DEAD_BOAT_KEY, true);

    public static final Item FIR_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.FIR_BOAT_ID, TakieTerraBoats.FIR_BOAT_KEY, false);
    public static final Item FIR_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.FIR_CHEST_BOAT_ID, TakieTerraBoats.FIR_BOAT_KEY, true);

    public static final Item TOONA_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.TOONA_BOAT_ID, TakieTerraBoats.TOONA_BOAT_KEY, false);
    public static final Item TOONA_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.TOONA_CHEST_BOAT_ID, TakieTerraBoats.TOONA_BOAT_KEY, true);

    public static final Item GHAF_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.GHAF_BOAT_ID, TakieTerraBoats.GHAF_BOAT_KEY, false);
    public static final Item GHAF_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.GHAF_CHEST_BOAT_ID, TakieTerraBoats.GHAF_BOAT_KEY, true);

    public static final Item SEQUOIA_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.SEQUOIA_BOAT_ID, TakieTerraBoats.SEQUOIA_BOAT_KEY, false);
    public static final Item SEQUOIA_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.SEQUOIA_CHEST_BOAT_ID, TakieTerraBoats.SEQUOIA_BOAT_KEY, true);

    public static final Item GINKGO_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.GINKGO_BOAT_ID, TakieTerraBoats.GINKGO_BOAT_KEY, false);
    public static final Item GINKGO_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.GINKGO_CHEST_BOAT_ID, TakieTerraBoats.GINKGO_BOAT_KEY, true);

    public static final Item INDIKO_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.INDIKO_BOAT_ID, TakieTerraBoats.INDIKO_BOAT_KEY, false);
    public static final Item INDIKO_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.INDIKO_CHEST_BOAT_ID, TakieTerraBoats.INDIKO_BOAT_KEY, true);

    public static final Item IRONWOOD_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.IRONWOOD_BOAT_ID, TakieTerraBoats.IRONWOOD_BOAT_KEY, false);
    public static final Item IRONWOOD_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.IRONWOOD_CHEST_BOAT_ID, TakieTerraBoats.IRONWOOD_BOAT_KEY, true);

    public static final Item JACARANDA_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.JACARANDA_BOAT_ID, TakieTerraBoats.JACARANDA_BOAT_KEY, false);
    public static final Item JACARANDA_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.JACARANDA_CHEST_BOAT_ID, TakieTerraBoats.JACARANDA_BOAT_KEY, true);

    public static final Item JUNIPER_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.JUNIPER_BOAT_ID, TakieTerraBoats.JUNIPER_BOAT_KEY, false);
    public static final Item JUNIPER_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.JUNIPER_CHEST_BOAT_ID, TakieTerraBoats.JUNIPER_BOAT_KEY, true);

    public static final Item KAURI_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.KAURI_BOAT_ID, TakieTerraBoats.KAURI_BOAT_KEY, false);
    public static final Item KAURI_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.KAURI_CHEST_BOAT_ID, TakieTerraBoats.KAURI_BOAT_KEY, true);

    public static final Item KOBICHA_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.KOBICHA_BOAT_ID, TakieTerraBoats.KOBICHA_BOAT_KEY, false);
    public static final Item KOBICHA_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.KOBICHA_CHEST_BOAT_ID, TakieTerraBoats.KOBICHA_BOAT_KEY, true);

    public static final Item LAPACHO_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.LAPACHO_BOAT_ID, TakieTerraBoats.LAPACHO_BOAT_KEY, false);
    public static final Item LAPACHO_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.LAPACHO_CHEST_BOAT_ID, TakieTerraBoats.LAPACHO_BOAT_KEY, true);

    public static final Item MADRONE_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.MADRONE_BOAT_ID, TakieTerraBoats.MADRONE_BOAT_KEY, false);
    public static final Item MADRONE_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.MADRONE_CHEST_BOAT_ID, TakieTerraBoats.MADRONE_BOAT_KEY, true);

    public static final Item MAHOGANY_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.MAHOGANY_BOAT_ID, TakieTerraBoats.MAHOGANY_BOAT_KEY, false);
    public static final Item MAHOGANY_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.MAHOGANY_CHEST_BOAT_ID, TakieTerraBoats.MAHOGANY_BOAT_KEY, true);

    public static final Item MANGO_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.MANGO_BOAT_ID, TakieTerraBoats.MANGO_BOAT_KEY, false);
    public static final Item MANGO_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.MANGO_CHEST_BOAT_ID, TakieTerraBoats.MANGO_BOAT_KEY, true);

    public static final Item MIMOSA_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.MIMOSA_BOAT_ID, TakieTerraBoats.MIMOSA_BOAT_KEY, false);
    public static final Item MIMOSA_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.MIMOSA_CHEST_BOAT_ID, TakieTerraBoats.MIMOSA_BOAT_KEY, true);

    public static final Item MOSSY_HEART_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.MOSSY_HEART_BOAT_ID, TakieTerraBoats.MOSSY_HEART_BOAT_KEY, false);
    public static final Item MOSSY_HEART_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.MOSSY_HEART_CHEST_BOAT_ID, TakieTerraBoats.MOSSY_HEART_BOAT_KEY, true);

    public static final Item MYRTA_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.MYRTA_BOAT_ID, TakieTerraBoats.MYRTA_BOAT_KEY, false);
    public static final Item MYRTA_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.MYRTA_CHEST_BOAT_ID, TakieTerraBoats.MYRTA_BOAT_KEY, true);

    public static final Item NOMERIA_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.NOMERIA_BOAT_ID, TakieTerraBoats.NOMERIA_BOAT_KEY, false);
    public static final Item NOMERIA_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.NOMERIA_CHEST_BOAT_ID, TakieTerraBoats.NOMERIA_BOAT_KEY, true);

    public static final Item PALO_VERDE_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.PALO_VERDE_BOAT_ID, TakieTerraBoats.PALO_VERDE_BOAT_KEY, false);
    public static final Item PALO_VERDE_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.PALO_VERDE_CHEST_BOAT_ID, TakieTerraBoats.PALO_VERDE_BOAT_KEY, true);

    public static final Item PARASHOREA_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.PARASHOREA_BOAT_ID, TakieTerraBoats.PARASHOREA_BOAT_KEY, false);
    public static final Item PARASHOREA_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.PARASHOREA_CHEST_BOAT_ID, TakieTerraBoats.PARASHOREA_BOAT_KEY, true);

    public static final Item PECAN_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.PECAN_BOAT_ID, TakieTerraBoats.PECAN_BOAT_KEY, false);
    public static final Item PECAN_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.PECAN_CHEST_BOAT_ID, TakieTerraBoats.PECAN_BOAT_KEY, true);

    public static final Item ROYA_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.ROYA_BOAT_ID, TakieTerraBoats.ROYA_BOAT_KEY, false);
    public static final Item ROYA_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.ROYA_CHEST_BOAT_ID, TakieTerraBoats.ROYA_BOAT_KEY, true);

    public static final Item SNOW_GHOST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.SNOW_GHOST_BOAT_ID, TakieTerraBoats.SNOW_GHOST_BOAT_KEY, false);
    public static final Item SNOW_GHOST_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.SNOW_GHOST_CHEST_BOAT_ID, TakieTerraBoats.SNOW_GHOST_BOAT_KEY, true);

    public static final Item STEWARTIA_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.STEWARTIA_BOAT_ID, TakieTerraBoats.STEWARTIA_BOAT_KEY, false);
    public static final Item STEWARTIA_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.STEWARTIA_CHEST_BOAT_ID, TakieTerraBoats.STEWARTIA_BOAT_KEY, true);

    public static final Item AUTUMN_STEWARTIA_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.AUTUMN_STEWARTIA_BOAT_ID, TakieTerraBoats.AUTUMN_STEWARTIA_BOAT_KEY, false);
    public static final Item AUTUMN_STEWARTIA_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.AUTUMN_STEWARTIA_CHEST_BOAT_ID, TakieTerraBoats.AUTUMN_STEWARTIA_BOAT_KEY, true);

    public static final Item PEACH_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.PEACH_BOAT_ID, TakieTerraBoats.PEACH_BOAT_KEY, false);
    public static final Item PEACH_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.PEACH_CHEST_BOAT_ID, TakieTerraBoats.PEACH_BOAT_KEY, true);

    public static final Item SWAMP_SYLPH_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.SWAMP_SYLPH_BOAT_ID, TakieTerraBoats.SWAMP_SYLPH_BOAT_KEY, false);
    public static final Item SWAMP_SYLPH_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.SWAMP_SYLPH_CHEST_BOAT_ID, TakieTerraBoats.SWAMP_SYLPH_BOAT_KEY, true);

    public static final Item SWEETGUM_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.SWEETGUM_BOAT_ID, TakieTerraBoats.SWEETGUM_BOAT_KEY, false);
    public static final Item SWEETGUM_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.SWEETGUM_CHEST_BOAT_ID, TakieTerraBoats.SWEETGUM_BOAT_KEY, true);

    public static final Item SYCAMORE_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.SYCAMORE_BOAT_ID, TakieTerraBoats.SYCAMORE_BOAT_KEY, false);
    public static final Item SYCAMORE_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.SYCAMORE_CHEST_BOAT_ID, TakieTerraBoats.SYCAMORE_BOAT_KEY, true);

    public static final Item PLUM_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.PLUM_BOAT_ID, TakieTerraBoats.PLUM_BOAT_KEY, false);
    public static final Item PLUM_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.PLUM_CHEST_BOAT_ID, TakieTerraBoats.PLUM_BOAT_KEY, true);

    public static final Item WINTER_BLOSSOM_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.WINTER_BLOSSOM_BOAT_ID, TakieTerraBoats.WINTER_BLOSSOM_BOAT_KEY, false);
    public static final Item WINTER_BLOSSOM_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.WINTER_BLOSSOM_CHEST_BOAT_ID, TakieTerraBoats.WINTER_BLOSSOM_BOAT_KEY, true);

    public static final Item WISTERIA_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.WISTERIA_BOAT_ID, TakieTerraBoats.WISTERIA_BOAT_KEY, false);
    public static final Item WISTERIA_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.WISTERIA_CHEST_BOAT_ID, TakieTerraBoats.WISTERIA_BOAT_KEY, true);

    public static final Item WITCH_HAZEL_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.WITCH_HAZEL_BOAT_ID, TakieTerraBoats.WITCH_HAZEL_BOAT_KEY, false);
    public static final Item WITCH_HAZEL_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.WITCH_HAZEL_CHEST_BOAT_ID, TakieTerraBoats.WITCH_HAZEL_BOAT_KEY, true);

    public static final Item YELLOWWOOD_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.YELLOWWOOD_BOAT_ID, TakieTerraBoats.YELLOWWOOD_BOAT_KEY, false);
    public static final Item YELLOWWOOD_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.YELLOWWOOD_CHEST_BOAT_ID, TakieTerraBoats.YELLOWWOOD_BOAT_KEY, true);

    public static final Item ZEBRAWOOD_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.ZEBRAWOOD_BOAT_ID, TakieTerraBoats.ZEBRAWOOD_BOAT_KEY, false);
    public static final Item ZEBRAWOOD_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.ZEBRAWOOD_CHEST_BOAT_ID, TakieTerraBoats.ZEBRAWOOD_BOAT_KEY, true);

    public static final Item ZELKOVA_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.ZELKOVA_BOAT_ID, TakieTerraBoats.ZELKOVA_BOAT_KEY, false);
    public static final Item ZELKOVA_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.ZELKOVA_CHEST_BOAT_ID, TakieTerraBoats.ZELKOVA_BOAT_KEY, true);

    public static final Item AUTUMN_ZELKOVA_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.AUTUMN_ZELKOVA_BOAT_ID, TakieTerraBoats.AUTUMN_ZELKOVA_BOAT_KEY, false);
    public static final Item AUTUMN_ZELKOVA_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.AUTUMN_ZELKOVA_CHEST_BOAT_ID, TakieTerraBoats.AUTUMN_ZELKOVA_BOAT_KEY, true);

    public static final Item ZISSIAN_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.ZISSIAN_BOAT_ID, TakieTerraBoats.ZISSIAN_BOAT_KEY, false);
    public static final Item ZISSIAN_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.ZISSIAN_CHEST_BOAT_ID, TakieTerraBoats.ZISSIAN_BOAT_KEY, true);

    public static final Item PONDEROSA_PINE_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.PONDEROSA_PINE_BOAT_ID, TakieTerraBoats.PONDEROSA_PINE_BOAT_KEY, false);
    public static final Item PONDEROSA_PINE_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.PONDEROSA_PINE_CHEST_BOAT_ID, TakieTerraBoats.PONDEROSA_PINE_BOAT_KEY, true);

    public static final Item KNOBCONE_PINE_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.KNOBCONE_PINE_BOAT_ID, TakieTerraBoats.KNOBCONE_PINE_BOAT_KEY, false);
    public static final Item KNOBCONE_PINE_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.KNOBCONE_PINE_CHEST_BOAT_ID, TakieTerraBoats.KNOBCONE_PINE_BOAT_KEY, true);

    public static final Item CASSIA_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.CASSIA_BOAT_ID, TakieTerraBoats.CASSIA_BOAT_KEY, false);
    public static final Item CASSIA_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.CASSIA_CHEST_BOAT_ID, TakieTerraBoats.CASSIA_BOAT_KEY, true);

    public static final Item HOLLY_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.HOLLY_BOAT_ID, TakieTerraBoats.HOLLY_BOAT_KEY, false);
    public static final Item HOLLY_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.HOLLY_CHEST_BOAT_ID, TakieTerraBoats.HOLLY_BOAT_KEY, true);

    public static final Item SEABREEZE_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.SEABREEZE_BOAT_ID, TakieTerraBoats.SEABREEZE_BOAT_KEY, false);
    public static final Item SEABREEZE_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.SEABREEZE_CHEST_BOAT_ID, TakieTerraBoats.SEABREEZE_BOAT_KEY, true);

    public static final Item PEONIA_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.PEONIA_BOAT_ID, TakieTerraBoats.PEONIA_BOAT_KEY, false);
    public static final Item PEONIA_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.PEONIA_CHEST_BOAT_ID, TakieTerraBoats.PEONIA_BOAT_KEY, true);

    public static final Item STRAWBERRY_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.STRAWBERRY_BOAT_ID, TakieTerraBoats.STRAWBERRY_BOAT_KEY, false);
    public static final Item STRAWBERRY_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.STRAWBERRY_CHEST_BOAT_ID, TakieTerraBoats.STRAWBERRY_BOAT_KEY, true);

    public static final Item CEDAR_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.CEDAR_BOAT_ID, TakieTerraBoats.CEDAR_BOAT_KEY, false);
    public static final Item CEDAR_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.CEDAR_CHEST_BOAT_ID, TakieTerraBoats.CEDAR_BOAT_KEY, true);

    public static final Item CHISAI_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.CHISAI_BOAT_ID, TakieTerraBoats.CHISAI_BOAT_KEY, false);
    public static final Item CHISAI_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(TakieTerraBoats.CHISAI_CHEST_BOAT_ID, TakieTerraBoats.CHISAI_BOAT_KEY, true);


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TakieTerraMod.MOD_ID, name), item);
    }

    private static void ItemGroupIngredients(FabricItemGroupEntries entries) {
        entries.add(OPAL);
        entries.add(SEA_OPAL);
        entries.add(TakieTerraBlocks.OPAL_BLOCK);
        entries.add(TakieTerraBlocks.SEA_OPAL_BLOCK);
        entries.add(TakieTerraBlocks.OPAL_ORE);
        entries.add(TakieTerraBlocks.DEEPSLATE_OPAL_ORE);
        entries.add(TakieTerraBlocks.SEA_OPAL_ORE);
        entries.add(TakieTerraBlocks.DEEPSLATE_SEA_OPAL_ORE);
    }

    public static void registerTakieTerraItems() {
        TakieTerraMod.LOGGER.info("Registering Mod Items for " + TakieTerraMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(TakieTerraItems::ItemGroupIngredients);

    }
}
