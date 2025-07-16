package com.demo.assignment2.java8;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
	public static void main(String[] args) {
		String input = "programming";
		char[] name=input.toCharArray();
		Map<Character,Integer> map=new HashMap<>();
		for(Character char1: name) {
			map.put(char1,map.getOrDefault(char1,0)+1);
		}
		for(Map.Entry<Character,Integer> entry:map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.print(entry.getKey()+" -> "+entry.getValue()+" ");
			}
	}

	}
	}
