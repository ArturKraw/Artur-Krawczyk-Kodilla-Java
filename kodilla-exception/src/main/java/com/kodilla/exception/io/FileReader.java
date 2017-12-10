
package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {

    public void readFile() {


                        //ClassLoader classLoader = getClass().getClassLoader();
                //File file = new File(classLoader.getResource().getFile());

                try (Stream<String> fileLines = Files.lines(Paths.get("C:\\Users\\imiona"))) {
                    fileLines.forEach(System.out::println);
                } catch (IOException e) {
                    System.out.println("Oh no ! Something went wrong! Error: " + e);
                }
            }
        }
/*
        //ClassLoader classLoader = getClass().getClassLoader();
        //File file = new File(classLoader.getResource().getFile());

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(Paths.get("imiona").toString()).getFile());

        try (Stream<String> fileLines = Files.lines(file.toPath())){
            fileLines.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Oh no ! Something went wrong! Error: " + e);
        }
        System.out.println(file.getPath());
    }
}

*/
