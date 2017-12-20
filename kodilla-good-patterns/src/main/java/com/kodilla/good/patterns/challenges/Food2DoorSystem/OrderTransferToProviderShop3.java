package com.kodilla.good.patterns.challenges.Food2DoorSystem;

public class OrderTransferToProviderShop3 extends  OrderTransferToProviders{

    //@Override
    protected ProvidersProcessor getThisProvidersProcess () {

        ProvidersProcessor providersProcess = new ProvidersShop3Processor();

        return providersProcess;
    }
}
