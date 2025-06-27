package com.demo.collection.list;

import java.util.ArrayList;
import java.util.List;

public class FailFastIteratorDemo1 {
	
	public static void main(String[] args) {
		List<Integer> numberList = addElements(10);
		
		//iterator
		for (int number : numberList) {//reading data from collection
			numberList.add(1);//writing data to collection
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
