package com.demo.oops;

public class InstanceDemo1 {
	
	private int id;
	
	private String name;
	
	
	
	{
		
		System.out.println("inside instance block1");
		id =1;
		
		/*
		 * public void m1() {
		 * 
		 * }
		 */
	}
	
	{
		
		System.out.println("inside instance block2");
		name = "chandu";
		print();
	}
	
	//No Arg constrctor
	public InstanceDemo1() {
		System.out.println("Inside InstanceDemo1 constrctor");
	}
	
	public void print() {
		System.out.println("Inside print method");
		System.out.println("name::"+name +" id: "+id);
	}
	
	 

}
