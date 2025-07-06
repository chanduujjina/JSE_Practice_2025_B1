package com.demo.collection.map;

import java.util.EnumMap;
import java.util.Map.Entry;

public class EnumMapDemo1 {
	
	public static void main(String[] args) {
		
		EnumMap<Severity, Integer> enumMap = new EnumMap<>(Severity.class);
		
		enumMap.put(Severity.HIGH, 1);
		
		enumMap.put(Severity.LOW, 3);
		enumMap.put(Severity.MEDIUM, 2);
		
		
		for (Entry<Severity, Integer> entry : enumMap.entrySet()) {
			System.out.println(entry);
		}
	}

}
