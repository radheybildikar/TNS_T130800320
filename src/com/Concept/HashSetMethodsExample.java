package com.Concept;

import java.util.HashSet;
import java.util.Set;

public class HashSetMethodsExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        // add()
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // Duplicate ignored

        // size()
        System.out.println("HashSet: " + set);
        System.out.println("Size: " + set.size());

        // contains()
        System.out.println("Contains 'Banana'? " + set.contains("Banana"));

        // remove()
        set.remove("Banana");
        System.out.println("After removing Banana: " + set);

        // isEmpty()
        System.out.println("Is empty? " + set.isEmpty());

        // iterator()
        System.out.println("Iterating HashSet:");
        for (String item : set) {
            System.out.println(item);
        }

        // clear()
        set.clear();
        System.out.println("After clear: " + set);
    }
}
