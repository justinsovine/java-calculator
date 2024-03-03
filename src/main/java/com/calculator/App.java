package com.calculator;

import java.util.Scanner;

/**
 * Calculator
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        // Fetch input
        System.out.println("\nWelcome to java-calculator. Please enter a non-algebraic expression.");
        System.out.print(">> ");
        String expression = scanner.nextLine();
        
        /*
         * Tokenization (Lexical Analysis)
         * - Break down the input string into smaller units called tokens.
         * - Tokens can represent numbers, operators, parentheses, etc.
         * - Use a lexer or tokenizer to perform this step.
         */
        System.out.println("\nTokenizing the input string...");

        /*
         * Parsing (Syntax Analysis)
         * - Create a parser that understands the structure of the expression based on the tokens.
         * - Build a syntax tree (AST) or use another data structure to represent the hierarchical structure of the expression.
         */
        System.out.println("Parsing the expression...");

        /*
         * Validation (Semantic Analysis)
         * - Check if the expression is syntactically and semantically valid. 
         * - Ensure that parentheses are balanced, operators are applied to the correct operands, etc.
         */
        System.out.println("Validating the expression...");

        /*
         * Evaluation
         * - Traverse the syntax tree or use another algorithm to evaluate the expression.
         * - Perform the actual calculations, respecting the order of operations (parentheses, exponentiation, multiplication/division, addition/subtraction).
         */
        System.out.println("Evaluating the expression...");

        /*
         * Display result
         */
        System.out.println("\nSorry, this feature isn't completed yet.");

        // Exit program
        System.out.println("Goodbye...\n");
    }

    /*
     * Performs addition on two doubles
     */
    public static double add(double a, double b) {
        return a + b;
    }

    /*
     * Performs subtraction on two doubles
     */
    public static double subtract(double a, double b) {
        return a - b;
    }

    /*
     * Performs multiplication on two doubles
     */
    public static double multiply(double a, double b) {
        return a * b;
    }

    /*
     * Performs division on two doubles
     */
    public static double divide(double a, double b) {
        return a / b;
    }
}
