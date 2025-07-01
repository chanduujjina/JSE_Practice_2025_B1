package com.demo.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo1 {
	
	public static void main(String[] args) {
	
		Map<Integer, String> map = new HashMap<>();
		
		// adding element
		map.put(1, "test1");
		map.put(2, "test2");
		map.put(3, "test3");
		
		System.out.println("print map "+map);
		
		//fetch the elemnts from Map
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println("printing key "+entry.getKey());
			System.out.println("printing value "+entry.getValue());
		}
	}

}
