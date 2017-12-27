package com.kodilla.patterns.strategy.customer.predictors;

import com.kodilla.patterns.strategy.customer.BuyPredictor;

public class ConservativePredictor implements BuyPredictor {
    @Override
    public String predictWhatToBuy() {
        return "[Conservative predictor] Buy debentures of XYZ";
    }


}
