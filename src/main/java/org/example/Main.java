package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      double Espresso = 2.50;
      double Latte = 4.00;
      double Cappuccino = 3.50;
      double totalBill = 0.0;
      int option = 0;
      while(option != 4) {
          System.out.println("1. Espresso ($2.50)");
          System.out.println("2. Latte ($4.00");
          System.out.println("3. Cappuccino ($3.50)");
          System.out.println("4. Finish Order");
          System.out.println("Please enter your option: ");
          option = scanner.nextInt();

          switch (option) {
              case 1:
                  totalBill += Espresso;
                  System.out.println("Added Espresso to your order");
                  break;
              case 2:
                  totalBill += Latte;
                  System.out.println("Added Latte to your order");
                  break;
              case 3:
                  totalBill += Cappuccino;
                  System.out.println("Added Cappuccino to your order");
                  break;
              case 4:
                  System.out.println("Thank you for visiting our cafe");
                  break;
              default:
                  System.out.println("Invalid option. Try Again");
          }
      }
        System.out.println("Total Bill: " + totalBill);

    }

}