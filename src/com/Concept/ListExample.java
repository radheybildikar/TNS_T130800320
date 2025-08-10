package com.Concept;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Apple"); // Duplicates allowed

        System.out.println("List elements (ordered, duplicates allowed):");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Access by index
        System.out.println("\nElement at index 1: " + fruits.get(1));
    }
}
