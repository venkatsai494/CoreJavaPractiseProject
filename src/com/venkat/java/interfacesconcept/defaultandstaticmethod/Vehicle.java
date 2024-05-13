   package com.venkat.java.interfacesconcept.defaultandstaticmethod;

interface Vehicle {

    void aMethod1();

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
