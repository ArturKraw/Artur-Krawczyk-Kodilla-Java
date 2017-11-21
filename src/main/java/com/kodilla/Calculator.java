package com.kodilla;
import java.util.*;
import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.io.IOException;
import java.lang.InterruptedException;


@SuppressWarnings("deprecation")
class Calculator {

    Scanner sc = new Scanner( System.in );

    public void welcome() {
        System.out.println("Hello, this is a simple calculator, just for addition and substraction of two numbers (type int)" + " \n");
    }

    public char choice()throws InterruptedException {
        System.out.print("Do you want to try once again this calculator ?" + "\n" + " Type \"1\" for YES and something else for NO:  ");
        char cont = '1';
        System.out.println("Your choice is: ");
        cont = sc.next().charAt(0);
        return cont;
    }

    public char operation()throws InterruptedException {
        char typeOfOper = 0;
        System.out.println("Please enter the type of operation:" + "\n" + "(\"a\" for addition, \"b\" for substraction, \"c\" for both of them): ");
        boolean valid = false;
        do {
            typeOfOper = sc.next().charAt(0);
            valid = true;
            if ( (typeOfOper =='a')||(typeOfOper == 'b') || (typeOfOper == 'c')|| (typeOfOper == 'A')||(typeOfOper == 'B') || (typeOfOper == 'C')){
                valid = true;
                break;
            } else {
                System.out.println("Wrong choice. Please try again");
                valid = false;
            }
        } while (valid == false);

        return typeOfOper;
    }

    public int firstOper(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b) + "\n");
        return (a + b);
    }

    public int secondOper(int a, int b) {
        System.out.println(a + " - " + b + " = " + (a - b) + "\n");
        return (a - b);
    }

    public Integer number() {
        int x = 0;

        boolean tr = false;
        do {
            System.out.println("Please give a number : ");
            try {
                x = sc.nextInt();
                //y = sc.nextLine();
                //x = Integer.parseInt(String y);
            } catch (InputMismatchException e) {
                System.out.println("This not int number");
                x = 0;
                try {
                    Thread.sleep(1000);
                } catch(InterruptedException ex) {
                    Thread.currentThread().interrupt();
                    break;
                }
             break;
            }
        } while (x == 0);
        return x;
    }

    public static void main(String args[]) throws InterruptedException, IOException {
        Integer oper1, oper2, a, b;
        int firstNumber, secondNumber;
        char typeOfOper, cont;

        cont = '1';

        Scanner sc = new Scanner( System.in );
        Calculator calculator = new Calculator();

        calculator.welcome();
        do {
            firstNumber = calculator.number();
            secondNumber = calculator.number();
            switch (cont) {
                 case '1':
                     typeOfOper = calculator.operation();
                     switch (typeOfOper) {
                        case 'a':
                            calculator.firstOper(firstNumber, secondNumber);
                            break;
                        case 'b':
                            calculator.secondOper(firstNumber, secondNumber);
                            break;
                        case 'c':
                            calculator.firstOper(firstNumber, secondNumber);
                            calculator.secondOper(firstNumber, secondNumber);
                            break;
                        default:
                            System.out.println("Wrong choice. Please try again");
                     }
                 default:
                    break;
            }
            cont = calculator.choice();

        }while (cont == '1');

    System.out.println("See you later");


    }
}
