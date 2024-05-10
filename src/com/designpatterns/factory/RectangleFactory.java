package com.designpatterns.factory;

public class RectangleFactory  implements ShapeFactory {
    @Override
    public Shape createShape(double... dimensions) {
        if (dimensions.length != 2) {
            throw new IllegalArgumentException("Invalid number of dimensions for rectangle");
        }
        return new Rectangle(dimensions[0], dimensions[1]);
    }
}
