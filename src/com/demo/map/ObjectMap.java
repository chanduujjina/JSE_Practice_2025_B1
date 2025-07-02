package com.demo.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ObjectMap {
	
	public static void main(String[] args) {
		Student student=new Student(1, "cherry");
		Map<Student, Integer> map=new HashMap<>();
		map.put(student, 1);
		map.put(new Student(1, "cherry"),2);
		map.put(student, 3);
		map.put(new Student(2, "pandu"),4);
		map.put(new Student(3, null),5);
		System.out.println(map);
		
	}
	
}