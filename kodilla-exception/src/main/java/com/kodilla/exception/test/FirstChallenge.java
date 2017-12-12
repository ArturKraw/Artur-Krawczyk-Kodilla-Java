package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        double a = 3.0;
        double b = 4.0; // change this to ZERO to check the progam
        double result;
        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            System.out.println("\n" + "try section");
            result = firstChallenge.divide(a, b);
            System.out.println("(a): " + a + "; (b): " + b + "  ; (a / b) = " + result);
        } catch (ArithmeticException e) {
            System.out.println("\n" + "catch section");
            System.out.println("Division by zero exception");
            System.out.println("Oh no ! It is forbidden to divide by ZERO ! Error: " + e);
        }
        finally {
            System.out.println("\n" + "finally section");
            System.out.println("That's it");
        }
    }
}
