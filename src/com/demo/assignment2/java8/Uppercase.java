package com.demo.assignment2.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Uppercase {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("chandu", "cool", "coder");
		
		List<String> upperCaseNames=names.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println(upperCaseNames);
		
		
	}

}
