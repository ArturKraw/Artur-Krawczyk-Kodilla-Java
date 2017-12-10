package com.kodilla.exception.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

//Wykorzystując blok try-catch-finally obsłuż rzucany wyjątek.
public class FirstChallenge {
    private double result, result1;

    public double divide(double a, double b)  {
        double result;
        System.out.println("double method");
        result = 0;
        try {
            result = a * 1000000000 / b;
           System.out.println("try - section");
            result = (a * 1000000000) / b;
            System.out.println("(a): " + a + "; (b): " + b + "  ; (a / b) = " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("catch ArExc- section");
            System.out.println("Oh no ! It is forbidden tot divide by ZERO ! Error: " + e);
            System.out.println("Division by zero exception");
        }
        catch (Exception e) {
            System.out.println("catch Exc - section");
            System.out.println("Exception occurred: " + e);
        }
        finally {
            System.out.println("finally - section");
            System.out.println("That's it");

        }
        //System.out.println("result1; " + result1);
        return result;
    }
     /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(2000000000, 0);

        System.out.println("(Main program) result: " +result);
    }
}
