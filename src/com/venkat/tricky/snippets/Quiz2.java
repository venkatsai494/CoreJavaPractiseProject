package com.venkat.tricky.snippets;

import java.util.ArrayList;
import java.util.List;

public class Quiz2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        // This for-each loop will throw ConcurrentModificationException
        for (String fruit : list) {
            if (fruit.equals("banana")) {
                list.remove(fruit);
            }
        }
        System.out.println(list);
    }
}
