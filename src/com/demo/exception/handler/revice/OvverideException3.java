package com.demo.exception.handler.revice;

import java.io.IOException;

public class OvverideException3 {
	
	public static void main(String[] args) {
		Parent2 parent2 = new Parent2();
		try {
			parent2.m1();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}

class Parent2 {
	void m1() throws IOException
	{
		System.out.println("inside m1 Parent 2");
	}
}

class Child2 extends Parent2{
   void m1() 
   {
	   System.out.println("inside m1 Child 2");
	}
}
