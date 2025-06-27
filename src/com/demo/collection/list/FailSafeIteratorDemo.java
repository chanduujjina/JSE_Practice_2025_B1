package com.demo.collection.list;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIteratorDemo {
	
	public static void main(String[] args) {
		List<Integer> numberList = addElements(10);
		
		//list iterator
		for (int number : numberList) {//reading data from collection
			numberList.add(1);//writing data to collection
		}
		
		System.out.println(numberList);
	}
	
	
	private static List<Integer> addElements(int elemnts) {
		List<Integer> list = new CopyOnWriteArrayList<>();//abstraction
		
		for (int i =1;i<=elemnts;i++) {
			list.add(i);
		}
		return list;
	}

}
