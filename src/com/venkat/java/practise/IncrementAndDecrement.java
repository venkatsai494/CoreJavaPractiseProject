package com.venkat.java.practise;

public class IncrementAndDecrement {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int i = 1;
        int j = 1;
        int k = 1;
        int l = 1;

        int v = ++i;//this mean pre increment which implies first the value of i will be incremented and then it will be assigned to variable v
        System.out.println(v);
        v=j++;//this mean post increment which implies first the value of i will be assigned to v and then the value of j is incremented which means hte new value of j will be 2.
        System.out.println(v);
        v=--k;
        System.out.println(v);
        v=l--;
        System.out.println(i+","+j+","+k+","+l+","+v);
    }

}
