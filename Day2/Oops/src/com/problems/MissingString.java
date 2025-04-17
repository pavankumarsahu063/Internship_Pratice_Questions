package com.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingString {
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<>(Arrays.asList("keyboard","mouse","monitor"));
		List<String> list2List=Arrays.asList("mouse","monitor");
		
		list.removeAll(list2List);
		System.out.println(list);
	}

}
