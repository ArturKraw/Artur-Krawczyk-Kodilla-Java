package com.kodilla.good.patterns.challenges.Food2DoorSystem;

import java.time.LocalDateTime;
import java.util.HashMap;

public class ProvidersShop3Processor implements ProvidersProcessor {

    boolean result;

    ProvidersShopProcessor provShopProc =  new ProvidersShopProcessor();

    public boolean  process (int shopNr,  String orderId, User user, LocalDateTime orderTime,
                             ProductProvider productProvider, OrderSet orderSet){

        return provShopProc.process (3 , orderId, user, orderTime, productProvider, orderSet);
    }

}
