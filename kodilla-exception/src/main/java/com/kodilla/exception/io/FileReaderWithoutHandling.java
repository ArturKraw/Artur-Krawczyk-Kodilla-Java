package com.kodilla.exception.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReaderWithoutHandling {

    public void readFile() throws IOException {


        //ClassLoader classLoader = getClass().getClassLoader();
        //File file = new File(classLoader.getResource().getFile());

        Stream<String> fileLines = Files.lines(Paths.get("C:\\Users\\imiona"));
        fileLines.forEach(System.out::println);

    }
}


