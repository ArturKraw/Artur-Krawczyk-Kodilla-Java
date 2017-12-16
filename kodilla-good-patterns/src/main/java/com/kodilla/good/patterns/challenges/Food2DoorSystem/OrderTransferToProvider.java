package com.kodilla.good.patterns.challenges.Food2DoorSystem;

import java.time.LocalDateTime;

public interface OrderTransferToProvider {

    boolean ordered(String orderId, User user,
                           LocalDateTime orderTime, ProductProvider productProvider, OrderSet orderSet);
}