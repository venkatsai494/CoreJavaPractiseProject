package com.venkat.java.practise;

public class IfElseConcept {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a, b, c;
        a=10;
        b=10;
        c=20;
        if(a>b&a>c) {
            System.out.println("a is the greatest");
        }
        else if(b>a&b>c) {
            System.out.println("b is the greatest");
        }
        else if(c>a&c>b) {
            System.out.println("c is the greatest");
        }
        else if((a==b)||(b==c)||(c==a)) {
            System.out.println("None of the above is the largest");
        }
    }

}
