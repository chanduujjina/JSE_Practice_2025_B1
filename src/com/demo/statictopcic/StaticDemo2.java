package com.demo.statictopcic;

public class StaticDemo2 {
	
	
	private static String name;
	
	private static int id;
	
	//private Long salary;
	
	static {
		System.out.println("inside static block 1");
		name = "chandu";
		//salary = 10000L;
		
		/*public void static m1() {
			
		}*/
		
	}
	
	static {
		System.out.println("inside static block 2");
		id =1;
		printState();
	}
	
	public static void printState() {
		System.out.println("inside printState");
		System.out.println("name::"+name +" id: "+id);
	}

}
