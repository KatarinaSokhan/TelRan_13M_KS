package de.telran.dao;

import de.telran.data.Book;

public class Library {
    private Book[] books;
    private int size;

    public Library(int capacity) {
        books = new Book[capacity];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean addBook(Book book) {
        if (size < books.length) {
            books[size] = book;
            size++;
            return true;
        }
        return false;
    }

    public boolean deleteBook(Book book) {
        for (int i = 0; i < size; i++) {
            if (books[i].equals(book)) {
                books[i] = books[size - 1];
                size--;
                return true;
            }
        }
        return false;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }


    public void searchBookByAuthor(String author) {
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().equalsIgnoreCase(author)) {
                System.out.println(books[i]);
                flag = true;
            }

        }
        if (!flag) {
            System.out.println("book is not found");
        }
    }


    public void searchBookByTitle(String title) {
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println(books[i]);
                flag = true;
            }

        }
        if (!flag) {
            System.out.println("book is not found");
        }
    }

    public Book getNewestBook() {
        int lastYear = books[0].getDateOfIssue();
        Book newestBook = books[0];
        for (int i = 1; i < size; i++) {
            if (books[i].getDateOfIssue() > lastYear) {
                lastYear = books[i].getDateOfIssue();
                newestBook = books[i];
            }
        }
        return newestBook;
    }
}

