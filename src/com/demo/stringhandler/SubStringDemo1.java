package com.demo.stringhandler;

public class SubStringDemo1 {
	
	public static void main(String[] args) {
		
		String value = "test123";
		
		String subpart2 = value.substring(value.length()-3, value.length());
		
		System.out.println(subpart2);
		
		String subPart2 = value.substring(0, value.length()-3);
		
		System.out.println(subPart2);
		
		String filepath = "c/chandu/abc.pdf";
		
		//c/chandu
		//abc.pdf
		
		//int lastIndexOf = filepath.lastIndexOf("/");
		
		//System.out.println(lastIndexOf);
		
		String part1 = filepath.substring(0, filepath.lastIndexOf("/")+1);
		
		System.out.println(part1);
		
		String part2 = filepath.substring(filepath.lastIndexOf("/")+1, filepath.length());
		
		System.out.println(part2);
		
		
	}

}
