package com.kodilla.good.patterns.challenges.Food2DoorSystem;

public class F2DProductOrderService {
    F2DProdOrderService f2DProdOrderService;

    public void productOrderService(){
        System.out.println("\n" + "<F2D-ProductOrderService> - Start");
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductProvider getProductProvider;

        switch (orderRequest.getProductProvider().getName()){
            case("Shop1"):
                f2DProdOrderService = new F2DProdOrderServiceShop1();
                break;
            case("Shop2"):
                f2DProdOrderService = new F2DProdOrderServiceShop2();
                break;
            case("Shop3"):
                f2DProdOrderService = new F2DProdOrderServiceShop3();
                break;

        }


        F2DOrderProcessor orderProcessor = new F2DOrderProcessor
                (new F2DMailInformationService(), f2DProdOrderService, new F2DOrderRepository());

        orderProcessor.orderProcessF2D (orderRequest);

        System.out.println("\n" + "Summary of product order action: ");
        System.out.println(orderRequest.getUser());
        System.out.println(orderRequest.getOrderTime());
        System.out.println(orderRequest.getProductProvider());
        System.out.println(orderRequest.getOrderSet());
        System.out.println("<F2D-ProductOrderService> - End");

    }

}
