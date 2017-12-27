package com.kodilla.patterns.strategy.social.publishers;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class TwitterPublisher implements SocialPublisher {

    @Override
    public String share() {
        //System.out.println("TwitterPublisher");
        return " TwitterPublisher] and interact through Twitter";
    }
}
