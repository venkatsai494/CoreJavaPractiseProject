   package com.venkat.java.interfacesconcept.defaultmethod;

interface Vehicle {

    void aMethod1();

    default void dMethod2(){
        System.out.println("This is a default method 2");
    }

    default void dMethod3(){
        System.out.println("This method is a default method from Interface and it is not overriden");
    }
}
