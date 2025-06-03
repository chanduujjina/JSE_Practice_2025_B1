package com.demo.arrayhandler;

public class ArrayDemo1 {
	
	public static void main(String[] args) {
		
		//static form of an array
		
		int numberArray [] = {1,2,3,4,5,6,8};
		
		//how to fetch elements from an array
		
		//get the value from index n
		
		int val1 = numberArray[0];//1
		
		System.out.println("val1:"+val1);
		
	 	//get the value of index that is >=length
				int lastVal = numberArray[numberArray.length-1];//8
				System.out.println("lastVal:"+lastVal);
		
		//get the value of index that is >=length
		int moreThanSizeVal = numberArray[numberArray.length];//ArrayIndexOutOfBoundException
		System.out.println("moreThanSizeVal:"+moreThanSizeVal);
		
	}

}
