package com.demo.stringhandler.quiz;

public class Demo1 {
	
	public static void main(String[] args) {
		String name = "abc";
		
		
		
		
		int codePointAt = name.codePointAt(1);
		
		System.out.println(codePointAt);
		
		int codePointBefore = name.codePointBefore(1);
		
		System.out.println(codePointBefore);
		
		int codePointCount = name.codePointCount(1, name.length());
		
		System.out.println(codePointCount);
		
		String value = "example";
		
		int indexOf = value.indexOf("e", 1,value.length());
		
		System.out.println(indexOf);
		
		
		
	}

}
