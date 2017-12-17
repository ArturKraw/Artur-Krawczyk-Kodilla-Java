package com.kodilla.good.patterns.challenges.Food2DoorSystem;

import java.time.LocalDateTime;

public class F2DOrderRepository extends F2DOrderRepositoryAbs {

    public boolean createOrder(String orderId, User user, ProductProvider productProvider, LocalDateTime orderTime, OrderSet orderSet){
        System.out.println("\n" + "<ProdOrderRepository> - Start");
        System.out.println("Order numer: " + orderId +
                " from: " + user + "\n" +
                " to: " + productProvider + "\n" +
                "Sent at: " + orderTime + "\n" +
                "Concerning: " + orderSet);
        System.out.println("Is being CREATED");
        System.out.println("<ProdOrderRepository> - End");
        return true;
    }
}
