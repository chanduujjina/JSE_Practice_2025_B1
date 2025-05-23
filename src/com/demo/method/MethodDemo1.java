package com.demo.method;

//pascal case
public class MethodDemo1 {
	
	
	//main method is 
	//1.void method
	//2.static method
	//3.name  of method main
	
	public static void main(String[] args) {
		
		int a = 20;
		
		int b= 10;
		
		int c = 40;
		
		int addResult = add(a,b,c);//method call
		System.out.println("addition result :"+addResult);
		
	    int sub = sub(a, b);
	    
	    System.out.println("diffrence of a,b "+sub);
	    
	    int multiplyVal = multiplyVal(a, b);
	    
	    System.out.println("mutiplyval ::"+multiplyVal);
	    
	    int divValues = divValues(a, b);
	    
	    System.out.println("division of two values::"+divValues);
		
		
	}

	private static int divValues(int a, int b) {
		return a/b;
	}

	private static int multiplyVal(int a, int b) {
		return a  * b;
	}
	
	private static int add(int a,int b,int c) {//method definition
		int result = a+b+c;
		return result;
	}
	
	private static int sub(int a,int b) {//method definition
		return a-b;
	}

}
