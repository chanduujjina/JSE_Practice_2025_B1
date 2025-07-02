package com.demo.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapSample1 {
	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "cherry");
		map.put(2, "pandu");
		map.put(3, "deepu");
		map.put(4, "keerthana");
		map.put(5, "chandhu");
		map.put(6, "tharun");
		map.put(7, "sabitha");
		System.out.println(map);
		
		System.out.println("Entry set");
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for(Entry<Integer, String> a:entrySet) {
			System.out.println(a.getKey()+" "+a.getValue());
		}
		
	System.out.println("Entry set");
	for(Entry <Integer,String> number:map.entrySet()) {
		System.out.println(number.getKey()+" "+number.getValue());
	}
	
	}

}
