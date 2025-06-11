package com.demo.oops.objectinfo.client;

public class ArrayConstraintSoultionDemo1 {
	
	public static void main(String[] args) {
		
		
		CustomIntArray customIntArray = new CustomIntArray();
		
		for (int i = 1;i<=100;i++) {
			customIntArray.add(i);
		}
		
		
		//print the elements
		
		
		
		for (int num :customIntArray.getArrayData()) {
			System.out.println(num);
		}
		
		System.out.println("-------------------------------------------");
		
		//give the index get the value
		
		int indexOflastElement = customIntArray.findIndexOf(customIntArray.getArrayData().length-1);
		
		System.out.println(indexOflastElement);
		
		
	}

}
