package com.demo.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapSample2 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		addElements(map);
		containsMethod(map);
		replaceMethod(map);

	}

	private static void replaceMethod(Map<Integer, String> map) {
		map.replace(2, "charan");
		System.out.println(map);
		map.replace(20, "sample10","cherry");
		System.out.println(map);
	}

	private static void containsMethod(Map<Integer, String> map) {

		System.out.println(map);
		
		
		System.out.println(map.containsKey(50));
		System.out.println(map.containsKey(2));
		System.out.println(map.containsKey(33));
		System.out.println(map.containsKey(22));
		
		
		System.out.println(map.containsValue("cherry"));
		System.out.println(map.containsValue("sample1"));
		System.out.println(map.containsValue("sample"));

	}

	private static void addElements(Map<Integer, String> map) {
		for (int i = 0; i <=20; i++) {
			map.put(i, " sample" + String.valueOf(i));
		}
	}

}
