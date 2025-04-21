package com.exception;

public class NullPointerExceptionDemo {
	public static void main(String[] args) {
		String str="";
		
		try {
			System.out.println(str.charAt(1));
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
