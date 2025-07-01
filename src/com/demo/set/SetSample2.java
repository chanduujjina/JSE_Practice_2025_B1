package com.demo.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class SetSample2 {
	public static void main(String[] args) {
		Set<Integer> set=addElements(40);
		Set<Integer> set2=new HashSet<>();
		set2.add(88);
		set2.add(66);
		set2.add(74);
		set2.add(70);
		toArrayMethod(set);
		ContainsMethod(set,set2);
		RemoveMethod(set,set2);
		RetainAllMethod(set);
		
		
		
	
	}

	private static void RetainAllMethod(Set<Integer> set) {
	System.out.println("RetainAll Method");
	System.out.println(set.retainAll(set));
	}

	private static void RemoveMethod(Set<Integer> set, Set<Integer> set2) {
		set.remove(88);
		set.removeAll(set);
		System.out.println(set.removeAll(set2));
	}

	private static void ContainsMethod(Set<Integer> set, Set<Integer> set2) {
		System.out.println(set.contains(88));
		System.out.println(set.contains(45));
		System.out.println(set.contains(66));
		System.out.println(set.containsAll(set));
		System.out.println(set.contains(100));
		System.out.println(set.contains(25));
	}

	private static void toArrayMethod(Set<Integer> set) {
		Object[] array=set.toArray();
		System.out.println(Arrays.toString(array));
	}

	private static Set<Integer> addElements(int Elements) {
		HashSet<Integer> set=new HashSet<>();
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
