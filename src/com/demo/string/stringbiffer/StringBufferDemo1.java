package com.demo.string.stringbiffer;

public class StringBufferDemo1 {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();//it will store in heap
		
		//intial capacity
		int capacity = sb.capacity();
		
		System.out.println("intial capacity before aading data:"+capacity);
		
		sb.append("test1");
		
		System.out.println(" capacity after adding test1:"+sb.capacity());
		
		sb.append("test2");
		System.out.println(" capacity after adding test2:"+sb.capacity());
		
		sb.append("test3");
		System.out.println(" capacity after adding test3:"+sb.capacity());
		
		//resiszing
		
		sb.append("test4");
		System.out.println(" capacity after adding test4:"+sb.capacity());//34
		
		sb.append("test5");
		System.out.println(" capacity after adding test5:"+sb.capacity());
		
		
	}

}
