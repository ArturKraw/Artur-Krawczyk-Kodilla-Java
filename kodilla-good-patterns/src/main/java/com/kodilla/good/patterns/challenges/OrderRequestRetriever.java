package com.kodilla.good.patterns.challenges;

//odpowiednik RentRequestRetriever

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve () {

        User user = new User("Jan", "Nowak" , "JNAA1000WAW");

        LocalDateTime orderTime = LocalDateTime.of(2017, 12, 11, 16, 15);

        Product product = new Product ("LegoSet1", 1, 50.0 );

            return new OrderRequest(user, orderTime, product);


    }
}
