package org.Vrglab.Reflections.quilt;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

import org.Vrglab.Reflections.fabriclike.MCReflectionsModFabricLike;

public final class MCReflectionsModQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        MCReflectionsModFabricLike.init();
    }
}
