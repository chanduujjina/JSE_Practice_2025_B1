package com.demo.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo1 {
	
	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<>();//abstraction
		
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
