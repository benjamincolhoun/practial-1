package com.example.practical1;
import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        // Create scanner
        Scanner scanner = new Scanner(System.in);

        // Get input
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        // Show menu
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        // Get choice
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        // Perform operations
        if (choice == 1) {
            System.out.println("Sum: " + (a + b));
        } else if (choice == 2) {
            System.out.println("Difference: " + (a - b));
        } else if (choice == 3) {
            System.out.println("Product: " + (a * b));
        } else if (choice == 4) {
            // Division and check for zero
            if (b != 0) {
                double quotient = (double) a / b;
                System.out.println("Quotient: " + quotient);
            } else {
                System.out.println("Error: Division by zero is undefined.");
            }
        } else {
            // Invalid choice
            System.out.println("Invalid choice. Please choose a number between 1 and 4.");
        }

        // Close scanner
        scanner.close();
    }
}
