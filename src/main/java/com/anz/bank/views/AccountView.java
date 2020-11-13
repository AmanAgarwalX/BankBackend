package com.anz.bank.views;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.anz.bank.models.Account;
import com.anz.bank.models.User;
import com.anz.bank.repositories.AccountRepository;
import com.anz.bank.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountView {

	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private UserRepository userRepository;

	@CrossOrigin
	@RequestMapping(value = "/account/{userId}", method = RequestMethod.POST)
	public List<Account> createAccount(@RequestBody Account account, @PathVariable String userId) {
		User user= userRepository.findById(userId).get();
		account.setUser(user);
		accountRepository.save(account);
		return accountRepository.findByUserId(userId);
	}

}
