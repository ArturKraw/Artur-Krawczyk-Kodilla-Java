package com.kodilla.exception.com.kodilla.exception.test;

import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;

public class ExceptionHandling {


    public static void main (String args[]) {
        double x = 3.0;
        double y = 2.0;

        SecondChallenge challenge = new SecondChallenge();

        try {
            challenge.probablyIWillThrowException(x, y);
        } catch (SecondChallengeException e) {
            System.out.println("Problem with input data (x,y) - out of range !");
        } finally {
            System.out.println("An now back to :ExceptionHandling class");
        }
    }
}
