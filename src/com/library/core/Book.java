package com.library.core;

public class Book {

    private int book_id;
    private String title;

 Author author;
 Category category;

 private boolean isBorrowed;

    public int getBook_id() {
        return book_id;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public Category getCategory() {
        return category;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book_id=" + book_id +
                ", title='" + title + '\'' +
                ", author=" + author +
                ", category=" + category +
                ", isBorrowed=" + isBorrowed +
                '}';
    }
}
