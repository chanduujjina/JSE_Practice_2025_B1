package com.demo.sabitha.set;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedSetDemo {
	
	public static void main(String[] args) {
		Set<String> set=addElements(20);
		Set<String> set1=new LinkedHashSet<>();
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("-----------  foreach ----------  ");
		for(String s:set) {
			System.out.println(s);
		}
	}
	private static Set<String> addElements(int element) {
		LinkedHashSet<String> set=new LinkedHashSet<>();
		set.add("hello");
		set.add("sai");
		set.add("sabitha");
		set.add("teja");
		set.add("vara");
		set.add("cherry");
		set.add("keerthana");
		set.add("devi");
		set.add(null);
		return set;
		
		
	}
	

}
