package com.designpatterns.creational.singleton;

public class SingletonClass {

    // Static variable to hold the single instance of the class
    private static SingletonClass instance;

    // Private constructor to prevent instantiation from outside the class
    private SingletonClass() {
        if(instance != null)//This would prevent the user to create another object of this class using Reflection attack
            throw new RuntimeException("As the instance is not null another instance cannot be created");
    }

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
