package com.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class IntersectionofTwoSets {
	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));
		set1.retainAll(set2);
		System.out.println(set1);
		
		
		int arr[]= {1,1,2,12,12,1,21,4};
		
		Set<Integer> set=new LinkedHashSet<>();
		
		for(int i: arr) {
			set.add(i);
		}
		System.out.println(set);
	}

}
