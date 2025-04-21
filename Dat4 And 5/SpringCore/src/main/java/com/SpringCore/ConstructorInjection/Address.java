package com.SpringCore.ConstructorInjection;

public class Address {
	
	private String city;
	
	public Address(String city) {
		this.city=city;
	}
	
	public void displayCity() {
		System.out.println("City "+city);
	}
	

}
