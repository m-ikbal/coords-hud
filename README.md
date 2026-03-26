# Coords HUD

Lightweight **Fabric** client mod for **Minecraft 1.21.11** that shows your **block XYZ** in the **top-left** of the screen—handy when you do not want to keep **F3** open.

## Features

- Live block coordinates (`X / Y / Z`) while in a world
- Drawn on a dedicated HUD layer (before chat) via Fabric’s `HudElementRegistry`

## Requirements

- **Java 21**
- **Fabric Loader** (see `gradle.properties` for the version used in this repo)
- **[Fabric API](https://modrinth.com/mod/fabric-api)** on the client

## Build

```bash
./gradlew build
```

On Windows:

```bat
gradlew.bat build
```

The remapped mod JAR is written to `build/libs/` (typically `coordshud-<version>.jar`).

## Run a dev client

```bash
./gradlew runClient
```

## Install

1. Install Fabric for **1.21.11**.
2. Add **Fabric API** to your `mods` folder.
3. Copy the built `coordshud-*.jar` into `.minecraft/mods`.

## Development

Clone the repo, create a feature branch from `main`, then open a pull request when ready. CI builds the project on push/PR when configured in `.github/workflows`.

## License

See [LICENSE](LICENSE). The mod metadata in `fabric.mod.json` currently lists **CC0-1.0**; align the repository license with your choice if you change it.
