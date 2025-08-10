package com.Concept;

import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueMethodsExample {
    public static void main(String[] args) {
        // LinkedList as Queue
        Queue<String> linkedListQueue = new LinkedList<>();

        // add() & offer()
        linkedListQueue.add("A");
        linkedListQueue.add("B");
        linkedListQueue.offer("C");

        System.out.println("LinkedList Queue: " + linkedListQueue);

        // element() & peek()
        System.out.println("Head (element): " + linkedListQueue.element()); // throws exception if empty
        System.out.println("Head (peek): " + linkedListQueue.peek()); // null if empty

        // remove() & poll()
        System.out.println("Removed (remove): " + linkedListQueue.remove()); // exception if empty
        System.out.println("Removed (poll): " + linkedListQueue.poll()); // null if empty

        System.out.println("LinkedList Queue after removals: " + linkedListQueue);

        // PriorityQueue
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(30);
        priorityQueue.add(10);
        priorityQueue.add(20);

        System.out.println("\nPriorityQueue (natural order): " + priorityQueue);
        System.out.println("Peek: " + priorityQueue.peek());
        System.out.println("Poll: " + priorityQueue.poll());
        System.out.println("After Poll: " + priorityQueue);
    }
}
