package com.collections;

import java.util.ArrayList;
import java.util.List;

public class LearningCollections {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(args);
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(20);
        list.add(40);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
    }

}
