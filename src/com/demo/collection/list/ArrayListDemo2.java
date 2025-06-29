package com.demo.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo2 {
	
	public static void main(String[] args) {
		
		List<Integer> list = addElements();
		
		System.out.println(list);
		
		//with out enhanced for loop and legacy for loop
		
		printElementsFromList(list);
		
		//check is elemnts exists
		
		boolean isElementExists = list.contains(100);
		
		System.out.println(isElementExists);
		
	   //print size
		
		System.out.println("list size :"+list.size());
		
		//get the elemnt by giving index
		
		Integer integer = list.get(99);
		
		System.out.println(integer);
		
		int indexOf = list.indexOf(2);
		
		System.out.println(indexOf);
		
		
		
		
	}

	private static void printElementsFromList(List<Integer> list) {
		Iterator<Integer> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			Integer value = iterator.next();
			System.out.println(value);
			
		}
	}

	private static List<Integer> addElements() {
		List<Integer> list = new ArrayList<>();//abstraction
		
		for (int i =1;i<=100;i++) {
			list.add(i);
		}
		return list;
	}

}
