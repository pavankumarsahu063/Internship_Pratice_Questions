package com.generics;

public class Main {
	
	public static void main(String[] args) {
		Box<Integer> i=new Box<>();
		
		i.set(10);
		i.set(20);
		
		System.out.println(i.get());
	}

}
