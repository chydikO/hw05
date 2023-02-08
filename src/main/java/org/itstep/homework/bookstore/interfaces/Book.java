package org.itstep.homework.bookstore.interfaces;

/*************************************************************************
 *   Интерфейс книги                                                     *
 ************************************************************************/
public interface Book {

    // получить название этой книги.
    String getTitle();

    // получить автора этой книги.
    Author getAuthor();

    // получить год публикации этой книги.
    int  getPublishedYear();

    // получить издание этой книги.
    int getEdition();

    // получить краткое описание этой книги.
    String getDescription();

    // получить цену этой книги.
    float getPrice();
}