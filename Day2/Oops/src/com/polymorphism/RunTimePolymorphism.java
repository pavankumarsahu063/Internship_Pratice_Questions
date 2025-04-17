package com.polymorphism;


class Person{
	String name;
	int age;
	
	public void work() {
		System.out.println("Working");
	}
}
class Student extends Person{
	@Override
	public void work() {
		System.out.println("Student doing his work");
	}
}

public class RunTimePolymorphism {
	
	public static void main(String[] args) {
		Student s=new Student();
		s.work();

	}
}
