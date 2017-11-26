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

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;

        Triangle triangle = (Triangle) o;

        if (base != null ? !base.equals(triangle.base) : triangle.base != null) return false;
        return height != null ? height.equals(triangle.height) : triangle.height == null;
    }

    @Override
    public int hashCode () {
        int result = base != null ? base.hashCode() : 0;
        result = 31 * result + (height != null ? height.hashCode() : 0);
        return result;
    }
}
