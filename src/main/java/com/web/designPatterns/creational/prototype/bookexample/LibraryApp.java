package com.web.designPatterns.creational.prototype.bookexample;

public class LibraryApp {

    public static void main(String[] args) {

        Book baseBook = new Book("Design Patterns", "GoF", "Programming", "000-0000000000");

        // Clone for two different copies with new ISBNs
        Book book1 = baseBook.clone();
        book1.setIsbn("111-1111111111");

        Book book2 = baseBook.clone();
        book2.setIsbn("222-2222222222");

        baseBook.displayInfo();
        book1.displayInfo();
        book2.displayInfo();
    }
}
