package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    private ArrayList<Integer> array2 = new ArrayList<Integer>();
    private ArrayList<Integer> array = new ArrayList<Integer>();

    public OddNumbersExterminator() {
    }

    public ArrayList<Integer> getArray() {
       return array;
    }
    public ArrayList<Integer> getArray2() {
        return array2;
    }

    public ArrayList<Integer> exterminate (ArrayList<Integer> array) {
        this.array = array;

        switch (array.size()) {
            case (0):
                break;
            default:
                for (int i = 0; i < array.size(); i++) {
                    if (array.get(i) % 2 == 0) {
                        array2.add(array.get(i));
                    }
                }
        }
        return getArray2();

    }

    public ArrayList<Integer> getExterminate() {
        return array2;
    }


}