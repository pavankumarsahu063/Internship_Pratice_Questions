package com.collectionframework;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {
	public static void main(String[] args) {
	Map<Integer, String> map=new HashMap<>();
	map.put(1, "pavan");
	map.put(2, "naveen");
	map.put(3, "rohit");
	map.put(4, "vk");
	map.put(5, "dhoni");

	System.out.println(map);
	System.out.println(map.get(1));
	System.out.println(map.remove(1));
	System.out.println(map.containsKey(3));
	System.out.println(map.size());
	System.out.println(map.values());
	
	System.out.println(map.keySet());
	
	
	for(Integer key : map.keySet()) {
		System.out.println(key);
	}
	
	for(String value : map.values()) {
		System.out.println(value);
	}
	
	
	
}
}
