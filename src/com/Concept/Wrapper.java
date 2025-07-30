package com.Concept;

public class Wrapper 
{
    public static void main(String[] args) 
    {
        int num = 10;  // primitive data type

        // Boxing: converting primitive to wrapper
        Integer wrapperNum = Integer.valueOf(num);

        // Auto-boxing (Java does it automatically)
        Integer autoBoxed = num;

        // Unboxing: converting wrapper to primitive
        int unboxed = wrapperNum.intValue();

        System.out.println("Primitive: " + num);
        System.out.println("Boxed: " + wrapperNum);
        System.out.println("Unboxed: " + unboxed);

        // Useful methods from wrapper class
        System.out.println("Binary of 10: " + Integer.toBinaryString(wrapperNum));
        System.out.println("Max Integer value: " + Integer.MAX_VALUE);
    }
}

