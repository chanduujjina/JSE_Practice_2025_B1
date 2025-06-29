package com.demo.collection.list.ll;

import java.util.LinkedList;

public class LinkedListDemo5 {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> numberList = new LinkedList<>();//abstract way of creating object
		
		for (int i =1;i<=3;i++) {
			numberList.add(i);
		}
		
		System.out.println("original numberList:"+numberList);// 1,2,3
		
		//using quee technique
		
		for (int i =1;i<=numberList.size();i++) {
			Integer poll = numberList.poll();
			System.out.println(poll);
		}
		System.out.println(numberList);
		
		numberList.poll();
		System.out.println(numberList);
		
	}

}
