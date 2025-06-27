package com.demo.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo6 {
	
	public static void main(String[] args) {
		List<String> valueList = addElements(125);
		
		
		valueList.set(valueList.size()-1, "chandu");
		
		System.out.println(valueList);
		
		valueList.remove(valueList.size()-1);
		
		System.out.println("after removing list::"+valueList);
		
		
		valueList.add("test1");
		
		valueList.remove("test1");
		
		System.out.println(valueList);
		
		
	}
	
	
	private static List<String> addElements(int elemnts) {
		List<String> list = new ArrayList<>();//abstraction
		
		for (int i =1;i<=elemnts;i++) {
			list.add("test"+i);
		}
		return list;
	}

}


