package com.kodilla.good.patterns.challenges.ProductOrderServicePack;

import java.time.LocalDateTime;

public class ProdOrderService implements OrderService {

    public boolean ordered(User user, LocalDateTime orderTime, Product product){

        System.out.println("\n" + "<ProdOrderService> - Start");
        System.out.println("REQUEST from: " + user + " (sent at: " + orderTime + ") concerning: " + product);
        System.out.println("Changed it's status to: ORDERED");
        System.out.println("<ProdOrderService> - End");
        return true;
    }
}
