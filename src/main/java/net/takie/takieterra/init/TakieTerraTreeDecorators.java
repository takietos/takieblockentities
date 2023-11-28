package net.takie.takieterra.init;

import com.mojang.serialization.Codec;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;
import net.takie.takieterra.TakieTerraMod;
import net.takie.takieterra.features.tree.treedecorators.*;
import net.takie.takieterra.mixin.TreeDecoratorTypeAccessor;

public class TakieTerraTreeDecorators {

    public static TreeDecoratorType<DanglingLeavesTreeDecorator> DANGLING_LEAVES;
    public static TreeDecoratorType<SpanishMossTreeDecorator> SPANISH_MOSS;
    public static TreeDecoratorType<HangingMossTreeDecorator> HANGING_MOSS;
    public static TreeDecoratorType<WisteriaTreeDecorator> WISTERIA_TREE_DECORATOR;
    public static TreeDecoratorType<WisteriaVinesTreeDecorator> WISTERIA_VINES_TREE_DECORATOR;


    public static void init() {
        DANGLING_LEAVES = register("dangling_leaves_tree_decorator", DanglingLeavesTreeDecorator.CODEC);
        SPANISH_MOSS = register("spanish_moss_tree_decorator", SpanishMossTreeDecorator.CODEC);
        HANGING_MOSS = register("hanging_moss_tree_decorator", HangingMossTreeDecorator.CODEC);
        WISTERIA_TREE_DECORATOR = register("wisteria_tree_decorator", WisteriaTreeDecorator.CODEC);
        WISTERIA_VINES_TREE_DECORATOR = register("wisteria_vines_tree_decorator", WisteriaVinesTreeDecorator.CODEC);

    }

    private static <P extends TreeDecorator> TreeDecoratorType<P> register(String name, Codec<P> codec) {
        return Registry.register(Registries.TREE_DECORATOR_TYPE, new Identifier(TakieTerraMod.MOD_ID, name), TreeDecoratorTypeAccessor.createTreeDecoratorType(codec));
    }
}