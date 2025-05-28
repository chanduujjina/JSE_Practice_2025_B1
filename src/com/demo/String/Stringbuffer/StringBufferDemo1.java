package com.demo.String.Stringbuffer;

public class StringBufferDemo1 {
	
    public static void main(String[] args) {
		
    	StringBuffer sb = new StringBuffer();
    	
    	int capacity = sb .capacity();
    	
    	System.out.println("initial capacity before adding test:"+capacity);
    	
         sb .append("test1");
    	
    	System.out.println("intial capacity after adding test11:"+sb .capacity());
    	
    	sb.append("test2");
    	
    	System.out.println("intial capacity after adding test2:"+sb .capacity());
    	
    	sb.append("test3");
    	
    	System.out.println("intial capacity after adding test3:"+sb .capacity());
    	
    	sb.append("test4");
    	
    	System.out.println("intial capacity after adding test4:"+sb .capacity());
    	
    	sb.append("test5");
    	
    	System.out.println("intial capacity after adding test5:"+sb .capacity());
    	
    	
    	
    	
    	
    	
    	
	}

}
