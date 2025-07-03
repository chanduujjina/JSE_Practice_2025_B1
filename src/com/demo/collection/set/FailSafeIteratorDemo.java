package com.demo.collection.set;

import java.util.concurrent.CopyOnWriteArraySet;

public class FailSafeIteratorDemo {

	public static void main(String[] args) {

		CopyOnWriteArraySet<Integer> numberSet = new CopyOnWriteArraySet<>();//copy of an Object
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
