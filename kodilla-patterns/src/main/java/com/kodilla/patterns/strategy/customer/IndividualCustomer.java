package com.kodilla.patterns.strategy.customer;

import com.kodilla.patterns.strategy.customer.predictors.ConservativePredictor;

public class IndividualCustomer extends Customer {
    public IndividualCustomer(String name) {
        super(name);
        this.buyPredictor = new ConservativePredictor();
    }

}
