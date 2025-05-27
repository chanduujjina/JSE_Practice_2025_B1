package com.demo.stringhandler;

public class StringDemo7 {
	
	public static void main(String[] args) {
		
		String name = "test";
		//give the chat by index
		char ch1 = name.charAt(3);
		
		System.out.println(ch1);
		
		int nonOcurranceChar = name.indexOf('a');
		
		System.out.println(nonOcurranceChar);
		
		//first ocuurance
		
		
		int firstOcuurance = name.indexOf('t');
		
		int lastIndexOf = name.lastIndexOf('t');
		
		System.out.println("firstOcuurance::"+firstOcuurance);
		
		System.out.println("last ocuurance :"+lastIndexOf);
		
		
	}

}
