package org.Vrglab.Reflections.fabriclike;

import org.Vrglab.Reflections.MCReflectionsMod;
import org.Vrglab.Reflections.Reflections;
import org.Vrglab.Reflections.scanners.Scanners;
import org.Vrglab.Reflections.util.ConfigurationBuilder;

public final class MCReflectionsModFabricLike {
    public static void init() {
        Reflections reflections = new Reflections(new ConfigurationBuilder().addScanners(Scanners.FieldsAnnotated).forPackages("org.Vrglab.Reflections"));
    }
}
