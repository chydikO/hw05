package org.itstep.homework.bookstore;

import java.util.*;

public class AmazonStore implements BookStore {
    private final List<Customer> readers;
    private final List<Book> booksForSales;
    private final Map<String, Integer> booksAmount;

    public AmazonStore(List<Customer> readers, List<Book> booksForSales, Map<String, Integer> booksAmount) {
        this.readers = readers;
        this.booksForSales = booksForSales;
        this.booksAmount = booksAmount;
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
        //1. хватает ли заданного количества книг в магазине
        if (booksForSales.contains(book)) {
            int quantity = booksAmount.get(book.getTitle());
            if (quantity > amount) {
                return false;
            }
        }
        //2. не достиг ли кредитный лимит максимального значения
        if (customer.getCredit().getDebit() + (book.getPrice() * amount) > Credit.MAX_AMOUNT) {
            return false;
        }
        // убираем кол-во книг из booksAmount, если Title - кол-во == 0 , удаляем книгу из
        //  booksAmount и booksForSales return false else return true
        // обрабатываем кошелек покупателя
        int newCountOfBooks = getBookAmount(book.getTitle()) - amount;
        customer.getCredit().addDebit((int) (book.getPrice() * amount));

        if ( newCountOfBooks == 0) {
            booksAmount.remove(book.getTitle());
            booksForSales.remove(book);
            return true;
        } else {
            booksAmount.put(book.getTitle(), newCountOfBooks);
        }
        return true;
    }

    // Добавить книгу в магазин.
    @Override
    public void importBooks(Book book, int amount) {
        if (booksForSales.contains(book)) {
            int quantity = booksAmount.get(book.getTitle());
            booksAmount.replace(book.getTitle(), quantity + amount);
        } else {
            booksAmount.put(book.getTitle(), amount);
        }
    }

    // получить все книги с указанным названием из массива книг
    // предполагается, что названия книг не совпадают
    @Override
    public Book[] getBooks(String title) {
        List<Book> books = new ArrayList<>();
        for (Book book: booksForSales) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                books.add(book);
            }
        }
        return books.toArray(new Book[0]);
    }

    // получить количество заданных книг
    @Override
    public int getBookAmount(String title) {
        return booksAmount.get(title);
    }

    // получить все книги, написанные автором с именем name
    @Override
    public Book[] getBooksByAuthorName(String name) {
        List<Book> books = new ArrayList<>();
        for (Book book: booksForSales) {
            if (name.equalsIgnoreCase(book.getAuthor().getName())) {
                books.add(book);
            }
        }
        return books.toArray(new Book[books.size()]);
    }

    // получить все книги в списке книг
    @Override
    public Book[] getAllBooks() {
        return booksForSales.toArray(new Book[0]);
    }

    // регистрация клиента
    @Override
    public void register(Customer customer) {
        boolean isPresent = false;
        for (Customer reader : readers) {
            if (customer.equals(reader)) {
                isPresent = true;
                System.err.println("Customer is present");
                System.err.println(getCustomer(customer.getID()).toString());
                break;
            }
        }
        if (!isPresent) {
            readers.add(customer);
            System.out.println("Customer added");
        }
    }

    // удаление клиента
    @Override
    public void remove(Customer customer) {
        if (!readers.remove(customer)) {
            System.err.println(customer.toString() + "\tCustomer not present");
        }
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
