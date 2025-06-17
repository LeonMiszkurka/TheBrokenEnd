
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thebrokenend.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.thebrokenend.ThebrokenendMod;

import java.util.function.Function;

public class ThebrokenendModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ThebrokenendMod.MODID);
	public static final DeferredItem<Item> FZ_FBLOCK = block(ThebrokenendModBlocks.FZ_FBLOCK);
	public static final DeferredItem<Item> TBE_UNKOWN = block(ThebrokenendModBlocks.TBE_UNKOWN);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.registerItem(block.getId().getPath(), properties -> new BlockItem(block.get(), properties), new Item.Properties());
	}
}
