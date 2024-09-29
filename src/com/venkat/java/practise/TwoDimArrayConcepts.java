package com.venkat.java.practise;

public class TwoDimArrayConcepts {

    public static void main(String[] args) {
        String x[][] = new String[3][5];

        System.out.println(x.length);//This will give the number of rows
        System.out.println(x[0].length);//This will give the number of Columns

        //1st row
        x[0][0] = "A0";
        x[0][1] = "B0";
        x[0][2] = "C0";
        x[0][3] = "D0";
        x[0][4] = "E0";


        //2nd row
        x[1][0] = "A1";
        x[1][1] = "B1";
        x[1][2] = "C1";
        x[1][3] = "D1";
        x[1][4] = "E1";

        //3rd row
        x[2][0] = "A2";
        x[2][1] = "B2";
        x[2][2] = "C2";
        x[2][3] = "D2";
        x[2][4] = "E2";

        //How to print all the values in a matrix form

        for(int row=0; row<x.length; row++)
        {
            for(int col=0; col<x[0].length; col++)
            {
                System.out.print("    "+x[row][col]);//did not use println as it would create a new line instead i used print so that all the elements are printed in a single line
            }
            System.out.println("");
        }

    }

}
