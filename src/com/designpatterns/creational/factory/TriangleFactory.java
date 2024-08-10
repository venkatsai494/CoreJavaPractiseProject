package com.designpatterns.creational.factory;

public class TriangleFactory implements ShapeFactory{
    @Override
    public Shape createShape(double... dimensions) {
        if (dimensions.length != 3) {
            throw new IllegalArgumentException("Invalid number of dimensions for rectangle");
        }
        return new Triangle(dimensions[0], dimensions[1], dimensions[2]);
    }
}
