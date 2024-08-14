# Design Patterns

## Creational Design Patterns
These patterns deal with object creation mechanisms, trying to create objects in a manner suitable for the situation.

1. **Singleton Pattern:** Ensures that a class has only one instance and provides a global point of access to it.<br>
2. **Factory Pattern:** Creates objects without specifying the exact class of the object that will be created.<br>
3. **Abstract Factory Pattern:** Provides an interface for creating families of related or dependent objects without specifying their concrete classes.<br>
4. **Builder Pattern:** Separates the construction of a complex object from its representation, allowing the same construction process to create various representations.<br>
5. **Prototype Pattern:** Creates new objects by copying an existing object, known as the prototype.<br>

## Structural Design Patterns
These patterns deal with object composition or the relationship between objects.

1. **Adapter Pattern:** Allows incompatible interfaces to work together by acting as a bridge between two incompatible interfaces.<br>
2. **Bridge Pattern:** Separates an object’s interface from its implementation so that they can vary independently.<br>
3. **Composite Pattern:** Composes objects into tree structures to represent part-whole hierarchies, allowing individual objects and compositions of objects to be treated uniformly.<br>
4. **Decorator Pattern:** Adds behavior to objects dynamically without affecting the behavior of other objects from the same class.<br>
5. **Facade Pattern:** Provides a simplified interface to a complex system of classes, libraries, or frameworks.<br>
6. **Flyweight Pattern:** Reduces the cost of creating and manipulating a large number of similar objects by sharing common parts of the object state.<br>
7. **Proxy Pattern:** Provides a surrogate or placeholder for another object to control access to it.<br>


## Behavioral Design Patterns
These patterns deal with object collaboration and responsibility.

1. **Chain of Responsibility Pattern:** Allows multiple objects to handle the same request, passing the request along a chain until it is handled.<br>
2. **Command Pattern:** Encapsulates a request as an object, thereby allowing for parameterization of clients with queues, requests, and operations.<br>
3. **Interpreter Pattern:** Defines a representation of a language's grammar along with an interpreter that uses this representation to interpret sentences in the language.<br>
4. **Iterator Pattern:** Provides a way to access elements of a collection sequentially without exposing the underlying representation.<br>
5. **Mediator Pattern:** Reduces the complexity of communication between multiple objects by using a mediator object.<br>
6. **Memento Pattern:** Captures the internal state of an object without exposing its internal structure, so that it can be restored later.<br>
7. **Observer Pattern:** Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.<br>
8. **State Pattern:** Allows an object to change its behavior when its internal state changes.<br>
9. **Strategy Pattern:** Defines a family of algorithms, encapsulates each one, and makes them interchangeable, allowing the algorithm to vary independently from clients that use it.<br>
10. **Template Method Pattern:** Defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.<br>
11. **Visitor Pattern:** Represents an operation to be performed on elements of an object structure, allowing you to define a new operation without changing the classes of the elements on which it operates.<br>