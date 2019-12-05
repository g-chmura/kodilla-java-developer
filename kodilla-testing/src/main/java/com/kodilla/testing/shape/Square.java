package com.kodilla.testing.shape;

public class Square implements Shape {
    private int width;

    public Square(int width){
        this.width = width;
    }
    public String getShapeName() {
        return this.getClass().toString();
    }
    public double getField() {
        return width * width;
    }
}