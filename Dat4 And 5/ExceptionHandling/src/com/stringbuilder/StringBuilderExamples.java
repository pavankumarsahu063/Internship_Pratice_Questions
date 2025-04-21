package com.stringbuilder;

public class StringBuilderExamples {
	
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		StringBuilder sb1=new StringBuilder("Hello World");
		StringBuilder sb2=new StringBuilder(12);
		System.out.println(sb2.capacity());
		sb.append("pavan");
		sb.append(" kumar");
		sb.reverse();
		System.out.println(sb);
	}

}
