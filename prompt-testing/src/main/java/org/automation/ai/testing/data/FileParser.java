package org.automation.ai.testing.data;

import java.nio.file.Path;

public  class FileParser {
    private final Path path;

    public FileParser(Path path) {
        this.path = path;

    }
    public FileParser(boolean isInClassPath, Path path) {
        this.path = path;
        if(isInClassPath){

        }
    }
}
