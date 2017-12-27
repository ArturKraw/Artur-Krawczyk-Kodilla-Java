package com.kodilla.patterns.strategy.social.publishers;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class SnapchatPublisher implements SocialPublisher {
    @Override
    public String share() {
        //System.out.println("SocialPublisher");
        return " SnapchatPublisher] and interact through Snapchat";
    }
}
