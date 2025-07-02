package com.demo.sabitha.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
	public static void main(String[] args) throws InterruptedException {
		Map<Employe, Integer> map = new WeakHashMap<>();
		Employe employe = new Employe(1, "sai");
		map.put(employe, 1);
		employe = null;
		System.gc();
		Thread.sleep(1000);
		System.out.println(map);
		System.out.println("-----------------------------------------------");
		Map<Employe, String> map2 = new HashMap<>();
		map2.put(employe, "test1");
		employe = null;
		System.gc();
		Thread.sleep(2000);
		System.out.println(map2);

	}

}
