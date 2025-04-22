package com.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.dto.StudentPageResponse;
import com.jpa.model.Student;
import com.jpa.repository.StudentRepo;

@RestController
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;
    
    @GetMapping("/all")
    public StudentPageResponse getStudentByPage(
    		@RequestParam(defaultValue = "0") int page,
    		@RequestParam(defaultValue = "5") int size ) {
    	
    	Pageable pageable=PageRequest.of(page, size);
    	Page<Student> pageResult=studentRepo.findAll(pageable);
    	
    	StudentPageResponse studentPageResponse=new StudentPageResponse();
    	studentPageResponse.setCurrentPage(pageResult.getNumber());
    	studentPageResponse.setTotalElemets(pageResult.getTotalElements());
    	studentPageResponse.setTotalPage(pageResult.getTotalPages());
    	studentPageResponse.setLastpage(pageResult.isLast());
    	studentPageResponse.setStudents(pageResult.getContent());
    	
    	return studentPageResponse;
    	
    }
}
