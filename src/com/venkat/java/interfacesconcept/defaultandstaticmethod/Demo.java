package com.venkat.java.interfacesconcept.defaultandstaticmethod;

public class Demo {

    public static void main(String[] args) {
        Vehicle i = new Car(); //Here we can create an object of implementing class and store it a variable of type of Interface
        i.aMethod1(); //This comes from the interface which was not implemented in the interface but was overidden and implemented in implementingclass
        i.dMethod2();//Interface's default method can also be called directly
        i.dMethod3();//This is not overidden in implementing class hence it would be taken directly from interface
        Vehicle.sMethod4();//The static methods are not inherited by implementing classes and cannot be overridden

        Automobile a = new Car();//As Car is implementing both interfaces, Vehicle and Automobile, we can see that the object of Car can be referred by either of the Interface type (either Automobile or Vehicle), but point to be noted is that if it is referred by Car then it cannot access the exlusive methods of Vehicle Interface
        a.travel();
        //a.aMethod1();//This is not allowed as aMethod1 is the method of Interface Vehicle but the reference type of a is of Automobile. So in order to call aMethod1() we can do as follow
        ((Vehicle) a).aMethod1();//This is called typecasting the


        //This concept relates to the ISP from SOLID principles, which states that clients should not be forced to depend on interfaces they do not use. In your case, Vehicle and Automobile are separate interfaces, and when you use Vehicle v1 = new Car();, you're adhering to the principle by interacting with Car through the Vehicle interface.
    }

}
