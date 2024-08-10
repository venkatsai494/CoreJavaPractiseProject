package com.designpatterns.creational.factory;

public class Rectangle  implements Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
