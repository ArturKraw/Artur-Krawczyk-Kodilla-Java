package com.kodilla.good.patterns.challenges.Food2DoorSystem;

import java.time.LocalDateTime;
import java.util.HashMap;

public class ProvidersShop3Processor  extends ProvidersShopProcessor {

    @Override
    protected MainExecutionSystem createMainExecutionSystemShop () {
        MainExecutionSystem mainExecutionSystem = new MainExecutionSystemShop3();
        return mainExecutionSystem;
    }
    @Override
    protected String getThisProdProvName() {
        return "Shop3";
    }
}
