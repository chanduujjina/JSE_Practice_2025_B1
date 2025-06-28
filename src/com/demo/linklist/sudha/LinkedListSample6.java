package com.demo.linklist.sudha;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import jdk.internal.misc.FileSystemOption;
import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

public class LinkedListSample6 {
	public static void main(String[] args) {
		
		LinkedList<Integer> linkedList=AddElements(20);
		LinkedList<Integer> linkedList2=new LinkedList<>();
		linkedList2.add(12);
		linkedList2.add(16);
		linkedList2.add(8);
		linkedList2.add(7);
	    PollMethod(linkedList,linkedList2);
	    ClearMethod(linkedList2);
	
		
	}
   
		

private static void ClearMethod(LinkedList<Integer> linkedList2) {
	linkedList2.clear();
	System.out.println(linkedList2);
		
	}



private static void PollMethod(LinkedList<Integer> linkedList, LinkedList<Integer> linkedList2) {
	int i1=linkedList.size();
	for (int i =1;i<=i1;i++) {
		  Integer poll = linkedList.poll();
		System.out.println(poll);
		
		
	}
	System.out.println(linkedList.poll());
		System.out.println(linkedList.pollFirst());
		System.out.println(linkedList.pollLast());
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










