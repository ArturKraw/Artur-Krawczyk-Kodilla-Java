package com.kodilla.good.patterns.challenges.Food2DoorSystem;

import java.time.LocalDateTime;

public interface ProvidersProcessor {

    boolean process(int shopNr, String orderId, User user, LocalDateTime orderTime, ProductProvider productProvider, OrderSet orderSet);

}