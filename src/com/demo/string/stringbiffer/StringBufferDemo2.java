package com.demo.string.stringbiffer;

public class StringBufferDemo2 {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("test");
		
		
		System.out.println(sb.capacity());//20
		
		sb.trimToSize();
		
		System.out.println("capacity of trim size:"+sb.capacity());
		
		//you can handle trimsize with ensure cpacity
		
		
		
		
		
	}

}
