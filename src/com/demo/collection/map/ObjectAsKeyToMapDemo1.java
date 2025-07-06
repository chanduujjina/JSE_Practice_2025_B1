package com.demo.collection.map;

import java.util.HashMap;
import java.util.Map;

public class ObjectAsKeyToMapDemo1 {
	
	public static void main(String[] args) {
		
		
		Map<Sample, Integer> map = new HashMap<>();
		map.put(new Sample(1, "Blood"), 1);
		map.put(new Sample(2, "Urine"), 2);
		map.put(new Sample(2, "Urine"), 3);
		
		System.out.println(map);
	}

}
