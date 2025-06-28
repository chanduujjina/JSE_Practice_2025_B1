package com.demo.linklist.sudha;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import jdk.internal.misc.FileSystemOption;
import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

public class LinkedListSample2 {
	public static void main(String[] args) {
		
		LinkedList<Integer> linkedList=AddElements(20);
		LinkedList<Integer>linkedList2=linkedList;
		LinkedList<String> linkedList3= new LinkedList<>();
		LinkedList<Integer>linkedList4=new LinkedList<>();
		linkedList4.offer(13);
		linkedList4.offer(9);
		linkedList4.offer(28);
		AddElement(linkedList3);
		
		GetMethod(linkedList);
		peekMethod(linkedList);
		IndexOfMethod(linkedList);
		ContainsMethd(linkedList,linkedList2, linkedList3,linkedList4);
		ElementMethod(linkedList);
		System.out.println(linkedList+" ");
		
		
	}
   private static void AddElement(LinkedList<String> linkedList3) {
		for (int i =0;i<20;i++) {
			linkedList3.add(String.valueOf(i));
		}
	}
private static void ContainsMethd(LinkedList<Integer> linkedList,LinkedList<Integer> linkedList2,LinkedList<String> linkedList3, LinkedList<Integer> linkedList4) {
		System.out.println("contains");
		System.out.println(linkedList.contains(6));
		System.out.println(linkedList.contains(0));
		System.out.println(linkedList.contains(1));
	System.out.println(linkedList.containsAll(linkedList2));
	System.out.println(linkedList.containsAll(linkedList3));
	System.out.println(linkedList.containsAll(linkedList4));
	
	}
private static void IndexOfMethod(LinkedList<Integer> linkedList) {
		System.out.println("Indexof");
	   System.out.println(linkedList.indexOf(7));
	   System.out.println(linkedList.lastIndexOf(6));
	}
private static void ElementMethod(LinkedList<Integer> linkedList) {
       System.out.println("Elements");
       int i1=linkedList.size();
       for(int i=1;i<i1;i++) {
    	   
       }
       linkedList.poll();

	   System.out.println("Element");//ConcurrentModificationException
	   System.out.println(linkedList.element());
		
	}
private static void peekMethod(LinkedList<Integer> linkedList) {
		System.out.println(linkedList.peekFirst());
		System.out.println(linkedList.peekLast());
		
	}
private static void GetMethod(LinkedList<Integer> linkedList) {
	System.out.println("Get method");
	for(int i=1;i<linkedList.size();i++) {
		System.out.print(linkedList.get(i)+" ");
	}
	
		System.out.println(linkedList.get(8));
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.getLast());
	}
	

private static LinkedList<Integer>  AddElements(int Element) {
    	 LinkedList<Integer> linkedList=new LinkedList<>();
    	 LinkedList<Integer> linkedList2=new LinkedList<>();
    	 for(int i =1;i<=Element;i++) {
    		 linkedList.offer(i);
    		
    	 }
    	 linkedList.add(6);
     return linkedList;
}
}










