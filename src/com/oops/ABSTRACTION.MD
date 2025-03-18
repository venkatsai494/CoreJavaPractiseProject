**Abstraction**

Abstraction is the process of hiding the implementation details and showing only essential features of the object. It is implemented using **abstract classes** or **interfaces**.

#### Example: Abstract Class

```java
abstract class Shape {
    abstract void draw(); // Abstract method

    void display() { // Concrete method
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();     // Calls overridden method
        shape.display();  // Calls concrete method from abstract class
    }
}
```

#### Example: Interface

```java
interface Vehicle {
    void start(); // Abstract method
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts with a key.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.start();
    }
}
```
