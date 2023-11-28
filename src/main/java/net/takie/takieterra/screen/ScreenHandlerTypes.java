package net.takie.takieterra.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.takie.takieterra.TakieTerraMod;

public enum ScreenHandlerTypes {

    COOKING_POT("cooking_pot", CookingPotScreenHandler.class, CookingPotScreenHandler::new);

    private final String pathName;
    private final Class<? extends ScreenHandler> screenHandlerClass;
    private final ExtendedScreenHandlerType.ExtendedFactory<? extends ScreenHandler> screenHandlerFactory;
    private ScreenHandlerType<? extends ScreenHandler> screenHandlerType;

    ScreenHandlerTypes(String pathName, Class<? extends ScreenHandler> screenHandlerClass,
                                ExtendedScreenHandlerType.ExtendedFactory<? extends ScreenHandler> screenHandlerFactory) {
        this.pathName = pathName;
        this.screenHandlerClass = screenHandlerClass;
        this.screenHandlerFactory = screenHandlerFactory;
    }

    public static void registerAll() {
        for (ScreenHandlerTypes value : values()) {
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(TakieTerraMod.MOD_ID, value.pathName), value.get());
        }
    }

    @SuppressWarnings("unchecked")
    public <T extends ScreenHandler> ScreenHandlerType<T> get() {
        return (ScreenHandlerType<T>) get(screenHandlerClass);
    }

    @SuppressWarnings({"unchecked","unused"})
    private <T extends ScreenHandler> ScreenHandlerType<T> get(Class<T> clazz) {
        if (screenHandlerType == null) {
            screenHandlerType = new ExtendedScreenHandlerType<>(screenHandlerFactory);
        }

        return (ScreenHandlerType<T>) screenHandlerType;
    }
}