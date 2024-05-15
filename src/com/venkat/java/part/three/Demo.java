package com.venkat.java.part.three;

public class Demo {


    public static void main(String[] args) {
        // TODO Auto-generated method stub

        BMW b = new BMW();
        b.start();//*IMP*(static plymorphism) or compile time polymorpism//As it has its own method for start it will access it.
        b.stop();//BMW does not have this method but it can take it from its parent Car
        b.reFuel();//Same as above
        b.theftSafety();//This is unique to BMW hence, it will access it
        b.engine();//This method comes from Grandparent Vehicle

        System.out.println("**************");
        System.out.println(args);

        Car c = new Car();
        c.start();//It will call its own Car method
        c.stop();
        c.reFuel();
//		c.theftSafety();//This method will be undefined for car as it won't be able to inherit that method form child

        System.out.println("************");

        Car c1 = new BMW();//*IMP* (Dynamic Polymorphism) or run time polymorphism. Child class object is referred by parent class reference variable.
        //*IMP* Top Casting or Up Casting- Child class object is referred by Parent class reference variable
        c1.start();//*IMP* it will call the child class method as the object is created for child class
        c1.stop();
        c1.reFuel();
//		c1.theftSafety();//*IMP*As theftSafety method is exclusively defined in BMW it won't be accessible to the object referred by parent class

        //Down Casting
//		BMW b1 = new Car();//Parent class object cannot fit into child class reference variable. For this we need to cast the object
        BMW cb = (BMW)c1;// This is how down casting can be done
        cb.theftSafety();// we can now call the exclusive method defined in BMW using down casting.

        System.out.println("************");

//        BMW b1 = (BMW) new Car();//Here we have casted the car object to child class type.This will lead to ClassCastException
//        b1.start();
//        b1.engine();
//        b1.reFuel();
        System.out.println(main(1));// We cannot call a non static method in a static method and unless and until it is static it would serve as an entry point to the program.
    }

    public static int main(int a) {
        return a;
    }


}
