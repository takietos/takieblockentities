package net.takie.takieterra.block.custom.plants;

import net.minecraft.advancement.Advancement;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.*;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.takie.takieterra.TakieTerraMod;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class TurnableFlowerPotBlock extends FlowerPotBlock {
    public TurnableFlowerPotBlock(Block content, Settings settings) {
        super(content, settings);
        this.setDefaultState((BlockState)((BlockState)this.stateManager.getDefaultState()).with(FACING, Direction.NORTH));
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hitResult) {
        if (player.isSneaking()) {
            if (world.getServer() != null) {
                Advancement advancement = world.getServer().getAdvancementLoader().get(ADVANCEMENT_ID);
                if (advancement != null) {
                    if (player instanceof ServerPlayerEntity serverPlayer) {
                        serverPlayer.getAdvancementTracker().grantCriterion(advancement, "planted_pot");
                    }
                }
            }
            world.setBlockState(pos, state.rotate(BlockRotation.CLOCKWISE_90), 3);
            world.playSound(null, pos, SoundEvents.BLOCK_GRINDSTONE_USE, SoundCategory.BLOCKS, 0.25f, 1.5f);
            return ActionResult.success(world.isClient);
        }
        return super.onUse(state, world, pos, player, hand, hitResult);
    }

    @Override
    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean movedByPiston) {
        if (oldState.getBlock() instanceof TurnableFlowerPotBlock || oldState.getBlock() instanceof FlowerPotBlock) {
            if (state.getBlock() != oldState.getBlock()) {
                world.playSound(null, pos, SoundEvents.ITEM_CROP_PLANT, SoundCategory.BLOCKS);
            }
        }
        super.onBlockAdded(state, world, pos, oldState, movedByPiston);
    }

    //FACING
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    public BlockState mirror(BlockState pState, BlockMirror mirror) {
        return pState.rotate(mirror.getRotation(pState.get(FACING)));
    }

    @Override
    protected void appendProperties (StateManager.Builder < Block, BlockState > builder){
        builder.add(FACING);
    }

    public BlockRenderType getRenderType(BlockState pState) {
        return BlockRenderType.MODEL;
    }

    //advancement id for granting the advancement in onBreak, condition of advancement is "impossible" and needs to be executed here
    Identifier ADVANCEMENT_ID = new Identifier(TakieTerraMod.MOD_ID, "potters_pivot");

    public BlockState getPlacementState(ItemPlacementContext context) {
        return this.getDefaultState().with(FACING, context.getHorizontalPlayerFacing().getOpposite());
    }
}
