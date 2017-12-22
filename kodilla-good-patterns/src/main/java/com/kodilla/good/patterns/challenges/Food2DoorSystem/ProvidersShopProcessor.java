package com.kodilla.good.patterns.challenges.Food2DoorSystem;

import java.time.LocalDateTime;

public abstract class ProvidersShopProcessor implements ProvidersProcessor {
        private boolean result1;

        protected abstract MainExecutionSystem createMainExecutionSystemShop();
        protected abstract String getThisProdProvName();
        public boolean process (String orderId, User user, LocalDateTime orderTime,
                            ProductProvider productProvider, OrderSet orderSet) {

            String text1 = "<ProvidersShop" + "Processor> - Start";
            System.out.println("\n" + text1);

            String thisProdProvName = getThisProdProvName();
            System.out.println("thisProdProvName: " + thisProdProvName);

            if (thisProdProvName.equals(productProvider.getName())) {
                result1 = true;
                System.out.println("Provider " + thisProdProvName + " confirmed receiving order " + orderId + " and started to execute it");
            } else {
                result1 = false;
                System.out.println();
                System.out.println("Order " + orderId + " was faulty sent to provider " + thisProdProvName);
            }
            System.out.println("result1: " + result1);

            MainExecutionSystem exSysShop = createMainExecutionSystemShop();
            boolean orderValidation = exSysShop.mainSystemOrderProcess(orderId, user, productProvider, orderSet);
            System.out.println("orderValidation: " + orderValidation);

            boolean result = result1 && orderValidation;
            System.out.println("result: " + result);
            System.out.println("\n" + "<ProvidersShop1Processor> - End");

            return result;
        }
}
