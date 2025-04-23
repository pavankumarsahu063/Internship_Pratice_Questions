package com.security.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.security.model.User;
import com.security.reposistory.UserReposistory;

@RestController
public class UserController {
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private UserReposistory userReposistory;
	
	
	@GetMapping("/home")
	public String homePage() {
		return "Home Page";
	}
	
	@PostMapping("/register")
	public String register(@RequestBody User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		userReposistory.save(user);
		return "Registered";
	}
	
	@PostMapping("/login")
	public String login(@RequestBody User user) {
	var u=userReposistory.findByEmail(user.getEmail());
	if(!Objects.isNull(u))
		return "Login Sucess";
	return "Failed";
	}

}
