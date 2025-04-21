package com.SpringCore.javabasedconfig;


import org.springframework.beans.factory.annotation.Value;




public class Students {
	
	
	@Value("12")
	private String id;
	
	@Value("pavan")
	private String name;
	
	
	public void display() {
		System.out.println(id+"  "+name);
	}
	

}
