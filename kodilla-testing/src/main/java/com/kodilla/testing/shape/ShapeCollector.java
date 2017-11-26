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
        //System.out.println("Nr of shapes in collection after added one shape in addFigure = " + shapeCollector.size());
        return shapeCollector;
    }

    public ArrayList<Shape> getShapeCollector () {
        return shapeCollector;
    }

    public Shape removeFigure (Shape shapeB) {
        //Shape resultRemoving;
        int initsize = shapeCollector.size();

        if (shapeCollector.isEmpty()){
            System.out.println("Empty collection !" + shapeCollector.size() + "  Not possible to remove something!");
            resultRemoving = null;
        } else {
            if (shapeCollector.contains(shapeB)){
                shapeCollector.remove(shapeB);
                endsize = shapeCollector.size();

                if (initsize == 1 + endsize ) {
                    resultRemoving = shapeB;
                    System.out.println("Shape: " + resultRemoving + " found and removed from this collection (size: " + endsize +")");
                    return resultRemoving;
                } else {
                System.out.println("Shape: " + shapeB + " found but probably not removed from this collection.");
                resultRemoving = null;
                }
            } else {
                System.out.println("Shape: " + shapeB + " not found in this collection. Impossible to remove it.");
                resultRemoving = null;
            }
        }
        System.out.println("Collection size (initial: " + initsize + " , end: " +  endsize + ")");
        return resultRemoving;
    }


    public Shape getResultRemoving () {
        return resultRemoving;
    }

    public Shape getFigure(int n){
        //this.n=n;
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
