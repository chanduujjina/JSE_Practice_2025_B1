package com.demo.sabitha.collections.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo2 {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList=AddElement(10);
		LinkedList<Integer> linkedList2=linkedList;
		LinkedList<String> linkedList3=new LinkedList<>();
		LinkedList<Integer> linkedList4=new LinkedList<>();
		linkedList4.offer(20);
		linkedList4.offer(6);
		linkedList4.offer(23);
		AddElement(linkedList3);
		GetMethod(linkedList);
		PeekMethod(linkedList);
		IndexOfMethod(linkedList);
		Containsmethod(linkedList,linkedList2,linkedList3,linkedList4);
		ElemetMethod(linkedList);
		
		
		System.out.println(linkedList);
	}
	
	private static void AddElement(LinkedList<String> linkedList3) {
		for(int i=1;i<10;i++) {
			linkedList3.add(String.valueOf(i));
		}
	}

	private static void Containsmethod(LinkedList<Integer> linkedList, LinkedList<Integer> linkedList2, LinkedList<String> linkedList3, LinkedList<Integer> linkedList4) {
		System.out.println("contains");
		System.out.println(linkedList.contains(9));
		System.out.println(linkedList.contains(0));
		System.out.println(linkedList.contains(1));
		System.out.println(linkedList.containsAll(linkedList2));
		System.out.println(linkedList.containsAll(linkedList3));
		System.out.println(linkedList.containsAll(linkedList4));
	}

	private static void IndexOfMethod(LinkedList<Integer> linkedList) {
		System.out.println("IndexOf");
		System.out.println(linkedList.indexOf(6));
		System.out.println(linkedList.lastIndexOf(9));
	}

	private static void ElemetMethod(LinkedList<Integer> linkedList) {
		System.out.println("Element");
		int i1=linkedList.size();
		for(int i=1;i<=i1;i++)
		{
			linkedList.poll();
		}
		//Exception java.util.NoSuchElementException
		System.out.println("Element");
		System.out.println(linkedList.element());
	}

	private static void PeekMethod(LinkedList<Integer> linkedList) {
		System.out.println("Peek");
		System.out.println(linkedList.peekFirst());
		System.out.println(linkedList.peekLast());
		
	}

	private static void GetMethod(LinkedList<Integer> linkedList) {
		System.out.println("GetMethod");
		for(int i=0;i<linkedList.size();i++) {
			System.out.print(linkedList.get(i)+" ");
		}
		
		System.out.println();
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.getLast());
	}
	
	private static LinkedList<Integer> AddElement(int Element){
		LinkedList<Integer> linkedList=new LinkedList<>();
		LinkedList<Integer> linkedList2=new LinkedList<>();
		for(int i=1;i<=Element;i++) {
			linkedList.offer(i);
		}
		linkedList.offer(9);
		return linkedList;
		
	}

}
