package com.demo.sabitha.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FailFastIterator {
	
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(1,"test1");
		map.put(2,"test2");
		map.put(3, "test3");
		map.put(4,"test4");
		for(Entry<Integer,String> x:map.entrySet()) {
			map.put(10, null);
		}
	}
		
}
