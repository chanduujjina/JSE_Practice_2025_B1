package com.demo;

public class ROprDemo1 {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b= 11;
		
		boolean isEqual = a == b;//equal
		
		System.out.println("equl operator :"+isEqual);
		
		boolean isNotEqual = a != b;
		
		System.out.println("not equal operator:"+isNotEqual);
		
		boolean isGreater = a > b;
		
		System.out.println("greater than operator:"+isGreater);
		
		boolean isLeser = a < b;
		System.out.println("lesser than operator:"+isLeser);
		
		boolean isGreaerThanOrEqual = a >= b;
		
		System.out.println("> =  operator:"+isGreaerThanOrEqual);
		
		boolean isLesserThanOrEqual = a <= b;
		
		System.out.println("< =  operator:"+isLesserThanOrEqual);
		
	}

}
