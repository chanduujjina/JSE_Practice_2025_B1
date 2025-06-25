package com.demo.collection.list;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorDemo1 {
	
	public static void main(String[] args) {
		
		List<Integer> list = new Vector<>();//abstraction
		
		for (int i =1;i<=100;i++) {
			list.add(i);
		}
		
		System.out.println(list);
		
		//with out enhanced for loop and legacy for loop
		
		Iterator<Integer> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			Integer value = iterator.next();
			System.out.println(value);
			
		}
		
		
		
		
	}

}
