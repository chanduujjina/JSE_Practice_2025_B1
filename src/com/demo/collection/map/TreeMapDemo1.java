package com.demo.collection.map;

import java.util.TreeMap;

public class TreeMapDemo1 {
	public static void main(String[] args) {
		
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(3, "test3");
		treeMap.put(1, "test1");
		treeMap.put(2, "test2");
		treeMap.put(5, "test5");
		
		System.out.println(treeMap);
		
		Integer floorKey = treeMap.floorKey(4);
		System.out.println(floorKey);
	}

}
