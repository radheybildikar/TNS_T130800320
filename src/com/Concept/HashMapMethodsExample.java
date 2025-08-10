package com.Concept;

import java.util.HashMap;
import java.util.Map;

public class HashMapMethodsExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        // put()
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // get()
        System.out.println("Value for key 2: " + map.get(2));

        // containsKey(), containsValue()
        System.out.println("Contains key 3? " + map.containsKey(3));
        System.out.println("Contains value 'Apple'? " + map.containsValue("Apple"));

        // remove()
        map.remove(1);
        System.out.println("After removing key 1: " + map);

        // keySet(), values(), entrySet()
        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());
        System.out.println("Entries: " + map.entrySet());

        // replace()
        map.replace(2, "Blueberry");
        System.out.println("After replacing key 2: " + map);

        // putIfAbsent()
        map.putIfAbsent(4, "Dragonfruit");
        System.out.println("After putIfAbsent: " + map);

        // Iterating using for-each
        System.out.println("Iterating over map:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // clear()
        map.clear();
        System.out.println("After clear: " + map);
    }
}
