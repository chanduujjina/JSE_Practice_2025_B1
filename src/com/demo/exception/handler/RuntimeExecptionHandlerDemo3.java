package com.demo.exception.handler;

public class RuntimeExecptionHandlerDemo3 {
	
	public static void main(String[] args) {
		
		int result = 0;
		int numberArray [] = {1,2,4};
		int indexValue = 0;
		String value = "123";
		int valueInstr = 0;
		try {
			
			indexValue =numberArray[1];//AIOEX
			
			result = 10/5;//program terminates abruptly//ARI
			
			valueInstr = Integer.parseInt(value);//NumberFormatException
		}
		catch (ArithmeticException ex) {
			ex.printStackTrace();
		}
		
		catch(ArrayIndexOutOfBoundsException aeox) {
			aeox.printStackTrace();
		}
		
		catch(NumberFormatException ex) {
			ex.printStackTrace();
		}
		
		
     System.out.println("result of a/b: "+result);
		
		System.out.println("result of index: "+indexValue);
		
		System.out.println("int value::"+valueInstr);
	}

}
