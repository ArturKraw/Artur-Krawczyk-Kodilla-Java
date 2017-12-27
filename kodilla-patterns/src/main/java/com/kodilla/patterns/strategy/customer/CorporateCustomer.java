package com.kodilla.patterns.strategy.customer;

import com.kodilla.patterns.strategy.customer.predictors.BalancedPredictor;

public class CorporateCustomer extends Customer {

    public CorporateCustomer(String name) {
        super(name);
        this.buyPredictor = new BalancedPredictor();
    }
}
