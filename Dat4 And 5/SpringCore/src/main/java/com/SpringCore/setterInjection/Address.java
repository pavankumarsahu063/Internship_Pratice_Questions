package com.SpringCore.setterInjection;

import org.springframework.beans.factory.annotation.Value;

public class Address {
	
	@Value("ban")
	private String city;
	
	public Address() {
		
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public void display() {
		System.out.println(city);
	}
	
}
