package com.demo.method;

//pascal case
public class MethodDemo2 {
	
	
	//main method is 
	//1.void method
	//2.static method
	//3.name  of method main
	
	public static void main(String[] args) {
		
		printNumbers(10,30);//method call
		
		System.out.println("");
		
		printNumbers(40,80);//calling the method second time
		
		
		
	}
	
	private static void printNumbers(int startIndex,int endIndex) {//method definition
		
		for(int i =startIndex; i<=endIndex;i++) {
			System.out.print(i+ " ");
		}
	}
	
	

}
