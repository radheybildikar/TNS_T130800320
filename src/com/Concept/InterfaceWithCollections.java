package com.Concept;

import java.util.List;
import java.util.LinkedList;
import java.util.Vector;

public class InterfaceWithCollections {
    public static void main(String[] args) {
        // Using List interface reference for LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        System.out.println("LinkedList elements (via List interface):");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        // Using List interface reference for Vector
        List<String> vectorList = new Vector<>();
        vectorList.add("Red");
        vectorList.add("Green");
        vectorList.add("Blue");

        System.out.println("\nVector elements (via List interface):");
        for (String color : vectorList) {
            System.out.println(color);
        }

        // Showing polymorphism: same interface, different implementations
        processList(linkedList);
        processList(vectorList);
    }

    // Method that works on any List (LinkedList, Vector, ArrayList, etc.)
    public static void processList(List<String> list) {
        System.out.println("\nProcessing List (size = " + list.size() + "): " + list);
    }
}
