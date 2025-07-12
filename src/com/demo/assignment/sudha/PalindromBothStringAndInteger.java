package com.demo.assignment.sudha;

public class PalindromBothStringAndInteger {
	public static void main(String[] args) {
		StringBuilder a=new StringBuilder(222);
		StringBuilder reverse=a.reverse();
		if(a==reverse) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println(" not a Palindrome");
		}
	}
	

}
