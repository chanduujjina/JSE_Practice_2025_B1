package com.demo.arrayhandler;

public class RepeatedCharDemo1 {
	
	public static void main(String[] args) {
		
		String name = "chandrasekhar";
		
		int numberArray[] = new int[256];
		
		for (int i = 0;i<name.length();i++) {
			numberArray[name.charAt(i)]++;
		}
		
		for (int i =0;i<numberArray.length;i++) {
			
			if (numberArray[i] > 1) {
				System.out.println("value of "+(char)i+ " "+numberArray[i]);
			}
		}
	}

}
