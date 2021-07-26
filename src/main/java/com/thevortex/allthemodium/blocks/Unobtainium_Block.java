package com.thevortex.allthemodium.blocks;

import java.util.ArrayList;
import java.util.List;

import com.thevortex.allthemodium.init.ModItems;

import com.thevortex.allthemodium.registry.ModRegistry;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.storage.loot.LootContext;

public class Unobtainium_Block extends Block {

	public Unobtainium_Block() {	
	super(Properties.of(Material.METAL).sound(SoundType.STONE).strength(7.0f));
	}

@Deprecated
@Override
public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
	List<ItemStack> list = new ArrayList<ItemStack>();
	list.add(new ItemStack(ModRegistry.UNOBTAINIUM_BLOCK.get()));
	return list;
}



}
