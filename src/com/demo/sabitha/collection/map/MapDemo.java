package com.demo.sabitha.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {
	
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(1,"sabitha");
		map.put(2,"sai");
		map.put(3,"sree");
		map.put(4,"nadiu");
		map.put(5,"teja");
		map.put(6,"chandu");
		map.put(7,"cherry");
		System.out.println(map);
		System.out.println("--------------Entry set-----------------");
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for(Entry<Integer, String> x:entrySet) {
			System.out.println(x.getKey()+" "+x.getValue());
		}
		System.out.println("----------------Entry--------------------------");
		for(Entry<Integer,String> number:map.entrySet()) {
			System.out.println(number.getKey()+" "+number.getValue());
		}
		
	}

}
