package com.kodilla.patterns.strategy.customer.predictors;


import com.kodilla.patterns.strategy.customer.BuyPredictor;

public class AggressivePredictor implements BuyPredictor {
    @Override
    public String predictWhatToBuy() {
        return "[Aggressive predictor] Buy stock of XYZ";
    }


}
