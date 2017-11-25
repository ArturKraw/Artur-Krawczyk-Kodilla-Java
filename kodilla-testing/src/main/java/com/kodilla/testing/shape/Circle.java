package com.kodilla.testing.shape;

public class Circle implements Shape  {
    private Double ray;

    public Circle (Double ray) {
        this.ray=ray;
    }

    //@Override
    public String getShapeName () {
        return "circle";
    }

    //@Override
    public Double getField() {
       return (Math.PI*ray*ray);
    }

    public String toString(){
        return (getShapeName() + " (ray: " + ray + ") -> field: " + String.format("%.2f",getField()));
    }
}
