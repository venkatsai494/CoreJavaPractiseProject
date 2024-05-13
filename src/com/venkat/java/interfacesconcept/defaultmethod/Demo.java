package com.venkat.java.interfacesconcept.defaultmethod;

public class Demo {

    public static void main(String[] args) {
        Vehicle i = new Car(); //Here we can create an object of implementing class and store it a variable of type of Interface
        i.aMethod1(); //This comes from the interface which was not implemented in the interface but was overidden and implemented in implementingclass
        i.dMethod2();//Interface's default method can also be called directly
        i.dMethod3();//This is not overidden in implementing class hence it would be taken directly from interface

    }

}
