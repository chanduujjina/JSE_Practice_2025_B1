package com.demo.String.Stringbuffer;

public class StringBufferHandlerDeleteDemo {
	
	public static void main(String[] args) {
		
	StringBuffer buffer = new StringBuffer("CharanCherry");
	
	buffer.delete(6, 12);
	
	System.out.println(buffer);
	
	buffer.setCharAt(5, 'a');
	
	System.out.println(buffer);
		
	StringBuffer sb1 = new StringBuffer("Cherry");
	String reverse = sb1.reverse().toString();
	
	System.out.println(reverse);
	
	
	

	}

}
