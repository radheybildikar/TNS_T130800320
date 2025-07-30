package com.Concept;

//Abstract base class representing the concept of a shape
abstract class Shape {
 // Abstract method (no implementation)
 public abstract double area();

 // Concrete method (has implementation)
 public void display() {
     System.out.println("This is a shape.");
 }
}

//Rectangle class implements its own version of area()
class Rectangle extends Shape {
 private double length;
 private double width;

 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 // Providing the implementation of area() for rectangle
 public double area() {
     return length * width;
 }
}

//Circle class implements its own version of area()
class Circle extends Shape {
 private double radius;

 public Circle(double radius) {
     this.radius = radius;
 }

 // Providing the implementation of area() for circle
 public double area() {
     return Math.PI * radius * radius;
 }
}

//Usage
public class Abstractions {
 public static void main(String[] args) {
     Shape rect = new Rectangle(5, 4);
     Shape circle = new Circle(3);

     rect.display();                      // Output: This is a shape.
     System.out.println("Area of rectangle: " + rect.area());  // 20.0

     circle.display();                    // Output: This is a shape.
     System.out.println("Area of circle: " + circle.area());   // 28.274333882308138
 }
}
