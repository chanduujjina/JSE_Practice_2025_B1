package com.demo.assignment2.java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
	public static void main(String[] args) {
		String input="coolcoder";
		
		Character result=input.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(entry -> entry.getValue()==1).map(Map.Entry::getKey).findFirst().orElse(null);
	
	     System.out.println(" First Non-Repeated Character: "+result);
	
	}

}
