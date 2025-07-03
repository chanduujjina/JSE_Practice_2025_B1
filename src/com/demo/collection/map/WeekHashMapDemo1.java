package com.demo.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeekHashMapDemo1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		Map<Sample, Integer> map = new WeakHashMap<>();
		Sample sample = new Sample(1, "Blood");
		
		map.put(sample,1);
		sample = null;
		
		System.gc();
		
		Thread.sleep(1000);
		
		System.out.println(map.size());
		System.out.println(map);
		System.out.println("---------------------------------------------");
		
		Map<Sample, Integer> map1 = new HashMap<>();
		Sample sample1 = new Sample(1, "Blood");
		map1.put(sample1,1);
		sample1 = null;
		
        System.gc();
		
		Thread.sleep(1000);
		
		System.out.println(map1.size());
		System.out.println(map1);
	}

}
