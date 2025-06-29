package com.demo.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo1 {
	
	public static void main(String[] args) {
		List<Integer> numberList = addElements(100);
		
		//usage of  listiterator
		
		//from left to right
		ListIterator<Integer> forWardListIterator = numberList.listIterator();
		
		while(forWardListIterator.hasNext()) {
			System.out.print(forWardListIterator.next()+",");
		}
		
		System.out.println("Back word iterator");
		//right to left
		ListIterator<Integer> backListIterator = numberList.listIterator(numberList.size());
		
		while(backListIterator.hasPrevious()) {
			System.out.print(backListIterator.previous()+",");
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
