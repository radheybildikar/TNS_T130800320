package com.Concept;

public class StringMethods {
    public static void main(String[] args) {
        String str = "  Hello Java World  ";

        System.out.println("Original: '" + str + "'");
        System.out.println("Length: " + str.length());
        System.out.println("Trimmed: '" + str.trim() + "'");
        System.out.println("Character at index 6: " + str.charAt(6));
        System.out.println("Substring(2, 7): '" + str.substring(2, 7) + "'");
        System.out.println("To Upper: " + str.toUpperCase());
        System.out.println("To Lower: " + str.toLowerCase());
        System.out.println("Replace 'Java' with 'Python': " + str.replace("Java", "Python"));
        System.out.println("Starts with '  He': " + str.startsWith("  He"));
        System.out.println("Ends with 'ld  ': " + str.endsWith("ld  "));
        System.out.println("Contains 'Java': " + str.contains("Java"));
        System.out.println("Index of 'Java': " + str.indexOf("Java"));
        System.out.println("Split by space:");
        for (String word : str.trim().split(" ")) {
            System.out.println(word);
        }
    }
}
