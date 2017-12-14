package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface InformationService {

    public void inform(User user, LocalDateTime orderTime, Product product);

}
