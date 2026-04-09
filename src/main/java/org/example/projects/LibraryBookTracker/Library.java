package org.example.projects.LibraryBookTracker;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " successfully added");
    }
    public void removeBook(String title) {
        Book toRemove = null;
       for(Book b : books) {
           if(b.getTitle().equalsIgnoreCase(title)) {
               toRemove = b;
               break;
           }
       }
       if(toRemove != null) {
           books.remove(toRemove);
           System.out.println("Book successfully removed!");
       }else {
           System.out.println("Book not found!");
       }
    }
    public void borrowBook(String title) {
        boolean found = false;
        for(Book b : books) {
            if(b.getTitle().equalsIgnoreCase(title)) {
                found =  true;
                if(!b.isAvailable()) {
                    System.out.println("Already Burrowed");
                }else{
                    b.setAvailable(false);
                    System.out.println("Borrowed successfully");
                }
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found.");
        }

    }

    public void returnBook(String title) {
        boolean found = false;
        for (Book b : books) {
            if(b.getTitle().equalsIgnoreCase(title)) {
                found = true;
                if(b.isAvailable()){
                    System.out.println("Book was not burrowed");
                }else {
                    b.setAvailable(true);
                    System.out.println("Returned Successfully");
                }
                break;
            }

        }
        if(!found) {
            System.out.println("Book not found");
        }
    }
    public void viewAllBooks() {
        if(books.isEmpty()){
            System.out.println("No books in the library");
        }else {
            for (Book b : books) {
                System.out.println(b);
            }
        }
    }

    public void viewAvailableBooks() {
        if(books.isEmpty()) {
            System.out.println("No Books in the library");
        }else {
            boolean found = false;
            for (Book b : books) {
                if(b.isAvailable()) {
                    System.out.println(b);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No Books Available");
            }
        }
    }

    public void searchByAuthor(String author) {
        int count = 0;
        for(Book b : books) {
            if(b.getAuthor().equalsIgnoreCase(author)) {
                System.out.println(b);
                count++;
            }
            }
        if (count == 0) {
            System.out.println("No books found by that author");
        }else {
            System.out.println("Found" + count + " books");
        }
        }
    public  void searchByTitle(String title) {
        Book found = null;
        for(Book b : books) {
            if(b.getTitle().equalsIgnoreCase(title)) {
                found = b;
                break;
            }
        }
        if (found != null) {
            System.out.println(found);
        }
        else {
            System.out.println("No Books Found");
        }
    }

    public void searchByGenre(String genre) {
        int count = 0;
        for (Book b : books) {
            if (b.getGenre().equalsIgnoreCase(genre)) {
                System.out.println(b);
                count++;
            }
        }
        if(count == 0) {
            System.out.println("No books were found on this genre");
        }else {
            System.out.println("Found" + count + " books");
        }
    }


}
