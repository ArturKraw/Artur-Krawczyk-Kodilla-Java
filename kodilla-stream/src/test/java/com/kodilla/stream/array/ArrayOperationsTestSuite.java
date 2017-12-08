package com.kodilla.stream.array;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {
    private static int testCounter = 0;

    @Before
    public void before()    {
        testCounter++;
        System.out.println("\n" + "Test #" + testCounter);
    }

    int [] numbers = {42, 12, 10, 20, 30, 40, 43, 23, 12, 34, 56, 78, 99, 101};
    int startInclusive, endExclusivenint;

    @Test
public void test1GetAverage() {
    //Given
    startInclusive = 2;
    endExclusivenint = 6;
    if (endExclusivenint > numbers.length) {
        endExclusivenint = numbers.length;
    }
    // When
    System.out.println("Results from tested method: ");
    double aver = ArrayOperations.getAverage(numbers, startInclusive, endExclusivenint);
    double aver2 = IntStream.range(startInclusive, endExclusivenint).map(i -> numbers[i]).average().getAsDouble();
    java.text.DecimalFormat df=new java.text.DecimalFormat("0.00");
    System.out.println("\n" + "Results from test program: " + "\n" + "average (of selected): " + df.format(aver2));

    //Then
    Assert.assertEquals(aver, aver2, 0.001);
}

    @Test
    public void test2GetAverage() {
        //Given
        int startInclusive = 0;
        int endExclusivenint = numbers.length;
        if (endExclusivenint > numbers.length) {
            endExclusivenint = numbers.length;
        }
        // When
        System.out.println("Results from tested method: ");
        double aver = ArrayOperations.getAverage(numbers, startInclusive, endExclusivenint);
        double aver2 = IntStream.range(startInclusive, endExclusivenint).map(i -> numbers[i]).average().getAsDouble();
        java.text.DecimalFormat df=new java.text.DecimalFormat("0.00");
        System.out.println("\n" + "Results from test program: " + "\n" + "average (of selected): " + df.format(aver2));

        //Then
        Assert.assertEquals(aver, aver2, 0.001);
    }
}

