package com.kodilla.patterns.strategy.social;

public class User {
    final private String usersName;
    protected SocialPublisher socialPublisher;

    public User (String usersName) {
        this.usersName = usersName;
    }

    public String getUsersName () {
        return usersName;
    }

    public String choose() {
        return socialPublisher.share();
    }

    public void sharePost (SocialPublisher socialPublisher){
        this.socialPublisher = socialPublisher;
    }
}
