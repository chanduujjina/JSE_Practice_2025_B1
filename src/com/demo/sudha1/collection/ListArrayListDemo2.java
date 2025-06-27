package com.demo.sudha1.collection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListArrayListDemo2 {
	public static void main(String[] args) {
		List list =new ArrayList();
		list .add(6);
		list.add("sudha");
		list.add(true);
		list.add(24.5);
		list.add(242);
		list.add('d');
		list.add(new Demo1(1,"cherry"));
		
		getElementsEnhancedforLoop(list);
		getElementsLegacyforLoop(list);
		getElementsIterator(list);
	
	}

	private static void getElementsIterator(List list) {
		Iterator iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	private static void getElementsLegacyforLoop(List list) {
		System.out.println("Legacy forloop");
		for(int i =0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

	private static void getElementsEnhancedforLoop(List list) {
		System.out.println("Enhanced forloop");
		for(Object list1:list) {
			System.out.println(list1);
		}
	}

	
		
	}


