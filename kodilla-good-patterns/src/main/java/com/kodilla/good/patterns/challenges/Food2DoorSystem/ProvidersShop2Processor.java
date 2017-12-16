package com.kodilla.good.patterns.challenges.Food2DoorSystem;

import java.time.LocalDateTime;

public class ProvidersShop2Processor  implements ProvidersProcessor {

    boolean result;

    ProvidersShopProcessor provShopProc =  new ProvidersShopProcessor();

    public boolean  process (int shopNr,  String orderId, User user, LocalDateTime orderTime,
                             ProductProvider productProvider, OrderSet orderSet){

        return provShopProc.process (2 , orderId, user, orderTime,
                productProvider, orderSet);
    }

}