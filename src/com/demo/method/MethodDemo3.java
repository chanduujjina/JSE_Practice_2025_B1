package com.demo.method;

//pascal case
public class MethodDemo3 {
	
	
	//main method is 
	//1.void method
	//2.static method
	//3.name  of method main
	
	public static void main(String[] args) {
		
		int numberArray [] = {1,2,3,4,5,6,7,8};//n*((n+1)/2)
		
		//addition of all element in an array
		
		//mean or average of all elements in an array
		
		float sum = getSumValue(numberArray);
		
		System.out.println("sum of number:"+sum);
		
		//mean or average of all elements in an array -> sum/total elements
		
		float meanValue = getMeanVal(numberArray,sum);
		
		System.out.println(meanValue);
		
	}

	/**
	 * @param numberaArray
	 * @return
	 * Purpose of this method to calculate the mean value
	 */
	private static float getMeanVal(int[] numberaArray,float sum) {
		return sum/numberaArray.length;
		
	}

	/**
	 * @param numberArray
	 * @return
	 * Purpose of this method is to calculate sum of numbers
	 */
	private static float getSumValue(int[] numberArray) {
		float sum = 0;//1,3,6,10
		
		for (int num : numberArray) {//1,2,3,4
			sum = sum +num;
		}
		return sum;
	}
	
	
	

}
