package com.demo.arrayhandler;

public class TwoDimensionaArrayHardcoded {

	public static void main(String[] args) {
		
		int numberArray [][] = new int [2][3];
		
		//row 1
		numberArray[0][0] =1;
		numberArray[0][1] =2;
		numberArray[0][2] =3;
		
		//row 1
		numberArray[1][0] =4;
		numberArray[1][1] =5;
		numberArray[1][2] =6;
		
		for (int i = 0;i<numberArray.length;i++) {
			for (int j =0;j<numberArray[i].length;j++) {
				System.out.print(numberArray[i][j]+ " ");
			}
			System.out.println();
		}
		
	}

}
