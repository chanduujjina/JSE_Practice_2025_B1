package com.demo.string.stringbiffer;

public class StringBufferHandlerDemo2 {
	
	public static void main(String[] args) {
		
		StringBuffer buffer = new StringBuffer("Helloworld");
		
		buffer.delete(5, 10);
		
		System.out.println(buffer);
		
		buffer.setCharAt(4, 'a');
		
		System.out.println(buffer);
		
		StringBuffer sb1 = new StringBuffer("Chandu");
		String reverse = sb1.reverse().toString();
		
		System.out.println(reverse);
		
	   
	}

}
