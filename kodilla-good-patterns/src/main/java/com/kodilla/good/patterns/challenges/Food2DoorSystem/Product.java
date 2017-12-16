package com.kodilla.good.patterns.challenges.Food2DoorSystem;

public class Product {
    private String productName;
    private double unitPrice;

    public Product (String productName, double unitPrice) {
        this.productName = productName;
        this.unitPrice = unitPrice;
    }

    public String getProductName () {
        return productName;
    }

    public double getUnitPrice () {
        return unitPrice;
    }

    @Override
    public String toString () {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", unitPrice=" + unitPrice +
                '}';
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;

        Product product = (Product) o;

        if (Double.compare(product.getUnitPrice(), getUnitPrice()) != 0) return false;
        return getProductName() != null ? getProductName().equals(product.getProductName()) : product.getProductName() == null;
    }

    @Override
    public int hashCode () {
        int result;
        long temp;
        result = getProductName() != null ? getProductName().hashCode() : 0;
        temp = Double.doubleToLongBits(getUnitPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
