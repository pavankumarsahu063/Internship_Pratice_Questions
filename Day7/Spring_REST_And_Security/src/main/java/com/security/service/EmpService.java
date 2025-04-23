package com.security.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.security.Reposistory.EmpReposistory;
import com.security.model.Employee;

@Service
public class EmpService {
	
	private final PasswordEncoder passwordEncoder;
	private final EmpReposistory empReposistory;
	
	public EmpService(EmpReposistory empReposistory,PasswordEncoder passwordEncoder) {
		this.empReposistory=empReposistory;
		this.passwordEncoder=passwordEncoder;
	}
	
	public Employee saveEmp(Employee employee) {
		
		employee.setPassword(passwordEncoder.encode(employee.getPassword()));
		return empReposistory.save(employee);
	}
	
	public Employee loginEmp(Employee employee) {
		return empReposistory.findByEmail(employee.getEmail());
	}

}
