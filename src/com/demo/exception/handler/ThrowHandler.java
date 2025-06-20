package com.demo.exception.handler;

public class ThrowHandler {
	
	public static void main(String[] args) {
		ThrowHandler handler = new ThrowHandler();
		
		System.out.println("---------request1 -----------------");
		//request 1
		handler.validateInfo("test1");
	
		System.out.println("---------request2 -----------------");
		//request 2
		handler.validateInfo(null);
		
		System.out.println("---------request3 -----------------");
		//request 3
		handler.validateInfo("test");
	}

	public  void validateInfo(String name) {
		
		 try {
			if (name.equals("test")) {
				System.out.println("inside if name:"+name);
			}
			else if(name.equals("test1")){
				System.out.println("inside else name:"+name);
			}
			else {
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}


