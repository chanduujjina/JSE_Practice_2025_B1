package com.demo.collection.set;

import java.util.HashSet;

public class HashSetDemo1 {
	
	public static void main(String[] args) {
		
		HashSet<Integer> numberSet = new HashSet<>();
		
		numberSet.add(1);
		numberSet.add(2);
		numberSet.add(3);
		numberSet.add(4);
		numberSet.add(5);
		
		numberSet.add(1);
		numberSet.add(2);
		numberSet.add(3);
		
		System.out.println(numberSet);
		
	}

}
