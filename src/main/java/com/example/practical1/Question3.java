package com.example.practical1;
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner
        String continueInput; // Input variable

        do {
            System.out.print("Please enter a number: ");
            int num = scanner.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + " is even."); // Even
            } else {
                System.out.println(num + " is odd."); // Odd
            }

            System.out.print("Do you want to enter another number? (Y/N): "); // Continue
            continueInput = scanner.next(); // Read input

        } while (continueInput.equalsIgnoreCase("Y")); // Loop

        scanner.close(); // Close scanner
    }
}
