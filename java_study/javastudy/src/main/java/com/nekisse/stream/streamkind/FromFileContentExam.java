package com.nekisse.stream.streamkind;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileContentExam {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/Users/nekisse/Documents/intellij_workspace/intellij_maven_javaStudy/java_study/javastudy/src/main/java/com/nekisse/data.txt");
        Path fileName = path.getFileName();
        fileName.toString();
/*        Stream<String> stream;

        stream = Files.lines(path, Charset.defaultCharset());
        stream.forEach(System.out::println);*/

        File file = path.toFile();
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        Stream<String> lines = bufferedReader.lines();
        lines.forEach(s -> System.out.println(s));



    }
}
