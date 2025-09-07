package com.demo.sabitha.collection.map;
import java.util.LinkedHashMap;
import java.util.Map;
public class LinkedHashMapDemo {
	public static void main(String[] args) {
		
		LinkedHashMap<Integer,String> hashMap=new LinkedHashMap<>();
		hashMap.put(1,"task"+1);
		hashMap.put(1,"task"+2);
		hashMap.put(2,"task"+3);
		hashMap.put(3,"task"+4);
		hashMap.put(null, null);
		hashMap.put(6, null);
		hashMap.put(null, null);
		System.out.println(hashMap);
		for(Map.Entry<Integer, String> map:hashMap.entrySet()){
			hashMap.put(5,"task"+5);
		}
		
	}

}
