## LAMBDA EXPRESSIONS


Ex

First point to be noted is Lambda expressions do not return primitive datatype value. But instead they return a reference of Functional Interface type
This statement is describing how lambda expressions work in Java. Here's a breakdown:
Lambda Expressions: In Java, lambda expressions are used to create anonymous methods, which can be passed as arguments to methods or assigned to variables. They are concise ways to represent instances of functional interfaces.
Functional Interfaces: These are interfaces that have exactly one abstract method. Lambda expressions can be used to implement the abstract method of a functional interface.
Return Type: When you write a lambda expression, it doesn't return a primitive data type directly (like int, double, etc.). Instead, it returns an instance of the functional interface type that matches the method signature of the interface's abstract method.
Reference of Functional Interface Type: This means that a lambda expression creates an instance of the functional interface and returns a reference to that instance. For example, if you have a functional interface MyFunctionalInterface with a method void myMethod(), a lambda expression like () -> System.out.println("Hello") would create an instance of MyFunctionalInterface and return a reference to it.
In essence, lambda expressions in Java are used to implement functional interfaces and provide a concise way to create instances of these interfaces without explicitly writing an entire class.