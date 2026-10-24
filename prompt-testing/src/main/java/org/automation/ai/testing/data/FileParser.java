package org.automation.ai.testing.data;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

public  class FileParser {
    private final String fileName;

    public FileParser(String fileName) {
        this.fileName = fileName;
    }

    public String readByClassPath() throws URISyntaxException, IOException {
        return new String(Files.readAllBytes(
                Paths.get(getClass().getClassLoader()
                        .getResource(fileName)
                        .toURI())));
    }
}
