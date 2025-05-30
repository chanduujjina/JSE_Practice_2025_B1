package com.demo.arrayhandler;

public class DynamicArrayCreationDemo1 {
	
	public static void main(String[] args) {
		
		String nameArray [] = new String[3];
		
		// add the elemnts to the array
		
		nameArray[0] = "Rajasekhar";
		nameArray[1] = "Sudhakar";
		nameArray[2] = "Sabitha";
		
		System.out.println(nameArray);
		//nameArray[3] = "Pavan";//ArrayIndexOut exception
		//fetch the elemnts from array
		for (String val :nameArray) {
			System.out.println(val);
		}
	}

}
