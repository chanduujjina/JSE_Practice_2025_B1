package com.demo.staticinfo.and.nonstatic;

public class Demo1 {
	
	

	private int id;//heap
	
	//class level
	private static String name;//test,test1 -> metaspace
	
	public static void main(String[] args) {
		Demo1 demo1 = new Demo1();
		
		demo1.id =1;
		
		demo1.name= "test";
		
		System.out.println("id :"+demo1.id+" name: "+demo1.name);
		
     Demo1 demo2 = new Demo1();
		
		demo2.id =2;
		demo2.name = "test1";
		
		System.out.println("id :"+demo2.id+" name: "+demo2.name);
	}

}
