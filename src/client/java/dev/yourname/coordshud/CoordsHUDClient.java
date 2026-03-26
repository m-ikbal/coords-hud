package dev.yourname.coordshud;

import net.fabricmc.api.ClientModInitializer;

import dev.yourname.coordshud.client.hud.CoordsHudOverlay;

public class CoordsHUDClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		CoordsHudOverlay.register();
	}
}