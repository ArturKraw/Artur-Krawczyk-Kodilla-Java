package com.kodilla.testing.shape;

public class Square {

    private String shapeName = "square";
    private Double field;

    public Circle (String shapeName, Double field ) {
        this.shapeName = shapeName;
        this.field=field;
    }

    @Override
    public String getShapeName () {
        return "square";
    }

    @Override
    public Double getField () {
        return field;
    }
}
