package com.demo.collection.set;

import java.util.TreeSet;

public class TreeSetDemo4 {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> numberList = new TreeSet<>();
		numberList.add(10);
		numberList.add(20);
		numberList.add(30);
		numberList.add(40);
		
		System.out.println("lower(25) "+numberList.lower(25));// < E//20
		System.out.println("floor(25) "+numberList.floor(25));// <=E//20
		
		System.out.println("Higher(25) "+numberList.higher(25));// > E//30
		System.out.println("Ceiling(25) "+numberList.ceiling(25));//> =E//30
	}

}
