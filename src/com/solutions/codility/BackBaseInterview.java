package com.solutions.codility;


/*
 * Given an array of integers where each element represents the max number of steps that can be made forward from that element.

Write a function to return the minimum number of jumps to reach the end of the array (starting from the first element).
a. If an element is 0, they cannot move through that element.
b. If the end isn’t reachable, return -1.

Ex: Input: arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}
Output: 3 (1-> 3 -> 9 -> 9)

0
1- 2nd element counter++;
3 - 5th element
try cath block
arrays out of bound exception
counter +1
 */
public class BackBaseInterview {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int [] abc = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        BackBaseInterview obj = new BackBaseInterview();
        System.out.println(obj.jumpsRequired(abc));

    }

    public int jumpsRequired(int [] arr){
        int arrSize = arr.length;
        int counter = 0;


        try{
            int i = 0;
            do{
                if(arr[i] == 0){
                    return -1;
                }
                else{
                    i = i+arr[i];
                }
                counter ++;
            }while(i<arrSize);

        }
        catch(ArrayIndexOutOfBoundsException e){
            counter ++;
        }
        return counter;
    }


}
