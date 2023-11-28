package net.takie.takieterra.villager;

import com.google.common.collect.ImmutableSet;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.takie.takieterra.TakieTerraMod;

public class TakieTerraProfessions {

        //PROFESSION

        public static VillagerProfession ARBORIST;
        public static VillagerProfession GEOLOGIST;
        public static VillagerProfession BEACHCOMBER;
        public static VillagerProfession GARDENER;
        public static VillagerProfession METALLURGIST;
        public static VillagerProfession WOODWORKER;
        public static VillagerProfession HERBALIST;
        public static VillagerProfession GROCER;
        public static VillagerProfession CHEF;
        public static VillagerProfession ANTIQUE_DEALER;
        public static VillagerProfession BAKER;
        public static VillagerProfession TEAHOUSE_ATTENDANT;
        public static VillagerProfession STREET_VENDOR;
        public static VillagerProfession WEAVER;
        public static VillagerProfession MYCOLOGIST;

        public static void registerProfessions() {

                ARBORIST = Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(TakieTerraMod.MOD_ID, "arborist"),
                        new VillagerProfession("arborist", holder -> holder.value().equals(TakieTerraPOIType.ARBORIST_POI), holder -> holder.value().equals(TakieTerraPOIType.ARBORIST_POI), ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_FARMER));

                GEOLOGIST = Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(TakieTerraMod.MOD_ID, "geologist"),
                        new VillagerProfession("geologist", holder -> holder.value().equals(TakieTerraPOIType.GEOLOGIST_POI), holder -> holder.value().equals(TakieTerraPOIType.GEOLOGIST_POI), ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_MASON));

                BEACHCOMBER = Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(TakieTerraMod.MOD_ID, "beachcomber"),
                        new VillagerProfession("beachcomber", holder -> holder.value().equals(TakieTerraPOIType.BEACHCOMBER_POI), holder -> holder.value().equals(TakieTerraPOIType.BEACHCOMBER_POI), ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ITEM_BUCKET_FILL));

                GARDENER = Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(TakieTerraMod.MOD_ID, "gardener"),
                        new VillagerProfession("gardener", holder -> holder.value().equals(TakieTerraPOIType.GARDENER_POI), holder -> holder.value().equals(TakieTerraPOIType.GARDENER_POI), ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_FARMER));

                METALLURGIST = Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(TakieTerraMod.MOD_ID, "metallurgist"),
                        new VillagerProfession("metallurgist", holder -> holder.value().equals(TakieTerraPOIType.METALLURGIST_POI), holder -> holder.value().equals(TakieTerraPOIType.METALLURGIST_POI), ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_ARMORER));

                WOODWORKER = Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(TakieTerraMod.MOD_ID, "woodworker"),
                        new VillagerProfession("woodworker", holder -> holder.value().equals(TakieTerraPOIType.WOODWORKER_POI), holder -> holder.value().equals(TakieTerraPOIType.WOODWORKER_POI), ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_FLETCHER));

                HERBALIST = Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(TakieTerraMod.MOD_ID, "herbalist"),
                        new VillagerProfession("herbalist", holder -> holder.value().equals(TakieTerraPOIType.HERBALIST_POI), holder -> holder.value().equals(TakieTerraPOIType.HERBALIST_POI), ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_FARMER));

                GROCER = Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(TakieTerraMod.MOD_ID, "grocer"),
                        new VillagerProfession("grocer", holder -> holder.value().equals(TakieTerraPOIType.GROCER_POI), holder -> holder.value().equals(TakieTerraPOIType.GROCER_POI), ImmutableSet.of(), ImmutableSet.of(), SoundEvents.BLOCK_CAVE_VINES_PICK_BERRIES));

                CHEF = Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(TakieTerraMod.MOD_ID, "chef"),
                        new VillagerProfession("chef", holder -> holder.value().equals(TakieTerraPOIType.CHEF_POI), holder -> holder.value().equals(TakieTerraPOIType.CHEF_POI), ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_FARMER));

                TEAHOUSE_ATTENDANT = Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(TakieTerraMod.MOD_ID, "teahouse"),
                        new VillagerProfession("teahouse", holder -> holder.value().equals(TakieTerraPOIType.TEAHOUSE_POI), holder -> holder.value().equals(TakieTerraPOIType.TEAHOUSE_POI), ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_CLERIC));

                WEAVER = Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(TakieTerraMod.MOD_ID, "weaver"),
                        new VillagerProfession("weaver", holder -> holder.value().equals(TakieTerraPOIType.TEAHOUSE_POI), holder -> holder.value().equals(TakieTerraPOIType.WEAVER_POI), ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_SHEPHERD));

                BAKER = Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(TakieTerraMod.MOD_ID, "baker"),
                        new VillagerProfession("baker", holder -> holder.value().equals(TakieTerraPOIType.BAKER_POI), holder -> holder.value().equals(TakieTerraPOIType.BAKER_POI), ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_ITEM_FRAME_REMOVE_ITEM));

                MYCOLOGIST = Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(TakieTerraMod.MOD_ID, "mycologist"),
                        new VillagerProfession("mycologist", holder -> holder.value().equals(TakieTerraPOIType.MYCOLOGIST_POI), holder -> holder.value().equals(TakieTerraPOIType.MYCOLOGIST_POI), ImmutableSet.of(), ImmutableSet.of(), SoundEvents.BLOCK_WEEPING_VINES_PLACE));

                ANTIQUE_DEALER = Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(TakieTerraMod.MOD_ID, "antique_dealer"),
                        new VillagerProfession("antique_dealer", holder -> holder.value().equals(TakieTerraPOIType.ANTIQUE_DEALER_POI), holder -> holder.value().equals(TakieTerraPOIType.ANTIQUE_DEALER_POI), ImmutableSet.of(), ImmutableSet.of(), SoundEvents.BLOCK_CHAIN_PLACE));

        }
}
