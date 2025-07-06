package com.demo.collection.map;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConCurrentHashMapDemo {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new ConcurrentHashMap<>();
	
		for (int i =1;i<=20;i++) {
			map.put(i, "test"+i);
		}
		
		System.out.println(map);
		
		//test the iterator behaviour
		
		for(Map.Entry<Integer, String> entryMap : map.entrySet()) {//reading elemnts
			
			map.put(21, "test21");// adding elemnts
			
		}
		
		map.put(null, null);
		
		System.out.println(map);
		
		
		
		
		
	}

}
