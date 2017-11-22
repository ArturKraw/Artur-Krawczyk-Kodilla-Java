package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    private ArrayList<Integer> array = new ArrayList<Integer>();
    private ArrayList<Integer> array2 = new ArrayList<Integer>();
    private int sizeArray2;

    public void OddNumbersExterminator (){
    }

    public void exterminate (ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            if ((array.get(i) % 2) == 0) {
                array2.add(array.get(i));
            }
        }
    }

    public int getSizeArray2 () {
        return array2.size();
    }

    public ArrayList<Integer> getArray2() {
        return array2;
    }
}