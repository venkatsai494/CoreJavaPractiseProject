package com.venkat.java.practise;


public class MyOwn {



    public static void main(String[] args) {

        String a = "Venkat";
        a += " Sai";
        String b = "Venkat Sai";
        if (a==b) {
            System.out.println("Same");
        }
        else if(a.equals(b))
        {
            System.out.println("Same with equals method");

        }
        else
        {
            System.out.println("Ignore");
        }

    }
}
