package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProdOrderRepository implements OrderRepository {

    public boolean createOrder(User user, LocalDateTime orderTime, Product product){
        System.out.println("\n" + "<ProdOrderRepository> - Start");
        System.out.println("Order from: " + user + "\n" + "Sent at: " + orderTime + "\n" + "Concerning: " + product);
        System.out.println("Is being CREATED");
        System.out.println("<ProdOrderRepository> - End");
        return true;
    }
}
