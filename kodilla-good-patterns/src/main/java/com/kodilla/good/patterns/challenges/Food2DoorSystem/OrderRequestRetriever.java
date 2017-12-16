package com.kodilla.good.patterns.challenges.Food2DoorSystem;

import java.time.LocalDateTime;
import java.util.HashMap;

class OrderRequestRetriever {

    OrderRequest retrieve() {

        User user = new User("JN/AA/1000/WAW");

        LocalDateTime orderTime = LocalDateTime.of(2017, 12, 11, 16, 15);

        ProductProvider productProvider = new ProductProvider ("Shop1", "Adres1");

            Product product1 = new Product ("apple", 1.0);
            Product product2 = new Product ("waterMelon", 3.0 );
            Product product3 = new Product ("tomato", 0.5);

        HashMap<Product, Integer> set1 = new HashMap<Product, Integer>();
                set1.put(product1, 5);
                set1.put(product2, 2);
                set1.put(product3, 10);

        OrderSet orderSet = new OrderSet(set1);
        String orderId = "1/2017";

        OrderRequest orderRequest1= new OrderRequest(orderId, user, orderTime, productProvider, orderSet);
        System.out.println("\n" + "<OrderRequestRetriever> - Start");
        System.out.println("Summary of product order: ");
        System.out.println(orderRequest1);
        System.out.println("<OrderRequestRetriever> - End");

        return orderRequest1;
    }
}
