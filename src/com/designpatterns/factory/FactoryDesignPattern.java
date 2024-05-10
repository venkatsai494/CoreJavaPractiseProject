package com.designpatterns.factory;


/*
The Factory Pattern is a creational design pattern that provides an interface or abstract class for creating objects, but allows subclasses to alter the type of objects that will be created. It is useful when you want to delegate the responsibility of object instantiation to subclasses, hiding the creation logic from the client code.

Here's how the Factory Pattern works:

Interface or abstract class: Define an interface or an abstract class to represent the factory, declaring a method for creating objects. This method will be implemented by concrete subclasses.

Concrete subclasses: Create concrete subclasses that implement the factory method. Each subclass can override the factory method to create different types of objects.

Client code: Use the factory method to create objects without needing to know the specific class of the object being created.
 */
public class FactoryDesignPattern {

    public static void main(String[] args) {
        // Create a circle using the circle factory with radius 5
        ShapeFactory circleFactory = new CircleFactory();
        Shape circle = circleFactory.createShape(7);
        circle.draw();  // Output: Drawing a circle
        System.out.println("Area of the circle: " + circle.getArea()); // Output: Area of the circle: 78.53981633974483

        // Create a rectangle using the rectangle factory with length 4 and width 6
        ShapeFactory rectangleFactory = new RectangleFactory();
        Shape rectangle = rectangleFactory.createShape(4, 6);
        rectangle.draw();  // Output: Drawing a rectangle
        System.out.println("Area of the rectangle: " + rectangle.getArea()); // Output: Area of the rectangle: 24.0

        // Create a triangle using the triangle factory with sides 13, 14, 15
        ShapeFactory triangleFactory = new TriangleFactory();
        Shape triangle = triangleFactory.createShape(13, 14, 15);
        rectangle.draw();  // Output: Drawing a rectangle
        System.out.println("Area of the rectangle: " + triangle.getArea()); // Output: Area of the rectangle: 24.0


    }
}


/*
Real-life example:

A real-life example of the Factory Pattern could be a pizza restaurant.
The restaurant offers different types of pizzas (e.g., Margherita, Pepperoni, Hawaiian) but follows a similar process for making each type of pizza.
By using the Factory Pattern, the restaurant can define a PizzaFactory interface with a method for creating pizzas, and
concrete subclasses (e.g., MargheritaPizzaFactory, PepperoniPizzaFactory) can implement this method to create different types of pizzas.
This allows the restaurant to encapsulate the pizza creation logic and provide a consistent interface for creating pizzas, regardless of the specific type.
 */