package com.kodilla.good.patterns.challenges.Food2DoorSystem;

public class F2DProdOrderServiceShop3  extends F2DProdOrderService{

    @Override
    public OrderTransferToProviders getOrderTransfer() {
        OrderTransferToProviders orderTransfer = new OrderTransferToProviderShop3();

        return orderTransfer;
    }
}
