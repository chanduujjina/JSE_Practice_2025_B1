package com.demo.sabitha.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class SetDemo {
	
	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		set.add("12");
		set.add("34");
		set.add("12");
		set.add("11");
		set.add("65");
		set.add("80");
		set.add(null);
		set.add(null);
		for(String x:set) {
			System.out.println(x);
		}
		System.out.println(" Iterator ");
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		//Exceptions
		ListIterator<String> iterator2=(ListIterator<String>) set.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		
		
		
	}

}
