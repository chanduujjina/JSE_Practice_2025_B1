package com.demo.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FailsafeInternalWorkFlow {
	
	public static void main(String[] args) {
		
		List<Integer> originalList = Arrays.asList(1,3,5,6,7);
		
		List<Integer> copyList = new ArrayList<>(originalList);
		
		for (int number : originalList) {
			copyList.add(1);
		}
		
		System.out.println(copyList);
	}

}
