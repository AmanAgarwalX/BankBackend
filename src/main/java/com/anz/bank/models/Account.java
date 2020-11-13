package com.anz.bank.models;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Account {

    @Id
    private String id;
    private String phoneNumber;
    private String pan;
    private String aadhar;
    private String company;

    @ManyToOne
    private User user;


    
    public Account(){
        this.id = UUID.randomUUID().toString();
    }
    public void setUser(User user) {
        this.user=user;
    }


    public String getId() {
        return this.id;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getPan() {
        return this.pan;
    }

    public String getAadhar() {
        return this.aadhar;
    }

    public String getCompany() {
        return this.company;
    }

    public User getUser() {
        return this.user;
    }
    
}

