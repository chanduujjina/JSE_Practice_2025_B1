package com.demo.collection.set;

import java.util.TreeSet;

public class TreeSetDemo3 {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> numberList = new TreeSet<>();
		numberList.add(10);
		numberList.add(20);
		numberList.add(30);
		numberList.add(40);
		
		System.out.println("lower(30) "+numberList.lower(30));// < E
		System.out.println("floor(30) "+numberList.floor(30));// <=E
		
		System.out.println("Higher(30) "+numberList.higher(30));// > E
		System.out.println("Ceiling(30) "+numberList.ceiling(30));//> =E
	}

}
