package com.kodilla.testing.shape;

public class Triangle {

    private String shapeName = "triangle";
    private Double field;

    public Circle (String shapeName, Double field ) {
        this.shapeName = shapeName;
        this.field=field;
    }

    @Override
    public String getShapeName () {
        return "triangle";
    }

    @Override
    public Double getField () {
        return field;
    }

}
