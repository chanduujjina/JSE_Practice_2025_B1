package com.demo.assignment2.java8;

import java.util.HashMap;
import java.util.Map;

public class FrequencyDemo {
	public static void main(String[] args) {
		String name= " mango";
		char [] name1=name.toCharArray();
		Map<Character, Integer> map =new HashMap<>();
		for(Character char1 : name1) {
			map.put(char1, map.getOrDefault(char1,0) +1);
		}
		System.out.println(map);
	}
	

}
