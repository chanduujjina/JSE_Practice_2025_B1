package com.demo.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class SetSample1 {
	public static void main(String[] args) {
		Set<Integer> set=new HashSet<>();
		set.add(5);
		set.add(8);
		set.add(23);
		set.add(71);
		set.add(88);
		set.add(33);
		set.add(63);
		set.add(55);
		set.add(88);
		set.add(33);
		System.out.println(set);
		for(int i :set) {
			System.out.println(i);
	
		}
		
		Iterator<Integer>  iterator=set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	
	}

}
