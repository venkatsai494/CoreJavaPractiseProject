package com.designpatterns.creational.factory;

interface ShapeFactory {
    Shape createShape(double... dimensions);
}
