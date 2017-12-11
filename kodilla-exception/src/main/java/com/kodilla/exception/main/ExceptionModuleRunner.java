package com.kodilla.exception.main;


import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
//import com.kodilla.exception.io.FileReaderWithoutHandling;

public class ExceptionModuleRunner {

    public static void main (String args[]) {

        FileReader fileReader = new FileReader();
        FileReaderException fileReaderEx = new FileReaderException();
/*
        try (fileReader.readFile())  {
            System.out.println("No problem while reading a file!");
        } catch (FileReaderException e) {
            fileReaderEx.FileReaderException();
            System.out.println("Problem while reading a file!");
        }
  */
    }
}
