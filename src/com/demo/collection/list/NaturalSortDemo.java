package com.demo.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NaturalSortDemo {
	
	public static void main(String[] args) {
		
		List<Integer> numberList = new ArrayList();
		numberList.add(1);
		numberList.add(10);
		numberList.add(3);
		
		System.out.println("Before sorting..."+numberList);
		
		Collections.sort(numberList);
		
		System.out.println("after sorting..."+numberList);
		
		System.out.println();
	}

}
