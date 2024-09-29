package com.venkat.java.part.two;

public class Car {

    //Let's create the Class variables or global variables
    int mod, wheel;

    public static void main(String[] args) {
        //Class is a kind of entity where we have to define the properties, varibales and method
        //methods are characteristics of a class
        //In Human Class Venkat's body is an object and (Venkat is refering to Venkat's body)
        //So Venkat will be bale to do everything a human can do like running, walking, swimming, etc. which are properties of the class human.

        Car a = new Car();
		/*This line represents RHS(new Car()) which will create an object of class Car in java memory and 'a'
		is refering to the created object whihc means a is object reference which can refer to any other object when changed the assignment
		new keyword is used to create the object of the respective class
		*/
//		Car a = new Car();//This will give an error duplicate variable as you are again defining the object reference a using Car class
//		a = new Car();//This will just create a new object of class Car and now the previously defined variable(object reference) would be now refering to this newly created object

        Car b = new Car();
        Car c = new Car();
        //point to be noted a, b and c are not objects these are object reference variables
        //After creation of object the copy of variable mod and wheel will be given to each of the objects

        System.out.println(a.wheel);//This shows that whenever an object is created then the copy variables would be initialized to default values. i.e. 0 for int

        //After the copy has been given to each of the object we need to initialize the value for the variables as shown below
        a.mod = 2015;
        a.wheel = 4;

        b.mod = 1991;
        b.wheel = 4;

        c.mod = 1993;
        c.wheel = 4;

        System.out.println(c.wheel);
        //Also you can see that the values of a.mod are not having a warning that it was not used

        //For example lets say abc were referring to object Apple, Ball and Cat then after the below line

        a=b;//Now a will leave the reference of Apple and will now be referring to Ball
        b=c;//Now b will leave the refernce of Ball and will now be referring to Cat
        c=a;//Now c will leave the reference of Cat and will now be referring to the latest reference of a which is Ball
        a.mod = 10;
        System.out.println(a.mod);// Here now the a was referring to what previously b was referring
        c.mod = 20;//As a and c are both referring to Ball now the value for a.mod and c.mod will be same now
        System.out.println(a.mod);//This is the same value as that of c.mod

    }

}
