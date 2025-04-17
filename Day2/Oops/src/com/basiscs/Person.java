package com.basiscs;

public class Person {
	
	
		String name;
		int age;
		
		public Person(String name,int age) {
			this.age=age;
			this.name=name;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name=name;
		}
		
		public int getInt() {
			return age;
		}
		
		public void setInt(int age) {
			this.age=age;
		}
		
		@Override
		public String toString() {
			return "name :"+ name + " age :"+ age;
		}
}
