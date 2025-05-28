package com.demo.String.Stringbuffer;

public class StringBufferHandlerDemo1 {
	
	public static void main(String[] args) {
		
		
	StringBuffer buffer = new StringBuffer ("Charan");
	
    buffer .append("cherry");
    
    buffer .append(1);
    
    System.out.println(buffer);
    
    System.out.println("----------other operations--------");
    
    StringBuffer buffer1 = new StringBuffer ("Charan");
    
    buffer1.insert(6, " cherry");
    
    System.out.println("insert opr :"+buffer1);
    
    
    char array[] = {'j','a','v','a'};
    
    buffer1.insert(13, array);
    
    System.out.println(buffer1);

	}

}
