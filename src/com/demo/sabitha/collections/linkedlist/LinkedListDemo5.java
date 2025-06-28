package com.demo.sabitha.collections.linkedlist;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo5 {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList=AddElement(10);
		LinkedList<Integer> linkedList2=new LinkedList<>();
		linkedList2.add(10);
		linkedList2.add(5);
		linkedList2.add(3);
		linkedList2.add(6);
		RetainMethod(linkedList,linkedList2);
	}
	private static void RetainMethod(LinkedList<Integer> linkedList, LinkedList<Integer> linkedList2) {
		System.out.println(linkedList.retainAll(linkedList2));
		System.out.println(linkedList);
		System.out.println(linkedList2);
	}
	private static LinkedList<Integer> AddElement(int Element){
		LinkedList<Integer> linkedList=new LinkedList<>();
		for(int i=1;i<=Element;i++) {
			linkedList.offer(i);
		}
		return linkedList;
		
	}

}
