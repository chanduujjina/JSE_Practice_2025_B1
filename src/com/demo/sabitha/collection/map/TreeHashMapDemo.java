package com.demo.sabitha.collection.map;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeHashMapDemo {
	public static void main(String[] args) {
		TreeMap<Integer,Integer> map=new TreeMap<>();
		map.put(1,1);
		map.put(1, 2);
		map.put(2,3);
		map.put(3,4);
		map.put(4,5);
		map.put(5,6);
		map.put(6, null);
		map.put(null, null);
		System.out.println(map);
		for(Entry<Integer, Integer> entry:map.entrySet()) {
			map.put(7,7);
		}
		
	}

}
