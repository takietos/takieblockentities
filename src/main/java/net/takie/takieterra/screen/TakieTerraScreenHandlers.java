package net.takie.takieterra.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.takie.takieterra.TakieTerraMod;

public class TakieTerraScreenHandlers {
    public static ScreenHandlerType<AlloyForgeScreenHandler> ALLOY_FORGE_SCREEN_HANDLER;
    static {
        ALLOY_FORGE_SCREEN_HANDLER = new ScreenHandlerType<>(AlloyForgeScreenHandler::new, FeatureSet.empty());
    }

    public static ScreenHandlerType<WoodworkerBlockScreenHandler> WOODWORKER_BLOCK_SCREEN_HANDLER;
    static {
        WOODWORKER_BLOCK_SCREEN_HANDLER = new ScreenHandlerType<>(WoodworkerBlockScreenHandler::new, FeatureSet.empty());
    }

    public static ScreenHandlerType<KettleScreenHandler> KETTLE_SCREEN_HANDLER;
    static {
        KETTLE_SCREEN_HANDLER = new ScreenHandlerType<>(KettleScreenHandler::new, FeatureSet.empty());
    }

    public static ScreenHandlerType<WeaverBlockScreenHandler> WEAVER_BLOCK_SCREEN_HANDLER;
    static {
        WEAVER_BLOCK_SCREEN_HANDLER = new ScreenHandlerType<>(WeaverBlockScreenHandler::new, FeatureSet.empty());
    }


    public static void registerScreenHandler() {
        TakieTerraMod.LOGGER.info("Registering Screen Handlers for " + TakieTerraMod.MOD_ID);
    }
}
