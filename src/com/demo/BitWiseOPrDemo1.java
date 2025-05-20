package com.demo;

public class BitWiseOPrDemo1 {
	
	public static void main(String[] args) {
		
		int a= 10;
		int b = 9;
		
		int bitWiseANDResult = a&b;
		
		System.out.println("Bitwise AND :"+bitWiseANDResult);
		
		int bitWiseORResult = a|b;
		
		System.out.println("BitWise OR :"+bitWiseORResult);
		
		int bitWiseXOR = a ^ b;
		
		System.out.println("BitWise XOR :"+bitWiseXOR);
		
		int bitXor = ~a;
		
		System.out.println(bitXor);
	}

}
