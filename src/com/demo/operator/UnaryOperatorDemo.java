package com.demo.operator;

public class UnaryOperatorDemo {
	
	public static void main(String[] args) {
		
		int a = 10;//11,12
		
		System.out.println("print a before preincrement :"+ a);//10
		
		//increment first then assign value
		int preIncrementReult = ++a;//11
		
		System.out.println("print a after preincrement :"+a);//11
		
		System.out.println("print preIncrementReult :"+preIncrementReult);//11
		
		//assign first then increment the  value
		int postinrementResult = a++;//post increment 11
		
		System.out.println("print a after post Increment :"+a);//12
		
		System.out.println("print postinrementResult :"+postinrementResult);//11
		
	}

}
