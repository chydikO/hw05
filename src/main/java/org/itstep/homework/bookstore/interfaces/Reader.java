package org.itstep.homework.bookstore.interfaces;

import org.itstep.homework.bookstore.interfaces.Address;
import org.itstep.homework.bookstore.interfaces.Person;

public class Reader implements Person, Customer {
    private static int id = 0;
    private String name;
    private Address address;
    private String password;
    private Credit credit;

    public Reader(String name, Address address, String password, Credit credit) {
        this.name = name;
        this.address = address;
        this.credit = credit;
        this.password = password;
        this.id++;
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
    public int getID() {
        return id;
    }

    @Override
    public Credit getCredit() {
        return credit;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }
}
