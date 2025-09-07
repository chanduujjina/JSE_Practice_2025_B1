package com.demo.sabitha.collections;
import java.util.*;

public class ListArrayListDemo6 {
	public static void main(String[] args) {
		List<Integer> list=new LinkedList<>() ;
		AddElements(list);
		ListIterator<Integer> listIterator=list.listIterator();
		while(listIterator.hasNext()) {
			Integer next1 = listIterator.next();
			if(next1>90 && next1<=list.size()) {
				listIterator.set(200);
			}
			if(next1>1 && next1<=10) {
				listIterator.remove();
			}
			if(next1>=1 && next1<=10) {
				listIterator.add(11);
			}
		}
		System.out.println(list);
	
		
	}

	private static void AddElements(List<Integer> list) {
		for(int i=1;i<=100;i++) {
			list.add(i);
		}
		
	}
	

	
	
		
}
	