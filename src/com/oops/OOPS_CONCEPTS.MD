Object-Oriented Programming (OOP) is a paradigm that organizes software design around objects rather than functions and logic. Java is a widely-used OOP language that implements this paradigm using four fundamental principles: **Encapsulation**, **Inheritance**, **Polymorphism**, and **Abstraction**. Here’s a detailed explanation of each concept with examples:

* * *

### 1\. **Encapsulation**

Encapsulation is the mechanism of bundling the data (fields) and the methods (functions) that operate on that data into a single unit (class). It restricts direct access to some components of an object to protect the integrity of the data.

#### Example:

```java
class Employee {
    private String name;
    private int age;

    // Getter and Setter methods for encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) { // Validation
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("John Doe");
        emp.setAge(30);

        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
    }
}
```

* * *

### 2\. **Inheritance**

Inheritance allows a class (child class or subclass) to inherit the properties and methods of another class (parent class or superclass). It enables code reuse and establishes a parent-child relationship between classes.

#### Example:

```java
// Parent Class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child Class
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Inherited method
        dog.bark(); // Child's own method
    }
}
```

* * *

### 3\. **Polymorphism**

Polymorphism allows a single entity (method or operator) to take many forms. In Java, it is implemented through **method overloading** and **method overriding**.

#### Example: Method Overloading (Compile-time Polymorphism)

```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10));          // Calls int version
        System.out.println(calc.add(5.5, 10.5));      // Calls double version
    }
}
```

#### Example: Method Overriding (Runtime Polymorphism)

```java
class Animal {
    void sound() {
        System.out.println("This animal makes a sound.");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("The cat meows.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cat(); // Upcasting
        animal.sound(); // Calls Cat's overridden method
    }
}
```

* * *

### 4\. **Abstraction**

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

* * *

### Additional OOP Concepts in Java

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

#### **Constructors**

Constructors are special methods used to initialize objects. They have the same name as the class.

```java
class Student {
    String name;

    // Constructor
    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Student name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice");
        student.display();
    }
}
```

#### **Static Keyword**

The `static` keyword is used for creating fields and methods that belong to the class rather than any specific object.

```java
class MathUtils {
    static int square(int number) {
        return number * number;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(MathUtils.square(5)); // No need to create an object
    }
}
```

* * *

Mastering these OOP principles helps in writing modular, reusable, and maintainable Java code. Let me know if you'd like further examples or a deeper dive into any concept!