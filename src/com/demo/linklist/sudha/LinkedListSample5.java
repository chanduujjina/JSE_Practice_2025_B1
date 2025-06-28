package com.demo.linklist.sudha;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import jdk.internal.misc.FileSystemOption;
import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

public class LinkedListSample5 {
	public static void main(String[] args) {
		
		LinkedList<Integer> linkedList=AddElements(20);
		LinkedList<Integer> linkedList2=new LinkedList<>();
		linkedList2.add(12);
		linkedList2.add(16);
		linkedList2.add(8);
		linkedList2.add(7);
	    RetainMethod(linkedList,linkedList2);
	
		
	}
   
		

private static void RetainMethod(LinkedList<Integer> linkedList, LinkedList<Integer> linkedList2) {
	System.out.println(linkedList.retainAll(linkedList2));
	System.out.println(linkedList);
	System.out.println(linkedList2);
	}

private static LinkedList<Integer>  AddElements(int Element) {
    	 LinkedList<Integer> linkedList=new LinkedList<>();
    	 for(int i =1;i<=Element;i++) {
    		 linkedList.offer(i);
    		
    	 }
    	 linkedList.add(4);
     return linkedList;
}
}










