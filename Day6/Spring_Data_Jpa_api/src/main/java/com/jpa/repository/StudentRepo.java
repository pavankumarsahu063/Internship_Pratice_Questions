package com.jpa.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{
//	Page<Student> findall(Pageable pageable);
}
