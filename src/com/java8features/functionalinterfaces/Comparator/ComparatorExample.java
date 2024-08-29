package com.java8features.functionalinterfaces.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Person> parpellis = new ArrayList<>();
        parpellis.add(new Person("Venkat", 33));
        parpellis.add(new Person("Harika", 30));
        parpellis.add(new Person("Leela", 60));
        parpellis.add(new Person("Raju", 63));

        Comparator<Person> ageComparator = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getAge() - p2.getAge();
            }
        };
        Collections.sort(parpellis, ageComparator);

        for (Person person : parpellis) {
            System.out.println(person.getName() + ": " + person.getAge());
        }
    }
}
