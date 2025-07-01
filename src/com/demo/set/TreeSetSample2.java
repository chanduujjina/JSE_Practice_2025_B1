package com.demo.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetSample2 {
	public static void main(String[] args) {
		TreeSet<Integer> set = addElements(40);
		returnValuesMethod(set);
		headSetmethod(set);
		tailMethod(set);
		subSetMethod(set);

	}

	private static void subSetMethod(TreeSet<Integer> set) {
		System.out.println(set.subSet(56, true, 96, true));
		
	}

	private static void tailMethod(TreeSet<Integer> set) {
		System.out.println(set.tailSet(46,false));
	}

	private static void headSetmethod(TreeSet<Integer> set) {
		System.out.println(set.headSet(56,true));
		
		
	}

	private static void returnValuesMethod(TreeSet<Integer> set) {
		System.out.println(set.floor(47));
		System.out.println(set.ceiling(44));
		System.out.println(set.lower(50));
		System.out.println(set.higher(77));

	}

	private static TreeSet<Integer> addElements(int Elements) {
		TreeSet<Integer> set = new TreeSet<>();
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
