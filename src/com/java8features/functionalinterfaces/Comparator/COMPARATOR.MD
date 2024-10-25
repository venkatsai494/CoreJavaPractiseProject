# Comparator

Comparator is a Functional Interface in Java which is used in defining the Custom ordering for objects


**Custom Sorting Order**: With a Comparator, you can define how objects should be sorted according to specific criteria. This allows flexibility in sorting objects based on attributes that are not directly comparable using their inherent ordering.<br>
**Non-Intrusive Sorting**: Unlike the Comparable interface, which modifies the class itself to provide a default ordering, Comparator allows sorting without altering the class being sorted. This is especially useful when you cannot modify the class's source code or when multiple different sorting criteria are needed.<br>

Eg: 



Points to be noted: <br>

**Doubt**: If the lambda expression is returning an interger why can't we directly use Collections.sort(parpellis, -1)?

In Java, when using Collections.sort, you cannot directly pass an integer like -1 as a comparator. Here's why:
Comparator Interface Requirement: The sort method of Collections expects a comparator that implements the Comparator interface or a lambda expression that can act as a comparator. The Comparator interface defines a method compare(T o1, T o2) that returns an integer.
Lambda Expression Syntax: When you use a lambda expression like (p1, p2) -> (p2.getAge() - p1.getAge()), Java automatically infers it as a Comparator because the lambda matches the functional interface Comparator's method signature (compare method).
Direct Integer Argument: Passing -1 directly does not fit the method signature that Collections.sort expects. It's not an instance of Comparator, nor does it define how to compare two objects.
Lambda vs. Integer: The lambda expression (p1, p2) -> (p2.getAge() - p1.getAge()) effectively provides the sorting logic: it compares the ages of two objects (p1 and p2) and returns an integer based on that comparison. This integer determines the order of the objects in the sorted list (p2 before p1 for descending order of ages).
Therefore, to use Collections.sort, you need to provide a valid comparator, either by implementing the Comparator interface explicitly or using a lambda expression that behaves like a comparator. Directly passing an integer like -1 does not fulfill this requirement and hence cannot be used directly for sorting collections in Java.