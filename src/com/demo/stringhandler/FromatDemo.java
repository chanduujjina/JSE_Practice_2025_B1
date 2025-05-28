package com.demo.stringhandler;

public class FromatDemo {
	
	public static void main(String[] args) {
		
		String value = " %s  requires %d month to complete";
		
		String format = value.format(value, "java",3);
		
		System.out.println(format);
	}

}
