package com.venkat.java.part.three;

public class BMW extends Car{//This is also called as has-a relationship/Child will extend Parent

    public void start() {
        System.out.println("BMW-----Start");
    }

    //The above method with same name and parameters is present in both parent as well as in child
    //This is called method overriding

    public void theftSafety() {
        System.out.println("BMW-------theftSafety");
    }

}
