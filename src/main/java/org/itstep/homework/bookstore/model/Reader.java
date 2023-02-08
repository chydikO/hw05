package org.itstep.homework.bookstore.model;

import org.itstep.homework.bookstore.interfaces.Address;
import org.itstep.homework.bookstore.interfaces.Person;

public class Reader implements Person {
    private String name;
    private Address address;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Address getAddress() {
        return address;
    }
}
