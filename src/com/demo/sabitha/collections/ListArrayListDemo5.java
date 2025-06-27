package com.demo.sabitha.collections;
import java.util.*;

public class ListArrayListDemo5 {
	public static void main(String[] args) {
		List<Integer> list=new LinkedList<>() ;
		AddElements(list);
		System.out.println("Forword");
		ListIterator<Integer> listIterator=list.listIterator();
		while(listIterator.hasNext()) {
			System.out.print(listIterator.next()+" ");
		}
		System.out.println("Back word");
		System.out.println();
		ListIterator<Integer> listIterator2=list.listIterator(list.size());
		while(listIterator2.hasPrevious()) {
			System.out.print(listIterator2.previous()+" ");
		}
		
		
	}

	private static void AddElements(List<Integer> list) {
		for(int i=1;i<=100;i++) {
			list.add(i);
		}
		
	}
	

	
	
		
}
	