package com.demo.stringhandler;

public class TrimDemo {
	
	public static void main(String[] args) {
		
		String webRequest = "helloworld";
		
		String valFromDb = " helloworld "; 
		
		boolean equals = webRequest.equals(valFromDb.trim());
		
		System.out.println(equals);
	}

}
