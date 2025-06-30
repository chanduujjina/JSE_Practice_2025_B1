package com.demo.collection.set;

import java.util.TreeSet;

public class TreeSetDemo2 {
	
	public static void main(String[] args) {
		
		
		TreeSet<String> nameSet = new TreeSet<>();
		nameSet.add("Chandu");
		nameSet.add("Sabitha");
		nameSet.add("Hemanth");
		nameSet.add("Sudhakar");
		nameSet.add("Ganesh");
		nameSet.add("Ganesh");
		nameSet.add(null);
		
		System.out.println(nameSet);//It will perform Sorting
		
		
	}

}
