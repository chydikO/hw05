package org.itstep.homework.bookstore.interfaces;

import java.util.*;

public class AmazonStore implements BookStore {
    private List<Reader> readers;
    private List<BookForSale> booksForSales;
    private Map<String, Integer> booksAmount = new HashMap<>();

    public AmazonStore(List<Reader> readers, List<BookForSale> booksForSales) {
        this.readers = readers;
        this.booksForSales = booksForSales;
    }

    /*
    Этот метод вызвается когда клиент пытается покупает книгу
    В методе необходимо реализовать провекру:
      1. хватает ли заданного количества книг в магазине
      2. не достиг ли кредитный лимит максимального значения

   Если все условия выполняются, тогда возвращается true иначе false.
    */
    @Override
    public boolean buy(Customer customer, Book book, int amount) {

        return false;
    }

    // Добавить книгу в магазин.
    @Override
    public void importBooks(Book book, int amount) {

    }

    // получить все книги с указанным названием из массива книг
    // предполагается, что названия книг не совпадают
    @Override
    public Book[] getBooks(String title) {
        for (Book book: booksForSales) {

        }
        return null;
    }

    // получить количество заданных книг
    @Override
    public int getBookAmount(String title) {
        for (Book book: booksForSales) {
            if (title.toLowerCase().equals(book.getTitle().toLowerCase())) {

            }
        }
        return 0;
    }

    // получить все книги, написанные автором с именем name
    @Override
    public Book[] getBooksByAuthorName(String name) {
        List<Book> books = new ArrayList<>();
        for (Book book: booksForSales) {
            if (name.toLowerCase().equals(book.getAuthor().getName().toLowerCase())) {
                books.add(book);
            }
        }
        return books.toArray(new Book[books.size()]);
    }

    // получить все книги в списке книг
    @Override
    public Book[] getAllBooks() {
        return booksForSales.toArray(new Book[booksForSales.size()]);
    }

    // регистрация клиента
    @Override
    public void register(Customer customer) {

    }

    // удаление клиента
    @Override
    public void remove(Customer customer) {

    }

    // получить клиента по id
    @Override
    public Customer getCustomer(int id) {
        for (Customer customer: readers) {
            if (customer.getID() == id) {
                return customer;
            }
        }
        return null;
    }
}
