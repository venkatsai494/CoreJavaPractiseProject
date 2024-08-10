package com.designpatterns.creational.factory;

public class CircleFactory implements ShapeFactory{
    @Override
    public Shape createShape(double... dimensions) {
        if (dimensions.length != 1) {
            throw new IllegalArgumentException("Invalid number of dimensions for circle");
        }
        return new Circle(dimensions[0]);
    }
}
