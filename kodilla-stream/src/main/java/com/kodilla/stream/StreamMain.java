package com.kodilla.stream;



import com.kodilla.stream.array.ArrayOperations;

import java.util.stream.IntStream;

import static java.util.Arrays.stream;

public class StreamMain {
    int[] numbers;
    int n, m;

    public static void theAverage (int[] numbers, int n, int m) {

    System.out.println("numbers (all): ");
            IntStream.range(0,numbers.length).
            forEach (i ->System.out.print(numbers[i]+"  "));
            System.out.println("\n"+"numbers (selected) ["+n +"] ...["+(m -1)+"]: ");
            IntStream.range(n,m).

    forEach (i ->System.out.print(numbers[i]+"  "));

    Double average = IntStream.range(n, m)
            .map(i -> numbers[i]).average().getAsDouble();
        java.text.DecimalFormat df=new java.text.DecimalFormat("0.00");
        System.out.println("\n" + "average (of selected): "+df.format(average)  + "\n");
    }

    public static void main(String[] args) {

        int [] numbers = {42, 12, 10, 20, 30, 40, 43, 23, 12, 34, 56, 78, 99, 101};
        int startInclusive = 2;
        int endExclusivenint1 = 6;
        int endExclusivenint;
        if (endExclusivenint1 <= numbers.length) {
            endExclusivenint = endExclusivenint1;
            } else {
            endExclusivenint = numbers.length;
        }

        double aver = ArrayOperations.getAverage(numbers, startInclusive, endExclusivenint);
        java.text.DecimalFormat df=new java.text.DecimalFormat("0.00");
        System.out.println("\n" + "AverageA: "  + df.format(aver));

    }
}
/*
Zadanie:
        interfejs ArrayOperations z jedną metodą statyczną - getAverage(int[] numbers).
        Metoda getAverage(int[] numbers) powinna:
        - przy pomocy strumienia IntStream oraz metody range(int startInclusive, int endExclusive) wyświetlić kolejne elementy tablicy, a następnie:
        - przy pomocy drugiego strumienia IntStream oraz metody range(int startInclusive, int endExclusive), a także kolektora average() obliczyć średnią. Na końcu metoda powinna zwracać średnią jako wynik typu double.
        W katalogu src/test/java utwórz pakiet com.kodilla.stream.array z jednym zestawem testów ArrayOperationsTestSuite oraz jednym testem testGetAverage().
        Test powinien przygotować tablicę z przykładowymi wartościami typu int i wywołać metodę getAverage(int[] numbers) interfejsu ArrayOperations.
        Przy pomocy asercji sprawdź, czy obliczona średnia jest poprawna.
        */