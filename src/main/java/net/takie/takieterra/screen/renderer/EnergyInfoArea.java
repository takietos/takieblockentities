package net.takie.takieterra.screen.renderer;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.Rect2i;
import net.minecraft.text.Text;
import team.reborn.energy.api.EnergyStorage;

import java.util.List;

public class EnergyInfoArea {
    private final Rect2i area;
    private final EnergyStorage energy;

    public EnergyInfoArea(int xMin, int yMin)  {
        this(xMin, yMin, null,8,41);
    }

    public EnergyInfoArea(int xMin, int yMin, EnergyStorage energy)  {
        this(xMin, yMin, energy,8,41);
    }

    public EnergyInfoArea(int xMin, int yMin, EnergyStorage energy, int width, int height)  {
        area = new Rect2i(xMin, yMin, width, height);
        this.energy = energy;
    }

    public List<Text> getTooltips() {
        return List.of(Text.literal(energy.getAmount()+" / "+energy.getCapacity()+" E"));
    }

    public void draw(DrawContext context) {
        final int height = area.getHeight();
        int stored = (int)(height*(energy.getAmount()/(float)energy.getCapacity()));
        context.fillGradient(
                area.getX(), area.getY()+(height-stored),
                area.getX() + area.getWidth(), area.getY() +area.getHeight(),
                0x87bfcc, 0xf298dc
        );
    }
}
