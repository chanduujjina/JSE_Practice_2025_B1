package com.demo.operator;

public class LogicalOprDemo1 {
	
	public static void main(String[] args) {
		
		boolean val1 = true;
		
		boolean val2 = true;
		
		boolean isAndVal = val1 && val2;
		
		System.out.println(isAndVal);
		
		int a= 10;
		
		int b= 10;
		
		boolean isAndVal2 = a == b  && b ==a ;
		
		System.out.println(isAndVal2);
		
		boolean isAndVal3 = a > b || b> a;
		
		System.out.println("logical OR :"+isAndVal3);
		
		boolean isAndVal4 =!(a>b);
		
		System.out.println(isAndVal4);
		
	}

}
