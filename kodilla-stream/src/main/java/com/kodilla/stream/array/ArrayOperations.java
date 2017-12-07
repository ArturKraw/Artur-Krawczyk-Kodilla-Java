package com.kodilla.stream.array;

public interface ArrayOperations {

    public static int getAverage(int[] numbers) {

        int[] numbersA= numbers.IntStream()
                .range(int startInclusive, int endExclusive)
                .toList();

        System.out.println(numbersA);

        double averageA = numbersA.IntStream
                .range(int startInclusive, int endExclusive)
                .average()
                to double

        return averageA;
    }
}
