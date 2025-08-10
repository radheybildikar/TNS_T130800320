package com.Concept;

import java.util.Deque;
import java.util.ArrayDeque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        // Add elements at both ends
        deque.addFirst("First");
        deque.addLast("Last");
        deque.offerFirst("New First");
        deque.offerLast("New Last");

        System.out.println("Deque after additions: " + deque);

        // Peek at both ends
        System.out.println("Peek First: " + deque.peekFirst());
        System.out.println("Peek Last: " + deque.peekLast());

        // Remove elements from both ends
        System.out.println("Removed First: " + deque.pollFirst());
        System.out.println("Removed Last: " + deque.pollLast());

        System.out.println("Deque after removals: " + deque);

        // Using Deque as Stack (LIFO)
        deque.push("Stack-1"); // push = addFirst
        deque.push("Stack-2");
        System.out.println("Deque as Stack: " + deque);
        System.out.println("Popped from Stack: " + deque.pop()); // pop = removeFirst
    }
}
