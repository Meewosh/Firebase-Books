package com.example.firebase_books;

public class Book {
    private String title;
    private String author;
    private String category_name;

    public Book() {}

    public Book(String title, String author, String category_name) {
        this.title = title;
        this.author = author;
        this.category_name = category_name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }
}
