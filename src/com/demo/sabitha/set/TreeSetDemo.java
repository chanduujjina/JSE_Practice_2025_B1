package com.demo.sabitha.set;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		TreeSet<String> set=addElements(20);
		for(String s:set) {
			System.out.print(s+" ");
		}
		System.out.println(" \n descendingSet "+set.descendingSet());
		System.out.println("\n-------------------descendingIterator-------------------");
		Iterator<String> descendingIterator = set.descendingIterator(); 
		while(descendingIterator.hasNext()) {
			System.out.print(descendingIterator.next()+" ");
		}
		
		
		
	}
	private static TreeSet<String> addElements(int element) {
		TreeSet<String> set=new TreeSet<>();
		set.add("hello");
		set.add("sai");
		set.add("sabitha");
		set.add("teja");
		set.add("vara");
		set.add("cherry");
		set.add("keerthana");
		set.add("devi");
		return set;
		
		
	}
	

}
