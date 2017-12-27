package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.SnapchatPublisher;

public class ZGeneration extends User {
    public ZGeneration (String usersName) {
        super(usersName);
        this.socialPublisher = new SnapchatPublisher();
    }
}
