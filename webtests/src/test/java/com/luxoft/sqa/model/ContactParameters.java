package com.luxoft.sqa.model;

public class ContactParameters {
    String firstname;
    String lastname;
    String address;
    String email;

    public ContactParameters(String firstname, String lastname, String address, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.email = email;
    }

    public String getFirstname() {

        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }
}
