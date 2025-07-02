package com.demo.map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

public class IdentifyHashMap2 {
	public static void main(String[] args) throws InterruptedException {
		 Map<String, String> map=new IdentityHashMap<>();
		 map.put("sample1", "sample");
		 map.put("sample2", "sample");
		 map.put("sample3", "sample");
		 map.put("sample4", "sample");
		 map.put("sample5", "sample");
		 System.out.println(map);
		 

	}

}