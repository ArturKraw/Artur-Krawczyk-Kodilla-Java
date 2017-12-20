package com.kodilla.good.patterns.challenges.Food2DoorSystem;

public class OrderTransferToProviderShop1 extends  OrderTransferToProviders{


    @Override
    protected ProvidersProcessor getThisProvidersProcess () {
        ProvidersProcessor  providersProcess = new ProvidersShop1Processor();

        return providersProcess;
    }
}
