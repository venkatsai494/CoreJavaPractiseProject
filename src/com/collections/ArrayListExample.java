package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(args);
        List<Integer> list = new ArrayList<>();//Integer is generic and it promotes code readability, type safety and elimiates the need of casting
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(20);
        list.add(40);
        System.out.println(list);
        //list.remove(1);
        System.out.println(list);
        list.remove(Integer.valueOf(20));//This will remove the first occurence only
        System.out.println(list);
    }

}
