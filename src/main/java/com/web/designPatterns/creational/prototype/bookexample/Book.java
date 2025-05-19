package com.web.designPatterns.creational.prototype.bookexample;

public class Book implements BookPrototype{
    private String title;
    private String author;
    private String genre;
    private String isbn;

    public Book(String title, String author, String genre, String isbn) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isbn = isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void displayInfo() {
        System.out.println("Book => Title: " + title + ", Author: " + author +
                ", Genre: " + genre + ", ISBN: " + isbn);
    }
    @Override
    public Book clone() {
        return new Book(this.title, this.author, this.genre, this.isbn);
    }
}
