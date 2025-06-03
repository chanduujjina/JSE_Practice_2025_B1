package com.demo.stringhandler;

public class StringReplaceDemo {
	
	public static void main(String[] args) {
		
		String name = "chandu123";
		
		String replaceAll = name.replaceAll("\\d", "");
		
		//System.out.println(replaceAll);
		
		String[] array = name.split("\\d");
		
		//System.out.println(array.length);
		
		for (String str : array) {
			System.out.println(str);
		}
	}

}
