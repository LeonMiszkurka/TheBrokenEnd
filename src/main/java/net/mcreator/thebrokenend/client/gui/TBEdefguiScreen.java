package net.mcreator.thebrokenend.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.thebrokenend.world.inventory.TBEdefguiMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class TBEdefguiScreen extends AbstractContainerScreen<TBEdefguiMenu> {
	private final static HashMap<String, Object> guistate = TBEdefguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_ender_events;

	public TBEdefguiScreen(TBEdefguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("thebrokenend:textures/screens/tb_edefgui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(RenderType::guiTextured, texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.thebrokenend.tb_edefgui.label_tbd"), 77, 9, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_ender_events = Button.builder(Component.translatable("gui.thebrokenend.tb_edefgui.button_ender_events"), e -> {
		}).bounds(this.leftPos + 40, this.topPos + 72, 87, 20).build();
		guistate.put("button:button_ender_events", button_ender_events);
		this.addRenderableWidget(button_ender_events);
	}
}
