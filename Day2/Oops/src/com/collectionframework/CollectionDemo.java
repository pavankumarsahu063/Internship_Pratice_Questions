package com.collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

class CollectionDemo {
	
	
	public static void main(String[] args) {
		
		Collection<Integer> ele=new ArrayList<>();
		
		ele.add(12);
		ele.add(20);
		ele.add(21);
		ele.add(98);
		ele.add(65);
		
		System.out.println("ELEMENTS :"+ele);
		
		System.out.println("Size :"+ele.size());
		System.out.println(ele.remove(0));
		System.out.println(ele.contains(12));
		
		for(int e:ele) {
			System.out.println(e);
		}
		
		Iterator<Integer> i=ele.iterator();
		
		while (i.hasNext()) {
			System.out.println(i.next());
			
		}
		
	
	}

}
