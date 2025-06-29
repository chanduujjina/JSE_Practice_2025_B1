package com.demo.collection.list.ll;

import java.util.LinkedList;

public class LinkedListDemo3 {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> numberList = new LinkedList<>();//abstract way of creating object
		
		numberList.add(1);
		numberList.offerFirst(2);//first index
		numberList.offerLast(4); //last index
		
		
		numberList.add(3);//always it will end the element end
		
		
		System.out.println(numberList);
		
	}

}
