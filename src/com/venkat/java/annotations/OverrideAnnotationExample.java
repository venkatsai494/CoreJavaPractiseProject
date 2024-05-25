package com.venkat.java.annotations;


class Parent{
    public void sum(int a, int b){
        System.out.println("Sum of the numbers is "+(a+b));
    }
}

class Child extends Parent{
    /*
    1. Compile-Time Checking: The primary function of the @Override annotation is to inform the compiler
    that a method is intended to override a method in a superclass. This enables the compiler to perform
    checks and ensure that the method is indeed overriding a method from its superclass.
    2. Error Prevention: Using @Override helps prevent subtle bugs caused by incorrectly matching method
     signatures or method names. If a method is intended to override a method in the superclass but doesn't
     do so due to a typo or incorrect signature, the compiler will alert you.
    3.Code Readability: The @Override annotation serves as documentation, making it clear to anyone reading the code
    that a method is intended to override a method in the superclass. This enhances code readability and
    helps other developers understand the code more quickly.
    */
    @Override
    public void sum(int a, int b){
        System.out.println("Sum of the numbers is "+(a+b)+" this is child class method");
    }


}

public class OverrideAnnotationExample {

    public static void main(String[] args) {
            Child c1 = new Child();
            c1.sum(1,2);
    }

}
