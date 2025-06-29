package com.demo.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomizedSortingDemo1 {
	
	public static void main(String[] args) {
		
		List<Integer> numberList = new ArrayList<>();
		numberList.add(1);
		numberList.add(10);
		numberList.add(3);
		
		Collections.sort(numberList, new Comparator<Integer>() {

			@Override
			public int compare(Integer val1, Integer val2) {
				
				return val1-val2;
			}
		});
		
		System.out.println(numberList);
		
		
		
	}

}
