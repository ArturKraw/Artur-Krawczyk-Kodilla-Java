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

        //shapeCollector.showFigures();
        return shapeCollector;
    }

    //public ShapeCollector getShapeCollector () {
    //    return shapeCollector;
    //}

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
        public void testAddFigure () {
            //Given
            ShapeCollector shapeCollector = new  ShapeCollector();
            prepareShapeCollector();
            shapeCollector;
            shapeCollector.showFigures();
            System.out.println("Nr of shapes before adding a shape in testAddFigure = " + shapeCollector.getSizeA());
            Shape thisShape1 = (Shape) new Circle(6.0);
            Shape thisShape2 = (Shape) new Square(4.0);
            Shape thisShape3 = (Shape) new Triangle(3.0, 5.0);
           //When
            shapeCollector.addFigure(thisShape1);
            shapeCollector.addFigure(thisShape2);
            shapeCollector.addFigure(thisShape3);
            shapeCollector.showFigures();
            //Then
            System.out.println("Nr of test shapes after adding some shape in this test = " + shapeCollector.getSizeA()+ "\n");
            Assert.assertEquals( 3 , shapeCollector.getSizeA() );
        }


        @Test
        public void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new  ShapeCollector();
            //prepareShapeCollector();
            shapeCollector.showFigures();
            System.out.println("Nr of shapes before adding a shape in testRemoveFigure = " + shapeCollector.getSizeA());
            Shape thisShape1 = (Shape) new Circle(6.0);
            Shape thisShape2 = (Shape) new Square(4.0);
            Shape thisShape3 = (Shape) new Triangle(3.0, 5.0);
            //When
            shapeCollector.addFigure(thisShape1);
            shapeCollector.addFigure(thisShape2);
            shapeCollector.addFigure(thisShape3);
            shapeCollector.showFigures();
            //Then
            System.out.println("Nr of shapes after adding some shapes in this test = " + shapeCollector.getSizeA()+ "\n");
            shapeCollector.showFigures();
            Shape resultRemoving = null;
            Shape selectedFigure = thisShape2;
            System.out.println("Shapes to remove: " + selectedFigure);
            shapeCollector.removeFigure(thisShape2);
            System.out.println("Nr of shapes after adding some shapes in this test = " + shapeCollector.getSizeA()+ "\n");
            shapeCollector.showFigures();
            Assert.assertEquals(thisShape2 , shapeCollector.getResultRemoving());
        }

        @Test
        public void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new  ShapeCollector();
            prepareShapeCollector();
            shapeCollector.showFigures();
            System.out.println("Nr of shapes before adding a shape in testGetFigure = " + shapeCollector.getSizeA());
            Shape thisShape6 = (Shape) new Circle(4.0);
            Shape thisShape7 = (Shape) new Square(2.0);
            Shape thisShape8 = (Shape) new Triangle(2.0, 4.0);
            //When
            shapeCollector.addFigure(thisShape6);
            shapeCollector.addFigure(thisShape7);
            shapeCollector.addFigure(thisShape8);
            shapeCollector.showFigures();
            //Then
            System.out.println("Nr of shapes after adding some shapes in this test = " + shapeCollector.getSizeA()+ "\n");

            Assert.assertEquals( thisShape8 , shapeCollector.getFigure(2) );
        }

        @Test
        public void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new  ShapeCollector();
            //prepareShapeCollector();
            shapeCollector.showFigures();
            System.out.println("Nr of shapes before adding a shape in testShowFigures = " + shapeCollector.getSizeA());
            Shape thisShape4 = (Shape) new Circle(8.0);
            Shape thisShape5 = (Shape) new Square(5.0);
            //When
            shapeCollector.addFigure(thisShape4);
            shapeCollector.addFigure(thisShape5);
            int b = shapeCollector.showFigures();
            System.out.println("Nr of shapes after adding some shapes in this test = " + shapeCollector.getSizeA()+ "\n");
            int collectorSize = shapeCollector.getSizeA();
            //Then
            Assert.assertEquals(2, b);
        }


    }
