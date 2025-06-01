package com.demo.arrayhandler;

public class BinarySerachAscendingOrderDemo2 {
	
	public static void main(String[] args) {
		
		int numberArray[] = {3,5,1,2,9};
		
		//sort the elemnts in asecending order
		
		for (int i =0;i<numberArray.length;i++) {//0
			for (int j = i+1;j<numberArray.length;j++) {//1,2,3,4
				
				if (numberArray[j] > numberArray[i]) {
					int temp = numberArray[i];
					numberArray[i] = numberArray[j];
					numberArray[j] = temp;
				}
			}
		}
		
		
		for (int num : numberArray) {
			System.out.println(num);
		}
	}

}
