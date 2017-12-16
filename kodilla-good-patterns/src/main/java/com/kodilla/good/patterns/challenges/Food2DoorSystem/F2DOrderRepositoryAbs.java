package com.kodilla.good.patterns.challenges.Food2DoorSystem;

import java.time.LocalDateTime;

public abstract class F2DOrderRepositoryAbs {

    public boolean chequeCreateOrder (String orderId, User user,
                                      ProductProvider productProvider,
                                      LocalDateTime orderTime, OrderSet orderSet) {
        boolean result = true;

        return result;
    }

    public abstract boolean checkRemoveOrder ();

    public abstract void createOrder ();

    public abstract void removeOrder ();
}
