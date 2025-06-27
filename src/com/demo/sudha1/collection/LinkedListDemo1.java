package com.demo.sudha1.collection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo1 {
	public static void main(String[] args) {
		List<Integer> list=new LinkedList<>();
		AddElements(list);
		System.out.println("Forward");
		ListIterator<Integer> iterator1=list.listIterator();
		while(iterator1.hasNext()){
			System.out.print(iterator1.next()+" ");
			
		}
		System.out.println("Back word");
		ListIterator<Integer> iterator2=list.listIterator(list.size());
		while(iterator2.hasPrevious()) {
			System.out.print(iterator2.previous()+" ");
			
		      
		}
		
	
	}

	private static void AddElements(List<Integer> list) {
		for(int i=0;i<=100;i++) {
			list.add(i);
			
		}
		
		
	}
}		