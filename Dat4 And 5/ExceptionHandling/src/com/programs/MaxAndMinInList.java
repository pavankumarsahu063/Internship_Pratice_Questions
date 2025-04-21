package com.programs;

import java.util.Arrays;
import java.util.List;

public class MaxAndMinInList {
	public static void main(String[] args) {
		
		 List<Integer> numbers = Arrays.asList(4, 7, 2, 9, 1);
		 
		 int max=numbers.stream().max(Integer::compare).get();
		 int min=numbers.stream().min(Integer:: compare).get();
		 System.out.println(min+"   "+max);
	}

}
