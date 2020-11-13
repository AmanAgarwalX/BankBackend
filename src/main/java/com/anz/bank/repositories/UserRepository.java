package com.anz.bank.repositories;

import com.anz.bank.models.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String>{
    
}