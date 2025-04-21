package com.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountStringStartsWithSpeficLatter {
	public static void main(String[] args) {
		 List<String> names = Arrays.asList("pavan", "rahul", "praveemn", "ankit");
		 
		 long count =names.stream().filter(name->name
				 .startsWith("p"))
				 .count();
		 System.out.println(count);
		 
		 List<String> sortList=names.stream().sorted().collect(Collectors.toList());
		 System.out.println(sortList);
		 
		 
	}

}
