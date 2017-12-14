package com.kodilla.good.patterns.challenges.ProductOrderServicePack;

public class OrderDto {
    private User user;
    private boolean isOrdered;

    OrderDto (final User user, final boolean isOrdered) {
        this.user = user;
        this.isOrdered = isOrdered;
    }

    public User getUser () {
        return user;
    }

    public boolean getIsOrdered () {
        return isOrdered;
    }

    @Override
    public String toString () {
        return "OrderDto{" +
                "user=" + user +
                ", isOrdered=" + isOrdered +
                '}';
    }
}
