package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private Double base;
    private Double height;

    public Triangle (Double base, Double height) {
        this.base=base;
        this.height=height;
    }

    //@Override
    public String getShapeName () {
        return "triangle";
    }

    //@Override
    public Double getField () {
        return ((base*height)/2);
    }
    public String toString(){
        return (getShapeName() + " (base: " + base + ", height: " + height + ") -> field: " + String.format("%.2f",getField()));
    }
}
