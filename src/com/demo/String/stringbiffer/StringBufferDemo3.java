package com.demo.string.stringbiffer;

public class StringBufferDemo3 {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		
		String word = "This is chandu i am java developer working tcs from last 2 years";
		
		sb.ensureCapacity(word.length());
		
		System.out.println(sb.capacity());
		
		sb.append(word);
		
		System.out.println("capcity after adding data:"+sb.capacity());
		
		
	}

}
