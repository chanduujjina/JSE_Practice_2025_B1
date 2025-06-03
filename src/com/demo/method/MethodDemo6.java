package com.demo.method;

public class MethodDemo6 {
	
	public static void main(String[] args) {
		
		int numberArray [] = {3,6,7,9,11,13,17};
		
		//return the first
		fetchValfromArray(numberArray);
		
		int sum = calculateSum(numberArray);
		System.out.println(sum);
		
	
	}

	private static  int calculateSum(int[] numberArray) {
		
		int sum = 0;
		
		for (int num : numberArray) {
			sum += num;//sum = sum+num
		}
		
		return sum;
		
		//System.out.println("inside calculateSum");Unreachable code
	}

	private static void fetchValfromArray(int[] numberArray) {
		int count =0;
		for (int i = 0;i<numberArray.length;i++) {
			int val = numberArray [i];
			System.out.println("val");
			break;
			//System.out.println("inside");//UnReachable
		}
		
		System.out.println("inside fetchValfromArray:");
	}
	private static void fetchValfromArray_v1(int[] numberArray) {
		int count =0;
		for (int i = 0;i<numberArray.length;i++) {
			int val = numberArray [i];
			System.out.println("val");
			return ;
			//System.out.println("inside");//UnReachable
		}
	}

}
