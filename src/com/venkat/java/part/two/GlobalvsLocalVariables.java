package com.venkat.java.part.two;

public class GlobalvsLocalVariables {

    String name = "Venkat";//**IMP** These are global or Class variables as this are not created in any of hte methods
    int age = 29;//**IMP** In order to use the global variables we need to create the object of the class

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//		System.out.println(obj.age);//This won't work until you create the object of the class to access the class variables
        GlobalvsLocalVariables obj = new GlobalvsLocalVariables();
        System.out.println(obj.age);
        obj.sum();//This will print the age variable which is local for the method sum
        System.out.println(obj.sum());

    }

    public int sum() {
        int i = 10;
        int j = 20;
        int age = 25;
        System.out.println("local variable"+age);
        return i+j;
    }

    public void sumwithnoreturn() {
        int a = 5;
        int b = 15;
        System.out.println(a+b);
    }


}
