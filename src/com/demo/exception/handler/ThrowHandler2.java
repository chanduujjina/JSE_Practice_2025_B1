package com.demo.exception.handler;

public class ThrowHandler2 {
	
	public static void main(String[] args) {
		ThrowHandler2 handler = new ThrowHandler2();
		
		try {
			handler.validateInfo(null);
			
			handler.validateInfo("test1");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public  void validateInfo(String name) throws Exception{
		
		     if (name == null || name.equals("")) {
		    	 throw new Exception("Name should not be empty,please provide a valid name");
		     }
		
			if (name.equals("test")) {
				System.out.println("inside if name:"+name);
			}
			else if(name.equals("test1")){
				System.out.println("inside else name:"+name);
			}
			else {
				System.out.println();
			}
		
		
	}
	
}


