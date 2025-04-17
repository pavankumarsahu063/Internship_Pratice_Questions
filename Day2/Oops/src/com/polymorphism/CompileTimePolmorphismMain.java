package com.polymorphism;


//Method Overloading : Multiple methods with the same name but different parameters (within the same class).
class CompileTimePolmorphismMain {
	
	public int add(int a,int b) {
		return a+b;
	}
	
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	
	public double add(double a,double b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		CompileTimePolmorphismMain c=new CompileTimePolmorphismMain();
		System.out.println(c.add(12, 12));
		System.out.println(c.add(12.1, 12.1));
		System.out.println(c.add(1, 2, 4));
		
		
	}

}
 


