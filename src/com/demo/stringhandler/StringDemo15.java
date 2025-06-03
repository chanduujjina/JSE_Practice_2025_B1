package com.demo.stringhandler;

public class StringDemo15 {
	public static void main(String[] args) {
		/*
		 * String name ="test ";
		 * 
		 * name = name.repeat(5);
		 * 
		 * System.out.println(name);
		 */
		
		String name1 = "chandu123";
		
		//get the number by removing name
		
		//get the String by removing number
		
		String name = name1.replaceAll("\\d", "");
		
		System.out.println(name);
		
		String number = name1.replaceAll("\\D", "");
		
		System.out.println(number);
	}

}
