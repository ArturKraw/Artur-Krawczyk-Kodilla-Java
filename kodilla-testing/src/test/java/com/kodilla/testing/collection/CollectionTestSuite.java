package com.kodilla.testing.collection;

import java.util.*;
import java.util.ArrayList;
import java.lang.*;
import java.io.*;
import java.time.*;

import com.sun.org.apache.xpath.internal.operations.String;
import org.junit.*;

public class CollectionTestSuite {
    private int sizeNumbers;

    public int getEvenNrNumbers() {
        return evenNrNumbers;
    }
    public Integer getLastEvenNumber() {
        return lastEvenNumber;
    }

    public ArrayList<Integer> numbers = new ArrayList<Integer>();
        int evenNrNumbers = 0;
        int lastEvenNumber = 0;

    public void setSizeNumbers(int sizeNumbers) {
        this.sizeNumbers = sizeNumbers;

        for (int i = 0; i < sizeNumbers; i++) {
            numbers.add(i + 5);
            if (((i + 4) % 2) == 0) {
                evenNrNumbers++;
                lastEvenNumber = numbers.get(i);
            }
        }
    }

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> numbers = new ArrayList<Integer>(sizeNumbers); //main array
        OddNumbersExterminator oddNumbExt = new OddNumbersExterminator();
        oddNumbExt.exterminate(numbers);
        // When
        setSizeNumbers(0);
        //Then
        Assert.assertEquals (0, oddNumbExt.getSizeArray2());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> numbers = new ArrayList<Integer>(sizeNumbers); //main array
        OddNumbersExterminator oddNumbExt = new OddNumbersExterminator();
        oddNumbExt.exterminate(numbers);
        //When
        sizeNumbers = 100;

        //Then
        Assert.assertEquals (evenNrNumbers, oddNumbExt.getSizeArray2());

    }
}