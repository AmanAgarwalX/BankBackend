package com.anz.bank.models;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.anz.bank.repositories.UserRepository;

@Entity
public class Account {

    @Id
    private String id;
    private String phoneNumber;
    private String accountType;
    private String email;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String country;

    @ManyToOne
    private User user;


    
    public Account(){
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return this.id;
    }
    public void setUser(User user) {
        this.user=user;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getAccountType() {
        return this.accountType;
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

    public User getUser() {
        return this.user;
    }
    
}

