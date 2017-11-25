package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private int n;
    private Shape resultRemoving;
    public int endsize;

    //shapeCollector = new ShapeCollector();
    ArrayList<Shape> shapeCollector = new ArrayList<Shape>();


    public int getSizeA () {
       return shapeCollector.size();
    }



    public ArrayList<Shape> addFigure (Shape shapeA) {
        //if (shapeCollector.contains(shapeA)) {
        //    System.out.println("Shape: " + shapeA + " already exist i this collection. Can't add a duplicate.");;
        // }else{
       shapeCollector.add(shapeA);
        //}
        System.out.println("Nr of shapes in collection after added one shape in addFigure = " + shapeCollector.size());
        return shapeCollector;
    }

    public ArrayList<Shape> getShapeCollector () {
        return shapeCollector;
    }

    public Shape removeFigure (Shape shapeB) {
        //Shape resultRemoving;
        int initsize = shapeCollector.size();

        System.out.println("Collection of " + initsize + " figures");

        if (shapeCollector.isEmpty()){
            System.out.println("Empty collection !" + shapeCollector.size());
            resultRemoving = null;
        } else {
            if (shapeCollector.contains(shapeB)){
                shapeCollector.remove(shapeB);
                endsize = shapeCollector.size();
                System.out.println("initsize: " + initsize + " endsize: " +  endsize);
                if (initsize == 1 + endsize ) {
                    resultRemoving = shapeB;
                    System.out.println("1Shape: " + resultRemoving + " found and removed from this collection (size: " + endsize +")");
                    return resultRemoving;
                } else {
                System.out.println("2Shape: " + shapeB + " found but probably not removed from this collection.");
                resultRemoving = null;
                }
            } else {
                System.out.println("3Shape: " + shapeB + " not found in this collection. Impossible to remove it.");
                resultRemoving = null;
            }
            System.out.println("4Shape: " + resultRemoving + " found and removed from this collection (size: " + endsize + ")");

        }
        System.out.println("5Shape: " + resultRemoving + " found and removed from this collection (size: " + endsize +")");
        return resultRemoving;
    }


    public Shape getResultRemoving () {
        return resultRemoving;
    }

    public Shape getFigure(int n){
        this.n=n;
        shapeCollector.get(n);
        return shapeCollector.get(n);
    }

    public int showFigures(){
        System.out.println("List of shapes: " );
        Integer shapesNr = shapeCollector.size();
        System.out.println(shapesNr + " shapes in collection");
        int i;
        for (i=0; i< shapesNr; i++) {
            System.out.println("Shape nr " + i + ": " + shapeCollector.get(i));
        }
        return i;
    }

}
