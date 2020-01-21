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
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        Shape square = new Square(5);
        Shape triangle = new Triangle(3,5);
        Shape circle = new Circle(18);

        //When
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);

        //Then
        Assert.assertEquals(triangle, shapeCollector.getFigure(1));
    }

    @Test
    public void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        Shape square = new Square(5);
        Shape triangle = new Triangle(3,5);
        Shape circle = new Circle(18);

        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);

        //When
        shapeCollector.removeFigure(triangle);
        //Then

        Assert.assertEquals(circle, shapeCollector.getFigure(1));
    }

    @Test
    public void testGetFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        Shape square = new Square(5);
        Shape triangle = new Triangle(3,5);
        Shape circle = new Circle(18);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        //When
        Shape figure = shapeCollector.getFigure(1);
        //Then
        Assert.assertEquals(triangle, figure);
    }

    @Test
    public void testShowFigures(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        Shape square = new Square(5);
        Shape triangle = new Triangle(3,5);
        Shape circle = new Circle(18);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);

        //When
        String figure = shapeCollector.showFigures(shapeCollector.getFigure(1));

        //Then
        Assert.assertEquals("Triangle o polu 7.5", figure);

    }

}
