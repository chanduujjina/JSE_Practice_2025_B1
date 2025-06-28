package com.demo.sabitha.collections.linkedlist;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo3 {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList=AddElement(10);
		SetMethod(linkedList);	
		//System.out.println(linkedList);
	}
		
	private static void SetMethod(LinkedList<Integer> linkedList) {
		Integer set1 = linkedList.set(6,10);
		System.out.println(linkedList);
		ListIterator<Integer> listIterator=linkedList.listIterator();	
		while(listIterator.hasNext()) {
			Integer element=listIterator.next();
			if(element.equals(5))
				listIterator.set(element);
		}
		System.out.println(linkedList);
	}

	private static LinkedList<Integer> AddElement(int Element){
		LinkedList<Integer> linkedList=new LinkedList<>();
		for(int i=1;i<=Element;i++) {
			linkedList.offer(i);
		}
		return linkedList;
		
	}

}
