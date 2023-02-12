package org.itstep.homework.bookstore;

public class Writer implements Author {
    private String name;
    private Address address;
    private Book[] books;

    public Writer(String name, Address address, Book[] books) {
        this.name = name;
        this.address = address;
        this.books = books;
    }

    @Override
    public Book[] getAllWrittenBook() {
        return books;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Address getAddress() {
        return address;
    }
}
