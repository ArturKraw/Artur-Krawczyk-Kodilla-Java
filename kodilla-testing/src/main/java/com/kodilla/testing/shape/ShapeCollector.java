package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> shapeCollector = new ArrayList<Shape>();

    public int getSizeA () {
        return shapeCollector.size();
    }

    public ArrayList<Shape> addFigure (Shape shapeA) {
        shapeCollector.add(shapeA);
        return shapeCollector;
    }

    public Shape removeFigure (Shape shapeB) {
        int endsize = 0;
        int initsize = shapeCollector.size();
        Shape resultRemoving;
        if (shapeCollector.isEmpty()) {
            System.out.println("Empty collection !" + shapeCollector.size() + "  Not possible to remove something!");
            resultRemoving = null;
        } else {
            if (!shapeCollector.contains(shapeB)) {
                System.out.println("Shape: " + shapeB + " not found in this collection. Impossible to remove it.");
                resultRemoving = null;
            } else {
                shapeCollector.remove(shapeB);
                endsize = shapeCollector.size();
                resultRemoving = null;
                if (initsize == 1 + endsize) {
                    resultRemoving = shapeB;
                    System.out.println("Shape: " + resultRemoving + " found and removed from this collection (size: " + endsize + ")");
                }
            }
        }
        System.out.println("Collection size (initial: " + initsize + " , end: " + endsize + ")");
        return resultRemoving;
    }

    public Shape getFigure(int n){
        shapeCollector.get(n);
        return shapeCollector.get(n);
    }

    public int showFigures(){
        System.out.println("List of shapes: " );
        int i;
        for (i=0; i< shapeCollector.size(); i++) {
            System.out.println("Shape nr " + i + ": " + shapeCollector.get(i));
        }
        return i;
    }
}
