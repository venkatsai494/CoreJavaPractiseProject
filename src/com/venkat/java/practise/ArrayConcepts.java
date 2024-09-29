package com.venkat.java.practise;

public class ArrayConcepts {

    public static void main(String[] args) {
        //Array is a collection of elements used to store values of similar data types, in a primitive data type only a single value can be stored at a time
        int i[] = new int[4];//which means i will be an array of integer data type tio store 4 values and index of array will start from 0 to (n-1)

        i[0]=1;
        i[1]=4;
        i[2]=9;
        i[3]=16;

        //So this is an array with all the square of numbers
        //Let's create a new array to find the square root of all the numbers

        String []j = new String[4];//This declaration is somewhat different which means when we give variable name after the square bracket even that is correct
        for(int a=0; a<i.length;a++)//i.length will give you the size of the array which is 4 in this case
        {
            double k = Math.sqrt(i[a]);
            j[a] = String.valueOf(k);
            System.out.println(j[a]);
        }
//		i[4] = 6;
//		System.out.println(i[4]);//Here user will get an ArrayIndexOutOfBoundsException as i[4] does not exist as the size of array is fixed here
        //Disadvantages of using Array
        //The size of array is fixed hence this is called a static array - to overcome this we use Collections like ArryaList, Hashtable hence these are called dynamic arrays
        //An array can store only the values of similar data types - To overcome this we use Object array.

        Object obj[] = new Object[6];//Declaration of Object Array
        //Object is the most Superclass in Java
        //object arrays is used to store different data type values
        obj[0]="Venkat Sai";
        obj[1]=29;
        obj[2]=6.2;
        obj[3]="26/01/1991";
        obj[4]='M';
        obj[5]="Aurangabad";
        System.out.println(obj[5]);



    }

}
