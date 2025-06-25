package com.demo.string.stringbiffer;

public class StringBufferHandlerDemo1 {
	
	public static void main(String[] args) {
		
		StringBuffer buffer = new StringBuffer("Hello");
		buffer.append("world");
		
		buffer.append(1);
		
		System.out.println(buffer);
		
	   System.out.println("----------------other operations-----------------");
	   
	   StringBuffer buffer1 = new StringBuffer("Hello");
	   
	   buffer1.insert(5, " world");
	   
	   System.out.println("insert opr :"+buffer1);
	   
	   char array[] = {'j','a','v','a'};
	   
	   buffer1.insert(11, array);
	   
	   System.out.println(buffer1);
	   
	   
	}

}
