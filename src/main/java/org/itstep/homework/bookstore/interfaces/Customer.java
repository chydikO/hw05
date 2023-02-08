package org.itstep.homework.bookstore.interfaces;

import org.itstep.homework.bookstore.model.Credit;

/*************************************************************************
 *  Интерфейс покупателя	    					 *
 ************************************************************************/
public interface Customer extends Person {
    // id клиента
    int getID();
    // кредит клиента
    Credit getCredit();
    // задание пароля
    void setPassword(String passwd);
}
