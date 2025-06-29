package com.demo.collection.list.vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo1 {
	
	public static void main(String[] args) {
		
		Vector<Integer> numberList = new Vector<>();
		
		for (int i =1;i<=10;i++) {
			numberList.add(i);
		}
		
		Enumeration<Integer> enumeration = numberList.elements();
		
	    while(enumeration.hasMoreElements()) {
	    	System.out.println(enumeration.nextElement());
	    }
	    Object [] numberArray = new Object[numberList.size()];
	    numberList.copyInto(numberArray);
	    
	    for (Object obj : numberArray) {
	    	System.out.print(obj+" ");
	    }
		
	}

}
