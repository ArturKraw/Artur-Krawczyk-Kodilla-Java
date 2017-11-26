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

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;

        Circle circle = (Circle) o;

        return ray != null ? ray.equals(circle.ray) : circle.ray == null;
    }

    @Override
    public int hashCode () {
        return ray != null ? ray.hashCode() : 0;
    }
}
