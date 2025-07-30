package com.Concept;

class BankAccount {
    // Private data members
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(String name, double initialBalance) {
        accountHolderName = name;
        balance = initialBalance;
    }

    // Getter for account holder name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Setter for account holder name
    public void setAccountHolderName(String name) {
        accountHolderName = name;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}

public class encapsulation {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Radhey", 1000);

        // Accessing data via getters and setters
        System.out.println("Account Holder: " + acc.getAccountHolderName());
        System.out.println("Initial Balance: Rs. " + acc.getBalance());

        acc.deposit(500);
        System.out.println("After deposit, Balance: Rs. " + acc.getBalance());

        acc.withdraw(300);
        System.out.println("After withdrawal, Balance: Rs. " + acc.getBalance());

        acc.setAccountHolderName("Radhey Bildikar");
        System.out.println("Updated Account Holder: " + acc.getAccountHolderName());
    }
}
