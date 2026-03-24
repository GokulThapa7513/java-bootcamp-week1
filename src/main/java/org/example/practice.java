package org.example;

public class practice {
    public static void main(String[] args) {
        int winningNumber = 2;

        switch (winningNumber) {
            case 1:
                System.out.println("You won a sticker!");
            case 2:
                System.out.println("You won a t-shirt!");
            case 3:
                System.out.println("You won a car!");
                break;
            default:
                System.out.println("Play again.");
        }
    }
}
