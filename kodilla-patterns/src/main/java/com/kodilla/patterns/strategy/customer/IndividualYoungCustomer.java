package com.kodilla.patterns.strategy.customer;

import com.kodilla.patterns.strategy.customer.predictors.AggressivePredictor;

public class IndividualYoungCustomer extends Customer {
    public IndividualYoungCustomer(String name) {
        super(name);
        this.buyPredictor = new AggressivePredictor();
    }
}
