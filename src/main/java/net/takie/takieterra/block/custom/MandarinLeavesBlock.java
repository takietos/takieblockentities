package net.takie.takieterra.block.custom;

import com.terraformersmc.terraform.leaves.block.ExtendedLeavesBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import net.takie.takieterra.item.TakieTerraItems;

public class MandarinLeavesBlock extends LeavesBlock {

    public static final int MAX_DISTANCE = 7;
    public static final IntProperty DISTANCE = Properties.DISTANCE_1_7;
    public static final BooleanProperty PERSISTENT = Properties.PERSISTENT;
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
    public static final BooleanProperty VARIANT = BooleanProperty.of("can_have_mandarins");
    public static final BooleanProperty HAS_MANDARINS = BooleanProperty.of("has_mandarins");

    public MandarinLeavesBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack stack = player.getStackInHand(hand);
        if (state.get(VARIANT) && state.get(HAS_MANDARINS) && stack.isEmpty()) {
            MandarinLeavesBlock.dropStack(world, pos, new ItemStack(TakieTerraItems.MANDARIN, world.getRandom().nextBetween(1, 3)));
            world.playSound(null, pos, SoundEvents.BLOCK_CAVE_VINES_PICK_BERRIES, SoundCategory.BLOCKS, 1.0f, 1.0f);
            BlockState blockState = state.with(HAS_MANDARINS, false);
            world.setBlockState(pos, blockState, Block.NOTIFY_LISTENERS);
            world.emitGameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Emitter.of(player, blockState));
            return ActionResult.success(world.isClient);
        }
        return ActionResult.PASS;
    }

    @Override
    public boolean hasRandomTicks(BlockState state) {
        if (state.get(VARIANT) && !state.get(HAS_MANDARINS)) return true;
        return super.hasRandomTicks(state);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (state.get(VARIANT) && !state.get(HAS_MANDARINS)) world.setBlockState(pos, state.with(HAS_MANDARINS, true));
        super.hasRandomTicks(state);

    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(VARIANT, HAS_MANDARINS, DISTANCE, PERSISTENT, WATERLOGGED);
    }
}