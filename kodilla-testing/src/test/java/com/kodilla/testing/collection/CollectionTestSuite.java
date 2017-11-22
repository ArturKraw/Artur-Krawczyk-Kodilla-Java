package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.lang.*;

//import com.sun.org.apache.xpath.internal.operations.String;
import org.junit.*;

public class CollectionTestSuite {
    private int sizeNumbers;
    private int numbersSize=0;

    public ArrayList<Integer> collectionTestSuite (int numbersSize) {
        this.numbersSize=numbersSize;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < numbersSize; i++) {
            numbers.add(i + 3);
        }
        return numbers;
    }

    public int getNumbersSize () {
        return numbersSize;
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
        OddNumbersExterminator oddNumbExt = new OddNumbersExterminator();
        // When
        int a =0;
        oddNumbExt.exterminate(collectionTestSuite(a));
        //Then
        Assert.assertEquals (0, oddNumbExt.getSizeArray2());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        // Given
        OddNumbersExterminator oddNumbExt = new OddNumbersExterminator();
        //When
        int a = 101;
        oddNumbExt.exterminate(collectionTestSuite(a));
        //Then
        int evenNr = getNumbersSize()/2;
        Assert.assertEquals (evenNr , oddNumbExt.getSizeArray2());
    }

}