package com.Concept;

//Base class
class Employee {
 String name;
 int id;

 Employee(String name, int id) {
     this.name = name;
     this.id = id;
 }

 void displayInfo() {
     System.out.println("Name: " + name);
     System.out.println("ID: " + id);
 }
}

//Child class 1 (Single Inheritance)
class Manager extends Employee {
 String department;

 Manager(String name, int id, String department) {
     super(name, id); // call to superclass constructor
     this.department = department;
 }

 void manageTeam() {
     System.out.println(name + " manages " + department + " department.");
 }
}

//Child class 2 (Hierarchical Inheritance)
class Developer extends Employee {
 String tech;

 Developer(String name, int id, String tech) {
     super(name, id);
     this.tech = tech;
 }

 void writeCode() {
     System.out.println(name + " writes code in " + tech);
 }
}

//Multilevel Inheritance
class SeniorDeveloper extends Developer {
 int yearsOfExperience;

 SeniorDeveloper(String name, int id, String tech, int yearsOfExperience) {
     super(name, id, tech);
     this.yearsOfExperience = yearsOfExperience;
 }

 void reviewCode() {
     System.out.println(name + " reviews code with " + yearsOfExperience + " years of experience.");
 }
}

//Main class
public class Inheritance {
 public static void main(String[] args) {
     // Single Inheritance
     Manager m1 = new Manager("Alice", 1001, "Sales");
     m1.displayInfo();
     m1.manageTeam();

     System.out.println();

     // Hierarchical Inheritance
     Developer d1 = new Developer("Bob", 1002, "Java");
     d1.displayInfo();
     d1.writeCode();

     System.out.println();

     // Multilevel Inheritance
     SeniorDeveloper sd1 = new SeniorDeveloper("Charlie", 1003, "Python", 6);
     sd1.displayInfo();
     sd1.writeCode(); // From Developer
     sd1.reviewCode(); // From SeniorDeveloper
 }
}

