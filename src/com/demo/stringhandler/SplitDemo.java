package com.demo.stringhandler;

public class SplitDemo {
	
	public static void main(String[] args) {
		String word = " this is string demo";
		
		String[] wordArray = word.split(" ");
		
		for (String val :wordArray) {
			System.out.println(val);
		}
	}

}
