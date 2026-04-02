package org.example.projects;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter your second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Choose the operation(add, subtract, multiply, divide): ");
        scanner.nextLine();
        String operation = scanner.nextLine();

        if (operation.equals("+")) {
            System.out.println("Result: " + (num1 + num2));
        } else if (operation.equals("-")) {
            System.out.println("Result: " + (num1 - num2));
        } else if (operation.equals("*")) {
            System.out.println("Result: " + (num1 * num2));
        } else if (operation.equals("/")) {
            if (num2 == 0) {
                System.out.println("Error: Cannot divide by zero!");
            } else {
                System.out.println("Result: " + (num1 / num2));
            }
        } else {
            System.out.println("Unknown operation.");
        }
        scanner.close();
    }

}
