package com.designpatterns.creational.singleton;

public class SingletonDesignPattern {

    public static void main(String[] args) {
        SingletonClass singleton1 = SingletonClass.getInstance();
        SingletonClass singleton2 = SingletonClass.getInstance();

        // Both variables point to the same instance
        System.out.println(singleton1 == singleton2);  // Output: true
    }
}
