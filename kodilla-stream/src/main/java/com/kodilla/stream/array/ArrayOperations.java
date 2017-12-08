package com.kodilla.stream.array;


import java.util.stream.IntStream;


public interface ArrayOperations {


    static double getAverage(int[] numbers, int startInclusive, int endExclusiven ) {
        java.text.DecimalFormat df=new java.text.DecimalFormat("0.00");
        System.out.println("numbers (all): from.[" + 0+ "] ...to.[" + (numbers.length-1) +"]: ");
        IntStream.range( 0, numbers.length).forEach(i -> System.out.print(numbers[i] + "  "));
        Double average1 = IntStream.range( 0, numbers.length)
                .map(i -> numbers[i]).average().getAsDouble();
        System.out.print("\n" + "average (of all): " + df.format(average1)+ "\n");

        System.out.println("numbers (selected): from.[" + startInclusive + "] ...to.[" + (endExclusiven-1) +"]: ");
        IntStream.range( startInclusive, endExclusiven).forEach(i -> System.out.print(numbers[i] + "  "));
        Double average2 = IntStream.range( startInclusive, endExclusiven)
                .map(i -> numbers[i]).average().getAsDouble();
        System.out.print("\n" + "average (of selected): " + df.format(average2) + "\n");

        return average2;
    }
}



