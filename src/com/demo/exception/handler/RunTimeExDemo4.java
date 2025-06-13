package com.demo.exception.handler;

public class RunTimeExDemo4 {
	
	public static void main(String[] args) {
		
		validateData("test");//db
		
		validateData(null);//web
		
	}
	
	
	public static void validateData(String name) {
		
		if (null != name && name.equals("test")) {
			System.out.println("name:"+name);
		}
	}

}
