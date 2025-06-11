package com.demo.oops.objectinfo.client;

public class CustomIntArray {
	
	private int numberArray [];
	
	int count =0;
	
	public CustomIntArray() {
		numberArray = new int[1];
	}
	
	
	public void add(int value) {
		
		//search for index 0 to accomadate element
		if (numberArray [0] == 0) {
			numberArray[0] =value;
		}
		else {
			
			//create a new array by increment 1 with old array size
			int newArray [] = new int[numberArray.length+1];
			
			//copy the elements from old to new Array
			
			System.arraycopy(numberArray, 0, newArray, 0, numberArray.length);
			newArray[count] = value;
			
			numberArray = newArray;
			
		}
		count++;
	}
	
	public int [] getArrayData() {
		return this.numberArray;
	}
	
	public int findIndexOf(int index) {
		return numberArray[index];
	}

}
