/*All the keywords in java are started with small letter
The exact folder structure would be created in the local system*/

package com.venkat.java.practise; //This is the package which is similar to a folder structure for files
//We can create package inside a package. So we can think package like a folder structure

public class DataTypes { // class name will always be preceded by keyword class

    public static void main(String[] args) { //Whenever you want to execute your java class make sure main method is there then only you would be able to execute a java class
        // TODO Auto-generated method stub
        System.out.println("This is my first java");

        //Data Types
        int i;// if user is using int as keyword he is assigning a specific memory location in the jvm to variable i
        i = 10;		// Here user has assigned a value of 10 to the memory location
        //int i;		// This line would be giving duplicate local variable warning as again another memore location would be given to variable i
        int j=50;		// Here you would be able to see that initialization of variable and assignment are both done in the same line
        int k=j;		// Here the a new memory location is given to variable k to store it value and then assignment of value in the j is done to the same location

        System.out.println(i+j+k);
        //Similarly we can start with different data types
        double p = 12.44;
        char a = 'b'; //Here variable a is storing a character value b and
        boolean b1 = true; // This can only store two values either true or false
        boolean b2 = 546>342; // The value in b2 would be stored based on the condition on the right side in this case its true

        // ****************int, double, char and boolean are primitive data types////////

        String v = "Hi this is Venkat";

        System.out.println(b1&b2);
        System.out.println(p);
        System.out.println(a);
        System.out.println(v);




    }

}