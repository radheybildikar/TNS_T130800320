package com.Concept;

import java.util.ArrayList;

public class IterableExample {
    public static void main(String[] args) {
        // ArrayList implements Iterable
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // 1. Using for-each loop (enhanced for loop)
        System.out.println("Using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 2. Using Iterator manually
        System.out.println("\nUsing Iterator:");
        for (var iterator = fruits.iterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
        }
    }
}
