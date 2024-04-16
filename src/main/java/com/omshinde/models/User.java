package com.omshinde.models;

import java.util.List;
import java.util.Objects;

public class User {
    private Credentials credentials;
    private String firstName;
    private String lastName;
    private String country;
    private List<Address> addressList;

    public void addAddress(Address address){
        addressList.add(address);
    }

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
