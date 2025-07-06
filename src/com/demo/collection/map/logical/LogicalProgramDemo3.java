package com.demo.collection.map.logical;

import java.util.HashMap;
import java.util.Map;

public class LogicalProgramDemo3 {
	
	public static void main(String[] args) {
		
		// frequency of duplicate Charcters
		
		int value = 111002;
		// 1 -> 3, 0 -> 3 2-> 3
		
		// c -1,a-2,s-1
		
		Map<Character, Integer> charCount = new HashMap<>();
		
		for (char ch : String.valueOf(value).toCharArray()) {
			
			if (charCount.containsKey(ch)) {// for same key
				charCount.put(ch, charCount.get(ch)+1);
			}
			else {
				charCount.put(ch, 1);//entry one
			}
			
			
			
		}
		
		System.out.println(charCount);
		
		int count =2;
		
		Map<Character, Integer> result = new HashMap<>();
		
		int temp =1;
		for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			if (temp <=count) {
			result.put(entry.getKey(), entry.getValue());
			}
			else {
				break;
			}
			
			temp++;
			
		}
		System.out.println(result);
		
	
	}

}
