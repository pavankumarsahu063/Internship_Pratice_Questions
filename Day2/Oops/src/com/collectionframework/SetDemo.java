package com.collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	
	public static void main(String[] args) {
		Set<Integer> hashSet=new HashSet<>();
		hashSet.add(12);
		hashSet.add(21);
		hashSet.add(43);
		hashSet.add(18);
		hashSet.add(82);
		hashSet.add(32);
		
		
		System.out.println(hashSet);
		
		Set<Integer> linkedHashset=new LinkedHashSet<>();
		linkedHashset.add(12);
		linkedHashset.add(21);
		linkedHashset.add(43);
		linkedHashset.add(18);
		linkedHashset.add(82);
		linkedHashset.add(32);
		
		System.out.println(linkedHashset);
		
		
		
		Set<Integer> treeSet=new TreeSet<>();
		treeSet.add(12);
		treeSet.add(21);
		treeSet.add(43);
		treeSet.add(18);
		treeSet.add(82);
		treeSet.add(32);
		
		System.out.println(treeSet);
		
	}

}
