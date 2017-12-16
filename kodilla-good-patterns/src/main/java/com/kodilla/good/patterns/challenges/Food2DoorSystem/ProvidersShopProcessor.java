package com.kodilla.good.patterns.challenges.Food2DoorSystem;

import java.time.LocalDateTime;

public class ProvidersShopProcessor implements ProvidersProcessor {


        public boolean process (int shopNr, String orderId, User user, LocalDateTime orderTime,
                            ProductProvider productProvider, OrderSet orderSet) {
        boolean result, result1, orderValidation;
        MainExecutionSystem exSysShop;

        String text1 = "<ProvidersShop" + shopNr + "Processor> - Start";
        System.out.println("\n" + text1);

        String thisProdProvName = "Shop";
            thisProdProvName = thisProdProvName.concat(Integer.toString(shopNr));
        System.out.println("thisProdProvName: " + thisProdProvName);
        if (thisProdProvName.equals(productProvider.getName())) {
            result1 = true;
            System.out.println("Provider " + thisProdProvName + " confirmed order " + orderId + " and started to execute it");
        } else {
            result1 = false;
            System.out.println();
            System.out.println("Order " + orderId + " was faulty sent to provider " + thisProdProvName);
        }
        System.out.println("result1: " + result1);

            switch (shopNr) {
                case 1:
                    exSysShop = new MainExecutionSystemShop1();
                    break;
                case 2:
                    exSysShop = new MainExecutionSystemShop2();
                    break;
                case 3:
                    exSysShop = new MainExecutionSystemShop3();
                    break;
                default:
                    throw new IllegalArgumentException("Invalid productProvider name : " + "Shop" + shopNr);
            }

            orderValidation = exSysShop.mainSystemOrderProcess(orderId, user, productProvider, orderSet);

            System.out.println("orderValidation: " + orderValidation);

        result = result1 && orderValidation;

        System.out.println("result: " + result);
        System.out.println("\n" + "<ProvidersShop1Processor> - End");
        return result;

    }

}