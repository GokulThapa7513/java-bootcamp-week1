package org.example.projects.LibraryBookTracker;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Library lb = new Library();
        Scanner sc = new Scanner(System.in);
        int option;


        do {
            System.out.println("Choose from option 1 to 10");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. View All Books");
            System.out.println("6. View Available Books");
            System.out.println("7. Search by Author");
            System.out.println("8. Search by Title");
            System.out.println("9. Search by Genre");
            System.out.println("10. Exit\n");
            System.out.print("Enter you Choice: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    sc.nextLine();
                    System.out.println("Enter the title of the book: ");
                    String title = sc.nextLine();

                    System.out.println("Enter the author of the book: ");
                    String author = sc.nextLine();

                    System.out.println("Enter the genre of the book: ");
                    String genre = sc.nextLine();

                    System.out.println("Enter the publication year of the book: ");
                    int year = sc.nextInt();

                    Book book = new Book(title, author, genre, year);
                    lb.addBook(book);
                    //lb.addBook(new Book(title, author, genre, year));
                    break;

                case 2:
                    sc.nextLine();
                    System.out.println("Enter the title of the book you want to remove: ");
                    String rmTitle = sc.nextLine();
                    lb.removeBook(rmTitle);
                    System.out.println("Book removed successfully");
                    break;

                case 3:
                    sc.nextLine();
                    System.out.println("Enter the title of the book you want to borrow: ");
                    String brwTitle = sc.nextLine();
                    lb.borrowBook(brwTitle);
                    break;

                case 4:
                    sc.nextLine();
                    System.out.println("Enter the title of the book you want to return: ");
                    String rtnTitle = sc.nextLine();
                    lb.returnBook(rtnTitle);
                    break;

                case 5:
                    sc.nextLine();
                    lb.viewAllBooks();
                    break;

                case 6:
                    sc.nextLine();
                    lb.viewAvailableBooks();
                    break;

                case 7:
                    sc.nextLine();
                    System.out.println("Enter the author to search for the book: ");
                    String authorName = sc.nextLine();
                    System.out.println("Here are the books by the author: " + authorName);
                    lb.searchByAuthor(authorName);
                    break;

                case 8:
                    sc.nextLine();
                    System.out.println("Enter the title to search for the book: ");
                    String titleName = sc.nextLine();
                    System.out.println("Title: " + titleName);
                    lb.searchByTitle(titleName);
                    break;

                case 9:
                    sc.nextLine();
                    System.out.println("Enter the genre to search for the book: ");
                    String genreName = sc.nextLine();
                    System.out.println("Here are the books on the genre: " + genreName);
                    lb.searchByGenre(genreName);
                    break;

                case 10:
                    System.out.println("Good Bye");
                    break;

                default:
                    System.out.println("Invalid option! Please enter the number between 1 and 10");
            }

        }while(option != 10);
        sc.close();
    }
}
