package com.demo.collection.list.ll;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		List<Integer> numberList = getNumberList(10);
		
		System.out.println(numberList);
		
		for (int num :numberList) {//Integer -> int(UnBoxing)
			System.out.println(num);
		}
	}

	private static List<Integer> getNumberList(int inputNumber) {
		List<Integer> list = new LinkedList<>();// abstraction

		for (int i = 1; i <= inputNumber; i++) {
			list.add(i);
		}
		
		return list;
	}

}
