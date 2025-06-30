package com.demo.collection.list.ll;

import java.util.LinkedList;

public class LinkedListDemo6 {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> numberList = new LinkedList<>();//abstract way of creating object
		
		for (int i =1;i<=3;i++) {
			numberList.add(i);
		}
		
		System.out.println("original numberList:"+numberList);// 1,2,3
		
		//using quee technique
		
		Integer fetchElemt1 = numberList.peek();
		System.out.println("peek element:"+fetchElemt1);
		System.out.println("fetch elemnt  from list:"+numberList);//2,3
		
		Integer fetchElemt2 = numberList.peek();
		System.out.println("peek element:"+fetchElemt2);
		System.out.println("fetch elemnt  from list:"+numberList);//3
		
		Integer fetchElemt3 = numberList.peek();
		System.out.println("peek element:"+fetchElemt3);
		System.out.println("fetch elemnt  from list:"+numberList);//[]
		
		Integer fetchElemt4 = numberList.peek();
		System.out.println("peek element:"+fetchElemt4);
		System.out.println("fetch elemnt  from list:"+numberList);//[]
		
	}

}
