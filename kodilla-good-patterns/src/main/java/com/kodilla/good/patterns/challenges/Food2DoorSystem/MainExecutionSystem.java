package com.kodilla.good.patterns.challenges.Food2DoorSystem;

import java.util.HashMap;

interface MainExecutionSystem {

    boolean mainSystemOrderProcess(String orderId, User user, ProductProvider productProvider, OrderSet orderSet);
}

