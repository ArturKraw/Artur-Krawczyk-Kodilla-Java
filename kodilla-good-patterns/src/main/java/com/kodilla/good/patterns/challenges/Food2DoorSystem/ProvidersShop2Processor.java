package com.kodilla.good.patterns.challenges.Food2DoorSystem;

import java.time.LocalDateTime;

public class ProvidersShop2Processor implements ProvidersProcessor {


    public boolean process (String orderId, User user, LocalDateTime orderTime,
                            ProductProvider productProvider, OrderSet orderSet) {
        boolean result, result1;

        System.out.println("\n" + "<ProvidersShop2Processor> - Start");

        String thisProdProvName = "Shop2";
        if (thisProdProvName.equals(productProvider.getName())) {
            result1 = true;
            System.out.println("Provider " +  thisProdProvName + " confirmed order " + orderId + " and started to execute it");
        } else {
            result1 = false;
            System.out.println("Order " + orderId + " was faulty sent to provider " +  thisProdProvName);
        }
        System.out.println("result1: " + result1);

        MainExecutionSystemShop2 exSysShop2 = new MainExecutionSystemShop2();
        boolean orderValidation = exSysShop2.mainSystemOrderProcess(orderId, user, productProvider, orderSet);

        System.out.println("orderValidation: " + orderValidation);

        if (result1==true && orderValidation==true) {
            result = true;
        } else {
            result = false;
        }
        System.out.println("result: " + result);
        System.out.println("\n" + "<ProvidersShop2Processor> - End");
        return result;
    }
}