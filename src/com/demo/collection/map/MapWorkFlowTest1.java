package com.demo.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapWorkFlowTest1 {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "test1");//enry 1
		map.put(1, "test2");//entry2
		
		System.out.println(map);
		
		System.out.println();
		
		
		//get
		String value = map.get(1);
		
		
	}

}
