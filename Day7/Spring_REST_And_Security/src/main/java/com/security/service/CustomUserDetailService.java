package com.security.service;

import java.util.Collections;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.security.Reposistory.EmpReposistory;
import com.security.model.Employee;

public class CustomUserDetailService implements UserDetailsService{
	
	private final EmpReposistory empReposistory;
	
    public CustomUserDetailService(EmpReposistory empReposistory) {
		
    	this.empReposistory=empReposistory;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		Employee employee=empReposistory.findByEmail(username);
		if(employee==null) {
			throw new UsernameNotFoundException("User Is Not Found");
		}
		return new User(
				employee.getEmail(),
				employee.getPassword(),
				Collections.singleton(new SimpleGrantedAuthority("ROLE_USER"))
				);
	}

}
