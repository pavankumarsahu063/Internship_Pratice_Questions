package com.jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Address {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addId;
	private String city;
	

}
