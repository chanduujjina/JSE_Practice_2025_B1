package com.demo.collection.set;

import java.util.HashSet;

public class HashSetDemo2 {
	
	public static void main(String[] args) {
		
		HashSet<String> numberSet = new HashSet<>();
		
		numberSet.add("Chandu");
		numberSet.add("Sabitha");
		numberSet.add("Hemanth");
		numberSet.add("Sudhakar");
		numberSet.add("Ganesh");
		numberSet.add("Ganesh");
		numberSet.add(null);
		numberSet.add(null);
		
		System.out.println(numberSet);
		//it wot't follow insertion order
		//it won't allow duplicates
		
	}

}
