package com.demo.collection.list.ll;

import java.util.LinkedList;

public class LinkedListDemo4 {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> numberList = new LinkedList<>();//abstract way of creating object
		
		for (int i =1;i<=3;i++) {
			numberList.add(i);
		}
		
		System.out.println("original numberList:"+numberList);// 1,2,3
		
		//using quee technique
		
		Integer removeElement1 = numberList.poll();
		System.out.println("Polled element:"+removeElement1);
		System.out.println("remove elemnt 1 from list:"+numberList);//2,3
		
		Integer removeElement2 = numberList.poll();
		System.out.println("Polled element:"+removeElement2);
		System.out.println("remove elemnt  from list:"+numberList);//3
		
		Integer removeElement3 = numberList.poll();
		System.out.println("Polled element:"+removeElement3);
		System.out.println("remove elemnt  from list:"+numberList);//[]
		
		Integer removeElement4 = numberList.poll();
		System.out.println("Polled element:"+removeElement4);
		System.out.println("remove elemnt  from list:"+numberList);//[]
		
	}

}
