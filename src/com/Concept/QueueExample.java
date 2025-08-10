package com.Concept;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> tasks = new LinkedList<>();

        tasks.add("Task 1");
        tasks.add("Task 2");
        tasks.add("Task 3");

        System.out.println("Queue elements (FIFO order): " + tasks);

        // Remove (poll) elements in FIFO order
        System.out.println("Processing: " + tasks.poll()); // removes first element
        System.out.println("Processing: " + tasks.poll());

        System.out.println("Remaining Queue: " + tasks);
    }
}
