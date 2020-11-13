package com.anz.bank.models;

import java.util.Objects;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class User {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String country;

    public User(){
        this.id = UUID.randomUUID().toString();
    }


    public String getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getAddress() {
        return this.address;
    }

    public String getCity() {
        return this.city;
    }

    public String getState() {
        return this.state;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public String getCountry() {
        return this.country;
    }


}
