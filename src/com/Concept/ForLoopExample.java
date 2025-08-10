package com.Concept;
public class ForLoopExample {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Cherry"};

        // 1. Normal for loop (using index)
        System.out.println("Using normal for loop:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Index " + i + ": " + fruits[i]);
        }

        // 2. For-each loop (enhanced for loop)
        System.out.println("\nUsing for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
