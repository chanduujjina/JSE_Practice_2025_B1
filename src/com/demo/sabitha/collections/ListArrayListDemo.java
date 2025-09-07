package com.demo.sabitha.collections;
import java.util.*;

public class ListArrayListDemo {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(12);
		list.add("sabitha");
		list.add(true);
		list.add(12.5);
		list.add(12l);
		list.add('c');
		GetElementEnhancedforloop(list);
		GetElementLegacyForloop(list);
		GetElementIterator(list);
	}

	private static void GetElementIterator(List list) {
		System.out.println("Iterator");
		Iterator iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}

	private static void GetElementLegacyForloop(List list) {
		System.out.println("legacy forloop");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}

	private static void GetElementEnhancedforloop(List list) {
		System.out.println("Enhanced  forloop");

		for(Object list1:list) {
			System.out.println(list1);
		}
		
	}
	

}
