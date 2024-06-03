package com.in28minutes.exercises.newreleases.java11.api.files;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReadWriteRunner {
    public static void main(String[] args) throws IOException, URISyntaxException {
        ClassLoader classLoader = FileReadWriteRunner.class.getClassLoader();
        //Logic modified from the course given this is a maven build project...
        //Path path = Paths.get("src/main/resources/sample1.txt");
        URL filePath = classLoader.getResource("sample1.txt");
        Path path = Path.of(filePath.toURI());
        String fileContent = Files.readString(path);
        System.out.println(fileContent);
        String newFileContent = fileContent.replace("Line", "Lines");
        String newFilePathString = filePath.toString().replace("sample1.txt", "sample1-new.txt");
        //Path newFilePath = Paths.get();
        Files.writeString(path, newFileContent);
        System.out.println(Files.readString(path));
    }
}
