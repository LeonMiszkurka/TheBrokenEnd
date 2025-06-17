
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thebrokenend.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.thebrokenend.ThebrokenendMod;

public class ThebrokenendModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ThebrokenendMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TBE = REGISTRY.register("tbe",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.thebrokenend.tbe")).icon(() -> new ItemStack(Items.MUSIC_DISC_11)).displayItems((parameters, tabData) -> {
				tabData.accept(ThebrokenendModBlocks.FZ_FBLOCK.get().asItem());
				tabData.accept(ThebrokenendModBlocks.TBE_UNKOWN.get().asItem());
			}).withSearchBar().build());
}
