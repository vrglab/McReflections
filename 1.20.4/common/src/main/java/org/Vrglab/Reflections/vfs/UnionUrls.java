package org.Vrglab.Reflections.vfs;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.jar.JarFile;

public class UnionUrls implements Vfs.Dir {
    private final URL url;
    private final File file;
    private final List<Path> paths = new ArrayList<Path>();

    public UnionUrls(URL url) {
        this.url = url;
        file = new File(url.getFile().split("%")[0]);
        if(file.exists()) {
            if(file.isDirectory()) {
                try (DirectoryStream<Path> stream = Files.newDirectoryStream(file.toPath())) {
                    for (Path file : stream) {
                        if(file.getFileName().toString().endsWith(".jar")) {
                            paths.add(file);
                        }
                    }
                } catch (IOException | DirectoryIteratorException e) {
                    System.err.println("Error reading directory: " + e.getMessage());
                }
            } else {
                paths.add(file.toPath());
            }
        }
    }

    @Override
    public String getPath() {
        return url.getPath().split("%")[0];
    }

    @Override
    public Iterable<Vfs.File> getFiles() {
        try {
            return new JarInputDir(file.toURI().toURL()).getFiles();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
