package com.demo.sabitha.collection.map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentDemo1 {
	public static void main(String[] args) {
		Map<Integer,String> concurrentSkipListMap=new ConcurrentSkipListMap<>();
		//concurrentSkipListMap.put(1, null);
		concurrentSkipListMap.put(6, "test6");
		concurrentSkipListMap.put(2,"test");
		concurrentSkipListMap.put(3,"test1");
		concurrentSkipListMap.put(4,"test4");
		concurrentSkipListMap.put(null, null);
		for(Entry<Integer, String> entry:concurrentSkipListMap.entrySet()) {
			concurrentSkipListMap.put(4,"test5");
		}
		System.out.println(concurrentSkipListMap);
	}

}
