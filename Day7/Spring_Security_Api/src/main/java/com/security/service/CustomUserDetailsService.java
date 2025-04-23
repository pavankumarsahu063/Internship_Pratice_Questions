package com.security.service;


import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.security.config.CustomUserDetails;
import com.security.model.User;
import com.security.reposistory.UserReposistory;

@Service
public class CustomUserDetailsService implements UserDetailsService{
	
	private final UserReposistory userReposistory;
	 public CustomUserDetailsService(UserReposistory userReposistory) {
		this.userReposistory=userReposistory;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		
		User user=userReposistory.findByEmail(username).orElseThrow(()->new UsernameNotFoundException("User Not Present"));
		
		return new CustomUserDetails(user);
	}

}
