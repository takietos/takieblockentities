package net.takie.takieterra.block.custom;

import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.mob.RavagerEntity;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.takie.takieterra.item.TakieTerraItems;

public class CucumberCropBlock extends CropBlock {

    public static final int MAX_AGE = 7;
    public static final IntProperty AGE = IntProperty.of("age", 0, 7);

    public CucumberCropBlock(Settings settings) {
        super(settings);
    }

    protected IntProperty getAgeProperty () {
        return AGE;
    }

    public int getAge (BlockState state){
        return state.get(this.getAgeProperty());
    }

    public BlockState withAge ( int age){
        return (BlockState) this.getDefaultState().with(this.getAgeProperty(), age);
    }

    @Override
    public void randomTick (BlockState state, ServerWorld world, BlockPos pos, Random random){
        float f;
        int i;
        if (world.getBaseLightLevel(pos, 0) >= 9 && (i = this.getAge(state)) < this.getMaxAge() && random.nextInt((int) (25.0f / (f = CropBlock.getAvailableMoisture(this, world, pos))) + 1) == 0) {
            world.setBlockState(pos, this.withAge(i + 1), Block.NOTIFY_LISTENERS);
        }
    }

    public void applyGrowth (World world, BlockPos pos, BlockState state){
        int j;
        int i = this.getAge(state) + this.getGrowthAmount(world);
        if (i > (j = this.getMaxAge())) {
            i = j;
        }
        world.setBlockState(pos, this.withAge(i), Block.NOTIFY_LISTENERS);
    }

    protected static float getAvailableMoisture (Block block, BlockView world, BlockPos pos){
        boolean bl2;
        float f = 1.0f;
        BlockPos blockPos = pos.down();
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                float g = 0.0f;
                BlockState blockState = world.getBlockState(blockPos.add(i, 0, j));
                if (blockState.isOf(Blocks.FARMLAND)) {
                    g = 1.0f;
                    if (blockState.get(FarmlandBlock.MOISTURE) > 0) {
                        g = 3.0f;
                    }
                }
                if (i != 0 || j != 0) {
                    g /= 4.0f;
                }
                f += g;
            }
        }
        BlockPos blockPos2 = pos.north();
        BlockPos blockPos3 = pos.south();
        BlockPos blockPos4 = pos.west();
        BlockPos blockPos5 = pos.east();
        boolean bl = world.getBlockState(blockPos4).isOf(block) || world.getBlockState(blockPos5).isOf(block);
        boolean bl3 = bl2 = world.getBlockState(blockPos2).isOf(block) || world.getBlockState(blockPos3).isOf(block);
        if (bl && bl2) {
            f /= 2.0f;
        } else {
            boolean bl32;
            boolean bl4 = bl32 = world.getBlockState(blockPos4.north()).isOf(block) || world.getBlockState(blockPos5.north()).isOf(block) || world.getBlockState(blockPos5.south()).isOf(block) || world.getBlockState(blockPos4.south()).isOf(block);
            if (bl32) {
                f /= 2.0f;
            }
        }
        return f;
    }

    @Override
    public boolean canPlaceAt (BlockState state, WorldView world, BlockPos pos){
        return (world.getBaseLightLevel(pos, 0) >= 8 || world.isSkyVisible(pos)) && super.canPlaceAt(state, world, pos);
    }

    @Override
    public void onEntityCollision (BlockState state, World world, BlockPos pos, Entity entity){
        if (entity instanceof RavagerEntity && world.getGameRules().getBoolean(GameRules.DO_MOB_GRIEFING)) {
            world.breakBlock(pos, true, entity);
        }
        super.onEntityCollision(state, world, pos, entity);
    }

    protected ItemConvertible getSeedsItem () {
        return TakieTerraItems.CUCUMBER_SEEDS;
    }

    @Override
    public ItemStack getPickStack (BlockView world, BlockPos pos, BlockState state){
        return new ItemStack(this.getSeedsItem());
    }

    @Override
    public boolean isFertilizable (WorldView world, BlockPos pos, BlockState state,boolean isClient){
        return !this.isMature(state);
    }

    @Override
    public boolean canGrow (World world, Random random, BlockPos pos, BlockState state){
        return true;
    }

    @Override
    public void grow (ServerWorld world, Random random, BlockPos pos, BlockState state){
        this.applyGrowth(world, pos, state);
    }

    @Override
    protected void appendProperties (StateManager.Builder < Block, BlockState > builder){
        builder.add(AGE);
    }

}

