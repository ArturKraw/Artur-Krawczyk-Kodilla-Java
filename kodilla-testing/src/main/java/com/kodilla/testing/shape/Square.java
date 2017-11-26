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

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;

        Square square = (Square) o;

        return side != null ? side.equals(square.side) : square.side == null;
    }

    @Override
    public int hashCode () {
        return side != null ? side.hashCode() : 0;
    }
}
