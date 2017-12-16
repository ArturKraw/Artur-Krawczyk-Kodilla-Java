package com.kodilla.good.patterns.challenges.Food2DoorSystem;

import java.time.LocalDateTime;

public class ProvidersShop1Processor implements ProvidersProcessor {


     public boolean process (String orderId, User user, LocalDateTime orderTime,
                            ProductProvider productProvider, OrderSet orderSet){
        boolean result, result1;

        System.out.println("\n" + "<ProvidersShop1Processor> - Start");

        String thisProdProvName = "Shop1";
         if (thisProdProvName.equals(productProvider.getName())){
             result1 = true;
            System.out.println("Provider " +  thisProdProvName + " confirmed order " + orderId + " and started to execute it");
         } else {
            result1 = false;
            System.out.println( );
            System.out.println("Order " + orderId + " was faulty sent to provider " +  thisProdProvName);
         }
        System.out.println("result1: " + result1);

         MainExecutionSystemShop1 exSysShop1 = new MainExecutionSystemShop1();
         boolean orderValidation = exSysShop1.mainSystemOrderProcess(orderId, user, productProvider, orderSet);

        System.out.println("orderValidation: " + orderValidation);

        if (result1==true && orderValidation==true) {
            result = true;
        } else {
            result = false;
        }
            System.out.println("result: " + result);
        System.out.println("\n" + "<ProvidersShop1Processor> - End");
        return result;
    }
}
