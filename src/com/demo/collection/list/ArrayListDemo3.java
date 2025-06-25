package com.demo.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo3 {
	
	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>();
		
		list.add("test");
		list.add("test1");
		
		list.add("test");
		
		int indexOf = list.lastIndexOf("test");
		System.out.println(indexOf);
		
	}

	

}
