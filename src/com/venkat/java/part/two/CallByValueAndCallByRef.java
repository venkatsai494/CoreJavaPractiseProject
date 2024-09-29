package com.venkat.java.part.two;

public class CallByValueAndCallByRef {
    int p;
    int q;

    public static void main(String[] args) {
        CallByValueAndCallByRef obj = new CallByValueAndCallByRef();
        int x = 10;
        int y = 20;

        int k = obj.testSum(x, y);//This is call by value or pass by value
        System.out.println(k);

        obj.p = 50;
        obj.q = 60;
        System.out.println(obj.p);
        System.out.println(obj.q);
        obj.swap(obj);
        System.out.println(obj.p);//this is called call by reference
        System.out.println(obj.q);//this is called call by reference

    }

    public int testSum(int a, int b) {
        a=30;
        b=40;
        int c = a+b;
        return c;
    }

    public void swap(CallByValueAndCallByRef t) {
        int temp;
        temp = t.p;//which means t.p i.e. 50 will be given to temp
        t.p = t.q;//t.p will be assigned a value of t.q that is 60
        t.q = temp;//t.q would be assigned the vlaue of temp that is 50
    }

}
