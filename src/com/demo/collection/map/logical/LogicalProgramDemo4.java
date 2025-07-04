package com.demo.collection.map.logical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class LogicalProgramDemo4 {
	
	public static void main(String[] args) {
		
		// frequency of duplicate Charcters
		
		int value = 110002222;
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
		
		//sort in desc based on value
		
		List<Map.Entry<Character, Integer>> list = new ArrayList<>();
		
		for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			list.add(entry);
		}
		
		
		Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {

			@Override
			public int compare(Entry<Character, Integer> entry1, Entry<Character, Integer> entry2) {
				// TODO Auto-generated method stub
				return entry2.getValue()-entry1.getValue();
			}

			
		});
		//find N frequency of Charctres
		// N = 2
		
		System.out.println(list);
		
		int input = 2;
		int count =1;
		for (Map.Entry<Character, Integer> entry : list) {
			if (count <=input) {
				System.out.println(entry);
			}
			else {
				break;
			}
			count++;
		}
		
	
	}

}
