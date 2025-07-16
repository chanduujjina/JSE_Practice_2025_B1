package com.demo.assignment2.java8;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfOccurences {
	public static void main(String[] args) {
		String input= "java java spring boot java";
		String [] name=input.split(" ");
		Map<String, Integer> map=new HashMap<>();
		for(String name1 : name) {
			map.put(name1, map.getOrDefault(name1,0) + 1);
		}
		System.out.println(map);
	}

}
