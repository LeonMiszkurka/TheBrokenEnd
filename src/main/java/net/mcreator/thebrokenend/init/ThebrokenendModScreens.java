
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thebrokenend.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.thebrokenend.client.gui.TBEdefguiScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ThebrokenendModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(ThebrokenendModMenus.TB_EDEFGUI.get(), TBEdefguiScreen::new);
	}
}
