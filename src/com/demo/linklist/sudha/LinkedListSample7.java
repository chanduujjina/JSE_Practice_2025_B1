package com.demo.linklist.sudha;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;



public class LinkedListSample7 {
	public static void main(String[] args) {
		
		LinkedList<Integer> linkedList=AddElements(20);
		LinkedList<Integer> linkedList2=new LinkedList<>();
		linkedList2.add(12);
		linkedList2.add(16);
		linkedList2.add(8);
		linkedList2.add(7);
		int Sum =0;
		int Sum1=SumMethod(linkedList2,Sum);
		MaxMethod(linkedList);
		MinMethod(linkedList);
		AverageMethod(linkedList,Sum1);
		CountMethod(linkedList);
		
	}
	  


private static void CountMethod(LinkedList<Integer> linkedList) {
		System.out.println("Count "+linkedList.size());
		
	}



private static void AverageMethod(LinkedList<Integer> linkedList,int Sum1) {
	System.out.println("Avr "+(float)Sum1/linkedList.size());
	}



private static void MinMethod(LinkedList<Integer> linkedList) {
		System.out.println("min of number"+Collections.min(linkedList));
	}



private static void MaxMethod(LinkedList<Integer> linkedList) {
	System.out.println("max of number"+Collections.max(linkedList));
	}



private static int SumMethod(LinkedList<Integer> linkedList2, int sum) {
		for(Integer a:linkedList2) {
			
			sum=sum+a;
					
		}
	System.out.println(sum);
	return sum;
	}



private static LinkedList<Integer>  AddElements(int Element) {
    	 LinkedList<Integer> linkedList=new LinkedList<>();
    	 for(int i =1;i<=Element;i++) {
    		 linkedList.offer(i);
    		
    	 }
    	
     return linkedList;
}
}










