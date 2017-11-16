package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {

        int contrPar1 = 100;
        int contrPar2 = 50;
        Calculator calculator = new Calculator();
        calculator.setA(contrPar1);
        calculator.setB(contrPar2);

        int addRes = calculator.add();
        int subRes = calculator.subtract();

        int addCon = contrPar1 + contrPar2;
        int subCon = contrPar1 - contrPar2;

        System.out.println(contrPar1 + " + " + contrPar2 + " = " + addRes);
        System.out.println(contrPar1 + " - " + contrPar2 + " = " + subRes);
        if ((addRes == addCon) && (subRes == subCon)) {
            System.out.println("Test for this program passed well");
        } else {
            System.out.println("Program needs improvement(s)");
        }
    }
}
/*
    SimpleUser simpleUser = new SimpleUser("theForumUser");

    String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
        System.out.println("test OK");
    } else {
        System.out.println("Error!");
    }
 */
