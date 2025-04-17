package com.problems;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromArray {
	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,12,1,3,2,1);
		
		Set<Integer> s=new LinkedHashSet<>();
		
		System.out.println(list);
		for(int l: list) {
			s.add(l);
		}
		System.out.println(s);
	}

}
