package com.demo.sabitha.collection.map;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentifyDemo1 {
	public static void main(String[] args) {
		Map<String,String> map=new IdentityHashMap<>();
		map.put("test1","test");
		map.put("test1", "test1");
		map.put("test2", "test2");
		System.out.println(map);
	}

}
