package com.venkat.java.practise;

import java.util.ArrayList;

public class ArrayListConcept {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //*IMP* In arrays you need to define the size first. But in arraylist there is no such need to define the size
        //you cna store data of any data type in arraylist
        ArrayList ar = new ArrayList();

        ar.add(10);
        ar.add(20);
        ar.add(30);

        System.out.println(ar.size());

        ar.add(40);
        ar.add(50);
        ar.add("Venkat");
        ar.add(12.32);
        ar.add('V');

        System.out.println(ar.size());
        System.out.println(ar.get(5));
//		System.out.println(ar.get(99));//this will give array out of bound exception as you are accessing the 100th element which is not present at all

        for(int i=0; i<ar.size(); i++) {
            System.out.println(ar.get(i));
        }

        ArrayList<Integer> ar1 = new ArrayList();//Here we re restricting the object refering by ar1 to store only Integer value
        ar1.add(494);
//		ar1.add("test"));

    }

}
