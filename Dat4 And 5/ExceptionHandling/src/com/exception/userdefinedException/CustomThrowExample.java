package com.exception.userdefinedException;

public class CustomThrowExample {
	
	public static void main(String[] args) {
		
		int age=10;
		
		try {
			if(age<18) {
				throw new MyException("Access Denied");
			}
		}
		catch (MyException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
