package org.itstep.homework.bookstore;

public class BookForSale implements Book {
    private String title;
    private Author author;
    private int publishedYear;
    private int edition;
    private String description;
    private float price;

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public Author getAuthor() {
        return author;
    }

    @Override
    public int getPublishedYear() {
        return publishedYear;
    }

    @Override
    public int getEdition() {
        return edition;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public float getPrice() {
        return price;
    }
}
