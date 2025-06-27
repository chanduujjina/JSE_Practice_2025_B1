package com.demo.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AggregatorDemo1 {
	
	public static void main(String[] args) {
		List<Integer> numberList = addElements(10);
		
		//sum
		int sum =0;
		for (int val :numberList) {
			sum =sum+val;
		}
		
		System.out.println(sum);
		
		//max
		Integer max = Collections.max(numberList);
		
		System.out.println(max);
		
		//min
		Integer min = Collections.min(numberList);
		
		System.out.println(min);
		
		//average
		
		float  average = sum/numberList.size();
		
		System.out.println(average);
		
		//count
		
		int size = numberList.size();
		System.out.println(size);
	}
	
	private static List<Integer> addElements(int elemnts) {
		List<Integer> list = new ArrayList<>();//abstraction
		
		for (int i =1;i<=elemnts;i++) {
			list.add(i);
		}
		return list;
	}

}
