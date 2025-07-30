package com.Concept;

//Interface
interface Vehicle {
 void start();   // abstract method
 void stop();
}

//Class implementing the interface
class Car implements Vehicle {
 public void start() {
     System.out.println("Car started.");
 }

 public void stop() {
     System.out.println("Car stopped.");
 }
}

//Main class
public class Interface {
 public static void main(String[] args) {
     Vehicle myCar = new Car();  // Interface reference to Car object
     myCar.start();
     myCar.stop();
 }
}
