package com.Concept;

import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println("PriorityQueue (natural order): " + pq);

        while (!pq.isEmpty()) {
            System.out.println("Processing: " + pq.poll());
        }
    }
}
