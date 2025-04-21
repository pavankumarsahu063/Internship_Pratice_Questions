package com.streams;


import java.text.Collator;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {
	
	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(10,21,22,90,21);
		
//		l.stream().filter(ele->ele%2==0).
//		forEach(System.out::println);
		
//		l.stream().map(x->x*2).forEach(System.out::println);
//		
//		
//		l.stream().sorted();
//		System.out.println(l);
		
		List<Integer> res=l.stream().filter(num->num%2==0).collect(Collectors.toList());
		System.out.println(res);
	}
	

}
