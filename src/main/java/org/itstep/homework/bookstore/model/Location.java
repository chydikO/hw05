package org.itstep.homework.bookstore.model;

import org.itstep.homework.bookstore.interfaces.Address;

public class Location implements Address {
    private String streetName;
    private int streetNumber;
    private String city;
    private String state;
    private String zipCode;

    public Location(String streetName, int streetNumber, String city, String state, String zipCode) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    @Override
    public String getStreetName() {
        return streetName;
    }

    @Override
    public int getStreetNumber() {
        return streetNumber;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public String getState() {
        return state;
    }

    @Override
    public String getZipCode() {
        return zipCode;
    }

    @Override
    public boolean equals(Address addr) {
        if (this == addr) {
            return true;
        }
        if (addr == null) {
            return false;
        }
        return this.streetName.equals(addr.getStreetName())
                && this.streetNumber == addr.getStreetNumber()
                && this.city.equals(addr.getCity())
                && this.state.equals(addr.getState())
                && this.zipCode.equals(addr.getZipCode());
    }
}
