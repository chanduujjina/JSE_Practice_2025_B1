package com.demo.collection.map.logical;

import java.util.HashMap;
import java.util.Map;

public class LogicalProgramDemo1 {
	
	public static void main(String[] args) {
		
		// frequency of charcters
		
		String name = "chandra";
		// c -1,a-2,s-1
		
		Map<Character, Integer> charCount = new HashMap<>();
		
		for (char ch : name.toCharArray()) {
			
			if (charCount.containsKey(ch)) {// for same key
				charCount.put(ch, charCount.get(ch)+1);
			}
			else {
				charCount.put(ch, 1);//entry one
			}
			
			
			
		}
		
		System.out.println(charCount);
		
	}

}
