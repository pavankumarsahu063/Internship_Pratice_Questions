package com.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {
	public static void main(String[] args) {
		
		List<Integer> l=Arrays.asList(1,21,2,18,32,15,32,21);
		
		List<Integer> even=l.stream()
				.filter(num->num%2==0)
				.collect(Collectors.toList());
		
		System.out.println(even);
	}
}
