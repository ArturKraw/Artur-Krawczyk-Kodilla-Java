package com.kodilla.testing.shape;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.*;



    public class ShapeCollectorTestSuite {
       private static int testCounter = 0;

        public ShapeCollector PrepareShapeCollector() {

            Shape shape1 = new Circle(10.0);

            ShapeCollector shapeCollector = new  ShapeCollector();
            shapeCollector.addFigure(shape1);

            return shapeCollector;
        }


        @BeforeClass
        public static void beforeAllTests () {
            System.out.println("This is the begining for tests.");
        }

        @AfterClass
        public static void afterAllTests () {
            System.out.println("All tests are finished.");
        }

        @Before
        public void beforeEveryTest () {
            testCounter++;
            System.out.println("Preparing to execute test #" + testCounter);
        }

        @Test
        public void testAddFigure (Shape shape) {
            //Given

            Shape thisShape = (thisFigure, thisField);
            //ArrayList<Shape> shapeCollector = new ArrayList<Shape> ();

            //When
            ShapeCollector.addFigure(thisShape);
            //Then
            Double theField=10.0;
            String theFigure="circle";
            Shape theShape = (theFigure, theField);
            Assert.assertEquals(theShape, shapeCollector.getShape());
        }
        @Test
        public void testRemoveFigure() {
            //Given

            //When

            //Then

        }

        @Test
        public void testGetFigure() {
            //Given

            //When

            //Then

        }

        @Test
        public void testShowFigures() {
            //Given

            //When

            //Then

        }


    }
