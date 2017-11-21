package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    private ArrayList<Integer> exterminate = new ArrayList<Integer>();
    private ArrayList<Integer> array = new ArrayList<Integer>();
    private ArrayList<Integer> array2 = new ArrayList<Integer>();
    private int sizeArray2; ;

    public OddNumbersExterminator() {
    }

    public void exterminate (ArrayList<Integer> array) {
        this.array = array;
        sizeArray2 = 0;
        switch (array.size()) {
            case (0):
                break;
            default:
                for (int i = 0; i < array.size(); i++) {
                    if (array.get(i) % 2 == 0) {
                        array2.add(array.get(i));
                        sizeArray2 = array2.size();
                    }
                }
        }
    }
    public int getSizeArray2 () {
        return sizeArray2;
    }
    public ArrayList<Integer> getArray() {
        return array;
    }
    public ArrayList<Integer> getArray2() {
        return array2;
    }
}