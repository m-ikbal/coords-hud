package dev.yourname.coordshud.client;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Client-only visibility flag for the coordinates HUD (default: shown).
 */
public final class CoordsHudState {

	private static final AtomicBoolean visible = new AtomicBoolean(true);

	private CoordsHudState() {
	}

	public static boolean isVisible() {
		return visible.get();
	}

	public static void toggleVisible() {
		visible.set(!visible.get());
	}
}
