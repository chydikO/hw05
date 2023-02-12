package org.itstep.homework.bookstore.interfaces;

import org.itstep.homework.bookstore.interfaces.Address;
import org.itstep.homework.bookstore.interfaces.Person;

import java.util.Objects;

public class Reader implements Person, Customer {
    private static int id = 0;
    private final String name;
    private final Address address;
    private String password;
    private final Credit credit;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reader reader = (Reader) o;
        return Objects.equals(name, reader.name) && Objects.equals(address, reader.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", password='" + password + '\'' +
                ", credit=" + credit +
                '}';
    }
}
