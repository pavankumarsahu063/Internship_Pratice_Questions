package com.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.security.model.Employee;
import com.security.service.EmpService;

@RestController
public class EmployeeController {
	
	@Autowired
	private final EmpService empService;
	
	public EmployeeController(EmpService empService) {
		this.empService=empService;
	}
	
	
	@GetMapping("/home")
	public String homePage() {
		return "home";
	}
	
	@PostMapping("/register")
	public String empRegister(@RequestBody Employee employee) {
		if(empService.saveEmp(employee)!=null) {
			return "Register Sucessfull";
		}
		return "Failed to register";
	}
	
	@PostMapping("/login")
	public String emplogin(@RequestBody Employee employee) {
		
	}

}
