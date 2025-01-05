### **Composition in Java**

**Composition** is a design principle that models a "has-a" relationship between objects. It allows one class to contain objects of another class, enabling complex behavior by combining multiple smaller, reusable classes. This principle is preferred over inheritance when the relationship between classes doesn’t strongly represent an "is-a" hierarchy.

* * *

### **Key Features of Composition**

1.  **Reusability**: You can reuse existing classes without modifying them.
2.  **Flexibility**: You can change the behavior of composed objects dynamically.
3.  **Loosely Coupled**: Changes in the composed class don’t necessarily affect the containing class.
4.  **Avoids Inheritance Overhead**: Unlike inheritance, which creates a tight coupling, composition allows a modular structure.

* * *

### **Example: Car and Engine**

Let's model a car that **"has-a"** engine using composition.

```java
class Engine {
    void start() {
        System.out.println("Engine starts.");
    }

    void stop() {
        System.out.println("Engine stops.");
    }
}

class Car {
    private Engine engine; // Car "has-a" Engine

    // Constructor initializes the engine
    Car() {
        engine = new Engine();
    }

    void drive() {
        engine.start();
        System.out.println("Car is driving.");
    }

    void park() {
        System.out.println("Car is parking.");
        engine.stop();
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
        car.park();
    }
}
```

* * *

### **Difference Between Inheritance and Composition**

|       Feature       |                  Inheritance                  |                Composition                |
|:-------------------:|:---------------------------------------------:|:-----------------------------------------:|
| Relationship        | "is-a" (e.g., Dog is an Animal)               | "has-a" (e.g., Car has an Engine)         |
| Coupling            | Tight coupling                                | Loose coupling                            |
| Reusability         | Restricted to parent-child relationship       | Reusable by any unrelated class           |
| Runtime Flexibility | Less flexible; fixed at compile-time          | More flexible; objects can be swapped     |
| Implementation      | Subclass inherits parent’s fields and methods | Class contains instances of other classes |

* * *

### **Advantages of Composition**

1.  **Dynamic Behavior**: You can change the behavior of an object by replacing its composed parts.
2.  **Code Reusability**: Classes can use the same composed objects for shared behavior.
3.  **Avoids Fragile Base Class Problem**: Changes in a parent class won't unintentionally break subclasses since there’s no inheritance involved.

* * *

### **Example: House and Rooms**

A house contains multiple rooms, and each room has its own behavior.

```java
class Room {
    private String type;

    Room(String type) {
        this.type = type;
    }

    void describe() {
        System.out.println("This is a " + type + " room.");
    }
}

class House {
    private Room livingRoom;
    private Room bedroom;

    // Composition: House contains Room objects
    House() {
        livingRoom = new Room("Living");
        bedroom = new Room("Bedroom");
    }

    void describeHouse() {
        livingRoom.describe();
        bedroom.describe();
    }
}

public class Main {
    public static void main(String[] args) {
        House house = new House();
        house.describeHouse();
    }
}
```

* * *

### **Dynamic Behavior with Composition**

Composition allows replacing the behavior of composed objects dynamically. For example, you could swap an Engine in a Car.

#### Example:

```java
interface Engine {
    void start();
    void stop();
}

class PetrolEngine implements Engine {
    public void start() {
        System.out.println("Petrol Engine starts.");
    }

    public void stop() {
        System.out.println("Petrol Engine stops.");
    }
}

class ElectricEngine implements Engine {
    public void start() {
        System.out.println("Electric Engine starts silently.");
    }

    public void stop() {
        System.out.println("Electric Engine stops.");
    }
}

class Car {
    private Engine engine; // Car "has-a" Engine

    // Inject Engine at runtime (Dependency Injection)
    Car(Engine engine) {
        this.engine = engine;
    }

    void drive() {
        engine.start();
        System.out.println("Car is driving.");
    }

    void park() {
        System.out.println("Car is parking.");
        engine.stop();
    }
}

public class Main {
    public static void main(String[] args) {
        Engine petrolEngine = new PetrolEngine();
        Engine electricEngine = new ElectricEngine();

        Car petrolCar = new Car(petrolEngine);
        petrolCar.drive();
        petrolCar.park();

        Car electricCar = new Car(electricEngine);
        electricCar.drive();
        electricCar.park();
    }
}
```

* * *

### **When to Use Composition?**

*   When you want to model "has-a" relationships.
*   When you need dynamic behavior (e.g., swapping parts at runtime).
*   To avoid tight coupling or fragile base class issues from inheritance.
*   When you want to reuse functionality without extending the class hierarchy.