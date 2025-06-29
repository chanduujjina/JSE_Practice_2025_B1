package com.demo.collection.set;

import java.util.LinkedHashSet;
import java.util.SequencedSet;

public class LinkedHaseSetDemo1 {
	
	public static void main(String[] args) {
		
		LinkedHashSet<String> nameHashSet = new LinkedHashSet<>();
		nameHashSet.add("Chandu");
		nameHashSet.add("Sabitha");
		nameHashSet.add("Hemanth");
		nameHashSet.add("Sudhakar");
		nameHashSet.add("Ganesh");
		nameHashSet.add("Ganesh");
		
		System.out.println(nameHashSet);
		
		SequencedSet<String> reversed = nameHashSet.reversed();
		
		System.out.println(reversed);
	}

}
