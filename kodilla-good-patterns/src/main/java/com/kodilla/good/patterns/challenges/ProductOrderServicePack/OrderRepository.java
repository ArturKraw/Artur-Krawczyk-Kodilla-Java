package com.kodilla.good.patterns.challenges.ProductOrderServicePack;

import java.time.LocalDateTime;

public interface OrderRepository {

    public boolean createOrder(User user, LocalDateTime orderTime, Product product);


 }