package com.kodilla.good.patterns.challenges;

public class ProductOrderServiceExecutor {


    public static void main (String args[]) {


        System.out.println("\n" + "<ProductOrderServiceExecutor> - Start>");
        ProductOrderService productOrder = new ProductOrderService();

        productOrder.productOrderService();
        System.out.println("<ProductOrderServiceExecutor> - End");
        System.out.println("BYE");



    }
}
