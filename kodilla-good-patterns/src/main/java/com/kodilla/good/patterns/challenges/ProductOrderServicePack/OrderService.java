package com.kodilla.good.patterns.challenges.ProductOrderServicePack;

import java.time.LocalDateTime;

public interface OrderService {

    public boolean ordered(User user, LocalDateTime orderTime, Product product);


}
