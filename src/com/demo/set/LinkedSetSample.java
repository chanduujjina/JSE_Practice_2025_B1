package com.demo.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class LinkedSetSample {
	public static void main(String[] args) {
		Set<Integer> set=addElements(40);
		Set<Integer> set2=new LinkedHashSet<>();
		Iterator<Integer> iterator=set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
	
		


	private static Set<Integer> addElements(int Elements) {
		HashSet<Integer> set=new LinkedHashSet<>();
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
