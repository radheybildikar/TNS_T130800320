package com.Concept;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashExample {
    public static void main(String[] args) {
        
        // ---------------- HASHSET EXAMPLE ----------------
        System.out.println("=== HashSet Example ===");
        
        // Create a HashSet of student names (no duplicates allowed)
        Set<String> students = new HashSet<>();
        
        // Adding elements
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("Alice"); // Duplicate, will not be added
        
        // Display elements
        System.out.println("Students: " + students);
        
        // Check if a student exists
        System.out.println("Contains Bob? " + students.contains("Bob"));
        
        // Remove a student
        students.remove("Charlie");
        System.out.println("After removing Charlie: " + students);
        
        // Size of HashSet
        System.out.println("Total students: " + students.size());
        
        // Iterating through HashSet
        for (String s : students) {
            System.out.println("Student: " + s);
        }
        
        // Clear all students
        students.clear();
        System.out.println("After clearing: " + students);
        
        
        // ---------------- HASHMAP EXAMPLE ----------------
        System.out.println("\n=== HashMap Example ===");
        
        // Create a HashMap to store Roll Number → Course
        Map<Integer, String> studentCourses = new HashMap<>();
        
        // Adding entries
        studentCourses.put(101, "Math");
        studentCourses.put(102, "Physics");
        studentCourses.put(103, "Chemistry");
        
        // Display the HashMap
        System.out.println("Student Courses: " + studentCourses);
        
        // Get course for a specific roll number
        System.out.println("Course for Roll 102: " + studentCourses.get(102));
        
        // Check if a roll number exists
        System.out.println("Contains Roll 104? " + studentCourses.containsKey(104));
        
        // Check if a course exists
        System.out.println("Contains course 'Math'? " + studentCourses.containsValue("Math"));
        
        // Remove a student by roll number
        studentCourses.remove(103);
        System.out.println("After removing Roll 103: " + studentCourses);
        
        // Replace a course
        studentCourses.replace(101, "Biology");
        System.out.println("After replacing Roll 101's course: " + studentCourses);
        
        // Iterating through HashMap
        for (Map.Entry<Integer, String> entry : studentCourses.entrySet()) {
            System.out.println("Roll: " + entry.getKey() + ", Course: " + entry.getValue());
        }
        
        // Clear HashMap
        studentCourses.clear();
        System.out.println("After clearing: " + studentCourses);
    }
}
