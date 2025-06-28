package com.demo.linklist.sudha;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import jdk.internal.misc.FileSystemOption;
import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

public class LinkedListSample3 {
	public static void main(String[] args) {
		
		LinkedList<Integer> linkedList=AddElements(20);
		SetMethod(linkedList);
		System.out.println(linkedList);
	
	
		
	}
   
		

private static void SetMethod(LinkedList<Integer> linkedList) {
		Integer set = linkedList.set(10,15);
		System.out.println(linkedList);
		ListIterator<Integer> listIterator=linkedList.listIterator();
		while(listIterator.hasNext()) {
			Integer element=listIterator.next();
			if(element.equals(5)) 
				listIterator.set(12);
			}
		
		System.out.println(listIterator);
	
}


private static LinkedList<Integer>  AddElements(int Element) {
    	 LinkedList<Integer> linkedList=new LinkedList<>();
    	 for(int i =1;i<=Element;i++) {
    		 linkedList.offer(i);
    		
    	 }
     return linkedList;
}
}










