package com.demo.sabitha.collection.map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentDemo {
	public static void main(String[] args) {
		Map<Integer,String> concurrentHashMap=new ConcurrentHashMap<>();
		concurrentHashMap.put(6,"test6");
		concurrentHashMap.put(1, null);
		concurrentHashMap.put(2,"test");
		concurrentHashMap.put(3,"test1");
		concurrentHashMap.put(4,"test4");
		//concurrentHashMap.put(null, null);
		for(Entry<Integer, String> entry:concurrentHashMap.entrySet()) {
			concurrentHashMap.put(4,"test5");
		}
		System.out.println(concurrentHashMap);
	}

}
