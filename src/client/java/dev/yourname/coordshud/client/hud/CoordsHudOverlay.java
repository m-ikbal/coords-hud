package dev.yourname.coordshud.client.hud;

import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

import dev.yourname.coordshud.CoordsHUD;
import dev.yourname.coordshud.client.CoordsHudState;

/**
 * Renders player block coordinates in the top-left corner while in-game.
 */
public final class CoordsHudOverlay {

	private static final Identifier ELEMENT_ID = Identifier.of(CoordsHUD.MOD_ID, "coords");
	private static final int PADDING = 4;
	private static final int TEXT_COLOR = 0xE0FFFFFF;

	private CoordsHudOverlay() {
	}

	public static void register() {
		HudElementRegistry.attachElementBefore(
				VanillaHudElements.CHAT,
				ELEMENT_ID,
				CoordsHudOverlay::render);
	}

	private static void render(DrawContext context, RenderTickCounter tickCounter) {
		if (!CoordsHudState.isVisible()) {
			return;
		}

		MinecraftClient client = MinecraftClient.getInstance();
		if (client.player == null || client.world == null) {
			return;
		}

		BlockPos pos = client.player.getBlockPos();
		String line = String.format("XYZ %d / %d / %d", pos.getX(), pos.getY(), pos.getZ());

		context.drawTextWithShadow(
				client.textRenderer,
				line,
				PADDING,
				PADDING,
				TEXT_COLOR);
	}
}
