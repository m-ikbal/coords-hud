package dev.yourname.coordshud.client.input;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.util.Identifier;
import org.lwjgl.glfw.GLFW;

import dev.yourname.coordshud.CoordsHUD;
import dev.yourname.coordshud.client.CoordsHudState;

/**
 * Registers the controls entry and toggles HUD visibility on key press.
 */
public final class CoordsHudKeyBindings {

	private static final KeyBinding.Category HUD_CATEGORY = new KeyBinding.Category(
			Identifier.of(CoordsHUD.MOD_ID, "general"));
	private static final String TOGGLE_KEY = "key." + CoordsHUD.MOD_ID + ".toggle_hud";

	private static KeyBinding toggleHud;

	private CoordsHudKeyBindings() {
	}

	public static void register() {
		toggleHud = KeyBindingHelper.registerKeyBinding(new KeyBinding(
				TOGGLE_KEY,
				InputUtil.Type.KEYSYM,
				GLFW.GLFW_KEY_UNKNOWN,
				HUD_CATEGORY));

		ClientTickEvents.END_CLIENT_TICK.register(client -> {
			while (toggleHud.wasPressed()) {
				CoordsHudState.toggleVisible();
			}
		});
	}
}
