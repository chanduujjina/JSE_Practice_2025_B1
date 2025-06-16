package com.demo.exception.handler;

public class RuntimeExecptionHandlerDemo5 {
	
	public static void main(String[] args) {
		
		
		System.out.println("request 1---------------------------");
		//request 1
		handleData(10, 5, 2,"123");//Happy Path
		
		System.out.println("request 2 ---------------------------");
		//request 2
		handleData(10,0,2,"123");//Negative Flow 1
		
		System.out.println("request 3 ---------------------------");
		handleData(10,5,5,"123");//Negative Flow 2
		
		System.out.println("request 4 ---------------------------");
		handleData(10,5,2,"test");//Negative Flow 3
		
	}
	
	public static void handleData(int num1,int num2,int index,String value) {
		
		int numberArray [] = {1,2,4};
		
		int result = 0;
		int indexValue = 0;
		
		int parseOutPut = 0;
		
		try {
			result = num1/num2;//ArithematicException
			indexValue = numberArray[index];//ArrayIndexOutOfBoundException
			parseOutPut =Integer.parseInt(value);//NumberFormatException
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		System.out.println("result of a/b: "+result);
		
		System.out.println("result of index: "+indexValue);
		
		System.out.println("parseOutPut: "+parseOutPut);
	}

}
