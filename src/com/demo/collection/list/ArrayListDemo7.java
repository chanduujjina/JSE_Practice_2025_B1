package com.demo.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo7 {
	
	public static void main(String[] args) {
		List<String> valueList1 = addElements(125);
		List<String> valueList2 = addElements(100);
		
		//remove all
		valueList1.removeAll(valueList2);//A-B
		
		System.out.println(valueList1);
		
		
		
		
		
	}
	
	
	private static List<String> addElements(int elemnts) {
		List<String> list = new ArrayList<>();//abstraction
		
		for (int i =1;i<=elemnts;i++) {
			list.add("test"+i);
		}
		return list;
	}

}


