package com.Concept;

import java.util.Scanner;

public class ControlFlowDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            // Menu using do-while
            System.out.println("\n--- Menu ---");
            System.out.println("1. Grade Checker (if-else)");
            System.out.println("2. Day Finder (switch)");
            System.out.println("3. Count 1 to 5 (for loop)");
            System.out.println("4. Countdown (while loop)");
            System.out.println("5. Skip 3 while counting (continue)");
            System.out.println("6. Stop at 3 (break)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter your marks: ");
                    int marks = sc.nextInt();
                    if (marks >= 90) {
                        System.out.println("Grade: A+");
                    } else if (marks >= 75) {
                        System.out.println("Grade: A");
                    } else if (marks >= 60) {
                        System.out.println("Grade: B");
                    } else {
                        System.out.println("Grade: C or below");
                    }
                    break;

                case 2:
                    System.out.print("Enter day number (1-7): ");
                    int day = sc.nextInt();
                    switch (day) {
                        case 1:
                            System.out.println("Monday");
                            break;
                        case 2:
                            System.out.println("Tuesday");
                            break;
                        case 3:
                            System.out.println("Wednesday");
                            break;
                        case 4:
                            System.out.println("Thursday");
                            break;
                        case 5:
                            System.out.println("Friday");
                            break;
                        case 6:
                            System.out.println("Saturday");
                            break;
                        case 7:
                            System.out.println("Sunday");
                            break;
                        default:
                            System.out.println("Invalid day");
                    }
                    break;

                case 3:
                    System.out.println("Counting from 1 to 5:");
                    for (int i = 1; i <= 5; i++) {
                        System.out.println(i);
                    }
                    break;

                case 4:
                    System.out.println("Countdown from 5 to 1:");
                    int i = 5;
                    while (i >= 1) {
                        System.out.println(i);
                        i--;
                    }
                    break;

                case 5:
                    System.out.println("Counting 1 to 5, skipping 3:");
                    for (int j = 1; j <= 5; j++) {
                        if (j == 3) {
                            continue;
                        }
                        System.out.println(j);
                    }
                    break;

                case 6:
                    System.out.println("Counting 1 to 5, stopping at 3:");
                    for (int j = 1; j <= 5; j++) {
                        if (j == 3) {
                            break;
                        }
                        System.out.println(j);
                    }
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}
