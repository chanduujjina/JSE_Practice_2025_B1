package com.demo.sabitha.collections.linkedlist;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo6 {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList=AddElement(10);
		LinkedList<Integer> linkedList2=new LinkedList<>();
		linkedList2.add(10);
		linkedList2.add(5);
		linkedList2.add(3);
		linkedList2.add(6);
		pollMethod(linkedList,linkedList2);
		clearMethod(linkedList2);
	}
	private static void clearMethod(LinkedList<Integer> linkedList2) {
		linkedList2.clear();
		System.out.println(linkedList2);
	}
	private static void pollMethod(LinkedList<Integer> linkedList, LinkedList<Integer> linkedList2) {
		int i1=linkedList.size();
		for(int i=1;i<=i1;i++) {
			Integer poll = linkedList.poll();
			System.out.println(poll);
		}
		System.out.println(linkedList.poll());
		System.out.println("Pollfirst"+linkedList.pollFirst());
		System.out.println("poll last"+linkedList.pollLast());
	}

	private static LinkedList<Integer> AddElement(int Element){
		LinkedList<Integer> linkedList=new LinkedList<>();
		for(int i=1;i<=Element;i++) {
			linkedList.offer(i);
		}
		return linkedList;
		
	}

}
