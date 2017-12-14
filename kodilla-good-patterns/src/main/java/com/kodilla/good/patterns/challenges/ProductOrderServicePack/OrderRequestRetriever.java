package com.kodilla.good.patterns.challenges.ProductOrderServicePack;

//odpowiednik RentRequestRetriever

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve () {

        User user = new User("Jan", "Nowak" , "JNAA1000WAW");

        LocalDateTime orderTime = LocalDateTime.of(2017, 12, 11, 16, 15);

        Product product = new Product ("LegoSet1", 1, 50.0 );


        System.out.println("\n" + "<OrderRequestRetriever> - Start");
        System.out.println("Summary of product order: ");
        System.out.println(user);
        System.out.println("Order Time: " + orderTime);
        System.out.println(product);
        System.out.println("<OrderRequestRetriever> - End");
            return new OrderRequest(user, orderTime, product);


    }
}
