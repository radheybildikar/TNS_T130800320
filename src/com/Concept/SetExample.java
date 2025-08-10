package com.Concept;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> countries = new HashSet<>();

        countries.add("India");
        countries.add("USA");
        countries.add("Canada");
        countries.add("India"); // Duplicate - ignored

        System.out.println("Set elements (unordered, no duplicates):");
        for (String country : countries) {
            System.out.println(country);
        }
    }
}
