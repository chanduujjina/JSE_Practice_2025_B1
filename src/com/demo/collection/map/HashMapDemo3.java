package com.demo.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Set;

public class HashMapDemo3 {
	
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		for (int i =1;i<=20;i++) {
			map.put(i, "test"+i);
		}
		
		System.out.println(map);
		
		//test the iterator behaviour
		
		for(Map.Entry<Integer, String> entryMap : map.entrySet()) {//reading elemnts
			
			map.put(21, "test21");// adding elemnts
			
		}
		
		System.out.println(map);
	}

}
