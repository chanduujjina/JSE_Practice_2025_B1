package com.demo.stringhandler;

public class ValueOfDemo1 {
	
	public static void main(String[] args) {
		int webRequestId = 10;
		
		String dbId = "10";
		
		boolean equals = dbId.equals(String.valueOf(webRequestId));
		
		System.out.println(equals);
		
	}
	
	

}
