package com.kodilla.good.patterns.challenges.Food2DoorSystem;

import java.time.LocalDateTime;

class OrderTransferToProviders {
    private ProvidersProcessor providersProcess;

    boolean orderTransferOperation (String orderId, User user, LocalDateTime orderTime,
                            ProductProvider productProvider, OrderSet orderSet) {
        Boolean result;
        ProvidersProcessor providersProcess;
        int shopNr;

        switch (productProvider.getName()) {
            case "Shop1":
                providersProcess = new ProvidersShop1Processor();
                shopNr =1;
                break;
            case "Shop2":
                providersProcess = new ProvidersShop2Processor();
                shopNr = 2;
                break;
            case "Shop3":
                providersProcess = new ProvidersShop3Processor();
                shopNr = 3;
                break;
            default:
                throw new IllegalArgumentException("Invalid productProvider name : " + productProvider);
        }
        result = providersProcess.process(shopNr, orderId, user, orderTime,
                productProvider, orderSet);

        System.out.println("result: " + result);

        return result;
    }
}