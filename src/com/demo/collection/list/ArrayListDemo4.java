package com.demo.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo4 {
	
	public static void main(String[] args) {
		List<Integer> elemnts = addElements(1000);
		
		//usage of subList
		
		int threshHold = 100;
		
		
		
		List<Integer> subList1 = elemnts.subList(0, 500);
		
		System.out.println(subList1);
		
		List<Integer> subList2 = elemnts.subList(500, 1000);
		
		System.out.println(subList2);
		
	}
	
	
	private static List<Integer> addElements(int elemnts) {
		List<Integer> list = new ArrayList<>();//abstraction
		
		for (int i =1;i<=elemnts;i++) {
			list.add(i);
		}
		return list;
	}

}


