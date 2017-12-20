package com.kodilla.good.patterns.challenges.Food2DoorSystem;

import java.time.LocalDateTime;

public class ProvidersShop1Processor extends ProvidersShopProcessor {

   @Override
    protected MainExecutionSystem createMainExecutionSystemShop () {
        MainExecutionSystem mainExecutionSystem = new MainExecutionSystemShop1();
        return mainExecutionSystem;
    }
    @Override
    protected String getThisProdProvName() {
        return "Shop1";
    }

}




