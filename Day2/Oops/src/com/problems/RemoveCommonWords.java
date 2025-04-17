package com.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveCommonWords {
	
	public static void main(String[] args) {
		List<String> list1=new ArrayList<> (Arrays.asList("apple", "banana", "mango", "grapes"));
		List<String> list2=Arrays.asList("banana","grapes");
		
		
		list1.removeAll(list2);
		System.out.println(list1);
	}

}
