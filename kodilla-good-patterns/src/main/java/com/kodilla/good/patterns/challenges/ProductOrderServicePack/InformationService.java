package com.kodilla.good.patterns.challenges.ProductOrderServicePack;

import java.time.LocalDateTime;

public interface InformationService {

    public void inform(User user, LocalDateTime orderTime, Product product);

}
