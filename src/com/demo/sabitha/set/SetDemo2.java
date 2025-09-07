package com.demo.sabitha.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetDemo2 {
	
	public static void main(String[] args) {
		Set<String> set=addElements(20);
		Set<String> set1=new HashSet<>();
		set1.add("sabitha");
		set1.add("teja");
		toArrayaMethod(set);
		containMethod(set,set1);
		retainAllMethod(set,set1);
		removeMethod(set,set1);
	}
	
	private static void retainAllMethod(Set<String> set, Set<String> set1) {
		System.out.println("retainAllMethod");
		System.out.println(set.retainAll(set1));		
	}

	private static void removeMethod(Set<String> set, Set<String> set1) {
		System.out.println("remove");
		System.out.println(set.remove((Object)"sabitha"));
		System.out.println(set.removeAll(set1));
		System.out.println(set);
	}

	private static void containMethod(Set<String> set, Set<String> set1) {
		System.out.println(set.contains("sabitha"));
		System.out.println(set.contains("sree"));
		System.out.println(set.containsAll(set1));
	}

	private static void toArrayaMethod(Set<String> set) {
		Object[] array = set.toArray();
		System.out.println(Arrays.toString(array));
		
		
	}
	private static Set<String> addElements(int element) {
		HashSet<String> set=new HashSet<>();
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
