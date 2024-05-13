package com.venkat.java.interfacesconcept.defaultmethod;

public class Car implements Vehicle {
    @Override
    public void aMethod1() {
        System.out.println("Abstract Method is implemented here");
    }

    @Override
    public void dMethod2(){
        System.out.println("Default method overidden");
    }
}
