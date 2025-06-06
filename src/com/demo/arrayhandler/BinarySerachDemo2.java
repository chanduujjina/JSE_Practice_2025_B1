package com.demo.arrayhandler;

public class BinarySerachDemo2 {
	
	public static void main(String[] args) {
		
		int numberArray[] = {3,5,1,2,9};//(1,5,3,2,9),(1,3,5,2,9),(1,2,5,3,9)
		
		
		//sort the elemnts in asecending order
		System.out.println("original array");
		printArray(numberArray);
		System.out.println();
		for (int i =0;i<numberArray.length;i++) {//0
			for (int j = i+1;j<numberArray.length;j++) {//1,2,3,4
				
				if (numberArray[j] > numberArray[i]) {
					int temp = numberArray[i];
					numberArray[i] = numberArray[j];
					numberArray[j] = temp;
				}
			}
			System.out.println("fight for "+i+" place");
			printArray(numberArray);
			System.out.println();
		}
		
		System.out.println("print final Array");
		printArray(numberArray);
	}

	private static void printArray(int[] numberArray) {
		for (int num : numberArray) {
			System.out.print(num+" ");
		}
	}

}
