package com.demo.collection.map;

import java.util.concurrent.ConcurrentSkipListMap;

public class ConCurrrentListSkipListMapDemo {
	
	public static void main(String[] args) {
		
		ConcurrentSkipListMap<Integer, String> concurrentSkipListMap = new ConcurrentSkipListMap<>();
		concurrentSkipListMap.put(3, "test3");
		concurrentSkipListMap.put(1, "test1");
		concurrentSkipListMap.put(2, "test2");
		
		System.out.println(concurrentSkipListMap);
		
		//it will sort in ascending order on the key
		//Its is thread safe
		
		
	}

}
