package com.example;

import java.util.Scanner;

/**
 * A simple program that takes 3 numbers and adds them together.
 */
public class NumberAdder {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Number Adder ===");
        System.out.println("This program adds three numbers together.");
        
        try {
            // Get the first number
            System.out.print("Enter the first number: ");
            double num1 = getValidNumber(scanner);
            
            // Get the second number
            System.out.print("Enter the second number: ");
            double num2 = getValidNumber(scanner);
            
            // Get the third number
            System.out.print("Enter the third number: ");
            double num3 = getValidNumber(scanner);
            
            // Calculate the sum
            double sum = addNumbers(num1, num2, num3);
            
            // Display the result
            System.out.println("\n=== Result ===");
            System.out.printf("%.2f + %.2f + %.2f = %.2f%n", num1, num2, num3, sum);
            
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
    
    /**
     * Adds three numbers together.
     * 
     * @param a the first number
     * @param b the second number
     * @param c the third number
     * @return the sum of the three numbers
     */
    public static double addNumbers(double a, double b, double c) {
        return a + b + c;
    }
    
    /**
     * Gets a valid number from user input.
     * 
     * @param scanner the Scanner object to read input
     * @return the valid number entered by the user
     */
    private static double getValidNumber(Scanner scanner) {
        while (true) {
            try {
                String input = scanner.nextLine().trim();
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a valid number: ");
            }
        }
    }
} 