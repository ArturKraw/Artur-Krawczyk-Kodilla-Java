package com.kodilla.good.patterns.challenges.Food2DoorSystem;

import java.util.HashMap;

public class OrderSet {
    private final HashMap orderSet;

    public OrderSet (HashMap orderSet) {
        this.orderSet = orderSet;
    }

    public HashMap getOrderSet () {
        return orderSet;
    }

    @Override
    public String toString () {
        return "OrderSet{" +
                "OrderSet=" + orderSet +
                '}';
    }
}
