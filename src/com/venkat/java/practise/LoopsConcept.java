package com.venkat.java.practise;

public class LoopsConcept {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //Looping is used to do repeated operations
        int i =1;
        int j =1;
        while(i<=10) {
            System.out.println(i);
            i++;
        }
        System.out.println(i);
        //WHile loop will generate an infinite loop if you don't increment or decrement the variable value

        do
        {
            System.out.println(j);
            j++;
        }while(j<10);//Note that in do while loop there is semi colon at the end of while keyword

        System.out.println("*****************************");

        for(int k=1; k<10; k++) {
            System.out.println(k);
            //In for loop initialization, condition and increment.decrement all are done in the same line
        }

    }

}
