package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }
    @After
    public void after() {
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("Test Suite: end");
    }
/*
    @Test
    public void testOddNumbersExterminatorEmptyList() {

        int sizeNumbers = 0;
        ArrayList<Integer> numbers = new ArrayList<Integer>(sizeNumbers); //main array
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>(sizeNumbers); //result of program (exterminate)

        //Given
        int oddNrNumbers =0;
        int evenNrNumbers=0;
        boolean progrCorIndic1 = true;
        System.out.println("List nr 3t: main control parameters: " + "\n  sizeNumbers: " + sizeNumbers + " evenNrNumbers: " + evenNrNumbers + " oddNrNumbers: " + oddNrNumbers);

        if (sizeNumbers != (evenNrNumbers + oddNrNumbers)) {
            progrCorIndic1 = false;
            System.out.println("Error in test program: sizeNumbers != (evenNrNumbers + oddNrNumbers)");
        }

        OddNumbersExterminator oddNumbExt = new OddNumbersExterminator();
        oddNumbExt.exterminate(numbers, evenNumbers);

        //When
        boolean progrCorIndic2 = true;
        if (evenNumbers.size() != evenNrNumbers) {
            progrCorIndic2 = false;
            System.out.println("Something wrong with main program: program =  " + progrCorIndic2);
        }
        //Then

        if (progrCorIndic1 && progrCorIndic2) {
            System.out.println("Test for this program done");
        } else {
            System.out.println("Program needs improvement(s)");
        }
    }
*/
    @Test
    public void testOddNumbersExterminatorNormalList() {

        int sizeNumbers = 10;

        ArrayList<Integer> numbers = new ArrayList<Integer>(sizeNumbers); //main array
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>(sizeNumbers); //result of program (exterminate)
        ArrayList<Integer> subNumbers = new ArrayList<Integer>(sizeNumbers); //check array

        //Given
        System.out.println("List nr 1t: numbers in test");
        for (int i =0 ; i < sizeNumbers ; i=i+1) {
            numbers.add(i + 1 + (i * (i + 3)));
            System.out.println(i + "  " + numbers.get(i));
        }

        int oddNrNumbers =0;
        int evenNrNumbers=0;
        boolean progrCorIndic1 = true;

        //System.out.println("List nr 2t: numbers and control paraameters");
        int k = 0;
        for (int i = 0; i < sizeNumbers; i++) {
            if (numbers.get(i) % 2 == 0) {
                subNumbers.add(numbers.get(i));
                k=k+1;
                evenNrNumbers++;
            } else {
                oddNrNumbers++;
            }
            //System.out.println(i + "  " + numbers.get(i) + "   " + evenNrNumbers + "  " + oddNrNumbers);
        }
        System.out.println("\n" +
                " Main control parameters: " + "\n" +
                "sizeNumbers: " + sizeNumbers + " evenNrNumbers: " + evenNrNumbers + " oddNrNumbers: " + oddNrNumbers);
        if (sizeNumbers != (evenNrNumbers + oddNrNumbers)) {
            progrCorIndic1 = false;
            System.out.println("Error in test program: sizeNumbers != (evenNrNumbers + oddNrNumbers)");
        }

        OddNumbersExterminator oddNumbExt = new OddNumbersExterminator();

            oddNumbExt.exterminate(numbers);


        //When
        System.out.println("List nr " +
                "List nr2: subNumbers (even - test before exterminate) and evenNumbers (even from exterminate)");
        boolean progrCorIndic3 = true;
        for (int n=0; n < subNumbers.size() ; n++) {
            if (subNumbers.get(n)!=evenNumbers.get(n)) {
                progrCorIndic3 = false;
            }
            System.out.println(n + " test: " + subNumbers.get(n) + " main: " + evenNumbers.get(n));
        }


        boolean progrCorIndic2 = true;
        if (evenNumbers.size() != evenNrNumbers) {
            progrCorIndic2 = false;
            System.out.println("Something wrong with main program: program =  " + progrCorIndic2);
        }
        //Then

        if (progrCorIndic1 && progrCorIndic2 && progrCorIndic3){
            System.out.println("Test for this program done");
        } else {
            System.out.println("Program needs improvement(s)");
        }
    }
}
