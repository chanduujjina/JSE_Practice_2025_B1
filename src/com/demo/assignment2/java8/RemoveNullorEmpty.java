package com.demo.assignment2.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveNullorEmpty {
	public static void main(String[] args) {
		 List<String> names = Arrays.asList("chandu", "", null, "siva", " ");
		 List<String> names1=names.stream().filter(name -> name != null && !name.trim().isEmpty()).collect(Collectors.toList());
		 System.out.println(names1);
	}

}
