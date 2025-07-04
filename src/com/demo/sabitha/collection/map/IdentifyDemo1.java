package com.demo.sabitha.collection.map;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class IdentifyDemo1 {
	public static void main(String[] args) {
		Map<String,String> map=new IdentityHashMap<>();
		map.put("test1","test");
		map.put("test1", "test1");
		map.put("test2", "test2");
		map.put(null, null);
		map.put(null, null);
		map.put("test4",null);
		System.out.println(map);
		for(Entry<String, String> enset:map.entrySet()) {
			map.put("test3", "test3");
		}
	}

}
