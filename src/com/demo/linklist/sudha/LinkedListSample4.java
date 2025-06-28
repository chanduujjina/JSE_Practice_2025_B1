package com.demo.linklist.sudha;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import jdk.internal.misc.FileSystemOption;
import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

public class LinkedListSample4 {
	public static void main(String[] args) {
		
		LinkedList<Integer> linkedList=AddElements(20);
		LinkedList<Integer> linkedList2=new LinkedList<>();
		linkedList2.add(12);
		linkedList2.add(16);
		linkedList2.add(8);
		linkedList2.add(7);
		Remove(linkedList,linkedList2);
	
		
	}
   
		

private static void Remove(LinkedList<Integer> linkedList, LinkedList<Integer> linkedList2) {
	System.out.println("Remove");
		Integer remove=linkedList.remove();
		System.out.println("remove the First value "+remove);
		System.out.println(linkedList);
		Integer remove2 = linkedList.remove(6);
		System.out.println("remove the index value "+remove2);
		System.out.println(linkedList);
		boolean remove3=linkedList.remove((Object)3);
		System.out.println("object returns boolean"+linkedList);
		System.out.println(linkedList);
		boolean removeAll =linkedList.removeAll(linkedList2);
		System.out.println(removeAll);
		System.out.println(linkedList2);
		Integer removeFirst = linkedList2.removeFirst();
		System.out.println("First value removed "+removeFirst);
		Integer removeLast = linkedList2.removeLast();
		System.out.println("Last value removed "+removeLast);
		boolean removeFirstOccurence=linkedList.removeFirstOccurrence((Object)4);
		System.out.println(removeFirstOccurence);
		System.out.println("removeFirstoccurence "+linkedList);
	   boolean removeLastOccurrence	= linkedList.removeLastOccurrence((Object)4);
	   System.out.println( removeLastOccurrence);
	   System.out.println(" removeLastOccurrence "+linkedList);
	   System.out.println(linkedList);
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










