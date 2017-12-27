package com.kodilla.patterns.strategy.customer.predictors;

import com.kodilla.patterns.strategy.customer.BuyPredictor;

public class BalancedPredictor implements BuyPredictor {
    @Override
    public String predictWhatToBuy() {
        return "[Balanced predictor] Buy shared units of Fund XYZ";
    }


}
