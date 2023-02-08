package org.itstep.homework.bookstore.interfaces;

/*************************************************************************
 *  Интерфейс автора		    					 *
 ************************************************************************/
public interface Author extends Person {
    // Книги написанные этим автором
    Book[] getAllWrittenBook();
}
