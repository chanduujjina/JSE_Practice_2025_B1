package com.demo.map;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> hashMap = new LinkedHashMap<>();
		hashMap.put(1, "sample" + 1);
		hashMap.put(2, "sample" + 2);
		hashMap.put(2, "sample" + 3);
		hashMap.put(3, "sample" + 4);
		hashMap.put(null, null);
		hashMap.put(5, null);
		hashMap.put(null, null);
		System.out.println(hashMap);
      
		for(Entry<Integer, String> map:hashMap.entrySet()) {
		
			
		}
	}

}
