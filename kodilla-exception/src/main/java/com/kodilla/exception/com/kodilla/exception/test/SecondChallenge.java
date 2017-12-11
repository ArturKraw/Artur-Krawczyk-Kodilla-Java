package com.kodilla.exception.com.kodilla.exception.test;

import com.kodilla.exception.io.FileReaderException;

import java.io.IOException;

public class SecondChallenge {

    public String probablyIWillThrowException(double x, double y) throws SecondChallengeException {

        try {
            if (x >= 1 || x < 2 || y != 1.5) ;
            System.out.println("Good Job. x and y meets criteria");
        } catch (Exception e) {
            System.out.println("Error: " + e);
            System.out.println("Sorry ! It's necessary to change x and/or y. " +
                    "One of teme (or both) is/are out of range" + e);
            throw new SecondChallengeException();
        } finally {
            System.out.println("Done!");
            return "Done!";
        }
    }
}
