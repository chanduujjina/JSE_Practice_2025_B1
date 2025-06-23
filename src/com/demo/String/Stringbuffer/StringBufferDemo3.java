package com.demo.String.Stringbuffer;

public class StringBufferDemo3 {
	
    public static void main(String[] args) {
		
    	StringBuffer sb = new StringBuffer();
    	
    	String word = "This is sudhakar learning java as a fresher from last 20 days ";
    	
    	sb.ensureCapacity(word.length());
    	
    	System.out.println(sb .capacity());
    	
    	sb.append(word);
    	
    	System.out.println("capacity after adding data:"+sb .capacity());
    	
    	
    	
    	
    	
    	
	}

}
