package com.demo.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo1 {
	
	public static void main(String[] args) {
		List<Integer> numberList = addElements(100);
		
		//usage of  iterator
		
		Iterator<Integer> iterator = numberList.iterator();
		
		while(iterator.hasNext()) {
			Integer number = iterator.next();
			System.out.println(number);
		}
		
		
	}
	
	
	private static List<Integer> addElements(int elemnts) {
		List<Integer> list = new ArrayList<>();//abstraction
		
		for (int i =1;i<=elemnts;i++) {
			list.add(i);
		}
		return list;
	}
	

}
