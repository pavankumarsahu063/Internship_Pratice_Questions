package com.collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>(Arrays.asList(2, 5,3,4, 1, 12, 1));
		
		
		for(int i=0;i<l.size();i++) {
			if(l.get(i).equals(5)) {
				l.remove(i);
			}
		}
		System.out.println(l);
	}

}
