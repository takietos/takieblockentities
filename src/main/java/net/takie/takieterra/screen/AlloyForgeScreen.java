package net.takie.takieterra.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.takie.takieterra.TakieTerraMod;
import net.takie.takieterra.block.entity.backup.AlloyForgeBlockEntity;

public class AlloyForgeScreen extends HandledScreen<AlloyForgeScreenHandler> {
    private static final Identifier TEXTURE = new Identifier(TakieTerraMod.MOD_ID, "textures/gui/alloy_forge_gui.png");

    public AlloyForgeScreen(AlloyForgeScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    protected void init() {
        super.init();
        titleY = 1000;
        playerInventoryTitleY = 1000;

    }

    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;

        context.drawTexture(TEXTURE, x, y, 0, 0, backgroundWidth, backgroundHeight);

        renderProgressArrow(context, x, y);
        renderFuelGauge(context, x, y);
    }

    private void renderFuelGauge(DrawContext context, int x, int y) {
        final int fuelGaugeXPos = 18;
        final int fuelGaugeYPos = 18;

        if (handler.hasFuel()) {
            context.drawTexture(
                    TEXTURE,
                    x + fuelGaugeXPos,
                    y + fuelGaugeYPos + 43 - handler.getScaledFuelGauge(),
                    176,
                    60 - handler.getScaledFuelGauge(),
                    AlloyForgeBlockEntity.alloyForgeFuelGaugeWidth,
                    handler.getScaledFuelGauge() + 1
            );
        }
    }

    private void renderProgressArrow(DrawContext context, int x, int y) {
        final int progressBarXPos = 99;
        final int progressBarYPos = 35;

        if (handler.isCrafting()) {
            context.drawTexture(
                    TEXTURE,
                    x + progressBarXPos,
                    y + progressBarYPos,
                    176,
                    0,
                    handler.getScaledProgressBar(),
                    AlloyForgeBlockEntity.alloyForgeProgressBarHeight
            );
        }
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        renderBackground(context);
        super.render(context, mouseX, mouseY, delta);
        drawMouseoverTooltip(context, mouseX, mouseY);
    }
}