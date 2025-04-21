package com.SpringCore.setterInjection;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private int id;
	private String name;
	
	private Address address;
	
	public Student() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}
	
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void display() {
		System.out.println(id);
		System.out.println(name);
		
		address.display();
	}
	
	

}
