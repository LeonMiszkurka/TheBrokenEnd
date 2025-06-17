
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thebrokenend.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.thebrokenend.world.inventory.TBEdefguiMenu;
import net.mcreator.thebrokenend.ThebrokenendMod;

public class ThebrokenendModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, ThebrokenendMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<TBEdefguiMenu>> TB_EDEFGUI = REGISTRY.register("tb_edefgui", () -> IMenuTypeExtension.create(TBEdefguiMenu::new));
}
