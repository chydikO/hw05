package org.itstep.homework.bookstore.interfaces;

import org.itstep.homework.bookstore.interfaces.Address;
import org.itstep.homework.bookstore.interfaces.Person;

public class Reader implements Person {
    private String name;
    private Address address;

    public Reader(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
