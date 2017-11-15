package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        Calculator calculator = new Calculator(50, 30);

        System.out.println("Calculator Test:");

        int result1 = calculator.getAdd();
        System.out.println("Test - add: " + calculator.getA() + " + " + calculator.getB() + " = " +result1);

        int result2 = calculator.getSubstract();
        System.out.println("Test - substract: " + calculator.getA() + " - " + calculator.getB() + " = " + result2);

        // tu umieść kolejny test ->
        System.out.println("Test - pierwszy test jednostkowy:");
    }
}
