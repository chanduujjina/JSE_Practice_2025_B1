package com.demo.stringhandler;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringDemo6 {
	
	public static void main(String[] args) {
		
		 String input = "Hello123";
	        Pattern pattern = Pattern.compile("\\d+");
	        Matcher matcher = pattern.matcher(input);

	        if (matcher.find()) {
	            System.out.println("Found digits: " + matcher.group());
	        }
	}

}
