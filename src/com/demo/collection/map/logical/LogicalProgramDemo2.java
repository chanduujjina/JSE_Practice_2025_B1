package com.demo.collection.map.logical;

import java.util.HashMap;
import java.util.Map;

public class LogicalProgramDemo2 {
	
	public static void main(String[] args) {
		
		// frequency of duplicate Charcters
		
		String name = "chandrasekhar";
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
		
		//print only duplicates
		
		for (Map.Entry<Character, Integer> entry :  charCount.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}
	}

}
