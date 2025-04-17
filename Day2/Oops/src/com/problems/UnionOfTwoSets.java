package com.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoSets {
	
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));
		
		
		set1.addAll(set2);
		
		System.out.println(set1);
	}

}
