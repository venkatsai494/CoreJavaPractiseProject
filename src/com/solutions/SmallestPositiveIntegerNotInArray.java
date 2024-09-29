package com.solutions;

import java.util.Arrays;

public class SmallestPositiveIntegerNotInArray {

    public static String returnChar(String S)
    {
        String largestChar = "NO";
        char [] ar = S.toCharArray();
        Arrays.sort(ar);
        for(int i = 0; i < ar.length; i++ ) {
            if(Character.isUpperCase(ar[i])) {
                for(int j = i+1; j < ar.length; j++) {
                    if(Character.toLowerCase(ar[i])==(ar[j])) {
                        largestChar = String.valueOf(ar[i]);
                    }
                }
            }

        }

        return largestChar;
    }

    public static void main(String[] args) {
        String s1 = "aaBb";
        String s2 = "DavibBd";
        System.out.println(returnChar(s1));
        System.out.println(returnChar(s2));
        System.out.println(returnChar(s1));
        System.out.println(returnChar(s1));
    }

}