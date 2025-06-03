package com.demo.stringhandler;

public class Joindemo {
	
	public static void main(String[] args) {
		String word = "java is object oriented programming";
		
		String[] wordArray = word.split(" ");//method
		
		String join = word.join("-", wordArray);//java-is-object-oriented-programming

		
		System.out.println(join);
		
		
	     
		
		
	}

}
