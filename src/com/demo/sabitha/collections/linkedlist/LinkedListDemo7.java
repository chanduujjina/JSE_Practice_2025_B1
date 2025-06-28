package com.demo.sabitha.collections.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo7 {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList=AddElement(10);
		LinkedList<Integer> linkedList2=new LinkedList<>();
		linkedList2.add(10);
		linkedList2.add(5);
		linkedList2.add(3);
		linkedList2.add(6);
		int Sum=0;
		int Sum1=SumMethod(linkedList2,Sum);
		MaxMethod(linkedList);
		MinMethod(linkedList);
		AveageMethod(linkedList,Sum1);
		CountMethod(linkedList);
		
	}
		

	private static void CountMethod(LinkedList<Integer> linkedList) {
		System.out.println("Count "+linkedList.size());
	}


	private static void AveageMethod(LinkedList<Integer> linkedList, int Sum1 ) {
		System.out.println("Aveage "+(float)Sum1/linkedList.size());
	}


	private static void MinMethod(LinkedList<Integer> linkedList) {
		System.out.println("min Number "+Collections.min(linkedList));
		
	}


	private static void MaxMethod(LinkedList<Integer> linkedList) {
		System.out.println("max number "+Collections.max(linkedList));
		
	}


	private static int SumMethod(LinkedList<Integer> linkedList2, int Sum) {
		for(Integer x:linkedList2) {
			Sum+=x;
		}
		System.out.println(Sum);
		return Sum;
	}


	private static LinkedList<Integer> AddElement(int Element){
		LinkedList<Integer> linkedList=new LinkedList<>();
		for(int i=1;i<=Element;i++) {
			linkedList.offer(i);
		}
		return linkedList;
		
	}

}
