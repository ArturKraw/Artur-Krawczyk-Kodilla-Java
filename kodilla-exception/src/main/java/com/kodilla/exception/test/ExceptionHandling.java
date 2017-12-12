package com.kodilla.exception.test;


public class ExceptionHandling {


    public static void main (String args[]) {
        // It is possible to change x and(or) y
        // Exception if( x<1 or x>=2 or y==1.5)
        double x = 2.5;
        double y = 1.5;

        SecondChallenge challenge = new SecondChallenge();

        try {
            System.out.println("\n" + "try section - ExceptionHandling");
            challenge.probablyIWillThrowException(x, y);

        } catch (SecondChallengeException e) {
            System.out.println("\n" + "catch section - ExceptionHandling");
            System.out.println("Problem with input data (x,y) - out of range !");
            e.SecondChallengeExceptionMet();

        } finally {
            System.out.println("\n" + "finally section - ExceptionHandling");

            System.out.println("Done All!");
        }
    }
}
