package com.kodilla.good.patterns.challenges.Food2DoorSystem;

import java.time.LocalDateTime;

public class ProvidersShop2Processor  extends ProvidersShopProcessor {

    @Override
    protected MainExecutionSystem createMainExecutionSystemShop () {
        MainExecutionSystem mainExecutionSystem = new MainExecutionSystemShop2();
        return mainExecutionSystem;
    }

    @Override
    protected String getThisProdProvName() {
        return "Shop2";
    }
}