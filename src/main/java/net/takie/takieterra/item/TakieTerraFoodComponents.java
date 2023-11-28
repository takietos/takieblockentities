package net.takie.takieterra.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class TakieTerraFoodComponents {

    public static final FoodComponent TOMATO = new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build();
    public static final FoodComponent CORN = new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).build();

    public static final FoodComponent PEAR = new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).build();
    public static final FoodComponent LETTUCE = new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).snack().build();
    public static final FoodComponent SPINACH = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).snack().build();
    public static final FoodComponent CUCUMBER = new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).snack().build();

    public static final FoodComponent WALNUT = new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).snack().build();

    public static final FoodComponent PECAN = new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).snack().build();
    public static final FoodComponent RASPBERRY = new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).snack().build();
    public static final FoodComponent CHERRY = new FoodComponent.Builder().hunger(3).saturationModifier(0.2f).snack().build();
    public static final FoodComponent OLIVE = new FoodComponent.Builder().hunger(1).saturationModifier(0.2f).snack().build();
    public static final FoodComponent SUNFLOWER_SEED = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).snack().build();

    public static final FoodComponent STRAWBERRY = new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build();
    public static final FoodComponent STRAWBERRY_WHITE = new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build();
    public static final FoodComponent GREEN_BEAN = new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build();
    public static final FoodComponent GRAPES = new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build();
    public static final FoodComponent MANGO = new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).build();
    public static final FoodComponent MYRTA_FRUIT = new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).build();
    public static final FoodComponent SPRING_ONION = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).snack().build();
    public static final FoodComponent BROCCOLI = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();
    public static final FoodComponent CAULIFLOWER = new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build();
    public static final FoodComponent MANDARIN = new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).build();
    public static final FoodComponent LEMON = new FoodComponent.Builder().hunger(3).saturationModifier(0.2f).build();

    public static final FoodComponent LIME = new FoodComponent.Builder().hunger(3).saturationModifier(0.2f).build();
    public static final FoodComponent CHILI_PEPPER = new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).snack().build();
    public static final FoodComponent PANCAKES = new FoodComponent.Builder().hunger(6).saturationModifier(0.5f).build();
    public static final FoodComponent SPAGHETTI = new FoodComponent.Builder().hunger(6).saturationModifier(0.6f).build();
    public static final FoodComponent CORN_CHOWDER = new FoodComponent.Builder().hunger(5).saturationModifier(0.5f).build();
    public static final FoodComponent SQUASH_SOUP = new FoodComponent.Builder().hunger(4).saturationModifier(0.5f).build();
    public static final FoodComponent GARDEN_SALAD = new FoodComponent.Builder().hunger(5).saturationModifier(0.5f).build();
    public static final FoodComponent CINNAMON_ROLL = new FoodComponent.Builder().hunger(6).saturationModifier(0.5f).build();
    public static final FoodComponent CINNAMON_ROLL_FROSTED = new FoodComponent.Builder().hunger(7).saturationModifier(0.6f).build();
    public static final FoodComponent PANCAKES_STRAWBERRY = new FoodComponent.Builder().hunger(7).saturationModifier(0.6f).build();
    public static final FoodComponent PANCAKES_SWEET_BERRY = new FoodComponent.Builder().hunger(7).saturationModifier(0.6f).build();
    public static final FoodComponent PIE_SLICE_PLUM = new FoodComponent.Builder().hunger(6).saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 5 * 20), 0.5f).build();
    public static final FoodComponent PIE_SLICE_PEACH = new FoodComponent.Builder().hunger(6).saturationModifier(0.5f)
                .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 5 * 20), 0.5f).build();
    public static final FoodComponent PIE_SLICE_RASPBERRY = new FoodComponent.Builder().hunger(6).saturationModifier(0.5f).build();
    public static final FoodComponent STUFFED_MUSHROOMS = new FoodComponent.Builder().hunger(5).saturationModifier(0.4f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 5 * 20), 0.5f).build();
    public static final FoodComponent STUFFED_MUSHROOMS_POISON = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 7 * 20), 0.5f).build();
    public static final FoodComponent SICHUAN_GREEN_BEANS = new FoodComponent.Builder().hunger(4).saturationModifier(0.4f).build();
    public static final FoodComponent MANGO_PUDDING = new FoodComponent.Builder().hunger(5).saturationModifier(0.6f).build();
    public static final FoodComponent SANDWICH_BLT = new FoodComponent.Builder().hunger(8).saturationModifier(1.0f).build();
    public static final FoodComponent FISH_AND_CHIPS = new FoodComponent.Builder().hunger(7).saturationModifier(0.7f).build();
    public static final FoodComponent CANTALOUPE_SLICE = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).snack().build();
    public static final FoodComponent FRIED_EGG = new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).snack().build();
    public static final FoodComponent SUSHI_TAMAGO = new FoodComponent.Builder().hunger(5).saturationModifier(0.4f).build();
    public static final FoodComponent SUSHI_NIGIRI = new FoodComponent.Builder().hunger(5).saturationModifier(0.4f).build();
    public static final FoodComponent SUSHI_VEGETABLE_ROLLS = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();
    public static final FoodComponent STEAMED_RICE = new FoodComponent.Builder().hunger(2).saturationModifier(0.4f).build();
    public static final FoodComponent CHEESY_OMELETTE = new FoodComponent.Builder().hunger(5).saturationModifier(0.5f).snack().build();
    public static final FoodComponent SQUASH_SLICE = new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).snack().build();
    public static final FoodComponent HONEYDEW_SLICE = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).snack().build();
    public static final FoodComponent PIZZA_PEPPERONI = new FoodComponent.Builder().hunger(10).saturationModifier(1.0F).build();
    public static final FoodComponent PIZZA_HAM_AND_PINEAPPLE = new FoodComponent.Builder().hunger(10).saturationModifier(1.0F).build();
    public static final FoodComponent PIZZA_MARGHERITA = new FoodComponent.Builder().hunger(10).saturationModifier(1.0F).build();
    public static final FoodComponent PIZZA_VEGGIE = new FoodComponent.Builder().hunger(10).saturationModifier(1.0F).build();
    public static final FoodComponent CHEESE = new FoodComponent.Builder().hunger(3).saturationModifier(0.4f).snack().build();
    public static final FoodComponent CREAM_CHEESE = new FoodComponent.Builder().hunger(1).saturationModifier(0.3f).snack().build();

    public static final FoodComponent PLUM = new FoodComponent.Builder().hunger(4).saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 5 * 20), 0.25f).build();
    public static final FoodComponent PEACH = new FoodComponent.Builder().hunger(4).saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 5 * 20), 0.25f).build();

    public static final FoodComponent LAMPEAR = new FoodComponent.Builder().hunger(5).saturationModifier(0.6f)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 5 * 20), 0.8f).build();
    public static final FoodComponent COPPER_LAMPEAR = new FoodComponent.Builder().hunger(6).saturationModifier(0.8F)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 40 * 20), 1)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 120 * 20, 3), 1)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600 * 20), 1)
            .alwaysEdible().build();

    public static final FoodComponent PEAR_TART = new FoodComponent.Builder().hunger(8).saturationModifier(1.0F)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 5 * 20), 0.4f).build();

    public static final FoodComponent AROMATIC_LOAF = new FoodComponent.Builder().hunger(6).saturationModifier(0.8F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 5 * 20), 0.2f).build();
    public static final FoodComponent CARAMEL_WALNUT_TART = new FoodComponent.Builder().hunger(5).saturationModifier(0.6F).build();
    public static final FoodComponent BUTTER_PECAN_TART = new FoodComponent.Builder().hunger(5).saturationModifier(0.6F).build();

    public static final FoodComponent TEA_APPLEMINT = new FoodComponent.Builder().hunger(1).saturationModifier(0.1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 600 * 20), 1).build();
    public static final FoodComponent TEA_BLACK = new FoodComponent.Builder().hunger(1).saturationModifier(0.1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 600 * 20), 1).build();
    public static final FoodComponent TEA_CHAMOMILE = new FoodComponent.Builder().hunger(1).saturationModifier(0.1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 600 * 20), 1).build();
    public static final FoodComponent TEA_GREEN = new FoodComponent.Builder().hunger(1).saturationModifier(0.1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 600 * 20), 1).build();
    public static final FoodComponent TEA_HIBISCUS = new FoodComponent.Builder().hunger(1).saturationModifier(0.1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 600 * 20), 1).build();
    public static final FoodComponent TEA_JASMINE = new FoodComponent.Builder().hunger(1).saturationModifier(0.1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600 * 20), 1).build();
    public static final FoodComponent TEA_HERBAL = new FoodComponent.Builder().hunger(1).saturationModifier(0.1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 600 * 20), 1).build();
    public static final FoodComponent TEA_MILK = new FoodComponent.Builder().hunger(1).saturationModifier(0.1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 600 * 20), 1).build();
    public static final FoodComponent TEA_SWEET_BERRY = new FoodComponent.Builder().hunger(1).saturationModifier(0.1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 600 * 20), 1).build();
    public static final FoodComponent LEMONADE = new FoodComponent.Builder().hunger(1).saturationModifier(0.1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 600 * 20), 1).build();
    public static final FoodComponent BROWN_SUGAR_MILK_TEA = new FoodComponent.Builder().hunger(4).saturationModifier(0.3F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 600 * 20), 1).build();
    public static final FoodComponent CAPPUCCINO = new FoodComponent.Builder().hunger(4).saturationModifier(0.3F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 600 * 20), 1).build();
    public static final FoodComponent CHOCOLATE_MILK_TEA = new FoodComponent.Builder().hunger(4).saturationModifier(0.3F)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 600 * 20), 1).build();
    public static final FoodComponent GRASS_JELLY_MILK_TEA = new FoodComponent.Builder().hunger(4).saturationModifier(0.3F)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 600 * 20), 1).build();
    public static final FoodComponent HONEY_ORANGE_BLOSSOM_MILK_TEA = new FoodComponent.Builder().hunger(4).saturationModifier(0.3F)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600 * 20), 1).build();
    public static final FoodComponent HONEYDEW_MELON_MILK_TEA = new FoodComponent.Builder().hunger(4).saturationModifier(0.3F)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 600 * 20), 1).build();
    public static final FoodComponent LATTE = new FoodComponent.Builder().hunger(4).saturationModifier(0.3F)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 600 * 20), 1).build();
    public static final FoodComponent MANGO_MILK_TEA = new FoodComponent.Builder().hunger(4).saturationModifier(0.3F)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 600 * 20), 1).build();
    public static final FoodComponent TARO_MILK_TEA = new FoodComponent.Builder().hunger(4).saturationModifier(0.3F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 600 * 20), 1).build();
    public static final FoodComponent YUENYEUNG = new FoodComponent.Builder().hunger(4).saturationModifier(0.3F)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 600 * 20), 1).build();

}
