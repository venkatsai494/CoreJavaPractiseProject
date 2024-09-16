package com.java8features.functionalinterfaces.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    private String name;
    private int age;
    private int weight;
    public Person(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getWeight() {
        return weight;
    }

    @Override
    public String toString(){
        return "Name: "+this.getName()+", Age: "+this.getAge()+"yrs, Weight: "+"kg \n";
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Person> parpellis = new ArrayList<>();
        parpellis.add(new Person("Venkat", 33, 105));
        parpellis.add(new Person("Harika", 30, 85));
        parpellis.add(new Person("Leela", 60, 72));
        parpellis.add(new Person("Raju", 63, 73));

        System.out.println(parpellis);

        Collections.sort(parpellis, new Comparator<Person>() {
            //Comparator Definition: An anonymous inner class ageComparator is used to implement the Comparator<Person> interface. The compare method is overridden to compare Person objects based on their age (p1.getAge() vs. p2.getAge()).
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getAge() - p2.getAge();
            }
        });
        System.out.println("Sorted order as per ascending order of age" + parpellis);

        Collections.sort(parpellis, (p1, p2) -> (p2.getAge() - p1.getAge())); //Using lambda expression; you might think if this compare method is returning an integer at the end of the day then why we cannot pass integer over here.
        System.out.println("Sorted order as per descending order of age" + parpellis);

    }
}
