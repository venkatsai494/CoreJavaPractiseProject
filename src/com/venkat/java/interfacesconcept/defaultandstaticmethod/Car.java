package com.venkat.java.interfacesconcept.defaultandstaticmethod;

public class Car implements Vehicle, Automobile {
    @Override
    public void aMethod1() {
        System.out.println("Abstract Method is implemented here");
    }

    @Override
    public void dMethod2(){
        System.out.println("Default method overidden");
    }

    @Override
    public void travel() {
        System.out.println("Travelling as it is automobile");
    }
}
