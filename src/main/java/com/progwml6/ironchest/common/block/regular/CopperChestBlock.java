package com.progwml6.ironchest.common.block.regular;

import com.mojang.serialization.MapCodec;
import com.progwml6.ironchest.common.block.IronChestsTypes;
import com.progwml6.ironchest.common.block.entity.IronChestsBlockEntityTypes;
import com.progwml6.ironchest.common.block.regular.entity.CopperChestBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nullable;

public class CopperChestBlock extends AbstractIronChestBlock {

  public static final MapCodec<CopperChestBlock> CODEC = simpleCodec(CopperChestBlock::new);

  public CopperChestBlock(Properties properties) {
    super(properties, IronChestsBlockEntityTypes.COPPER_CHEST::get, IronChestsTypes.COPPER);
  }

  @Nullable
  @Override
  public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
    return new CopperChestBlockEntity(blockPos, blockState);
  }

  @Override
  protected MapCodec<? extends BaseEntityBlock> codec() {
    return CODEC;
  }
}
