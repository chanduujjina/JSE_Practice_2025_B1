package com.demo.oops.client;

import com.demo.oops.Base1;
import com.demo.oops.Dervied1;
import com.demo.oops.Dervied2;

public class HierachicalDemo1 {
	
	public static void main(String[] args) {
		
		Base1 base = new Base1("type") ;
		
		Base1 base1 = new Dervied1("parent", "child1");
		
		base1.m1();
		
		Dervied1 dervied1 = new Dervied1("parent", "child1");//create
		System.out.println(" after object create parent type "+dervied1.getType()+ " childtype:"+dervied1.getChildType());//fetching state
		
		dervied1.setType("paernt1");//update
		dervied1.setChildType("child2");
		
		System.out.println("parent type "+dervied1.getType()+ " childtype:"+dervied1.getChildType());//fetching state
		
		Dervied2 dervied2 = new Dervied2("parent", "child3");//create
		System.out.println(" after object create parent type "+dervied2.getType()+ " childtype:"+dervied2.getChildType());//fetching state
		
		dervied2.setType("paernt2");//update
		dervied2.setChildType("child4");
		
		System.out.println("parent type "+dervied2.getType()+ " childtype:"+dervied2.getChildType());//fetching state
		
	}

}
