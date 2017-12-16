package com.kodilla.good.patterns.challenges.Food2DoorSystem;


import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private LocalDateTime orderTime;
    private ProductProvider productProvider;
    private OrderSet orderSet;
    private String orderId;

    OrderRequest (String orderId, User user, LocalDateTime orderTime, ProductProvider productProvider, OrderSet orderSet) {
        this.orderId = orderId;
        this.user = user;
        this.orderTime = orderTime;
        this.productProvider = productProvider;
        this.orderSet = orderSet;
    }
    public String getOrderId () {
        return orderId;
    }

    public User getUser () {
        return user;
    }

    public LocalDateTime getOrderTime () {
        return orderTime;
    }

    public ProductProvider getProductProvider () {
        return productProvider;
    }

    public OrderSet getOrderSet () {
        return orderSet;
    }

    @Override
    public String toString () {
        return "OrderRequest{" +
                " orderId=" + orderId +
                ", user=" + user +
                ", orderTime=" + orderTime +
                ", productProvider=" + productProvider +
                ", orderSet=" + orderSet +
                '}';
    }
}
