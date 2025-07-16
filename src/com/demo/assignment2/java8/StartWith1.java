package com.demo.assignment2.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartWith1 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 21, 13, 11, 2, 31);
		List<Integer> startingWith = numbers.stream().filter(num->String.valueOf(num).startsWith("1")).collect(Collectors.toList());
	      System.out.println(startingWith);
	}

}
