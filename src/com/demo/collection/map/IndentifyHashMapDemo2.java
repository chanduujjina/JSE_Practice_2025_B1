package com.demo.collection.map;

import java.util.IdentityHashMap;
import java.util.Map;

public class IndentifyHashMapDemo2 {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new IdentityHashMap<>();
		map.put("test1", 1);
		map.put("test2",2);
		map.put("test2",3);
		
		
		System.out.println(map);//
	}

}
