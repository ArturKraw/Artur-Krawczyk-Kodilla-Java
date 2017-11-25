package com.kodilla.testing.shape;

public class Square implements Shape {
    private Double side;

    public Square (Double side) {
        this.side = side;
    }

    //@Override
    public String getShapeName () {
        return "square";
    }

    //@Override
    public Double getField () {
        return (side*side);
    }
    public String toString(){
        return (getShapeName() + " (side: = " + side + ") -> field: " + String.format("%.2f",getField()));
    }

}
