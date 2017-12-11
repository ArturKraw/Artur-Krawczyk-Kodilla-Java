package com.kodilla.stream.array;


import java.util.stream.IntStream;


public interface ArrayOperations {


    static double getAverage(int[] numbers, int startInclusive, int endExclusiven ) {
        int numbL = numbers.length;
        if (numbers.length==0){ numbL=0; }
        java.text.DecimalFormat df=new java.text.DecimalFormat("0.00");
        System.out.println("numbers (all): from.[" + 0+ "] ...to.[" + (numbL) +"]: ");
        IntStream.range( 0, numbers.length).forEach(i -> System.out.print(numbers[i] + "  "));
        Double average1 = IntStream.range( 0, numbers.length)
                .map(i -> numbers[i]).average().orElse(0.0);
        System.out.print("\n" + "average (of all): " + df.format(average1)+ "\n");

        int showendExl = endExclusiven;
        if (endExclusiven==0){ showendExl=0; }
        System.out.println("numbers (selected): from.[" + startInclusive + "] ...to.[" + (showendExl) +"]: ");
        IntStream.range( startInclusive, endExclusiven).forEach(i -> System.out.print(numbers[i] + "  "));
        Double average2 = IntStream.range( startInclusive, endExclusiven)
                .map(i -> numbers[i]).average().orElse(0.0);
        System.out.print("\n" + "average (of selected): " + df.format(average2) + "\n");

        return average2;
    }
}



