package org.example.projects.LibraryBookTracker;

public class Book {
    private String title;
    private String author;
    private String genre;
    private int year;
    private boolean isAvailable;

    public Book(String title, String author, String genre, int year) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.year = year;
        this.isAvailable = true;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getGenre() {
        return genre;
    }
    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
    @Override
    public String toString() {
        String status = isAvailable ? "AVAILABLE" : "BORROWED";
        return "[" + status + "]" + title + "|" + author + "|" + genre + "|" + year;
    }
}
