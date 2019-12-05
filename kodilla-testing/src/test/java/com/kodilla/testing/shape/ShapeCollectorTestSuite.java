package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {
    @BeforeClass
    public static void beforeTests() {
        System.out.println("This is the beginning of tests.");
    }
    @AfterClass
    public static void afterTests() {
        System.out.println("All tests are finished.");
    }

    private static int testCounter = 0;

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddTriangle() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(10,10);
        //when
        shapeCollector.addFigure(triangle);
        //then
        Assert.assertEquals(shapeCollector.getFigure(0),triangle);
    }
    @Test
    public void testAddCircle() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(10);
        //when
        shapeCollector.addFigure(circle);
        //then
        Assert.assertEquals(shapeCollector.getFigure(0),circle);
    }
    @Test
    public void testAddSquare() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(10);
        //when
        shapeCollector.addFigure(square);
        //then
        Assert.assertEquals(shapeCollector.getFigure(0),square);
    }

    @Test
    public void testSquareField(){
        //given
        Square square = new Square(10);
        double resultExpected = 10 * 10;
        //when
        double  resultActual = square.getField();
        //then
        Assert.assertEquals(resultExpected,resultActual,0);
    }

    @Test
    public void testCircleField(){
        //given
        Circle circle = new Circle(10);
        double resultExpected = Math.PI * 10 * 10;
        //when
        double  resultActual = circle.getField();
        //then
        Assert.assertEquals(resultExpected,resultActual, 0);
    }
    @Test
    public void testTriangleField(){
        //given
        Triangle triangle = new Triangle(10,10);
        double resultExpected = ((10 * 10 )/2);
        //when
        double  resultActual = triangle.getField();
        //then
        Assert.assertEquals(resultExpected, resultActual, 0);
    }

    @Test
    public void testRemoveTriangle() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(10,10);
        shapeCollector.addFigure(triangle);
        //when
        boolean result1 = shapeCollector.removeFigure(triangle);
        //then
        Assert.assertTrue(result1);
    }
    @Test
    public void testRemoveCircle() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(10);
        shapeCollector.addFigure(circle);
        //when
        boolean result2 = shapeCollector.removeFigure(circle);
        //then
        Assert.assertTrue(result2);
    }
    @Test
    public void testRemoveSquare() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square(10);
        shapeCollector.addFigure(square);
        //when
        boolean result3 = shapeCollector.removeFigure(square);
        //then
        Assert.assertTrue(result3);
    }
    @Test
    public void testGetTriangle() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangleExpected = new Triangle(10,10);
        shapeCollector.addFigure(triangleExpected);
        //when
        Triangle triangleActual = (Triangle) shapeCollector.getFigure(0);
        //then
        Assert.assertEquals(triangleExpected,triangleActual);
    }
    @Test
    public void testGetCircle() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circleExpected = new Circle(10);
        shapeCollector.addFigure(circleExpected);
        //when
        Circle circleActual = (Circle) shapeCollector.getFigure(0);
        //then
        Assert.assertEquals(circleExpected, circleActual);
    }
    @Test
    public void testGetSquare() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square squareExpected = new Square(10);
        shapeCollector.addFigure(squareExpected);
        //when
        Square squareActual = (Square) shapeCollector.getFigure(0);
        //then
        Assert.assertEquals(squareExpected,squareActual);
    }

    @Test
    public void testShowShape() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        List<Shape> shapeList = new ArrayList<>();
        Triangle triangle = new Triangle(10,10);
        Circle circle = new Circle(10);
        Square square = new Square(10);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeList.add(triangle);
        shapeList.add(circle);
        shapeList.add(square);
        //when
        List<Shape> shapesName = shapeCollector.showFigures();
        //then
        Assert.assertEquals( shapeList , shapeCollector.showFigures());
    }
}
