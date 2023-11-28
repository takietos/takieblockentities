package net.takie.takieterra.block.custom;

import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.minecraft.world.event.GameEvent;
import net.takie.takieterra.block.TakieTerraBlocks;
import net.takie.takieterra.item.TakieTerraItems;

public class GrapeVinesHeadBlock extends CaveVinesHeadBlock {
        private static final float GROW_CHANCE = 0.11f;
        public GrapeVinesHeadBlock(AbstractBlock.Settings settings) {
            super(settings);
            this.setDefaultState((BlockState)((BlockState)((BlockState)this.stateManager.getDefaultState()).with(AGE, 0)).with(BERRIES, false));
        }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (state.get(BERRIES).booleanValue()) {
            Block.dropStack(world, pos, new ItemStack(TakieTerraItems.GRAPES, 1));
            float f = MathHelper.nextBetween(world.random, 0.8f, 1.2f);
            world.playSound(null, pos, SoundEvents.BLOCK_CAVE_VINES_PICK_BERRIES, SoundCategory.BLOCKS, 1.0f, f);
            BlockState blockState = state.with(BERRIES, false);
            world.setBlockState(pos, blockState, Block.NOTIFY_LISTENERS);
            world.emitGameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Emitter.of(player, blockState));
            return ActionResult.success(world.isClient);
        }
        return ActionResult.PASS;
    }

    @Override
        protected Block getPlant() {
            return TakieTerraBlocks.GRAPE_VINES_PLANT;
        }

    @Override
        protected BlockState age(BlockState state, Random random) {
            return (BlockState)super.age(state, random).with(BERRIES, random.nextFloat() < 0.11f);
        }

        @Override
        public ItemStack getPickStack(BlockView world, BlockPos pos, BlockState state) {
            return new ItemStack(TakieTerraItems.GRAPES);
        }

}
