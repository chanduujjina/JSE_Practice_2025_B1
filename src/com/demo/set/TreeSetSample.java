package com.demo.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;


public class TreeSetSample {
	public static void main(String[] args) {
		TreeSet<Integer> set=addElements(40);
		System.out.println(set);
		for(int i:set) {
			System.out.println(i+" ");
		}
		System.out.println(" \n--------");
		Iterator<Integer> iterator=set.descendingIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
	
		


	private static TreeSet<Integer> addElements(int Elements) {
		TreeSet<Integer> set=new TreeSet<>();
		set.add(56);
		set.add(45);
		set.add(96);
		set.add(78);
		set.add(95);
		set.add(66);
		set.add(46);
		set.add(88);
		return set;
		
	
		
	}

}
