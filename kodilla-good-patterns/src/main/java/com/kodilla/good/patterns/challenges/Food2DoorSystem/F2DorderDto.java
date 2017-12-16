package com.kodilla.good.patterns.challenges.Food2DoorSystem;

public class F2DorderDto {

    private User user;
    private ProductProvider productProvider;
    private boolean isOrdered;
    private String orderId;

    public F2DorderDto (User user, ProductProvider productProvider, boolean isOrdered, String orderId) {
        this.user = user;
        this.productProvider = productProvider;
        this.isOrdered = isOrdered;
        this.orderId = orderId;
    }

    public User getUser () {
        return user;
    }

    public ProductProvider getProductProvider () {
        return productProvider;
    }

    public boolean isOrdered () {
        return isOrdered;
    }

    public String getOrderId () {
        return orderId;
    }

    @Override
    public String toString () {
        return "F2DorderDto{" +
                "user=" + user +
                ", productProvider=" + productProvider +
                ", isOrdered=" + isOrdered +
                ", orderId='" + orderId + '\'' +
                '}';
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (!(o instanceof F2DorderDto)) return false;

        F2DorderDto that = (F2DorderDto) o;

        return getOrderId() != null ? getOrderId().equals(that.getOrderId()) : that.getOrderId() == null;
    }

    @Override
    public int hashCode () {
        return getOrderId() != null ? getOrderId().hashCode() : 0;
    }
}
