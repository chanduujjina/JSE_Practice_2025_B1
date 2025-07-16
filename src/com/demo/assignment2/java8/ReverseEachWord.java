package com.demo.assignment2.java8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord {
	public static void main(String[] args) {
		String input = "cool coder java 8";
		String result=Arrays.stream(input.split(" ")) .map(word -> new StringBuilder(word).reverse().toString()).collect(Collectors.joining(" "));
		System.out.println(result);
	}

}
