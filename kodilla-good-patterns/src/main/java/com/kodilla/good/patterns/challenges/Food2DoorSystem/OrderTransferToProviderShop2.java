package com.kodilla.good.patterns.challenges.Food2DoorSystem;

public class OrderTransferToProviderShop2 extends  OrderTransferToProviders{

    //@Override
    protected ProvidersProcessor getThisProvidersProcess () {

        ProvidersProcessor providersProcess = new ProvidersShop2Processor();

        return providersProcess;
    }
}
