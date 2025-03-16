#### **Class and Object**

A **class** is a blueprint for creating objects. An **object** is an instance of a class.

```java
class Car {
    String color;
    String brand;

    void drive() {
        System.out.println("The car is driving.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car(); // Object creation
        car.color = "Red";
        car.brand = "Toyota";
        car.drive();
    }
}
```