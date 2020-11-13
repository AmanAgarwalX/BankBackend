package com.anz.bank.views;

import com.anz.bank.models.User;
import com.anz.bank.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserView {
    
    @Autowired
    private UserRepository userRepository;

	@CrossOrigin
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public User createUser(@RequestBody User user) {
		return userRepository.save(user);
	}

}
