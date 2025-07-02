package com.demo.map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

public class IdentifyHashMap {
	public static void main(String[] args) {

		Map<Student, String> map = new IdentityHashMap<>();
		map.put(new Student(1, "cherry"), "pandu");
		map.put(new Student(1, "cherry"), "gwen");
		map.put(new Student(2, "berry"), "jerry");
         System.out.println(map);
	}

}