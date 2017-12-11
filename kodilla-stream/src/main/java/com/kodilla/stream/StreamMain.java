package com.kodilla.stream;


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import com.kodilla.stream.beautifier.PoemBeautifier;
=======
import com.kodilla.stream.iterate.NumbersGenerator;
>>>>>>> f4c5fc434af14471a642b65b84aa12d5eeda0259
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;
=======
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;
>>>>>>> 61753832e148590c5df42b83bd984cb41f069aca


public class StreamMain {
    public static void main(String[] args) {

<<<<<<< HEAD
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautifier("  Text Example 1  ", (a) -> a+"ABC");
        poemBeautifier.beautifier("  Text Example 2  ", (a) -> "ABC"+a);
        poemBeautifier.beautifier("  Text Example 3  ", (a) -> a.toUpperCase());
        poemBeautifier.beautifier("  Text Example 4  ", (a) -> a.toLowerCase());
        poemBeautifier.beautifier("  Text Example 5  ", (a) -> a.trim());

/*
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
/*
        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
*/
<<<<<<< HEAD
=======
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

>>>>>>> f4c5fc434af14471a642b65b84aa12d5eeda0259
=======

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
>>>>>>> dc41d7cfe5d3b47f571bcb8cf49568187d7d9800
    }
=======
        Forum theForumUserList = new Forum();

        Map<Integer, Object> theResultMapOfUsers = theForumUserList.getTheList().stream()
                .filter(forumUser -> forumUser.getUserSex() == 'M')
                .filter(forumUser -> forumUser.getQuantityOfPosts() > 0)
                .filter(forumUser -> forumUser.getUserDateOfBirth().getYear() <(LocalDate.now().getYear()-20))
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        System.out.println("# elements: " + theResultMapOfUsers.size());
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
>>>>>>> 61753832e148590c5df42b83bd984cb41f069aca
=======
import com.kodilla.stream.world.*;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main (String[] args) {

        ContinentA continentA = new ContinentA();
        ContinentB continentB = new ContinentB();
        ContinentC continentC = new ContinentC();

        BigDecimal result1 = continentA.getContinentCountryList().stream()
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println("\n" + "ContinentA.Population: " +  result1);

        BigDecimal result2 = continentB.getContinentCountryList().stream()
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println("\n" + "ContinentB.Population  " + result2);

        BigDecimal result3 = continentC.getContinentCountryList().stream()
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

<<<<<<< HEAD
        System.out.println("\n" + "ContinentC.Population: " + result3);

        BigDecimal resultSum1 = (result1).add(result2).add(result3);
        System.out.println("\n" + "World.Population (sum of 3 continents):  " + resultSum1);

        World world = new World();
        BigDecimal result = world.getPeopleQuantity();
        System.out.println("\n" + "World.Population (program main):  " + result);


        System.out.println("Quantitiy of countries (world): " +
                world.getWorldList().stream()
                .flatMap(continent -> continent.getContinentCountryList().stream())
                .map(Country::getName).count()
                        );
                //
                //.reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println("Countries names: (world) " +
                world.getWorldList().stream()
                .flatMap(continent -> continent.getContinentCountryList().stream())
                .map(Country::getName)
                .collect(Collectors.toList())
                    );
>>>>>>> 4a6d83fb5f4eb5e88dfe8b72ad8fd683386a37fb

    }
}

<<<<<<< HEAD
=======









>>>>>>> 4a6d83fb5f4eb5e88dfe8b72ad8fd683386a37fb
=======
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
>>>>>>> dc41d7cfe5d3b47f571bcb8cf49568187d7d9800
