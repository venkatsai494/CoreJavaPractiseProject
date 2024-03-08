package com.venkat.java.practise;

public class StringConcatenation {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a = 100;
        int b = 300;
        String x = "Hey";
        String y = "There";

        System.err.println("This will be in red");//The output of this will be in red colour
        System.out.println(a+b);
        System.out.println("The value of a is "+a+" and the value of b is"+b);//This is how we write in actual code
        System.out.println(x+y);
        System.out.println(a+b+x+y);
        System.out.println(x+y+a+b);
        System.out.println(x+y+(a+b));
        System.out.print((a+b)+(x+y));// as there is no ln after the print this statement will fail to product a new line
        System.out.println("To test the above line");
    }

}
