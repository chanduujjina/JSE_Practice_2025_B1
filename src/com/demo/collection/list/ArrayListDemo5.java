package com.demo.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo5 {
	
	public static void main(String[] args) {
		List<Integer> list = addElements(125);
		
		//System.out.println(list);
		
		int threshHold = 10;
		
		int nOOfSubList = list.size()/threshHold;
		
		int startIndex =0;//100,200,300
		
		int endIndex = threshHold;//200,300,4000
		
		
		for (int i =1;i<=nOOfSubList;i++) {
			List<Integer> subList = list.subList(startIndex, endIndex);// (0 to 100),(100,200),(200,300)
			System.out.println(subList);
			startIndex = endIndex;
			endIndex = endIndex+threshHold;
		}
		
		
		int remainder = list.size()%threshHold;
		if (remainder > 0) {
		List<Integer> subList = list.subList(startIndex, list.size()-1);
		System.out.println(subList);
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


