package com.anz.bank.repositories;

import java.util.List;

import com.anz.bank.models.Account;

import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, String> {
    public List<Account> findByUserId(String userId);
}