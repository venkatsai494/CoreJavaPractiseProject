package com.designpatterns.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonDesignPattern {

    public static void main(String[] args) {
        SingletonClass singleton1 = SingletonClass.getInstance();
        SingletonClass singleton2 = SingletonClass.getInstance();

        // Both variables point to the same instance
        System.out.println(singleton1 == singleton2);  // Output: true
        SingletonClass singleton3;
        try {
            Constructor<SingletonClass> constructor = SingletonClass.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            singleton3 = constructor.newInstance();

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        System.out.println(singleton1 == singleton3);//if this is false it means that the private constructor is accessed through Reflection attack
    }
}
