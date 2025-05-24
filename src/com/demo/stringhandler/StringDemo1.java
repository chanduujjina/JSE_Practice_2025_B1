package com.demo.stringhandler;

public class StringDemo1 {
	
	public static void main(String[] args) {
		String s1 = "test1";//literal
		
		String s2 = new String("test1");//object
		
		String s3 = "test2";
		
		String s4 = "test2";
		
		String s5 = "test1";
		
		//to compare the data inside the string constant pool area
		
		if (s3 == s4) {
			System.out.println(" s3 ==s4 is true");
		}
		
		if (s1 == s2) {
			System.out.println(" s1 ==s2 is true");
		}
		
		if (s3 == s5) {
			System.out.println("s3== s5");
		}
		
		if (s1.equals(s5)) {
			System.out.println("s1 equls s5 is true");
		}
		
		if (s2.equals(s1)) {
			System.out.println("s1 equls s2 is true");
		}
		
		
	}

}
