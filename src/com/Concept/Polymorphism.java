package com.Concept;

//Parent class (Base Service)
class BankService {
 void processService() {
     System.out.println("Processing generic bank service");
 }

 // Overloaded method (compile-time polymorphism)
 void generateReport(String reportType) {
     System.out.println("Generating generic report: " + reportType);
 }

 void generateReport(String reportType, int year) {
     System.out.println("Generating " + reportType + " report for year: " + year);
 }
}

//Subclass 1: Loan Service
class LoanService extends BankService {
 @Override
 void processService() {
     System.out.println("Processing loan application");
 }

 void approveLoan() {
     System.out.println("Loan approved!");
 }
}

//Subclass 2: Account Service
class AccountService extends BankService {
 @Override
 void processService() {
     System.out.println("Opening a new bank account");
 }

 void closeAccount() {
     System.out.println("Account closed!");
 }
}

//Main class
public class Polymorphism {
 public static void main(String[] args) {
     // Compile-time polymorphism (method overloading)
     BankService bank = new BankService();
     bank.generateReport("Monthly");
     bank.generateReport("Annual", 2025);

     // Runtime polymorphism (method overriding)
     BankService service1 = new LoanService();    // Reference of BankService, object of LoanService
     BankService service2 = new AccountService(); // Reference of BankService, object of AccountService

     service1.processService(); // Calls LoanService's method
     service2.processService(); // Calls AccountService's method

     // Typecasting to access subclass-specific methods
     if (service1 instanceof LoanService) {
         ((LoanService) service1).approveLoan();
     }

     if (service2 instanceof AccountService) {
         ((AccountService) service2).closeAccount();
     }
 }
}
