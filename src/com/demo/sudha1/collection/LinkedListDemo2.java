package com.demo.sudha1.collection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo2 {
	public static void main(String[] args) {
		List<Integer> list=new LinkedList<>();
		AddElements(list);
		ListIterator<Integer> iterator=list.listIterator();
		while(iterator.hasNext()) {
			Integer next1 =iterator.next();
			if(next1>80 && next1<=list.size()) {
				iterator.set(100);
			
			
			}
			if (next1>1 && next1<=20) {
				iterator.remove();
			}
			if(next1>1 && next1<=20) {
				iterator.add(12);
			}
		}
		System.out.println(list);
		
	
	}

	private static void AddElements(List<Integer> list) {
		for(int i=0;i<=100;i++) {
			list.add(i);
			
		}
		
		
	}
}		