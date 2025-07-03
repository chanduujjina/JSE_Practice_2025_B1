package com.demo.collection.set;

import java.util.HashSet;

public class FailFastIteratorDemo1 {

	public static void main(String[] args) {

		HashSet<Integer> numberSet = new HashSet<>();
		numberSet.add(1);
		numberSet.add(2);
		numberSet.add(3);
		numberSet.add(4);
		numberSet.add(5);
		
		for (int num : numberSet) {//reading element from collection
			numberSet.remove(1);//removing element from collection
		}
		
		System.out.println(numberSet);

	}

}
