package com.venkat.java.part.two;

public class MethodOverloading {

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.sum();
        obj.sum(3);
        obj.sum(3, 5);
        obj.sum(3.0, 5);//As you can see here I have given first one as double and other second one as int then it will be type casted

    }

    //***IMP yes we can overload main method as shown below but we never use it anyways

    public static void main(int k) {
        System.out.println("overloaded the main method");
    }

    //*IMP* method overloading - same name and in hte same class but either with different number of input paramenters
    public void sum() {
        System.out.println("with no parameters");
    }
    public void sum(int a){
        System.out.println("with one int input that is "+a);
    }
    public void sum(int a, int b) {
        System.out.println("with two input for sum is"+(a+b));
    }

//	public int sum() {
//		System.out.println();//IMP this will give error even though the number of parameters of method is different from that of first as the return type is different over here
//	}

    public void sum(double a, double b) {
        System.out.println("with two double input the sum is "+(a+b));
    }
}
