package com.Concept;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.LinkedList;

public class DequeMethodsExample {
    public static void main(String[] args) {
        // ArrayDeque
        Deque<String> arrayDeque = new ArrayDeque<>();

        // addFirst(), addLast(), offerFirst(), offerLast()
        arrayDeque.addFirst("A1");
        arrayDeque.addLast("A2");
        arrayDeque.offerFirst("A0");
        arrayDeque.offerLast("A3");

        System.out.println("ArrayDeque: " + arrayDeque);

        // peekFirst(), peekLast()
        System.out.println("First Element: " + arrayDeque.peekFirst());
        System.out.println("Last Element: " + arrayDeque.peekLast());

        // pollFirst(), pollLast()
        System.out.println("Removed First: " + arrayDeque.pollFirst());
        System.out.println("Removed Last: " + arrayDeque.pollLast());
        System.out.println("After Removals: " + arrayDeque);

        // LinkedList as Deque
        Deque<Integer> linkedListDeque = new LinkedList<>();
        linkedListDeque.addFirst(1);
        linkedListDeque.addLast(2);
        linkedListDeque.offerFirst(0);
        linkedListDeque.offerLast(3);

        System.out.println("\nLinkedList Deque: " + linkedListDeque);
        System.out.println("Pop from front (pop): " + linkedListDeque.pop()); // stack style
        linkedListDeque.push(100); // add to front
        System.out.println("After push: " + linkedListDeque);
    }
}
