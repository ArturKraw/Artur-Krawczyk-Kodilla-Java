package com.kodilla.good.patterns.challenges.Food2DoorSystem;

import java.time.LocalDateTime;

public class OrderTransferToProviders {
    private ProvidersProcessor providersProcess;
    Boolean result = false;
    Boolean result1;
    Boolean result2;
    Boolean result3;

    public boolean orderTransferOperation (String orderId, User user, LocalDateTime orderTime,
                            ProductProvider productProvider, OrderSet orderSet) {


        switch (productProvider.getName()) {
            case "Shop1":
                ProvidersProcessor providersProcess1 = new ProvidersShop1Processor();
                result1 = providersProcess1.process(orderId, user, orderTime,
                        productProvider, orderSet);
                break;
            case "Shop2":
                ProvidersProcessor providersProcess2 = new ProvidersShop2Processor();
                result2 = providersProcess2.process(orderId, user, orderTime,
                        productProvider, orderSet);
                break;
            case "Shop3":
                ProvidersProcessor providersProcess3 = new ProvidersShop3Processor();
                result3 = providersProcess3.process(orderId, user, orderTime,
                        productProvider, orderSet);
                break;
            default:
                throw new IllegalArgumentException("Invalid productProvider name : " + productProvider);
        }
        if (result1 != null) {
            result = result1;
            System.out.println("1-result: " + result);
        } else {
            if (result2 != null) {
                result = result2;
                System.out.println("2-result: " + result);
            } else {
                if (result3 != null) {
                    result = result3;
                    System.out.println("3-result: " + result);
                } else {
                    System.out.println("Somethig went wrong. Please check the program");
                }

            }
        }

        return result;
    }
}