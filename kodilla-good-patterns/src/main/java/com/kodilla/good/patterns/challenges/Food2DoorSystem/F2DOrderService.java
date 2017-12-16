package com.kodilla.good.patterns.challenges.Food2DoorSystem;

import java.time.LocalDateTime;

public interface F2DOrderService {

    boolean ordered(String orderId, User user, LocalDateTime orderTime, ProductProvider productProvider, OrderSet orderSet);
}
