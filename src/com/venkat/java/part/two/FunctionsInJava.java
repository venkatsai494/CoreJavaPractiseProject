package com.venkat.java.part.two;

//Functions and Methods both are same and they are nothing more than a factory in real life
// No input no output, no input but some output, some input and some output
//Some input and no output method does not exists because we need to utilize the input parameters and give some output based on that
public class FunctionsInJava {
    //System.out.println("Hello");//This will throw an error
    //Main method is the starting point of execution. If you run the class without mentioning anything in the main method you won't get any output
    public static void main(String[] args) {
        FunctionsInJava obj = new FunctionsInJava();

        //*IMP* When you create an object then the copy of all "Non Static" methods will be given to the object. Object cannot static methods.
        //*IMP* In order to call non static methods it is compulsory to create hte objects for that class
        obj.test();
        obj.additionwithnoinput();
        obj.additionwithinput(8, 5);//This line won't print anything related to addition here as we need to store the returned vlaue in some variable and then print it.
        int k = obj.additionwithinput(3, 5);
        System.out.println(k);
        //***IMP*** main method is void because it never returns a value
        //****IMP**** Method cannot be created in a method


    }

    public void test() {
        System.out.println("This is no input no output method");//This is no input no output method
    }

    public int additionwithnoinput() {
        System.out.println("No input but some output method");
        int a = 10;
        int b = 20;
        int c = a+b;
        return c;//This means this method returning some value of data type integer. Hence we need to change the method from void to int. In case it is returning string then we need to change the method data type to String.
    }

    public int additionwithinput(int a, int b) {
        System.out.println("Hey there");
        return (a+b);
//		System.out.println("The End");//This line won't be printed as this code is unreachable as anything after return statement will be unreachable
    }

}
