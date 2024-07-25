package org.Vrglab.Reflections.neoforge;

import net.neoforged.fml.common.Mod;

import org.Vrglab.Reflections.MCReflectionsMod;
import org.Vrglab.Reflections.Reflections;
import org.Vrglab.Reflections.util.ConfigurationBuilder;

@Mod(MCReflectionsMod.MOD_ID)
public final class MCReflectionsModNeoForge {
    public MCReflectionsModNeoForge() {
        Reflections reflections = new Reflections(new ConfigurationBuilder().forPackage("org.Vrglab.Reflections"));
        reflections.getSubTypesOf(MCReflectionsMod.class);
    }
}
