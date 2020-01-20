package com.kodilla.testing.shape;

public interface Shape {

    String getShapeName();
    double getFiled();

}

class Square implements Shape{

    int a;

    public Square(int a){
        this.a = a;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double getFiled() {
        return Math.pow(a, 2);
    }

    @Override
    public String toString() {
        return getShapeName() + " o polu " + getFiled();
    }
}

class Triangle implements Shape{

    int a;
    int h;

    public Triangle(int a, int h){
        this.a = a;
        this.h = h;
    }
    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getFiled() {
        return (a*h)/2.0;
    }

    @Override
    public String toString() {
        return getShapeName() + " o polu " + getFiled();
    }
}

class Circle implements Shape{

    int r;

    public Circle(int r){
        this.r = r;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getFiled() {
        return Math.pow(Math.PI*r, 2);
    }

    @Override
    public String toString() {
        return getShapeName() + " o polu " + getFiled();
    }
}
