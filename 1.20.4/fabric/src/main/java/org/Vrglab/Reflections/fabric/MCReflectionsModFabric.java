package org.Vrglab.Reflections.fabric;

import net.fabricmc.api.ModInitializer;

import org.Vrglab.Reflections.fabriclike.MCReflectionsModFabricLike;

public final class MCReflectionsModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run the Fabric-like setup.
        MCReflectionsModFabricLike.init();
    }
}
