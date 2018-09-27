package com.nekisse.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromDirectoryExam {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("/Users/nekisse/Documents/intellij_workspace/intellij_maven_javaStudy/java_study/javastudy/src/main/java/com/nekisse/stream");

        Stream<Path> list = Files.list(path);
        list.forEach(path1 -> System.out.println(path1.getFileName()));
    }
}
