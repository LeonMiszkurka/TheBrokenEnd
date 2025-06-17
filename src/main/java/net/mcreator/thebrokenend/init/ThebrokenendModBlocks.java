
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thebrokenend.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.thebrokenend.block.TbeUnkownBlock;
import net.mcreator.thebrokenend.block.FZFblockBlock;
import net.mcreator.thebrokenend.ThebrokenendMod;

import java.util.function.Function;

public class ThebrokenendModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(ThebrokenendMod.MODID);
	public static final DeferredBlock<Block> FZ_FBLOCK = register("fz_fblock", FZFblockBlock::new);
	public static final DeferredBlock<Block> TBE_UNKOWN = register("tbe_unkown", TbeUnkownBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier, BlockBehaviour.Properties.of());
	}
}
