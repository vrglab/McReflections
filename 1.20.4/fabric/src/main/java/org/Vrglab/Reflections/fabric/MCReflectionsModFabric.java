package org.Vrglab.Reflections.fabric;

import net.fabricmc.api.ModInitializer;

import org.Vrglab.Reflections.fabriclike.MCReflectionsModFabricLike;

public final class MCReflectionsModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        MCReflectionsModFabricLike.init();
    }
}
