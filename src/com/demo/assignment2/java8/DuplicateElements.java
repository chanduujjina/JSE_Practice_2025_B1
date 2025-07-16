package com.demo.assignment2.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class DuplicateElements {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("chandu", "siva", "chandu", "raju", "raju");
		
		
		Set<String> unique =new HashSet<>();
		Set<String> duplicates =new HashSet<>();
		for(String name : list) {
			if(!unique.add(name)) {
				duplicates.add(name);
			}
			
		}
		System.out.println(" Duplicate Elements: "+ duplicates);
		}
		
		}
		
		
	


