package com.venkat.java.part.two;

public class StaticAndNonStaticConcepts {

    String name = "Venkat";//non static global variable
    static int age = 29;//Static global variable

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //How to call static methods and variables?
        //Direct Calling
        sum();
        System.out.println(age);
        //Call by Class name
        StaticAndNonStaticConcepts.sum();
        System.out.println(StaticAndNonStaticConcepts.age);

//		Can we call a non static variable without creating an object
//		No
//		In order to call a non static method or variable we need to create the object of the class

        StaticAndNonStaticConcepts obj = new StaticAndNonStaticConcepts();
        obj.sendMail();
        obj.sum();//*IMP you can access a static method by objects But you would be getting a warning
        //When you have the sum method as static then there is no point in creating an object however you can access it in that way as well


    }
    //*IMP* this shows that the static method and variables will be assigned to a different memory location in JVM and hence they do not have anything to do with the creation of objects

    public void sendMail() {//non static method
        System.out.println("send mail method");
    }

    public static void sum() {//static method
        System.out.println("Sum method which is static");
    }

}
