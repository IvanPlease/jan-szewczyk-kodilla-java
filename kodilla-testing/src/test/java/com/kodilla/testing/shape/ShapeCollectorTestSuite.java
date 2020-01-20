package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddingFigure(){
        ShapeCollector shapeCollector = new ShapeCollector();

        Shape square = new Square(5);
        Shape triangle = new Triangle(3,5);
        Shape circle = new Circle(18);

        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);

        Assert.assertEquals(triangle, shapeCollector.getFigure(1));
    }

    @Test
    public void testRemoveFigure(){
        ShapeCollector shapeCollector = new ShapeCollector();

        Shape square = new Square(5);
        Shape triangle = new Triangle(3,5);
        Shape circle = new Circle(18);

        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);

        shapeCollector.removeFigure(triangle);

        Assert.assertEquals(circle, shapeCollector.getFigure(1));
    }

    @Test
    public void testGetFigure(){
        ShapeCollector shapeCollector = new ShapeCollector();

        Shape square = new Square(5);
        Shape triangle = new Triangle(3,5);
        Shape circle = new Circle(18);

        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);

        Assert.assertEquals(triangle, shapeCollector.getFigure(1));
    }

    @Test
    public void testShowFigures(){
        ShapeCollector shapeCollector = new ShapeCollector();

        Shape square = new Square(5);
        Shape triangle = new Triangle(3,5);
        Shape circle = new Circle(18);

        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);

        Assert.assertEquals("Triangle o polu 7.5", shapeCollector.showFigures(shapeCollector.getFigure(1)));

    }

}
