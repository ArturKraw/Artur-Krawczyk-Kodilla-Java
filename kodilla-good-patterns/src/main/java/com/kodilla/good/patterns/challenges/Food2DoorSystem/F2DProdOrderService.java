package com.kodilla.good.patterns.challenges.Food2DoorSystem;



import java.time.LocalDateTime;

public class F2DProdOrderService implements F2DOrderService{

    public boolean ordered(String orderId, User user, LocalDateTime orderTime, ProductProvider productProvider, OrderSet orderSet){

        System.out.println("\n" + "<F2DProdOrderService> - Start");
        System.out.println("REQUEST number: " + orderId + " (sent at: " + orderTime +") "
                + "\n" + "from: " + user
                + " concerning: " + "\n"
                + orderSet + "to be provided by " + productProvider);
        System.out.println("Changed it's status to: ORDER SEND TO PRODUCT PROVIDER ");

        OrderTransferToProviders orderTransfer = new OrderTransferToProviders();

        Boolean orderConfirmFromProvider = orderTransfer.orderTransferOperation(orderId,
                user, orderTime, productProvider, orderSet);

        System.out.println("orderConfirmFromProvider: " + orderConfirmFromProvider );

        System.out.println("REQUEST number: " + orderId + " (sent at: " + orderTime +") "
                + "\n" + "from: " + user
                + " concerning: " + "\n"
                + orderSet + "to be provided by " + productProvider);
        System.out.println("Changed it's status to: Provider confirmed this ORDER");

        System.out.println("<ProdOrderService> - End");
        return orderConfirmFromProvider;
    }

}
