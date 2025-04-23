package com.security.Reposistory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security.model.Employee;

public interface EmpReposistory extends JpaRepository<Employee, Integer>{
	Employee findByEmail(String email);

}
