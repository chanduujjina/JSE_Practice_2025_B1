package com.demo.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo2 {
	
	public static void main(String[] args) {
	
		Map<Integer, String> map = new HashMap<>();
		
		// adding element
		map.put(1, "test1");
		map.put(2, "test2");
		map.put(3, "test3");
		
		System.out.println("print map "+map);
		
		//fetch the elemnts from Map
		
		for (Map.Entry<Integer, String> entry :map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		//how to fetch only kes
		
		Set<Integer> keySet = map.keySet();
		
		System.out.println(keySet);
		
		//fetch only values
		
		Collection<String> values = map.values();
		
		System.out.println(values);
	}

}
