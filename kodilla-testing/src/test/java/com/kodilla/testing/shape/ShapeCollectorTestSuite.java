package com.kodilla.testing.shape;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.*;

import java.util.ArrayList;


public class ShapeCollectorTestSuite {
    private static int testCounter = 0;


    public ShapeCollector prepareShapeCollector () {

        Shape shape1 = (Shape) new Circle(10.0);
        Shape shape2 = (Shape) new Square(5.0);
        Shape shape3 = (Shape) new Triangle(4.0, 3.0);
        Shape shape4 = (Shape) new Circle(5.0);
        Shape shape5 = (Shape) new Square(3.0);
        Shape shape6 = (Shape) new Triangle(2.0, 1.0);

        ShapeCollector shapeCollector = new ShapeCollector();

        shapeCollector.addFigure(shape1);
        shapeCollector.addFigure(shape2);
        shapeCollector.addFigure(shape3);
        shapeCollector.addFigure(shape4);
        shapeCollector.addFigure(shape5);
        shapeCollector.addFigure(shape6);

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
            System.out.println("\n" + "Preparing to execute test #" + testCounter);
        }

        @Test
        public void testAddFigure () {
            //Given
            ShapeCollector shapeCollector = new  ShapeCollector();
            shapeCollector = prepareShapeCollector();
            System.out.println("Nr of shapes in testAddFigure = " + shapeCollector.getSizeA());
            Shape thisShape1 = (Shape) new Circle(6.0);
            //When
            shapeCollector.addFigure(thisShape1);
            //Then
            System.out.println("Nr of shapes after adding one shape in this test = " + shapeCollector.getSizeA());
            Assert.assertEquals( 7 , shapeCollector.getSizeA() );
        }

        @Test
        public void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new  ShapeCollector();
            shapeCollector = prepareShapeCollector();
            System.out.println("Nr of shapes in testRemoveFigure = " + shapeCollector.getSizeA());
            Shape thisShape1 = (Shape) new Circle(5.0);

            //When
            Shape resultRemoving = null;
            Shape selectedFigure = thisShape1;
            System.out.println("Shapes to be removed: " + selectedFigure);
            shapeCollector.removeFigure(thisShape1);

            //Then
            Assert.assertEquals(thisShape1 , shapeCollector.getResultRemoving());
        }

        @Test
        public void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new  ShapeCollector();
            shapeCollector = prepareShapeCollector();
            //shapeCollector.showFigures();
            System.out.println("Nr of shapes in testGetFigure = " + shapeCollector.getSizeA());

            //When
            Shape thisShape = (Shape) new Square(5.0);

            //Then
            System.out.println("Shape to be selected = " + thisShape);
            System.out.println("Shape selected = " + shapeCollector.getFigure(1));
            Assert.assertEquals( thisShape , shapeCollector.getFigure(1) );
        }


        @Test
        public void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new  ShapeCollector();
            shapeCollector = prepareShapeCollector();
            System.out.println("Nr of shapes in testShowFigures = " + shapeCollector.getSizeA());

            //When
            int b = shapeCollector.showFigures();

            //Then
            Assert.assertEquals(6, b);
        }


    }
