package com.java8features.functionalinterfaces;

@FunctionalInterface
/*
In Java, a functional interface is an interface that contains exactly one abstract method. Functional interfaces are a key feature of Java's functional programming support introduced in Java 8. Here are some important points about functional interfaces:
Single Abstract Method (SAM): A functional interface can have only one abstract method. This single method forms the core behavior that the interface encapsulates.
@FunctionalInterface Annotation: Java provides the @FunctionalInterface annotation to ensure that an interface is used as a functional interface. This annotation is optional but recommended for clarity and to prevent accidental addition of extra abstract methods.
Lambda Expressions and Method References: Functional interfaces are designed to be used with lambda expressions and method references, making it easier to pass behaviors as arguments to methods or assign them to variables.
Built-in Functional Interfaces: Java provides several built-in functional interfaces in the java.util.function package, such as Predicate, Function, Consumer, and Supplier, among others. These interfaces cover common functional use cases.
Compatibility with Streams and Functional Programming: Functional interfaces are integral to Java's functional programming capabilities, enabling operations like filtering, mapping, and reducing elements in collections using streams.
Default and Static Methods: Functional interfaces can have default and static methods in addition to the single abstract method. These methods provide utility or default behaviors that can be optionally overridden.
Significance in Java 8+: With the introduction of lambda expressions, functional interfaces provide a concise way to define behaviors inline, enhancing code readability and maintainability.
Functional interfaces play a crucial role in modern Java programming, especially in contexts where behavior needs to be passed around as data, such as event handling, stream processing, and parallel programming. Their design encourages the use of immutability and composability, promoting cleaner and more modular code.
* */
interface FunInterfaceExample {

    void action();

    //void action2();// you will get an error on the FunctionalInterface annotation saying Multiple non-overriding abstract methods found in interface

    default void dMethod2(){
        System.out.println("This is a default method 2");
    }

    default void dMethod3(){
        System.out.println("This method is a default method from Interface and it is not overriden");
    }

    static void sMethod4(){
        System.out.println("This is static method from Interface");//The static methods are not inherited by implementing classes and cannot be overridden
    }
}
