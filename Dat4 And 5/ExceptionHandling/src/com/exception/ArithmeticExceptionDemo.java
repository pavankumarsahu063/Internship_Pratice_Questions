package com.exception;

public abstract class ArithmeticExceptionDemo {
	
	
	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		
		try {
			System.out.println(a/b);
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		finally {
			System.out.println("Finally Block");
		}
	}

}
