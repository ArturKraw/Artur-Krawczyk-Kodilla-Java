package com.kodilla.good.patterns.challenges.Food2DoorSystem;

public class Food2DoorSystemExecutor {

    public static void main (String args[]) {


        System.out.println("\n" + "<F2D-System-Executor> - Start>");
        F2DProductOrderService productOrder = new F2DProductOrderService();

        productOrder.productOrderService();
        System.out.println("<F2D-System-Executor> - End");
        System.out.println("That's all, bye");
        }
    }
