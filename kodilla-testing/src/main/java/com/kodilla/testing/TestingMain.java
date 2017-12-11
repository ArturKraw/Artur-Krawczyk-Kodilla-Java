package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class TestingMain {

    public static void main (String[] args) {
        int[] nb = new int[]{2,4,6,8,10,12};

        int startInclusive = 0;
        int endExclusive = 7;

       System.out.println(IntStream
               .range(startInclusive, endExclusive)
                        .collect(Collectors.toList()));
            /*
            double averageA = numbersA.IntStream
                    .range( int startInclusive, int endExclusive)
                .average()
            to double

            return averageA;
            */

    }
}
