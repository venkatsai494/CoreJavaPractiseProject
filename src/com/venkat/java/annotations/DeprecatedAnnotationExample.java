package com.venkat.java.annotations;

public class DeprecatedAnnotationExample {

    @Deprecated
    public void deprecatedMethod(){
        System.out.println("This is a deprecated method");
    }

    public void method(){
    }



}



@Deprecated
class DeprecatedClass {
    //This class would be deprecated
    public void test(){
        System.out.println("Hi there this is depricated class");
    }
}

class Demo{
    public static void main(String[] args) {
        DeprecatedAnnotationExample dae = new DeprecatedAnnotationExample();
        dae.deprecatedMethod();
        DeprecatedClass dc = new DeprecatedClass();
        dc.test();
    }
}
