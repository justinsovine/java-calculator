package com.calculator;

/**
 * Calculator
 */
public class App 
{
    public static void main( String[] args )
    {
        // Define variables
        double a = 10;
        double b = 5;

        // Newline
        System.out.println("");

        // Addition
        double additionResult = add(a, b);
        System.out.println("Adding " + a + " and " + b + " results in: " + additionResult);

        // Subtraction
        double subtractionResult = subtract(a, b);
        System.out.println("Subtracting " + a + " and " + b + " results in: " + subtractionResult);

        // Newline
        System.out.println("");
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }
}
