package com.demo.collection.map;

import java.util.IdentityHashMap;
import java.util.Map;

public class IndentifyHashMapDemo1 {
	
	public static void main(String[] args) {
		
		Map<Sample, Integer> map = new IdentityHashMap<>();
		map.put(new Sample(1, "Blood"), 1);
		map.put(new Sample(2, "Urine"), 2);
		map.put(new Sample(2, "Urine"), 3);
		
		System.out.println(map);
	}

}
