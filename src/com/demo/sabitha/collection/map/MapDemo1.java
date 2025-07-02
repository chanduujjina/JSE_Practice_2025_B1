package com.demo.sabitha.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo1 {
	
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		addElements(map);
		containsMethod(map);
		repalceMethod(map);
	}

	private static void repalceMethod(Map<Integer, String> map) {
		System.out.println("-------------------repalce-----------------------------");
		map.replace(2,"sabitha");
		System.out.println(map);
		map.replace(30,"test30","sai");
		map.replace(31, null, "teja");
		System.out.println(map);
	}

	private static void containsMethod(Map<Integer, String> map) {
		System.out.println("------------------containskey-----------------------------------------------");
		System.out.println(map.containsKey(1));
		System.out.println(map.containsKey(100));
		System.out.println(map.containsKey(31));
		System.out.println("-----------------containsValue--------------------------------------");
		System.out.println(map.containsValue("sabitha"));
		System.out.println(map.containsValue("test0"));
		System.out.println(map.containsValue("test"));
	}
	private static void addElements(Map<Integer, String> map) {
		for(int i=0;i<=30;i++) {
			map.put(i,"test"+String.valueOf(i));
		}
		map.put(31, null);
		map.put(31,null);
		map.put(null, null);
		map.put(null, null);
		
	}

}
