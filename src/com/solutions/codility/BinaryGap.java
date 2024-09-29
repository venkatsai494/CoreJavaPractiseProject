package com.solutions.codility;

public class BinaryGap {

    /*
     * A binary gap within a positive integer N is any maximal sequence of consecutive zeros that
     * is surrounded by ones at both the ends in the binary representation of N
     * https://www.youtube.com/watch?v=DKlu-KCQU3Q&list=PLTMybUaeagJbTAelBd-pGBuAngpPtnw8b&index=1
     */



    public int maxGapOfBinary(int n) {
        int gap = 0;
        int maxGap = 0;
        String binaryForm = Integer.toString(n,2);
        String [] splitArray = binaryForm.split("1");
        int numberofIteration = 0;

        if(splitArray.length<2) {
            maxGap = 0;
        }
        if(splitArray.length == 2) {
            numberofIteration = splitArray.length;
        }
        else if(splitArray.length>2) {
            numberofIteration = splitArray.length-1;
        }

        else {
            for(int i = 1; i<=numberofIteration ; i++) {
                gap = splitArray[i].length();
                if(gap>maxGap) {
                    maxGap = gap;
                }
            }
        }

        return maxGap;
    }

    public static void main(String[] args) {
        BinaryGap bg1 = new BinaryGap();
        System.out.println(bg1.maxGapOfBinary(9));
        String testString = "10100";
        String [] strArray = testString.split("1");
        System.out.println(strArray.length);


    }

}
