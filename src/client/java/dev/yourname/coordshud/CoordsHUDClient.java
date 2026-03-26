package dev.yourname.coordshud;

import net.fabricmc.api.ClientModInitializer;

import dev.yourname.coordshud.client.hud.CoordsHudOverlay;
import dev.yourname.coordshud.client.input.CoordsHudKeyBindings;

public class CoordsHUDClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		CoordsHudKeyBindings.register();
		CoordsHudOverlay.register();
	}
}