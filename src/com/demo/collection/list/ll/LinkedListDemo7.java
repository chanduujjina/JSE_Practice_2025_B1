package com.demo.collection.list.ll;

import java.util.LinkedList;

public class LinkedListDemo7 {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> numberList = new LinkedList<>();//abstract way of creating object
		
		for (int i =1;i<=3;i++) {
			numberList.add(i);
		}
		
		System.out.println("original numberList:"+numberList);// 1,2,3
		
		//using Dequee technique
		
		Integer pop1 = numberList.pop();// 2,3
		System.out.println(pop1+" list "+numberList);
		
		
		Integer pop2 = numberList.pop();//3
		System.out.println(pop2+" list "+numberList);
		
		Integer pop3 = numberList.pop();//[]
		System.out.println(pop3+" list "+numberList);
		
		Integer pop4 = numberList.pop();//What happens
		System.out.println(pop4+" list "+numberList);
	}

}
