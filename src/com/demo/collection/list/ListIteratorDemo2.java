package com.demo.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo2 {
	
	public static void main(String[] args) {
		List<Integer> numberList = addElements(100);
		
		//usage of  listiterator
		
		//from left to right
		ListIterator<Integer> forWardListIterator = numberList.listIterator();
		
		while(forWardListIterator.hasNext()) {
			Integer val = forWardListIterator.next();
			if (val > 90 && val <=numberList.size()) {
				forWardListIterator.set(1);//modifying/Updating
			}
			
			if (val > 80 && val <=90) {
				forWardListIterator.remove();//remove the elemnts
			}
			
			if (val ==100) {
				forWardListIterator.add(1);//adding
			}
		}
		
		System.out.println(numberList);
	
		
		
		
	}
	
	
	private static List<Integer> addElements(int elemnts) {
		List<Integer> list = new ArrayList<>();//abstraction
		
		for (int i =1;i<=elemnts;i++) {
			list.add(i);
		}
		return list;
	}
	

}
