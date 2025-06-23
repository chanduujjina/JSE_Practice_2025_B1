package com.demo.constructor.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo7 {
	public static void main(String[] args) throws Exception  {
		Child6 child= new Child6();
		
	}

}
class Parent6{
	public Parent6() throws FileNotFoundException{
		
		System.out.println("parent");
	}
	
}
class Child6 extends Parent6{
	public Child6() throws IOException{
		System.out.println("child");
	}
}