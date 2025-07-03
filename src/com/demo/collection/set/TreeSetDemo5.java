package com.demo.collection.set;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo5 {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> numberList = new TreeSet<>();
		numberList.add(10);
		numberList.add(20);
		numberList.add(30);
		numberList.add(40);
		
		SortedSet<Integer> subSet1 = numberList.subSet(20, 40);//Inclusive,Exclusive
		
		System.out.println(subSet1);
		
		NavigableSet<Integer> subSet2 = numberList.subSet(20, true, 40, true);
		
		System.out.println(subSet2);
		
		//headSet
		
		SortedSet<Integer> headSet1 = numberList.headSet(30);//inclusion false
		
		System.out.println(headSet1);
		
		NavigableSet<Integer> headSet2 = numberList.headSet(30,true);
		System.out.println(headSet2);
		
		//tailSet
		
		SortedSet<Integer> tailSet1 = numberList.tailSet(20);//inclusion true
		
		System.out.println(tailSet1);
		
		NavigableSet<Integer> tailSet2 = numberList.tailSet(20, false);
		System.out.println(tailSet2);
		
	}

}
