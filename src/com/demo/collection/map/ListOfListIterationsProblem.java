package com.demo.collection.map;

import java.util.ArrayList;
import java.util.List;

public class ListOfListIterationsProblem {
	
	public static void main(String[] args) {
		
		List<Integer> numberList1 = new ArrayList();
		numberList1.add(1);
		numberList1.add(2);
		numberList1.add(3);
		numberList1.add(4);
		List<Integer> numberList2 = new ArrayList<>();
		numberList2.add(5);
		numberList2.add(6);
		numberList2.add(3);
		numberList2.add(4);
		
		List<Integer> commonList = new ArrayList();
		for (int outer :numberList1) {//looping
			for (int innner : numberList2) {
				if (outer == innner) {
					commonList.add(innner);
				}
			}
		}
		
		System.out.println(commonList);
		
	}

}
