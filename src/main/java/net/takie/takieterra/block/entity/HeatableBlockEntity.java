package net.takie.takieterra.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.takie.takieterra.util.TakieTerraTags;

public interface HeatableBlockEntity {

    default boolean isHeated(World world, BlockPos pos) {
        BlockState stateBelow = world.getBlockState(pos.down());

        if (stateBelow.isIn(TakieTerraTags.Blocks.HEAT_SOURCES)) {
            if (stateBelow.contains(Properties.LIT)) {
                return stateBelow.get(Properties.LIT);
            }
            return true;
        }

        if (!requiresDirectHeat() && stateBelow.isIn(TakieTerraTags.Blocks.HEAT_CONDUCTORS)) {
            BlockState stateFurtherBelow = world.getBlockState(pos.down(2));
            if (stateFurtherBelow.isIn(TakieTerraTags.Blocks.HEAT_SOURCES)) {
                if (stateFurtherBelow.contains(Properties.LIT)) {
                    return stateFurtherBelow.get(Properties.LIT);
                }
                return true;
            }
        }

        return false;
    }

    default boolean requiresDirectHeat() {
        return false;
    }

}
