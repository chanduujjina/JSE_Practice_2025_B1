package com.demo.sabitha.collection.map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;


public class FailSafeIterator2 {
	
	public static void main(String[] args) {
		ConcurrentHashMap<Integer,String> concurrentHashMap=new ConcurrentHashMap<>();
		concurrentHashMap.put(1,"teja");
		concurrentHashMap.put(2,"sabitha");
		concurrentHashMap.put(3,"sai");
		for(Entry<Integer,String> x:concurrentHashMap.entrySet()) {
			concurrentHashMap.put(3,"sree");
			System.out.println(concurrentHashMap.remove(3));
			System.out.println(x);
		}
	}
		
}
