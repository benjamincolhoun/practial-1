
package com.example.practical1;
//import scanner
import java.util.Scanner;
public class Question1 {

    public static void main(String[] args) {

        //import scanner
        Scanner scanner = new Scanner(System.in);
        //grab what is said
        System.out.print("Enter initial: ");
        char initial = scanner.next().charAt(0);

        System.out.print("Enter surname: ");
        String surname = scanner.next();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Are you employed (true/false): ");
        boolean isEmployed = scanner.nextBoolean();
        //output
        System.out.println(initial + " " + surname + " is " + age + " years old, is currently " + (isEmployed ? "employed" : "unemployed") + " and has a salary of £" + salary + " per year.");
        //close scanner
        scanner.close();

    }
}