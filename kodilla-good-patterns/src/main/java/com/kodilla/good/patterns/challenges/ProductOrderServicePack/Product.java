package com.kodilla.good.patterns.challenges.ProductOrderServicePack;

public class Product {
    private String productName;
    private int productQuantity;
    private double productUnitPrice;

    public Product (String productName, int productQuantity, double productUnitPrice) {
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productUnitPrice = productUnitPrice;
    }

    public String getProductName () {
        return productName;
    }

    public int getProductQuantity () {
        return productQuantity;
    }

    public double getProductUnitPrice () {
        return productUnitPrice;
    }

    @Override
    public String toString () {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productQuantity=" + productQuantity +
                ", productUnitPrice=" + productUnitPrice +
                '}';
    }
}
