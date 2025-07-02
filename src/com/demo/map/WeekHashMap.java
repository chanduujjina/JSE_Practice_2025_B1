package com.demo.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

public class WeekHashMap {
	public static void main(String[] args) throws InterruptedException {
		Student student = new Student(1, "pandu");

		Map<Student, Integer> map = new WeakHashMap<>();
		map.put(student, 1);
		student = null;
		System.gc();
		Thread.sleep(500);
		System.out.println(map);
		System.out.println("-----------------");
		Map<Student, String> map2=new WeakHashMap<>();
		map2.put(student, "sample1");
		student=null;
		System.gc();
		Thread.sleep(1000);
		System.out.println(map2);
		

	}

}