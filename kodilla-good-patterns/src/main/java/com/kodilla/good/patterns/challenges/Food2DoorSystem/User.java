package com.kodilla.good.patterns.challenges.Food2DoorSystem;

public class User {
   private final String userId;

    public User (String userId) {
        this.userId = userId;
    }

    public String getUserId () {
        return userId;
    }

    @Override
    public String toString () {
        return "User{" +
                "userId='" + userId + '\'' +
                '}';
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        return getUserId() != null ? getUserId().equals(user.getUserId()) : user.getUserId() == null;
    }

    @Override
    public int hashCode () {
        return getUserId() != null ? getUserId().hashCode() : 0;
    }
}
