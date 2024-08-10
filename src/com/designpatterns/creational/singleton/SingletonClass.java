package com.designpatterns.creational.singleton;

public class SingletonClass {

    // Static variable to hold the single instance of the class
    private static SingletonClass instance;

    // Private constructor to prevent instantiation from outside the class
    private SingletonClass() {}

    // Static method to provide global access point to the single instance
    public static SingletonClass getInstance() {
        // Lazy initialization: create the instance only if it doesn't exist yet
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }

    // Other methods and variables can be added here

}
