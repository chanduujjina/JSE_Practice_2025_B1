package com.demo.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {
	
	public static void main(String[] args) {
		
		List list = new ArrayList();//abstraction
		
		//add elemnts to list
		
	    list.add("test");
	    
	    list.add(1);
	    
	    list.add(false);
	    
	    list.add(new Sample(1,"blood"));
	    
	    //fetch the elemnts from the Coolection
	    
	    //enhanced for Loop inetrnally using Iterator
	    for (Object obj:list) {
	    	System.out.println(obj);
	    }
		
		
	}

}
