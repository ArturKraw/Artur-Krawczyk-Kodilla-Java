package com.kodilla.good.patterns.challenges.Food2DoorSystem;

import java.time.LocalDateTime;

public abstract class OrderTransferToProviders implements OrderTransferToProvider {
    public ProvidersProcessor providersProcess;

    protected abstract ProvidersProcessor getThisProvidersProcess();

    public boolean orderTransferOperation (String orderId, User user, LocalDateTime orderTime,
                        ProductProvider productProvider, OrderSet orderSet) {

        boolean result = getThisProvidersProcess().process(orderId, user, orderTime, productProvider, orderSet);

        System.out.println("result: " + result);

        return result;
    }
}