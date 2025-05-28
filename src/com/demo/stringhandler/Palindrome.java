package com.demo.stringhandler;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String name ="madama";
		
		System.out.println(name.length());
		
		char[] charArray = name.toCharArray();
		
		String reverse = "";
		for (int i = name.length()-1;i>=0;i--) {//
			reverse = reverse+charArray[i];
		}
		System.out.println(reverse);
		
		if (name.equals(reverse)) {
			System.out.println(name+" is a plaindrome");
		}
		else {
			System.out.println(name+" is not a plaindrome");
		}
	}

}
