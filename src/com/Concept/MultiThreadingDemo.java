package com.Concept;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name); // set thread name
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(getName() + " - Count: " + i + " - Priority: " + getPriority());

                // Let other threads execute
                if (i == 3) {
                    System.out.println(getName() + " is yielding...");
                    Thread.yield();
                }

                // Sleep for demonstration
                Thread.sleep(500);

                // Check if thread is interrupted
                if (isInterrupted()) {
                    System.out.println(getName() + " was interrupted! Stopping early...");
                    return;
                }
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " interrupted during sleep!");
        }
    }
}

public class MultiThreadingDemo {
    public static void main(String[] args) {
        // Create threads
        MyThread t1 = new MyThread("Worker-1");
        MyThread t2 = new MyThread("Worker-2");

        // Change thread priority (1 = min, 5 = normal, 10 = max)
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        // Start threads
        t1.start();
        t2.start();

        // Check if threads are alive
        System.out.println("t1 alive? " + t1.isAlive());
        System.out.println("t2 alive? " + t2.isAlive());

        // Rename main thread
        Thread.currentThread().setName("Main-Thread");
        System.out.println("Current Thread: " + Thread.currentThread().getName());

        // Main thread waits for t1 to finish
        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting for t1");
        }

        // Interrupt t2 after t1 finishes
        t2.interrupt();

        // Wait for t2 to finish
        try {
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting for t2");
        }

        System.out.println("t1 alive after join? " + t1.isAlive());
        System.out.println("t2 alive after join? " + t2.isAlive());

        System.out.println("All threads finished!");
    }
}
