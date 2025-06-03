package com.demo.arrayhandler;

public class TwoDimensionaArrayDynamicFrom {

	public static void main(String[] args) {
		
		//request number 1
		
		int[][] numberArray = addElements(2,3);
		
		printArray(numberArray);
		
		System.out.println("request 2 :: ");
		
       int[][] numberArray1 = addElements(4,8);
		
		printArray(numberArray1);
		
	}

	/**
	 * @param numberArray
	 */
	private static void printArray(int[][] numberArray) {
		for (int i = 0;i<numberArray.length;i++) {
			for (int j =0;j<numberArray[i].length;j++) {
				System.out.print(numberArray[i][j]+ " ");
			}
			System.out.println();
		}
	}

	/**
	 * @param row
	 * @param column
	 * @return
	 */
	private static int[][] addElements(int row,int column) {
		int numberArray [][] = new int [row][column];
		
		int count = 0;
		for (int i =0;i<numberArray.length;i++) {
			
			for (int j =0;j<numberArray[i].length;j++) {
				numberArray[i][j] = ++count;
			}
		}
		return numberArray;
	}

}
