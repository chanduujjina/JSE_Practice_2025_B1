package com.demo.sabitha.collections.linkedlist;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo4 {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList=AddElement(10);
		LinkedList<Integer> linkedList2=new LinkedList<>();
		linkedList2.add(10);
		linkedList2.add(5);
		linkedList2.add(3);
		linkedList2.add(6);
		Remove(linkedList,linkedList2);
	}
	private static void Remove(LinkedList<Integer> linkedList, LinkedList<Integer> linkedList2) {
		System.out.println("Remove");
		Integer remove = linkedList.remove();
		System.out.println("Just remove first value "+remove);
		System.out.println(linkedList);
		Integer remove2 = linkedList.remove(3);
		System.out.println("remove index the value "+remove2);
		System.out.println(linkedList);
		boolean remove3 = linkedList.remove((Object)3);
		System.out.println("just pass Object it returns boolean "+linkedList);
		boolean removeAll = linkedList.removeAll(linkedList2);
		System.out.println("Remove all commion elements "+removeAll);
		System.out.println(linkedList2);
		Integer removeFirst = linkedList2.removeFirst();
		System.out.println("remove first value "+removeFirst);
		Integer removeLast = linkedList2.removeLast();
		System.out.println("remove last value "+removeLast);
		System.out.println(linkedList);
		boolean removeFirstOccurrence = linkedList.removeFirstOccurrence((Object)9);
		System.out.println(removeFirstOccurrence);
		System.out.println("removeFirstOccurrence"+linkedList);
		boolean removeLastOccurrence = linkedList.removeLastOccurrence((Object)9);
		System.out.println("removelastOccurrence"+removeLastOccurrence);
		System.out.println(linkedList);
	}



	private static LinkedList<Integer> AddElement(int Element){
		LinkedList<Integer> linkedList=new LinkedList<>();
		for(int i=1;i<=Element;i++) {
			linkedList.offer(i);
		}
		linkedList.add(9);
		return linkedList;
		
	}

}
