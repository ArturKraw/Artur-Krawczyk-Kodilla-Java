package com.kodilla.stream;


<<<<<<< HEAD
import com.kodilla.stream.beautifier.PoemBeautifier;
=======
import com.kodilla.stream.iterate.NumbersGenerator;
>>>>>>> f4c5fc434af14471a642b65b84aa12d5eeda0259
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;


public class StreamMain {
    public static void main(String[] args) {

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
    }

}
